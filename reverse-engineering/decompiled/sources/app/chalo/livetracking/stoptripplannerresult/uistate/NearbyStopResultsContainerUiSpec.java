package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/NearbyStopResultsContainerUiSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopResultsContainerUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4600a;
    public final ChaloPadding b;
    public final float c;
    public final float d;

    public NearbyStopResultsContainerUiSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        this.f4600a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopResultsContainerUiSpec)) {
            return false;
        }
        NearbyStopResultsContainerUiSpec nearbyStopResultsContainerUiSpec = (NearbyStopResultsContainerUiSpec) obj;
        return Intrinsics.d(this.f4600a, nearbyStopResultsContainerUiSpec.f4600a) && Intrinsics.d(this.b, nearbyStopResultsContainerUiSpec.b) && Dp.m7283equalsimpl0(this.c, nearbyStopResultsContainerUiSpec.c) && Dp.m7283equalsimpl0(this.d, nearbyStopResultsContainerUiSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, r30.c(this.b, this.f4600a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return r30.i(pk0.m("NearbyStopResultsContainerUiSpec(contentPadding=", this.f4600a, ", headerOuterPadding=", this.b, ", headerAndListSpacing="), Dp.m7289toStringimpl(this.c), ", itineraryCardGap=", Dp.m7289toStringimpl(this.d), ")");
    }
}
