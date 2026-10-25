package defpackage;

import android.graphics.fonts.FontVariationAxis;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m00 {
    public static /* synthetic */ FontVariationAxis a(float f) {
        return new FontVariationAxis("wght", f);
    }

    public static /* synthetic */ FontVariationAxis b(String str, float f) {
        return new FontVariationAxis(str, f);
    }

    public static /* synthetic */ InMemoryDexClassLoader c(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}
