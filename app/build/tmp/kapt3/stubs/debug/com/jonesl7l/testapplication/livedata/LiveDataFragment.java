package com.jonesl7l.testapplication.livedata;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/jonesl7l/testapplication/livedata/LiveDataFragment;", "Lcom/jonesl7l/testapplication/genericnics/NicFragment;", "Lcom/jonesl7l/testapplication/adapter/AdapterItemInterface;", "()V", "viewModel", "Lcom/jonesl7l/testapplication/livedata/NicsViewModel;", "observeViewModel", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "tag", "", "value", "", "suspendedCoroutineDeleteAllNics", "suspendedCoroutineInsertRandomNic", "Companion", "app_debug"})
public final class LiveDataFragment extends com.jonesl7l.testapplication.genericnics.NicFragment implements com.jonesl7l.testapplication.adapter.AdapterItemInterface {
    private com.jonesl7l.testapplication.livedata.NicsViewModel viewModel;
    public static final com.jonesl7l.testapplication.livedata.LiveDataFragment.Companion Companion = null;
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    private final void observeViewModel(com.jonesl7l.testapplication.livedata.NicsViewModel viewModel) {
    }
    
    /**
     * GlobalScope is alive as long as you app is alive, if you doing some counting for instance in this scope and rotate your device it will continue the task/process.
     * Shouldn't be used in Activity; safe for calls in Application class
     */
    private final void suspendedCoroutineInsertRandomNic() {
    }
    
    private final void suspendedCoroutineDeleteAllNics() {
    }
    
    public LiveDataFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jonesl7l/testapplication/livedata/LiveDataFragment$Companion;", "", "()V", "instance", "Lcom/jonesl7l/testapplication/livedata/LiveDataFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.jonesl7l.testapplication.livedata.LiveDataFragment instance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}