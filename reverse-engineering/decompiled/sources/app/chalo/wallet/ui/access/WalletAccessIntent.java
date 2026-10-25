package app.chalo.wallet.ui.access;

import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "", "InitialisationIntent", "CheckWalletStatus", "NotActivatedProceedClicked", "FinishFlowLaterClicked", "LoadMoneyClicked", "LoadMoneyLaterClicked", "UserBlockedKnowMoreClicked", "BackendReclaimKnowMoreClicked", "FullKYCKnowMoreClicked", "RetryRefreshWalletClicked", "AppReclaimRetryClicked", "LoginRetryClicked", "TransferChaloPayClicked", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$AppReclaimRetryClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$BackendReclaimKnowMoreClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$CheckWalletStatus;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$FinishFlowLaterClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$FullKYCKnowMoreClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$InitialisationIntent;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$LoadMoneyClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$LoadMoneyLaterClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$LoginRetryClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$NotActivatedProceedClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$RetryRefreshWalletClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$TransferChaloPayClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent$UserBlockedKnowMoreClicked;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletAccessIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$AppReclaimRetryClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppReclaimRetryClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AppReclaimRetryClicked f10789a = new AppReclaimRetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppReclaimRetryClicked);
        }

        public final int hashCode() {
            return 125149139;
        }

        public final String toString() {
            return "AppReclaimRetryClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$BackendReclaimKnowMoreClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackendReclaimKnowMoreClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackendReclaimKnowMoreClicked f10790a = new BackendReclaimKnowMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackendReclaimKnowMoreClicked);
        }

        public final int hashCode() {
            return 1205220806;
        }

        public final String toString() {
            return "BackendReclaimKnowMoreClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$CheckWalletStatus;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckWalletStatus extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CheckWalletStatus f10791a = new CheckWalletStatus();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckWalletStatus);
        }

        public final int hashCode() {
            return 2017056807;
        }

        public final String toString() {
            return "CheckWalletStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$FinishFlowLaterClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinishFlowLaterClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FinishFlowLaterClicked f10792a = new FinishFlowLaterClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FinishFlowLaterClicked);
        }

        public final int hashCode() {
            return 1794339272;
        }

        public final String toString() {
            return "FinishFlowLaterClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$FullKYCKnowMoreClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FullKYCKnowMoreClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FullKYCKnowMoreClicked f10793a = new FullKYCKnowMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FullKYCKnowMoreClicked);
        }

        public final int hashCode() {
            return -1078279731;
        }

        public final String toString() {
            return "FullKYCKnowMoreClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$InitialisationIntent;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductFlow f10794a;
        public final boolean b;
        public final WalletTypeIdentifier c;

        public InitialisationIntent(ProductFlow productFlow, boolean z, WalletTypeIdentifier walletTypeIdentifier) {
            Intrinsics.i(productFlow, "productFlow");
            Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
            this.f10794a = productFlow;
            this.b = z;
            this.c = walletTypeIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialisationIntent)) {
                return false;
            }
            InitialisationIntent initialisationIntent = (InitialisationIntent) obj;
            return this.f10794a == initialisationIntent.f10794a && this.b == initialisationIntent.b && Intrinsics.d(this.c, initialisationIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f10794a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            return "InitialisationIntent(productFlow=" + this.f10794a + ", isFullScreen=" + this.b + ", walletTypeIdentifier=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$LoadMoneyClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadMoneyClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadMoneyClicked f10795a = new LoadMoneyClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadMoneyClicked);
        }

        public final int hashCode() {
            return 807214873;
        }

        public final String toString() {
            return "LoadMoneyClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$LoadMoneyLaterClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadMoneyLaterClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadMoneyLaterClicked f10796a = new LoadMoneyLaterClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadMoneyLaterClicked);
        }

        public final int hashCode() {
            return -701192119;
        }

        public final String toString() {
            return "LoadMoneyLaterClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$LoginRetryClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoginRetryClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoginRetryClicked f10797a = new LoginRetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoginRetryClicked);
        }

        public final int hashCode() {
            return -1271390180;
        }

        public final String toString() {
            return "LoginRetryClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$NotActivatedProceedClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotActivatedProceedClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotActivatedProceedClicked f10798a = new NotActivatedProceedClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotActivatedProceedClicked);
        }

        public final int hashCode() {
            return -894468029;
        }

        public final String toString() {
            return "NotActivatedProceedClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$RetryRefreshWalletClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryRefreshWalletClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryRefreshWalletClicked f10799a = new RetryRefreshWalletClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryRefreshWalletClicked);
        }

        public final int hashCode() {
            return -1445237937;
        }

        public final String toString() {
            return "RetryRefreshWalletClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$TransferChaloPayClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TransferChaloPayClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransferChaloPayClicked f10800a = new TransferChaloPayClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TransferChaloPayClicked);
        }

        public final int hashCode() {
            return 114668071;
        }

        public final String toString() {
            return "TransferChaloPayClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessIntent$UserBlockedKnowMoreClicked;", "Lapp/chalo/wallet/ui/access/WalletAccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserBlockedKnowMoreClicked extends WalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserBlockedKnowMoreClicked f10801a = new UserBlockedKnowMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserBlockedKnowMoreClicked);
        }

        public final int hashCode() {
            return -1438833038;
        }

        public final String toString() {
            return "UserBlockedKnowMoreClicked";
        }
    }
}
