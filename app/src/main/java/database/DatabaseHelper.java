package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "db_taufik_jus";
    public static final String TABLE_USER = "db_user";
    public static final String COL_USERNAME = "username";
    public static final String COL_PASSWORD = "password";
    public static final String COL_NAME = "name";
    public static final String TABLE_MENU = "db_menu";
    public static final String TABLE_TRANSAKSI = "db_transaksi";

    private SQLiteDatabase db;

    public DatabaseHelper(Context context) {
        
    }
}
