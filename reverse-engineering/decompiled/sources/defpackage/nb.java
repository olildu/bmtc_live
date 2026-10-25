package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.nearbytrips.ui.StopNearbyTripsCardKt;
import app.chalo.home.ui.compose.PlotlineWidgetToResolveWhiteBackgroundIssueForiOSInHomeScreenTabsKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposablesKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTicketActivationMoreOptionsListKt;
import app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreenKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18469a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ nb(Modifier modifier, String str, int i, int i2) {
        this.f18469a = i2;
        this.b = modifier;
        this.c = str;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f18469a) {
            case 0:
                num.intValue();
                BleValidationScreen_androidKt.E(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 1:
                num.getClass();
                CardInfoLandingScreenKt.f(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 2:
                num.getClass();
                ChaloCardComposablesKt.c(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 3:
                num.getClass();
                JourneyDetailsBottomSheetKt.e(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 4:
                num.getClass();
                PayForTicketScreenKt.c(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 5:
                num.intValue();
                PlotlineWidgetToResolveWhiteBackgroundIssueForiOSInHomeScreenTabsKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 6:
                num.intValue();
                PlotlineWidgetToResolveWhiteBackgroundIssueForiOSInHomeScreenTabsKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 7:
                num.getClass();
                PremiumBusTicketActivationMoreOptionsListKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 8:
                num.getClass();
                RegularBusStopNearbyTripsCardKt.d(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 9:
                num.getClass();
                StopNearbyTripsCardKt.b(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 10:
                num.getClass();
                TripPlannerDetailsBusLegCardKt.h(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            default:
                num.getClass();
                TripPlannerResultsScreenKt.g(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ nb(String str, Modifier modifier, int i, int i2) {
        this.f18469a = i2;
        this.c = str;
        this.b = modifier;
        this.d = i;
    }
}
