package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.ui.StopNearbyTripsCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sb1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19288a;
    public final /* synthetic */ NearbyStopAndTripsUiModel b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Function3 g;
    public final /* synthetic */ int h;

    public /* synthetic */ sb1(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, Function1 function1, Function1 function2, Function2 function3, Modifier modifier, Function3 function4, int i, int i2) {
        this.f19288a = i2;
        this.b = nearbyStopAndTripsUiModel;
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.f = modifier;
        this.g = function4;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19288a) {
            case 0:
                ((Integer) obj2).getClass();
                StopNearbyTripsCardKt.h(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                StopNearbyTripsCardKt.f(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                break;
        }
        return Unit.f17538a;
    }
}
