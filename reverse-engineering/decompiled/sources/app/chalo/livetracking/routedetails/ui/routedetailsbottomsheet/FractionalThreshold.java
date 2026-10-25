package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/FractionalThreshold;", "Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/ThresholdConfig;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FractionalThreshold implements ThresholdConfig {
    @Override // app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.ThresholdConfig
    public final float a(Density density, float f, float f2) {
        Intrinsics.i(density, "<this>");
        return MathHelpersKt.lerp(f, f2, 0.5f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && Float.compare(0.5f, 0.5f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.5f);
    }

    public final String toString() {
        return "FractionalThreshold(fraction=0.5)";
    }
}
