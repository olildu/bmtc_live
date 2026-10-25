package defpackage;

import androidx.compose.material3.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15642a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ fh1(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i, int i2, int i3) {
        this.f15642a = i3;
        this.b = tabRowDefaults;
        this.c = modifier;
        this.d = f;
        this.e = j;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15642a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TabRowDefaults.Indicator_9IZ8Weo$lambda$0((TabRowDefaults) this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TabRowDefaults.SecondaryIndicator_9IZ8Weo$lambda$2((TabRowDefaults) this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                ChaloCircularBackButtonKt.a(this.c, this.e, this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.g);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ fh1(Modifier modifier, long j, float f, Function0 function0, int i, int i2) {
        this.f15642a = 2;
        this.c = modifier;
        this.e = j;
        this.d = f;
        this.b = function0;
        this.f = i;
        this.g = i2;
    }
}
