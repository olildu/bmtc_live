package app.chalo.livetracking.ui.routedetailsscreen.routemap;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/VehicleNumberViewUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleNumberViewUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4904a;
    public final Float b;
    public final float c;

    public VehicleNumberViewUISpec(ChaloPadding chaloPadding, Float f, int i) {
        if ((i & 1) != 0) {
            float f2 = ChaloThemeHelper.a().f;
            chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        }
        f = (i & 2) != 0 ? null : f;
        float f3 = ChaloThemeHelper.a().f;
        this.f4904a = chaloPadding;
        this.b = f;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleNumberViewUISpec)) {
            return false;
        }
        VehicleNumberViewUISpec vehicleNumberViewUISpec = (VehicleNumberViewUISpec) obj;
        return Intrinsics.d(this.f4904a, vehicleNumberViewUISpec.f4904a) && Intrinsics.d(this.b, vehicleNumberViewUISpec.b) && Dp.m7283equalsimpl0(this.c, vehicleNumberViewUISpec.c);
    }

    public final int hashCode() {
        int iHashCode = this.f4904a.hashCode() * 31;
        Float f = this.b;
        return Dp.m7284hashCodeimpl(this.c) + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("VehicleNumberViewUISpec(containerPadding=");
        sb.append(this.f4904a);
        sb.append(", containerMaxWidth=");
        sb.append(this.b);
        sb.append(", spaceBetween=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
