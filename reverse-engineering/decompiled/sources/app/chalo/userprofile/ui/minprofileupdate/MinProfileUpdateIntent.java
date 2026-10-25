package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "", "InitializationIntent", "BackClicked", "SkipClicked", "NextClicked", "GenderSelected", "NameEntered", "AgeTextChanged", "DobFieldClicked", "DobSelected", "DobPickerDismissed", "UploadProfilePhotoClicked", "ProfilePhotoSelected", "PermissionRationaleDialogInteraction", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$AgeTextChanged;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$BackClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$DobFieldClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$DobPickerDismissed;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$DobSelected;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$GenderSelected;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$InitializationIntent;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$NameEntered;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$NextClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$ProfilePhotoSelected;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$SkipClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$UploadProfilePhotoClicked;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MinProfileUpdateIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$AgeTextChanged;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AgeTextChanged extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10393a;

        public AgeTextChanged(String ageText) {
            Intrinsics.i(ageText, "ageText");
            this.f10393a = ageText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AgeTextChanged) && Intrinsics.d(this.f10393a, ((AgeTextChanged) obj).f10393a);
        }

        public final int hashCode() {
            return this.f10393a.hashCode();
        }

        public final String toString() {
            return vo1.B("AgeTextChanged(ageText=", this.f10393a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$BackClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackClicked extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClicked f10394a = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 971691566;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$DobFieldClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobFieldClicked extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DobFieldClicked f10395a = new DobFieldClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DobFieldClicked);
        }

        public final int hashCode() {
            return 1523361426;
        }

        public final String toString() {
            return "DobFieldClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$DobPickerDismissed;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobPickerDismissed extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DobPickerDismissed f10396a = new DobPickerDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DobPickerDismissed);
        }

        public final int hashCode() {
            return -1593582378;
        }

        public final String toString() {
            return "DobPickerDismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$DobSelected;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobSelected extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f10397a;

        public DobSelected(Long l) {
            this.f10397a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DobSelected) && Intrinsics.d(this.f10397a, ((DobSelected) obj).f10397a);
        }

        public final int hashCode() {
            Long l = this.f10397a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "DobSelected(dobInMillis=" + this.f10397a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$GenderSelected;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderSelected extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Gender f10398a;

        public GenderSelected(Gender gender) {
            this.f10398a = gender;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenderSelected) && this.f10398a == ((GenderSelected) obj).f10398a;
        }

        public final int hashCode() {
            return this.f10398a.hashCode();
        }

        public final String toString() {
            return "GenderSelected(gender=" + this.f10398a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$InitializationIntent;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f10399a = new InitializationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitializationIntent);
        }

        public final int hashCode() {
            return 676960814;
        }

        public final String toString() {
            return "InitializationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$NameEntered;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NameEntered extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10400a;

        public NameEntered(String nameText) {
            Intrinsics.i(nameText, "nameText");
            this.f10400a = nameText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameEntered) && Intrinsics.d(this.f10400a, ((NameEntered) obj).f10400a);
        }

        public final int hashCode() {
            return this.f10400a.hashCode();
        }

        public final String toString() {
            return vo1.B("NameEntered(nameText=", this.f10400a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$NextClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextClicked extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10401a;

        public NextClicked(boolean z) {
            this.f10401a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextClicked) && this.f10401a == ((NextClicked) obj).f10401a;
        }

        public final int hashCode() {
            return this.f10401a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("NextClicked(isLastSkipped=", ")", this.f10401a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionRationaleDialogInteraction extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10402a;

        public PermissionRationaleDialogInteraction(boolean z) {
            this.f10402a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionRationaleDialogInteraction) && this.f10402a == ((PermissionRationaleDialogInteraction) obj).f10402a;
        }

        public final int hashCode() {
            return this.f10402a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("PermissionRationaleDialogInteraction(shouldNavigateToSettings=", ")", this.f10402a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$ProfilePhotoSelected;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfilePhotoSelected extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BitmapImage f10403a;

        public ProfilePhotoSelected(BitmapImage bitmapImage) {
            this.f10403a = bitmapImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfilePhotoSelected) && Intrinsics.d(this.f10403a, ((ProfilePhotoSelected) obj).f10403a);
        }

        public final int hashCode() {
            return this.f10403a.hashCode();
        }

        public final String toString() {
            return "ProfilePhotoSelected(selectedPhotoBitmap=" + this.f10403a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$SkipClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SkipClicked extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SkipClicked f10404a = new SkipClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipClicked);
        }

        public final int hashCode() {
            return 687446678;
        }

        public final String toString() {
            return "SkipClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent$UploadProfilePhotoClicked;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadProfilePhotoClicked extends MinProfileUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UploadProfilePhotoClicked f10405a = new UploadProfilePhotoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadProfilePhotoClicked);
        }

        public final int hashCode() {
            return 119792267;
        }

        public final String toString() {
            return "UploadProfilePhotoClicked";
        }
    }
}
