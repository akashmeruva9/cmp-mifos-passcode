
class JVMPlatform : Platform {
    //    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    override val name: String = "JVM"
}

actual fun getPlatform(): Platform = JVMPlatform()