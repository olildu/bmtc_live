package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultLoadingCardUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gb1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15717a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ StopTripPlannerResultLoadingCardUiState c;
    public final /* synthetic */ int d;

    public /* synthetic */ gb1(Modifier modifier, StopTripPlannerResultLoadingCardUiState stopTripPlannerResultLoadingCardUiState, int i, int i2) {
        this.f15717a = i2;
        this.b = modifier;
        this.c = stopTripPlannerResultLoadingCardUiState;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15717a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                StopBasedTripPlannerResultScreenKt.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                StopBasedTripPlannerResultScreenKt.e(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
