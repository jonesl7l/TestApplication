package com.jonesl7l.testapplication.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\f\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u001b\u0010\u0007\u001a\u00028\u00018@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/jonesl7l/testapplication/activities/BaseActivity;", "V", "Lcom/jonesl7l/testapplication/contracts/BaseContract$View;", "P", "Lcom/jonesl7l/testapplication/contracts/BaseContract$Presenter;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "presenter", "getPresenter$app_debug", "()Lcom/jonesl7l/testapplication/contracts/BaseContract$Presenter;", "presenter$delegate", "Lkotlin/Lazy;", "createPresenter", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity<V extends com.jonesl7l.testapplication.contracts.BaseContract.View, P extends com.jonesl7l.testapplication.contracts.BaseContract.Presenter<? super V>> extends androidx.appcompat.app.AppCompatActivity implements com.jonesl7l.testapplication.contracts.BaseContract.View {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy presenter$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final P getPresenter$app_debug() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract P createPresenter();
    
    public BaseActivity() {
        super();
    }
}