package app.chalo.vault.mapper;

import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/mapper/WalletEntityMapper;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletEntityMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WalletEntityMapper f10763a = new WalletEntityMapper();

    public static WalletEntity a(String userId, String walletId, String agency, String type, String walletStatus, long j, long j2, Long l) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(type, "type");
        Intrinsics.i(walletStatus, "walletStatus");
        return new WalletEntity(userId, walletId, WalletType.valueOf(type), agency, CachedWalletStatus.valueOf(walletStatus), (int) j, j2, l);
    }
}
