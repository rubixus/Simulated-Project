package foundry.veil.api;

// AUTO-GENERATED STUB for foundry.veil.api.TickTaskScheduler
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface TickTaskScheduler {
    public static foundry.veil.api.TickTaskScheduler get(java.lang.Object p0) { return null; }
    public abstract void execute(java.lang.Runnable p0);
    public abstract foundry.veil.api.TickTaskScheduler.TickTask<?> schedule(java.lang.Runnable p0, long p1);
    public abstract <V> foundry.veil.api.TickTaskScheduler.TickTask<V> schedule(java.util.concurrent.Callable<V> p0, long p1);
    public abstract foundry.veil.api.TickTaskScheduler.TickTask<?> scheduleAtFixedRate(java.lang.Runnable p0, long p1, long p2);
    public abstract boolean isShutdown();
    public interface TickTask<V> {
        public abstract long getDelay();
        public abstract java.util.concurrent.CompletableFuture<V> toCompletableFuture();
    }
}
