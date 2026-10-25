package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloHorizontalImagesViewKt;
import app.chalo.home.nearbytrips.ui.StopNearbyTripsCardKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19121a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ qh(Modifier modifier, List list, Function1 function1, int i, int i2) {
        this.f19121a = i2;
        this.b = modifier;
        this.c = list;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19121a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ChaloBusScreenUIKt.b(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 1:
                ChaloHorizontalImagesViewKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 2:
                ChaloHorizontalImagesViewKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 3:
                PbBulkBookingRideDetailsScreenKt.p(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 4:
                PostValidationScreenKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 5:
                PremiumBusProductModificationReasonsScreenKt.e(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 6:
                RegularBusStopNearbyTripsCardKt.c(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 7:
                StopNearbyTripsCardKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            default:
                TripPlannerResultsScreenKt.q(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ qh(List list, Modifier modifier, Function1 function1, int i) {
        this.f19121a = 0;
        this.c = list;
        this.b = modifier;
        this.d = function1;
        this.e = i;
    }

    public /* synthetic */ qh(List list, Function1 function1, Modifier modifier, int i, int i2) {
        this.f19121a = i2;
        this.c = list;
        this.d = function1;
        this.b = modifier;
        this.e = i;
    }
}
