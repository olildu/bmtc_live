package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import defpackage.dd;
import defpackage.hq0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "", "InitializationIntent", "EditPassStartDateIntent", "EditUserNameForNoProofRequirementIntent", "FareDetailsLayoutClickedIntent", "SubmitBtnClickedIntent", "PostCashPaymentIntent", "PostOnlinePaymentIntent", "ShowTermsAndConditions", "DismissDialogIntent", "DateSelectedIntent", "ZoomProofImageIntent", "DismissZoomImageIntent", "DismissBottomSheetIntent", "PassAlreadyAvailedBottomSheetPositiveClickedIntent", "FareMappingFailedBottomSheetConfirmClickedIntent", "FareMappingFailedBottomSheetCancelClickedIntent", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$DateSelectedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$DismissBottomSheetIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$DismissDialogIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$DismissZoomImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$EditPassStartDateIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$EditUserNameForNoProofRequirementIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$FareDetailsLayoutClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$FareMappingFailedBottomSheetCancelClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$FareMappingFailedBottomSheetConfirmClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$PassAlreadyAvailedBottomSheetPositiveClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$PostCashPaymentIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$PostOnlinePaymentIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$ShowTermsAndConditions;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$SubmitBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$ZoomProofImageIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ConfirmSuperPassPurchaseIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$DateSelectedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateSelectedIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8365a;

        public DateSelectedIntent(long j) {
            this.f8365a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateSelectedIntent) && this.f8365a == ((DateSelectedIntent) obj).f8365a;
        }

        public final int hashCode() {
            long j = this.f8365a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f8365a, "DateSelectedIntent(newStartTime=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$DismissBottomSheetIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissBottomSheetIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissBottomSheetIntent f8366a = new DismissBottomSheetIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissBottomSheetIntent);
        }

        public final int hashCode() {
            return -1864765622;
        }

        public final String toString() {
            return "DismissBottomSheetIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$DismissDialogIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissDialogIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissDialogIntent f8367a = new DismissDialogIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialogIntent);
        }

        public final int hashCode() {
            return -1693723606;
        }

        public final String toString() {
            return "DismissDialogIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$DismissZoomImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissZoomImageIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissZoomImageIntent f8368a = new DismissZoomImageIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissZoomImageIntent);
        }

        public final int hashCode() {
            return 1647659550;
        }

        public final String toString() {
            return "DismissZoomImageIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$EditPassStartDateIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditPassStartDateIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditPassStartDateIntent f8369a = new EditPassStartDateIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditPassStartDateIntent);
        }

        public final int hashCode() {
            return -1279437907;
        }

        public final String toString() {
            return "EditPassStartDateIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$EditUserNameForNoProofRequirementIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditUserNameForNoProofRequirementIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditUserNameForNoProofRequirementIntent f8370a = new EditUserNameForNoProofRequirementIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditUserNameForNoProofRequirementIntent);
        }

        public final int hashCode() {
            return -1525773279;
        }

        public final String toString() {
            return "EditUserNameForNoProofRequirementIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$FareDetailsLayoutClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareDetailsLayoutClickedIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FareDetailsLayoutClickedIntent f8371a = new FareDetailsLayoutClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FareDetailsLayoutClickedIntent);
        }

        public final int hashCode() {
            return -72758327;
        }

        public final String toString() {
            return "FareDetailsLayoutClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$FareMappingFailedBottomSheetCancelClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareMappingFailedBottomSheetCancelClickedIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FareMappingFailedBottomSheetCancelClickedIntent f8372a = new FareMappingFailedBottomSheetCancelClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FareMappingFailedBottomSheetCancelClickedIntent);
        }

        public final int hashCode() {
            return -2038539346;
        }

        public final String toString() {
            return "FareMappingFailedBottomSheetCancelClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$FareMappingFailedBottomSheetConfirmClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareMappingFailedBottomSheetConfirmClickedIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FareMappingFailedBottomSheetConfirmClickedIntent f8373a = new FareMappingFailedBottomSheetConfirmClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FareMappingFailedBottomSheetConfirmClickedIntent);
        }

        public final int hashCode() {
            return 535264510;
        }

        public final String toString() {
            return "FareMappingFailedBottomSheetConfirmClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f8374a = new InitializationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitializationIntent);
        }

        public final int hashCode() {
            return 581677152;
        }

        public final String toString() {
            return "InitializationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$PassAlreadyAvailedBottomSheetPositiveClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassAlreadyAvailedBottomSheetPositiveClickedIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassAlreadyAvailedBottomSheetPositiveClickedIntent f8375a = new PassAlreadyAvailedBottomSheetPositiveClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PassAlreadyAvailedBottomSheetPositiveClickedIntent);
        }

        public final int hashCode() {
            return 854630785;
        }

        public final String toString() {
            return "PassAlreadyAvailedBottomSheetPositiveClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$PostCashPaymentIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostCashPaymentIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8376a;
        public final String b;

        public PostCashPaymentIntent(String passId, String userId) {
            Intrinsics.i(passId, "passId");
            Intrinsics.i(userId, "userId");
            this.f8376a = passId;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostCashPaymentIntent)) {
                return false;
            }
            PostCashPaymentIntent postCashPaymentIntent = (PostCashPaymentIntent) obj;
            return Intrinsics.d(this.f8376a, postCashPaymentIntent.f8376a) && Intrinsics.d(this.b, postCashPaymentIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8376a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("PostCashPaymentIntent(passId=", this.f8376a, ", userId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$PostOnlinePaymentIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostOnlinePaymentIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8377a;
        public final String b;
        public final CreateOrderResponseAppModel c;

        static {
            CreateOrderResponseAppModel.Companion companion = CreateOrderResponseAppModel.INSTANCE;
        }

        public PostOnlinePaymentIntent(String str, String str2, CreateOrderResponseAppModel orderDetails) {
            Intrinsics.i(orderDetails, "orderDetails");
            this.f8377a = str;
            this.b = str2;
            this.c = orderDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostOnlinePaymentIntent)) {
                return false;
            }
            PostOnlinePaymentIntent postOnlinePaymentIntent = (PostOnlinePaymentIntent) obj;
            return Intrinsics.d(this.f8377a, postOnlinePaymentIntent.f8377a) && Intrinsics.d(this.b, postOnlinePaymentIntent.b) && Intrinsics.d(this.c, postOnlinePaymentIntent.c);
        }

        public final int hashCode() {
            String str = this.f8377a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PostOnlinePaymentIntent(qrCode=", this.f8377a, ", tone=", this.b, ", orderDetails=");
            sbE.append(this.c);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$ShowTermsAndConditions;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowTermsAndConditions extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowTermsAndConditions f8378a = new ShowTermsAndConditions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowTermsAndConditions);
        }

        public final int hashCode() {
            return 715314057;
        }

        public final String toString() {
            return "ShowTermsAndConditions";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$SubmitBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitBtnClickedIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SubmitBtnClickedIntent f8379a = new SubmitBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitBtnClickedIntent);
        }

        public final int hashCode() {
            return -1390030621;
        }

        public final String toString() {
            return "SubmitBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent$ZoomProofImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ZoomProofImageIntent extends ConfirmSuperPassPurchaseIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProofUploadDetails f8380a;

        public ZoomProofImageIntent(ProofUploadDetails proofUploadDetails) {
            this.f8380a = proofUploadDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ZoomProofImageIntent) && Intrinsics.d(this.f8380a, ((ZoomProofImageIntent) obj).f8380a);
        }

        public final int hashCode() {
            return this.f8380a.hashCode();
        }

        public final String toString() {
            return "ZoomProofImageIntent(proof=" + this.f8380a + ")";
        }
    }
}
