package app.chalo.locationdisclaimer;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationDisclaimerViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationDisclaimerUISpecs f5173a;
    public final boolean b;
    public final LocationDisclaimerHeaderUIState c;
    public final LocationDisclaimerInstructionsSectionUIState d;
    public final DividerUIState e;
    public final ButtonUIState f;

    public LocationDisclaimerViewState(boolean z, LocationDisclaimerHeaderUIState locationDisclaimerHeaderUIState, LocationDisclaimerInstructionsSectionUIState locationDisclaimerSectionUIState, ButtonUIState buttonUIState) {
        LocationDisclaimerUISpecs locationDisclaimerUISpecs = new LocationDisclaimerUISpecs();
        DividerUIState dividerUIState = new DividerUIState(0.0f, ChaloColorToken.Black_12.f9761a, null, 5);
        Intrinsics.i(locationDisclaimerSectionUIState, "locationDisclaimerSectionUIState");
        this.f5173a = locationDisclaimerUISpecs;
        this.b = z;
        this.c = locationDisclaimerHeaderUIState;
        this.d = locationDisclaimerSectionUIState;
        this.e = dividerUIState;
        this.f = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDisclaimerViewState)) {
            return false;
        }
        LocationDisclaimerViewState locationDisclaimerViewState = (LocationDisclaimerViewState) obj;
        return Intrinsics.d(this.f5173a, locationDisclaimerViewState.f5173a) && this.b == locationDisclaimerViewState.b && Intrinsics.d(this.c, locationDisclaimerViewState.c) && Intrinsics.d(this.d, locationDisclaimerViewState.d) && Intrinsics.d(this.e, locationDisclaimerViewState.e) && Intrinsics.d(this.f, locationDisclaimerViewState.f);
    }

    public final int hashCode() {
        int iHashCode = ((this.f5173a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        LocationDisclaimerHeaderUIState locationDisclaimerHeaderUIState = this.c;
        int iC = py.c(this.e, (this.d.hashCode() + ((iHashCode + (locationDisclaimerHeaderUIState == null ? 0 : locationDisclaimerHeaderUIState.hashCode())) * 31)) * 31, 31);
        ButtonUIState buttonUIState = this.f;
        return iC + (buttonUIState != null ? buttonUIState.hashCode() : 0);
    }

    public final String toString() {
        return "LocationDisclaimerViewState(specs=" + this.f5173a + ", isLoading=" + this.b + ", locationDisclaimerHeaderUIState=" + this.c + ", locationDisclaimerSectionUIState=" + this.d + ", dividerUIState=" + this.e + ", goToSettingsBtnUIState=" + this.f + ")";
    }
}
