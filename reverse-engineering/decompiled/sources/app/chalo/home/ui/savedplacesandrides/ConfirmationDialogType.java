package app.chalo.home.ui.savedplacesandrides;

import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/ConfirmationDialogType;", "", "Place", "Ride", "Lapp/chalo/home/ui/savedplacesandrides/ConfirmationDialogType$Place;", "Lapp/chalo/home/ui/savedplacesandrides/ConfirmationDialogType$Ride;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ConfirmationDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/ConfirmationDialogType$Place;", "Lapp/chalo/home/ui/savedplacesandrides/ConfirmationDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Place extends ConfirmationDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserCommutePreferenceStopPlaceAppModel f3671a;

        public Place(UserCommutePreferenceStopPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.f3671a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Place) && Intrinsics.d(this.f3671a, ((Place) obj).f3671a);
        }

        public final int hashCode() {
            return this.f3671a.hashCode();
        }

        public final String toString() {
            return "Place(place=" + this.f3671a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/ConfirmationDialogType$Ride;", "Lapp/chalo/home/ui/savedplacesandrides/ConfirmationDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ride extends ConfirmationDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserCommutePreferenceSavedRideAppModel f3672a;

        public Ride(UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel) {
            this.f3672a = userCommutePreferenceSavedRideAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ride) && Intrinsics.d(this.f3672a, ((Ride) obj).f3672a);
        }

        public final int hashCode() {
            return this.f3672a.hashCode();
        }

        public final String toString() {
            return "Ride(ride=" + this.f3672a + ")";
        }
    }
}
