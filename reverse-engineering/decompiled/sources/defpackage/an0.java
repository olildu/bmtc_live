package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class an0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304a;
    public final /* synthetic */ NewPremiumBusReserveTicketActivationState b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ int e;

    public /* synthetic */ an0(Modifier modifier, NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, Function1 function1, int i, int i2) {
        this.f304a = i2;
        this.d = modifier;
        this.b = newPremiumBusReserveTicketActivationState;
        this.c = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f304a) {
            case 0:
                num.getClass();
                NewPremiumBusActivationBottomSheetContentKt.c(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.d, this.b, this.c);
                break;
            case 1:
                num.getClass();
                NewPremiumBusActivationBottomSheetContentKt.c(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.d, this.b, this.c);
                break;
            case 2:
                num.intValue();
                NewPremiumBusActivationBottomSheetContentKt.f(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.d, this.b, this.c);
                break;
            case 3:
                num.getClass();
                NewPremiumBusActivationBottomSheetContentKt.e(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.d, this.b, this.c);
                break;
            case 4:
                num.getClass();
                PostValidationScreenKt.c(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.d, this.b, this.c);
                break;
            default:
                num.getClass();
                PostValidationScreenKt.c(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.d, this.b, this.c);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ an0(NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, Function1 function1, Modifier modifier, int i, int i2) {
        this.f304a = i2;
        this.b = newPremiumBusReserveTicketActivationState;
        this.c = function1;
        this.d = modifier;
        this.e = i;
    }
}
