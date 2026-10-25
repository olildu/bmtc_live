package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.productbooking.common.uistate.TermsAndConditionsUiState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.py;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketSummaryViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSummaryViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketSummaryUiSpec f5922a;
    public final ToolbarUIState b;
    public final DividerUIState c;
    public final GroupTicketJourneyOverviewUiState d;
    public final GroupTicketsSectionUiState e;
    public final DividerUIState f;
    public final boolean g;
    public final GroupTicketPriceDetailsUiState h;
    public final TermsAndConditionsUiState i;
    public final TnCDialogUIState j;
    public final SnackbarUIState k;
    public final LoadingDialogUIState l;
    public final ButtonUIState m;
    public final DividerUIState n;

    public GroupTicketSummaryViewState(ToolbarUIState toolbarUiState, GroupTicketJourneyOverviewUiState groupTicketJourneyOverviewUiState, GroupTicketsSectionUiState groupTicketsSectionUiState, boolean z, GroupTicketPriceDetailsUiState groupTicketPriceDetailsUiState, TermsAndConditionsUiState termsAndConditionsUiState, TnCDialogUIState tnCDialogUIState, SnackbarUIState snackbarUIState, LoadingDialogUIState loadingDialogUIState, ButtonUIState buttonUIState) {
        GroupTicketSummaryUiSpec groupTicketSummaryUiSpec = new GroupTicketSummaryUiSpec();
        DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
        DividerUIState dividerUIState2 = new DividerUIState(0.0f, null, null, 7);
        DividerUIState dividerUIState3 = new DividerUIState(ChaloThemeHelper.a().h, ChaloColorToken.SectionDividerColor.f9849a, null, 4);
        Intrinsics.i(toolbarUiState, "toolbarUiState");
        this.f5922a = groupTicketSummaryUiSpec;
        this.b = toolbarUiState;
        this.c = dividerUIState;
        this.d = groupTicketJourneyOverviewUiState;
        this.e = groupTicketsSectionUiState;
        this.f = dividerUIState2;
        this.g = z;
        this.h = groupTicketPriceDetailsUiState;
        this.i = termsAndConditionsUiState;
        this.j = tnCDialogUIState;
        this.k = snackbarUIState;
        this.l = loadingDialogUIState;
        this.m = buttonUIState;
        this.n = dividerUIState3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryViewState)) {
            return false;
        }
        GroupTicketSummaryViewState groupTicketSummaryViewState = (GroupTicketSummaryViewState) obj;
        return Intrinsics.d(this.f5922a, groupTicketSummaryViewState.f5922a) && Intrinsics.d(this.b, groupTicketSummaryViewState.b) && Intrinsics.d(this.c, groupTicketSummaryViewState.c) && Intrinsics.d(this.d, groupTicketSummaryViewState.d) && Intrinsics.d(this.e, groupTicketSummaryViewState.e) && Intrinsics.d(this.f, groupTicketSummaryViewState.f) && this.g == groupTicketSummaryViewState.g && Intrinsics.d(this.h, groupTicketSummaryViewState.h) && Intrinsics.d(this.i, groupTicketSummaryViewState.i) && Intrinsics.d(this.j, groupTicketSummaryViewState.j) && Intrinsics.d(this.k, groupTicketSummaryViewState.k) && Intrinsics.d(this.l, groupTicketSummaryViewState.l) && Intrinsics.d(this.m, groupTicketSummaryViewState.m) && Intrinsics.d(this.n, groupTicketSummaryViewState.n);
    }

    public final int hashCode() {
        int iC = py.c(this.c, t8.d(this.b, this.f5922a.hashCode() * 31, 31), 31);
        GroupTicketJourneyOverviewUiState groupTicketJourneyOverviewUiState = this.d;
        int iHashCode = (iC + (groupTicketJourneyOverviewUiState == null ? 0 : groupTicketJourneyOverviewUiState.hashCode())) * 31;
        GroupTicketsSectionUiState groupTicketsSectionUiState = this.e;
        int iC2 = (py.c(this.f, (iHashCode + (groupTicketsSectionUiState == null ? 0 : groupTicketsSectionUiState.hashCode())) * 31, 31) + (this.g ? 1231 : 1237)) * 31;
        GroupTicketPriceDetailsUiState groupTicketPriceDetailsUiState = this.h;
        int iHashCode2 = (iC2 + (groupTicketPriceDetailsUiState == null ? 0 : groupTicketPriceDetailsUiState.hashCode())) * 31;
        TermsAndConditionsUiState termsAndConditionsUiState = this.i;
        int iHashCode3 = (iHashCode2 + (termsAndConditionsUiState == null ? 0 : termsAndConditionsUiState.hashCode())) * 31;
        TnCDialogUIState tnCDialogUIState = this.j;
        int iHashCode4 = (iHashCode3 + (tnCDialogUIState == null ? 0 : tnCDialogUIState.hashCode())) * 31;
        SnackbarUIState snackbarUIState = this.k;
        int iHashCode5 = (iHashCode4 + (snackbarUIState == null ? 0 : snackbarUIState.hashCode())) * 31;
        LoadingDialogUIState loadingDialogUIState = this.l;
        int iHashCode6 = (iHashCode5 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.m;
        int iHashCode7 = (iHashCode6 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        DividerUIState dividerUIState = this.n;
        return iHashCode7 + (dividerUIState != null ? dividerUIState.hashCode() : 0);
    }

    public final String toString() {
        return "GroupTicketSummaryViewState(uiSpec=" + this.f5922a + ", toolbarUiState=" + this.b + ", toolbarDividerUiState=" + this.c + ", journeyOverviewUiState=" + this.d + ", ticketsSectionUiState=" + this.e + ", ticketsSectionDividerUiState=" + this.f + ", showPriceDetailsShimmer=" + this.g + ", priceDetailsUiState=" + this.h + ", termsAndConditionsUiState=" + this.i + ", termsAndConditionsDialogueState=" + this.j + ", priceDetailsFailedSnackbarUIState=" + this.k + ", loadingDialogUIState=" + this.l + ", payButtonUiState=" + this.m + ", sectionDividerUiState=" + this.n + ")";
    }
}
