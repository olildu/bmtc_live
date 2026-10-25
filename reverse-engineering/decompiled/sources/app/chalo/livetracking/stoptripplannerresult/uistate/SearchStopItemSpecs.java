package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/SearchStopItemSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchStopItemSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4609a;
    public final float b;
    public final ChaloColorToken c;
    public final UIShape d;
    public final float e;
    public final UiAlignment.Vertical f;
    public final float g;

    public SearchStopItemSpecs(ChaloPadding chaloPadding, int i) {
        if ((i & 1) != 0) {
            float f = ChaloThemeHelper.a().d;
            chaloPadding = new ChaloPadding(f, f, f, f);
        }
        float f2 = ChaloThemeHelper.a().j;
        UIShape.Rectangle shape = UIShape.d;
        float f3 = ChaloThemeHelper.a().p;
        float f4 = ChaloThemeHelper.a().h;
        Intrinsics.i(shape, "shape");
        this.f4609a = chaloPadding;
        this.b = f2;
        this.c = ChaloColorToken.SectionDividerColor.f9849a;
        this.d = shape;
        this.e = f3;
        this.f = UiAlignment.Vertical.Center.f9888a;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchStopItemSpecs)) {
            return false;
        }
        SearchStopItemSpecs searchStopItemSpecs = (SearchStopItemSpecs) obj;
        return Intrinsics.d(this.f4609a, searchStopItemSpecs.f4609a) && Dp.m7283equalsimpl0(this.b, searchStopItemSpecs.b) && Intrinsics.d(this.c, searchStopItemSpecs.c) && Intrinsics.d(this.d, searchStopItemSpecs.d) && Dp.m7283equalsimpl0(this.e, searchStopItemSpecs.e) && Intrinsics.d(this.f, searchStopItemSpecs.f) && Dp.m7283equalsimpl0(this.g, searchStopItemSpecs.g);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.g) + uf0.e(this.f, uf0.a(this.e, pk0.b(this.d, z40.b(this.c, uf0.a(this.b, this.f4609a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbN = t10.n("SearchStopItemSpecs(padding=", this.f4609a, ", stopStartSpacing=", strM7289toStringimpl, ", backgroundColor=");
        sbN.append(this.c);
        sbN.append(", shape=");
        sbN.append(this.d);
        sbN.append(", cardHeight=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", contentAlignment=");
        sbN.append(this.f);
        sbN.append(", stopAndIconSpacing=");
        return vo1.p(sbN, strM7289toStringimpl3, ")");
    }
}
