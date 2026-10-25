package defpackage;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.SocketAdapter;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class qa1 {
    public static boolean a(SocketAdapter socketAdapter, SSLSocketFactory sslSocketFactory) {
        Intrinsics.i(sslSocketFactory, "sslSocketFactory");
        return false;
    }

    public static X509TrustManager b(SocketAdapter socketAdapter, SSLSocketFactory sslSocketFactory) {
        Intrinsics.i(sslSocketFactory, "sslSocketFactory");
        return null;
    }
}
