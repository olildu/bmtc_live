package app.chalo.electricitybill.ui.ebillpaymentsuccess;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent;", "", "StartingIntent", "OkayClickIntent", "ViewInvoiceClickIntent", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent$OkayClickIntent;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent$StartingIntent;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent$ViewInvoiceClickIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EBillPaymentSuccessIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent$OkayClickIntent;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OkayClickIntent extends EBillPaymentSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OkayClickIntent f2583a = new OkayClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent$StartingIntent;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartingIntent extends EBillPaymentSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2584a;
        public final String b;

        public StartingIntent(String eBillAppModel, String eBillOrderDetails) {
            Intrinsics.i(eBillAppModel, "eBillAppModel");
            Intrinsics.i(eBillOrderDetails, "eBillOrderDetails");
            this.f2584a = eBillAppModel;
            this.b = eBillOrderDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartingIntent)) {
                return false;
            }
            StartingIntent startingIntent = (StartingIntent) obj;
            return Intrinsics.d(this.f2584a, startingIntent.f2584a) && Intrinsics.d(this.b, startingIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f2584a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("StartingIntent(eBillAppModel=", this.f2584a, ", eBillOrderDetails=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent$ViewInvoiceClickIntent;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewInvoiceClickIntent extends EBillPaymentSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewInvoiceClickIntent f2585a = new ViewInvoiceClickIntent();
    }
}
