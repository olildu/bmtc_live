package app.chalo.walletframework.quickpay.data.model.appmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickPayAppModelKt {
    public static final long a(QuickPayAppModel quickPayAppModel) {
        Intrinsics.i(quickPayAppModel, "<this>");
        long j = quickPayAppModel.f;
        Long l = quickPayAppModel.g;
        if (l != null) {
            return j - l.longValue();
        }
        Long l2 = quickPayAppModel.j;
        return l2 != null ? l2.longValue() : j;
    }
}
