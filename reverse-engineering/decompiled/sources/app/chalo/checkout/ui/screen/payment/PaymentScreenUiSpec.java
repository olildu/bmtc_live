package app.chalo.checkout.ui.screen.payment;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentScreenUiSpec;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentScreenUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f1546a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final UiAlignment.BiasAlignment d;

    public PaymentScreenUiSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().k, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        this.f1546a = ChaloColorToken.White.f9870a;
        this.b = ChaloColorToken.ActivityBackground.f9755a;
        this.c = chaloPadding;
        this.d = UiAlignment.BiasAlignment.Center.f9878a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentScreenUiSpec)) {
            return false;
        }
        PaymentScreenUiSpec paymentScreenUiSpec = (PaymentScreenUiSpec) obj;
        return Intrinsics.d(this.f1546a, paymentScreenUiSpec.f1546a) && Intrinsics.d(this.b, paymentScreenUiSpec.b) && Intrinsics.d(this.c, paymentScreenUiSpec.c) && Intrinsics.d(this.d, paymentScreenUiSpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, z40.b(this.b, this.f1546a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PaymentScreenUiSpec(bottomSheetBaseBackground=" + this.f1546a + ", paymentScreenBackground=" + this.b + ", paymentStatusBottomSheetPadding=" + this.c + ", fullScreenLoaderAlignment=" + this.d + ")";
    }
}
