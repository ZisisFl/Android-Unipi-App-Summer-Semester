package logismikou.texnologia.unipi_application;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null;

    // private constructor to prevent object creation from outside
    private DatabaseAccess(Context context){
        this.openHelper = new DatabaseOpenHelper(context);
    }

    //return single instance of database
    public static  DatabaseAccess getInstance(Context context){
        if(instance == null){
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    //to open the database
    public void open(){
        this.db = openHelper.getWritableDatabase();
    }

    //to close the database
    public void close(){
        if(db != null){
            this.db.close();
        }
    }

    public String get_pass(String email){
        c = db.rawQuery("Select * from user where email = '"+email+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String password = c.getString(1);
            buffer.append(""+password);
        }
        return buffer.toString();
    }
}
