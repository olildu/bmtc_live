package app.chalo.checkout.ui.screen.checkout.customurl;

import app.chalo.checkout.utility.UpiAppResult;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.b3;
import defpackage.hq0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "", "InitialiseIntent", "WebViewCreated", "OnPageLoaded", "OnPageProgressCompleted", "CheckoutBackPressed", "ConfirmCancelPayment", "DismissCancelConfirmationDialog", "PaymentCompletedIntent", "OnErrorWhileMakingPayment", "OnSslErrorReceived", "OnUrlOverride", "OnUpiIntentUriReceived", "HandleNativeUpiAppResultIntent", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$CheckoutBackPressed;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$ConfirmCancelPayment;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$DismissCancelConfirmationDialog;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$HandleNativeUpiAppResultIntent;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$InitialiseIntent;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnErrorWhileMakingPayment;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnPageLoaded;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnPageProgressCompleted;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnSslErrorReceived;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnUpiIntentUriReceived;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnUrlOverride;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$WebViewCreated;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CustomUrlCheckoutViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$CheckoutBackPressed;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckoutBackPressed extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CheckoutBackPressed f1457a = new CheckoutBackPressed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$ConfirmCancelPayment;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfirmCancelPayment extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmCancelPayment f1458a = new ConfirmCancelPayment();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$DismissCancelConfirmationDialog;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissCancelConfirmationDialog extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissCancelConfirmationDialog f1459a = new DismissCancelConfirmationDialog();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$HandleNativeUpiAppResultIntent;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleNativeUpiAppResultIntent extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpiAppResult f1460a;

        public HandleNativeUpiAppResultIntent(UpiAppResult upiAppResult) {
            this.f1460a = upiAppResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleNativeUpiAppResultIntent) && Intrinsics.d(this.f1460a, ((HandleNativeUpiAppResultIntent) obj).f1460a);
        }

        public final int hashCode() {
            UpiAppResult upiAppResult = this.f1460a;
            if (upiAppResult == null) {
                return 0;
            }
            return upiAppResult.hashCode();
        }

        public final String toString() {
            return "HandleNativeUpiAppResultIntent(result=" + this.f1460a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$InitialiseIntent;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialiseIntent extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1461a;

        public InitialiseIntent(String url) {
            Intrinsics.i(url, "url");
            this.f1461a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialiseIntent) && Intrinsics.d(this.f1461a, ((InitialiseIntent) obj).f1461a);
        }

        public final int hashCode() {
            return this.f1461a.hashCode();
        }

        public final String toString() {
            return vo1.B("InitialiseIntent(url=", this.f1461a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnErrorWhileMakingPayment;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnErrorWhileMakingPayment extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1462a;
        public final String b;

        public OnErrorWhileMakingPayment(int i, String str) {
            this.f1462a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnErrorWhileMakingPayment)) {
                return false;
            }
            OnErrorWhileMakingPayment onErrorWhileMakingPayment = (OnErrorWhileMakingPayment) obj;
            return this.f1462a == onErrorWhileMakingPayment.f1462a && Intrinsics.d(this.b, onErrorWhileMakingPayment.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f1462a * 31);
        }

        public final String toString() {
            return hq0.d(this.f1462a, "OnErrorWhileMakingPayment(errorCode=", ", errorDescription=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnPageLoaded;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPageLoaded extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnPageLoaded f1463a = new OnPageLoaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPageLoaded);
        }

        public final int hashCode() {
            return 952508384;
        }

        public final String toString() {
            return "OnPageLoaded";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnPageProgressCompleted;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPageProgressCompleted extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1464a;

        public OnPageProgressCompleted(int i) {
            this.f1464a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPageProgressCompleted) && this.f1464a == ((OnPageProgressCompleted) obj).f1464a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF1464a() {
            return this.f1464a;
        }

        public final String toString() {
            return b3.d(this.f1464a, "OnPageProgressCompleted(progress=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnSslErrorReceived;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSslErrorReceived extends CustomUrlCheckoutViewIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSslErrorReceived);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnSslErrorReceived(errorCode=0, url=null, errorDescription=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnUpiIntentUriReceived;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnUpiIntentUriReceived extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1465a;

        public OnUpiIntentUriReceived(String upiIntentUri) {
            Intrinsics.i(upiIntentUri, "upiIntentUri");
            this.f1465a = upiIntentUri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnUpiIntentUriReceived) && Intrinsics.d(this.f1465a, ((OnUpiIntentUriReceived) obj).f1465a);
        }

        public final int hashCode() {
            return this.f1465a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnUpiIntentUriReceived(upiIntentUri=", this.f1465a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$OnUrlOverride;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnUrlOverride extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1466a;

        public OnUrlOverride(String url) {
            Intrinsics.i(url, "url");
            this.f1466a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnUrlOverride) && Intrinsics.d(this.f1466a, ((OnUrlOverride) obj).f1466a);
        }

        public final int hashCode() {
            return this.f1466a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnUrlOverride(url=", this.f1466a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", InitializationStatus.SUCCESS, "Failed", "Cancelled", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent$Cancelled;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent$Failed;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent$Success;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PaymentCompletedIntent extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent$Cancelled;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Cancelled extends PaymentCompletedIntent {
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent$Failed;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Failed extends PaymentCompletedIntent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Failed f1467a = new Failed();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent$Success;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success extends PaymentCompletedIntent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Success f1468a = new Success();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent$WebViewCreated;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WebViewCreated extends CustomUrlCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WebViewCreated f1469a = new WebViewCreated();
    }
}
