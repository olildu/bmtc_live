package app.chalo.livetracking.search.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedTripPlannerSearchUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f4521a;
    public final ChaloPadding b;
    public final BgHighlightType c;
    public final float d;
    public final ChaloPadding e;
    public final float f;
    public final float g;
    public final ChaloPadding h;
    public final float i;
    public final float j;

    public StopBasedTripPlannerSearchUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        BgHighlightType gradientBackgroundType = BgHighlightType.CIRCLE;
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().m, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d);
        float f4 = ChaloThemeHelper.a().h;
        Intrinsics.i(gradientBackgroundType, "gradientBackgroundType");
        this.f4521a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = gradientBackgroundType;
        this.d = f;
        this.e = chaloPadding2;
        this.f = f2;
        this.g = f3;
        this.h = chaloPadding3;
        this.i = fM7278constructorimpl;
        this.j = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedTripPlannerSearchUISpec)) {
            return false;
        }
        StopBasedTripPlannerSearchUISpec stopBasedTripPlannerSearchUISpec = (StopBasedTripPlannerSearchUISpec) obj;
        return Intrinsics.d(this.f4521a, stopBasedTripPlannerSearchUISpec.f4521a) && Intrinsics.d(this.b, stopBasedTripPlannerSearchUISpec.b) && this.c == stopBasedTripPlannerSearchUISpec.c && Dp.m7283equalsimpl0(this.d, stopBasedTripPlannerSearchUISpec.d) && Intrinsics.d(this.e, stopBasedTripPlannerSearchUISpec.e) && Dp.m7283equalsimpl0(this.f, stopBasedTripPlannerSearchUISpec.f) && Dp.m7283equalsimpl0(this.g, stopBasedTripPlannerSearchUISpec.g) && Intrinsics.d(this.h, stopBasedTripPlannerSearchUISpec.h) && Dp.m7283equalsimpl0(this.i, stopBasedTripPlannerSearchUISpec.i) && Dp.m7283equalsimpl0(this.j, stopBasedTripPlannerSearchUISpec.j);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.j) + uf0.a(this.i, r30.c(this.h, uf0.a(this.g, uf0.a(this.f, r30.c(this.e, uf0.a(this.d, (this.c.hashCode() + r30.c(this.b, this.f4521a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.i);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.j);
        StringBuilder sbI = py.i(this.b, this.f4521a, "StopBasedTripPlannerSearchUISpec(backgroundColor=", ", contentPadding=", ", gradientBackgroundType=");
        sbI.append(this.c);
        sbI.append(", toolBarAndFromToSelectionSpacing=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", fromToSelectionContainerPadding=");
        py.u(sbI, this.e, ", currentLocationAndFromToSelectionSpacing=", strM7289toStringimpl2, ", recentTripsAndCurrentLocationSpacing=");
        sbI.append(strM7289toStringimpl3);
        sbI.append(", helpTextPadding=");
        sbI.append(this.h);
        sbI.append(", whatToSearchSectionTopSpacing=");
        return r30.i(sbI, strM7289toStringimpl4, ", whatToSearchSectionBottomSpacing=", strM7289toStringimpl5, ")");
    }
}
