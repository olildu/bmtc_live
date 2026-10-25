package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerUiSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedTripPlannerUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f4614a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final float e;
    public final float f;
    public final float g;

    public StopBasedTripPlannerUiSpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        this.f4614a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = chaloPadding3;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedTripPlannerUiSpecs)) {
            return false;
        }
        StopBasedTripPlannerUiSpecs stopBasedTripPlannerUiSpecs = (StopBasedTripPlannerUiSpecs) obj;
        return Intrinsics.d(this.f4614a, stopBasedTripPlannerUiSpecs.f4614a) && Intrinsics.d(this.b, stopBasedTripPlannerUiSpecs.b) && Intrinsics.d(this.c, stopBasedTripPlannerUiSpecs.c) && Intrinsics.d(this.d, stopBasedTripPlannerUiSpecs.d) && Dp.m7283equalsimpl0(this.e, stopBasedTripPlannerUiSpecs.e) && Dp.m7283equalsimpl0(this.f, stopBasedTripPlannerUiSpecs.f) && Dp.m7283equalsimpl0(this.g, stopBasedTripPlannerUiSpecs.g);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.g) + uf0.a(this.f, uf0.a(this.e, r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f4614a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbI = py.i(this.b, this.f4614a, "StopBasedTripPlannerUiSpecs(backgroundColor=", ", contentPadding=", ", searchCardPadding=");
        r30.o(sbI, this.c, ", itineraryCardPadding=", this.d, ", searchCardAndTabSpacing=");
        cb0.t(sbI, strM7289toStringimpl, ", tabAndResultContentSpacing=", strM7289toStringimpl2, ", itineraryCardGap=");
        return vo1.p(sbI, strM7289toStringimpl3, ")");
    }
}
