package defpackage;

import app.chalo.home.ui.history.factory.CtaClickedType;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryViewIntent;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20080a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ y60(Function1 function1, int i) {
        this.f20080a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20080a) {
            case 0:
                this.b.invoke(GroupTicketLegSelectionIntent.OnBottomSheetCancelBtnClickedIntent.f5934a);
                break;
            case 1:
                this.b.invoke(GroupTicketLegSelectionIntent.OnDismissBottomSheetIntent.f5936a);
                break;
            case 2:
                this.b.invoke(GroupTicketLegSelectionIntent.OnProceedBtnClickedIntent.f5943a);
                break;
            case 3:
                this.b.invoke(GroupTicketLegSelectionIntent.OnBackNavIconClickedIntent.f5933a);
                break;
            case 4:
                this.b.invoke(GroupTicketLegSelectionIntent.OnContinueBtnClickedIntent.f5935a);
                break;
            case 5:
                this.b.invoke(GroupTicketSummaryViewIntent.OnBackButtonClicked.f5904a);
                break;
            case 6:
                this.b.invoke(GroupTicketSummaryViewIntent.OnEditTicketsClicked.f5905a);
                break;
            case 7:
                this.b.invoke(GroupTicketSummaryViewIntent.OnRetryPriceDetailsFetchClicked.f5908a);
                break;
            case 8:
                this.b.invoke(GroupTicketSummaryViewIntent.OnPayButtonClicked.f5907a);
                break;
            case 9:
                this.b.invoke(GroupTicketSummaryViewIntent.OnTripDetailsToggleClicked.f5910a);
                break;
            case 10:
                this.b.invoke(GroupTicketSummaryViewIntent.TnCAcceptClickIntent.f5911a);
                break;
            case 11:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 12:
                this.b.invoke(CtaClickedType.VIEW_SUMMARY);
                break;
            case 13:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 14:
                this.b.invoke(CtaClickedType.USE_OR_TRACK);
                break;
            case 15:
                this.b.invoke(CtaClickedType.VIEW_SUMMARY);
                break;
            case 16:
                this.b.invoke(CtaClickedType.VIEW_SUMMARY);
                break;
            case 17:
                this.b.invoke(CtaClickedType.USE_OR_TRACK);
                break;
            case 18:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 19:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 20:
                this.b.invoke(CtaClickedType.USE_OR_TRACK);
                break;
            case 21:
                this.b.invoke(CtaClickedType.VIEW_SUMMARY);
                break;
            case 22:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 23:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 24:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 25:
                this.b.invoke(CtaClickedType.USE_OR_TRACK);
                break;
            case 26:
                this.b.invoke(CtaClickedType.VIEW_SUMMARY);
                break;
            case 27:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 28:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            default:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
        }
        return Unit.f17538a;
    }
}
