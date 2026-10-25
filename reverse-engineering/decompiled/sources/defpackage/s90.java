package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.material3.WideNavigationRailColors;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19283a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Shape e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ s90(Modifier modifier, boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, Function2 function3, int i) {
        this.b = modifier;
        this.c = z;
        this.d = z2;
        this.h = wideNavigationRailColors;
        this.e = shape;
        this.f = function2;
        this.i = windowInsets;
        this.j = vertical;
        this.k = function3;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19283a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.SurfaceIconToggleButton$lambda$27(this.c, (Function1) this.h, this.b, this.d, this.e, (IconToggleButtonColors) this.i, (BorderStroke) this.j, (MutableInteractionSource) this.k, this.f, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return WideNavigationRailKt.WideNavigationRailLayout$lambda$12(this.b, this.c, this.d, (WideNavigationRailColors) this.h, this.e, this.f, (WindowInsets) this.i, (Arrangement.Vertical) this.j, (Function2) this.k, this.g, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ s90(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i) {
        this.c = z;
        this.h = function1;
        this.b = modifier;
        this.d = z2;
        this.e = shape;
        this.i = iconToggleButtonColors;
        this.j = borderStroke;
        this.k = mutableInteractionSource;
        this.f = function2;
        this.g = i;
    }
}
