package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19225a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ rn(SliderState sliderState, Modifier modifier, boolean z, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function4, int i, int i2) {
        this.h = sliderState;
        this.b = modifier;
        this.c = z;
        this.d = z2;
        this.i = sliderColors;
        this.e = mutableInteractionSource;
        this.j = function3;
        this.k = function4;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19225a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CheckboxKt.Checkbox$lambda$6(this.c, (Function1) this.h, (Stroke) this.i, (Stroke) this.j, this.b, this.d, (CheckboxColors) this.k, (MutableInteractionSource) this.e, this.f, this.g, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SliderKt.VerticalSlider$lambda$10((SliderState) this.h, this.b, this.c, this.d, (SliderColors) this.i, (MutableInteractionSource) this.e, (Function3) this.j, (Function3) this.k, this.f, this.g, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TooltipKt.TooltipBox$lambda$1((PopupPositionProvider) this.h, (Function3) this.i, (TooltipState) this.j, this.b, (Function0) this.k, this.c, this.d, (Function2) this.e, this.f, this.g, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ rn(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z, boolean z2, Function2 function2, int i, int i2) {
        this.h = popupPositionProvider;
        this.i = function3;
        this.j = tooltipState;
        this.b = modifier;
        this.k = function0;
        this.c = z;
        this.d = z2;
        this.e = function2;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ rn(boolean z, Function1 function1, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.c = z;
        this.h = function1;
        this.i = stroke;
        this.j = stroke2;
        this.b = modifier;
        this.d = z2;
        this.k = checkboxColors;
        this.e = mutableInteractionSource;
        this.f = i;
        this.g = i2;
    }
}
