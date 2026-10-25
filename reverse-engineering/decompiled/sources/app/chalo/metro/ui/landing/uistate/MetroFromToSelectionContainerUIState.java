package app.chalo.metro.ui.landing.uistate;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroFromToSelectionContainerUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroFromToSelectionContainerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FromToSelectionContainerUISpec f5521a;
    public final TextUIState.ChaloTextUIState b;
    public final FromToStopIconUIState c;
    public final StopSelectionUIState d;
    public final StopSelectionUIState e;
    public final StopSelectionUIState f;
    public final ImageUIState g;
    public final ButtonUIState h;

    public MetroFromToSelectionContainerUIState(TextUIState.ChaloTextUIState title, FromToStopIconUIState fromToStopIconUIState, StopSelectionUIState stopSelectionUIState, StopSelectionUIState fromStop, StopSelectionUIState toStop, ImageUIState swapButtonImageUIState, ButtonUIState buttonUIState) {
        FromToSelectionContainerUISpec fromToSelectionContainerUISpec = new FromToSelectionContainerUISpec();
        Intrinsics.i(title, "title");
        Intrinsics.i(fromToStopIconUIState, "fromToStopIconUIState");
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        Intrinsics.i(swapButtonImageUIState, "swapButtonImageUIState");
        this.f5521a = fromToSelectionContainerUISpec;
        this.b = title;
        this.c = fromToStopIconUIState;
        this.d = stopSelectionUIState;
        this.e = fromStop;
        this.f = toStop;
        this.g = swapButtonImageUIState;
        this.h = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroFromToSelectionContainerUIState)) {
            return false;
        }
        MetroFromToSelectionContainerUIState metroFromToSelectionContainerUIState = (MetroFromToSelectionContainerUIState) obj;
        return Intrinsics.d(this.f5521a, metroFromToSelectionContainerUIState.f5521a) && Intrinsics.d(this.b, metroFromToSelectionContainerUIState.b) && Intrinsics.d(this.c, metroFromToSelectionContainerUIState.c) && Intrinsics.d(this.d, metroFromToSelectionContainerUIState.d) && Intrinsics.d(this.e, metroFromToSelectionContainerUIState.e) && Intrinsics.d(this.f, metroFromToSelectionContainerUIState.f) && Intrinsics.d(this.g, metroFromToSelectionContainerUIState.g) && Intrinsics.d(this.h, metroFromToSelectionContainerUIState.h);
    }

    public final int hashCode() {
        int iHashCode = (this.c.f9938a.hashCode() + r30.f(this.b, this.f5521a.hashCode() * 31, 31)) * 31;
        StopSelectionUIState stopSelectionUIState = this.d;
        return this.h.hashCode() + r30.e(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (stopSelectionUIState == null ? 0 : stopSelectionUIState.hashCode())) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "MetroFromToSelectionContainerUIState(uiSpec=" + this.f5521a + ", title=" + this.b + ", fromToStopIconUIState=" + this.c + ", metroLine=" + this.d + ", fromStop=" + this.e + ", toStop=" + this.f + ", swapButtonImageUIState=" + this.g + ", searchButton=" + this.h + ")";
    }
}
