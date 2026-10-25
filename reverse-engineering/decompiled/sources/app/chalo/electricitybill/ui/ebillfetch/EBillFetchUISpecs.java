package app.chalo.electricitybill.ui.ebillfetch;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillFetchUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f2567a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final UiAlignment.Horizontal h;

    public EBillFetchUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().g;
        float f4 = ChaloThemeHelper.a().k;
        float f5 = ChaloThemeHelper.a().h;
        float f6 = ChaloThemeHelper.a().m;
        this.f2567a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = UiAlignment.Horizontal.Center.f9884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillFetchUISpecs)) {
            return false;
        }
        EBillFetchUISpecs eBillFetchUISpecs = (EBillFetchUISpecs) obj;
        return Intrinsics.d(this.f2567a, eBillFetchUISpecs.f2567a) && Dp.m7283equalsimpl0(this.b, eBillFetchUISpecs.b) && Dp.m7283equalsimpl0(this.c, eBillFetchUISpecs.c) && Dp.m7283equalsimpl0(this.d, eBillFetchUISpecs.d) && Dp.m7283equalsimpl0(this.e, eBillFetchUISpecs.e) && Dp.m7283equalsimpl0(this.f, eBillFetchUISpecs.f) && Dp.m7283equalsimpl0(this.g, eBillFetchUISpecs.g) && Intrinsics.d(this.h, eBillFetchUISpecs.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f2567a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbN = t10.n("EBillFetchUISpecs(screenPadding=", this.f2567a, ", titleAndSubTitleSpacing=", strM7289toStringimpl, ", subTitleAndTextFieldSpacing=");
        cb0.t(sbN, strM7289toStringimpl2, ", textFieldAndErrorTextSpacing=", strM7289toStringimpl3, ", errorTextAndButtonSpacing=");
        cb0.t(sbN, strM7289toStringimpl4, ", proceedBtnAndViewHistoryBtnSpacing=", strM7289toStringimpl5, ", proceedBtnHeight=");
        sbN.append(strM7289toStringimpl6);
        sbN.append(", viewHistoryBtnAlignment=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
