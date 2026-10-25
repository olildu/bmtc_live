package app.chalo.walletframework.wallet.data.model;

import app.chalo.walletframework.wallet.domain.WalletSyncAttemptFailureReason;
import app.chalo.walletframework.wallet.domain.WalletSyncFailureReason;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletStatusKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10958a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[NoWalletStatus.values().length];
            try {
                iArr[NoWalletStatus.DOES_NOT_EXIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NoWalletStatus.WALLET_CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NoWalletStatus.WALLET_FETCH_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NoWalletStatus.KYC_INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10958a = iArr;
            int[] iArr2 = new int[CachedWalletStatus.values().length];
            try {
                iArr2[CachedWalletStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CachedWalletStatus.FULL_KYC_NEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CachedWalletStatus.BLOCKED_FOR_BACKEND_RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CachedWalletStatus.BLOCKED_USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CachedWalletStatus.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CachedWalletStatus.WALLET_TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CachedWalletStatus.KYC_INITIATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
            int[] iArr3 = new int[WalletSyncFailureReason.values().length];
            try {
                iArr3[WalletSyncFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[WalletSyncFailureReason.KYC_NOT_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[WalletSyncFailureReason.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[WalletSyncFailureReason.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[WalletSyncFailureReason.WALLET_TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[WalletSyncFailureReason.API_FETCH_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr4 = new int[WalletSyncAttemptFailureReason.values().length];
            try {
                iArr4[WalletSyncAttemptFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[WalletSyncAttemptFailureReason.KYC_NOT_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[WalletSyncAttemptFailureReason.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[WalletSyncAttemptFailureReason.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[WalletSyncAttemptFailureReason.WALLET_TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[WalletSyncAttemptFailureReason.SYNC_API_FETCH_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[WalletSyncAttemptFailureReason.NO_INFORMATION_AVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            c = iArr4;
        }
    }

    public static final boolean a(WalletStatus walletStatus) {
        Intrinsics.i(walletStatus, "<this>");
        return walletStatus == WalletStatus.USER_NOT_LOGGED_IN || walletStatus == WalletStatus.WALLET_FETCH_PENDING || walletStatus == WalletStatus.DOES_NOT_EXIST || walletStatus == WalletStatus.FULL_KYC_NEEDED || walletStatus == WalletStatus.KYC_INITIATED;
    }

    public static final WalletStatus b(CachedWalletStatus cachedWalletStatus) {
        Intrinsics.i(cachedWalletStatus, "<this>");
        switch (WhenMappings.b[cachedWalletStatus.ordinal()]) {
            case 1:
                return WalletStatus.ACTIVE;
            case 2:
                return WalletStatus.FULL_KYC_NEEDED;
            case 3:
                return WalletStatus.BLOCKED_FOR_BACKEND_RECLAIM;
            case 4:
                return WalletStatus.BLOCKED_USER;
            case 5:
                return WalletStatus.BLOCKED_FOR_APP_RECLAIM;
            case 6:
                return WalletStatus.WALLET_TIMED_OUT;
            case 7:
                return WalletStatus.KYC_INITIATED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final WalletStatus c(NoWalletStatus noWalletStatus) {
        Intrinsics.i(noWalletStatus, "<this>");
        int i = WhenMappings.f10958a[noWalletStatus.ordinal()];
        if (i == 1) {
            return WalletStatus.DOES_NOT_EXIST;
        }
        if (i == 2 || i == 3) {
            return WalletStatus.WALLET_FETCH_PENDING;
        }
        if (i == 4) {
            return WalletStatus.KYC_INITIATED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final WalletStatus d(WalletSyncAttemptFailureReason walletSyncAttemptFailureReason) {
        Intrinsics.i(walletSyncAttemptFailureReason, "<this>");
        switch (WhenMappings.c[walletSyncAttemptFailureReason.ordinal()]) {
            case 1:
                return WalletStatus.USER_NOT_LOGGED_IN;
            case 2:
                return WalletStatus.DOES_NOT_EXIST;
            case 3:
                return WalletStatus.BLOCKED_FOR_APP_RECLAIM;
            case 4:
                return WalletStatus.CHALO_TIME_UNAVAILABLE;
            case 5:
                return WalletStatus.WALLET_TIMED_OUT;
            case 6:
            case 7:
                throw new IllegalArgumentException("Cannot convert API_FETCH_FAILED to a WalletStatus. Fetch it from db instead");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
