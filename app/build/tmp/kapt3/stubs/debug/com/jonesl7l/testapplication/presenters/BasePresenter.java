package com.jonesl7l.testapplication.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/jonesl7l/testapplication/presenters/BasePresenter;", "T", "Lcom/jonesl7l/testapplication/contracts/BaseContract$View;", "Lcom/jonesl7l/testapplication/contracts/BaseContract$Presenter;", "()V", "dataAdapter", "Lcom/jonesl7l/testapplication/adapter/GenericAdapter;", "getDataAdapter", "()Lcom/jonesl7l/testapplication/adapter/GenericAdapter;", "setDataAdapter", "(Lcom/jonesl7l/testapplication/adapter/GenericAdapter;)V", "dataList", "", "Lcom/jonesl7l/testapplication/viewmodels/GenericItem;", "getDataList", "()Ljava/util/List;", "view", "getView", "()Lcom/jonesl7l/testapplication/contracts/BaseContract$View;", "setView", "(Lcom/jonesl7l/testapplication/contracts/BaseContract$View;)V", "Lcom/jonesl7l/testapplication/contracts/BaseContract$View;", "onCreate", "", "onDestroy", "app_debug"})
public abstract class BasePresenter<T extends com.jonesl7l.testapplication.contracts.BaseContract.View> implements com.jonesl7l.testapplication.contracts.BaseContract.Presenter<T> {
    @org.jetbrains.annotations.Nullable()
    private T view;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.jonesl7l.testapplication.viewmodels.GenericItem> dataList = null;
    @org.jetbrains.annotations.Nullable()
    private com.jonesl7l.testapplication.adapter.GenericAdapter dataAdapter;
    
    @org.jetbrains.annotations.Nullable()
    public final T getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<com.jonesl7l.testapplication.viewmodels.GenericItem> getDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.jonesl7l.testapplication.adapter.GenericAdapter getDataAdapter() {
        return null;
    }
    
    public final void setDataAdapter(@org.jetbrains.annotations.Nullable()
    com.jonesl7l.testapplication.adapter.GenericAdapter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    T view) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public BasePresenter() {
        super();
    }
}