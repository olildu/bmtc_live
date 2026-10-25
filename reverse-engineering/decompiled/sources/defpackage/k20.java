package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.compose.components.TooltipPopupComposableKt;
import app.chalo.compose.components.TooltipPopupPlacement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17458a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Shape d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function3 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ k20(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0 function0, Modifier modifier, ScrollState scrollState, boolean z2, Shape shape, long j, float f, float f2, BorderStroke borderStroke, Function3 function3, int i, int i2, int i3) {
        this.n = exposedDropdownMenuBoxScope;
        this.c = z;
        this.i = function0;
        this.b = modifier;
        this.o = scrollState;
        this.h = z2;
        this.d = shape;
        this.e = j;
        this.f = f;
        this.g = f2;
        this.p = borderStroke;
        this.j = function3;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17458a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$7((ExposedDropdownMenuBoxScope) this.n, this.c, this.i, this.b, (ScrollState) this.o, this.h, this.d, this.e, this.f, this.g, (BorderStroke) this.p, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.k | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.l);
                TooltipPopupComposableKt.a(this.b, (Modifier) this.n, this.c, this.d, this.e, this.f, this.g, (TooltipPopupPlacement) this.o, this.h, this.i, this.j, (Function2) this.p, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, this.m);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ k20(Modifier modifier, Modifier modifier2, boolean z, Shape shape, long j, float f, float f2, TooltipPopupPlacement tooltipPopupPlacement, boolean z2, Function0 function0, Function3 function3, Function2 function2, int i, int i2, int i3) {
        this.b = modifier;
        this.n = modifier2;
        this.c = z;
        this.d = shape;
        this.e = j;
        this.f = f;
        this.g = f2;
        this.o = tooltipPopupPlacement;
        this.h = z2;
        this.i = function0;
        this.j = function3;
        this.p = function2;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }
}
