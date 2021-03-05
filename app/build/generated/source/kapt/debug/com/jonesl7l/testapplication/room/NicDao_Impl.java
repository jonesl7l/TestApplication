package com.jonesl7l.testapplication.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NicDao_Impl implements NicDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NicRow> __insertionAdapterOfNicRow;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllNics;

  public NicDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNicRow = new EntityInsertionAdapter<NicRow>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Nic` (`name`,`powerLevel`,`image`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NicRow value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getPowerLevel());
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Nic WHERE name = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllNics = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Nic";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final NicRow nic, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNicRow.insert(nic);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final String name, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        if (name == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, name);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllNics(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllNics.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllNics.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getAllNics(final Continuation<? super List<NicRow>> p0) {
    final String _sql = "SELECT * FROM Nic";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<NicRow>>() {
      @Override
      public List<NicRow> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPowerLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "powerLevel");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<NicRow> _result = new ArrayList<NicRow>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NicRow _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpPowerLevel;
            _tmpPowerLevel = _cursor.getInt(_cursorIndexOfPowerLevel);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            _item = new NicRow(_tmpName,_tmpPowerLevel,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
