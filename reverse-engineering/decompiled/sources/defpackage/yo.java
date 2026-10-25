package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.components.CircularShapeKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20128a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ yo(float f, float f2, long j, long j2, int i, int i2) {
        this.f20128a = i2;
        this.b = f;
        this.c = f2;
        this.d = j;
        this.e = j2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20128a) {
            case 0:
                ((Integer) obj2).getClass();
                CircularShapeKt.a(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                FromAndToStopDetailViewKt.a(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
