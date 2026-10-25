package app.chalo.premiumbus.ui.seatselection;

import app.chalo.userprofile.Gender;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType;", "", "PreferenceSelectionBottomSheetType", "GenderPreferenceSelectionSuccess", "GenderPreferenceSelectionError", "GenderPreferenceSelectionLoading", "Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType$GenderPreferenceSelectionError;", "Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType$GenderPreferenceSelectionLoading;", "Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType$GenderPreferenceSelectionSuccess;", "Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType$PreferenceSelectionBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GenderConfirmationBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType$GenderPreferenceSelectionError;", "Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderPreferenceSelectionError extends GenderConfirmationBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderPreferenceSelectionError f7714a = new GenderPreferenceSelectionError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderPreferenceSelectionError);
        }

        public final int hashCode() {
            return 505193350;
        }

        public final String toString() {
            return "GenderPreferenceSelectionError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType$GenderPreferenceSelectionLoading;", "Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderPreferenceSelectionLoading extends GenderConfirmationBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderPreferenceSelectionLoading f7715a = new GenderPreferenceSelectionLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderPreferenceSelectionLoading);
        }

        public final int hashCode() {
            return 1975143226;
        }

        public final String toString() {
            return "GenderPreferenceSelectionLoading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType$GenderPreferenceSelectionSuccess;", "Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderPreferenceSelectionSuccess extends GenderConfirmationBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderPreferenceSelectionSuccess f7716a = new GenderPreferenceSelectionSuccess();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderPreferenceSelectionSuccess);
        }

        public final int hashCode() {
            return -228677119;
        }

        public final String toString() {
            return "GenderPreferenceSelectionSuccess";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType$PreferenceSelectionBottomSheetType;", "Lapp/chalo/premiumbus/ui/seatselection/GenderConfirmationBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PreferenceSelectionBottomSheetType extends GenderConfirmationBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7717a;
        public final Gender b;

        public PreferenceSelectionBottomSheetType(Gender gender, List genderOptions) {
            Intrinsics.i(genderOptions, "genderOptions");
            this.f7717a = genderOptions;
            this.b = gender;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreferenceSelectionBottomSheetType)) {
                return false;
            }
            PreferenceSelectionBottomSheetType preferenceSelectionBottomSheetType = (PreferenceSelectionBottomSheetType) obj;
            return Intrinsics.d(this.f7717a, preferenceSelectionBottomSheetType.f7717a) && this.b == preferenceSelectionBottomSheetType.b;
        }

        public final int hashCode() {
            int iHashCode = this.f7717a.hashCode() * 31;
            Gender gender = this.b;
            return iHashCode + (gender == null ? 0 : gender.hashCode());
        }

        public final String toString() {
            return "PreferenceSelectionBottomSheetType(genderOptions=" + this.f7717a + ", selectedGender=" + this.b + ")";
        }

        public /* synthetic */ PreferenceSelectionBottomSheetType(int i) {
            this(null, CollectionsKt.S(Gender.MALE, Gender.FEMALE, Gender.OTHER));
        }
    }
}
