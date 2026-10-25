package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.py;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusEtaWithSeatAvailabilityUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusEtaWithSeatAvailabilityUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4907a;
    public final float b;
    public final float c;
    public final ChaloPadding d;
    public final ChaloPadding e;

    public BusEtaWithSeatAvailabilityUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 0.0f, 0.0f, 13);
        float f = ChaloThemeHelper.a().e;
        float f2 = ChaloThemeHelper.a().c;
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().d, 7);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().d, 0.0f, 0.0f, 13);
        this.f4907a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = chaloPadding2;
        this.e = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusEtaWithSeatAvailabilityUISpec)) {
            return false;
        }
        BusEtaWithSeatAvailabilityUISpec busEtaWithSeatAvailabilityUISpec = (BusEtaWithSeatAvailabilityUISpec) obj;
        return Intrinsics.d(this.f4907a, busEtaWithSeatAvailabilityUISpec.f4907a) && Dp.m7283equalsimpl0(this.b, busEtaWithSeatAvailabilityUISpec.b) && Dp.m7283equalsimpl0(this.c, busEtaWithSeatAvailabilityUISpec.c) && Intrinsics.d(this.d, busEtaWithSeatAvailabilityUISpec.d) && Intrinsics.d(this.e, busEtaWithSeatAvailabilityUISpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.c(this.d, uf0.a(this.c, uf0.a(this.b, this.f4907a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        StringBuilder sbN = t10.n("BusEtaWithSeatAvailabilityUISpec(seatAvailabilityPadding=", this.f4907a, ", spaceBeforeBusNumber=", strM7289toStringimpl, ", spaceAfterBusNumber=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", realTimeIndicatorPadding=");
        sbN.append(this.d);
        sbN.append(", etaTextPadding=");
        return py.e(sbN, this.e, ")");
    }
}
