package defpackage;

import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11347a;
    public final /* synthetic */ NewPremiumBusReserveTicketActivationComponent b;

    public /* synthetic */ cn0(NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent, int i) {
        this.f11347a = i;
        this.b = newPremiumBusReserveTicketActivationComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11347a) {
            case 0:
                NewPremiumBusReserveTicketActivationIntent it = (NewPremiumBusReserveTicketActivationIntent) obj;
                Intrinsics.i(it, "it");
                this.b.H0(it);
                break;
            default:
                MapCameraUpdate mapCameraUpdate = (MapCameraUpdate) obj;
                Intrinsics.i(mapCameraUpdate, "mapCameraUpdate");
                this.b.H0(new NewPremiumBusReserveTicketActivationIntent.MapInteractionIntent.MapCameraUpdateLoaded(mapCameraUpdate));
                break;
        }
        return Unit.f17538a;
    }
}
