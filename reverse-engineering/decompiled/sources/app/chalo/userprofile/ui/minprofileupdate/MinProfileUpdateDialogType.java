package app.chalo.userprofile.ui.minprofileupdate;

import androidx.compose.material3.SelectableDates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDialogType;", "", "GalleryPermissionRationale", "DobPicker", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDialogType$DobPicker;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDialogType$GalleryPermissionRationale;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MinProfileUpdateDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDialogType$DobPicker;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDialogType;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobPicker extends MinProfileUpdateDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10391a;
        public final SelectableDates b;

        public DobPicker(SelectableDates selectableDates, long j) {
            Intrinsics.i(selectableDates, "selectableDates");
            this.f10391a = j;
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
            return this.f10391a == dobPicker.f10391a && Intrinsics.d(this.b, dobPicker.b);
        }

        public final int hashCode() {
            long j = this.f10391a;
            return this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
        }

        public final String toString() {
            return "DobPicker(initialSelectedDateMillis=" + this.f10391a + ", selectableDates=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDialogType$GalleryPermissionRationale;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDialogType;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryPermissionRationale extends MinProfileUpdateDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GalleryPermissionRationale f10392a = new GalleryPermissionRationale();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GalleryPermissionRationale);
        }

        public final int hashCode() {
            return -1122622782;
        }

        public final String toString() {
            return "GalleryPermissionRationale";
        }
    }
}
