package app.chalo.home.ui.selectridescreen;

import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelectRideDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferencePlaceLocationAppModel f3703a;
    public final UserCommutePreferencePlaceLocationAppModel b;
    public final SelectedTime c;
    public final boolean d;
    public final boolean e;
    public final RideSavedSuccessFailureState f;
    public final boolean g;
    public final LocationSelectionType h;
    public final ScreenType i;

    public SelectRideDataState(UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2, SelectedTime selectedTime, boolean z, boolean z2, RideSavedSuccessFailureState rideSavedSuccessFailureState, boolean z3, LocationSelectionType locationSelectionType, ScreenType screenType) {
        Intrinsics.i(locationSelectionType, "locationSelectionType");
        Intrinsics.i(screenType, "screenType");
        this.f3703a = userCommutePreferencePlaceLocationAppModel;
        this.b = userCommutePreferencePlaceLocationAppModel2;
        this.c = selectedTime;
        this.d = z;
        this.e = z2;
        this.f = rideSavedSuccessFailureState;
        this.g = z3;
        this.h = locationSelectionType;
        this.i = screenType;
    }

    public static SelectRideDataState a(SelectRideDataState selectRideDataState, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2, SelectedTime selectedTime, boolean z, boolean z2, RideSavedSuccessFailureState rideSavedSuccessFailureState, boolean z3, ScreenType screenType, int i) {
        if ((i & 1) != 0) {
            userCommutePreferencePlaceLocationAppModel = selectRideDataState.f3703a;
        }
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel3 = userCommutePreferencePlaceLocationAppModel;
        if ((i & 2) != 0) {
            userCommutePreferencePlaceLocationAppModel2 = selectRideDataState.b;
        }
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel4 = userCommutePreferencePlaceLocationAppModel2;
        if ((i & 4) != 0) {
            selectedTime = selectRideDataState.c;
        }
        SelectedTime selectedTime2 = selectedTime;
        if ((i & 8) != 0) {
            z = selectRideDataState.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = selectRideDataState.e;
        }
        boolean z5 = z2;
        RideSavedSuccessFailureState rideSavedSuccessFailureState2 = (i & 32) != 0 ? selectRideDataState.f : rideSavedSuccessFailureState;
        boolean z6 = (i & 64) != 0 ? selectRideDataState.g : z3;
        LocationSelectionType locationSelectionType = selectRideDataState.h;
        ScreenType screenType2 = (i & 256) != 0 ? selectRideDataState.i : screenType;
        selectRideDataState.getClass();
        Intrinsics.i(locationSelectionType, "locationSelectionType");
        Intrinsics.i(screenType2, "screenType");
        return new SelectRideDataState(userCommutePreferencePlaceLocationAppModel3, userCommutePreferencePlaceLocationAppModel4, selectedTime2, z4, z5, rideSavedSuccessFailureState2, z6, locationSelectionType, screenType2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectRideDataState)) {
            return false;
        }
        SelectRideDataState selectRideDataState = (SelectRideDataState) obj;
        return Intrinsics.d(this.f3703a, selectRideDataState.f3703a) && Intrinsics.d(this.b, selectRideDataState.b) && Intrinsics.d(this.c, selectRideDataState.c) && this.d == selectRideDataState.d && this.e == selectRideDataState.e && this.f == selectRideDataState.f && this.g == selectRideDataState.g && this.h == selectRideDataState.h && this.i == selectRideDataState.i;
    }

    public final int hashCode() {
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = this.f3703a;
        int iHashCode = (userCommutePreferencePlaceLocationAppModel == null ? 0 : userCommutePreferencePlaceLocationAppModel.hashCode()) * 31;
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2 = this.b;
        int iHashCode2 = (iHashCode + (userCommutePreferencePlaceLocationAppModel2 == null ? 0 : userCommutePreferencePlaceLocationAppModel2.hashCode())) * 31;
        SelectedTime selectedTime = this.c;
        int iHashCode3 = (((((iHashCode2 + (selectedTime == null ? 0 : selectedTime.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31;
        RideSavedSuccessFailureState rideSavedSuccessFailureState = this.f;
        return this.i.hashCode() + ((this.h.hashCode() + ((((iHashCode3 + (rideSavedSuccessFailureState != null ? rideSavedSuccessFailureState.hashCode() : 0)) * 31) + (this.g ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectRideDataState(from=" + this.f3703a + ", to=" + this.b + ", selectedTime=" + this.c + ", showTimePicker=" + this.d + ", isEditMode=" + this.e + ", rideSavedSuccessFailureState=" + this.f + ", isLoading=" + this.g + ", locationSelectionType=" + this.h + ", screenType=" + this.i + ")";
    }
}
