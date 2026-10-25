package app.chalo.walletframework.wallet.data.mapper;

import app.chalo.extensions.StringExtsKt;
import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.ChaloPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.appmodel.ChaloPayResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.LoadMoneyAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.LoadMoneyResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.QuickPayResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletStatusResponse;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletOneAppModelToAnotherAppModelMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10957a;
        public static final /* synthetic */ int[] b;

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
            f10957a = iArr;
            int[] iArr2 = new int[WalletStatusResponse.values().length];
            try {
                iArr2[WalletStatusResponse.FULL_KYC_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WalletStatusResponse.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WalletStatusResponse.RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletStatusResponse.BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public static final LoadMoneyAppModel a(LoadMoneyResponseAppModel loadMoneyResponseAppModel, String userId, String walletId) {
        Intrinsics.i(loadMoneyResponseAppModel, "<this>");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        return new LoadMoneyAppModel(loadMoneyResponseAppModel.f11005a, loadMoneyResponseAppModel.b, loadMoneyResponseAppModel.c, loadMoneyResponseAppModel.d, loadMoneyResponseAppModel.e, loadMoneyResponseAppModel.f, userId, walletId);
    }

    public static final WalletAppModel b(WalletResponseAppModel walletResponseAppModel, CachedWalletStatus cachedWalletStatus) {
        Intrinsics.i(walletResponseAppModel, "<this>");
        Intrinsics.i(cachedWalletStatus, "cachedWalletStatus");
        String str = walletResponseAppModel.g;
        int i = WhenMappings.f10957a[((str == null || str.length() == 0) ? WalletType.SEMI_CLOSED : WalletType.CLOSED).ordinal()];
        if (i == 1) {
            return new WalletAppModel.SemiClosedLoop(walletResponseAppModel.f11014a, walletResponseAppModel.b, cachedWalletStatus, walletResponseAppModel.d, walletResponseAppModel.e, walletResponseAppModel.f);
        }
        if (i == 2) {
            return new WalletAppModel.ClosedLoop(walletResponseAppModel.f11014a, walletResponseAppModel.b, cachedWalletStatus, walletResponseAppModel.d, walletResponseAppModel.e, walletResponseAppModel.f, StringExtsKt.b(str, ""));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final WalletTransactionAppModel c(ChaloPayResponseAppModel chaloPayResponseAppModel, String walletId, String userId) {
        WalletTransactionStatus walletTransactionStatus;
        Intrinsics.i(chaloPayResponseAppModel, "<this>");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(userId, "userId");
        String str = chaloPayResponseAppModel.c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        WalletTransactionType walletTransactionType = WalletTransactionType.CHALO_PAY;
        String str3 = chaloPayResponseAppModel.f11002a;
        int i = chaloPayResponseAppModel.b;
        ChaloPayOrderStatus chaloPayOrderStatus = chaloPayResponseAppModel.e;
        Intrinsics.i(chaloPayOrderStatus, "<this>");
        int i2 = WalletAndQuickPayStatusMapperKt.WhenMappings.c[chaloPayOrderStatus.ordinal()];
        if (i2 == 1) {
            walletTransactionStatus = WalletTransactionStatus.PROCESSING;
        } else if (i2 == 2) {
            walletTransactionStatus = WalletTransactionStatus.SUCCESS;
        } else if (i2 == 3) {
            walletTransactionStatus = WalletTransactionStatus.FAILED;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            walletTransactionStatus = WalletTransactionStatus.REFUNDED;
        }
        return new WalletTransactionAppModel(str2, walletTransactionType, walletId, userId, str3, i, walletTransactionStatus, chaloPayResponseAppModel.d);
    }

    public static final WalletTransactionAppModel d(LoadMoneyResponseAppModel loadMoneyResponseAppModel, String walletId, String userId) {
        WalletTransactionStatus walletTransactionStatus;
        Intrinsics.i(loadMoneyResponseAppModel, "<this>");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(userId, "userId");
        String str = loadMoneyResponseAppModel.d;
        WalletTransactionType walletTransactionType = WalletTransactionType.LOAD_MONEY;
        String str2 = loadMoneyResponseAppModel.f11005a;
        int i = loadMoneyResponseAppModel.b;
        LoadMoneyOrderStatus loadMoneyOrderStatus = loadMoneyResponseAppModel.e;
        Intrinsics.i(loadMoneyOrderStatus, "<this>");
        int i2 = WalletAndQuickPayStatusMapperKt.WhenMappings.f10955a[loadMoneyOrderStatus.ordinal()];
        if (i2 == 1) {
            walletTransactionStatus = WalletTransactionStatus.PROCESSING;
        } else if (i2 == 2) {
            walletTransactionStatus = WalletTransactionStatus.SUCCESS;
        } else if (i2 == 3) {
            walletTransactionStatus = WalletTransactionStatus.FAILED;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            walletTransactionStatus = WalletTransactionStatus.REFUNDED;
        }
        return new WalletTransactionAppModel(str, walletTransactionType, walletId, userId, str2, i, walletTransactionStatus, loadMoneyResponseAppModel.c);
    }

    public static final WalletTransactionAppModel e(QuickPayResponseAppModel quickPayResponseAppModel, String walletId, String userId) {
        WalletTransactionStatus walletTransactionStatus;
        Intrinsics.i(quickPayResponseAppModel, "<this>");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(userId, "userId");
        String str = quickPayResponseAppModel.e;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        WalletTransactionType walletTransactionType = WalletTransactionType.QUICK_PAY;
        String str3 = quickPayResponseAppModel.f11006a;
        int i = quickPayResponseAppModel.b;
        QuickPayOrderStatus quickPayOrderStatus = quickPayResponseAppModel.g;
        Intrinsics.i(quickPayOrderStatus, "<this>");
        int i2 = WalletAndQuickPayStatusMapperKt.WhenMappings.b[quickPayOrderStatus.ordinal()];
        if (i2 == 1) {
            walletTransactionStatus = WalletTransactionStatus.PROCESSING;
        } else if (i2 == 2) {
            walletTransactionStatus = WalletTransactionStatus.SUCCESS;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            walletTransactionStatus = WalletTransactionStatus.REFUNDED;
        }
        return new WalletTransactionAppModel(str2, walletTransactionType, walletId, userId, str3, i, walletTransactionStatus, quickPayResponseAppModel.d);
    }
}
