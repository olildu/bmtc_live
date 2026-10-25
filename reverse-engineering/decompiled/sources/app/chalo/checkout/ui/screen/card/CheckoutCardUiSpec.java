package app.chalo.checkout.ui.screen.card;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardUiSpec;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckoutCardUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken.White f1441a;
    public final ChaloPadding b;
    public final CardBottomCtaUiSpec c;
    public final float d;

    public CheckoutCardUiSpec(ChaloPadding chaloPadding, CardBottomCtaUiSpec cardBottomCtaUiSpec) {
        float f = ChaloThemeHelper.a().h;
        this.f1441a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = cardBottomCtaUiSpec;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutCardUiSpec)) {
            return false;
        }
        CheckoutCardUiSpec checkoutCardUiSpec = (CheckoutCardUiSpec) obj;
        return Intrinsics.d(this.f1441a, checkoutCardUiSpec.f1441a) && Intrinsics.d(this.b, checkoutCardUiSpec.b) && Intrinsics.d(this.c, checkoutCardUiSpec.c) && Dp.m7283equalsimpl0(this.d, checkoutCardUiSpec.d);
    }

    public final int hashCode() {
        this.f1441a.getClass();
        return Dp.m7284hashCodeimpl(this.d) + ((this.c.hashCode() + r30.c(this.b, 1218434400, 31)) * 31);
    }

    public final String toString() {
        return "CheckoutCardUiSpec(backgroundColor=" + this.f1441a + ", internalPadding=" + this.b + ", cardBottomCtaUiSpec=" + this.c + ", spaceBetweenTextFields=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
