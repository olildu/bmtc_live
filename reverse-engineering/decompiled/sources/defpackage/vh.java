package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19836a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ vh(List list, Modifier modifier, int i, int i2, int i3) {
        this.f19836a = i3;
        this.b = list;
        this.c = modifier;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19836a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ChaloBusScreenUIKt.i(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e, composer, this.c, this.b);
                break;
            case 1:
                ChaloBusScreenUIKt.i(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e, composer, this.c, this.b);
                break;
            case 2:
                SpecialFeatureTagListComposableKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e, composer, this.c, this.b);
                break;
            default:
                TripPlannerResultsScreenKt.k(this.d, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.c, this.b);
                break;
        }
        return Unit.f17538a;
    }
}
