package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19208a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ NewPremiumReserveTicketDetailsScreenType c;
    public final /* synthetic */ int d;

    public /* synthetic */ rg(Modifier modifier, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, int i, int i2) {
        this.f19208a = i2;
        this.b = modifier;
        this.c = newPremiumReserveTicketDetailsScreenType;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19208a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ChaloBusActiveTicketKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                NewPremiumBusActivationBottomSheetContentKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
