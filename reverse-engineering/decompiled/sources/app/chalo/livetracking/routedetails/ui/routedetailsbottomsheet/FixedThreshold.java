package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/FixedThreshold;", "Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/ThresholdConfig;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FixedThreshold implements ThresholdConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4452a;

    public FixedThreshold(float f) {
        this.f4452a = f;
    }

    @Override // app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.ThresholdConfig
    public final float a(Density density, float f, float f2) {
        Intrinsics.i(density, "<this>");
        return (Math.signum(f2 - f) * density.mo404toPx0680j_4(this.f4452a)) + f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && Dp.m7283equalsimpl0(this.f4452a, ((FixedThreshold) obj).f4452a);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f4452a);
    }

    public final String toString() {
        return vo1.B("FixedThreshold(offset=", Dp.m7289toStringimpl(this.f4452a), ")");
    }
}
