package app.chalo.vault.dao;

import app.chalo.vault.mapper.QuickPayEntityMapper;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class QuickPayDaoImpl$getQuickPaysForOrderIdAsFlow$1 extends FunctionReferenceImpl implements Function11<String, String, String, String, String, Long, Long, Long, String, Long, String, QuickPayEntity> {
    @Override // kotlin.jvm.functions.Function11
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        String p8 = (String) obj9;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p8, "p8");
        ((QuickPayEntityMapper) this.receiver).getClass();
        return QuickPayEntityMapper.a(p0, p1, p2, (String) obj4, (String) obj5, ((Number) obj6).longValue(), (Long) obj7, ((Number) obj8).longValue(), p8, (Long) obj10, (String) obj11);
    }
}
