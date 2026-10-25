package app.chalo.vault.mapper;

import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/mapper/QuickPayEntityMapper;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayEntityMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final QuickPayEntityMapper f10761a = new QuickPayEntityMapper();

    public static QuickPayEntity a(String status, String transactionId, String paymentMode, String str, String str2, long j, Long l, long j2, String orderId, Long l2, String walletId) {
        Intrinsics.i(status, "status");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(walletId, "walletId");
        return new QuickPayEntity(QuickPayOrderStatus.valueOf(status), transactionId, paymentMode, str, str2, j, l, (int) j2, orderId, l2, walletId);
    }
}
