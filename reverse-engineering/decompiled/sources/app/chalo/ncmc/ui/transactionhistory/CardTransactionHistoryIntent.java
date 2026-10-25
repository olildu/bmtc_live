package app.chalo.ncmc.ui.transactionhistory;

import app.chalo.constants.Source;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "", "InitialIntent", "RefreshTransactionHistoryIntent", "RetryIntent", "TransactionClickedIntent", "EmailAllTransactionHistoryClickedIntent", "EmailAllTransactionHistoryDialogDismissed", "UnsyncedRechargeBannerViewMoreClickedIntent", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$EmailAllTransactionHistoryClickedIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$EmailAllTransactionHistoryDialogDismissed;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$InitialIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$RefreshTransactionHistoryIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$RetryIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$TransactionClickedIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$UnsyncedRechargeBannerViewMoreClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CardTransactionHistoryIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$EmailAllTransactionHistoryClickedIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmailAllTransactionHistoryClickedIntent extends CardTransactionHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EmailAllTransactionHistoryClickedIntent f6429a = new EmailAllTransactionHistoryClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmailAllTransactionHistoryClickedIntent);
        }

        public final int hashCode() {
            return -829733343;
        }

        public final String toString() {
            return "EmailAllTransactionHistoryClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$EmailAllTransactionHistoryDialogDismissed;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmailAllTransactionHistoryDialogDismissed extends CardTransactionHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EmailAllTransactionHistoryDialogDismissed f6430a = new EmailAllTransactionHistoryDialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmailAllTransactionHistoryDialogDismissed);
        }

        public final int hashCode() {
            return -1967112897;
        }

        public final String toString() {
            return "EmailAllTransactionHistoryDialogDismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$InitialIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends CardTransactionHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6431a;
        public final Source b;
        public final String c;
        public final String d;

        public InitialIntent(Source source, String cardNumber, String str, String str2) {
            Intrinsics.i(cardNumber, "cardNumber");
            Intrinsics.i(source, "source");
            this.f6431a = cardNumber;
            this.b = source;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialIntent)) {
                return false;
            }
            InitialIntent initialIntent = (InitialIntent) obj;
            return Intrinsics.d(this.f6431a, initialIntent.f6431a) && this.b == initialIntent.b && Intrinsics.d(this.c, initialIntent.c) && Intrinsics.d(this.d, initialIntent.d);
        }

        public final int hashCode() {
            int iF = nf1.f(this.b, this.f6431a.hashCode() * 31, 31);
            String str = this.c;
            int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + 1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialIntent(cardNumber=");
            sb.append(this.f6431a);
            sb.append(", source=");
            sb.append(this.b);
            sb.append(", kitNumber=");
            return r30.i(sb, this.c, ", cardType=", this.d, ", page=1)");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$RefreshTransactionHistoryIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshTransactionHistoryIntent extends CardTransactionHistoryIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshTransactionHistoryIntent);
        }

        public final int hashCode() {
            return -2101668122;
        }

        public final String toString() {
            return "RefreshTransactionHistoryIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$RetryIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryIntent extends CardTransactionHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryIntent f6432a = new RetryIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryIntent);
        }

        public final int hashCode() {
            return -1305243459;
        }

        public final String toString() {
            return "RetryIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$TransactionClickedIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TransactionClickedIntent extends CardTransactionHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardTransactionTypeUiModel f6433a;
        public final String b;

        public TransactionClickedIntent(CardTransactionTypeUiModel cardTransactionType, String cardTransactionId) {
            Intrinsics.i(cardTransactionType, "cardTransactionType");
            Intrinsics.i(cardTransactionId, "cardTransactionId");
            this.f6433a = cardTransactionType;
            this.b = cardTransactionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionClickedIntent)) {
                return false;
            }
            TransactionClickedIntent transactionClickedIntent = (TransactionClickedIntent) obj;
            return this.f6433a == transactionClickedIntent.f6433a && Intrinsics.d(this.b, transactionClickedIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6433a.hashCode() * 31);
        }

        public final String toString() {
            return "TransactionClickedIntent(cardTransactionType=" + this.f6433a + ", cardTransactionId=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent$UnsyncedRechargeBannerViewMoreClickedIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnsyncedRechargeBannerViewMoreClickedIntent extends CardTransactionHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnsyncedRechargeBannerViewMoreClickedIntent f6434a = new UnsyncedRechargeBannerViewMoreClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnsyncedRechargeBannerViewMoreClickedIntent);
        }

        public final int hashCode() {
            return -1966182084;
        }

        public final String toString() {
            return "UnsyncedRechargeBannerViewMoreClickedIntent";
        }
    }
}
