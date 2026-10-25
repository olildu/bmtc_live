package defpackage;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.ncmc.ui.landing.compose.SingleCardDetailsScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusLandingScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ue implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19738a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ue(Modifier modifier, Function1 function1, int i, int i2) {
        this.f19738a = i2;
        this.b = modifier;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f19738a) {
            case 0:
                return CanvasKt.Canvas$lambda$0(this.b, this.c, this.d, composer, num.intValue());
            case 1:
                num.getClass();
                CityLocationSelectionScreenKt.j(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 2:
                num.getClass();
                PremiumBusLandingScreenKt.e(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            default:
                num.intValue();
                SingleCardDetailsScreenKt.b(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
        }
    }
}
