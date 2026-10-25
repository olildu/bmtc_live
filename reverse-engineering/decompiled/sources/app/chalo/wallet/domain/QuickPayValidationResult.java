package app.chalo.wallet.domain;

import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/wallet/domain/QuickPayValidationResult;", "", "WalletNotFound", "UserNotFound", "GeneralError", "InsufficientBalance", InitializationStatus.SUCCESS, "Lapp/chalo/wallet/domain/QuickPayValidationResult$GeneralError;", "Lapp/chalo/wallet/domain/QuickPayValidationResult$InsufficientBalance;", "Lapp/chalo/wallet/domain/QuickPayValidationResult$Success;", "Lapp/chalo/wallet/domain/QuickPayValidationResult$UserNotFound;", "Lapp/chalo/wallet/domain/QuickPayValidationResult$WalletNotFound;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QuickPayValidationResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/QuickPayValidationResult$GeneralError;", "Lapp/chalo/wallet/domain/QuickPayValidationResult;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GeneralError extends QuickPayValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GeneralError f10778a = new GeneralError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GeneralError);
        }

        public final int hashCode() {
            return -1002811252;
        }

        public final String toString() {
            return "GeneralError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/QuickPayValidationResult$InsufficientBalance;", "Lapp/chalo/wallet/domain/QuickPayValidationResult;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InsufficientBalance extends QuickPayValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10779a;

        public InsufficientBalance(long j) {
            this.f10779a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InsufficientBalance) && this.f10779a == ((InsufficientBalance) obj).f10779a;
        }

        public final int hashCode() {
            long j = this.f10779a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f10779a, "InsufficientBalance(remainingBalance=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/QuickPayValidationResult$Success;", "Lapp/chalo/wallet/domain/QuickPayValidationResult;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends QuickPayValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletAppModel f10780a;
        public final long b;

        public Success(WalletAppModel wallet, long j) {
            Intrinsics.i(wallet, "wallet");
            this.f10780a = wallet;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.d(this.f10780a, success.f10780a) && this.b == success.b;
        }

        public final int hashCode() {
            int iHashCode = this.f10780a.hashCode() * 31;
            long j = this.b;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "Success(wallet=" + this.f10780a + ", remainingBalance=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/QuickPayValidationResult$UserNotFound;", "Lapp/chalo/wallet/domain/QuickPayValidationResult;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserNotFound extends QuickPayValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserNotFound f10781a = new UserNotFound();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserNotFound);
        }

        public final int hashCode() {
            return -1678228506;
        }

        public final String toString() {
            return "UserNotFound";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/QuickPayValidationResult$WalletNotFound;", "Lapp/chalo/wallet/domain/QuickPayValidationResult;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WalletNotFound extends QuickPayValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WalletNotFound f10782a = new WalletNotFound();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WalletNotFound);
        }

        public final int hashCode() {
            return 558902036;
        }

        public final String toString() {
            return "WalletNotFound";
        }
    }
}
