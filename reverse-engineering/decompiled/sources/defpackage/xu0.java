package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionMainScreenKt;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xu0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20053a;
    public final /* synthetic */ PremiumBusSeatSelectionViewState b;
    public final /* synthetic */ SheetState c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ xu0(PremiumBusSeatSelectionViewState premiumBusSeatSelectionViewState, SheetState sheetState, Function0 function0, int i, int i2) {
        this.f20053a = i2;
        this.b = premiumBusSeatSelectionViewState;
        this.c = sheetState;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20053a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                PremiumBusSeatSelectionMainScreenKt.b(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                PremiumBusSeatSelectionMainScreenKt.d(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }
}
