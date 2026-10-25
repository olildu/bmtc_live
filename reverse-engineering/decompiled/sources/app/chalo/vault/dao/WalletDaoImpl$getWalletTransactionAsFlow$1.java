package app.chalo.vault.dao;

import app.chalo.vault.mapper.WalletTransactionEntityMapper;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class WalletDaoImpl$getWalletTransactionAsFlow$1 extends FunctionReferenceImpl implements Function8<String, String, String, String, String, Long, String, Long, WalletTransactionEntity> {
    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String p2 = (String) obj3;
        String p3 = (String) obj4;
        String p4 = (String) obj5;
        long jLongValue = ((Number) obj6).longValue();
        String p6 = (String) obj7;
        long jB = hq0.b((Number) obj8, str, "p0", str2, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p6, "p6");
        ((WalletTransactionEntityMapper) this.receiver).getClass();
        return WalletTransactionEntityMapper.a(jLongValue, jB, str, str2, p2, p3, p4, p6);
    }
}
