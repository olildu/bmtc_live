package app.chalo.vault.dao;

import app.chalo.vault.mapper.QuickPayReceiptMapper;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class QuickPayDaoImpl$getQuickPayReceipt$1 extends FunctionReferenceImpl implements Function21<String, String, Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, QuickPayReceipt> {
    @Override // kotlin.jvm.functions.Function21
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p4 = (String) obj5;
        String p5 = (String) obj6;
        String p6 = (String) obj7;
        String p7 = (String) obj8;
        String p8 = (String) obj9;
        String p9 = (String) obj10;
        String p12 = (String) obj13;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        Intrinsics.i(p7, "p7");
        Intrinsics.i(p8, "p8");
        Intrinsics.i(p9, "p9");
        Intrinsics.i(p12, "p12");
        ((QuickPayReceiptMapper) this.receiver).getClass();
        return QuickPayReceiptMapper.a(p0, p1, ((Number) obj3).longValue(), ((Number) obj4).longValue(), p4, p5, p6, p7, p8, p9, (String) obj11, (String) obj12, p12, (String) obj14, (String) obj15, (String) obj16, (String) obj17, (String) obj18, (String) obj19, (String) obj20, (String) obj21);
    }
}
