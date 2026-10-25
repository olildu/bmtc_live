package app.chalo.ncmc.ui.landing;

import app.chalo.constants.Source;
import defpackage.b3;
import defpackage.dd;
import defpackage.gf;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "", "InitializationIntent", "UseLinkCodeClickedIntent", "RefreshDataClickedIntent", "ShowTransactionHistoryClickedIntent", "BuyNewCardIntent", "OnCardClick", "AddCardClickIntent", "ConfirmationDialogPositiveButtonClick", "ConfirmationDialogNegativeButtonClick", "ChangePinClickIntent", "TapUnavailableBottomSheetOkClickIntent", "CardOperationClicked", "NavigateBackToAllCards", "CardLinkBottomSheetNegativeButtonClicked", "CardInfoBottomsheetDismissButtonClicked", "KnowMoreClicked", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$AddCardClickIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$BuyNewCardIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$CardInfoBottomsheetDismissButtonClicked;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$CardLinkBottomSheetNegativeButtonClicked;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$CardOperationClicked;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$ChangePinClickIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$ConfirmationDialogNegativeButtonClick;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$ConfirmationDialogPositiveButtonClick;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$InitializationIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$KnowMoreClicked;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$NavigateBackToAllCards;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$OnCardClick;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$RefreshDataClickedIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$ShowTransactionHistoryClickedIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$TapUnavailableBottomSheetOkClickIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$UseLinkCodeClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloCardInfoIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$AddCardClickIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddCardClickIntent extends ChaloCardInfoIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddCardClickIntent);
        }

        public final int hashCode() {
            return 1178815218;
        }

        public final String toString() {
            return "AddCardClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$BuyNewCardIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuyNewCardIntent extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BuyNewCardIntent f6345a = new BuyNewCardIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BuyNewCardIntent);
        }

        public final int hashCode() {
            return 1785883429;
        }

        public final String toString() {
            return "BuyNewCardIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$CardInfoBottomsheetDismissButtonClicked;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardInfoBottomsheetDismissButtonClicked extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardInfoBottomsheetDismissButtonClicked f6346a = new CardInfoBottomsheetDismissButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardInfoBottomsheetDismissButtonClicked);
        }

        public final int hashCode() {
            return -296465598;
        }

        public final String toString() {
            return "CardInfoBottomsheetDismissButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$CardLinkBottomSheetNegativeButtonClicked;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardLinkBottomSheetNegativeButtonClicked extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardLinkBottomSheetNegativeButtonClicked f6347a = new CardLinkBottomSheetNegativeButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardLinkBottomSheetNegativeButtonClicked);
        }

        public final int hashCode() {
            return 1693919125;
        }

        public final String toString() {
            return "CardLinkBottomSheetNegativeButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$CardOperationClicked;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardOperationClicked extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloCardOperationType f6348a;

        public CardOperationClicked(ChaloCardOperationType operationType) {
            Intrinsics.i(operationType, "operationType");
            this.f6348a = operationType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardOperationClicked) && Intrinsics.d(this.f6348a, ((CardOperationClicked) obj).f6348a);
        }

        public final int hashCode() {
            return this.f6348a.hashCode();
        }

        public final String toString() {
            return "CardOperationClicked(operationType=" + this.f6348a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$ChangePinClickIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangePinClickIntent extends ChaloCardInfoIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangePinClickIntent);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ChangePinClickIntent(kitNumber=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$ConfirmationDialogNegativeButtonClick;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmationDialogNegativeButtonClick extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmationDialogNegativeButtonClick f6349a = new ConfirmationDialogNegativeButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmationDialogNegativeButtonClick);
        }

        public final int hashCode() {
            return 2130405829;
        }

        public final String toString() {
            return "ConfirmationDialogNegativeButtonClick";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$ConfirmationDialogPositiveButtonClick;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmationDialogPositiveButtonClick extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6350a;
        public final String b;
        public final String c;

        public ConfirmationDialogPositiveButtonClick(String str, String str2, String str3) {
            this.f6350a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmationDialogPositiveButtonClick)) {
                return false;
            }
            ConfirmationDialogPositiveButtonClick confirmationDialogPositiveButtonClick = (ConfirmationDialogPositiveButtonClick) obj;
            return Intrinsics.d(this.f6350a, confirmationDialogPositiveButtonClick.f6350a) && Intrinsics.d(this.b, confirmationDialogPositiveButtonClick.b) && Intrinsics.d(this.c, confirmationDialogPositiveButtonClick.c);
        }

        public final int hashCode() {
            String str = this.f6350a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return vo1.p(dd.e("ConfirmationDialogPositiveButtonClick(cardNumber=", this.f6350a, ", kitNumber=", this.b, ", cardType="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$InitializationIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f6351a;

        public InitializationIntent(Source source) {
            Intrinsics.i(source, "source");
            this.f6351a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f6351a == ((InitializationIntent) obj).f6351a;
        }

        public final int hashCode() {
            return this.f6351a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f6351a, "InitializationIntent(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$KnowMoreClicked;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class KnowMoreClicked extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KnowMoreClicked f6352a = new KnowMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KnowMoreClicked);
        }

        public final int hashCode() {
            return 2057366312;
        }

        public final String toString() {
            return "KnowMoreClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$NavigateBackToAllCards;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateBackToAllCards extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateBackToAllCards f6353a = new NavigateBackToAllCards();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateBackToAllCards);
        }

        public final int hashCode() {
            return -1604089036;
        }

        public final String toString() {
            return "NavigateBackToAllCards";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$OnCardClick;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnCardClick extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6354a;

        public OnCardClick(int i) {
            this.f6354a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCardClick) && this.f6354a == ((OnCardClick) obj).f6354a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF6354a() {
            return this.f6354a;
        }

        public final String toString() {
            return b3.d(this.f6354a, "OnCardClick(cardPosition=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$RefreshDataClickedIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshDataClickedIntent extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloCardInfoRefreshRequestSource f6355a;

        public RefreshDataClickedIntent(ChaloCardInfoRefreshRequestSource source) {
            Intrinsics.i(source, "source");
            this.f6355a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshDataClickedIntent) && this.f6355a == ((RefreshDataClickedIntent) obj).f6355a;
        }

        public final int hashCode() {
            return this.f6355a.hashCode();
        }

        public final String toString() {
            return "RefreshDataClickedIntent(source=" + this.f6355a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$ShowTransactionHistoryClickedIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowTransactionHistoryClickedIntent extends ChaloCardInfoIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowTransactionHistoryClickedIntent);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowTransactionHistoryClickedIntent(cardNumber=null, kitNumber=null, cardType=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$TapUnavailableBottomSheetOkClickIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TapUnavailableBottomSheetOkClickIntent extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TapUnavailableBottomSheetOkClickIntent f6356a = new TapUnavailableBottomSheetOkClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapUnavailableBottomSheetOkClickIntent);
        }

        public final int hashCode() {
            return -600079808;
        }

        public final String toString() {
            return "TapUnavailableBottomSheetOkClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent$UseLinkCodeClickedIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UseLinkCodeClickedIntent extends ChaloCardInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UseLinkCodeClickedIntent f6357a = new UseLinkCodeClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UseLinkCodeClickedIntent);
        }

        public final int hashCode() {
            return -1814376940;
        }

        public final String toString() {
            return "UseLinkCodeClickedIntent";
        }
    }
}
