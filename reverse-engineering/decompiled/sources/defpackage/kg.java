package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17495a;
    public final /* synthetic */ PremiumBusBookingVehicleInfoState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;

    public /* synthetic */ kg(Modifier modifier, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, int i) {
        this.f17495a = 2;
        this.c = modifier;
        this.b = premiumBusBookingVehicleInfoState;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17495a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ChaloBusActiveTicketKt.j(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.c, this.b);
                break;
            case 1:
                ChaloBusActiveTicketKt.l(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.c, this.b);
                break;
            default:
                NewPremiumBusActivationBottomSheetContentKt.i(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.c, this.b);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ kg(PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, Modifier modifier, int i, int i2) {
        this.f17495a = i2;
        this.b = premiumBusBookingVehicleInfoState;
        this.c = modifier;
        this.d = i;
    }
}
