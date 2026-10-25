package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17454a;
    public final /* synthetic */ RangeSliderState b;

    public /* synthetic */ k01(RangeSliderState rangeSliderState, int i) {
        this.f17454a = i;
        this.b = rangeSliderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17454a) {
            case 0:
                return RangeSliderState.gestureEndAction$lambda$0(this.b, ((Boolean) obj).booleanValue());
            case 1:
                return SliderKt.RangeSliderImpl$lambda$44$lambda$34$lambda$33(this.b, (IntSize) obj);
            default:
                return SliderKt.RangeSliderImpl$lambda$44$lambda$39$lambda$38(this.b, (IntSize) obj);
        }
    }
}
