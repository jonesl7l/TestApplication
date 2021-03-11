package com.jonesl7l.testapplication.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/jonesl7l/testapplication/activities/MVPMainActivity;", "Lcom/jonesl7l/testapplication/activities/MVPBaseActivity;", "Lcom/jonesl7l/testapplication/activities/mvp/contracts/MainContract$View;", "Lcom/jonesl7l/testapplication/activities/mvp/presenters/MainPresenter;", "()V", "binding", "Lcom/jonesl7l/testapplication/databinding/ActivityMainBinding;", "createPresenter", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showFragment", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
public final class MVPMainActivity extends com.jonesl7l.testapplication.activities.MVPBaseActivity<com.jonesl7l.testapplication.activities.mvp.contracts.MainContract.View, com.jonesl7l.testapplication.activities.mvp.presenters.MainPresenter> implements com.jonesl7l.testapplication.activities.mvp.contracts.MainContract.View {
    private com.jonesl7l.testapplication.databinding.ActivityMainBinding binding;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jonesl7l.testapplication.activities.mvp.presenters.MainPresenter createPresenter() {
        return null;
    }
    
    public MVPMainActivity() {
        super();
    }
}