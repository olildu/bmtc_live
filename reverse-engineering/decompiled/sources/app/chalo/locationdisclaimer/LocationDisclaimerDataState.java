package app.chalo.locationdisclaimer;

import app.chalo.locationdisclaimer.domain.LocationDisclaimerStepsAndLottiType;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationDisclaimerDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5165a;
    public final boolean b;
    public final LocationDisclaimerStepsAndLottiType c;
    public final boolean d;

    public LocationDisclaimerDataState(boolean z, boolean z2, LocationDisclaimerStepsAndLottiType locationDisclaimerStepsAndLottiType, boolean z3) {
        this.f5165a = z;
        this.b = z2;
        this.c = locationDisclaimerStepsAndLottiType;
        this.d = z3;
    }

    public static LocationDisclaimerDataState a(LocationDisclaimerDataState locationDisclaimerDataState, boolean z, boolean z2, LocationDisclaimerStepsAndLottiType locationDisclaimerStepsAndLottiType, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = locationDisclaimerDataState.f5165a;
        }
        if ((i & 2) != 0) {
            z2 = locationDisclaimerDataState.b;
        }
        if ((i & 4) != 0) {
            locationDisclaimerStepsAndLottiType = locationDisclaimerDataState.c;
        }
        locationDisclaimerDataState.getClass();
        if ((i & 16) != 0) {
            z3 = locationDisclaimerDataState.d;
        }
        locationDisclaimerDataState.getClass();
        return new LocationDisclaimerDataState(z, z2, locationDisclaimerStepsAndLottiType, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDisclaimerDataState)) {
            return false;
        }
        LocationDisclaimerDataState locationDisclaimerDataState = (LocationDisclaimerDataState) obj;
        return this.f5165a == locationDisclaimerDataState.f5165a && this.b == locationDisclaimerDataState.b && Intrinsics.d(this.c, locationDisclaimerDataState.c) && this.d == locationDisclaimerDataState.d;
    }

    public final int hashCode() {
        int i = (((this.f5165a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        LocationDisclaimerStepsAndLottiType locationDisclaimerStepsAndLottiType = this.c;
        return ((((i + (locationDisclaimerStepsAndLottiType == null ? 0 : locationDisclaimerStepsAndLottiType.hashCode())) * 31) + 1237) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("LocationDisclaimerDataState(isLocationPermissionEnabled=", ", isLoading=", ", locationDisclaimerStepsAndLottiType=", this.f5165a, this.b);
        sbR.append(this.c);
        sbR.append(", showGpsEnablePrompt=false, isLocationEnableDialogVisible=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
