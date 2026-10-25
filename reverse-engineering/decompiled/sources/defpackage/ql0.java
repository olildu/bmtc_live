package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19131a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Placeable i;
    public final /* synthetic */ int j;
    public final /* synthetic */ float k;
    public final /* synthetic */ Placeable l;
    public final /* synthetic */ int m;
    public final /* synthetic */ float n;
    public final /* synthetic */ int o;
    public final /* synthetic */ MeasureScope p;

    public /* synthetic */ ql0(Placeable placeable, boolean z, float f, Placeable placeable2, int i, float f2, float f3, Placeable placeable3, int i2, float f4, Placeable placeable4, int i3, float f5, int i4, MeasureScope measureScope, int i5) {
        this.f19131a = i5;
        this.b = placeable;
        this.c = z;
        this.d = f;
        this.e = placeable2;
        this.f = i;
        this.g = f2;
        this.h = f3;
        this.i = placeable3;
        this.j = i2;
        this.k = f4;
        this.l = placeable4;
        this.m = i3;
        this.n = f5;
        this.o = i4;
        this.p = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19131a) {
            case 0:
                return NavigationBarKt.placeLabelAndIcon_zUg2_y0$lambda$27(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Placeable.PlacementScope) obj);
            default:
                return NavigationRailKt.placeLabelAndIcon_zUg2_y0$lambda$22(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Placeable.PlacementScope) obj);
        }
    }
}
