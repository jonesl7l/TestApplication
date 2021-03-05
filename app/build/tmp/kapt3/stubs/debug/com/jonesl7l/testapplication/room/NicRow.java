package com.jonesl7l.testapplication.room;

import java.lang.System;

/**
 * An instance of Nic represents a row in the Nic table in the app's database
 */
@androidx.room.Entity(tableName = "Nic")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/jonesl7l/testapplication/room/NicRow;", "", "name", "", "powerLevel", "", "image", "(Ljava/lang/String;ILjava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getName", "getPowerLevel", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_debug"})
public final class NicRow {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    @androidx.room.PrimaryKey()
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "powerLevel")
    private final int powerLevel = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "image")
    private final java.lang.String image = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NIC_TABLE_NAME = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NIC_TABLE_POWER_LEVEL = "powerLevel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NIC_TABLE_IMAGE = "image";
    public static final com.jonesl7l.testapplication.room.NicRow.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getPowerLevel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    public NicRow(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int powerLevel, @org.jetbrains.annotations.NotNull()
    java.lang.String image) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * An instance of Nic represents a row in the Nic table in the app's database
     */
    @org.jetbrains.annotations.NotNull()
    public final com.jonesl7l.testapplication.room.NicRow copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int powerLevel, @org.jetbrains.annotations.NotNull()
    java.lang.String image) {
        return null;
    }
    
    /**
     * An instance of Nic represents a row in the Nic table in the app's database
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * An instance of Nic represents a row in the Nic table in the app's database
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * An instance of Nic represents a row in the Nic table in the app's database
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/jonesl7l/testapplication/room/NicRow$Companion;", "", "()V", "NIC_TABLE_IMAGE", "", "NIC_TABLE_NAME", "NIC_TABLE_POWER_LEVEL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}