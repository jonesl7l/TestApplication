package com.jonesl7l.testapplication.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/jonesl7l/testapplication/helpers/CoroutinesHelper;", "", "()V", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefaultDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "getIoDispatcher", "mainDispatcher", "getMainDispatcher", "app_debug"})
public final class CoroutinesHelper {
    
    /**
     * CPU-intensive work, such as sorting large lists, doing complex calculations and similar. A shared pool of threads on the JVM backs it.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher = null;
    
    /**
     * Mandatory dispatcher for performing UI-related events in Android's main or UI thread.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineDispatcher mainDispatcher = null;
    
    /**
     * Networking or reading and writing from files. In short – any input and output, as the name states
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    public static final com.jonesl7l.testapplication.helpers.CoroutinesHelper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getDefaultDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getMainDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getIoDispatcher() {
        return null;
    }
    
    private CoroutinesHelper() {
        super();
    }
}