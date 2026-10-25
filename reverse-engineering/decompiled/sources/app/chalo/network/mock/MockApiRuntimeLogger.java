package app.chalo.network.mock;

import android.util.Log;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/MockApiRuntimeLogger;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MockApiRuntimeLogger {
    public static void a(String str, String message) {
        Object objA;
        Intrinsics.i(message, "message");
        try {
            objA = Integer.valueOf(Log.e(str, message));
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (Result.a(objA) != null) {
            System.out.println((Object) vo1.n(str, ": ", message));
        }
    }

    public static void b(String str, String message) {
        Object objA;
        Intrinsics.i(message, "message");
        try {
            objA = Integer.valueOf(Log.i(str, message));
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (Result.a(objA) != null) {
            System.out.println((Object) vo1.n(str, ": ", message));
        }
    }
}
