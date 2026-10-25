package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.cb0;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/LiveTrackingNotSupportedBottomSheetUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveTrackingNotSupportedBottomSheetUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4595a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public LiveTrackingNotSupportedBottomSheetUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().g, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().e;
        float f5 = ChaloThemeHelper.a().d;
        this.f4595a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveTrackingNotSupportedBottomSheetUISpec)) {
            return false;
        }
        LiveTrackingNotSupportedBottomSheetUISpec liveTrackingNotSupportedBottomSheetUISpec = (LiveTrackingNotSupportedBottomSheetUISpec) obj;
        return Intrinsics.d(this.f4595a, liveTrackingNotSupportedBottomSheetUISpec.f4595a) && Dp.m7283equalsimpl0(this.b, liveTrackingNotSupportedBottomSheetUISpec.b) && Dp.m7283equalsimpl0(this.c, liveTrackingNotSupportedBottomSheetUISpec.c) && Dp.m7283equalsimpl0(this.d, liveTrackingNotSupportedBottomSheetUISpec.d) && Dp.m7283equalsimpl0(this.e, liveTrackingNotSupportedBottomSheetUISpec.e) && Dp.m7283equalsimpl0(this.f, liveTrackingNotSupportedBottomSheetUISpec.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f4595a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbN = t10.n("LiveTrackingNotSupportedBottomSheetUISpec(contentPadding=", this.f4595a, ", closeIconAndTitleSpacing=", strM7289toStringimpl, ", boardingStopIconAndTextSpacing=");
        cb0.t(sbN, strM7289toStringimpl2, ", dividerTopAndBottomSpacing=", strM7289toStringimpl3, ", boardingStopContainerAndBusInfoSpacing=");
        return r30.i(sbN, strM7289toStringimpl4, ", busInfoAndCtaContainerSpacing=", strM7289toStringimpl5, ")");
    }
}
