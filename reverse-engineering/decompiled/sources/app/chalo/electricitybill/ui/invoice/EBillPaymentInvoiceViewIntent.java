package app.chalo.electricitybill.ui.invoice;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceViewIntent;", "", "InitialIntent", "Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceViewIntent$InitialIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EBillPaymentInvoiceViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceViewIntent$InitialIntent;", "Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends EBillPaymentInvoiceViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2590a;

        public InitialIntent(String invoice) {
            Intrinsics.i(invoice, "invoice");
            this.f2590a = invoice;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialIntent) && Intrinsics.d(this.f2590a, ((InitialIntent) obj).f2590a);
        }

        public final int hashCode() {
            return this.f2590a.hashCode();
        }

        public final String toString() {
            return vo1.B("InitialIntent(invoice=", this.f2590a, ")");
        }
    }
}
