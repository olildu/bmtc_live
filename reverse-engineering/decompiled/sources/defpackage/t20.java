package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.home.ui.base.InAppUpdateDialogKt;
import app.chalo.home.ui.common.TabHeaderKt;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19621a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ t20(Function0 function0, Function0 function1, int i, int i2) {
        this.f19621a = i2;
        this.b = function0;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f19621a) {
            case 0:
                num.getClass();
                FareDetailsBaseComposableKt.c(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 1:
                num.intValue();
                InAppUpdateDialogKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 2:
                num.intValue();
                PremiumBusProductModificationReasonsScreenKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 3:
                num.intValue();
                PremiumBusStopSelectionScreenKt.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 4:
                num.intValue();
                PremiumBusStopSelectionScreenKt.e(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                num.intValue();
                TabHeaderKt.c(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
