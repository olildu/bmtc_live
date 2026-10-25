package app.chalo.home.ui.savedplacesandrides;

import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SavedPlacesAndRidesDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3680a;
    public final boolean b;
    public final UserCommutePreferenceStopPlaceAppModel c;
    public final UserCommutePreferenceStopPlaceAppModel d;
    public final List e;
    public final ConfirmationDialogType f;
    public final boolean g;
    public final boolean h;

    public SavedPlacesAndRidesDataState(boolean z, boolean z2, UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel, UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel2, List savedRides, ConfirmationDialogType confirmationDialogType, boolean z3, boolean z4) {
        Intrinsics.i(savedRides, "savedRides");
        this.f3680a = z;
        this.b = z2;
        this.c = userCommutePreferenceStopPlaceAppModel;
        this.d = userCommutePreferenceStopPlaceAppModel2;
        this.e = savedRides;
        this.f = confirmationDialogType;
        this.g = z3;
        this.h = z4;
    }

    public static SavedPlacesAndRidesDataState a(SavedPlacesAndRidesDataState savedPlacesAndRidesDataState, boolean z, boolean z2, UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel, UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel2, List list, ConfirmationDialogType confirmationDialogType, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = savedPlacesAndRidesDataState.f3680a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = savedPlacesAndRidesDataState.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            userCommutePreferenceStopPlaceAppModel = savedPlacesAndRidesDataState.c;
        }
        UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel3 = userCommutePreferenceStopPlaceAppModel;
        if ((i & 8) != 0) {
            userCommutePreferenceStopPlaceAppModel2 = savedPlacesAndRidesDataState.d;
        }
        UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel4 = userCommutePreferenceStopPlaceAppModel2;
        if ((i & 16) != 0) {
            list = savedPlacesAndRidesDataState.e;
        }
        List savedRides = list;
        if ((i & 32) != 0) {
            confirmationDialogType = savedPlacesAndRidesDataState.f;
        }
        ConfirmationDialogType confirmationDialogType2 = confirmationDialogType;
        savedPlacesAndRidesDataState.getClass();
        boolean z7 = (i & 128) != 0 ? savedPlacesAndRidesDataState.g : z3;
        boolean z8 = (i & 256) != 0 ? savedPlacesAndRidesDataState.h : z4;
        savedPlacesAndRidesDataState.getClass();
        Intrinsics.i(savedRides, "savedRides");
        return new SavedPlacesAndRidesDataState(z5, z6, userCommutePreferenceStopPlaceAppModel3, userCommutePreferenceStopPlaceAppModel4, savedRides, confirmationDialogType2, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedPlacesAndRidesDataState)) {
            return false;
        }
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState = (SavedPlacesAndRidesDataState) obj;
        return this.f3680a == savedPlacesAndRidesDataState.f3680a && this.b == savedPlacesAndRidesDataState.b && Intrinsics.d(this.c, savedPlacesAndRidesDataState.c) && Intrinsics.d(this.d, savedPlacesAndRidesDataState.d) && Intrinsics.d(this.e, savedPlacesAndRidesDataState.e) && Intrinsics.d(this.f, savedPlacesAndRidesDataState.f) && this.g == savedPlacesAndRidesDataState.g && this.h == savedPlacesAndRidesDataState.h;
    }

    public final int hashCode() {
        int i = (((this.f3680a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel = this.c;
        int iHashCode = (i + (userCommutePreferenceStopPlaceAppModel == null ? 0 : userCommutePreferenceStopPlaceAppModel.hashCode())) * 31;
        UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel2 = this.d;
        int iB = r30.b((iHashCode + (userCommutePreferenceStopPlaceAppModel2 == null ? 0 : userCommutePreferenceStopPlaceAppModel2.hashCode())) * 31, 31, this.e);
        ConfirmationDialogType confirmationDialogType = this.f;
        return ((((iB + (confirmationDialogType != null ? confirmationDialogType.hashCode() : 0)) * 961) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("SavedPlacesAndRidesDataState(isPlacesFetching=", ", isRidesFetching=", ", savedHome=", this.f3680a, this.b);
        sbR.append(this.c);
        sbR.append(", savedWork=");
        sbR.append(this.d);
        sbR.append(", savedRides=");
        sbR.append(this.e);
        sbR.append(", confirmationDialogType=");
        sbR.append(this.f);
        sbR.append(", userCommutePreferenceTag=null, showLoadingDialog=");
        return n21.h(sbR, this.g, ", errorOccurred=", this.h, ")");
    }
}
