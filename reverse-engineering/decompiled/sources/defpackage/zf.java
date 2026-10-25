package defpackage;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.SearchBarColors;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRowKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20193a = 2;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ zf(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, int i, int i2) {
        this.g = searchBarState;
        this.h = function2;
        this.b = modifier;
        this.i = shape;
        this.j = searchBarColors;
        this.c = f;
        this.d = f2;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20193a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CarouselKt.HorizontalUncontainedCarousel_9QcgTRs$lambda$9((CarouselState) this.g, this.c, this.b, this.d, (TargetedFlingBehavior) this.h, (PaddingValues) this.i, (Function4) this.j, this.e, this.f, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                PremiumBusScrollableTabRowKt.b((List) this.g, (PagerState) this.h, this.b, this.c, this.d, (Function1) this.i, (Function5) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                return Unit.f17538a;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SearchBarKt.SearchBar_nbWgWpA$lambda$2((SearchBarState) this.g, (Function2) this.h, this.b, (Shape) this.i, (SearchBarColors) this.j, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ zf(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, Function4 function4, int i, int i2) {
        this.g = carouselState;
        this.c = f;
        this.b = modifier;
        this.d = f2;
        this.h = targetedFlingBehavior;
        this.i = paddingValues;
        this.j = function4;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ zf(List list, PagerState pagerState, Modifier modifier, float f, float f2, Function1 function1, Function5 function5, int i, int i2) {
        this.g = list;
        this.h = pagerState;
        this.b = modifier;
        this.c = f;
        this.d = f2;
        this.i = function1;
        this.j = function5;
        this.e = i;
        this.f = i2;
    }
}
