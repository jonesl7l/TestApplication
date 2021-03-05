package com.jonesl7l.testapplication.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002R\'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/jonesl7l/testapplication/presenters/MainPresenter;", "Lcom/jonesl7l/testapplication/presenters/BasePresenter;", "Lcom/jonesl7l/testapplication/contracts/MainContract$View;", "Lcom/jonesl7l/testapplication/contracts/MainContract$Presenter;", "Lcom/jonesl7l/testapplication/adapter/AdapterItemInterface;", "()V", "fragmentList", "", "", "Landroidx/fragment/app/Fragment;", "getFragmentList", "()Ljava/util/Map;", "fragmentList$delegate", "Lkotlin/Lazy;", "onItemClick", "", "tag", "value", "", "setData", "data", "", "Lcom/jonesl7l/testapplication/viewmodels/GenericItem;", "setFragmentList", "Companion", "app_debug"})
public final class MainPresenter extends com.jonesl7l.testapplication.presenters.BasePresenter<com.jonesl7l.testapplication.contracts.MainContract.View> implements com.jonesl7l.testapplication.contracts.MainContract.Presenter, com.jonesl7l.testapplication.adapter.AdapterItemInterface {
    private final kotlin.Lazy fragmentList$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COROUTINES_TAG = "coroutines";
    public static final com.jonesl7l.testapplication.presenters.MainPresenter.Companion Companion = null;
    
    private final java.util.Map<java.lang.String, androidx.fragment.app.Fragment> getFragmentList() {
        return null;
    }
    
    @java.lang.Override()
    public void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jonesl7l.testapplication.viewmodels.GenericItem> data) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    private final java.util.Map<java.lang.String, androidx.fragment.app.Fragment> setFragmentList() {
        return null;
    }
    
    public MainPresenter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jonesl7l/testapplication/presenters/MainPresenter$Companion;", "", "()V", "COROUTINES_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}