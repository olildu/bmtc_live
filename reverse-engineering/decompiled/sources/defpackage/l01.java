package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderState;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18270a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ClosedFloatingPointRange c;

    public /* synthetic */ l01(Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        this.f18270a = i;
        this.b = function0;
        this.c = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18270a) {
            case 0:
                return RangeSliderState.Companion.Saver$lambda$1(this.b, this.c, (List) obj);
            default:
                return SliderState.Companion.Saver$lambda$1(this.b, this.c, (List) obj);
        }
    }
}
