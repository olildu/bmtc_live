package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15790a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ h4(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2) {
        this.g = sliderDefaults;
        this.h = mutableInteractionSource;
        this.i = sliderState;
        this.b = modifier;
        this.j = sliderColors;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15790a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidMenu_androidKt.DropdownMenu_4kj__NE$lambda$5(this.c, (Function0) this.g, this.b, this.d, (ScrollState) this.h, (PopupProperties) this.i, (Function3) this.j, this.e, this.f, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SliderDefaults.Thumb_HwbPF3A$lambda$6((SliderDefaults) this.g, (MutableInteractionSource) this.h, (SliderState) this.i, this.b, (SliderColors) this.j, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ h4(boolean z, Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Function3 function3, int i, int i2) {
        this.c = z;
        this.g = function0;
        this.b = modifier;
        this.d = j;
        this.h = scrollState;
        this.i = popupProperties;
        this.j = function3;
        this.e = i;
        this.f = i2;
    }
}
