package app.chalo.productpurchase.passselection.ui;

import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassSelectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUISpecs f8550a = new ToolbarUISpecs();
    public final ToolbarUIState b;
    public final PassSelectionScreenTypeUIState c;

    public PassSelectionUIState(ToolbarUIState toolbarUIState, PassSelectionScreenTypeUIState passSelectionScreenTypeUIState) {
        this.b = toolbarUIState;
        this.c = passSelectionScreenTypeUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSelectionUIState)) {
            return false;
        }
        PassSelectionUIState passSelectionUIState = (PassSelectionUIState) obj;
        return Intrinsics.d(this.f8550a, passSelectionUIState.f8550a) && Intrinsics.d(this.b, passSelectionUIState.b) && Intrinsics.d(this.c, passSelectionUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f8550a.hashCode() * 31;
        ToolbarUIState toolbarUIState = this.b;
        int iHashCode2 = (iHashCode + (toolbarUIState == null ? 0 : toolbarUIState.hashCode())) * 31;
        PassSelectionScreenTypeUIState passSelectionScreenTypeUIState = this.c;
        return iHashCode2 + (passSelectionScreenTypeUIState != null ? passSelectionScreenTypeUIState.hashCode() : 0);
    }

    public final String toString() {
        return "PassSelectionUIState(toolbarUISpecs=" + this.f8550a + ", toolbarUIState=" + this.b + ", screen=" + this.c + ")";
    }
}
