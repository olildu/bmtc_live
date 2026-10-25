package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t10;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/OriginDestinationSearchbarSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OriginDestinationSearchbarSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4604a;
    public final float b;
    public final float c;

    public OriginDestinationSearchbarSpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 0.0f, 0.0f, 13);
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().h;
        this.f4604a = chaloPadding;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginDestinationSearchbarSpecs)) {
            return false;
        }
        OriginDestinationSearchbarSpecs originDestinationSearchbarSpecs = (OriginDestinationSearchbarSpecs) obj;
        return Intrinsics.d(this.f4604a, originDestinationSearchbarSpecs.f4604a) && Dp.m7283equalsimpl0(this.b, originDestinationSearchbarSpecs.b) && Dp.m7283equalsimpl0(this.c, originDestinationSearchbarSpecs.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + uf0.a(this.b, this.f4604a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return vo1.p(t10.n("OriginDestinationSearchbarSpecs(sideIndicatorStartPadding=", this.f4604a, ", spacingBetweenStops=", strM7289toStringimpl, ", swapButtonImageEndSpacing="), Dp.m7289toStringimpl(this.c), ")");
    }
}
