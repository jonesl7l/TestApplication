package com.jonesl7l.testapplication.room;

import java.lang.System;

/**
 * This class will hold the database. It defines the database configuration and serves as the app's main access point to the persistent data.
 */
@androidx.room.Database(entities = {com.jonesl7l.testapplication.room.NicRow.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/jonesl7l/testapplication/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "nicDao", "Lcom/jonesl7l/testapplication/room/NicDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    public static final com.jonesl7l.testapplication.room.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jonesl7l.testapplication.room.NicDao nicDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jonesl7l/testapplication/room/AppDatabase$Companion;", "", "()V", "instance", "Lcom/jonesl7l/testapplication/room/AppDatabase;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.jonesl7l.testapplication.room.AppDatabase instance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}