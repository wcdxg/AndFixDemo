package com.yuaihen.andfixdemo

import android.app.Application
import android.os.Environment
import com.alipay.euler.andfix.patch.PatchManager
import java.io.File

/**
 * Created by Yuaihen.
 * on 2019/4/2
 */
class MyApplication : Application() {

    //仅支持Android 2.3-6.0

    //补丁文件名称
    val APATCH_PATH: String = "fixbug.apatch"

    override fun onCreate() {
        super.onCreate()

        //初始化阿里 AndFix
        val patchManager = PatchManager(this);
        patchManager.init("1.0");//current version

        patchManager.loadPatch()

        //获取补丁文件路径
        var path = File(Environment.getExternalStorageDirectory(), APATCH_PATH)
        if (path.exists()) {
            //合并补丁文件
            patchManager.addPatch(path.absolutePath)
        }
    }


}