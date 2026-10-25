package defpackage;

import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.Tooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15651a;
    public final /* synthetic */ TooltipScope b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Shape f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ fk1(TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, Function2 function2, int i, int i2, int i3) {
        this.f15651a = i3;
        this.b = tooltipScope;
        this.c = modifier;
        this.d = j;
        this.e = f;
        this.f = shape;
        this.g = j2;
        this.h = j3;
        this.i = f2;
        this.j = f3;
        this.k = function2;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f15651a) {
            case 0:
                return TooltipKt.PlainTooltip_m9Er_Xc$lambda$6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer, ((Integer) obj2).intValue());
            default:
                return Tooltip_androidKt.PlainTooltipAndroid_m9Er_Xc$lambda$1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer, ((Integer) obj2).intValue());
        }
    }
}
