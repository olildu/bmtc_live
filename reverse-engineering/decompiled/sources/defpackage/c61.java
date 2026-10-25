package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SearchBarColors;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c61 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11259a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ c61(SliderDefaults sliderDefaults, Object obj, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, int i, int i2, int i3) {
        this.f11259a = i3;
        this.j = sliderDefaults;
        this.k = obj;
        this.b = modifier;
        this.c = z;
        this.l = sliderColors;
        this.d = function2;
        this.e = function3;
        this.f = f;
        this.g = f2;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11259a) {
            case 0:
                return SearchBarKt.DockedSearchBar_EQC0FA8$lambda$25(this.d, this.c, (Function1) this.j, this.b, (Shape) this.k, (SearchBarColors) this.l, this.f, this.g, this.e, this.h, this.i, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return SliderDefaults.Track_4EFweAY$lambda$37((SliderDefaults) this.j, (RangeSliderState) this.k, this.b, this.c, (SliderColors) this.l, this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return SliderDefaults.Track_4EFweAY$lambda$17((SliderDefaults) this.j, (SliderState) this.k, this.b, this.c, (SliderColors) this.l, this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ c61(Function2 function2, boolean z, Function1 function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function3 function3, int i, int i2) {
        this.f11259a = 0;
        this.d = function2;
        this.c = z;
        this.j = function1;
        this.b = modifier;
        this.k = shape;
        this.l = searchBarColors;
        this.f = f;
        this.g = f2;
        this.e = function3;
        this.h = i;
        this.i = i2;
    }
}
