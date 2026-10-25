package defpackage;

import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.ChaloHeaderTextComposableKt;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.ui.chalobus.ChaloBusSearchFieldWithSwapButtonCardKt;
import app.chalo.home.ui.common.TabHeaderKt;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainScreenKt;
import app.chalo.instantticket.ui.instantticketscreen.compose.PaymentBottomSheetComposableKt;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.PbLandingScreenRouteSearchKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17482a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ kb(int i, int i2, Function0 function0) {
        this.f17482a = i2;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f17482a) {
            case 0:
                num.intValue();
                BleValidationScreen_androidKt.K(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                num.intValue();
                CardInfoLandingScreenKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                num.intValue();
                CardInfoLandingScreenKt.h(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                num.intValue();
                ChaloBusSearchFieldWithSwapButtonCardKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                num.intValue();
                ChaloCardTransactionsScreenKt.k(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                num.getClass();
                ChaloCardTransactionsScreenKt.c(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 6:
                num.getClass();
                ChaloHeaderTextComposableKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 7:
                return ExposedDropdownMenu_androidKt.OnPlatformWindowBoundsChange$lambda$1(this.b, this.c, composer, num.intValue());
            case 8:
                num.intValue();
                FareDetailsMainScreenKt.c(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 9:
                num.intValue();
                NearbyStopsMapScreenKt.f(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 10:
                num.intValue();
                PaymentBottomSheetComposableKt.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 11:
                num.intValue();
                PbBulkBookingRideDetailsScreenKt.k(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 12:
                num.intValue();
                PbLandingScreenRouteSearchKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 13:
                num.intValue();
                PremiumBusStopSelectionScreenKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 14:
                num.intValue();
                PremiumBusStopSelectionScreenKt.o(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 15:
                num.intValue();
                TabHeaderKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            default:
                num.intValue();
                UniversalPickerComposableKt.f(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }
}
