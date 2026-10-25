package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteAvailabilityDialogUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteAvailabilityDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUrlUIState f4916a;
    public final TextUIState b;
    public final TextUIState c;
    public final TextUIState d;
    public final RouteAvailabilityDialogUISpecs e;

    public RouteAvailabilityDialogUIState(ImageUrlUIState imageUrlUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3) {
        RouteAvailabilityDialogUISpecs routeAvailabilityDialogUISpecs = new RouteAvailabilityDialogUISpecs();
        this.f4916a = imageUrlUIState;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = chaloTextUIState3;
        this.e = routeAvailabilityDialogUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAvailabilityDialogUIState)) {
            return false;
        }
        RouteAvailabilityDialogUIState routeAvailabilityDialogUIState = (RouteAvailabilityDialogUIState) obj;
        return Intrinsics.d(this.f4916a, routeAvailabilityDialogUIState.f4916a) && Intrinsics.d(this.b, routeAvailabilityDialogUIState.b) && Intrinsics.d(this.c, routeAvailabilityDialogUIState.c) && Intrinsics.d(this.d, routeAvailabilityDialogUIState.d) && Intrinsics.d(this.e, routeAvailabilityDialogUIState.e);
    }

    public final int hashCode() {
        ImageUrlUIState imageUrlUIState = this.f4916a;
        int iHashCode = (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode()) * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        TextUIState textUIState2 = this.c;
        int iHashCode3 = (iHashCode2 + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 31;
        TextUIState textUIState3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (textUIState3 != null ? textUIState3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RouteAvailabilityDialogUIState(img=" + this.f4916a + ", title=" + this.b + ", subtitle=" + this.c + ", cta=" + this.d + ", specs=" + this.e + ")";
    }
}
