package com.jonesl7l.testapplication.coroutines;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\b\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/jonesl7l/testapplication/coroutines/CoroutinesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/jonesl7l/testapplication/adapter/AdapterItemInterface;", "()V", "fragmentBinding", "Lcom/jonesl7l/testapplication/databinding/FragmentBaseBinding;", "genericAdapter", "Lcom/jonesl7l/testapplication/adapter/GenericAdapter;", "nicAdapter", "Lcom/jonesl7l/testapplication/adapter/NicAdapter;", "nicsInstance", "Lcom/jonesl7l/testapplication/viewmodels/Nics;", "displayNics", "", "nics", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onItemClick", "tag", "", "value", "", "onViewCreated", "view", "setAdapter", "suspendedCoroutineDeleteAllNics", "suspendedCoroutineInsertRandomNic", "suspendedCoroutineScopeFetchNics", "Companion", "app_debug"})
public final class CoroutinesFragment extends androidx.fragment.app.Fragment implements com.jonesl7l.testapplication.adapter.AdapterItemInterface {
    private com.jonesl7l.testapplication.databinding.FragmentBaseBinding fragmentBinding;
    private com.jonesl7l.testapplication.adapter.GenericAdapter genericAdapter;
    private com.jonesl7l.testapplication.adapter.NicAdapter nicAdapter;
    private com.jonesl7l.testapplication.viewmodels.Nics nicsInstance;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RETROFIT_GET_TAG = "retro get";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_INSERT_RANDOM_TAG = "room insert random";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_DELETE_NIC_TAG = "room delete nic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_DELETE_ALL_NICS_TAG = "room delete all nics";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AWAIT_TAG = "await";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DISPATCHER_TAG = "dispatcher";
    public static final com.jonesl7l.testapplication.coroutines.CoroutinesFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    private final void setAdapter() {
    }
    
    /**
     * CoroutineScope It is defined a simple factory function that takes CoroutineContexts as arguments to create wrapper
     * around the combined CoroutineContext and creates a Job element if the provide context does not have one already.
     */
    private final void suspendedCoroutineScopeFetchNics() {
    }
    
    /**
     * GlobalScope is alive as long as you app is alive, if you doing some counting for instance in this scope and rotate your device it will continue the task/process.
     * Shouldn't be used in Activity; safe for calls in Application class
     */
    private final void suspendedCoroutineInsertRandomNic() {
    }
    
    /**
     * LifecycleScope is an extention for LifeCycleOwner and bound to Actvity or Fragment's lifCycle where scope is canceled when that Activity or Fragment is destroyed.
     * This has specfic methods for launching on onStart, onResume
     */
    private final void suspendedCoroutineDeleteAllNics() {
    }
    
    private final void displayNics(com.jonesl7l.testapplication.viewmodels.Nics nics) {
    }
    
    public CoroutinesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/jonesl7l/testapplication/coroutines/CoroutinesFragment$Companion;", "", "()V", "AWAIT_TAG", "", "DISPATCHER_TAG", "RETROFIT_GET_TAG", "ROOM_DELETE_ALL_NICS_TAG", "ROOM_DELETE_NIC_TAG", "ROOM_INSERT_RANDOM_TAG", "instance", "Lcom/jonesl7l/testapplication/coroutines/CoroutinesFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.jonesl7l.testapplication.coroutines.CoroutinesFragment instance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}