package com.example.test.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteDBHelper extends SQLiteOpenHelper {
    public SQLiteDBHelper(@Nullable Context context) {
        super(context, "QLTT",null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String tb_nhanvien="create table NhanVien(maNV integer primary key autoincrement,tenNV text not null,namSinh integer not null)";
        sqLiteDatabase.execSQL(tb_nhanvien);
        String db_nhanvien="insert into NhanVien(tenNV,namSinh) values('Nguyễn Đức Thành',2004),('Nguyễn Khánh Duy',2001)";
        sqLiteDatabase.execSQL(db_nhanvien);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        if(i!=i1){
            sqLiteDatabase.execSQL("drop table if exists NhanVien");
        }
    }
}
