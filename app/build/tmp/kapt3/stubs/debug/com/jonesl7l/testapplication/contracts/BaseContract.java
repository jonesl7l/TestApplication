package com.jonesl7l.testapplication.contracts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/jonesl7l/testapplication/contracts/BaseContract;", "", "Presenter", "View", "app_debug"})
public abstract interface BaseContract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/jonesl7l/testapplication/contracts/BaseContract$View;", "", "app_debug"})
    public static abstract interface View {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H&J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/jonesl7l/testapplication/contracts/BaseContract$Presenter;", "T", "Lcom/jonesl7l/testapplication/contracts/BaseContract$View;", "", "onCreate", "", "view", "(Lcom/jonesl7l/testapplication/contracts/BaseContract$View;)V", "onDestroy", "setData", "data", "", "Lcom/jonesl7l/testapplication/viewmodels/GenericItem;", "app_debug"})
    public static abstract interface Presenter<T extends com.jonesl7l.testapplication.contracts.BaseContract.View> {
        
        public abstract void onCreate(@org.jetbrains.annotations.NotNull()
        T view);
        
        public abstract void onDestroy();
        
        public abstract void setData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.jonesl7l.testapplication.viewmodels.GenericItem> data);
    }
}