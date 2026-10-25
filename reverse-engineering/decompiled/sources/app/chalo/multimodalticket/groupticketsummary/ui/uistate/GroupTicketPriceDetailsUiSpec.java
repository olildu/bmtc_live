package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketPriceDetailsUiSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketPriceDetailsUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5916a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public GroupTicketPriceDetailsUiSpec() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        float f3 = ChaloThemeHelper.a().i;
        float f4 = ChaloThemeHelper.a().h;
        float f5 = ChaloThemeHelper.a().g;
        float f6 = ChaloThemeHelper.a().g;
        float f7 = ChaloThemeHelper.a().h;
        float f8 = ChaloThemeHelper.a().d;
        float f9 = ChaloThemeHelper.a().h;
        this.f5916a = chaloPadding;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
        this.g = f8;
        this.h = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketPriceDetailsUiSpec)) {
            return false;
        }
        GroupTicketPriceDetailsUiSpec groupTicketPriceDetailsUiSpec = (GroupTicketPriceDetailsUiSpec) obj;
        return Intrinsics.d(this.f5916a, groupTicketPriceDetailsUiSpec.f5916a) && Dp.m7283equalsimpl0(this.b, groupTicketPriceDetailsUiSpec.b) && Dp.m7283equalsimpl0(this.c, groupTicketPriceDetailsUiSpec.c) && Dp.m7283equalsimpl0(this.d, groupTicketPriceDetailsUiSpec.d) && Dp.m7283equalsimpl0(this.e, groupTicketPriceDetailsUiSpec.e) && Dp.m7283equalsimpl0(this.f, groupTicketPriceDetailsUiSpec.f) && Dp.m7283equalsimpl0(this.g, groupTicketPriceDetailsUiSpec.g) && Dp.m7283equalsimpl0(this.h, groupTicketPriceDetailsUiSpec.h);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.h) + uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f5916a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl7 = Dp.m7289toStringimpl(this.h);
        StringBuilder sbN = t10.n("GroupTicketPriceDetailsUiSpec(sectionPadding=", this.f5916a, ", titleAndLegFareListSpacing=", strM7289toStringimpl, ", legFareItemSpacing=");
        cb0.t(sbN, strM7289toStringimpl2, ", legFareAndBreakupSpacing=", strM7289toStringimpl3, ", legFareBreakupItemSpacing=");
        cb0.t(sbN, strM7289toStringimpl4, ", legFareBreakupIndent=", strM7289toStringimpl5, ", legFareLabelAndIconSpacing=");
        return r30.i(sbN, strM7289toStringimpl6, ", dividerVerticalSpacing=", strM7289toStringimpl7, ")");
    }
}
