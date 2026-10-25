package app.chalo.locationdisclaimer;

import app.chalo.uistate.image.GifImageUIState;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerInstructionsSectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationDisclaimerInstructionsSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationDisclaimerInstructionsSectionUISpecs f5168a;
    public final GifImageUIState b;
    public final List c;

    public LocationDisclaimerInstructionsSectionUIState(GifImageUIState gifImageUIState, List locationDisclaimerStepsUIState, int i) {
        LocationDisclaimerInstructionsSectionUISpecs locationDisclaimerInstructionsSectionUISpecs = new LocationDisclaimerInstructionsSectionUISpecs();
        gifImageUIState = (i & 2) != 0 ? null : gifImageUIState;
        locationDisclaimerStepsUIState = (i & 4) != 0 ? EmptyList.f17557a : locationDisclaimerStepsUIState;
        Intrinsics.i(locationDisclaimerStepsUIState, "locationDisclaimerStepsUIState");
        this.f5168a = locationDisclaimerInstructionsSectionUISpecs;
        this.b = gifImageUIState;
        this.c = locationDisclaimerStepsUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDisclaimerInstructionsSectionUIState)) {
            return false;
        }
        LocationDisclaimerInstructionsSectionUIState locationDisclaimerInstructionsSectionUIState = (LocationDisclaimerInstructionsSectionUIState) obj;
        return Intrinsics.d(this.f5168a, locationDisclaimerInstructionsSectionUIState.f5168a) && Intrinsics.d(this.b, locationDisclaimerInstructionsSectionUIState.b) && Intrinsics.d(this.c, locationDisclaimerInstructionsSectionUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5168a.hashCode() * 31;
        GifImageUIState gifImageUIState = this.b;
        return this.c.hashCode() + ((iHashCode + (gifImageUIState == null ? 0 : gifImageUIState.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationDisclaimerInstructionsSectionUIState(specs=");
        sb.append(this.f5168a);
        sb.append(", gifImageUIState=");
        sb.append(this.b);
        sb.append(", locationDisclaimerStepsUIState=");
        return xs.l(sb, this.c, ")");
    }
}
