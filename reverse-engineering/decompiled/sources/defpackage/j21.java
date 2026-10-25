package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j21 {
    public static int c(int i) {
        return e(i, 0, 0, 0);
    }

    public static int d(int i, int i2, int i3) {
        return g(i, i2, i3, 0, 128, 0);
    }

    public static int e(int i, int i2, int i3, int i4) {
        return g(i, i2, i3, 0, 128, i4);
    }

    public static int f(int i, int i2, int i3, int i4, int i5) {
        return g(i, i2, i3, i4, i5, 0);
    }

    public static int g(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    public static int h(int i) {
        return i & 24;
    }

    public static int i(int i) {
        return i & RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK;
    }

    public static int j(int i) {
        return i & 384;
    }

    public static int k(int i) {
        return i & 7;
    }

    public static int l(int i) {
        return i & 64;
    }

    public static int m(int i) {
        return i & 32;
    }

    public static boolean n(int i, boolean z) {
        int iK = k(i);
        if (iK != 4) {
            return z && iK == 3;
        }
        return true;
    }

    public static void a(RendererCapabilities rendererCapabilities) {
    }

    public static void b(RendererCapabilities rendererCapabilities, RendererCapabilities.Listener listener) {
    }
}
