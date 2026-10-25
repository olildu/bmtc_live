package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19940a;
    public final /* synthetic */ DrawerState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Shape d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ WindowInsets h;
    public final /* synthetic */ Function3 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ wl0(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, int i3) {
        this.f19940a = i3;
        this.b = drawerState;
        this.c = modifier;
        this.d = shape;
        this.e = j;
        this.f = j2;
        this.g = f;
        this.h = windowInsets;
        this.i = function3;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f19940a) {
            case 0:
                return NavigationDrawerKt.ModalDrawerSheet_Snr_uVM$lambda$44(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer, ((Integer) obj2).intValue());
            default:
                return NavigationDrawerKt.DismissibleDrawerSheet_Snr_uVM$lambda$46(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer, ((Integer) obj2).intValue());
        }
    }
}
