package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.ads.UnifiedAdSlotSpec;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsViewState;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15794a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ h6(Modifier modifier, StopTripDetailsViewState stopTripDetailsViewState, Function1 function1, List list, UnifiedAdSlotSpec unifiedAdSlotSpec, float f, int i, Function1 function2, Function0 function0, int i2) {
        this.f15794a = 2;
        this.c = modifier;
        this.b = stopTripDetailsViewState;
        this.d = function1;
        this.e = list;
        this.g = unifiedAdSlotSpec;
        this.f = f;
        this.j = i;
        this.h = function2;
        this.i = function0;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15794a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.TopAppBar_GHTll3U$lambda$1((Function2) this.b, this.c, (Function2) this.d, (Function3) this.e, this.f, (WindowInsets) this.g, (TopAppBarColors) this.h, (TopAppBarScrollBehavior) this.i, this.j, this.k, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.CenterAlignedTopAppBar_GHTll3U$lambda$3((Function2) this.b, this.c, (Function2) this.d, (Function3) this.e, this.f, (WindowInsets) this.g, (TopAppBarColors) this.h, (TopAppBarScrollBehavior) this.i, this.j, this.k, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                StopTripDetailsScreenKt.g(this.c, (StopTripDetailsViewState) this.b, (Function1) this.d, (List) this.e, (UnifiedAdSlotSpec) this.g, this.f, this.j, (Function1) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.k | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ h6(Function2 function2, Modifier modifier, Function2 function3, Function3 function4, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.f15794a = i3;
        this.b = function2;
        this.c = modifier;
        this.d = function3;
        this.e = function4;
        this.f = f;
        this.g = windowInsets;
        this.h = topAppBarColors;
        this.i = topAppBarScrollBehavior;
        this.j = i;
        this.k = i2;
    }
}
