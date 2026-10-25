package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreenKt;
import app.chalo.uistate.button.ButtonUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ik implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15920a = 0;
    public final /* synthetic */ ButtonUIState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ ik(Modifier modifier, ButtonUIState buttonUIState, int i, int i2) {
        this.c = modifier;
        this.b = buttonUIState;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15920a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ChaloFilledButtonKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e, composer, this.c, this.b);
                break;
            default:
                RouteDetailsStopAndMapScreenKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e, composer, this.c, this.b);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ ik(ButtonUIState buttonUIState, Modifier modifier, int i, int i2) {
        this.b = buttonUIState;
        this.c = modifier;
        this.d = i;
        this.e = i2;
    }
}
