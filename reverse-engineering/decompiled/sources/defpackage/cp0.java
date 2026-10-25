package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15395a;
    public final /* synthetic */ PagerState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ PaddingValues d;
    public final /* synthetic */ PageSize e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ TargetedFlingBehavior h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ NestedScrollConnection l;
    public final /* synthetic */ SnapPosition m;
    public final /* synthetic */ OverscrollEffect n;
    public final /* synthetic */ Function4 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ cp0(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Object obj, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1 function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, Function4 function4, int i2, int i3, int i4, int i5) {
        this.f15395a = i5;
        this.b = pagerState;
        this.c = modifier;
        this.d = paddingValues;
        this.e = pageSize;
        this.f = i;
        this.g = f;
        this.s = obj;
        this.h = targetedFlingBehavior;
        this.i = z;
        this.j = z2;
        this.k = function1;
        this.l = nestedScrollConnection;
        this.m = snapPosition;
        this.n = overscrollEffect;
        this.o = function4;
        this.p = i2;
        this.q = i3;
        this.r = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15395a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return PagerKt.VerticalPager__8jOkeI$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, (Alignment.Horizontal) this.s, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return PagerKt.HorizontalPager__8jOkeI$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, (Alignment.Vertical) this.s, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, iIntValue2);
        }
    }
}
