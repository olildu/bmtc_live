package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.OriginDestinationSideIndicatorKt;
import app.chalo.premiumbus.ui.stopselection.FromAndToStopCardData;
import app.chalo.routeselection.ui.compose.FromAndToStopComponentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19178a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r50(Modifier modifier, float f, float f2, int i, int i2) {
        this.f = modifier;
        this.b = f;
        this.c = f2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19178a) {
            case 0:
                ((Integer) obj2).getClass();
                FromAndToStopComponentKt.b((FromAndToStopCardData) this.f, this.d, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                OriginDestinationSideIndicatorKt.a((Modifier) this.f, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ r50(FromAndToStopCardData fromAndToStopCardData, int i, float f, float f2, int i2) {
        this.f = fromAndToStopCardData;
        this.d = i;
        this.b = f;
        this.c = f2;
        this.e = i2;
    }
}
