package defpackage;

import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15749a;
    public final /* synthetic */ NewPremiumBusReserveTicketActivationState b;
    public final /* synthetic */ BottomSheetScaffoldState c;
    public final /* synthetic */ BottomDrawerState d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ gn0(NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, BottomSheetScaffoldState bottomSheetScaffoldState, BottomDrawerState bottomDrawerState, Function1 function1, int i, int i2) {
        this.f15749a = i2;
        this.b = newPremiumBusReserveTicketActivationState;
        this.c = bottomSheetScaffoldState;
        this.d = bottomDrawerState;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15749a) {
            case 0:
                ((Integer) obj2).intValue();
                NewPremiumBusReserveTicketActivationScreenKt.c(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                NewPremiumBusReserveTicketActivationScreenKt.b(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
