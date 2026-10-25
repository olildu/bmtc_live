package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripDetailsFareAndTravelTimeComponentKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.routeselection.ui.compose.FromAndToStopComponentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19091a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ q50(int i, int i2, int i3, Modifier modifier, String str, String str2) {
        this.f19091a = i3;
        this.b = modifier;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19091a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f | 1);
                FromAndToStopComponentKt.c(this.e, iUpdateChangedFlags, (Composer) obj, this.b, this.c, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f | 1);
                PbBulkBookingRideDetailsScreenKt.c(this.e, iUpdateChangedFlags2, (Composer) obj, this.b, this.c, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f | 1);
                TripDetailsFareAndTravelTimeComponentKt.a(this.e, iUpdateChangedFlags3, (Composer) obj, this.b, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.f | 1);
                TripPlannerDetailsScreenKt.d(this.e, iUpdateChangedFlags4, (Composer) obj, this.b, this.c, this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ q50(String str, int i, String str2, Modifier modifier, int i2) {
        this.f19091a = 3;
        this.c = str;
        this.e = i;
        this.d = str2;
        this.b = modifier;
        this.f = i2;
    }

    public /* synthetic */ q50(String str, String str2, Modifier modifier, int i, int i2) {
        this.f19091a = 2;
        this.c = str;
        this.d = str2;
        this.b = modifier;
        this.e = i;
        this.f = i2;
    }
}
