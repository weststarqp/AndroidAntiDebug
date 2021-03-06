package com.vigorous.android.antidebug.application;

import android.app.Application;

/**
 * Created by Vigorous.Liang on 2017/12/28.
 */

public class AntiDebugApplication extends Application {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //调用android系统自带调试检测函数
        if (android.os.Debug.isDebuggerConnected()) {
            try {
                android.os.Process.killProcess(android.os.Process.myPid());
            } catch (Throwable t) {
                System.exit(0);
            }
        }
    }
}
