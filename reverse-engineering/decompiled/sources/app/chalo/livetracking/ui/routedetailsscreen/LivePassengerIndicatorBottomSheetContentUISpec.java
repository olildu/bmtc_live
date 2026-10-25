package app.chalo.livetracking.ui.routedetailsscreen;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/LivePassengerIndicatorBottomSheetContentUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LivePassengerIndicatorBottomSheetContentUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f4811a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final float e;

    public LivePassengerIndicatorBottomSheetContentUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().g;
        float f3 = ChaloThemeHelper.a().g;
        this.f4811a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePassengerIndicatorBottomSheetContentUISpec)) {
            return false;
        }
        LivePassengerIndicatorBottomSheetContentUISpec livePassengerIndicatorBottomSheetContentUISpec = (LivePassengerIndicatorBottomSheetContentUISpec) obj;
        return Intrinsics.d(this.f4811a, livePassengerIndicatorBottomSheetContentUISpec.f4811a) && Intrinsics.d(this.b, livePassengerIndicatorBottomSheetContentUISpec.b) && Dp.m7283equalsimpl0(this.c, livePassengerIndicatorBottomSheetContentUISpec.c) && Dp.m7283equalsimpl0(this.d, livePassengerIndicatorBottomSheetContentUISpec.d) && Dp.m7283equalsimpl0(this.e, livePassengerIndicatorBottomSheetContentUISpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f4811a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbI = py.i(this.b, this.f4811a, "LivePassengerIndicatorBottomSheetContentUISpec(containerBackgroundColor=", ", contentPadding=", ", spaceBetweenTitleAndAvlLevels=");
        cb0.t(sbI, strM7289toStringimpl, ", spaceBetweenAvlLevels=", strM7289toStringimpl2, ", spaceBeforeNoticeText=");
        return vo1.p(sbI, strM7289toStringimpl3, ")");
    }
}
