package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19307a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;

    public /* synthetic */ sj(int i, int i2, long j, long j2, Modifier modifier, int i3, int i4) {
        this.f19307a = i4;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = modifier;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19307a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloDotsIndicatorsKt.a(this.f, this.d, this.e, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                ChaloDotsIndicatorsKt.b(this.f, this.d, this.e, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$11(this.f, this.d, this.e, this.b, this.c, this.g, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ sj(Modifier modifier, long j, long j2, int i, int i2, int i3) {
        this.f19307a = 2;
        this.f = modifier;
        this.d = j;
        this.e = j2;
        this.b = i;
        this.c = i2;
        this.g = i3;
    }
}
