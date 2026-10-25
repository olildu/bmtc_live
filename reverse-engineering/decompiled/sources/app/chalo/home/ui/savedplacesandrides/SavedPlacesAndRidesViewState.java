package app.chalo.home.ui.savedplacesandrides;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.py;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SavedPlacesAndRidesViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedPlacesAndRidesViewSpecs f3693a;
    public final ToolbarUIState b;
    public final WorkAndHomeUIState c;
    public final RidesUIState d;
    public final ConfirmationDialogUIState e;
    public final LoadingDialogUIState f;
    public final StandardErrorScreenUIState.ErrorWithMsgAndRetry g;
    public final DividerUIState h;
    public final DividerUIState i;

    public SavedPlacesAndRidesViewState(ToolbarUIState toolbarUIState, WorkAndHomeUIState workAndHomeUIState, RidesUIState ridesUIState, ConfirmationDialogUIState confirmationDialogUIState, LoadingDialogUIState loadingDialogUIState, StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
        SavedPlacesAndRidesViewSpecs savedPlacesAndRidesViewSpecs = new SavedPlacesAndRidesViewSpecs();
        float f = ChaloThemeHelper.a().f;
        ChaloColorToken.DividerColor dividerColor = ChaloColorToken.DividerColor.f9793a;
        DividerUIState dividerUIState = new DividerUIState(f, dividerColor, null, 4);
        DividerUIState dividerUIState2 = new DividerUIState(ChaloThemeHelper.a().b, dividerColor, null, 4);
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(workAndHomeUIState, "workAndHomeUIState");
        Intrinsics.i(ridesUIState, "ridesUIState");
        this.f3693a = savedPlacesAndRidesViewSpecs;
        this.b = toolbarUIState;
        this.c = workAndHomeUIState;
        this.d = ridesUIState;
        this.e = confirmationDialogUIState;
        this.f = loadingDialogUIState;
        this.g = errorWithMsgAndRetry;
        this.h = dividerUIState;
        this.i = dividerUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedPlacesAndRidesViewState)) {
            return false;
        }
        SavedPlacesAndRidesViewState savedPlacesAndRidesViewState = (SavedPlacesAndRidesViewState) obj;
        return Intrinsics.d(this.f3693a, savedPlacesAndRidesViewState.f3693a) && Intrinsics.d(this.b, savedPlacesAndRidesViewState.b) && Intrinsics.d(this.c, savedPlacesAndRidesViewState.c) && Intrinsics.d(this.d, savedPlacesAndRidesViewState.d) && Intrinsics.d(this.e, savedPlacesAndRidesViewState.e) && Intrinsics.d(this.f, savedPlacesAndRidesViewState.f) && Intrinsics.d(this.g, savedPlacesAndRidesViewState.g) && Intrinsics.d(this.h, savedPlacesAndRidesViewState.h) && Intrinsics.d(this.i, savedPlacesAndRidesViewState.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + t8.d(this.b, this.f3693a.f3692a.hashCode() * 31, 31)) * 31)) * 31;
        ConfirmationDialogUIState confirmationDialogUIState = this.e;
        int iHashCode2 = (iHashCode + (confirmationDialogUIState == null ? 0 : confirmationDialogUIState.hashCode())) * 31;
        LoadingDialogUIState loadingDialogUIState = this.f;
        int iHashCode3 = (iHashCode2 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = this.g;
        return this.i.hashCode() + py.c(this.h, (iHashCode3 + (errorWithMsgAndRetry != null ? errorWithMsgAndRetry.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "SavedPlacesAndRidesViewState(specs=" + this.f3693a + ", toolbarUIState=" + this.b + ", workAndHomeUIState=" + this.c + ", ridesUIState=" + this.d + ", confirmationDialogType=" + this.e + ", dialogUIState=" + this.f + ", errorUIState=" + this.g + ", dividerUIState=" + this.h + ", smallDividerUIState=" + this.i + ")";
    }
}
