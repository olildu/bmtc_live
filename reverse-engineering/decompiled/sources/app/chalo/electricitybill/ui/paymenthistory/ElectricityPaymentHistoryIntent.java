package app.chalo.electricitybill.ui.paymenthistory;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent;", "", "LoadPaymentHistory", "RetryFetchPaymentHistory", "PaymentHistoryClicked", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent$LoadPaymentHistory;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent$PaymentHistoryClicked;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent$RetryFetchPaymentHistory;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ElectricityPaymentHistoryIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent$LoadPaymentHistory;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoadPaymentHistory extends ElectricityPaymentHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadPaymentHistory f2599a = new LoadPaymentHistory();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent$PaymentHistoryClicked;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentHistoryClicked extends ElectricityPaymentHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2600a;

        public PaymentHistoryClicked(String transactionId) {
            Intrinsics.i(transactionId, "transactionId");
            this.f2600a = transactionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentHistoryClicked) && Intrinsics.d(this.f2600a, ((PaymentHistoryClicked) obj).f2600a);
        }

        public final int hashCode() {
            return this.f2600a.hashCode();
        }

        public final String toString() {
            return vo1.B("PaymentHistoryClicked(transactionId=", this.f2600a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent$RetryFetchPaymentHistory;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetryFetchPaymentHistory extends ElectricityPaymentHistoryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryFetchPaymentHistory f2601a = new RetryFetchPaymentHistory();
    }
}
