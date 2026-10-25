package app.chalo.electricitybill.ui.invoice;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/invoice/ElectricityBillPaymentInvoiceUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ElectricityBillPaymentInvoiceUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f2592a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;

    public ElectricityBillPaymentInvoiceUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().i, 1);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        this.f2592a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityBillPaymentInvoiceUISpecs)) {
            return false;
        }
        ElectricityBillPaymentInvoiceUISpecs electricityBillPaymentInvoiceUISpecs = (ElectricityBillPaymentInvoiceUISpecs) obj;
        return Intrinsics.d(this.f2592a, electricityBillPaymentInvoiceUISpecs.f2592a) && Intrinsics.d(this.b, electricityBillPaymentInvoiceUISpecs.b) && Intrinsics.d(this.c, electricityBillPaymentInvoiceUISpecs.c) && Intrinsics.d(this.d, electricityBillPaymentInvoiceUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, r30.c(this.b, this.f2592a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbI = py.i(this.b, this.f2592a, "ElectricityBillPaymentInvoiceUISpecs(backgroundColor=", ", screenPadding=", ", dividerPadding=");
        sbI.append(this.c);
        sbI.append(", zigZagPadding=");
        sbI.append(this.d);
        sbI.append(")");
        return sbI.toString();
    }
}
