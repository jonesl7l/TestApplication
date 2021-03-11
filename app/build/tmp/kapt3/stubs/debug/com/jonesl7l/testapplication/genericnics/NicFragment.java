package com.jonesl7l.testapplication.genericnics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0004J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u001a\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010#\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/jonesl7l/testapplication/genericnics/NicFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/jonesl7l/testapplication/adapter/AdapterItemInterface;", "()V", "fragmentBinding", "Lcom/jonesl7l/testapplication/databinding/FragmentBaseBinding;", "genericAdapter", "Lcom/jonesl7l/testapplication/adapter/GenericAdapter;", "nicAdapter", "Lcom/jonesl7l/testapplication/adapter/NicAdapter;", "nicsInstance", "Lcom/jonesl7l/testapplication/viewmodels/Nics;", "getNicsInstance", "()Lcom/jonesl7l/testapplication/viewmodels/Nics;", "setNicsInstance", "(Lcom/jonesl7l/testapplication/viewmodels/Nics;)V", "displayNics", "", "nics", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onItemClick", "tag", "", "value", "", "onViewCreated", "view", "setAdapter", "Companion", "app_debug"})
public abstract class NicFragment extends androidx.fragment.app.Fragment implements com.jonesl7l.testapplication.adapter.AdapterItemInterface {
    private com.jonesl7l.testapplication.databinding.FragmentBaseBinding fragmentBinding;
    private com.jonesl7l.testapplication.adapter.GenericAdapter genericAdapter;
    private com.jonesl7l.testapplication.adapter.NicAdapter nicAdapter;
    @org.jetbrains.annotations.NotNull()
    private com.jonesl7l.testapplication.viewmodels.Nics nicsInstance;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RETROFIT_GET_TAG = "retro get";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_INSERT_RANDOM_TAG = "room insert random";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_DELETE_NIC_TAG = "room delete nic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_DELETE_ALL_NICS_TAG = "room delete all nics";
    public static final com.jonesl7l.testapplication.genericnics.NicFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jonesl7l.testapplication.viewmodels.Nics getNicsInstance() {
        return null;
    }
    
    protected final void setNicsInstance(@org.jetbrains.annotations.NotNull()
    com.jonesl7l.testapplication.viewmodels.Nics p0) {
    }
    
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
    
    protected final void displayNics(@org.jetbrains.annotations.NotNull()
    com.jonesl7l.testapplication.viewmodels.Nics nics) {
    }
    
    public NicFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/jonesl7l/testapplication/genericnics/NicFragment$Companion;", "", "()V", "RETROFIT_GET_TAG", "", "ROOM_DELETE_ALL_NICS_TAG", "ROOM_DELETE_NIC_TAG", "ROOM_INSERT_RANDOM_TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}