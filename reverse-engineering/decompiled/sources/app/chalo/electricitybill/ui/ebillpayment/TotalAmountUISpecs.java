package app.chalo.electricitybill.ui.ebillpayment;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/TotalAmountUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TotalAmountUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f2579a;
    public final float b;
    public final CardUISpec c;
    public final float d;

    public TotalAmountUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        CardUISpec cardUISpec = new CardUISpec(UIShape.f1926a, ChaloThemeHelper.b().f1917a, ChaloThemeHelper.b().d);
        float f3 = ChaloThemeHelper.a().m;
        this.f2579a = chaloPadding;
        this.b = f2;
        this.c = cardUISpec;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalAmountUISpecs)) {
            return false;
        }
        TotalAmountUISpecs totalAmountUISpecs = (TotalAmountUISpecs) obj;
        return Intrinsics.d(this.f2579a, totalAmountUISpecs.f2579a) && Dp.m7283equalsimpl0(this.b, totalAmountUISpecs.b) && Intrinsics.d(this.c, totalAmountUISpecs.c) && Dp.m7283equalsimpl0(this.d, totalAmountUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + ((this.c.hashCode() + uf0.a(this.b, this.f2579a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbN = t10.n("TotalAmountUISpecs(cardPadding=", this.f2579a, ", amountAndNextBtnSpacing=", strM7289toStringimpl, ", cardUISpec=");
        sbN.append(this.c);
        sbN.append(", payBtnHeight=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(")");
        return sbN.toString();
    }
}
