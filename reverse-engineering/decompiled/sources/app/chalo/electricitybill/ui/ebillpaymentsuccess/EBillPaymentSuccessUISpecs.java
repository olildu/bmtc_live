package app.chalo.electricitybill.ui.ebillpaymentsuccess;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.cb0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillPaymentSuccessUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f2586a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final ChaloPadding e;
    public final float f;
    public final float g;
    public final UiAlignment.BiasAlignment h;
    public final UiAlignment.Horizontal i;
    public final UiArrangement.HorizontalOrVertical j;
    public final UiAlignment.BiasAlignment k;

    public EBillPaymentSuccessUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().l;
        float f3 = ChaloThemeHelper.a().l;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 2);
        float f4 = ChaloThemeHelper.a().n;
        float f5 = ChaloThemeHelper.a().h;
        this.f2586a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f2;
        this.d = f3;
        this.e = chaloPadding2;
        this.f = f4;
        this.g = f5;
        this.h = UiAlignment.BiasAlignment.Center.f9878a;
        this.i = UiAlignment.Horizontal.Center.f9884a;
        this.j = UiArrangement.HorizontalOrVertical.Center.f9890a;
        this.k = UiAlignment.BiasAlignment.BottomCenter.f9875a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillPaymentSuccessUISpecs)) {
            return false;
        }
        EBillPaymentSuccessUISpecs eBillPaymentSuccessUISpecs = (EBillPaymentSuccessUISpecs) obj;
        return Intrinsics.d(this.f2586a, eBillPaymentSuccessUISpecs.f2586a) && Intrinsics.d(this.b, eBillPaymentSuccessUISpecs.b) && Dp.m7283equalsimpl0(this.c, eBillPaymentSuccessUISpecs.c) && Dp.m7283equalsimpl0(this.d, eBillPaymentSuccessUISpecs.d) && Intrinsics.d(this.e, eBillPaymentSuccessUISpecs.e) && Dp.m7283equalsimpl0(this.f, eBillPaymentSuccessUISpecs.f) && Dp.m7283equalsimpl0(this.g, eBillPaymentSuccessUISpecs.g) && Intrinsics.d(this.h, eBillPaymentSuccessUISpecs.h) && Intrinsics.d(this.i, eBillPaymentSuccessUISpecs.i) && Intrinsics.d(this.j, eBillPaymentSuccessUISpecs.j) && Intrinsics.d(this.k, eBillPaymentSuccessUISpecs.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + uf0.d(this.i, (this.h.hashCode() + uf0.a(this.g, uf0.a(this.f, r30.c(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f2586a.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbI = py.i(this.b, this.f2586a, "EBillPaymentSuccessUISpecs(backgroundColor=", ", screenPadding=", ", imgAndTitleSpacing=");
        cb0.t(sbI, strM7289toStringimpl, ", titleAndMessageSpacing=", strM7289toStringimpl2, ", msgPadding=");
        py.u(sbI, this.e, ", btnHeight=", strM7289toStringimpl3, ", btnSpacing=");
        sbI.append(strM7289toStringimpl4);
        sbI.append(", contentAlignment=");
        sbI.append(this.h);
        sbI.append(", horizontalAlignment=");
        sbI.append(this.i);
        sbI.append(", verticalArrangement=");
        sbI.append(this.j);
        sbI.append(", buttonAlignment=");
        sbI.append(this.k);
        sbI.append(")");
        return sbI.toString();
    }
}
