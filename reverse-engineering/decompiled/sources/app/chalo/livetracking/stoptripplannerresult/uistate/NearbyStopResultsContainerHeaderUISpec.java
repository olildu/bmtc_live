package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/NearbyStopResultsContainerHeaderUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopResultsContainerHeaderUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4598a;
    public final float b;
    public final UIShape c;
    public final ChaloColorToken d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public NearbyStopResultsContainerHeaderUISpec() {
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().d;
        UIShape.Rectangle shape = UIShape.e;
        Intrinsics.i(shape, "shape");
        this.f4598a = chaloPadding;
        this.b = f2;
        this.c = shape;
        this.d = ChaloColorToken.Orange2.f9830a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopResultsContainerHeaderUISpec)) {
            return false;
        }
        NearbyStopResultsContainerHeaderUISpec nearbyStopResultsContainerHeaderUISpec = (NearbyStopResultsContainerHeaderUISpec) obj;
        return Intrinsics.d(this.f4598a, nearbyStopResultsContainerHeaderUISpec.f4598a) && Dp.m7283equalsimpl0(this.b, nearbyStopResultsContainerHeaderUISpec.b) && Intrinsics.d(this.c, nearbyStopResultsContainerHeaderUISpec.c) && Intrinsics.d(this.d, nearbyStopResultsContainerHeaderUISpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pk0.b(this.c, uf0.a(this.b, this.f4598a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("NearbyStopResultsContainerHeaderUISpec(contentPadding=", this.f4598a, ", iconAndTextSpacing=", Dp.m7289toStringimpl(this.b), ", shape=");
        sbN.append(this.c);
        sbN.append(", background=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
