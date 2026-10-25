package app.chalo.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CoroutineRestartUtilsKt {
    public static Job a(ContextScope contextScope, Function1 function1) {
        Intrinsics.i(contextScope, "<this>");
        return BuildersKt.d(contextScope, null, null, new CoroutineRestartUtilsKt$launchCollectorWithRestart$1(function1, "HomeComponent", "Premium bus PRF backfill collector", 5000L, null), 3);
    }
}
