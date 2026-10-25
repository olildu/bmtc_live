package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.carousel.CarouselStateKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15729a;
    public final /* synthetic */ Ref.FloatRef b;
    public final /* synthetic */ LazyLayoutScrollScope c;

    public /* synthetic */ gg(Ref.FloatRef floatRef, LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        this.f15729a = i;
        this.b = floatRef;
        this.c = lazyLayoutScrollScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15729a;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                return CarouselStateKt.animateScrollToPage$lambda$3(this.b, this.c, fFloatValue, fFloatValue2);
            default:
                return PagerStateKt.animateScrollToPage$lambda$2(this.b, this.c, fFloatValue, fFloatValue2);
        }
    }
}
