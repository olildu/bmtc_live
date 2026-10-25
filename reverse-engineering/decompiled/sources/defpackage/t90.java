package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19638a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ t90(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, boolean z2, Function1 function1, int i, int i2, int i3) {
        this.f19638a = i3;
        this.b = modifier;
        this.h = lazyListState;
        this.i = paddingValues;
        this.c = z;
        this.j = obj;
        this.k = obj2;
        this.l = flingBehavior;
        this.d = z2;
        this.e = function1;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19638a) {
            case 0:
                return IconButtonKt.OutlinedIconToggleButton$lambda$21(this.c, this.e, this.b, this.d, (Shape) this.h, (IconToggleButtonColors) this.i, (BorderStroke) this.j, (MutableInteractionSource) this.k, (Function2) this.l, this.f, this.g, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return LazyDslKt.LazyColumn$lambda$1(this.b, (LazyListState) this.h, (PaddingValues) this.i, this.c, (Arrangement.Vertical) this.j, (Alignment.Horizontal) this.k, (FlingBehavior) this.l, this.d, this.e, this.f, this.g, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return LazyDslKt.LazyRow$lambda$1(this.b, (LazyListState) this.h, (PaddingValues) this.i, this.c, (Arrangement.Horizontal) this.j, (Alignment.Vertical) this.k, (FlingBehavior) this.l, this.d, this.e, this.f, this.g, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ t90(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2) {
        this.f19638a = 0;
        this.c = z;
        this.e = function1;
        this.b = modifier;
        this.d = z2;
        this.h = shape;
        this.i = iconToggleButtonColors;
        this.j = borderStroke;
        this.k = mutableInteractionSource;
        this.l = function2;
        this.f = i;
        this.g = i2;
    }
}
