package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "", "Initialized", "ValidationProcessActive", "ConductorBasedValidationComplete", "TITOTapInComplete", "ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt", "TITOTapOutCompleteAndActivationSyncDone", "ReceiptDataParsingFailedForConductorValidation", "ConductorValidationPunchReceivedForSomeOtherProduct", "TITOTapInReceivedForSomeOtherProduct", "TITOTapOutReceivedForSomeOtherProduct", "TITOTapOutReceivedForNoCorrespondingTitoEntryInTable", "TITOTapOutNotificationProcessingFailed", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ConductorBasedValidationComplete;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ConductorValidationPunchReceivedForSomeOtherProduct;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$Initialized;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ReceiptDataParsingFailedForConductorValidation;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapInComplete;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapInReceivedForSomeOtherProduct;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapOutCompleteAndActivationSyncDone;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapOutNotificationProcessingFailed;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapOutReceivedForNoCorrespondingTitoEntryInTable;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapOutReceivedForSomeOtherProduct;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ValidationProcessActive;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BleValidationProcessStatus {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ConductorBasedValidationComplete;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConductorBasedValidationComplete extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BleValidationAckData.ConductorValidationReceiptData f10540a;
        public final ValidationNotificationDeliveryMedium b;

        public ConductorBasedValidationComplete(BleValidationAckData.ConductorValidationReceiptData bleValidationAckData, ValidationNotificationDeliveryMedium notificationDeliveryMedium) {
            Intrinsics.i(bleValidationAckData, "bleValidationAckData");
            Intrinsics.i(notificationDeliveryMedium, "notificationDeliveryMedium");
            this.f10540a = bleValidationAckData;
            this.b = notificationDeliveryMedium;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConductorBasedValidationComplete)) {
                return false;
            }
            ConductorBasedValidationComplete conductorBasedValidationComplete = (ConductorBasedValidationComplete) obj;
            return Intrinsics.d(this.f10540a, conductorBasedValidationComplete.f10540a) && this.b == conductorBasedValidationComplete.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10540a.hashCode() * 31);
        }

        public final String toString() {
            return "ConductorBasedValidationComplete(bleValidationAckData=" + this.f10540a + ", notificationDeliveryMedium=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ConductorValidationPunchReceivedForSomeOtherProduct;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConductorValidationPunchReceivedForSomeOtherProduct extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConductorValidationPunchReceivedForSomeOtherProduct f10541a = new ConductorValidationPunchReceivedForSomeOtherProduct();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$Initialized;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initialized extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initialized f10542a = new Initialized();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ReceiptDataParsingFailedForConductorValidation;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReceiptDataParsingFailedForConductorValidation extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReceiptDataParsingFailedForConductorValidation f10543a = new ReceiptDataParsingFailedForConductorValidation();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapInComplete;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TITOTapInComplete extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BleValidationAckData.TITOTapInData f10544a;
        public final String b;
        public final ValidationNotificationDeliveryMedium c;

        public TITOTapInComplete(BleValidationAckData.TITOTapInData titoTapInData, String str, ValidationNotificationDeliveryMedium notificationDeliveryMedium) {
            Intrinsics.i(titoTapInData, "titoTapInData");
            Intrinsics.i(notificationDeliveryMedium, "notificationDeliveryMedium");
            this.f10544a = titoTapInData;
            this.b = str;
            this.c = notificationDeliveryMedium;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TITOTapInComplete)) {
                return false;
            }
            TITOTapInComplete tITOTapInComplete = (TITOTapInComplete) obj;
            return Intrinsics.d(this.f10544a, tITOTapInComplete.f10544a) && Intrinsics.d(this.b, tITOTapInComplete.b) && this.c == tITOTapInComplete.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f10544a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "TITOTapInComplete(titoTapInData=" + this.f10544a + ", tapId=" + this.b + ", notificationDeliveryMedium=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapInReceivedForSomeOtherProduct;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TITOTapInReceivedForSomeOtherProduct extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TITOTapInReceivedForSomeOtherProduct f10545a = new TITOTapInReceivedForSomeOtherProduct();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapOutCompleteAndActivationSyncDone;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TITOTapOutCompleteAndActivationSyncDone extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BleValidationAckData.TITOTapOutData f10546a;
        public final String b;

        public TITOTapOutCompleteAndActivationSyncDone(BleValidationAckData.TITOTapOutData titoTapOutData, String str) {
            Intrinsics.i(titoTapOutData, "titoTapOutData");
            this.f10546a = titoTapOutData;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TITOTapOutCompleteAndActivationSyncDone)) {
                return false;
            }
            TITOTapOutCompleteAndActivationSyncDone tITOTapOutCompleteAndActivationSyncDone = (TITOTapOutCompleteAndActivationSyncDone) obj;
            return Intrinsics.d(this.f10546a, tITOTapOutCompleteAndActivationSyncDone.f10546a) && Intrinsics.d(this.b, tITOTapOutCompleteAndActivationSyncDone.b);
        }

        public final int hashCode() {
            int iHashCode = this.f10546a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "TITOTapOutCompleteAndActivationSyncDone(titoTapOutData=" + this.f10546a + ", transactionIdInCaseOfQuickpayTapOut=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapOutNotificationProcessingFailed;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TITOTapOutNotificationProcessingFailed extends BleValidationProcessStatus {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TITOTapOutNotificationProcessingFailed);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "TITOTapOutNotificationProcessingFailed(titoTapOutNotificationEvent=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapOutReceivedForNoCorrespondingTitoEntryInTable;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TITOTapOutReceivedForNoCorrespondingTitoEntryInTable extends BleValidationProcessStatus {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TITOTapOutReceivedForNoCorrespondingTitoEntryInTable);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "TITOTapOutReceivedForNoCorrespondingTitoEntryInTable(titoTapOutNotificationEvent=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$TITOTapOutReceivedForSomeOtherProduct;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TITOTapOutReceivedForSomeOtherProduct extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TITOTapOutReceivedForSomeOtherProduct f10547a = new TITOTapOutReceivedForSomeOtherProduct();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BleValidationAckData.TITOTapOutData f10548a;
        public final ValidationNotificationDeliveryMedium b;

        public ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt(BleValidationAckData.TITOTapOutData titoTapOutData, ValidationNotificationDeliveryMedium notificationDeliveryMedium) {
            Intrinsics.i(titoTapOutData, "titoTapOutData");
            Intrinsics.i(notificationDeliveryMedium, "notificationDeliveryMedium");
            this.f10548a = titoTapOutData;
            this.b = notificationDeliveryMedium;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt)) {
                return false;
            }
            ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt = (ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt) obj;
            return Intrinsics.d(this.f10548a, validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt.f10548a) && this.b == validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10548a.hashCode() * 31);
        }

        public final String toString() {
            return "ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt(titoTapOutData=" + this.f10548a + ", notificationDeliveryMedium=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus$ValidationProcessActive;", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ValidationProcessActive extends BleValidationProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ValidationProcessActive f10549a = new ValidationProcessActive();
    }

    public final boolean a() {
        if (equals(Initialized.f10542a) || equals(ConductorValidationPunchReceivedForSomeOtherProduct.f10541a) || equals(ReceiptDataParsingFailedForConductorValidation.f10543a) || equals(TITOTapInReceivedForSomeOtherProduct.f10545a) || (this instanceof TITOTapOutNotificationProcessingFailed) || (this instanceof TITOTapOutReceivedForNoCorrespondingTitoEntryInTable) || equals(TITOTapOutReceivedForSomeOtherProduct.f10547a) || equals(ValidationProcessActive.f10549a)) {
            return false;
        }
        if ((this instanceof TITOTapInComplete) || (this instanceof ConductorBasedValidationComplete) || (this instanceof ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt) || (this instanceof TITOTapOutCompleteAndActivationSyncDone)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
