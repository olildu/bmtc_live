package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class re0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19202a = 0;
    public final /* synthetic */ StaggeredGridCells b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ LazyStaggeredGridState d;
    public final /* synthetic */ PaddingValues e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ FlingBehavior h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ OverscrollEffect j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ re0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.b = staggeredGridCells;
        this.c = modifier;
        this.d = lazyStaggeredGridState;
        this.e = paddingValues;
        this.f = z;
        this.g = f;
        this.o = horizontal;
        this.h = flingBehavior;
        this.i = z2;
        this.j = overscrollEffect;
        this.k = function1;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19202a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LazyStaggeredGridDslKt.LazyVerticalStaggeredGrid_6qCrX9Q$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, (Arrangement.Horizontal) this.o, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LazyStaggeredGridDslKt.LazyHorizontalStaggeredGrid_121YqSk$lambda$0(this.b, this.c, this.d, this.e, this.f, (Arrangement.Vertical) this.o, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ re0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.b = staggeredGridCells;
        this.c = modifier;
        this.d = lazyStaggeredGridState;
        this.e = paddingValues;
        this.f = z;
        this.o = vertical;
        this.g = f;
        this.h = flingBehavior;
        this.i = z2;
        this.j = overscrollEffect;
        this.k = function1;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }
}
