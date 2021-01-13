package com.mahfujshaan.cse486.thefoodtongapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    final static String DBNAME = "foodtongbase.db";
final static int DBVERSION = 1;

    public DBHelper(@Nullable Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
   sqLiteDatabase.execSQL(
           "create table orders" +
           "(id int primary key autoincrement," +
           "name text," +
           "phone text,"+
           "price int," +
           "image int," +
           "foodname text," +
           "description text)"
   );


    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
sqLiteDatabase.execSQL("DROP TABLE IF EXISTS orders");
onCreate(sqLiteDatabase);
    }
public boolean insertOrder(String name, String phone, int price, int image, String description, String foodname )
{

SQLiteDatabase database = getReadableDatabase();
    ContentValues values = new ContentValues();
    values.put("name",name);
    values.put("phone",phone);
    values.put("price",price);
    values.put("image",image);
    values.put("foodname",foodname);
    values.put("description",description);
    long id = database.insert("orders",null,values);
    if(id <=0){
        return false;
    }
    else {
        return true;
    }
}

}
