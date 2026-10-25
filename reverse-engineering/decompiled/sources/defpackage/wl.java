package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTncSectionKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.home.ui.common.TitoRideDetailsBottomSheetLayoutKt;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import app.chalo.instantticket.ui.faredetails.compose.FareBreakupSectionKt;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsShimmerViewKt;
import app.chalo.instantticket.ui.instantticketscreen.compose.PaymentBottomSheetComposableKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.onboarding.splash.ui.SplashScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionComposablesKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusLandingScreenKt;
import app.chalo.productbooking.common.compose.FareLoadingShimmerKt;
import app.chalo.productsummary.ui.compose.components.ComponentSmallDividerKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.userprofile.ui.compose.UserProfileComposeUtilsKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreen_androidKt;
import com.google.maps.android.compose.MapClickListenersKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19939a;
    public final /* synthetic */ int b;

    public /* synthetic */ wl(int i, int i2) {
        this.f19939a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f19939a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloSpacersKt.w((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ChaloTncSectionKt.c((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ComponentSmallDividerKt.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ComposeUtils_androidKt.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                FareBreakupSectionKt.b((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                FareDetailsShimmerViewKt.b((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                FareLoadingShimmerKt.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                MapClickListenersKt.c((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                MyTicketsScreenUIKt.i((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                MyTicketsScreenUIKt.g((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                PaymentBottomSheetComposableKt.d((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                PbBulkBookingRideDetailsScreenKt.n((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                PremiumBusLandingScreenKt.g((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                PremiumBusSeatSelectionComposablesKt.n((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.i((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.c((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                QRValidationScreen_androidKt.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                SplashScreenKt.b((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                SplashScreenKt.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                SplashScreenKt.d((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                StopTripDetailsScreenKt.l((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                StopTripDetailsScreenKt.j((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                StopTripDetailsScreenKt.n((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                TitoRideDataScreenKt.d((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                TitoRideDetailsBottomSheetLayoutKt.b((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 25:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int i = this.b;
                if (iIntValue == 0) {
                    str = "PL_Bus_Leg_From_Stop_";
                } else {
                    if (iIntValue != iIntValue2) {
                        return null;
                    }
                    str = "PL_Bus_Leg_To_Stop_";
                }
                return vo1.j(i, str);
            case 26:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                int i2 = this.b;
                if (iIntValue3 == 0) {
                    str2 = "PL_Metro_Leg_From_Stop_";
                } else {
                    if (iIntValue3 != iIntValue4) {
                        return null;
                    }
                    str2 = "PL_Metro_Leg_To_Stop_";
                }
                return vo1.j(i2, str2);
            case 27:
                ((Integer) obj2).intValue();
                TripPlannerResultsScreenKt.o((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                TripPlannerResultsScreenKt.v((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                UserProfileComposeUtilsKt.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
