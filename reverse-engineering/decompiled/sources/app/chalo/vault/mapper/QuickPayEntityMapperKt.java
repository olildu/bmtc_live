package app.chalo.vault.mapper;

import app.chalo.vault.Quick_pay_table;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"vault_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickPayEntityMapperKt {
    public static final Quick_pay_table a(QuickPayEntity quickPayEntity) {
        Intrinsics.i(quickPayEntity, "<this>");
        return new Quick_pay_table(quickPayEntity.f10931a.name(), quickPayEntity.b, quickPayEntity.c, quickPayEntity.d, quickPayEntity.e, quickPayEntity.f, quickPayEntity.g, quickPayEntity.h, quickPayEntity.i, quickPayEntity.j, quickPayEntity.k);
    }
}
