package com.minlu.toastutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.minlu.toast.ToastUtils;

public class MainActivity extends AppCompatActivity {

    private Button mBtnOrdinaryToast;
    private Button mBtnLengthenToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnOrdinaryToast = findViewById(R.id.btn_ordinary_toast);
        mBtnLengthenToast = findViewById(R.id.btn_lengthen_toast);
        mBtnOrdinaryToast.setOnClickListener(mOnClickListener);
        mBtnLengthenToast.setOnClickListener(mOnClickListener);
    }
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override public void onClick(View v) {
            if (v == mBtnOrdinaryToast){
                //显示普通的Toast
                showOrdinaryToast();
            }else if (v == mBtnLengthenToast){
                //显示设置最大行数后的长文本。
                showLengthenToast();
            }
        }
    };

    //显示延长的Toast，在样式中已设置最大行数。
    private void showLengthenToast() {
        ToastUtils.show("When the view is shown to the user, appears as a floating view over the application. It will never receive focus. The user will probably be in the middle of typing something else. The idea is to be as unobtrusive as possible, while still showing the user the information you want them to see. Two examples are the volume control, and the brief message saying that your settings have been saved.");
    }

    //显示普通的Toast
    private void showOrdinaryToast() {
        //                这是普通的Toast
        //                直接传入string id
        ToastUtils.show(R.string.ordinary_toast);
/*                或者是其他类型
                ToastUtils.show("普通的Toast");
                ToastUtils.show(123);
                ToastUtils.show(12.3);*/
    }
}
