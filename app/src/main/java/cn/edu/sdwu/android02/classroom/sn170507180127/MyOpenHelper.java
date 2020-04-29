package cn.edu.sdwu.android02.classroom.sn170507180127;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by 谭慧琳 on 2020/4/29.
 */

public class MyOpenHelper extends SQLiteOpenHelper {
    private  String STUIDENT_TB_SQL="create table student (id integer primary key autoincrement,stuname text,stutel text)";
   public  MyOpenHelper(Context context){
       //构造方法(Context context上下文, String name数据库名称, CursorFactory factory传入Null, int version)数据库的版本

        super(context,"stud.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //当打开数据库时，发现数据库并不存在，此时会自动创建数据库，然后调用OnCreate方法
        //在本方法中，完成数据库对象（表、视图、索引等）的创建
        //通过SQLiteDatebase对象，完成SQL的执行
        sqLiteDatabase.execSQL(STUIDENT_TB_SQL);
        Log.i(MyOpenHelper.class.toString(),"onCreate");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
