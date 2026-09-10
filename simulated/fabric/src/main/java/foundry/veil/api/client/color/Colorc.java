package foundry.veil.api.client.color;

// AUTO-GENERATED STUB for foundry.veil.api.client.color.Colorc
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface Colorc {
    public abstract float red();
    public abstract float green();
    public abstract float blue();
    public abstract float alpha();
    public default int redInt() { return 0; }
    public default int greenInt() { return 0; }
    public default int blueInt() { return 0; }
    public default int alphaInt() { return 0; }
    public default int rgb() { return 0; }
    public default int argb() { return 0; }
    public default float minComponent() { return 0.0f; }
    public default float maxComponent() { return 0.0f; }
    public default float hue() { return 0.0f; }
    public default float saturation() { return 0.0f; }
    public default float luminance() { return 0.0f; }
    public default foundry.veil.api.client.color.Color lerp(foundry.veil.api.client.color.Colorc p0, float p1, foundry.veil.api.client.color.Color p2) { return null; }
    public default foundry.veil.api.client.color.Color mix(foundry.veil.api.client.color.Colorc p0, float p1, foundry.veil.api.client.color.Color p2) { return null; }
    public default foundry.veil.api.client.color.Color lighten(float p0, foundry.veil.api.client.color.Color p1) { return null; }
    public default foundry.veil.api.client.color.Color darken(float p0, foundry.veil.api.client.color.Color p1) { return null; }
    public default foundry.veil.api.client.color.Color invert(foundry.veil.api.client.color.Color p0) { return null; }
    public default foundry.veil.api.client.color.Color grayscale(foundry.veil.api.client.color.Color p0) { return null; }
    public default foundry.veil.api.client.color.Color sepia(foundry.veil.api.client.color.Color p0) { return null; }
    public default foundry.veil.api.client.color.Color setHue(float p0, foundry.veil.api.client.color.Color p1) { return null; }
    public default foundry.veil.api.client.color.Color setSaturation(float p0, foundry.veil.api.client.color.Color p1) { return null; }
    public default foundry.veil.api.client.color.Color setLuminance(float p0, foundry.veil.api.client.color.Color p1) { return null; }
    public default foundry.veil.api.client.color.Color setHSV(float p0, float p1, float p2, foundry.veil.api.client.color.Color p3) { return null; }
}
