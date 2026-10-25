package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a21 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155a;
    public final /* synthetic */ StopTripDetailsUiModel b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ a21(StopTripDetailsUiModel stopTripDetailsUiModel, Function0 function0, int i, int i2) {
        this.f155a = i2;
        this.b = stopTripDetailsUiModel;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f155a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                RegularBusStopNearbyTripsCardKt.m(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                StopTripDetailsScreenKt.o(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
