package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19025a = 1;
    public final /* synthetic */ GridCells b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ LazyGridState d;
    public final /* synthetic */ PaddingValues e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Arrangement.Horizontal g;
    public final /* synthetic */ Arrangement.Vertical h;
    public final /* synthetic */ FlingBehavior i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ OverscrollEffect k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ pd0(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.b = gridCells;
        this.c = modifier;
        this.d = lazyGridState;
        this.e = paddingValues;
        this.f = z;
        this.g = horizontal;
        this.h = vertical;
        this.i = flingBehavior;
        this.j = z2;
        this.k = overscrollEffect;
        this.l = function1;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f19025a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LazyGridDslKt.LazyVerticalGrid$lambda$0(this.b, this.c, this.d, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer, iIntValue);
            default:
                return LazyGridDslKt.LazyHorizontalGrid$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ pd0(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.b = gridCells;
        this.c = modifier;
        this.d = lazyGridState;
        this.e = paddingValues;
        this.f = z;
        this.h = vertical;
        this.g = horizontal;
        this.i = flingBehavior;
        this.j = z2;
        this.k = overscrollEffect;
        this.l = function1;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }
}
