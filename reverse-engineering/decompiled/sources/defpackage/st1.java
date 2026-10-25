package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzsk;
import com.google.android.gms.internal.measurement.zzsx;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class st1 {
    public static InputStream a(zzsx zzsxVar, Uri uri) throws zzsk {
        throw new zzsk("openForRead not supported by ".concat(String.valueOf(zzsxVar.zzc())));
    }

    public static boolean b(zzsx zzsxVar, Uri uri) throws zzsk {
        throw new zzsk("exists not supported by ".concat(String.valueOf(zzsxVar.zzc())));
    }

    public static File c(zzsx zzsxVar, Uri uri) throws zzsk {
        String strZzc = zzsxVar.zzc();
        String strValueOf = String.valueOf(uri);
        throw new zzsk(r30.i(new StringBuilder(String.valueOf(strZzc).length() + 28 + strValueOf.length()), "Cannot convert uri to file ", strZzc, " ", strValueOf));
    }

    public static OutputStream d(zzsx zzsxVar, Uri uri) throws zzsk {
        throw new zzsk("openForWrite not supported by ".concat(String.valueOf(zzsxVar.zzc())));
    }

    public static void e(zzsx zzsxVar, Uri uri) throws zzsk {
        throw new zzsk("deleteFile not supported by ".concat(String.valueOf(zzsxVar.zzc())));
    }

    public static void f(zzsx zzsxVar, Uri uri, Uri uri2) throws zzsk {
        throw new zzsk("rename not supported by ".concat(String.valueOf(zzsxVar.zzc())));
    }
}
