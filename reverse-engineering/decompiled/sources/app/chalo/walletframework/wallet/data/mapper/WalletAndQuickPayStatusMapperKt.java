package app.chalo.walletframework.wallet.data.mapper;

import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.ChaloPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletAndQuickPayStatusMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10955a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[LoadMoneyOrderStatus.values().length];
            try {
                iArr[LoadMoneyOrderStatus.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadMoneyOrderStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadMoneyOrderStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoadMoneyOrderStatus.REFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10955a = iArr;
            int[] iArr2 = new int[QuickPayOrderStatus.values().length];
            try {
                iArr2[QuickPayOrderStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[QuickPayOrderStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[QuickPayOrderStatus.REFUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[ChaloPayOrderStatus.values().length];
            try {
                iArr3[ChaloPayOrderStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ChaloPayOrderStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ChaloPayOrderStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ChaloPayOrderStatus.REFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
            int[] iArr4 = new int[WalletTransactionStatus.values().length];
            try {
                iArr4[WalletTransactionStatus.UNSYNCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[WalletTransactionStatus.PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[WalletTransactionStatus.REFUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[WalletTransactionStatus.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[WalletTransactionStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            d = iArr4;
        }
    }
}
