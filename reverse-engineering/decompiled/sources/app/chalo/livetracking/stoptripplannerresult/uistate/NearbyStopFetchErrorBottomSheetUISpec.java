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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/NearbyStopFetchErrorBottomSheetUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopFetchErrorBottomSheetUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4596a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public NearbyStopFetchErrorBottomSheetUISpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().g;
        float f3 = ChaloThemeHelper.a().k;
        float f4 = ChaloThemeHelper.a().d;
        float f5 = ChaloThemeHelper.a().k;
        float f6 = ChaloThemeHelper.a().i;
        this.f4596a = chaloPadding;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopFetchErrorBottomSheetUISpec)) {
            return false;
        }
        NearbyStopFetchErrorBottomSheetUISpec nearbyStopFetchErrorBottomSheetUISpec = (NearbyStopFetchErrorBottomSheetUISpec) obj;
        return Intrinsics.d(this.f4596a, nearbyStopFetchErrorBottomSheetUISpec.f4596a) && Dp.m7283equalsimpl0(this.b, nearbyStopFetchErrorBottomSheetUISpec.b) && Dp.m7283equalsimpl0(this.c, nearbyStopFetchErrorBottomSheetUISpec.c) && Dp.m7283equalsimpl0(this.d, nearbyStopFetchErrorBottomSheetUISpec.d) && Dp.m7283equalsimpl0(this.e, nearbyStopFetchErrorBottomSheetUISpec.e) && Dp.m7283equalsimpl0(this.f, nearbyStopFetchErrorBottomSheetUISpec.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f4596a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbN = t10.n("NearbyStopFetchErrorBottomSheetUISpec(contentPadding=", this.f4596a, ", closeIconAndImageSpacing=", strM7289toStringimpl, ", iconAndTextSpacing=");
        cb0.t(sbN, strM7289toStringimpl2, ", titleAndSubtitleSpacing=", strM7289toStringimpl3, ", subTitleAndReloadTextSpacing=");
        return r30.i(sbN, strM7289toStringimpl4, ", reloadTextAndSearchFieldSpacing=", strM7289toStringimpl5, ")");
    }
}
