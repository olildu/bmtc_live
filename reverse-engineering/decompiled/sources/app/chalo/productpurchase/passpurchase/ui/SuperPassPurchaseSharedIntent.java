package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.userprofile.Gender;
import defpackage.hq0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.t10;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "", "InitializationIntent", "UpdateUserDetailsAndStartTime", "UpdateUploadProofsFromPreviousValidUploads", "ReportProblemClickedIntent", "CancelProofUploadIntent", "UploadProofImageIntent", "UpdateUserName", "SetupUserDetailsForNewPassengerIntent", "ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent", "SaveUserDetailsFromSmartPassengerSelectionIntent", "UpdatePassStartTimeIntent", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$CancelProofUploadIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$ReportProblemClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$SaveUserDetailsFromSmartPassengerSelectionIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$SetupUserDetailsForNewPassengerIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UpdatePassStartTimeIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UpdateUploadProofsFromPreviousValidUploads;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UpdateUserDetailsAndStartTime;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UpdateUserName;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UploadProofImageIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassPurchaseSharedIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$CancelProofUploadIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelProofUploadIntent extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8346a;

        public CancelProofUploadIntent(String proofId) {
            Intrinsics.i(proofId, "proofId");
            this.f8346a = proofId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancelProofUploadIntent) && Intrinsics.d(this.f8346a, ((CancelProofUploadIntent) obj).f8346a);
        }

        public final int hashCode() {
            return this.f8346a.hashCode();
        }

        public final String toString() {
            return vo1.B("CancelProofUploadIntent(proofId=", this.f8346a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8347a;
        public final long b;
        public final SuperPassUserDetails c;

        public ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent(String passId, long j, SuperPassUserDetails superPassUserDetails) {
            Intrinsics.i(passId, "passId");
            this.f8347a = passId;
            this.b = j;
            this.c = superPassUserDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent)) {
                return false;
            }
            ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent convertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent = (ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent) obj;
            return Intrinsics.d(this.f8347a, convertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent.f8347a) && this.b == convertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent.b && Intrinsics.d(this.c, convertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent.c);
        }

        public final int hashCode() {
            int iHashCode = this.f8347a.hashCode() * 31;
            long j = this.b;
            return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
        }

        public final String toString() {
            StringBuilder sbM = t10.m(this.b, "ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent(passId=", this.f8347a, ", verificationExpiryTime=");
            sbM.append(", selectedSuperPassUserDetails=");
            sbM.append(this.c);
            sbM.append(")");
            return sbM.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassPurchaseArgs f8348a;

        static {
            SuperPassPurchaseArgs.Companion companion = SuperPassPurchaseArgs.INSTANCE;
        }

        public InitializationIntent(SuperPassPurchaseArgs superPassPurchaseArgs) {
            this.f8348a = superPassPurchaseArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f8348a, ((InitializationIntent) obj).f8348a);
        }

        public final int hashCode() {
            return this.f8348a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(args=" + this.f8348a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$ReportProblemClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemClickedIntent extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemClickedIntent f8349a = new ReportProblemClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReportProblemClickedIntent);
        }

        public final int hashCode() {
            return -1231824816;
        }

        public final String toString() {
            return "ReportProblemClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$SaveUserDetailsFromSmartPassengerSelectionIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveUserDetailsFromSmartPassengerSelectionIntent extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassUserDetails f8350a;

        public SaveUserDetailsFromSmartPassengerSelectionIntent(SuperPassUserDetails superPassUserDetails) {
            this.f8350a = superPassUserDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveUserDetailsFromSmartPassengerSelectionIntent) && Intrinsics.d(this.f8350a, ((SaveUserDetailsFromSmartPassengerSelectionIntent) obj).f8350a);
        }

        public final int hashCode() {
            return this.f8350a.hashCode();
        }

        public final String toString() {
            return "SaveUserDetailsFromSmartPassengerSelectionIntent(details=" + this.f8350a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$SetupUserDetailsForNewPassengerIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetupUserDetailsForNewPassengerIntent extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetupUserDetailsForNewPassengerIntent f8351a = new SetupUserDetailsForNewPassengerIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetupUserDetailsForNewPassengerIntent);
        }

        public final int hashCode() {
            return -416914707;
        }

        public final String toString() {
            return "SetupUserDetailsForNewPassengerIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UpdatePassStartTimeIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdatePassStartTimeIntent extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8352a;

        public UpdatePassStartTimeIntent(long j) {
            this.f8352a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePassStartTimeIntent) && this.f8352a == ((UpdatePassStartTimeIntent) obj).f8352a;
        }

        public final int hashCode() {
            long j = this.f8352a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f8352a, "UpdatePassStartTimeIntent(newTime=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UpdateUploadProofsFromPreviousValidUploads;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateUploadProofsFromPreviousValidUploads extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f8353a;

        public UpdateUploadProofsFromPreviousValidUploads(Map proofUploadDetailsMap) {
            Intrinsics.i(proofUploadDetailsMap, "proofUploadDetailsMap");
            this.f8353a = proofUploadDetailsMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateUploadProofsFromPreviousValidUploads) && Intrinsics.d(this.f8353a, ((UpdateUploadProofsFromPreviousValidUploads) obj).f8353a);
        }

        public final int hashCode() {
            return this.f8353a.hashCode();
        }

        public final String toString() {
            return "UpdateUploadProofsFromPreviousValidUploads(proofUploadDetailsMap=" + this.f8353a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UpdateUserDetailsAndStartTime;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateUserDetailsAndStartTime extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8354a;
        public final Gender b;
        public final String c;
        public final long d;
        public final long e;

        public UpdateUserDetailsAndStartTime(String str, Gender gender, String dateOfBirth, long j, long j2) {
            Intrinsics.i(dateOfBirth, "dateOfBirth");
            this.f8354a = str;
            this.b = gender;
            this.c = dateOfBirth;
            this.d = j;
            this.e = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateUserDetailsAndStartTime)) {
                return false;
            }
            UpdateUserDetailsAndStartTime updateUserDetailsAndStartTime = (UpdateUserDetailsAndStartTime) obj;
            return Intrinsics.d(this.f8354a, updateUserDetailsAndStartTime.f8354a) && this.b == updateUserDetailsAndStartTime.b && Intrinsics.d(this.c, updateUserDetailsAndStartTime.c) && this.d == updateUserDetailsAndStartTime.d && this.e == updateUserDetailsAndStartTime.e;
        }

        public final int hashCode() {
            String str = this.f8354a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Gender gender = this.b;
            int iE = nf1.e((iHashCode + (gender != null ? gender.hashCode() : 0)) * 31, 31, this.c);
            long j = this.d;
            long j2 = this.e;
            return ((iE + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateUserDetailsAndStartTime(fullName=");
            sb.append(this.f8354a);
            sb.append(", gender=");
            sb.append(this.b);
            sb.append(", dateOfBirth=");
            n21.p(this.d, this.c, ", dobInMillis=", sb);
            return t10.g(this.e, ", startTime=", ")", sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UpdateUserName;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateUserName extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8355a;

        public UpdateUserName(String fullName) {
            Intrinsics.i(fullName, "fullName");
            this.f8355a = fullName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateUserName) && Intrinsics.d(this.f8355a, ((UpdateUserName) obj).f8355a);
        }

        public final int hashCode() {
            return this.f8355a.hashCode();
        }

        public final String toString() {
            return vo1.B("UpdateUserName(fullName=", this.f8355a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent$UploadProofImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadProofImageIntent extends SuperPassPurchaseSharedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8356a;
        public final BitmapImage b;
        public final String c;

        public UploadProofImageIntent(String proofId, BitmapImage bitmapImage, String str) {
            Intrinsics.i(proofId, "proofId");
            this.f8356a = proofId;
            this.b = bitmapImage;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadProofImageIntent)) {
                return false;
            }
            UploadProofImageIntent uploadProofImageIntent = (UploadProofImageIntent) obj;
            return Intrinsics.d(this.f8356a, uploadProofImageIntent.f8356a) && Intrinsics.d(this.b, uploadProofImageIntent.b) && Intrinsics.d(this.c, uploadProofImageIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f8356a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UploadProofImageIntent(proofId=");
            sb.append(this.f8356a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", uploadRequestId=");
            return vo1.p(sb, this.c, ")");
        }
    }
}
