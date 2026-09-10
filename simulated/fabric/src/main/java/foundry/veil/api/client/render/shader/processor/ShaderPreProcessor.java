package foundry.veil.api.client.render.shader.processor;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.processor.ShaderPreProcessor
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ShaderPreProcessor {
    public static final foundry.veil.api.client.render.shader.processor.ShaderPreProcessor NOOP = new foundry.veil.api.client.render.shader.processor.ShaderPreProcessor() { @Override public void modify(foundry.veil.api.client.render.shader.processor.ShaderPreProcessor.Context p0, io.github.ocelot.glslprocessor.api.node.GlslTree p1) throws java.io.IOException, io.github.ocelot.glslprocessor.api.GlslSyntaxException, io.github.ocelot.glslprocessor.lib.anarres.cpp.LexerException {} };
    public default void prepare() {}
    public abstract void modify(foundry.veil.api.client.render.shader.processor.ShaderPreProcessor.Context p0, io.github.ocelot.glslprocessor.api.node.GlslTree p1) throws java.io.IOException, io.github.ocelot.glslprocessor.api.GlslSyntaxException, io.github.ocelot.glslprocessor.lib.anarres.cpp.LexerException;
    public static foundry.veil.api.client.render.shader.processor.ShaderPreProcessor allOf(foundry.veil.api.client.render.shader.processor.ShaderPreProcessor... p0) { return null; }
    public static foundry.veil.api.client.render.shader.processor.ShaderPreProcessor allOf(java.util.Collection<foundry.veil.api.client.render.shader.processor.ShaderPreProcessor> p0) { return null; }
    public interface Context {
        public abstract io.github.ocelot.glslprocessor.api.node.GlslTree modifyInclude(java.lang.Object p0, java.lang.String p1) throws java.io.IOException, io.github.ocelot.glslprocessor.api.GlslSyntaxException, io.github.ocelot.glslprocessor.lib.anarres.cpp.LexerException;
        public abstract java.util.Map<java.lang.String, java.lang.Object> customProgramData();
        public abstract java.lang.Object name();
        public abstract boolean isSourceFile();
        public abstract int activeBuffers();
        public abstract int type();
        public abstract org.lwjgl.opengl.GLCapabilities glCapabilities();
        public default java.lang.String typeName() { return null; }
        public default boolean isVertex() { return false; }
        public default boolean isFragment() { return false; }
        public default boolean isGeometry() { return false; }
        public default boolean isTessellationControl() { return false; }
        public default boolean isTessellationEvaluation() { return false; }
        public default boolean hasFeatures(foundry.veil.api.client.render.shader.ShaderFeature... p0) { return false; }
        public default void include(io.github.ocelot.glslprocessor.api.node.GlslTree p0, java.lang.Object p1, foundry.veil.api.client.render.shader.processor.ShaderPreProcessor.IncludeOverloadStrategy p2) throws java.io.IOException, io.github.ocelot.glslprocessor.api.GlslSyntaxException, io.github.ocelot.glslprocessor.lib.anarres.cpp.LexerException {}
        public default void include(io.github.ocelot.glslprocessor.api.node.GlslTree p0, java.lang.String p1, io.github.ocelot.glslprocessor.api.node.GlslTree p2, foundry.veil.api.client.render.shader.processor.ShaderPreProcessor.IncludeOverloadStrategy p3) throws java.io.IOException, io.github.ocelot.glslprocessor.api.GlslSyntaxException, io.github.ocelot.glslprocessor.lib.anarres.cpp.LexerException {}
        public abstract foundry.veil.api.client.render.shader.processor.ShaderImporter shaderImporter();
        public default foundry.veil.api.client.render.shader.ShaderPreDefinitions preDefinitions() { return null; }
        public abstract java.util.Map<java.lang.String, java.lang.String> macros();
    }
    public enum IncludeOverloadStrategy {
        FAIL,
        SOURCE,
        INCLUDE;
    }
}
