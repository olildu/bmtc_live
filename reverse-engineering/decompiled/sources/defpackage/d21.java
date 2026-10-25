package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.stoptripdetails.data.model.app.EstimatedTime;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d21 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15422a;
    public final /* synthetic */ EstimatedTime b;
    public final /* synthetic */ int c;

    public /* synthetic */ d21(EstimatedTime estimatedTime, int i, int i2) {
        this.f15422a = i2;
        this.b = estimatedTime;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15422a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                RegularBusStopNearbyTripsCardKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                StopTripDetailsScreenKt.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }
}
