package com.minlu.toastutils.app;

import android.app.Application;

import com.minlu.toast.ToastUtils;
import com.minlu.toastutils.MyToastStyle;

/**
 * @ProjectName: ChenXi
 * @Package: com.minlu.toastutils.app
 * @ClassName: ChenXiApplicntion
 * @Description: Application
 * @Author: Chen-Xi
 * @CreateDate: 2018/12/10 12:11
 * @UpdateUser: 高国峰
 * @Remark: Application
 */
public class ChenXiApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        /*
        * 需要先设置initStyle再初始化，否则位置会失效
        * */
//        初始化时可以选择你喜欢的样式 或者你也可以自定义
        ToastUtils.initStyle(new MyToastStyle());
//        ToastUtils.initStyle(new ToastBlackStyle());
//        ToastUtils.initStyle(new ToastQQStyle());
//        ToastUtils.initStyle(new ToastWhiteStyle());
        //        初始化Toast
        ToastUtils.init(this);
    }
}
