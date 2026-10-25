package app.chalo.checkout.ui.screen.payment;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.dd;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/LowBalanceBottomSheetSpecs;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LowBalanceBottomSheetSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1516a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final UiAlignment.Horizontal g;
    public final ChaloPadding h;

    public LowBalanceBottomSheetSpecs() {
        float f = ChaloThemeHelper.a().n;
        float f2 = ChaloThemeHelper.a().k;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().d;
        float f5 = ChaloThemeHelper.a().i;
        float f6 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().k, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        this.f1516a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = UiAlignment.Horizontal.Center.f9884a;
        this.h = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LowBalanceBottomSheetSpecs)) {
            return false;
        }
        LowBalanceBottomSheetSpecs lowBalanceBottomSheetSpecs = (LowBalanceBottomSheetSpecs) obj;
        return Dp.m7283equalsimpl0(this.f1516a, lowBalanceBottomSheetSpecs.f1516a) && Dp.m7283equalsimpl0(this.b, lowBalanceBottomSheetSpecs.b) && Dp.m7283equalsimpl0(this.c, lowBalanceBottomSheetSpecs.c) && Dp.m7283equalsimpl0(this.d, lowBalanceBottomSheetSpecs.d) && Dp.m7283equalsimpl0(this.e, lowBalanceBottomSheetSpecs.e) && Dp.m7283equalsimpl0(this.f, lowBalanceBottomSheetSpecs.f) && Intrinsics.d(this.g, lowBalanceBottomSheetSpecs.g) && Intrinsics.d(this.h, lowBalanceBottomSheetSpecs.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + uf0.d(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f1516a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f1516a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbE = dd.e("LowBalanceBottomSheetSpecs(buttonHeight=", strM7289toStringimpl, ", spaceBetweenTextAndButton=", strM7289toStringimpl2, ", spaceBetweenTextAndTnc=");
        cb0.t(sbE, strM7289toStringimpl3, ", spaceBetweenWalletBalanceAndAmountText=", strM7289toStringimpl4, ", spaceBetweenGifAndText=");
        cb0.t(sbE, strM7289toStringimpl5, ", contentTopSpacing=", strM7289toStringimpl6, ", horizontalAlignment=");
        sbE.append(this.g);
        sbE.append(", internalPadding=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
