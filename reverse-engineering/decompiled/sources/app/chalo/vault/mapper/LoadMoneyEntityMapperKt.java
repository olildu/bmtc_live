package app.chalo.vault.mapper;

import app.chalo.vault.Load_money_table;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"vault_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LoadMoneyEntityMapperKt {
    public static final Load_money_table a(LoadMoneyEntity loadMoneyEntity) {
        Intrinsics.i(loadMoneyEntity, "<this>");
        return new Load_money_table(loadMoneyEntity.b, loadMoneyEntity.c, loadMoneyEntity.f11031a, loadMoneyEntity.d, loadMoneyEntity.e.name(), loadMoneyEntity.f, loadMoneyEntity.g, loadMoneyEntity.h);
    }
}
