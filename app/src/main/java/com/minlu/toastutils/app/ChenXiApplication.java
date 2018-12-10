package com.minlu.toastutils.app;

import android.app.Application;

import com.minlu.toast.ToastUtils;


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
//        初始化Toast
        ToastUtils.init(this);
//        初始化时可以选择你喜欢的样式 或者你也可以自定义
//        ToastUtils.initStyle(new ToastBlackStyle());
//        ToastUtils.initStyle(new ToastQQStyle());
//        ToastUtils.initStyle(new ToastWhiteStyle());
//        ToastUtils.initStyle(new IToastStyle() {
//            @Override
//            public int getGravity() {
//                return 0;
//            }
//
//            @Override
//            public int getXOffset() {
//                return 0;
//            }
//
//            @Override
//            public int getYOffset() {
//                return 0;
//            }
//
//            @Override
//            public int getZ() {
//                return 0;
//            }
//
//            @Override
//            public int getCornerRadius() {
//                return 0;
//            }
//
//            @Override
//            public int getBackgroundColor() {
//                return 0;
//            }
//
//            @Override
//            public int getTextColor() {
//                return 0;
//            }
//
//            @Override
//            public float getTextSize() {
//                return 0;
//            }
//
//            @Override
//            public int getMaxLines() {
//                return 0;
//            }
//
//            @Override
//            public int getPaddingLeft() {
//                return 0;
//            }
//
//            @Override
//            public int getPaddingTop() {
//                return 0;
//            }
//
//            @Override
//            public int getPaddingRight() {
//                return 0;
//            }
//
//            @Override
//            public int getPaddingBottom() {
//                return 0;
//            }
//        });
    }
}
