package com.cr.hothub;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by Dexter0218 on 2017/7/14.
 */
public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "0d366ec0b7", true);
//        第三个参数为SDK调试模式开关，调试模式的行为特性如下：
//        输出详细的Bugly SDK的Log；
//        每一条Crash都会被立即上报；
//        自定义日志将会在Logcat中输出。
//        建议在测试阶段建议设置成true，发布时设置为false。

    }
}
