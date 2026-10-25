package app.chalo.ncmc.ui.cardrechargeamount;

import app.chalo.constants.Source;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "", "InitializationIntent", "OnAmountEnteredIntent", "CardDataFetchErrorActionClickedIntent", "ProceedBtnClickedIntent", "UseLinkCodeClickedIntent", "TncDialogueAccepted", "TncDialogueCancelled", "OnBottomSheetPositiveBtnClicked", "BottomSheetDismissedIntent", "RechargeSuccessPositiveButtonClicked", "RechargeSuccessNegativeButtonClicked", "NavigateToHome", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$BottomSheetDismissedIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$CardDataFetchErrorActionClickedIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$InitializationIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$NavigateToHome;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$OnAmountEnteredIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$OnBottomSheetPositiveBtnClicked;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$ProceedBtnClickedIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$RechargeSuccessNegativeButtonClicked;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$RechargeSuccessPositiveButtonClicked;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$TncDialogueAccepted;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$TncDialogueCancelled;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$UseLinkCodeClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloCardRechargeAmountIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$BottomSheetDismissedIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomSheetDismissedIntent extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissedIntent f6294a = new BottomSheetDismissedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BottomSheetDismissedIntent);
        }

        public final int hashCode() {
            return -1725996735;
        }

        public final String toString() {
            return "BottomSheetDismissedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$CardDataFetchErrorActionClickedIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardDataFetchErrorActionClickedIntent extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardRechargeDataFetchErrorReason f6295a;

        public CardDataFetchErrorActionClickedIntent(CardRechargeDataFetchErrorReason failureReason) {
            Intrinsics.i(failureReason, "failureReason");
            this.f6295a = failureReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardDataFetchErrorActionClickedIntent) && this.f6295a == ((CardDataFetchErrorActionClickedIntent) obj).f6295a;
        }

        public final int hashCode() {
            return this.f6295a.hashCode();
        }

        public final String toString() {
            return "CardDataFetchErrorActionClickedIntent(failureReason=" + this.f6295a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$InitializationIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f6296a;
        public final ChaloCardRechargeAmountFlowType b;

        public InitializationIntent(Source source, ChaloCardRechargeAmountFlowType flowType) {
            Intrinsics.i(source, "source");
            Intrinsics.i(flowType, "flowType");
            this.f6296a = source;
            this.b = flowType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return this.f6296a == initializationIntent.f6296a && Intrinsics.d(this.b, initializationIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6296a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(source=" + this.f6296a + ", flowType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$NavigateToHome;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToHome extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToHome f6297a = new NavigateToHome();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToHome);
        }

        public final int hashCode() {
            return -751459333;
        }

        public final String toString() {
            return "NavigateToHome";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$OnAmountEnteredIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnAmountEnteredIntent extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6298a;

        public OnAmountEnteredIntent(String enteredAmount) {
            Intrinsics.i(enteredAmount, "enteredAmount");
            this.f6298a = enteredAmount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAmountEnteredIntent) && Intrinsics.d(this.f6298a, ((OnAmountEnteredIntent) obj).f6298a);
        }

        public final int hashCode() {
            return this.f6298a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnAmountEnteredIntent(enteredAmount=", this.f6298a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$OnBottomSheetPositiveBtnClicked;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBottomSheetPositiveBtnClicked extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBottomSheetPositiveBtnClicked f6299a = new OnBottomSheetPositiveBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBottomSheetPositiveBtnClicked);
        }

        public final int hashCode() {
            return -1665812151;
        }

        public final String toString() {
            return "OnBottomSheetPositiveBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$ProceedBtnClickedIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedBtnClickedIntent extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedBtnClickedIntent f6300a = new ProceedBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProceedBtnClickedIntent);
        }

        public final int hashCode() {
            return 287191621;
        }

        public final String toString() {
            return "ProceedBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$RechargeSuccessNegativeButtonClicked;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RechargeSuccessNegativeButtonClicked extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RechargeSuccessNegativeButtonClicked f6301a = new RechargeSuccessNegativeButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RechargeSuccessNegativeButtonClicked);
        }

        public final int hashCode() {
            return -295031404;
        }

        public final String toString() {
            return "RechargeSuccessNegativeButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$RechargeSuccessPositiveButtonClicked;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RechargeSuccessPositiveButtonClicked extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RechargeSuccessPositiveButtonClicked f6302a = new RechargeSuccessPositiveButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RechargeSuccessPositiveButtonClicked);
        }

        public final int hashCode() {
            return -595976624;
        }

        public final String toString() {
            return "RechargeSuccessPositiveButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$TncDialogueAccepted;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncDialogueAccepted extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TncDialogueAccepted f6303a = new TncDialogueAccepted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TncDialogueAccepted);
        }

        public final int hashCode() {
            return 1422282168;
        }

        public final String toString() {
            return "TncDialogueAccepted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$TncDialogueCancelled;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncDialogueCancelled extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TncDialogueCancelled f6304a = new TncDialogueCancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TncDialogueCancelled);
        }

        public final int hashCode() {
            return -559530656;
        }

        public final String toString() {
            return "TncDialogueCancelled";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent$UseLinkCodeClickedIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UseLinkCodeClickedIntent extends ChaloCardRechargeAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UseLinkCodeClickedIntent f6305a = new UseLinkCodeClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UseLinkCodeClickedIntent);
        }

        public final int hashCode() {
            return 2057021893;
        }

        public final String toString() {
            return "UseLinkCodeClickedIntent";
        }
    }
}
