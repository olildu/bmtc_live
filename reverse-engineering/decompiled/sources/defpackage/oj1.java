package defpackage;

import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18604a;
    public final /* synthetic */ BottomSheetScaffoldState b;
    public final /* synthetic */ TitoRideDetailsViewState c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ oj1(BottomSheetScaffoldState bottomSheetScaffoldState, TitoRideDetailsViewState titoRideDetailsViewState, Function1 function1, int i, int i2) {
        this.f18604a = i2;
        this.b = bottomSheetScaffoldState;
        this.c = titoRideDetailsViewState;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18604a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                TitoRideDataScreenKt.n(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.b, composer, this.c, this.d);
                break;
            case 1:
                TitoRideDataScreenKt.j(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.b, composer, this.c, this.d);
                break;
            default:
                TitoRideDataScreenKt.i(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.b, composer, this.c, this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ oj1(TitoRideDetailsViewState titoRideDetailsViewState, BottomSheetScaffoldState bottomSheetScaffoldState, Function1 function1, int i) {
        this.f18604a = 0;
        this.c = titoRideDetailsViewState;
        this.b = bottomSheetScaffoldState;
        this.d = function1;
        this.e = i;
    }
}
