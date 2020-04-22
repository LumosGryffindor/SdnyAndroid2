package cn.edu.sdwu.android02.classroom.sn170507180127;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//子Activity
public class Ch10Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch10_3);

    }
    public void ok(View view){
        //设置子Activity的返回值
        EditText editText=(EditText)findViewById(R.id.ch10_3_tv);
        String content=editText.getText().toString();
        //将数据放在intent里面
        Intent intent=new Intent();
        intent.putExtra("name",content);
        setResult(RESULT_OK,intent);//设置返回值

        //关掉子窗口返回副Activity

        finish();

    }
    public void cancel(View view){
        setResult(RESULT_CANCELED);//取消，没有数据
        finish();//关闭当前界面
    }
}
