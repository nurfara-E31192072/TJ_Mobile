package database;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import com.nurfara.taufikjusapp.R;

public class DatabaseHelper1 extends SQLiteOpenHelper {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_helper1);
    }
}