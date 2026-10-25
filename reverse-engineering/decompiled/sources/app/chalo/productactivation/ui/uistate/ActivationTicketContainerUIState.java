package app.chalo.productactivation.ui.uistate;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketContainerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationTicketContainerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationTicketContainerUISpecs f8058a;
    public final ActivationTicketRouteDetailsUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;

    public ActivationTicketContainerUIState(ActivationTicketRouteDetailsUIState activationTicketRouteDetailsUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, int i) {
        ActivationTicketContainerUISpecs activationTicketContainerUISpecs = new ActivationTicketContainerUISpecs();
        activationTicketRouteDetailsUIState = (i & 2) != 0 ? null : activationTicketRouteDetailsUIState;
        chaloTextUIState = (i & 4) != 0 ? null : chaloTextUIState;
        this.f8058a = activationTicketContainerUISpecs;
        this.b = activationTicketRouteDetailsUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationTicketContainerUIState)) {
            return false;
        }
        ActivationTicketContainerUIState activationTicketContainerUIState = (ActivationTicketContainerUIState) obj;
        return Intrinsics.d(this.f8058a, activationTicketContainerUIState.f8058a) && Intrinsics.d(this.b, activationTicketContainerUIState.b) && Intrinsics.d(this.c, activationTicketContainerUIState.c) && Intrinsics.d(this.d, activationTicketContainerUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f8058a.hashCode() * 31;
        ActivationTicketRouteDetailsUIState activationTicketRouteDetailsUIState = this.b;
        int iHashCode2 = (iHashCode + (activationTicketRouteDetailsUIState == null ? 0 : activationTicketRouteDetailsUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iHashCode3 = (iHashCode2 + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.d;
        return iHashCode3 + (chaloTextUIState2 != null ? chaloTextUIState2.hashCode() : 0);
    }

    public final String toString() {
        return "ActivationTicketContainerUIState(specs=" + this.f8058a + ", routeDetailsUIState=" + this.b + ", amountTextUIState=" + this.c + ", validTillTextUIState=" + this.d + ")";
    }
}
