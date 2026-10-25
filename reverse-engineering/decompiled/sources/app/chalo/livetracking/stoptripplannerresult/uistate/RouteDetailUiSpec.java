package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.vo1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/RouteDetailUiSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4607a;
    public final float b;

    public RouteDetailUiSpec() {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().e;
        this.f4607a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailUiSpec)) {
            return false;
        }
        RouteDetailUiSpec routeDetailUiSpec = (RouteDetailUiSpec) obj;
        return Dp.m7283equalsimpl0(this.f4607a, routeDetailUiSpec.f4607a) && Dp.m7283equalsimpl0(this.b, routeDetailUiSpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (Dp.m7284hashCodeimpl(this.f4607a) * 31);
    }

    public final String toString() {
        return vo1.o("RouteDetailUiSpec(fromAndToStopSpacing=", Dp.m7289toStringimpl(this.f4607a), ", imageAndTextSpacing=", Dp.m7289toStringimpl(this.b), ")");
    }
}
