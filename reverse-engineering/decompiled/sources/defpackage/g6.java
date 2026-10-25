package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15703a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ WindowInsets h;
    public final /* synthetic */ TopAppBarColors i;
    public final /* synthetic */ TopAppBarScrollBehavior j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ g6(Function2 function2, Modifier modifier, Function2 function3, Function3 function4, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.f15703a = i3;
        this.b = function2;
        this.c = modifier;
        this.d = function3;
        this.e = function4;
        this.f = f;
        this.g = f2;
        this.h = windowInsets;
        this.i = topAppBarColors;
        this.j = topAppBarScrollBehavior;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15703a) {
            case 0:
                return AppBarKt.MediumTopAppBar_oKE7A98$lambda$6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AppBarKt.LargeTopAppBar_oKE7A98$lambda$9(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
