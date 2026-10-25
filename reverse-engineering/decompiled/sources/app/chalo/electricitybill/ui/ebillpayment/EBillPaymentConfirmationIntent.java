package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.features.network.NetworkConnectionType;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent;", "", "StartingIntent", "PayBtnClickIntent", "TnCAcceptClickIntent", "PaymentCompletedIntent", "InternetConnectionIntent", "TnCDialogDismissIntent", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$InternetConnectionIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$PayBtnClickIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$PaymentCompletedIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$StartingIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$TnCAcceptClickIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$TnCDialogDismissIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EBillPaymentConfirmationIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$InternetConnectionIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InternetConnectionIntent extends EBillPaymentConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NetworkConnectionType f2571a;

        public InternetConnectionIntent(NetworkConnectionType networkConnectionType) {
            Intrinsics.i(networkConnectionType, "networkConnectionType");
            this.f2571a = networkConnectionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InternetConnectionIntent) && this.f2571a == ((InternetConnectionIntent) obj).f2571a;
        }

        public final int hashCode() {
            return this.f2571a.hashCode();
        }

        public final String toString() {
            return "InternetConnectionIntent(networkConnectionType=" + this.f2571a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$PayBtnClickIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PayBtnClickIntent extends EBillPaymentConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayBtnClickIntent f2572a = new PayBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$PaymentCompletedIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PaymentCompletedIntent extends EBillPaymentConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentCompletedIntent f2573a = new PaymentCompletedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$StartingIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartingIntent extends EBillPaymentConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2574a;

        public StartingIntent(String electricityBillAppModel) {
            Intrinsics.i(electricityBillAppModel, "electricityBillAppModel");
            this.f2574a = electricityBillAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartingIntent) && Intrinsics.d(this.f2574a, ((StartingIntent) obj).f2574a);
        }

        public final int hashCode() {
            return this.f2574a.hashCode();
        }

        public final String toString() {
            return vo1.B("StartingIntent(electricityBillAppModel=", this.f2574a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$TnCAcceptClickIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TnCAcceptClickIntent extends EBillPaymentConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ElectricityBillAppModel f2575a;

        public TnCAcceptClickIntent(ElectricityBillAppModel electricityBillAppModel) {
            Intrinsics.i(electricityBillAppModel, "electricityBillAppModel");
            this.f2575a = electricityBillAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TnCAcceptClickIntent) && Intrinsics.d(this.f2575a, ((TnCAcceptClickIntent) obj).f2575a);
        }

        public final int hashCode() {
            return this.f2575a.hashCode();
        }

        public final String toString() {
            return "TnCAcceptClickIntent(electricityBillAppModel=" + this.f2575a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent$TnCDialogDismissIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TnCDialogDismissIntent extends EBillPaymentConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TnCDialogDismissIntent f2576a = new TnCDialogDismissIntent();
    }
}
