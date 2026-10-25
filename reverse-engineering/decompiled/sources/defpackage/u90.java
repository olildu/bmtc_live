package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19725a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Shape f;
    public final /* synthetic */ IconToggleButtonColors g;
    public final /* synthetic */ MutableInteractionSource h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ u90(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2, int i3) {
        this.f19725a = i3;
        this.b = z;
        this.c = function1;
        this.d = modifier;
        this.e = z2;
        this.g = iconToggleButtonColors;
        this.h = mutableInteractionSource;
        this.f = shape;
        this.i = function2;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19725a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.IconToggleButton$lambda$6(this.b, this.c, this.d, this.e, this.g, this.h, this.f, this.i, this.j, this.k, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean z = this.b;
                Function1 function1 = this.c;
                Modifier modifier = this.d;
                boolean z2 = this.e;
                IconToggleButtonColors iconToggleButtonColors = this.g;
                MutableInteractionSource mutableInteractionSource = this.h;
                return IconButtonKt.FilledIconToggleButton$lambda$13(z, function1, modifier, z2, this.f, iconToggleButtonColors, mutableInteractionSource, this.i, this.j, this.k, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean z3 = this.b;
                Function1 function2 = this.c;
                Modifier modifier2 = this.d;
                boolean z4 = this.e;
                IconToggleButtonColors iconToggleButtonColors2 = this.g;
                MutableInteractionSource mutableInteractionSource2 = this.h;
                return IconButtonKt.FilledTonalIconToggleButton$lambda$17(z3, function2, modifier2, z4, this.f, iconToggleButtonColors2, mutableInteractionSource2, this.i, this.j, this.k, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return IconButtonKt.IconToggleButtonImpl$lambda$9(this.b, this.c, this.d, this.e, this.g, this.h, this.f, this.i, this.j, this.k, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ u90(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, int i3) {
        this.f19725a = i3;
        this.b = z;
        this.c = function1;
        this.d = modifier;
        this.e = z2;
        this.f = shape;
        this.g = iconToggleButtonColors;
        this.h = mutableInteractionSource;
        this.i = function2;
        this.j = i;
        this.k = i2;
    }
}
