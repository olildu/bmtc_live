package app.chalo.livetracking.search.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/NearestStopsBottomSheetUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearestStopsBottomSheetUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4509a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final ChaloPadding e;

    public NearestStopsBottomSheetUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        float f = ChaloThemeHelper.a().f1916a;
        float f2 = ChaloThemeHelper.a().f1916a;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().f1916a;
        float f4 = ChaloThemeHelper.a().i;
        float f5 = ChaloThemeHelper.a().i;
        float f6 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding3 = new ChaloPadding(f5, f6, f6, f5);
        this.f4509a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f3;
        this.d = f4;
        this.e = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearestStopsBottomSheetUISpec)) {
            return false;
        }
        NearestStopsBottomSheetUISpec nearestStopsBottomSheetUISpec = (NearestStopsBottomSheetUISpec) obj;
        return Intrinsics.d(this.f4509a, nearestStopsBottomSheetUISpec.f4509a) && Intrinsics.d(this.b, nearestStopsBottomSheetUISpec.b) && Dp.m7283equalsimpl0(this.c, nearestStopsBottomSheetUISpec.c) && Dp.m7283equalsimpl0(this.d, nearestStopsBottomSheetUISpec.d) && Intrinsics.d(this.e, nearestStopsBottomSheetUISpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f4509a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbM = pk0.m("NearestStopsBottomSheetUISpec(headerPadding=", this.f4509a, ", listPadding=", this.b, ", itemSpacing=");
        cb0.t(sbM, strM7289toStringimpl, ", headerAndItemListSpacing=", strM7289toStringimpl2, ", searchFieldPadding=");
        return py.e(sbM, this.e, ")");
    }
}
