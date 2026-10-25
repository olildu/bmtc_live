package app.chalo.home.ui.savedplacesandrides;

import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "", "InitializationIntent", "DeletePlaceIntent", "DeleteRideIntent", "ConfirmationDialogPositiveBtnClickIntent", "ConfirmationDialogNegativeBtnClickIntent", "AddAndEditPlaceIntent", "AddRideIntent", "EditRideIntent", "PlaceSelectionFieldResultIntent", "RetryClickedIntent", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$AddAndEditPlaceIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$AddRideIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$ConfirmationDialogNegativeBtnClickIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$ConfirmationDialogPositiveBtnClickIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$DeletePlaceIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$DeleteRideIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$EditRideIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$InitializationIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$PlaceSelectionFieldResultIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$RetryClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SavedPlacesAndRidesIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$AddAndEditPlaceIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddAndEditPlaceIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserCommutePreferenceTag f3681a;

        public AddAndEditPlaceIntent(UserCommutePreferenceTag tag) {
            Intrinsics.i(tag, "tag");
            this.f3681a = tag;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddAndEditPlaceIntent) && this.f3681a == ((AddAndEditPlaceIntent) obj).f3681a;
        }

        public final int hashCode() {
            return this.f3681a.hashCode();
        }

        public final String toString() {
            return "AddAndEditPlaceIntent(tag=" + this.f3681a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$AddRideIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddRideIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddRideIntent f3682a = new AddRideIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddRideIntent);
        }

        public final int hashCode() {
            return 495656924;
        }

        public final String toString() {
            return "AddRideIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$ConfirmationDialogNegativeBtnClickIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmationDialogNegativeBtnClickIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmationDialogNegativeBtnClickIntent f3683a = new ConfirmationDialogNegativeBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmationDialogNegativeBtnClickIntent);
        }

        public final int hashCode() {
            return 794486035;
        }

        public final String toString() {
            return "ConfirmationDialogNegativeBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$ConfirmationDialogPositiveBtnClickIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmationDialogPositiveBtnClickIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmationDialogPositiveBtnClickIntent f3684a = new ConfirmationDialogPositiveBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmationDialogPositiveBtnClickIntent);
        }

        public final int hashCode() {
            return 55118807;
        }

        public final String toString() {
            return "ConfirmationDialogPositiveBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$DeletePlaceIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeletePlaceIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserCommutePreferenceStopPlaceAppModel f3685a;

        public DeletePlaceIntent(UserCommutePreferenceStopPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.f3685a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeletePlaceIntent) && Intrinsics.d(this.f3685a, ((DeletePlaceIntent) obj).f3685a);
        }

        public final int hashCode() {
            return this.f3685a.hashCode();
        }

        public final String toString() {
            return "DeletePlaceIntent(place=" + this.f3685a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$DeleteRideIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeleteRideIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserCommutePreferenceSavedRideAppModel f3686a;

        public DeleteRideIntent(UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel) {
            this.f3686a = userCommutePreferenceSavedRideAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteRideIntent) && Intrinsics.d(this.f3686a, ((DeleteRideIntent) obj).f3686a);
        }

        public final int hashCode() {
            return this.f3686a.hashCode();
        }

        public final String toString() {
            return "DeleteRideIntent(ride=" + this.f3686a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$EditRideIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditRideIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserCommutePreferenceSavedRideAppModel f3687a;

        public EditRideIntent(UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel) {
            this.f3687a = userCommutePreferenceSavedRideAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditRideIntent) && Intrinsics.d(this.f3687a, ((EditRideIntent) obj).f3687a);
        }

        public final int hashCode() {
            return this.f3687a.hashCode();
        }

        public final String toString() {
            return "EditRideIntent(ride=" + this.f3687a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$InitializationIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitializationIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f3688a = new InitializationIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$PlaceSelectionFieldResultIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlaceSelectionFieldResultIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserCommutePreferenceTag f3689a;
        public final RecentPlaceAppModel b;

        public PlaceSelectionFieldResultIntent(UserCommutePreferenceTag userCommutePreferenceTag, RecentPlaceAppModel recentPlaceAppModel) {
            Intrinsics.i(userCommutePreferenceTag, "userCommutePreferenceTag");
            this.f3689a = userCommutePreferenceTag;
            this.b = recentPlaceAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaceSelectionFieldResultIntent)) {
                return false;
            }
            PlaceSelectionFieldResultIntent placeSelectionFieldResultIntent = (PlaceSelectionFieldResultIntent) obj;
            return this.f3689a == placeSelectionFieldResultIntent.f3689a && Intrinsics.d(this.b, placeSelectionFieldResultIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3689a.hashCode() * 31);
        }

        public final String toString() {
            return "PlaceSelectionFieldResultIntent(userCommutePreferenceTag=" + this.f3689a + ", place=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent$RetryClickedIntent;", "Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryClickedIntent extends SavedPlacesAndRidesIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryClickedIntent f3690a = new RetryClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryClickedIntent);
        }

        public final int hashCode() {
            return -643827308;
        }

        public final String toString() {
            return "RetryClickedIntent";
        }
    }
}
