package app.chalo.mticket.ui.passengerselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketRouteDetailsUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketRouteDetailsUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f5761a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final float f;

    public MTicketRouteDetailsUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().f);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().f, 7);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().e, 0.0f, 0.0f, 13);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, 0.0f, ChaloThemeHelper.a().f, 4);
        float f = ChaloThemeHelper.a().g;
        this.f5761a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = chaloPadding3;
        this.e = chaloPadding4;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketRouteDetailsUISpec)) {
            return false;
        }
        MTicketRouteDetailsUISpec mTicketRouteDetailsUISpec = (MTicketRouteDetailsUISpec) obj;
        return Intrinsics.d(this.f5761a, mTicketRouteDetailsUISpec.f5761a) && Intrinsics.d(this.b, mTicketRouteDetailsUISpec.b) && Intrinsics.d(this.c, mTicketRouteDetailsUISpec.c) && Intrinsics.d(this.d, mTicketRouteDetailsUISpec.d) && Intrinsics.d(this.e, mTicketRouteDetailsUISpec.e) && Dp.m7283equalsimpl0(this.f, mTicketRouteDetailsUISpec.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + r30.c(this.e, r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f5761a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f);
        StringBuilder sbI = py.i(this.b, this.f5761a, "MTicketRouteDetailsUISpec(background=", ", paddingAround=", ", paddingAroundTitle=");
        r30.o(sbI, this.c, ", paddingAroundRoute=", this.d, ", paddingAroundStopDetails=");
        sbI.append(this.e);
        sbI.append(", spaceBetweenStopNames=");
        sbI.append(strM7289toStringimpl);
        sbI.append(")");
        return sbI.toString();
    }
}
