package app.chalo.electricitybill.ui.invoice;

import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.uistate.divider.DividerUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/invoice/ElectricityBillPaymentInvoiceUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ElectricityBillPaymentInvoiceUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ElectricityBillPaymentInvoiceUISpecs f2593a;
    public final CustomerInfoUIState b;
    public final TransactionInfoUIState c;
    public final TransactionInfoUIState d;
    public final DividerUIState e;

    public ElectricityBillPaymentInvoiceUIState(CustomerInfoUIState customerInfo, TransactionInfoUIState transactionInfo, TransactionInfoUIState transactionInfoUIState, DividerUIState dividerUIState) {
        ElectricityBillPaymentInvoiceUISpecs electricityBillPaymentInvoiceUISpecs = new ElectricityBillPaymentInvoiceUISpecs();
        Intrinsics.i(customerInfo, "customerInfo");
        Intrinsics.i(transactionInfo, "transactionInfo");
        this.f2593a = electricityBillPaymentInvoiceUISpecs;
        this.b = customerInfo;
        this.c = transactionInfo;
        this.d = transactionInfoUIState;
        this.e = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityBillPaymentInvoiceUIState)) {
            return false;
        }
        ElectricityBillPaymentInvoiceUIState electricityBillPaymentInvoiceUIState = (ElectricityBillPaymentInvoiceUIState) obj;
        return Intrinsics.d(this.f2593a, electricityBillPaymentInvoiceUIState.f2593a) && Intrinsics.d(this.b, electricityBillPaymentInvoiceUIState.b) && Intrinsics.d(this.c, electricityBillPaymentInvoiceUIState.c) && Intrinsics.d(this.d, electricityBillPaymentInvoiceUIState.d) && Intrinsics.d(this.e, electricityBillPaymentInvoiceUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f2593a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ElectricityBillPaymentInvoiceUIState(specs=" + this.f2593a + ", customerInfo=" + this.b + ", transactionInfo=" + this.c + ", totalAmount=" + this.d + ", divider=" + this.e + ")";
    }
}
