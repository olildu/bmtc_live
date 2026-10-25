package app.chalo.electricitybill.ui.ebillfetch;

import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.features.network.NetworkConnectionType;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "", "NumberEnteredIntent", "NextClickIntent", "ViewPaymentHistoryIntent", "ProceedWithPaymentClickedIntent", "RetryBillFetchIntent", "InternetConnectionIntent", "EBillPaymentDialogPositiveBtnClickedIntent", "EBillPaymentDialogNegativeBtnClickedIntent", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$EBillPaymentDialogNegativeBtnClickedIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$EBillPaymentDialogPositiveBtnClickedIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$InternetConnectionIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$NextClickIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$NumberEnteredIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$ProceedWithPaymentClickedIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$RetryBillFetchIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$ViewPaymentHistoryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EBillFetchIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$EBillPaymentDialogNegativeBtnClickedIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EBillPaymentDialogNegativeBtnClickedIntent extends EBillFetchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EBillPaymentDialogNegativeBtnClickedIntent f2559a = new EBillPaymentDialogNegativeBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$EBillPaymentDialogPositiveBtnClickedIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EBillPaymentDialogPositiveBtnClickedIntent extends EBillFetchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EBillPaymentDialogPositiveBtnClickedIntent f2560a = new EBillPaymentDialogPositiveBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$InternetConnectionIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InternetConnectionIntent extends EBillFetchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NetworkConnectionType f2561a;

        public InternetConnectionIntent(NetworkConnectionType currentNetworkConnectionType) {
            Intrinsics.i(currentNetworkConnectionType, "currentNetworkConnectionType");
            this.f2561a = currentNetworkConnectionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InternetConnectionIntent) && this.f2561a == ((InternetConnectionIntent) obj).f2561a;
        }

        public final int hashCode() {
            return this.f2561a.hashCode();
        }

        public final String toString() {
            return "InternetConnectionIntent(currentNetworkConnectionType=" + this.f2561a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$NextClickIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextClickIntent extends EBillFetchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2562a;

        public NextClickIntent(String str) {
            this.f2562a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextClickIntent) && Intrinsics.d(this.f2562a, ((NextClickIntent) obj).f2562a);
        }

        public final int hashCode() {
            return this.f2562a.hashCode();
        }

        public final String toString() {
            return vo1.B("NextClickIntent(currentlyEnteredNumber=", this.f2562a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$NumberEnteredIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NumberEnteredIntent extends EBillFetchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2563a;

        public NumberEnteredIntent(String currentlyEnteredNumber) {
            Intrinsics.i(currentlyEnteredNumber, "currentlyEnteredNumber");
            this.f2563a = currentlyEnteredNumber;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NumberEnteredIntent) && Intrinsics.d(this.f2563a, ((NumberEnteredIntent) obj).f2563a);
        }

        public final int hashCode() {
            return this.f2563a.hashCode();
        }

        public final String toString() {
            return vo1.B("NumberEnteredIntent(currentlyEnteredNumber=", this.f2563a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$ProceedWithPaymentClickedIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedWithPaymentClickedIntent extends EBillFetchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ElectricityBillAppModel f2564a;

        public ProceedWithPaymentClickedIntent(ElectricityBillAppModel electricityBillAppModel) {
            Intrinsics.i(electricityBillAppModel, "electricityBillAppModel");
            this.f2564a = electricityBillAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProceedWithPaymentClickedIntent) && Intrinsics.d(this.f2564a, ((ProceedWithPaymentClickedIntent) obj).f2564a);
        }

        public final int hashCode() {
            return this.f2564a.hashCode();
        }

        public final String toString() {
            return "ProceedWithPaymentClickedIntent(electricityBillAppModel=" + this.f2564a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$RetryBillFetchIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryBillFetchIntent extends EBillFetchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2565a;

        public RetryBillFetchIntent(String str) {
            this.f2565a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryBillFetchIntent) && Intrinsics.d(this.f2565a, ((RetryBillFetchIntent) obj).f2565a);
        }

        public final int hashCode() {
            return this.f2565a.hashCode();
        }

        public final String toString() {
            return vo1.B("RetryBillFetchIntent(currentlyEnteredNumber=", this.f2565a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent$ViewPaymentHistoryIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewPaymentHistoryIntent extends EBillFetchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewPaymentHistoryIntent f2566a = new ViewPaymentHistoryIntent();
    }
}
