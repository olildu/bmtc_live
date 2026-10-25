package defpackage;

import androidx.compose.foundation.AndroidExternalSurface_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.CardWithSideStepIconAndLineKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11166a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function h;

    public /* synthetic */ b4(Modifier modifier, boolean z, long j, float[] fArr, Function1 function1, int i, int i2) {
        this.b = modifier;
        this.c = z;
        this.d = j;
        this.g = fArr;
        this.h = function1;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11166a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$3(this.b, this.c, this.d, (float[]) this.g, (Function1) this.h, this.e, this.f, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                CardWithSideStepIconAndLineKt.a((Function2) this.g, (Function3) this.h, this.b, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ b4(Function2 function2, Function3 function3, Modifier modifier, boolean z, long j, int i, int i2) {
        this.g = function2;
        this.h = function3;
        this.b = modifier;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
