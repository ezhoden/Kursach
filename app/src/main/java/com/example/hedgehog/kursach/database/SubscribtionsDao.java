package com.example.hedgehog.kursach.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "SUBSCRIBTIONS".
 */
public class SubscribtionsDao extends AbstractDao<Subscribtions, Void> {

    public static final String TABLENAME = "SUBSCRIBTIONS";

    /**
     * Properties of entity Subscribtions.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property SubscribtionName = new Property(0, String.class, "subscribtionName", false, "SUBSCRIBTION_NAME");
        public final static Property Description = new Property(1, String.class, "description", false, "DESCRIPTION");
        public final static Property Price = new Property(2, int.class, "price", false, "PRICE");
    }


    public SubscribtionsDao(DaoConfig config) {
        super(config);
    }

    public SubscribtionsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"SUBSCRIBTIONS\" (" + //
                "\"SUBSCRIBTION_NAME\" TEXT," + // 0: subscribtionName
                "\"DESCRIPTION\" TEXT NOT NULL ," + // 1: description
                "\"PRICE\" INTEGER NOT NULL );"); // 2: price
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_SUBSCRIBTIONS_SUBSCRIBTION_NAME ON \"SUBSCRIBTIONS\"" +
                " (\"SUBSCRIBTION_NAME\" ASC);");
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SUBSCRIBTIONS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Subscribtions entity) {
        stmt.clearBindings();

        String subscribtionName = entity.getSubscribtionName();
        if (subscribtionName != null) {
            stmt.bindString(1, subscribtionName);
        }
        stmt.bindString(2, entity.getDescription());
        stmt.bindLong(3, entity.getPrice());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Subscribtions entity) {
        stmt.clearBindings();

        String subscribtionName = entity.getSubscribtionName();
        if (subscribtionName != null) {
            stmt.bindString(1, subscribtionName);
        }
        stmt.bindString(2, entity.getDescription());
        stmt.bindLong(3, entity.getPrice());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }

    @Override
    public Subscribtions readEntity(Cursor cursor, int offset) {
        Subscribtions entity = new Subscribtions( //
                cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // subscribtionName
                cursor.getString(offset + 1), // description
                cursor.getInt(offset + 2) // price
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, Subscribtions entity, int offset) {
        entity.setSubscribtionName(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setDescription(cursor.getString(offset + 1));
        entity.setPrice(cursor.getInt(offset + 2));
    }

    @Override
    protected final Void updateKeyAfterInsert(Subscribtions entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }

    @Override
    public Void getKey(Subscribtions entity) {
        return null;
    }

    @Override
    public boolean hasKey(Subscribtions entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }

}
