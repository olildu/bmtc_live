package app.chalo.walletframework.wallet.data.mapper;

import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletEntityToAppModelMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10956a;

        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.SEMI_CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10956a = iArr;
        }
    }

    public static final WalletAppModel a(WalletEntity walletEntity) {
        Intrinsics.i(walletEntity, "<this>");
        int i = WhenMappings.f10956a[walletEntity.c.ordinal()];
        if (i == 1) {
            String str = walletEntity.b;
            int i2 = walletEntity.f;
            return new WalletAppModel.SemiClosedLoop(str, walletEntity.f11032a, walletEntity.e, i2, walletEntity.g, walletEntity.h);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = walletEntity.b;
        int i3 = walletEntity.f;
        return new WalletAppModel.ClosedLoop(str2, walletEntity.f11032a, walletEntity.e, i3, walletEntity.g, walletEntity.h, walletEntity.d);
    }

    public static final WalletTransactionAppModel b(WalletTransactionEntity walletTransactionEntity) {
        Intrinsics.i(walletTransactionEntity, "<this>");
        String str = walletTransactionEntity.e;
        String str2 = walletTransactionEntity.c;
        int i = walletTransactionEntity.f;
        return new WalletTransactionAppModel(walletTransactionEntity.f11033a, walletTransactionEntity.b, str2, walletTransactionEntity.d, str, i, walletTransactionEntity.g, walletTransactionEntity.h);
    }
}
