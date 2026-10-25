package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsCommonViewsKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tt0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19689a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Function g;

    public /* synthetic */ tt0(TripPlannerDetailsState tripPlannerDetailsState, Function1 function1, float f, Modifier modifier, Function2 function2, int i) {
        this.f = tripPlannerDetailsState;
        this.g = function1;
        this.b = f;
        this.c = modifier;
        this.d = function2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19689a) {
            case 0:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsCommonViewsKt.a(this.d, this.c, (Shape) this.f, this.b, (Function3) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                TripPlannerDetailsScreenKt.c((TripPlannerDetailsState) this.f, (Function1) this.g, this.b, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ tt0(Function2 function2, Modifier modifier, Shape shape, float f, Function3 function3, int i) {
        this.d = function2;
        this.c = modifier;
        this.f = shape;
        this.b = f;
        this.g = function3;
        this.e = i;
    }
}
