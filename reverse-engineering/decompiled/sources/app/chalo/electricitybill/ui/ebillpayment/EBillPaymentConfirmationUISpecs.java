package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillPaymentConfirmationUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f2577a;
    public final ChaloPadding b;

    public EBillPaymentConfirmationUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        this.f2577a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillPaymentConfirmationUISpecs)) {
            return false;
        }
        EBillPaymentConfirmationUISpecs eBillPaymentConfirmationUISpecs = (EBillPaymentConfirmationUISpecs) obj;
        return Intrinsics.d(this.f2577a, eBillPaymentConfirmationUISpecs.f2577a) && Intrinsics.d(this.b, eBillPaymentConfirmationUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2577a.hashCode() * 31);
    }

    public final String toString() {
        return "EBillPaymentConfirmationUISpecs(backgroundColor=" + this.f2577a + ", titlePadding=" + this.b + ")";
    }
}
