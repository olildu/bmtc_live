package app.chalo.mticket.ui.tripinfo;

import app.chalo.data.ProductBookingBranding;
import app.chalo.instantticket.ui.routeselection.uistate.RouteSelectionInputUIState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketTripInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f5785a;
    public final RouteSelectionInputUIState b;
    public final RouteSelectionInputUIState c;
    public final RouteSelectionInputUIState d;
    public final ButtonUIState e;
    public final TextUIState f;
    public final ProductBookingBranding g;
    public final LoadingDialogUIState h;
    public final SnackbarUIState i;
    public final MTicketTripInfoUISpec j;

    public MTicketTripInfoUIState(ToolbarUIState toolbar, RouteSelectionInputUIState routeSection, RouteSelectionInputUIState fromStopSelection, RouteSelectionInputUIState routeSelectionInputUIState, ButtonUIState nextBtn, TextUIState.ChaloTextUIState chaloTextUIState, ProductBookingBranding brandingType, LoadingDialogUIState loadingDialogUIState, SnackbarUIState snackbarUIState) {
        MTicketTripInfoUISpec mTicketTripInfoUISpec = new MTicketTripInfoUISpec();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(routeSection, "routeSection");
        Intrinsics.i(fromStopSelection, "fromStopSelection");
        Intrinsics.i(nextBtn, "nextBtn");
        Intrinsics.i(brandingType, "brandingType");
        this.f5785a = toolbar;
        this.b = routeSection;
        this.c = fromStopSelection;
        this.d = routeSelectionInputUIState;
        this.e = nextBtn;
        this.f = chaloTextUIState;
        this.g = brandingType;
        this.h = loadingDialogUIState;
        this.i = snackbarUIState;
        this.j = mTicketTripInfoUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketTripInfoUIState)) {
            return false;
        }
        MTicketTripInfoUIState mTicketTripInfoUIState = (MTicketTripInfoUIState) obj;
        return Intrinsics.d(this.f5785a, mTicketTripInfoUIState.f5785a) && Intrinsics.d(this.b, mTicketTripInfoUIState.b) && Intrinsics.d(this.c, mTicketTripInfoUIState.c) && Intrinsics.d(this.d, mTicketTripInfoUIState.d) && Intrinsics.d(this.e, mTicketTripInfoUIState.e) && Intrinsics.d(this.f, mTicketTripInfoUIState.f) && Intrinsics.d(this.g, mTicketTripInfoUIState.g) && Intrinsics.d(this.h, mTicketTripInfoUIState.h) && Intrinsics.d(this.i, mTicketTripInfoUIState.i) && Intrinsics.d(this.j, mTicketTripInfoUIState.j);
    }

    public final int hashCode() {
        int iD = r30.d(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5785a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        TextUIState textUIState = this.f;
        int iHashCode = (this.g.hashCode() + ((iD + (textUIState == null ? 0 : textUIState.hashCode())) * 31)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.h;
        int iHashCode2 = (iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        SnackbarUIState snackbarUIState = this.i;
        return this.j.hashCode() + ((iHashCode2 + (snackbarUIState != null ? snackbarUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MTicketTripInfoUIState(toolbar=" + this.f5785a + ", routeSection=" + this.b + ", fromStopSelection=" + this.c + ", toStopSelection=" + this.d + ", nextBtn=" + this.e + ", freeRideInfoBanner=" + this.f + ", brandingType=" + this.g + ", loading=" + this.h + ", snackBarUIState=" + this.i + ", spec=" + this.j + ")";
    }
}
