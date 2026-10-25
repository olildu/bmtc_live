package app.chalo.quickpay.validation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickPayTicketProductValidationConfigKt {
    public static final boolean a(QuickPayPunchDetails quickPayPunchDetails) {
        QuickPayReceiptInfo quickPayReceiptInfo = quickPayPunchDetails.d;
        return (quickPayReceiptInfo == null || !Intrinsics.d(quickPayPunchDetails.f8904a, "quickpay") || !Intrinsics.d(quickPayPunchDetails.b, "quickpay") || quickPayReceiptInfo.b == null || quickPayReceiptInfo.f8906a == null || quickPayPunchDetails.c == null) ? false : true;
    }
}
