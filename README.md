# 无视通知权限的Toast   1.2.0(Toast unaffected by notification permissions 1.2.0)  [![ToastUtils](https://jitpack.io/v/Chen-Xi-g/ToastUtils.svg)](https://jitpack.io/#Chen-Xi-g/ToastUtils)
<img src="http://a3.qpic.cn/psb?/V12LSg7n0Vj1Fg/nKIJtyxKiSKDuL*RaIM4yca0Cc9WtmD5s2txG61PCB0!/b/dFIBAAAAAAAA&ek=1&kp=1&pt=0&bo=yADIAMgAyAADGTw!&tl=1&vuin=912816369&tm=1544418000&sce=60-2-2&rf=viewer_4"  height="60" width="100"><img src="http://m.qpic.cn/psb?/V12LSg7n0Vj1Fg/aQWM2qX1u9g6jCRA54s.GEBjdpwpiwMqcPUoyOGd8Bk!/b/dFQBAAAAAAAA&bo=yADIAMgAyAADGTw!&rf=viewer_4" height="60" width="100"><img src="http://m.qpic.cn/psb?/V12LSg7n0Vj1Fg/0CArzmNrN9SFGn.29tWke0g3UuHQHvQRz3vZQaKqj6I!/b/dDQBAAAAAAAA&bo=yADIAMgAyAADGTw!&rf=viewer_4" height="60" width="100"><img src="http://m.qpic.cn/psb?/V12LSg7n0Vj1Fg/sxQLkfTKlX6LDxS3DjJMfnf4s6px3byX.lNGs.tEECM!/b/dFMBAAAAAAAA&bo=yADIAMgAyAADGTw!&rf=viewer_4" height="60" width="100"><img src="http://a3.qpic.cn/psb?/V12LSg7n0Vj1Fg/nKIJtyxKiSKDuL*RaIM4yca0Cc9WtmD5s2txG61PCB0!/b/dFIBAAAAAAAA&ek=1&kp=1&pt=0&bo=yADIAMgAyAADGTw!&tl=1&vuin=912816369&tm=1544418000&sce=60-2-2&rf=viewer_4" height="60" width="100">
 
 How to
--

##### To get a Git project into your build:
 
##### **Step 1. Add the JitPack repository to your build file**
 
##### Gradle

 ```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

##### **Step 2. Add the dependency**

 ```
implementation 'com.github.Chen-Xi-g:ToastUtils:1.2.0'
```

 ### 如何使用(How to use)
 
 #### 1.初始化(Initialization)
 
```
//在Application 中初始化;如果设置样式先initStyle

 /*
 *你也可以在Application初始化时选择或定义Toast样式 本框架默认提供了三种样式
 *如果与想要的效果不符可自定义样式。
 *黑色样式(Black style)：{@link ToastBlackStyle}
 *白色样式(White style)：{@link ToastWhiteStyle}
 *仿QQ样式(Imitation QQ style)：{@link ToastQQStyle}
 */
 
public static void initStyle(IToastStyle style)

//初始化Toast
public static void init(Application application) 

```
 
 #### 2.使用(Use)
 
```
/*
 * 对象
 * Object
 */
public static void show(Object object) 
/*
 * string id
 */
public static void show(int id)
/*
 * 需要显示的文本
 * CharSequence
 */
public static void show(CharSequence text)
```

 ### 3.自定义Toast样式。
```
//新建一个类实现接口 IToastStyle 和方法...

    int getGravity(); // Toast的位置，Gravity.TOP ; Gravity.BOTTOM ; Gravity.CENTER;
    int getXOffset(); // X轴偏移
    int getYOffset(); // Y轴偏移
    int getZ(); // ToastZ轴y阴影

    int getCornerRadius(); // 圆角大小
    int getBackgroundColor(); // 背景颜色

    int getTextColor(); // 文本颜色
    float getTextSize(); // 文本大小
    int getMaxLines(); // 最大行数

    int getPaddingLeft(); // 左边内边距
    int getPaddingTop(); // 顶部内边距
    int getPaddingRight(); // 右边内边距
    int getPaddingBottom(); // 底部内边距

```

 ### 如果你感觉对你有用的话请点一下Star吧，而且你还可以打赏一波(If you feel useful to you, please click Star, or you can reward it.)
 
 <img src="http://r.photo.store.qq.com/psb?/V12LSg7n0Vj1Fg/JIE.r7vzYd0JdQV4.U8AFDF2wy5d*DXixdQZ2ZFiV6I!/r/dEYBAAAAAAAA" height = "400" width = "300">      <img src="http://r.photo.store.qq.com/psb?/V12LSg7n0Vj1Fg/64q8qbMEanfoAXbFWxrESl6QXS7ITX63kCabiSRL440!/r/dLYAAAAAAAAA" height = "400" width = "300">
 
 ### 如何联系我(How to contact me)
 
 **QQ:** 1217056667
 
 **邮箱(Email):** a912816369@gmail.com
 
 **小站:** www.minlukj.com
 
 
 
 ### License
 ```
 Copyright 2018 Chen-Xi-g

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ```
