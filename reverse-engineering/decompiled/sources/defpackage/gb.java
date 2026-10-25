package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloTncSectionKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.RidePreferenceBannerUIKt;
import app.chalo.instantticket.ui.faredetails.compose.BottomSheetViewsKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.pendingrecharge.compose.PendingRechargeScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTrackingStateKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15715a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ gb(Modifier modifier, Function0 function0, int i, int i2) {
        this.f15715a = i2;
        this.b = modifier;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f15715a) {
            case 0:
                num.intValue();
                BleValidationScreen_androidKt.L(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 1:
                num.getClass();
                BottomSheetViewsKt.e(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 2:
                num.getClass();
                CardInfoLandingScreenKt.g(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 3:
                num.getClass();
                ChaloBusScreenUIKt.o(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 4:
                num.getClass();
                ChaloTncSectionKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 5:
                num.getClass();
                CityLocationSelectionScreenKt.b(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 6:
                num.getClass();
                CitySelectionUniversalPickerScreenKt.j(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 7:
                num.getClass();
                CitySelectionUniversalPickerScreenKt.k(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 8:
                num.getClass();
                PendingRechargeScreenKt.b(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 9:
                num.getClass();
                PremiumBusTrackingStateKt.c(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 10:
                num.getClass();
                RidePreferenceBannerUIKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            default:
                num.intValue();
                TripPlannerResultsScreenKt.b(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ gb(Function0 function0, Modifier modifier, int i) {
        this.f15715a = 10;
        this.c = function0;
        this.b = modifier;
        this.d = i;
    }
}
