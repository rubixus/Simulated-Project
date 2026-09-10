package foundry.veil.impl;

// AUTO-GENERATED STUB for foundry.veil.impl.TickTaskSchedulerImpl
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class TickTaskSchedulerImpl implements foundry.veil.api.TickTaskScheduler {
    public TickTaskSchedulerImpl() {}
    public void run() {}
    public void shutdown() {}
    public void execute(java.lang.Runnable p0) {}
    public foundry.veil.api.TickTaskScheduler.TickTask<?> schedule(java.lang.Runnable p0, long p1) { return null; }
    public <V> foundry.veil.api.TickTaskScheduler.TickTask<V> schedule(java.util.concurrent.Callable<V> p0, long p1) { return null; }
    public foundry.veil.api.TickTaskScheduler.TickTask<?> scheduleAtFixedRate(java.lang.Runnable p0, long p1, long p2) { return null; }
    public boolean isShutdown() { return false; }
    class Task<V> implements java.util.concurrent.ScheduledFuture<V> {
        public void finish(java.lang.Throwable p0) {}
        public long getDelay() { return 0L; }
        public long getDelay(java.util.concurrent.TimeUnit p0) { return 0L; }
        public int compareTo(java.util.concurrent.Delayed p0) { return 0; }
        public boolean cancel(boolean p0) { return false; }
        public boolean isCancelled() { return false; }
        public boolean isDone() { return false; }
        public V get() throws java.util.concurrent.ExecutionException { return null; }
        public V get(long p0, java.util.concurrent.TimeUnit p1) throws java.util.concurrent.ExecutionException { return null; }
        public int compareTo(java.lang.Object p0) { return 0; }
    }
    static class TickTaskImpl<V> implements foundry.veil.api.TickTaskScheduler.TickTask<V> {
        public long getDelay() { return 0L; }
        public java.util.concurrent.CompletableFuture<V> toCompletableFuture() { return null; }
        public long getDelay(java.util.concurrent.TimeUnit p0) { return 0L; }
        public int compareTo(java.util.concurrent.Delayed p0) { return 0; }
        public boolean cancel(boolean p0) { return false; }
        public boolean isCancelled() { return false; }
        public boolean isDone() { return false; }
        public V get() throws java.util.concurrent.ExecutionException { return null; }
        public V get(long p0, java.util.concurrent.TimeUnit p1) throws java.util.concurrent.ExecutionException { return null; }
        public void setTask(foundry.veil.impl.TickTaskSchedulerImpl.Task<?> p0) {}
        public int compareTo(java.lang.Object p0) { return 0; }
    }
}
