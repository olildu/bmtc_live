package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ShadowElementKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qy0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19163a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ qy0(Modifier modifier, long j, long j2, int i, int i2, int i3) {
        this.f19163a = i3;
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19163a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ProgressIndicatorKt.LinearProgressIndicator_RIQooxk$lambda$19(this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                ShadowElementKt.a(this.b, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                return Unit.f17538a;
        }
    }
}
