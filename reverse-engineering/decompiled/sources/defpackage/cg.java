package defpackage;

import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11281a;
    public final /* synthetic */ Density b;
    public final /* synthetic */ float c;
    public final /* synthetic */ CarouselState d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ cg(Density density, float f, CarouselState carouselState, float f2, float f3, int i) {
        this.f11281a = i;
        this.b = density;
        this.c = f;
        this.d = carouselState;
        this.e = f2;
        this.f = f3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11281a;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                return CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$12$lambda$11(this.b, this.c, this.d, this.e, this.f, fFloatValue, fFloatValue2);
            default:
                return CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$2$lambda$1(this.b, this.c, this.d, this.e, this.f, fFloatValue, fFloatValue2);
        }
    }
}
