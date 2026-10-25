package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15521a = 2;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ float f;
    public final /* synthetic */ WindowInsets g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Function3 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ e6(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, FloatProducer floatProducer, Function3 function3, int i, int i2) {
        this.l = drawerPredictiveBackState;
        this.g = windowInsets;
        this.b = modifier;
        this.e = shape;
        this.c = j;
        this.d = j2;
        this.f = f;
        this.h = floatProducer;
        this.i = function3;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15521a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.BottomAppBar_qhFBPw4$lambda$13(this.i, this.b, (Function2) this.l, this.c, this.d, this.f, (PaddingValues) this.e, this.g, (BottomAppBarScrollBehavior) this.h, this.j, this.k, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.FlexibleBottomAppBar_wBhsO_E$lambda$16(this.b, this.c, this.d, (PaddingValues) this.e, (Arrangement.Horizontal) this.l, this.f, this.g, (BottomAppBarScrollBehavior) this.h, this.i, this.j, this.k, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$53((DrawerPredictiveBackState) this.l, this.g, this.b, (Shape) this.e, this.c, this.d, this.f, (FloatProducer) this.h, this.i, this.j, this.k, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ e6(Modifier modifier, long j, long j2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, float f, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Function3 function3, int i, int i2) {
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = paddingValues;
        this.l = horizontal;
        this.f = f;
        this.g = windowInsets;
        this.h = bottomAppBarScrollBehavior;
        this.i = function3;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ e6(Function3 function3, Modifier modifier, Function2 function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, int i, int i2) {
        this.i = function3;
        this.b = modifier;
        this.l = function2;
        this.c = j;
        this.d = j2;
        this.f = f;
        this.e = paddingValues;
        this.g = windowInsets;
        this.h = bottomAppBarScrollBehavior;
        this.j = i;
        this.k = i2;
    }
}
