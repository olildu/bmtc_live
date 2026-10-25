package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.quickpay.ui.tripamount.QuickPayTripAmountUIState;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j01 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17361a;
    public final /* synthetic */ QuickPayTripAmountUIState b;
    public final /* synthetic */ int c;

    public /* synthetic */ j01(QuickPayTripAmountUIState quickPayTripAmountUIState, int i, int i2) {
        this.f17361a = i2;
        this.b = quickPayTripAmountUIState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17361a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                QuickpayTripAmountScreenKt.h(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                QuickpayTripAmountScreenKt.g(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }
}
