package com.minlu.toast.style;

/**
 *    author : Chen-Xi
 *    github : https://github.com/getActivity/ToastUtils
 *    time   : 2018-12-10
 *    desc   : 默认白色样式实现
 */
public class ToastWhiteStyle extends ToastBlackStyle {

    @Override
    public int getBackgroundColor() {
        return 0XFFEAEAEA;
    }

    @Override
    public int getTextColor() {
        return 0XBB000000;
    }
}