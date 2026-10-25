package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.dialogs.TncDialogKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hw0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15866a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ hw0(Modifier modifier, Function0 function0, Function0 function1, int i, int i2) {
        this.f15866a = i2;
        this.b = modifier;
        this.c = function0;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15866a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PremiumBusStopSelectionScreenKt.n(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 1:
                TitoRideDataScreenKt.l(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 2:
                TncDialogKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            default:
                TncDialogKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ hw0(Function0 function0, Function0 function1, Modifier modifier, int i, int i2) {
        this.f15866a = i2;
        this.c = function0;
        this.d = function1;
        this.b = modifier;
        this.e = i;
    }
}
