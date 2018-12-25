# 无视通知权限的Toast   1.0.0  [![ToastUtils](https://jitpack.io/v/Chen-Xi-g/ToastUtils.svg)](https://jitpack.io/#Chen-Xi-g/ToastUtils)
## Toast unaffected by notification permissions 1.0.0
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
implementation 'com.github.Chen-Xi-g:ToastUtils:1.0.0'
```

 ### 如何使用
 #### How to use
 
 #### 1.初始化
 ##### 1.Initialization
 
```
//在Application 中初始化

public static void init(Application application) 

 /*
 *你也可以在Application初始化时选择或定义Toast样式 本框架默认提供了三种样式
 *黑色样式(Black style)：{@link ToastBlackStyle}
 *白色样式(White style)：{@link ToastWhiteStyle}
 *仿QQ样式(Imitation QQ style)：{@link ToastQQStyle}
 */
 
public static void initStyle(IToastStyle style)
```
 
 #### 2.使用
 ##### 2.Use
 
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

 ### 如果你感觉对你有用的话请点一下Star吧，而且你还可以打赏一波
 #### If you feel useful to you, please click Star, or you can reward it.
 
 <img src="http://r.photo.store.qq.com/psb?/V12LSg7n0Vj1Fg/JIE.r7vzYd0JdQV4.U8AFDF2wy5d*DXixdQZ2ZFiV6I!/r/dEYBAAAAAAAA" height = "400" width = "300">      <img src="http://r.photo.store.qq.com/psb?/V12LSg7n0Vj1Fg/64q8qbMEanfoAXbFWxrESl6QXS7ITX63kCabiSRL440!/r/dLYAAAAAAAAA" height = "400" width = "300">
 
 ### 如何联系我
 #### How to contact me
 
 **QQ:** 912816369
 
 **邮箱(Email):** a912816369@gmail.com
 
 
 
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
