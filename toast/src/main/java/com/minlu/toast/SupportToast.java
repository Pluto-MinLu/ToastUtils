package com.minlu.toast;

import android.app.Application;


final class SupportToast extends BaseToast {

    // 吐司弹窗显示辅助类
    private ToastHelper mToastHelper;

    SupportToast(Application application) {
        super(application);
        mToastHelper = new ToastHelper(this, application);
    }

    @Override
    public void show() {
        // 移除之前显示吐司的任务
        getHandler().removeCallbacks(this);
        // 添加一个显示吐司的任务
        getHandler().postDelayed(this, SHOW_DELAY_MILLIS);
    }

    /**
     * {@link Runnable}
     */
    @Override
    public void run() {
        // 设置吐司文本
        getMessageView().setText(getText());
        // 显示吐司
        mToastHelper.show();
    }

    @Override
    public void cancel() {
        // 移除之前显示吐司的任务
        getHandler().removeCallbacks(this);
        // 取消显示
        mToastHelper.cancel();
    }
}