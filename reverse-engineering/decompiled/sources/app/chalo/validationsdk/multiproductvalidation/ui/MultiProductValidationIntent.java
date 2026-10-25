package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.notification.models.AppNotification;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "", "InitializationIntent", "ChildClickedIntent", "QRClickedIntent", "BackPressedIntent", "PunchEventReceivedIntent", "ViewReceiptIntent", "ReportProblemIntent", "ExpiryDialogGotItClickedIntent", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$BackPressedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$ChildClickedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$ExpiryDialogGotItClickedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$InitializationIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$PunchEventReceivedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$QRClickedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$ReportProblemIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$ViewReceiptIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MultiProductValidationIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$BackPressedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackPressedIntent extends MultiProductValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackPressedIntent f10692a = new BackPressedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressedIntent);
        }

        public final int hashCode() {
            return -1774398952;
        }

        public final String toString() {
            return "BackPressedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$ChildClickedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChildClickedIntent extends MultiProductValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductValidationData f10693a;

        public ChildClickedIntent(ProductValidationData child) {
            Intrinsics.i(child, "child");
            this.f10693a = child;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChildClickedIntent) && Intrinsics.d(this.f10693a, ((ChildClickedIntent) obj).f10693a);
        }

        public final int hashCode() {
            return this.f10693a.hashCode();
        }

        public final String toString() {
            return "ChildClickedIntent(child=" + this.f10693a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$ExpiryDialogGotItClickedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpiryDialogGotItClickedIntent extends MultiProductValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExpiryDialogGotItClickedIntent f10694a = new ExpiryDialogGotItClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExpiryDialogGotItClickedIntent);
        }

        public final int hashCode() {
            return 2119361286;
        }

        public final String toString() {
            return "ExpiryDialogGotItClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$InitializationIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends MultiProductValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f10695a = new InitializationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitializationIntent);
        }

        public final int hashCode() {
            return 503247195;
        }

        public final String toString() {
            return "InitializationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$PunchEventReceivedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PunchEventReceivedIntent extends MultiProductValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppNotification.PunchNotification f10696a;

        public PunchEventReceivedIntent(AppNotification.PunchNotification event) {
            Intrinsics.i(event, "event");
            this.f10696a = event;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PunchEventReceivedIntent) && Intrinsics.d(this.f10696a, ((PunchEventReceivedIntent) obj).f10696a);
        }

        public final int hashCode() {
            return this.f10696a.hashCode();
        }

        public final String toString() {
            return "PunchEventReceivedIntent(event=" + this.f10696a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$QRClickedIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QRClickedIntent extends MultiProductValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QRClickedIntent f10697a = new QRClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QRClickedIntent);
        }

        public final int hashCode() {
            return 885003203;
        }

        public final String toString() {
            return "QRClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$ReportProblemIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemIntent extends MultiProductValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemIntent f10698a = new ReportProblemIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReportProblemIntent);
        }

        public final int hashCode() {
            return -249260184;
        }

        public final String toString() {
            return "ReportProblemIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent$ViewReceiptIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewReceiptIntent extends MultiProductValidationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductValidationData f10699a;

        public ViewReceiptIntent(ProductValidationData child) {
            Intrinsics.i(child, "child");
            this.f10699a = child;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewReceiptIntent) && Intrinsics.d(this.f10699a, ((ViewReceiptIntent) obj).f10699a);
        }

        public final int hashCode() {
            return this.f10699a.hashCode();
        }

        public final String toString() {
            return "ViewReceiptIntent(child=" + this.f10699a + ")";
        }
    }
}
