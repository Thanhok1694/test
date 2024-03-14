package com.example.test.DAO;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.test.DTO.NhanVienDTO;
import com.example.test.Database.SQLiteDBHelper;

import java.util.ArrayList;

public class NhanVienDAO {
private SQLiteDBHelper mydb;
private SQLiteDatabase db;
public NhanVienDAO(Context context){
mydb=new SQLiteDBHelper(context);
db=mydb.getWritableDatabase();
}
public int insert(NhanVienDTO nv){
    ContentValues values=new ContentValues();
    values.put("maNV",nv.maNV);
    values.put("tenNV",nv.tenNV);
    values.put("namSinh",nv.namSinh);
    return (int)db.insert("NhanVien",null,values);
}
public int update(NhanVienDTO nv){
    ContentValues values=new ContentValues();
    values.put("maNV",nv.maNV);
    values.put("tenNV",nv.tenNV);
    values.put("namSinh",nv.namSinh);
    String[] dieukien=new String[]{String.valueOf(nv.maNV)};
    return db.update("NhanVien",values,"maNV=?",dieukien);

}
public int delete(NhanVienDTO nv){
    String[] dieukien=new String[]{String.valueOf(nv.maNV)};
    return db.delete("NhanVien","maNV=?",dieukien);
}
public ArrayList<NhanVienDTO> getList(){
String sql="select * from NhanVien";
return getData(sql);
}
@SuppressLint("Range")
private ArrayList<NhanVienDTO> getData(String sql, String...selectionArgs){
ArrayList<NhanVienDTO> list=new ArrayList<>();
    Cursor c=db.rawQuery(sql,selectionArgs);
while(c.moveToNext()){
NhanVienDTO nv=new NhanVienDTO();
nv.maNV=Integer.parseInt(c.getString(c.getColumnIndex("maNV")));
nv.tenNV=c.getString(c.getColumnIndex("tenNV"));
nv.namSinh=Integer.parseInt(c.getString(c.getColumnIndex("namSinh")));
list.add(nv);
}
return list;
}

}
