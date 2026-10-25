package app.chalo.quickpay.partialchangehandler.tripamount;

import app.chalo.constants.Source;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "", "ViewCreatedIntent", "NextIntent", "PrerequisitesIntent", "ValidateIntent", "QuickPayHistoryClickedIntent", "NavigateToWalletBalanceIntent", "QuickPayBottomSheetPayClickedIntent", "OpenTncLinkIntent", "OnStartIntent", "OnBottomSheetDismissIntent", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$NavigateToWalletBalanceIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$NextIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$OnBottomSheetDismissIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$OnStartIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$OpenTncLinkIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$PrerequisitesIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$QuickPayBottomSheetPayClickedIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$QuickPayHistoryClickedIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$ValidateIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$ViewCreatedIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QuickpayTripAmountIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$NavigateToWalletBalanceIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToWalletBalanceIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToWalletBalanceIntent f8873a = new NavigateToWalletBalanceIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$NextIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextIntent f8874a = new NextIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NextIntent);
        }

        public final int hashCode() {
            return 657689782;
        }

        public final String toString() {
            return "NextIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$OnBottomSheetDismissIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBottomSheetDismissIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBottomSheetDismissIntent f8875a = new OnBottomSheetDismissIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBottomSheetDismissIntent);
        }

        public final int hashCode() {
            return -415218568;
        }

        public final String toString() {
            return "OnBottomSheetDismissIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$OnStartIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStartIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnStartIntent f8876a = new OnStartIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnStartIntent);
        }

        public final int hashCode() {
            return -322919528;
        }

        public final String toString() {
            return "OnStartIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$OpenTncLinkIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenTncLinkIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenTncLinkIntent f8877a = new OpenTncLinkIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenTncLinkIntent);
        }

        public final int hashCode() {
            return -1086803986;
        }

        public final String toString() {
            return "OpenTncLinkIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$PrerequisitesIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PrerequisitesIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrerequisitesIntent f8878a = new PrerequisitesIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrerequisitesIntent);
        }

        public final int hashCode() {
            return 1351377938;
        }

        public final String toString() {
            return "PrerequisitesIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$QuickPayBottomSheetPayClickedIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPayBottomSheetPayClickedIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QuickPayBottomSheetPayClickedIntent f8879a = new QuickPayBottomSheetPayClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QuickPayBottomSheetPayClickedIntent);
        }

        public final int hashCode() {
            return 906775565;
        }

        public final String toString() {
            return "QuickPayBottomSheetPayClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$QuickPayHistoryClickedIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class QuickPayHistoryClickedIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QuickPayHistoryClickedIntent f8880a = new QuickPayHistoryClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$ValidateIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidateIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8881a;
        public final boolean b;

        public ValidateIntent(String str, boolean z) {
            this.f8881a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidateIntent)) {
                return false;
            }
            ValidateIntent validateIntent = (ValidateIntent) obj;
            return Intrinsics.d(this.f8881a, validateIntent.f8881a) && this.b == validateIntent.b;
        }

        public final int hashCode() {
            String str = this.f8881a;
            return ((str == null ? 0 : str.hashCode()) * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return xs.k("ValidateIntent(amount=", this.f8881a, ", shouldTriggerNextAutomatically=", ")", this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent$ViewCreatedIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreatedIntent extends QuickpayTripAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f8882a;
        public final boolean b;
        public final String c;
        public final WalletTypeIdentifier d;

        public ViewCreatedIntent(Source source, boolean z, String str, WalletTypeIdentifier walletTypeIdentifier) {
            this.f8882a = source;
            this.b = z;
            this.c = str;
            this.d = walletTypeIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewCreatedIntent)) {
                return false;
            }
            ViewCreatedIntent viewCreatedIntent = (ViewCreatedIntent) obj;
            return this.f8882a == viewCreatedIntent.f8882a && this.b == viewCreatedIntent.b && Intrinsics.d(this.c, viewCreatedIntent.c) && Intrinsics.d(this.d, viewCreatedIntent.d);
        }

        public final int hashCode() {
            Source source = this.f8882a;
            int iHashCode = (((source == null ? 0 : source.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31;
            String str = this.c;
            return this.d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ViewCreatedIntent(source=" + this.f8882a + ", isFromCheckout=" + this.b + ", tripAmountInPaisa=" + this.c + ", walletTypeIdentifier=" + this.d + ")";
        }
    }
}
