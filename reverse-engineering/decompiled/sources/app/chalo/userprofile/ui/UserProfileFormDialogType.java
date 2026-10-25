package app.chalo.userprofile.ui;

import androidx.compose.material3.SelectableDates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormDialogType;", "", "GalleryPermissionRationale", "CancelConfirmationDialog", "DobPicker", "Lapp/chalo/userprofile/ui/UserProfileFormDialogType$CancelConfirmationDialog;", "Lapp/chalo/userprofile/ui/UserProfileFormDialogType$DobPicker;", "Lapp/chalo/userprofile/ui/UserProfileFormDialogType$GalleryPermissionRationale;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UserProfileFormDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormDialogType$CancelConfirmationDialog;", "Lapp/chalo/userprofile/ui/UserProfileFormDialogType;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelConfirmationDialog extends UserProfileFormDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelConfirmationDialog f10350a = new CancelConfirmationDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelConfirmationDialog);
        }

        public final int hashCode() {
            return -118313297;
        }

        public final String toString() {
            return "CancelConfirmationDialog";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormDialogType$DobPicker;", "Lapp/chalo/userprofile/ui/UserProfileFormDialogType;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobPicker extends UserProfileFormDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10351a;
        public final SelectableDates b;

        public DobPicker(SelectableDates selectableDates, long j) {
            Intrinsics.i(selectableDates, "selectableDates");
            this.f10351a = j;
            this.b = selectableDates;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DobPicker)) {
                return false;
            }
            DobPicker dobPicker = (DobPicker) obj;
            return this.f10351a == dobPicker.f10351a && Intrinsics.d(this.b, dobPicker.b);
        }

        public final int hashCode() {
            long j = this.f10351a;
            return this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
        }

        public final String toString() {
            return "DobPicker(initialSelectedDateMillis=" + this.f10351a + ", selectableDates=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormDialogType$GalleryPermissionRationale;", "Lapp/chalo/userprofile/ui/UserProfileFormDialogType;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryPermissionRationale extends UserProfileFormDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GalleryPermissionRationale f10352a = new GalleryPermissionRationale();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GalleryPermissionRationale);
        }

        public final int hashCode() {
            return -734756370;
        }

        public final String toString() {
            return "GalleryPermissionRationale";
        }
    }
}
