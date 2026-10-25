package defpackage;

import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.LiveSeatAvailabilityBottomSheetCtaType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionIntent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19897a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w60(int i, String str, Function1 function1) {
        this.f19897a = i;
        this.b = function1;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19897a) {
            case 0:
                this.b.invoke(new GroupTicketLegSelectionIntent.OnFareInfoToolTipDismissed(this.c));
                break;
            case 1:
                this.b.invoke(new RouteDetailsIntent.LiveSeatAvailabilityBottomSheetCtaClicked(new LiveSeatAvailabilityBottomSheetCtaType.ShowMoreInfo(this.c)));
                break;
            case 2:
                this.b.invoke(this.c);
                break;
            case 3:
                this.b.invoke(this.c);
                break;
            case 4:
                this.b.invoke(this.c);
                break;
            case 5:
                this.b.invoke(this.c);
                break;
            case 6:
                this.b.invoke(this.c);
                break;
            case 7:
                this.b.invoke(new PremiumBusChangeStopIntent.DirectionsClickedIntent(this.c));
                break;
            case 8:
                this.b.invoke(this.c);
                break;
            case 9:
                this.b.invoke(new HomeScreenViewIntent.TitoRideDetailInfoCardClickedIntent(this.c));
                break;
            default:
                this.b.invoke(new TripPlannerDetailsIntent.BuyTicketClickedIntent(this.c));
                break;
        }
        return Unit.f17538a;
    }
}
