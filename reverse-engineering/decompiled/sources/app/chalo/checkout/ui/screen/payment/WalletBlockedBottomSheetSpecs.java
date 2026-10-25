package app.chalo.checkout.ui.screen.payment;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/WalletBlockedBottomSheetSpecs;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletBlockedBottomSheetSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f1578a;
    public final UiAlignment.Horizontal b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public WalletBlockedBottomSheetSpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().k, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().i;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().h;
        this.f1578a = chaloPadding;
        this.b = UiAlignment.Horizontal.Center.f9884a;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletBlockedBottomSheetSpecs)) {
            return false;
        }
        WalletBlockedBottomSheetSpecs walletBlockedBottomSheetSpecs = (WalletBlockedBottomSheetSpecs) obj;
        return Intrinsics.d(this.f1578a, walletBlockedBottomSheetSpecs.f1578a) && Intrinsics.d(this.b, walletBlockedBottomSheetSpecs.b) && Dp.m7283equalsimpl0(this.c, walletBlockedBottomSheetSpecs.c) && Dp.m7283equalsimpl0(this.d, walletBlockedBottomSheetSpecs.d) && Dp.m7283equalsimpl0(this.e, walletBlockedBottomSheetSpecs.e) && Dp.m7283equalsimpl0(this.f, walletBlockedBottomSheetSpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.d(this.b, this.f1578a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("WalletBlockedBottomSheetSpecs(internalPadding=");
        sb.append(this.f1578a);
        sb.append(", horizontalAlignment=");
        sb.append(this.b);
        sb.append(", spaceBetweenImageAndText=");
        cb0.t(sb, strM7289toStringimpl, ", spaceBetweenTextAndButton=", strM7289toStringimpl2, ", contentTopSpacing=");
        return r30.i(sb, strM7289toStringimpl3, ", spaceBetweenTitleAndSubTitle=", strM7289toStringimpl4, ")");
    }
}
