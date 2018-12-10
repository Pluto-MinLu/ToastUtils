# 无视通知权限的Toast   v1.0  [![](https://jitpack.io/v/Chen-Xi-g/ChenXi.svg)](https://jitpack.io/#Chen-Xi-g/ChenXi)
 <img src="http://a3.qpic.cn/psb?/V12LSg7n0Vj1Fg/nKIJtyxKiSKDuL*RaIM4yca0Cc9WtmD5s2txG61PCB0!/b/dFIBAAAAAAAA&ek=1&kp=1&pt=0&bo=yADIAMgAyAADGTw!&tl=1&vuin=912816369&tm=1544418000&sce=60-2-2&rf=viewer_4"  height="60" width="100"><img src="http://m.qpic.cn/psb?/V12LSg7n0Vj1Fg/aQWM2qX1u9g6jCRA54s.GEBjdpwpiwMqcPUoyOGd8Bk!/b/dFQBAAAAAAAA&bo=yADIAMgAyAADGTw!&rf=viewer_4" height="60" width="100"><img src="http://m.qpic.cn/psb?/V12LSg7n0Vj1Fg/0CArzmNrN9SFGn.29tWke0g3UuHQHvQRz3vZQaKqj6I!/b/dDQBAAAAAAAA&bo=yADIAMgAyAADGTw!&rf=viewer_4" height="60" width="100"><img src="http://m.qpic.cn/psb?/V12LSg7n0Vj1Fg/sxQLkfTKlX6LDxS3DjJMfnf4s6px3byX.lNGs.tEECM!/b/dFMBAAAAAAAA&bo=yADIAMgAyAADGTw!&rf=viewer_4" height="60" width="100"><img src="http://a3.qpic.cn/psb?/V12LSg7n0Vj1Fg/nKIJtyxKiSKDuL*RaIM4yca0Cc9WtmD5s2txG61PCB0!/b/dFIBAAAAAAAA&ek=1&kp=1&pt=0&bo=yADIAMgAyAADGTw!&tl=1&vuin=912816369&tm=1544418000&sce=60-2-2&rf=viewer_4" height="60" width="100">
 How to
 
---
 To get a Git project into your build:
 Step 1. Add the JitPack repository to your build file
 ##### Gradle
 ```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
 Step 2. Add the dependency
 ```
implementation 'com.github.Chen-Xi-g:ChenXi:v1.0'
```
 ### 如何使用
 #### 1.初始化
```
//在Application 中初始化
public static void init(Application application) 
 /*
 *你也可以在Application初始化时选择或定义Toast样式 本框架默认提供了三种样式
 *黑色样式：{@link ToastBlackStyle}
 *白色样式：{@link ToastWhiteStyle}
 *仿QQ样式：{@link ToastQQStyle}
 */
 
public static void initStyle(IToastStyle style)
```
 
 #### 2.使用
 
```
/*
 * 对象
 */
public static void show(Object object) 
/*
 * string id
 */
public static void show(int id)
/*
 * 需要显示的文本
 */
public static void show(CharSequence text)
```
 ### 如果你感觉对你有用的话请点一下Star吧，而且你还可以打赏一波
 
 <img src="http://r.photo.store.qq.com/psb?/V12LSg7n0Vj1Fg/JIE.r7vzYd0JdQV4.U8AFDF2wy5d*DXixdQZ2ZFiV6I!/r/dEYBAAAAAAAA" height = "400" width = "300">      <img src="http://r.photo.store.qq.com/psb?/V12LSg7n0Vj1Fg/64q8qbMEanfoAXbFWxrESl6QXS7ITX63kCabiSRL440!/r/dLYAAAAAAAAA" height = "400" width = "300">
 
 ### 如何联系我
 **QQ:** 912816369
 **邮箱:** a912816369@gmail.com
