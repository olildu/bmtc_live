package app.chalo.userprofile.ui;

import app.chalo.constants.Source;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.gf;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "", "InitializationIntent", "BackBtnClicked", "SaveBtnClicked", "UploadProfilePhotoClicked", "ProfilePhotoSelected", "NameEntered", "GenderSelected", "EmailIdEntered", "AgeEntered", "DobFieldClicked", "DobSelected", "DobPickerDismissed", "FieldFocusChanged", "DialogPositiveBtnClicked", "DialogNegativeBtnClicked", "PermissionRationaleDialogInteraction", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$AgeEntered;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$BackBtnClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$DialogNegativeBtnClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$DialogPositiveBtnClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$DobFieldClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$DobPickerDismissed;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$DobSelected;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$EmailIdEntered;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$FieldFocusChanged;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$GenderSelected;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$InitializationIntent;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$NameEntered;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$ProfilePhotoSelected;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$SaveBtnClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent$UploadProfilePhotoClicked;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UserProfileFormIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$AgeEntered;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AgeEntered extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10353a;

        public AgeEntered(String ageEntered) {
            Intrinsics.i(ageEntered, "ageEntered");
            this.f10353a = ageEntered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AgeEntered) && Intrinsics.d(this.f10353a, ((AgeEntered) obj).f10353a);
        }

        public final int hashCode() {
            return this.f10353a.hashCode();
        }

        public final String toString() {
            return vo1.B("AgeEntered(ageEntered=", this.f10353a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$BackBtnClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackBtnClicked extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackBtnClicked f10354a = new BackBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackBtnClicked);
        }

        public final int hashCode() {
            return 1892903408;
        }

        public final String toString() {
            return "BackBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$DialogNegativeBtnClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DialogNegativeBtnClicked extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DialogNegativeBtnClicked f10355a = new DialogNegativeBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogNegativeBtnClicked);
        }

        public final int hashCode() {
            return 1122916774;
        }

        public final String toString() {
            return "DialogNegativeBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$DialogPositiveBtnClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DialogPositiveBtnClicked extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DialogPositiveBtnClicked f10356a = new DialogPositiveBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogPositiveBtnClicked);
        }

        public final int hashCode() {
            return 1416004202;
        }

        public final String toString() {
            return "DialogPositiveBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$DobFieldClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobFieldClicked extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DobFieldClicked f10357a = new DobFieldClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DobFieldClicked);
        }

        public final int hashCode() {
            return -757508890;
        }

        public final String toString() {
            return "DobFieldClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$DobPickerDismissed;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobPickerDismissed extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DobPickerDismissed f10358a = new DobPickerDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DobPickerDismissed);
        }

        public final int hashCode() {
            return -323576318;
        }

        public final String toString() {
            return "DobPickerDismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$DobSelected;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobSelected extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f10359a;

        public DobSelected(Long l) {
            this.f10359a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DobSelected) && Intrinsics.d(this.f10359a, ((DobSelected) obj).f10359a);
        }

        public final int hashCode() {
            Long l = this.f10359a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "DobSelected(dobInMillis=" + this.f10359a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$EmailIdEntered;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmailIdEntered extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10360a;

        public EmailIdEntered(String emailIdEntered) {
            Intrinsics.i(emailIdEntered, "emailIdEntered");
            this.f10360a = emailIdEntered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmailIdEntered) && Intrinsics.d(this.f10360a, ((EmailIdEntered) obj).f10360a);
        }

        public final int hashCode() {
            return this.f10360a.hashCode();
        }

        public final String toString() {
            return vo1.B("EmailIdEntered(emailIdEntered=", this.f10360a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$FieldFocusChanged;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FieldFocusChanged extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserProfileFieldType f10361a;
        public final boolean b;

        public FieldFocusChanged(UserProfileFieldType fieldType, boolean z) {
            Intrinsics.i(fieldType, "fieldType");
            this.f10361a = fieldType;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FieldFocusChanged)) {
                return false;
            }
            FieldFocusChanged fieldFocusChanged = (FieldFocusChanged) obj;
            return Intrinsics.d(this.f10361a, fieldFocusChanged.f10361a) && this.b == fieldFocusChanged.b;
        }

        public final int hashCode() {
            return (this.f10361a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "FieldFocusChanged(fieldType=" + this.f10361a + ", isFocused=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$GenderSelected;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderSelected extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Gender f10362a;

        public GenderSelected(Gender genderSelected) {
            Intrinsics.i(genderSelected, "genderSelected");
            this.f10362a = genderSelected;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenderSelected) && this.f10362a == ((GenderSelected) obj).f10362a;
        }

        public final int hashCode() {
            return this.f10362a.hashCode();
        }

        public final String toString() {
            return "GenderSelected(genderSelected=" + this.f10362a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$InitializationIntent;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f10363a;

        public InitializationIntent(Source source) {
            Intrinsics.i(source, "source");
            this.f10363a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f10363a == ((InitializationIntent) obj).f10363a;
        }

        public final int hashCode() {
            return this.f10363a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f10363a, "InitializationIntent(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$NameEntered;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NameEntered extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10364a;

        public NameEntered(String nameEntered) {
            Intrinsics.i(nameEntered, "nameEntered");
            this.f10364a = nameEntered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameEntered) && Intrinsics.d(this.f10364a, ((NameEntered) obj).f10364a);
        }

        public final int hashCode() {
            return this.f10364a.hashCode();
        }

        public final String toString() {
            return vo1.B("NameEntered(nameEntered=", this.f10364a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionRationaleDialogInteraction extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10365a;

        public PermissionRationaleDialogInteraction(boolean z) {
            this.f10365a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionRationaleDialogInteraction) && this.f10365a == ((PermissionRationaleDialogInteraction) obj).f10365a;
        }

        public final int hashCode() {
            return this.f10365a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("PermissionRationaleDialogInteraction(shouldNavigateToSettings=", ")", this.f10365a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$ProfilePhotoSelected;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfilePhotoSelected extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BitmapImage f10366a;

        public ProfilePhotoSelected(BitmapImage bitmapImage) {
            this.f10366a = bitmapImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfilePhotoSelected) && Intrinsics.d(this.f10366a, ((ProfilePhotoSelected) obj).f10366a);
        }

        public final int hashCode() {
            return this.f10366a.hashCode();
        }

        public final String toString() {
            return "ProfilePhotoSelected(selectedPhotoBitmap=" + this.f10366a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$SaveBtnClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveBtnClicked extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SaveBtnClicked f10367a = new SaveBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveBtnClicked);
        }

        public final int hashCode() {
            return -2057247994;
        }

        public final String toString() {
            return "SaveBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormIntent$UploadProfilePhotoClicked;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadProfilePhotoClicked extends UserProfileFormIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UploadProfilePhotoClicked f10368a = new UploadProfilePhotoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadProfilePhotoClicked);
        }

        public final int hashCode() {
            return 750368735;
        }

        public final String toString() {
            return "UploadProfilePhotoClicked";
        }
    }
}
