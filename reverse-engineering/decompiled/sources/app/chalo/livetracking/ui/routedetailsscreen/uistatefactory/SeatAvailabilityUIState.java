package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/SeatAvailabilityUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatAvailabilityUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f4947a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final SeatAvailabilityUISpec d;

    public SeatAvailabilityUIState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        SeatAvailabilityUISpec seatAvailabilityUISpec = new SeatAvailabilityUISpec();
        this.f4947a = imageUIState;
        this.b = chaloTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = seatAvailabilityUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatAvailabilityUIState)) {
            return false;
        }
        SeatAvailabilityUIState seatAvailabilityUIState = (SeatAvailabilityUIState) obj;
        return Intrinsics.d(this.f4947a, seatAvailabilityUIState.f4947a) && Intrinsics.d(this.b, seatAvailabilityUIState.b) && Intrinsics.d(this.c, seatAvailabilityUIState.c) && Intrinsics.d(this.d, seatAvailabilityUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gf.a(this.c, r30.f(this.b, this.f4947a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("SeatAvailabilityUIState(img=", this.f4947a, ", text=", this.b, ", eventHandler=");
        sbN.append(this.c);
        sbN.append(", spec=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
