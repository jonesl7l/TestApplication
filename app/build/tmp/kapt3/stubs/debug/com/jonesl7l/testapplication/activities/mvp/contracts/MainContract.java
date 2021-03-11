package com.jonesl7l.testapplication.activities.mvp.contracts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/jonesl7l/testapplication/activities/mvp/contracts/MainContract;", "", "Presenter", "View", "app_debug"})
public abstract interface MainContract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/jonesl7l/testapplication/activities/mvp/contracts/MainContract$View;", "Lcom/jonesl7l/testapplication/activities/mvp/contracts/BaseContract$View;", "showFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
    public static abstract interface View extends com.jonesl7l.testapplication.activities.mvp.contracts.BaseContract.View {
        
        public abstract void showFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/jonesl7l/testapplication/activities/mvp/contracts/MainContract$Presenter;", "", "app_debug"})
    public static abstract interface Presenter {
    }
}