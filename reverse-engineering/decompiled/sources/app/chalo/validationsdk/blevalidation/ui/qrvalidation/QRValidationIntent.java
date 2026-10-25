package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.constants.Source;
import app.chalo.notification.models.AppNotification;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import defpackage.b3;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "", "InitializationIntent", "ReportProblemIntent", "ViewTripReceipt", "QRClickedIntent", "SwitchToBLEBtnClickedIntent", "OnQrSwiped", "OnTicketNumberClicked", "BottomSheetDismissIntent", "OnBookingSupportClicked", "OnViewJourneyClicked", "BackPressedIntent", "PunchEventReceivedIntent", "ValidationSuccessBottomSheetPositiveBtnClicked", "ValidationSuccessBottomSheetNegativeBtnClicked", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$BackPressedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$BottomSheetDismissIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$InitializationIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$OnBookingSupportClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$OnQrSwiped;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$OnTicketNumberClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$OnViewJourneyClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$PunchEventReceivedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$QRClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$ReportProblemIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$SwitchToBLEBtnClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$ValidationSuccessBottomSheetNegativeBtnClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$ValidationSuccessBottomSheetPositiveBtnClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$ViewTripReceipt;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QRValidationIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$BackPressedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackPressedIntent extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackPressedIntent f10636a = new BackPressedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressedIntent);
        }

        public final int hashCode() {
            return -1125712260;
        }

        public final String toString() {
            return "BackPressedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$BottomSheetDismissIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomSheetDismissIntent extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissIntent f10637a = new BottomSheetDismissIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$InitializationIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f10638a;

        public InitializationIntent(Source source) {
            Intrinsics.i(source, "source");
            this.f10638a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f10638a == ((InitializationIntent) obj).f10638a;
        }

        public final int hashCode() {
            return this.f10638a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f10638a, "InitializationIntent(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$OnBookingSupportClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBookingSupportClicked extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBookingSupportClicked f10639a = new OnBookingSupportClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$OnQrSwiped;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnQrSwiped extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10640a;

        public OnQrSwiped(int i) {
            this.f10640a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnQrSwiped) && this.f10640a == ((OnQrSwiped) obj).f10640a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF10640a() {
            return this.f10640a;
        }

        public final String toString() {
            return b3.d(this.f10640a, "OnQrSwiped(qrIndex=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$OnTicketNumberClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTicketNumberClicked extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10641a;

        public OnTicketNumberClicked(int i) {
            this.f10641a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTicketNumberClicked) && this.f10641a == ((OnTicketNumberClicked) obj).f10641a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF10641a() {
            return this.f10641a;
        }

        public final String toString() {
            return b3.d(this.f10641a, "OnTicketNumberClicked(qrIndex=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$OnViewJourneyClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnViewJourneyClicked extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnViewJourneyClicked f10642a = new OnViewJourneyClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$PunchEventReceivedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PunchEventReceivedIntent extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppNotification.PunchNotification f10643a;

        public PunchEventReceivedIntent(AppNotification.PunchNotification punchEvent) {
            Intrinsics.i(punchEvent, "punchEvent");
            this.f10643a = punchEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PunchEventReceivedIntent) && Intrinsics.d(this.f10643a, ((PunchEventReceivedIntent) obj).f10643a);
        }

        public final int hashCode() {
            return this.f10643a.hashCode();
        }

        public final String toString() {
            return "PunchEventReceivedIntent(punchEvent=" + this.f10643a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$QRClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QRClickedIntent extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QRClickedIntent f10644a = new QRClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QRClickedIntent);
        }

        public final int hashCode() {
            return -401471193;
        }

        public final String toString() {
            return "QRClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$ReportProblemIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemIntent extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemIntent f10645a = new ReportProblemIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReportProblemIntent);
        }

        public final int hashCode() {
            return 368392908;
        }

        public final String toString() {
            return "ReportProblemIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$SwitchToBLEBtnClickedIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwitchToBLEBtnClickedIntent extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SwitchToBLEBtnClickedIntent f10646a = new SwitchToBLEBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwitchToBLEBtnClickedIntent);
        }

        public final int hashCode() {
            return -585963688;
        }

        public final String toString() {
            return "SwitchToBLEBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$ValidationSuccessBottomSheetNegativeBtnClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidationSuccessBottomSheetNegativeBtnClicked extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductReceiptData f10647a;
        public final ProductValidationData b;

        public ValidationSuccessBottomSheetNegativeBtnClicked(ProductReceiptData receipt, ProductValidationData product) {
            Intrinsics.i(receipt, "receipt");
            Intrinsics.i(product, "product");
            this.f10647a = receipt;
            this.b = product;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationSuccessBottomSheetNegativeBtnClicked)) {
                return false;
            }
            ValidationSuccessBottomSheetNegativeBtnClicked validationSuccessBottomSheetNegativeBtnClicked = (ValidationSuccessBottomSheetNegativeBtnClicked) obj;
            return Intrinsics.d(this.f10647a, validationSuccessBottomSheetNegativeBtnClicked.f10647a) && Intrinsics.d(this.b, validationSuccessBottomSheetNegativeBtnClicked.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10647a.hashCode() * 31);
        }

        public final String toString() {
            return "ValidationSuccessBottomSheetNegativeBtnClicked(receipt=" + this.f10647a + ", product=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$ValidationSuccessBottomSheetPositiveBtnClicked;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidationSuccessBottomSheetPositiveBtnClicked extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ValidationSuccessBottomSheetPositiveBtnClicked f10648a = new ValidationSuccessBottomSheetPositiveBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ValidationSuccessBottomSheetPositiveBtnClicked);
        }

        public final int hashCode() {
            return 1642839113;
        }

        public final String toString() {
            return "ValidationSuccessBottomSheetPositiveBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent$ViewTripReceipt;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewTripReceipt extends QRValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewTripReceipt f10649a = new ViewTripReceipt();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewTripReceipt);
        }

        public final int hashCode() {
            return -722077069;
        }

        public final String toString() {
            return "ViewTripReceipt";
        }
    }
}
