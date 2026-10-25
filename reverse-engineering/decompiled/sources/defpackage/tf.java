package defpackage;

import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.CardWithSideStepIconAndLineKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19651a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function f;

    public /* synthetic */ tf(Modifier modifier, Function2 function2, boolean z, long j, int i) {
        this.e = modifier;
        this.f = function2;
        this.b = z;
        this.c = j;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19651a) {
            case 0:
                ((Integer) obj2).getClass();
                CardWithSideStepIconAndLineKt.b((Modifier) this.e, (Function2) this.f, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return NavigationDrawerKt.Scrim_Bx497Mc$lambda$72(this.b, (Function0) this.e, (Function0) this.f, this.c, this.d, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ tf(boolean z, Function0 function0, Function0 function1, long j, int i) {
        this.b = z;
        this.e = function0;
        this.f = function1;
        this.c = j;
        this.d = i;
    }
}
