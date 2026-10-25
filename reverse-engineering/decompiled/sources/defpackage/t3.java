package defpackage;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19623a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ t3(Modifier modifier, int i, int i2) {
        this.f19623a = 5;
        this.c = i;
        this.b = modifier;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f19623a) {
            case 0:
                return AndroidCursorHandle_androidKt.DefaultCursorHandle$lambda$0(this.b, this.c, this.d, composer, num.intValue());
            case 1:
                num.getClass();
                ChaloSpacersKt.s(this.b, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), composer, this.d);
                return Unit.f17538a;
            case 2:
                num.getClass();
                ChaloTabTitleKt.e(this.b, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), composer, this.d);
                return Unit.f17538a;
            case 3:
                num.getClass();
                NewPremiumBusReserveTicketActivationScreenKt.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 4:
                num.getClass();
                PremiumBusProductModificationReasonsScreenKt.k(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            default:
                num.getClass();
                TripPlannerResultsScreenKt.e(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ t3(Modifier modifier, int i, int i2, int i3) {
        this.f19623a = i3;
        this.b = modifier;
        this.c = i;
        this.d = i2;
    }
}
