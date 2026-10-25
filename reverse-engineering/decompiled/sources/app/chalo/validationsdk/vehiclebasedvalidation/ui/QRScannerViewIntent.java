package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.models.validation.ValidationProduct;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;", "", "InitializationIntent", "OnValidateDetailsButtonClickedIntent", "OnValidateFailedErrorButtonClickedIntent", "OnSummaryBtnClickedIntent", "OnBackPressedIntent", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$InitializationIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$OnBackPressedIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$OnSummaryBtnClickedIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$OnValidateDetailsButtonClickedIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$OnValidateFailedErrorButtonClickedIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QRScannerViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$InitializationIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends QRScannerViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ValidationProduct f10725a;

        static {
            ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
        }

        public InitializationIntent(ValidationProduct validationProduct) {
            Intrinsics.i(validationProduct, "validationProduct");
            this.f10725a = validationProduct;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f10725a, ((InitializationIntent) obj).f10725a);
        }

        public final int hashCode() {
            return this.f10725a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(validationProduct=" + this.f10725a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$OnBackPressedIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackPressedIntent extends QRScannerViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressedIntent f10726a = new OnBackPressedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$OnSummaryBtnClickedIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSummaryBtnClickedIntent extends QRScannerViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10727a;

        public OnSummaryBtnClickedIntent(String str) {
            this.f10727a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSummaryBtnClickedIntent) && Intrinsics.d(this.f10727a, ((OnSummaryBtnClickedIntent) obj).f10727a);
        }

        public final int hashCode() {
            return this.f10727a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnSummaryBtnClickedIntent(bookingId=", this.f10727a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$OnValidateDetailsButtonClickedIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnValidateDetailsButtonClickedIntent extends QRScannerViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnValidateDetailsButtonClickedIntent f10728a = new OnValidateDetailsButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent$OnValidateFailedErrorButtonClickedIntent;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnValidateFailedErrorButtonClickedIntent extends QRScannerViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnValidateFailedErrorButtonClickedIntent f10729a = new OnValidateFailedErrorButtonClickedIntent();
    }
}
