package com.example.myapplication;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FlashcardDao_Impl implements FlashcardDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Flashcard> __insertionAdapterOfFlashcard;

  private final EntityDeletionOrUpdateAdapter<Flashcard> __deletionAdapterOfFlashcard;

  private final EntityDeletionOrUpdateAdapter<Flashcard> __updateAdapterOfFlashcard;

  public FlashcardDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFlashcard = new EntityInsertionAdapter<Flashcard>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Flashcard` (`question`,`answer`,`wrong_answer_1`,`wrong_answer_2`,`uuid`) VALUES (?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Flashcard value) {
        if (value.getQuestion() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getQuestion());
        }
        if (value.getAnswer() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAnswer());
        }
        if (value.getWrongAnswer1() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getWrongAnswer1());
        }
        if (value.getWrongAnswer2() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWrongAnswer2());
        }
        stmt.bindLong(5, value.getUuid());
      }
    };
    this.__deletionAdapterOfFlashcard = new EntityDeletionOrUpdateAdapter<Flashcard>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Flashcard` WHERE `uuid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Flashcard value) {
        stmt.bindLong(1, value.getUuid());
      }
    };
    this.__updateAdapterOfFlashcard = new EntityDeletionOrUpdateAdapter<Flashcard>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `Flashcard` SET `question` = ?,`answer` = ?,`wrong_answer_1` = ?,`wrong_answer_2` = ?,`uuid` = ? WHERE `uuid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Flashcard value) {
        if (value.getQuestion() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getQuestion());
        }
        if (value.getAnswer() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAnswer());
        }
        if (value.getWrongAnswer1() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getWrongAnswer1());
        }
        if (value.getWrongAnswer2() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWrongAnswer2());
        }
        stmt.bindLong(5, value.getUuid());
        stmt.bindLong(6, value.getUuid());
      }
    };
  }

  @Override
  public void insertAll(final Flashcard... flashcards) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFlashcard.insert(flashcards);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Flashcard flashcard) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFlashcard.handle(flashcard);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Flashcard flashcard) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfFlashcard.handle(flashcard);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Flashcard> getAll() {
    final String _sql = "SELECT * FROM flashcard";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
      final int _cursorIndexOfAnswer = CursorUtil.getColumnIndexOrThrow(_cursor, "answer");
      final int _cursorIndexOfWrongAnswer1 = CursorUtil.getColumnIndexOrThrow(_cursor, "wrong_answer_1");
      final int _cursorIndexOfWrongAnswer2 = CursorUtil.getColumnIndexOrThrow(_cursor, "wrong_answer_2");
      final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
      final List<Flashcard> _result = new ArrayList<Flashcard>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Flashcard _item;
        final String _tmpQuestion;
        if (_cursor.isNull(_cursorIndexOfQuestion)) {
          _tmpQuestion = null;
        } else {
          _tmpQuestion = _cursor.getString(_cursorIndexOfQuestion);
        }
        final String _tmpAnswer;
        if (_cursor.isNull(_cursorIndexOfAnswer)) {
          _tmpAnswer = null;
        } else {
          _tmpAnswer = _cursor.getString(_cursorIndexOfAnswer);
        }
        final String _tmpWrongAnswer1;
        if (_cursor.isNull(_cursorIndexOfWrongAnswer1)) {
          _tmpWrongAnswer1 = null;
        } else {
          _tmpWrongAnswer1 = _cursor.getString(_cursorIndexOfWrongAnswer1);
        }
        final String _tmpWrongAnswer2;
        if (_cursor.isNull(_cursorIndexOfWrongAnswer2)) {
          _tmpWrongAnswer2 = null;
        } else {
          _tmpWrongAnswer2 = _cursor.getString(_cursorIndexOfWrongAnswer2);
        }
        final int _tmpUuid;
        _tmpUuid = _cursor.getInt(_cursorIndexOfUuid);
        _item = new Flashcard(_tmpQuestion,_tmpAnswer,_tmpWrongAnswer1,_tmpWrongAnswer2,_tmpUuid);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
