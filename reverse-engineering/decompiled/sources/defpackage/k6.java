package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17468a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ k6(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Function3 function3, int i, int i2) {
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = paddingValues;
        this.g = windowInsets;
        this.k = bottomAppBarScrollBehavior;
        this.h = function3;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17468a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.BottomAppBar_Snr_uVM$lambda$12((Function3) this.h, this.b, (Function2) this.k, this.c, this.d, this.e, (PaddingValues) this.f, (WindowInsets) this.g, this.i, this.j, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.BottomAppBar_e_3WI5M$lambda$15(this.b, this.c, this.d, this.e, (PaddingValues) this.f, (WindowInsets) this.g, (BottomAppBarScrollBehavior) this.k, (Function3) this.h, this.i, this.j, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.i | 1);
                ChaloFilledButtonKt.c((String) this.h, this.b, (TextStyle) this.k, (Painter) this.f, this.c, this.d, this.e, (Function0) this.g, (Composer) obj, iUpdateChangedFlags, this.j);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ k6(String str, Modifier modifier, TextStyle textStyle, Painter painter, long j, long j2, float f, Function0 function0, int i, int i2) {
        this.h = str;
        this.b = modifier;
        this.k = textStyle;
        this.f = painter;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.g = function0;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ k6(Function3 function3, Modifier modifier, Function2 function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, int i, int i2) {
        this.h = function3;
        this.b = modifier;
        this.k = function2;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = paddingValues;
        this.g = windowInsets;
        this.i = i;
        this.j = i2;
    }
}
