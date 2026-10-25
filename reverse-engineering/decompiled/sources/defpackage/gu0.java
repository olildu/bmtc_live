package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gu0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15768a;
    public final /* synthetic */ PremiumBusProductModificationReasonsViewState b;
    public final /* synthetic */ SheetState c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ gu0(PremiumBusProductModificationReasonsViewState premiumBusProductModificationReasonsViewState, SheetState sheetState, Function1 function1, int i, int i2) {
        this.f15768a = i2;
        this.b = premiumBusProductModificationReasonsViewState;
        this.c = sheetState;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15768a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                PremiumBusProductModificationReasonsScreenKt.h(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                PremiumBusProductModificationReasonsScreenKt.f(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }
}
