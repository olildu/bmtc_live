package defpackage;

import androidx.compose.material3.RichTooltipColors;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.Tooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11339a;
    public final /* synthetic */ TooltipScope b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ RichTooltipColors i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ ck1(TooltipScope tooltipScope, Modifier modifier, Function2 function2, Function2 function3, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, Function2 function4, int i, int i2, int i3, int i4) {
        this.f11339a = i4;
        this.b = tooltipScope;
        this.c = modifier;
        this.d = function2;
        this.e = function3;
        this.f = j;
        this.g = f;
        this.h = shape;
        this.i = richTooltipColors;
        this.j = f2;
        this.k = f3;
        this.l = function4;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f11339a) {
            case 0:
                return TooltipKt.RichTooltip_ZuUcA3Q$lambda$12(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer, ((Integer) obj2).intValue());
            default:
                return Tooltip_androidKt.RichTooltipAndroid_ZuUcA3Q$lambda$3(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer, ((Integer) obj2).intValue());
        }
    }
}
