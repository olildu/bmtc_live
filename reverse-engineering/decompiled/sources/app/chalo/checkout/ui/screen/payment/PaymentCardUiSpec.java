package app.chalo.checkout.ui.screen.payment;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentCardUiSpec;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentCardUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f1528a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final UIShape d;
    public final ChaloColorToken e;
    public final ChaloPadding f;
    public final UiAlignment.Horizontal g;

    public PaymentCardUiSpec(ChaloPadding chaloPadding, ChaloPadding chaloPadding2, ChaloPadding chaloPadding3, UIShape cardShape, int i) {
        chaloPadding = (i & 1) != 0 ? new ChaloPadding(0.0f, 0.0f, 3) : chaloPadding;
        chaloPadding2 = (i & 2) != 0 ? new ChaloPadding(0.0f, 0.0f, 3) : chaloPadding2;
        chaloPadding3 = (i & 4) != 0 ? new ChaloPadding(0.0f, 0.0f, 3) : chaloPadding3;
        cardShape = (i & 8) != 0 ? UIShape.c : cardShape;
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding4 = new ChaloPadding(f, f, f, f);
        Intrinsics.i(cardShape, "cardShape");
        this.f1528a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = cardShape;
        this.e = ChaloColorToken.White.f9870a;
        this.f = chaloPadding4;
        this.g = UiAlignment.Horizontal.Start.f9886a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCardUiSpec)) {
            return false;
        }
        PaymentCardUiSpec paymentCardUiSpec = (PaymentCardUiSpec) obj;
        return Intrinsics.d(this.f1528a, paymentCardUiSpec.f1528a) && Intrinsics.d(this.b, paymentCardUiSpec.b) && Intrinsics.d(this.c, paymentCardUiSpec.c) && Intrinsics.d(this.d, paymentCardUiSpec.d) && Intrinsics.d(this.e, paymentCardUiSpec.e) && Intrinsics.d(this.f, paymentCardUiSpec.f) && Intrinsics.d(this.g, paymentCardUiSpec.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + r30.c(this.f, z40.b(this.e, pk0.b(this.d, r30.c(this.c, r30.c(this.b, this.f1528a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("PaymentCardUiSpec(internalPadding=", this.f1528a, ", warningStatePadding=", this.b, ", cardListItemPadding=");
        sbM.append(this.c);
        sbM.append(", cardShape=");
        sbM.append(this.d);
        sbM.append(", backGroundColorToken=");
        sbM.append(this.e);
        sbM.append(", dividerPadding=");
        sbM.append(this.f);
        sbM.append(", horizontalAlignment=");
        sbM.append(this.g);
        sbM.append(")");
        return sbM.toString();
    }
}
