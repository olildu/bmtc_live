package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.userprofile.Gender;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType;", "", "GenderSelection", "DobDatePicker", "PassStartTimeDatePicker", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType$DobDatePicker;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType$GenderSelection;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType$PassStartTimeDatePicker;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassBasicDetailsDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType$DobDatePicker;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobDatePicker extends SuperPassBasicDetailsDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f8407a;
        public final long b;
        public final long c;

        public DobDatePicker(Long l, long j, long j2) {
            this.f8407a = l;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DobDatePicker)) {
                return false;
            }
            DobDatePicker dobDatePicker = (DobDatePicker) obj;
            return Intrinsics.d(this.f8407a, dobDatePicker.f8407a) && this.b == dobDatePicker.b && this.c == dobDatePicker.c;
        }

        public final int hashCode() {
            Long l = this.f8407a;
            int iHashCode = l == null ? 0 : l.hashCode();
            long j = this.b;
            int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.c;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DobDatePicker(initial=");
            sb.append(this.f8407a);
            sb.append(", lower=");
            sb.append(this.b);
            return t10.g(this.c, ", upper=", ")", sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType$GenderSelection;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderSelection extends SuperPassBasicDetailsDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Gender f8408a;
        public final List b;

        public GenderSelection(Gender currentSelection, List options) {
            Intrinsics.i(currentSelection, "currentSelection");
            Intrinsics.i(options, "options");
            this.f8408a = currentSelection;
            this.b = options;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenderSelection)) {
                return false;
            }
            GenderSelection genderSelection = (GenderSelection) obj;
            return this.f8408a == genderSelection.f8408a && Intrinsics.d(this.b, genderSelection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8408a.hashCode() * 31);
        }

        public final String toString() {
            return "GenderSelection(currentSelection=" + this.f8408a + ", options=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType$PassStartTimeDatePicker;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicDetailsDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassStartTimeDatePicker extends SuperPassBasicDetailsDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f8409a;
        public final long b;
        public final long c;

        public PassStartTimeDatePicker(Long l, long j, long j2) {
            this.f8409a = l;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassStartTimeDatePicker)) {
                return false;
            }
            PassStartTimeDatePicker passStartTimeDatePicker = (PassStartTimeDatePicker) obj;
            return Intrinsics.d(this.f8409a, passStartTimeDatePicker.f8409a) && this.b == passStartTimeDatePicker.b && this.c == passStartTimeDatePicker.c;
        }

        public final int hashCode() {
            Long l = this.f8409a;
            int iHashCode = l == null ? 0 : l.hashCode();
            long j = this.b;
            int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.c;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PassStartTimeDatePicker(initial=");
            sb.append(this.f8409a);
            sb.append(", lower=");
            sb.append(this.b);
            return t10.g(this.c, ", upper=", ")", sb);
        }
    }
}
