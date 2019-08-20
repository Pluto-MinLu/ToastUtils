package com.minlu.toastutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.minlu.toast.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ordinaryToast = (Button) findViewById(R.id.ordinary_toast);
        ordinaryToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                这是普通的Toast
//                直接传入string id
                ToastUtils.show(R.string.toast);
//                或者是其他类型
//                ToastUtils.show("普通的Toast");  ToastUtils.show(123);   ToastUtils.show(12.3);
            }
        });
    }
}
