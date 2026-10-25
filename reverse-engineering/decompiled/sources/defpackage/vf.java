package defpackage;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19831a = 0;
    public final /* synthetic */ CarouselState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ TargetedFlingBehavior f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ PaddingValues j;
    public final /* synthetic */ Function4 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ vf(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2) {
        this.b = carouselState;
        this.d = f;
        this.c = modifier;
        this.e = f2;
        this.f = targetedFlingBehavior;
        this.g = z;
        this.h = f3;
        this.i = f4;
        this.j = paddingValues;
        this.k = function4;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f19831a) {
            case 0:
                return CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3(this.b, this.d, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer, ((Integer) obj2).intValue());
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer, iIntValue);
        }
    }

    public /* synthetic */ vf(CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2) {
        this.b = carouselState;
        this.c = modifier;
        this.d = f;
        this.e = f2;
        this.f = targetedFlingBehavior;
        this.g = z;
        this.h = f3;
        this.i = f4;
        this.j = paddingValues;
        this.k = function4;
        this.l = i;
        this.m = i2;
    }
}
