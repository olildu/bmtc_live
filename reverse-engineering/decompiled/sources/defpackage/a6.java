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
public final /* synthetic */ class a6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ WindowInsets f;
    public final /* synthetic */ TopAppBarColors g;
    public final /* synthetic */ TopAppBarScrollBehavior h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ a6(Function2 function2, Modifier modifier, Function2 function3, Function3 function4, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.f165a = i3;
        this.b = function2;
        this.c = modifier;
        this.d = function3;
        this.e = function4;
        this.f = windowInsets;
        this.g = topAppBarColors;
        this.h = topAppBarScrollBehavior;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f165a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.CenterAlignedTopAppBar$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.LargeTopAppBar$lambda$8(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AppBarKt.TopAppBar$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AppBarKt.MediumTopAppBar$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue4);
        }
    }
}
