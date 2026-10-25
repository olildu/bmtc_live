package app.chalo.appsupport.uistate;

import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/uistate/BookingHelpScreenViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingHelpScreenViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingHelpDetailsScreenUiSpec f990a;
    public final ToolbarUIState b;
    public final LoadingDialogUIState c;
    public final List d;
    public final BookingHelpBottomSheetUIStateType e;

    public BookingHelpScreenViewState(ToolbarUIState toolbarUiState, LoadingDialogUIState loadingDialogUIState, List faqList, BookingHelpBottomSheetUIStateType bottomSheetUIState) {
        BookingHelpDetailsScreenUiSpec bookingHelpDetailsScreenUiSpec = new BookingHelpDetailsScreenUiSpec();
        Intrinsics.i(toolbarUiState, "toolbarUiState");
        Intrinsics.i(faqList, "faqList");
        Intrinsics.i(bottomSheetUIState, "bottomSheetUIState");
        this.f990a = bookingHelpDetailsScreenUiSpec;
        this.b = toolbarUiState;
        this.c = loadingDialogUIState;
        this.d = faqList;
        this.e = bottomSheetUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHelpScreenViewState)) {
            return false;
        }
        BookingHelpScreenViewState bookingHelpScreenViewState = (BookingHelpScreenViewState) obj;
        return Intrinsics.d(this.f990a, bookingHelpScreenViewState.f990a) && Intrinsics.d(this.b, bookingHelpScreenViewState.b) && Intrinsics.d(this.c, bookingHelpScreenViewState.c) && Intrinsics.d(this.d, bookingHelpScreenViewState.d) && Intrinsics.d(this.e, bookingHelpScreenViewState.e);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f990a.hashCode() * 31, 31);
        LoadingDialogUIState loadingDialogUIState = this.c;
        return this.e.hashCode() + r30.b((iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "BookingHelpScreenViewState(uiSpec=" + this.f990a + ", toolbarUiState=" + this.b + ", loadingDialogUIState=" + this.c + ", faqList=" + this.d + ", bottomSheetUIState=" + this.e + ")";
    }
}
