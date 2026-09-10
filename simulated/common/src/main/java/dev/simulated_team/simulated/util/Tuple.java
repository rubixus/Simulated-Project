package dev.simulated_team.simulated.util;

import java.util.Objects;

/**
 * Mutable pair, drop-in stand-in for {@code net.minecraft.util.Tuple},
 * which was removed in 26.x. Same shape ({@code getA}/{@code setA},
 * {@code getB}/{@code setB}) so call sites are unchanged.
 */
public class Tuple<A, B> {

    private A a;
    private B b;

    public Tuple(final A a, final B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return this.a;
    }

    public void setA(final A a) {
        this.a = a;
    }

    public B getB() {
        return this.b;
    }

    public void setB(final B b) {
        this.b = b;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (!(o instanceof final Tuple<?, ?> other))
            return false;
        return Objects.equals(this.a, other.a) && Objects.equals(this.b, other.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override
    public String toString() {
        return "Tuple{" + this.a + ", " + this.b + '}';
    }
}
