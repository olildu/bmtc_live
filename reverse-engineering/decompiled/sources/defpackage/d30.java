package defpackage;

import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.multimodalticket.ui.GroupTicketJourneySelectionMode;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionIntent;
import app.chalo.productsummary.ui.ticket.ProductSummaryBannerCtaType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15424a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ d30(Function1 function1, int i) {
        this.f15424a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15424a) {
            case 0:
                this.b.invoke(FareDetailsIntent.NavigateToHomeScreenIntent.f3935a);
                break;
            case 1:
                this.b.invoke(FareDetailsIntent.RetryFareFetchClicked.f3943a);
                break;
            case 2:
                this.b.invoke(new FareDetailsIntent.OnPayButtonClicked());
                break;
            case 3:
                this.b.invoke(FareDetailsIntent.OnReadMoreFareNoteIntent.f3938a);
                break;
            case 4:
                this.b.invoke(FareDetailsIntent.OnTncDialoguePositiveBtnClickedIntent.f3941a);
                break;
            case 5:
                this.b.invoke(ProductSummaryBannerCtaType.USE_PRODUCT_NOW);
                break;
            case 6:
                this.b.invoke(ProductSummaryBannerCtaType.USE_PRODUCT_NOW);
                break;
            case 7:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 8:
                this.b.invoke(ProductSummaryBannerCtaType.USE_PRODUCT_NOW);
                break;
            case 9:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 10:
                this.b.invoke(ProductSummaryBannerCtaType.USE_PRODUCT_NOW);
                break;
            case 11:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 12:
                this.b.invoke(ProductSummaryBannerCtaType.USE_PRODUCT_NOW);
                break;
            case 13:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 14:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 15:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 16:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 17:
                this.b.invoke(ProductSummaryBannerCtaType.USE_PRODUCT_NOW);
                break;
            case 18:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 19:
                this.b.invoke(ProductSummaryBannerCtaType.NONE);
                break;
            case 20:
                this.b.invoke(ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN);
                break;
            case 21:
                this.b.invoke(ProductSummaryBannerCtaType.USE_PRODUCT_NOW);
                break;
            case 22:
                this.b.invoke(ProductSummaryBannerCtaType.USE_PRODUCT_NOW);
                break;
            case 23:
                this.b.invoke(new GroupTicketLegSelectionIntent.OnJourneySelectionModeSelected(GroupTicketJourneySelectionMode.FullJourney));
                break;
            case 24:
                this.b.invoke(new GroupTicketLegSelectionIntent.OnJourneySelectionModeSelected(GroupTicketJourneySelectionMode.IndividualSteps));
                break;
            case 25:
                this.b.invoke(new GroupTicketLegSelectionIntent.OnJourneySelectionModeSelected(GroupTicketJourneySelectionMode.IndividualSteps));
                break;
            case 26:
                this.b.invoke(GroupTicketLegSelectionIntent.OnDismissBottomSheetIntent.f5936a);
                break;
            case 27:
                this.b.invoke(new GroupTicketLegSelectionIntent.OnJourneySelectionModeSelected(GroupTicketJourneySelectionMode.FullJourney));
                break;
            case 28:
                this.b.invoke(GroupTicketLegSelectionIntent.OnDismissBottomSheetIntent.f5936a);
                break;
            default:
                this.b.invoke(GroupTicketLegSelectionIntent.OnTryAgainBtnClickedIntent.f5944a);
                break;
        }
        return Unit.f17538a;
    }
}
