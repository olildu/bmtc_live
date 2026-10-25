package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w91 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19907a;
    public final /* synthetic */ ClosedFloatingPointRange b;
    public final /* synthetic */ RangeSliderState c;

    public /* synthetic */ w91(ClosedFloatingPointRange closedFloatingPointRange, RangeSliderState rangeSliderState, int i) {
        this.f19907a = i;
        this.b = closedFloatingPointRange;
        this.c = rangeSliderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zRangeSliderEndThumbSemantics$lambda$58$lambda$57;
        int i = this.f19907a;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                zRangeSliderEndThumbSemantics$lambda$58$lambda$57 = SliderKt.rangeSliderEndThumbSemantics$lambda$58$lambda$57(this.b, this.c, fFloatValue);
                break;
            default:
                zRangeSliderEndThumbSemantics$lambda$58$lambda$57 = SliderKt.rangeSliderStartThumbSemantics$lambda$55$lambda$54(this.b, this.c, fFloatValue);
                break;
        }
        return Boolean.valueOf(zRangeSliderEndThumbSemantics$lambda$58$lambda$57);
    }
}
