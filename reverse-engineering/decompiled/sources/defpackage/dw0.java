package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dw0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15498a = 1;
    public final /* synthetic */ PremiumBusStopSelectionViewState b;
    public final /* synthetic */ SheetState c;
    public final /* synthetic */ TimeUtilsContract d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ dw0(PremiumBusStopSelectionViewState premiumBusStopSelectionViewState, SheetState sheetState, TimeUtilsContract timeUtilsContract, Function1 function1, int i) {
        this.b = premiumBusStopSelectionViewState;
        this.c = sheetState;
        this.d = timeUtilsContract;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15498a) {
            case 0:
                ((Integer) obj2).intValue();
                PremiumBusStopSelectionScreenKt.k(RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.c, (Composer) obj, this.b, this.d, this.e);
                break;
            default:
                ((Integer) obj2).intValue();
                PremiumBusStopSelectionScreenKt.l(RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.c, (Composer) obj, this.b, this.d, this.e);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ dw0(PremiumBusStopSelectionViewState premiumBusStopSelectionViewState, TimeUtilsContract timeUtilsContract, Function1 function1, SheetState sheetState, int i) {
        this.b = premiumBusStopSelectionViewState;
        this.d = timeUtilsContract;
        this.e = function1;
        this.c = sheetState;
        this.f = i;
    }
}
