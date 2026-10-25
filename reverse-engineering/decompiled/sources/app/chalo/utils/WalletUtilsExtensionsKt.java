package app.chalo.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletUtilsExtensionsKt {
    public static final String a(long j, String walletId) {
        Intrinsics.i(walletId, "walletId");
        return j + "_" + walletId;
    }

    public static final Pair b(String orderId) {
        Intrinsics.i(orderId, "orderId");
        List listU = StringsKt.U(orderId, new String[]{"_"}, 6);
        return new Pair(listU.get(1), Long.valueOf(Long.parseLong((String) listU.get(0))));
    }
}
