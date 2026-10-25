package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20032a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ WindowInsets g;
    public final /* synthetic */ Function3 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ xl0(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Function3 function3, int i, int i2) {
        this.f20032a = 3;
        this.b = modifier;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.c = paddingValues;
        this.g = windowInsets;
        this.h = function3;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20032a) {
            case 0:
                return NavigationDrawerKt.DismissibleDrawerSheet_afqeVBk$lambda$45(this.b, (Shape) this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return NavigationDrawerKt.ModalDrawerSheet_afqeVBk$lambda$43(this.b, (Shape) this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return NavigationDrawerKt.PermanentDrawerSheet_afqeVBk$lambda$49(this.b, (Shape) this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AppBarKt.BottomAppBar_1oL4kX8$lambda$14(this.b, this.d, this.e, this.f, (PaddingValues) this.c, this.g, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ xl0(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, int i3) {
        this.f20032a = i3;
        this.b = modifier;
        this.c = shape;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.g = windowInsets;
        this.h = function3;
        this.i = i;
        this.j = i2;
    }
}
