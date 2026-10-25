package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o91 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18579a;
    public final /* synthetic */ SliderDefaults b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ SliderColors f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function3 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ o91(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, float f3, int i, int i2) {
        this.f18579a = 1;
        this.b = sliderDefaults;
        this.c = sliderState;
        this.d = modifier;
        this.e = z;
        this.f = sliderColors;
        this.g = function2;
        this.h = function3;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18579a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SliderDefaults.Track_mnvyFg4$lambda$21(this.b, (SliderState) this.c, this.i, this.d, this.e, this.f, this.g, this.h, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                SliderDefaults sliderDefaults = this.b;
                float f = this.i;
                return SliderDefaults.CenteredTrack_7LSsfP0$lambda$25(sliderDefaults, (SliderState) this.c, this.d, this.e, this.f, this.g, this.h, f, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SliderDefaults.Track_mnvyFg4$lambda$41(this.b, (RangeSliderState) this.c, this.i, this.d, this.e, this.f, this.g, this.h, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ o91(SliderDefaults sliderDefaults, Object obj, float f, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, int i, int i2, int i3) {
        this.f18579a = i3;
        this.b = sliderDefaults;
        this.c = obj;
        this.i = f;
        this.d = modifier;
        this.e = z;
        this.f = sliderColors;
        this.g = function2;
        this.h = function3;
        this.j = f2;
        this.k = f3;
        this.l = i;
        this.m = i2;
    }
}
