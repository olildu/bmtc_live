package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.ads.NativeAdViewKt;
import app.chalo.ads.NativeInlineAdTemplatesKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.home.nearbytrips.ui.StopNearbyTripsCardKt;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.ui.chalobus.RidePreferenceBannerUIKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsShimmerViewKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.ShimmerViewsKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt;
import app.chalo.metro.ui.landing.compose.MetroLandingScreenUIKt;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.pendingrecharge.compose.PendingRechargeScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductsSelectionScreenShimmerKt;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreenKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import com.arkivanov.decompose.extensions.compose.utils.InputConsumingOverlayKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20184a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;

    public /* synthetic */ zc(Modifier modifier, int i, int i2) {
        this.f20184a = i2;
        this.b = modifier;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20184a;
        Unit unit = Unit.f17538a;
        int i2 = this.c;
        Modifier modifier = this.b;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                return BoxKt.Box$lambda$1(modifier, i2, composer, num.intValue());
            case 1:
                num.getClass();
                CardInfoLandingScreenKt.c(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 2:
                num.getClass();
                ChaloCircularLoadingBoxKt.a(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 3:
                num.getClass();
                ChaloSpacersKt.r(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 4:
                num.getClass();
                CityLocationSelectionScreenKt.g(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 5:
                num.getClass();
                CitySelectionUniversalPickerScreenKt.b(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 6:
                num.getClass();
                CitySelectionUniversalPickerScreenKt.a(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 7:
                num.getClass();
                FareDetailsShimmerViewKt.a(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 8:
                num.intValue();
                InputConsumingOverlayKt.a(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 9:
                num.getClass();
                MetroLandingScreenUIKt.f(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 10:
                num.getClass();
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                NativeAdViewKt.c(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 11:
                num.getClass();
                NativeInlineAdTemplatesKt.b(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 12:
                num.getClass();
                NearbyStopsMapScreenKt.b(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 13:
                num.getClass();
                productbooking_release.b(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 14:
                num.getClass();
                PayForTicketScreenKt.e(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 15:
                num.getClass();
                PbBulkBookingRideDetailsScreenKt.m(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 16:
                num.getClass();
                PendingRechargeScreenKt.a(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 17:
                num.getClass();
                PremiumBusProductModificationReasonsScreenKt.b(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 18:
                num.getClass();
                PremiumBusProductsSelectionScreenShimmerKt.b(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 19:
                num.getClass();
                PremiumBusProductsSelectionScreenShimmerKt.a(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 20:
                num.getClass();
                PremiumBusSlotSelectionUiStateKt.b(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 21:
                num.getClass();
                PremiumBusSlotSelectionUiStateKt.v(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 22:
                num.intValue();
                RegularBusStopNearbyTripsCardKt.o(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 23:
                num.getClass();
                RidePreferenceBannerUIKt.d(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 24:
                num.getClass();
                ShimmerViewsKt.a(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 25:
                num.getClass();
                StopNearbyTripsCardKt.e(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 26:
                num.intValue();
                StopTripDetailsScreenKt.f(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 27:
                return TimePickerKt.DisplaySeparator$lambda$54(modifier, i2, composer, num.intValue());
            case 28:
                num.getClass();
                TripPlannerDetailsBusLegCardKt.e(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            default:
                num.getClass();
                TripPlannerDetailsScreenKt.g(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
        }
    }
}
