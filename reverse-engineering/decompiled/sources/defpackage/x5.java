package defpackage;

import android.database.CursorWindow;
import android.media.session.MediaSessionManager;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class x5 {
    public static /* synthetic */ CursorWindow a(long j) {
        return new CursorWindow(null, j);
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo b(int i, int i2, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }
}
