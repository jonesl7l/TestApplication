package com.jonesl7l.testapplication.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/jonesl7l/testapplication/activities/MVVMMainActivity;", "Lcom/jonesl7l/testapplication/activities/MVVMBaseActivity;", "Lcom/jonesl7l/testapplication/adapter/AdapterItemInterface;", "()V", "binding", "Lcom/jonesl7l/testapplication/databinding/ActivityMainBinding;", "dataAdapter", "Lcom/jonesl7l/testapplication/adapter/GenericAdapter;", "fragmentList", "", "", "Landroidx/fragment/app/Fragment;", "getFragmentList", "()Ljava/util/Map;", "fragmentList$delegate", "Lkotlin/Lazy;", "observeViewModel", "", "viewModel", "Lcom/jonesl7l/testapplication/livedata/BaseDataViewModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "tag", "value", "", "setFragmentList", "showFragment", "fragment", "Companion", "app_debug"})
public final class MVVMMainActivity extends com.jonesl7l.testapplication.activities.MVVMBaseActivity implements com.jonesl7l.testapplication.adapter.AdapterItemInterface {
    private com.jonesl7l.testapplication.databinding.ActivityMainBinding binding;
    private com.jonesl7l.testapplication.adapter.GenericAdapter dataAdapter;
    private final kotlin.Lazy fragmentList$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIVE_DATA_TAG = "live data";
    public static final com.jonesl7l.testapplication.activities.MVVMMainActivity.Companion Companion = null;
    
    private final java.util.Map<java.lang.String, androidx.fragment.app.Fragment> getFragmentList() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    private final void observeViewModel(com.jonesl7l.testapplication.livedata.BaseDataViewModel viewModel) {
    }
    
    private final void showFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    private final java.util.Map<java.lang.String, androidx.fragment.app.Fragment> setFragmentList() {
        return null;
    }
    
    public MVVMMainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jonesl7l/testapplication/activities/MVVMMainActivity$Companion;", "", "()V", "LIVE_DATA_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}