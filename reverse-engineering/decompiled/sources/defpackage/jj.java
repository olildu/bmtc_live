package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBookingCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17411a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ jj(Modifier modifier, float f, int i, int i2, int i3) {
        this.f17411a = i3;
        this.b = modifier;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17411a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ChaloCircularProgressIndicatorKt.b(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                break;
            default:
                PremiumBusBookingCardKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                break;
        }
        return Unit.f17538a;
    }
}
