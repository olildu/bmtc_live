package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18475a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ LazyListState c;
    public final /* synthetic */ PaddingValues d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ FlingBehavior f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ OverscrollEffect h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ nd0(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.f18475a = i3;
        this.b = modifier;
        this.c = lazyListState;
        this.d = paddingValues;
        this.e = z;
        this.l = obj;
        this.m = obj2;
        this.f = flingBehavior;
        this.g = z2;
        this.h = overscrollEffect;
        this.i = function1;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18475a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LazyDslKt.LazyColumn$lambda$0(this.b, this.c, this.d, this.e, (Arrangement.Vertical) this.l, (Alignment.Horizontal) this.m, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LazyDslKt.LazyRow$lambda$0(this.b, this.c, this.d, this.e, (Arrangement.Horizontal) this.l, (Alignment.Vertical) this.m, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue2);
        }
    }
}
