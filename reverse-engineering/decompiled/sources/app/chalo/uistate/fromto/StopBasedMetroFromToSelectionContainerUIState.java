package app.chalo.uistate.fromto;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/fromto/StopBasedMetroFromToSelectionContainerUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedMetroFromToSelectionContainerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopBasedFromToSelectionContainerUISpec f10032a;
    public final TextUIState.ChaloTextUIState b;
    public final FromToStopIconUIState c;
    public final StopSelectionUIState d;
    public final StopSelectionUIState e;
    public final ImageUIState f;
    public final ButtonUIState g;

    public StopBasedMetroFromToSelectionContainerUIState(TextUIState.ChaloTextUIState chaloTextUIState, FromToStopIconUIState fromToStopIconUIState, StopSelectionUIState fromStop, StopSelectionUIState toStop, ImageUIState swapButtonImageUIState, ButtonUIState buttonUIState) {
        StopBasedFromToSelectionContainerUISpec stopBasedFromToSelectionContainerUISpec = new StopBasedFromToSelectionContainerUISpec();
        Intrinsics.i(fromToStopIconUIState, "fromToStopIconUIState");
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        Intrinsics.i(swapButtonImageUIState, "swapButtonImageUIState");
        this.f10032a = stopBasedFromToSelectionContainerUISpec;
        this.b = chaloTextUIState;
        this.c = fromToStopIconUIState;
        this.d = fromStop;
        this.e = toStop;
        this.f = swapButtonImageUIState;
        this.g = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedMetroFromToSelectionContainerUIState)) {
            return false;
        }
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) obj;
        return Intrinsics.d(this.f10032a, stopBasedMetroFromToSelectionContainerUIState.f10032a) && Intrinsics.d(this.b, stopBasedMetroFromToSelectionContainerUIState.b) && Intrinsics.d(this.c, stopBasedMetroFromToSelectionContainerUIState.c) && Intrinsics.d(this.d, stopBasedMetroFromToSelectionContainerUIState.d) && Intrinsics.d(this.e, stopBasedMetroFromToSelectionContainerUIState.e) && Intrinsics.d(this.f, stopBasedMetroFromToSelectionContainerUIState.f) && Intrinsics.d(this.g, stopBasedMetroFromToSelectionContainerUIState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f10032a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iE = r30.e(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.f9938a.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        ButtonUIState buttonUIState = this.g;
        return iE + (buttonUIState != null ? buttonUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopBasedMetroFromToSelectionContainerUIState(uiSpec=");
        sb.append(this.f10032a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", fromToStopIconUIState=");
        sb.append(this.c);
        sb.append(", fromStop=");
        sb.append(this.d);
        sb.append(", toStop=");
        sb.append(this.e);
        sb.append(", swapButtonImageUIState=");
        sb.append(this.f);
        sb.append(", searchButton=");
        return hq0.j(sb, this.g, ")");
    }
}
