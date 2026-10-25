package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzsk;
import com.google.android.gms.internal.measurement.zztc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class vt1 {
    public static InputStream a(zztc zztcVar, Uri uri, InputStream inputStream) throws IOException {
        if (inputStream != null) {
            inputStream.close();
        }
        throw new zzsk("wrapForRead not supported by ".concat(String.valueOf(zztcVar.zza())));
    }

    public static OutputStream b(zztc zztcVar, Uri uri, OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new zzsk("wrapForWrite not supported by ".concat(String.valueOf(zztcVar.zza())));
    }
}
