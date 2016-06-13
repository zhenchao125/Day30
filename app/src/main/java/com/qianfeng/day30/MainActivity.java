package com.qianfeng.day30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 远程修改的代码
        //新增代码
        /*
        在160dpi的屏幕上    手机的宽度1个in
        160px的线 1in

        1dp=1px
        160dp的线  1in
        在320dpi的屏幕上    手机的宽度是1个in
        160px的线 0.5in

        1dp=2px
        160dp的线  1in


         */
    }
}
