package app.chalo.vault.dao;

import app.chalo.vault.mapper.ChaloPayEntityMapper;
import app.chalo.walletframework.wallet.data.repository.entity.ChaloPayEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class WalletDaoImpl$getAllChaloPayTransactionsFlow$1 extends FunctionReferenceImpl implements Function8<String, Long, String, Long, String, String, String, String, ChaloPayEntity> {
    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        String p0 = (String) obj;
        String p2 = (String) obj3;
        String p4 = (String) obj5;
        String p7 = (String) obj8;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p7, "p7");
        ((ChaloPayEntityMapper) this.receiver).getClass();
        return ChaloPayEntityMapper.a(((Number) obj2).longValue(), ((Number) obj4).longValue(), p0, p2, p4, (String) obj6, (String) obj7, p7);
    }
}
