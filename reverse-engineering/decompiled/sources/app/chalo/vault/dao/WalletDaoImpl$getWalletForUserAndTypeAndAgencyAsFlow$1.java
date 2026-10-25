package app.chalo.vault.dao;

import app.chalo.vault.mapper.WalletEntityMapper;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class WalletDaoImpl$getWalletForUserAndTypeAndAgencyAsFlow$1 extends FunctionReferenceImpl implements Function8<String, String, String, String, String, Long, Long, Long, WalletEntity> {
    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        String p3 = (String) obj4;
        String p4 = (String) obj5;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p4, "p4");
        ((WalletEntityMapper) this.receiver).getClass();
        return WalletEntityMapper.a(p0, p1, p2, p3, p4, ((Number) obj6).longValue(), ((Number) obj7).longValue(), (Long) obj8);
    }
}
