package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11182a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ RangeSliderState c;
    public final /* synthetic */ ClosedFloatingPointRange d;

    public /* synthetic */ ba1(boolean z, RangeSliderState rangeSliderState, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        this.f11182a = i;
        this.b = z;
        this.c = rangeSliderState;
        this.d = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11182a) {
            case 0:
                return SliderKt.rangeSliderEndThumbSemantics$lambda$58(this.b, this.c, this.d, (SemanticsPropertyReceiver) obj);
            default:
                return SliderKt.rangeSliderStartThumbSemantics$lambda$55(this.b, this.c, this.d, (SemanticsPropertyReceiver) obj);
        }
    }
}
