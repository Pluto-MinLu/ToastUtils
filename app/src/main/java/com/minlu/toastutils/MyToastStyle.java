package com.minlu.toastutils;

import android.view.Gravity;
import com.minlu.toast.IToastStyle;

public class MyToastStyle implements IToastStyle {
  //设置Toast显示位置
  @Override public int getGravity() {
    return Gravity.BOTTOM;
  }

  @Override public int getXOffset() {
    return 0;
  }

  @Override public int getYOffset() {
    return 50;
  }
  //Toast的Z轴阴影
  @Override public int getZ() {
    return 30;
  }
  //Toast的圆角 直接使用dp值
  @Override public int getCornerRadius() {
    return 8;
  }
  //Toast背景颜色
  @Override public int getBackgroundColor() {
    return 0xFFFF0000;
  }
  //Toast文字颜色
  @Override public int getTextColor() {
    return 0xFFFFFFFF;
  }
  //Toast文字尺寸 sp
  @Override public float getTextSize() {
    return 14;
  }
  //设置Toast最大显示行数
  @Override public int getMaxLines() {
    return 2;
  }
  //Toast Left 内边距
  @Override public int getPaddingLeft() {
    return 10;
  }
  //Toast Top 内边距
  @Override public int getPaddingTop() {
    return 10;
  }
  //Toast Right 内边距
  @Override public int getPaddingRight() {
    return 10;
  }
  //Toast Bottom 内边距
  @Override public int getPaddingBottom() {
    return 10;
  }
}
