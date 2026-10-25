package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.ChaloUserReviewFormComposableKt;
import app.chalo.compose.ErrorTextKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.instantticket.ui.faredetails.compose.FareBreakupSectionKt;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsCTAViewKt;
import app.chalo.instantticket.ui.faredetails.compose.FareRouteAndStopDetailsViewKt;
import app.chalo.instantticket.ui.faredetails.compose.PassengerDetailsViewKt;
import app.chalo.instantticket.ui.routeselection.compose.RouteSelectionComposableKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19119a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ qg(String str, int i, int i2) {
        this.f19119a = i2;
        this.b = str;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f19119a) {
            case 0:
                num.intValue();
                ChaloBusActiveTicketKt.k(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 1:
                num.getClass();
                ChaloBusScreenUIKt.y(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 2:
                num.intValue();
                ChaloBusScreenUIKt.j(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 3:
                num.intValue();
                ChaloTabTitleKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 4:
                num.intValue();
                ChaloUserReviewFormComposableKt.c(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 5:
                num.intValue();
                CityLocationSelectionScreenKt.h(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 6:
                num.intValue();
                ErrorTextKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 7:
                num.intValue();
                FareBreakupSectionKt.i(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 8:
                num.intValue();
                FareBreakupSectionKt.h(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 9:
                num.intValue();
                FareDetailsCTAViewKt.c(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 10:
                num.intValue();
                FareRouteAndStopDetailsViewKt.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 11:
                num.intValue();
                FareRouteAndStopDetailsViewKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 12:
                num.intValue();
                FareRouteAndStopDetailsViewKt.e(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 13:
                num.intValue();
                PassengerDetailsViewKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 14:
                num.intValue();
                PbBulkBookingRideDetailsScreenKt.j(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 15:
                num.intValue();
                PbBulkBookingRideDetailsScreenKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 16:
                num.intValue();
                PostValidationScreenKt.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            case 17:
                num.intValue();
                RouteSelectionComposableKt.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            default:
                num.intValue();
                TitoRideDataScreenKt.f(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
        }
        return Unit.f17538a;
    }
}
