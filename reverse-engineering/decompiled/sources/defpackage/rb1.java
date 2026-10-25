package defpackage;

import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopEtasKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rb1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19194a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function j;

    public /* synthetic */ rb1(SwipeToDismissBoxState swipeToDismissBoxState, Function3 function3, Modifier modifier, boolean z, boolean z2, boolean z3, Function3 function4, int i, int i2) {
        this.g = swipeToDismissBoxState;
        this.h = function3;
        this.i = modifier;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.j = function4;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19194a) {
            case 0:
                ((Integer) obj2).getClass();
                StopEtasKt.d((String) this.g, this.b, (SeatAvailabilityLevel) this.h, (Long) this.i, this.c, this.d, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), RecomposeScopeImplKt.updateChangedFlags(this.f));
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$16((SwipeToDismissBoxState) this.g, (Function3) this.h, (Modifier) this.i, this.b, this.c, this.d, (Function3) this.j, this.e, this.f, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ rb1(String str, boolean z, SeatAvailabilityLevel seatAvailabilityLevel, Long l, boolean z2, boolean z3, Function0 function0, int i, int i2) {
        this.g = str;
        this.b = z;
        this.h = seatAvailabilityLevel;
        this.i = l;
        this.c = z2;
        this.d = z3;
        this.j = function0;
        this.e = i;
        this.f = i2;
    }
}
