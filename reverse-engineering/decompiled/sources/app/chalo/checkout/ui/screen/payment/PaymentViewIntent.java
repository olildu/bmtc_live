package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.utility.UpiAppResult;
import app.chalo.features.checkout.CheckoutPaymentData;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0082\u0001\u001f!\"#$%&'()*+,-./0123456789:;<=>?¨\u0006@"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "", "ViewCreatedIntent", "LoadPaymentMethodsIntent", "PaymentMethodSelected", "PreferredItemSelected", "NativeUpiAppSelected", "SelectedPaymentInstrumentDataReceived", "ChaloPaySelectedFromWalletScreen", "GetPaymentStatus", "PaymentStatusBottomSheetPositiveButtonClicked", "InaiInstalledUpiAppsReceived", "InaiFetchInstalledUpiAppFailure", "ProceedWithChaloPayModeIntent", "HandleChaloPayFlowAfterWebViewIntent", "HandleChaloPayFlowAfterMinKYCIntent", "HandleChaloPayFlowAfterRechargedIntent", "HandleChaloWalletBlockedOkayClickedIntent", "ChaloPayBottomsheetTnCClicked", "HandleNativeUpiAppResultIntent", "UpiAppSelected", "SeeMoreUpiAppsCtaClicked", "InAppUpiMethodSelected", "AddOneClickUpiIdClicked", "UPIManagementClicked", "PhoneAndSmsPermissionGranted", "PhoneAndSmsPermissionDenied", "InAppUpiSmsPermissionBottomSheetOkayClicked", "PermissionDialogPositiveButtonClicked", "PermissionDialogNegativeButtonClicked", "DismissPaymentBottomsheetIntent", "NativeAdLoaded", "SeeAllUpiAppsCtaClicked", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$AddOneClickUpiIdClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$ChaloPayBottomsheetTnCClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$ChaloPaySelectedFromWalletScreen;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$DismissPaymentBottomsheetIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$GetPaymentStatus;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleChaloPayFlowAfterMinKYCIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleChaloPayFlowAfterRechargedIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleChaloPayFlowAfterWebViewIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleChaloWalletBlockedOkayClickedIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleNativeUpiAppResultIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$InAppUpiMethodSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$InAppUpiSmsPermissionBottomSheetOkayClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$InaiFetchInstalledUpiAppFailure;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$InaiInstalledUpiAppsReceived;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$LoadPaymentMethodsIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$NativeAdLoaded;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$NativeUpiAppSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PaymentMethodSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PaymentStatusBottomSheetPositiveButtonClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PermissionDialogNegativeButtonClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PermissionDialogPositiveButtonClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PhoneAndSmsPermissionDenied;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PhoneAndSmsPermissionGranted;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PreferredItemSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$ProceedWithChaloPayModeIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$SeeAllUpiAppsCtaClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$SeeMoreUpiAppsCtaClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$SelectedPaymentInstrumentDataReceived;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$UPIManagementClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$UpiAppSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$ViewCreatedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$AddOneClickUpiIdClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddOneClickUpiIdClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddOneClickUpiIdClicked f1549a = new AddOneClickUpiIdClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$ChaloPayBottomsheetTnCClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloPayBottomsheetTnCClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloPayBottomsheetTnCClicked f1550a = new ChaloPayBottomsheetTnCClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$ChaloPaySelectedFromWalletScreen;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloPaySelectedFromWalletScreen extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloPaySelectedFromWalletScreen f1551a = new ChaloPaySelectedFromWalletScreen();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$DismissPaymentBottomsheetIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissPaymentBottomsheetIntent extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissPaymentBottomsheetIntent f1552a = new DismissPaymentBottomsheetIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$GetPaymentStatus;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GetPaymentStatus extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1553a;

        public GetPaymentStatus(String str) {
            this.f1553a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetPaymentStatus) && Intrinsics.d(this.f1553a, ((GetPaymentStatus) obj).f1553a);
        }

        public final int hashCode() {
            String str = this.f1553a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("GetPaymentStatus(paymentId=", this.f1553a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleChaloPayFlowAfterMinKYCIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HandleChaloPayFlowAfterMinKYCIntent extends PaymentViewIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleChaloPayFlowAfterRechargedIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HandleChaloPayFlowAfterRechargedIntent extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HandleChaloPayFlowAfterRechargedIntent f1554a = new HandleChaloPayFlowAfterRechargedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleChaloPayFlowAfterWebViewIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HandleChaloPayFlowAfterWebViewIntent extends PaymentViewIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleChaloWalletBlockedOkayClickedIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HandleChaloWalletBlockedOkayClickedIntent extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HandleChaloWalletBlockedOkayClickedIntent f1555a = new HandleChaloWalletBlockedOkayClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$HandleNativeUpiAppResultIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleNativeUpiAppResultIntent extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpiAppResult f1556a;

        public HandleNativeUpiAppResultIntent(UpiAppResult upiAppResult) {
            this.f1556a = upiAppResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleNativeUpiAppResultIntent) && Intrinsics.d(this.f1556a, ((HandleNativeUpiAppResultIntent) obj).f1556a);
        }

        public final int hashCode() {
            UpiAppResult upiAppResult = this.f1556a;
            if (upiAppResult == null) {
                return 0;
            }
            return upiAppResult.hashCode();
        }

        public final String toString() {
            return "HandleNativeUpiAppResultIntent(result=" + this.f1556a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$InAppUpiMethodSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InAppUpiMethodSelected extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem f1557a;

        public InAppUpiMethodSelected(CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem inAppUpiItem) {
            this.f1557a = inAppUpiItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InAppUpiMethodSelected) && Intrinsics.d(this.f1557a, ((InAppUpiMethodSelected) obj).f1557a);
        }

        public final int hashCode() {
            return this.f1557a.hashCode();
        }

        public final String toString() {
            return "InAppUpiMethodSelected(item=" + this.f1557a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$InAppUpiSmsPermissionBottomSheetOkayClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InAppUpiSmsPermissionBottomSheetOkayClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InAppUpiSmsPermissionBottomSheetOkayClicked f1558a = new InAppUpiSmsPermissionBottomSheetOkayClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$InaiFetchInstalledUpiAppFailure;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InaiFetchInstalledUpiAppFailure extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InaiFetchInstalledUpiAppFailure f1559a = new InaiFetchInstalledUpiAppFailure();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$InaiInstalledUpiAppsReceived;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InaiInstalledUpiAppsReceived extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1560a;

        public InaiInstalledUpiAppsReceived(String str) {
            this.f1560a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InaiInstalledUpiAppsReceived) && Intrinsics.d(this.f1560a, ((InaiInstalledUpiAppsReceived) obj).f1560a);
        }

        public final int hashCode() {
            String str = this.f1560a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("InaiInstalledUpiAppsReceived(inaiUpiAppDetailJsonString=", this.f1560a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$LoadPaymentMethodsIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoadPaymentMethodsIntent extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadPaymentMethodsIntent f1561a = new LoadPaymentMethodsIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$NativeAdLoaded;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NativeAdLoaded extends PaymentViewIntent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NativeAdLoaded) && Float.compare(0.0f, 0.0f) == 0;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NativeAdLoaded(adUnitId=null, mediaAspectRatio=0.0, adLoadTimeInMillis=0, loadSource=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$NativeUpiAppSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NativeUpiAppSelected extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem f1562a;

        public NativeUpiAppSelected(CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem) {
            this.f1562a = uPIIntentPaymentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NativeUpiAppSelected) && Intrinsics.d(this.f1562a, ((NativeUpiAppSelected) obj).f1562a);
        }

        public final int hashCode() {
            return this.f1562a.hashCode();
        }

        public final String toString() {
            return "NativeUpiAppSelected(upiAppItem=" + this.f1562a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PaymentMethodSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentMethodSelected extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.PaymentMethodItem f1563a;

        public PaymentMethodSelected(CheckoutPaymentItem.PaymentMethodItem paymentMethodItem) {
            this.f1563a = paymentMethodItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentMethodSelected) && Intrinsics.d(this.f1563a, ((PaymentMethodSelected) obj).f1563a);
        }

        public final int hashCode() {
            return this.f1563a.hashCode();
        }

        public final String toString() {
            return "PaymentMethodSelected(item=" + this.f1563a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PaymentStatusBottomSheetPositiveButtonClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentStatusBottomSheetPositiveButtonClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentStatusCTAActionType f1564a;

        public PaymentStatusBottomSheetPositiveButtonClicked(PaymentStatusCTAActionType actionType) {
            Intrinsics.i(actionType, "actionType");
            this.f1564a = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentStatusBottomSheetPositiveButtonClicked) && this.f1564a == ((PaymentStatusBottomSheetPositiveButtonClicked) obj).f1564a;
        }

        public final int hashCode() {
            return this.f1564a.hashCode();
        }

        public final String toString() {
            return "PaymentStatusBottomSheetPositiveButtonClicked(actionType=" + this.f1564a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PermissionDialogNegativeButtonClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PermissionDialogNegativeButtonClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PermissionDialogNegativeButtonClicked f1565a = new PermissionDialogNegativeButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PermissionDialogPositiveButtonClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PermissionDialogPositiveButtonClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PermissionDialogPositiveButtonClicked f1566a = new PermissionDialogPositiveButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PhoneAndSmsPermissionDenied;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PhoneAndSmsPermissionDenied extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PhoneAndSmsPermissionDenied f1567a = new PhoneAndSmsPermissionDenied();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PhoneAndSmsPermissionGranted;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PhoneAndSmsPermissionGranted extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PhoneAndSmsPermissionGranted f1568a = new PhoneAndSmsPermissionGranted();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$PreferredItemSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PreferredItemSelected extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.IndividualCheckoutItem f1569a;

        public PreferredItemSelected(CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem) {
            this.f1569a = individualCheckoutItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PreferredItemSelected) && Intrinsics.d(this.f1569a, ((PreferredItemSelected) obj).f1569a);
        }

        public final int hashCode() {
            return this.f1569a.hashCode();
        }

        public final String toString() {
            return "PreferredItemSelected(item=" + this.f1569a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$ProceedWithChaloPayModeIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProceedWithChaloPayModeIntent extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedWithChaloPayModeIntent f1570a = new ProceedWithChaloPayModeIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$SeeAllUpiAppsCtaClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeAllUpiAppsCtaClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem f1571a;

        public SeeAllUpiAppsCtaClicked(CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem) {
            this.f1571a = uPIIntentPaymentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeeAllUpiAppsCtaClicked) && Intrinsics.d(this.f1571a, ((SeeAllUpiAppsCtaClicked) obj).f1571a);
        }

        public final int hashCode() {
            return this.f1571a.hashCode();
        }

        public final String toString() {
            return "SeeAllUpiAppsCtaClicked(upiPaymentItem=" + this.f1571a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$SeeMoreUpiAppsCtaClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SeeMoreUpiAppsCtaClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeMoreUpiAppsCtaClicked f1572a = new SeeMoreUpiAppsCtaClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$SelectedPaymentInstrumentDataReceived;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectedPaymentInstrumentDataReceived extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectedPaymentInstrumentData f1573a;

        public SelectedPaymentInstrumentDataReceived(SelectedPaymentInstrumentData data) {
            Intrinsics.i(data, "data");
            this.f1573a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedPaymentInstrumentDataReceived) && Intrinsics.d(this.f1573a, ((SelectedPaymentInstrumentDataReceived) obj).f1573a);
        }

        public final int hashCode() {
            return this.f1573a.hashCode();
        }

        public final String toString() {
            return "SelectedPaymentInstrumentDataReceived(data=" + this.f1573a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$UPIManagementClicked;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UPIManagementClicked extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UPIManagementClicked f1574a = new UPIManagementClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$UpiAppSelected;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpiAppSelected extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem f1575a;

        public UpiAppSelected(CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem) {
            this.f1575a = uPIIntentPaymentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpiAppSelected) && Intrinsics.d(this.f1575a, ((UpiAppSelected) obj).f1575a);
        }

        public final int hashCode() {
            return this.f1575a.hashCode();
        }

        public final String toString() {
            return "UpiAppSelected(appItem=" + this.f1575a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent$ViewCreatedIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreatedIntent extends PaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentData f1576a;

        static {
            CheckoutPaymentData.Companion companion = CheckoutPaymentData.INSTANCE;
        }

        public ViewCreatedIntent(CheckoutPaymentData paymentData) {
            Intrinsics.i(paymentData, "paymentData");
            this.f1576a = paymentData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewCreatedIntent) && Intrinsics.d(this.f1576a, ((ViewCreatedIntent) obj).f1576a);
        }

        public final int hashCode() {
            return this.f1576a.hashCode();
        }

        public final String toString() {
            return "ViewCreatedIntent(paymentData=" + this.f1576a + ")";
        }
    }
}
