package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19815a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ v90(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, boolean z, boolean z2, Function2 function2, int i, int i2) {
        this.c = popupPositionProvider;
        this.j = function3;
        this.g = tooltipState;
        this.d = modifier;
        this.b = z;
        this.f = z2;
        this.e = function2;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19815a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.IconToggleButton$lambda$5(this.b, (Function1) this.c, this.d, this.f, (IconToggleButtonColors) this.j, (MutableInteractionSource) this.g, this.e, this.h, this.i, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SwitchKt.Switch$lambda$1(this.b, (Function1) this.c, this.d, this.e, this.f, (SwitchColors) this.j, (MutableInteractionSource) this.g, this.h, this.i, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TooltipKt.TooltipBox$lambda$0((PopupPositionProvider) this.c, (Function3) this.j, (TooltipState) this.g, this.d, this.b, this.f, this.e, this.h, this.i, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ v90(boolean z, Function1 function1, Modifier modifier, Function2 function2, boolean z2, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.c = function1;
        this.d = modifier;
        this.e = function2;
        this.f = z2;
        this.j = switchColors;
        this.g = mutableInteractionSource;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ v90(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2) {
        this.b = z;
        this.c = function1;
        this.d = modifier;
        this.f = z2;
        this.j = iconToggleButtonColors;
        this.g = mutableInteractionSource;
        this.e = function2;
        this.h = i;
        this.i = i2;
    }
}
