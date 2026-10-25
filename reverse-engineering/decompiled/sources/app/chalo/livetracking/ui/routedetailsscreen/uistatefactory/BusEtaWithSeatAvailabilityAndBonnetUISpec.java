package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusEtaWithSeatAvailabilityAndBonnetUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusEtaWithSeatAvailabilityAndBonnetUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4906a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final float d;

    public BusEtaWithSeatAvailabilityAndBonnetUISpec() {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().h;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f3, f3, f3, f3);
        float f4 = ChaloThemeHelper.a().e;
        this.f4906a = chaloPadding;
        this.b = ChaloColorToken.GreyColor.f9806a;
        this.c = rectangle;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusEtaWithSeatAvailabilityAndBonnetUISpec)) {
            return false;
        }
        BusEtaWithSeatAvailabilityAndBonnetUISpec busEtaWithSeatAvailabilityAndBonnetUISpec = (BusEtaWithSeatAvailabilityAndBonnetUISpec) obj;
        return Intrinsics.d(this.f4906a, busEtaWithSeatAvailabilityAndBonnetUISpec.f4906a) && Intrinsics.d(this.b, busEtaWithSeatAvailabilityAndBonnetUISpec.b) && Intrinsics.d(this.c, busEtaWithSeatAvailabilityAndBonnetUISpec.c) && Dp.m7283equalsimpl0(this.d, busEtaWithSeatAvailabilityAndBonnetUISpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + pk0.b(this.c, z40.b(this.b, this.f4906a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbL = gf.l(this.f4906a, this.b, "BusEtaWithSeatAvailabilityAndBonnetUISpec(padding=", ", backgroundColor=", ", shape=");
        sbL.append(this.c);
        sbL.append(", spaceBeforeBusNumber=");
        sbL.append(strM7289toStringimpl);
        sbL.append(")");
        return sbL.toString();
    }
}
