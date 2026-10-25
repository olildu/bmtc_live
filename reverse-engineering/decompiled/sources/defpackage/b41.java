package defpackage;

import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RoutePlanner;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b41 {
    public static /* synthetic */ boolean a(RoutePlanner routePlanner, RealConnection realConnection, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i & 1) != 0) {
            realConnection = null;
        }
        return routePlanner.hasNext(realConnection);
    }
}
