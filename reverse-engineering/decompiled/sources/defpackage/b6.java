package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11169a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ Function3 f;
    public final /* synthetic */ Alignment.Horizontal g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ WindowInsets j;
    public final /* synthetic */ TopAppBarColors k;
    public final /* synthetic */ TopAppBarScrollBehavior l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ b6(Function2 function2, Modifier modifier, Function2 function3, Function2 function4, Function3 function5, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, int i4) {
        this.f11169a = i4;
        this.b = function2;
        this.c = modifier;
        this.d = function3;
        this.e = function4;
        this.f = function5;
        this.g = horizontal;
        this.h = f;
        this.i = f2;
        this.j = windowInsets;
        this.k = topAppBarColors;
        this.l = topAppBarScrollBehavior;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11169a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.LargeFlexibleTopAppBar_eXZ4JBQ$lambda$10(this.b, this.c, (Function2) this.d, (Function2) this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.MediumFlexibleTopAppBar_eXZ4JBQ$lambda$7(this.b, this.c, (Function2) this.d, (Function2) this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AppBarKt.TwoRowsTopAppBar_eXZ4JBQ$lambda$11(this.f, this.c, (Function3) this.d, this.b, (Function3) this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ b6(Function3 function3, Modifier modifier, Function3 function4, Function2 function2, Function3 function5, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.f11169a = 2;
        this.f = function3;
        this.c = modifier;
        this.d = function4;
        this.b = function2;
        this.e = function5;
        this.g = horizontal;
        this.h = f;
        this.i = f2;
        this.j = windowInsets;
        this.k = topAppBarColors;
        this.l = topAppBarScrollBehavior;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }
}
