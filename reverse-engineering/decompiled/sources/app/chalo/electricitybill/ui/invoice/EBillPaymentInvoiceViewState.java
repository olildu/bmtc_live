package app.chalo.electricitybill.ui.invoice;

import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillPaymentInvoiceViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EBillPaymentInvoiceUISpecs f2591a;
    public final ToolbarUIState b;
    public final ElectricityBillPaymentInvoiceUIState c;

    public EBillPaymentInvoiceViewState(ToolbarUIState toolbar, ElectricityBillPaymentInvoiceUIState electricityBillPaymentInvoiceUIState) {
        EBillPaymentInvoiceUISpecs eBillPaymentInvoiceUISpecs = new EBillPaymentInvoiceUISpecs();
        Intrinsics.i(toolbar, "toolbar");
        this.f2591a = eBillPaymentInvoiceUISpecs;
        this.b = toolbar;
        this.c = electricityBillPaymentInvoiceUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillPaymentInvoiceViewState)) {
            return false;
        }
        EBillPaymentInvoiceViewState eBillPaymentInvoiceViewState = (EBillPaymentInvoiceViewState) obj;
        return Intrinsics.d(this.f2591a, eBillPaymentInvoiceViewState.f2591a) && Intrinsics.d(this.b, eBillPaymentInvoiceViewState.b) && Intrinsics.d(this.c, eBillPaymentInvoiceViewState.c);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f2591a.f2589a.hashCode() * 31, 31);
        ElectricityBillPaymentInvoiceUIState electricityBillPaymentInvoiceUIState = this.c;
        return iD + (electricityBillPaymentInvoiceUIState == null ? 0 : electricityBillPaymentInvoiceUIState.hashCode());
    }

    public final String toString() {
        return "EBillPaymentInvoiceViewState(specs=" + this.f2591a + ", toolbar=" + this.b + ", invoice=" + this.c + ")";
    }
}
