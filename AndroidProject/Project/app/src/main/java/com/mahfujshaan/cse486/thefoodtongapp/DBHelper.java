package com.mahfujshaan.cse486.thefoodtongapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.mahfujshaan.cse486.thefoodtongapp.Models.OrdersModel;
import java.util.ArrayList;


public class DBHelper extends SQLiteOpenHelper {

    final static String DBNAME = "foodtongbase.db";
final static int DBVERSION = 2;

    public DBHelper(@Nullable Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
   sqLiteDatabase.execSQL(
           "create table orders" +
           "(id integer primary key autoincrement," +
           "name text," +
           "phone text,"+
           "price int," +
           "image int," +
                   "quantity int," +
           "foodname text," +
           "description text)"
   );


    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
sqLiteDatabase.execSQL("DROP TABLE IF EXISTS orders");
onCreate(sqLiteDatabase);
    }
public boolean insertOrder(String name, String phone, int price, int image, String description, String foodname, int quantity)
{

SQLiteDatabase database = getReadableDatabase();
    ContentValues values = new ContentValues();
    values.put("name",name);
    values.put("phone",phone);
    values.put("price",price);
    values.put("image",image);
    values.put("description",description);
    values.put("foodname",foodname);
    values.put("quantity",quantity);


    long id = database.insert("orders",null,values);
    if(id <=0){
        return false;
    }
    else {
        return true;
    }
}


public ArrayList<OrdersModel> getOrders(){
        ArrayList<OrdersModel> orders = new ArrayList<>();
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery("Select id,foodname,image,price from orders", null);
if(cursor.moveToFirst()){
    while(cursor.moveToNext()){
        OrdersModel model = new OrdersModel();
        model.setOrderNumber(cursor.getInt(0)+"");
        model.setSoldItemName(cursor.getString(1));
        model.setOrderImage(cursor.getInt(2));
        model.setPrice(cursor.getInt(3)+"");
        orders.add(model);
    }
     }
cursor.close();
database.close();
return orders;
     }


     public Cursor getOrderById(int id){

         SQLiteDatabase database = this.getWritableDatabase();
         Cursor cursor = database.rawQuery("Select * from orders where id ="+id, null);
if(cursor !=null)
    cursor.moveToFirst();
         return cursor;

     }
}
