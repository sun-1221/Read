package io.legado.app.lib.cronet

import android.annotation.SuppressLint
import androidx.annotation.Keep
import io.legado.app.help.http.Cronet
import io.legado.app.utils.DebugLog
import org.chromium.net.CronetEngine

@Suppress("ConstPropertyName")
@Keep
object CronetLoader : CronetEngine.Builder.LibraryLoader(), Cronet.LoaderInterface {

    @Volatile
    private var cacheInstall = false

    /**
     * 判断Cronet是否安装完成
     * so库已打包在APK内，始终可用
     */
    override fun install(): Boolean {
        cacheInstall = true
        return true
    }

    /**
     * 预加载Cronet
     * so库已打包在APK内，无需下载
     */
    override fun preDownload() {
        // no-op
    }

    @SuppressLint("UnsafeDynamicallyLoadedCode")
    override fun loadLibrary(libName: String) {
        DebugLog.d(javaClass.simpleName, "libName:$libName")
        val start = System.currentTimeMillis()
        try {
            System.loadLibrary(libName)
            DebugLog.d(javaClass.simpleName, "load from system")
        } finally {
            DebugLog.d(javaClass.simpleName, "time:" + (System.currentTimeMillis() - start))
        }
    }

}
