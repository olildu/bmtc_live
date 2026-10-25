package app.chalo.mticket.ui.passengerselection;

import app.chalo.constants.Source;
import app.chalo.data.ProductBookingBranding;
import app.chalo.mticket.domain.MTicketFareContainer;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoSnackBarType;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerSelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductBookingRouteDetails f5743a;
    public final ProductBookingStopDetails b;
    public final ProductBookingStopDetails c;
    public final boolean d;
    public final ProductBookingBranding e;
    public final ProductConfigResponseAppModel.SingleJourneyTicketAppModel f;
    public final Source g;
    public final boolean h;
    public final boolean i;
    public final MTicketTripInfoSnackBarType j;
    public final MTicketFareResponseAppModel k;
    public final boolean l;
    public final MTicketPassengerSelectionContainer m;
    public final MTicketFareContainer n;
    public final ShowTncDialogData o;
    public final boolean p;

    public MTicketPassengerSelectionDataState(ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, boolean z, ProductBookingBranding brandingType, ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel, Source source, boolean z2, boolean z3, MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType, MTicketFareResponseAppModel mTicketFareResponseAppModel, boolean z4, MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer, MTicketFareContainer mTicketFareContainer, ShowTncDialogData showTncDialogData, boolean z5) {
        Intrinsics.i(brandingType, "brandingType");
        this.f5743a = productBookingRouteDetails;
        this.b = productBookingStopDetails;
        this.c = productBookingStopDetails2;
        this.d = z;
        this.e = brandingType;
        this.f = singleJourneyTicketAppModel;
        this.g = source;
        this.h = z2;
        this.i = z3;
        this.j = mTicketTripInfoSnackBarType;
        this.k = mTicketFareResponseAppModel;
        this.l = z4;
        this.m = mTicketPassengerSelectionContainer;
        this.n = mTicketFareContainer;
        this.o = showTncDialogData;
        this.p = z5;
    }

    public static MTicketPassengerSelectionDataState a(MTicketPassengerSelectionDataState mTicketPassengerSelectionDataState, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, boolean z, ProductBookingBranding productBookingBranding, ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel, Source source, boolean z2, boolean z3, MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType, MTicketFareResponseAppModel mTicketFareResponseAppModel, boolean z4, MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer, MTicketFareContainer mTicketFareContainer, ShowTncDialogData showTncDialogData, boolean z5, int i) {
        ProductBookingRouteDetails productBookingRouteDetails2 = (i & 1) != 0 ? mTicketPassengerSelectionDataState.f5743a : productBookingRouteDetails;
        ProductBookingStopDetails productBookingStopDetails3 = (i & 2) != 0 ? mTicketPassengerSelectionDataState.b : productBookingStopDetails;
        ProductBookingStopDetails productBookingStopDetails4 = (i & 4) != 0 ? mTicketPassengerSelectionDataState.c : productBookingStopDetails2;
        boolean z6 = (i & 8) != 0 ? mTicketPassengerSelectionDataState.d : z;
        ProductBookingBranding brandingType = (i & 16) != 0 ? mTicketPassengerSelectionDataState.e : productBookingBranding;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel2 = (i & 32) != 0 ? mTicketPassengerSelectionDataState.f : singleJourneyTicketAppModel;
        Source source2 = (i & 64) != 0 ? mTicketPassengerSelectionDataState.g : source;
        boolean z7 = (i & 128) != 0 ? mTicketPassengerSelectionDataState.h : z2;
        boolean z8 = (i & 256) != 0 ? mTicketPassengerSelectionDataState.i : z3;
        MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType2 = (i & 512) != 0 ? mTicketPassengerSelectionDataState.j : mTicketTripInfoSnackBarType;
        MTicketFareResponseAppModel mTicketFareResponseAppModel2 = (i & 1024) != 0 ? mTicketPassengerSelectionDataState.k : mTicketFareResponseAppModel;
        boolean z9 = (i & 2048) != 0 ? mTicketPassengerSelectionDataState.l : z4;
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer2 = (i & 4096) != 0 ? mTicketPassengerSelectionDataState.m : mTicketPassengerSelectionContainer;
        MTicketFareContainer mTicketFareContainer2 = (i & 8192) != 0 ? mTicketPassengerSelectionDataState.n : mTicketFareContainer;
        ProductBookingRouteDetails productBookingRouteDetails3 = productBookingRouteDetails2;
        ShowTncDialogData showTncDialogData2 = (i & 16384) != 0 ? mTicketPassengerSelectionDataState.o : showTncDialogData;
        boolean z10 = (i & 32768) != 0 ? mTicketPassengerSelectionDataState.p : z5;
        mTicketPassengerSelectionDataState.getClass();
        Intrinsics.i(brandingType, "brandingType");
        return new MTicketPassengerSelectionDataState(productBookingRouteDetails3, productBookingStopDetails3, productBookingStopDetails4, z6, brandingType, singleJourneyTicketAppModel2, source2, z7, z8, mTicketTripInfoSnackBarType2, mTicketFareResponseAppModel2, z9, mTicketPassengerSelectionContainer2, mTicketFareContainer2, showTncDialogData2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerSelectionDataState)) {
            return false;
        }
        MTicketPassengerSelectionDataState mTicketPassengerSelectionDataState = (MTicketPassengerSelectionDataState) obj;
        return Intrinsics.d(this.f5743a, mTicketPassengerSelectionDataState.f5743a) && Intrinsics.d(this.b, mTicketPassengerSelectionDataState.b) && Intrinsics.d(this.c, mTicketPassengerSelectionDataState.c) && this.d == mTicketPassengerSelectionDataState.d && Intrinsics.d(this.e, mTicketPassengerSelectionDataState.e) && Intrinsics.d(this.f, mTicketPassengerSelectionDataState.f) && this.g == mTicketPassengerSelectionDataState.g && this.h == mTicketPassengerSelectionDataState.h && this.i == mTicketPassengerSelectionDataState.i && Intrinsics.d(this.j, mTicketPassengerSelectionDataState.j) && Intrinsics.d(this.k, mTicketPassengerSelectionDataState.k) && this.l == mTicketPassengerSelectionDataState.l && Intrinsics.d(this.m, mTicketPassengerSelectionDataState.m) && Intrinsics.d(this.n, mTicketPassengerSelectionDataState.n) && Intrinsics.d(this.o, mTicketPassengerSelectionDataState.o) && this.p == mTicketPassengerSelectionDataState.p;
    }

    public final int hashCode() {
        ProductBookingRouteDetails productBookingRouteDetails = this.f5743a;
        int iHashCode = (productBookingRouteDetails == null ? 0 : productBookingRouteDetails.hashCode()) * 31;
        ProductBookingStopDetails productBookingStopDetails = this.b;
        int iHashCode2 = (iHashCode + (productBookingStopDetails == null ? 0 : productBookingStopDetails.hashCode())) * 31;
        ProductBookingStopDetails productBookingStopDetails2 = this.c;
        int iHashCode3 = (this.e.hashCode() + ((((iHashCode2 + (productBookingStopDetails2 == null ? 0 : productBookingStopDetails2.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31)) * 31;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = this.f;
        int iHashCode4 = (iHashCode3 + (singleJourneyTicketAppModel == null ? 0 : singleJourneyTicketAppModel.hashCode())) * 31;
        Source source = this.g;
        int iHashCode5 = (((((iHashCode4 + (source == null ? 0 : source.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31;
        MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType = this.j;
        int iHashCode6 = (iHashCode5 + (mTicketTripInfoSnackBarType == null ? 0 : mTicketTripInfoSnackBarType.hashCode())) * 31;
        MTicketFareResponseAppModel mTicketFareResponseAppModel = this.k;
        int iHashCode7 = (((iHashCode6 + (mTicketFareResponseAppModel == null ? 0 : mTicketFareResponseAppModel.hashCode())) * 31) + (this.l ? 1231 : 1237)) * 31;
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer = this.m;
        int iHashCode8 = (iHashCode7 + (mTicketPassengerSelectionContainer == null ? 0 : mTicketPassengerSelectionContainer.f5741a.hashCode())) * 31;
        MTicketFareContainer mTicketFareContainer = this.n;
        int iHashCode9 = (iHashCode8 + (mTicketFareContainer == null ? 0 : mTicketFareContainer.f5726a.hashCode())) * 31;
        ShowTncDialogData showTncDialogData = this.o;
        return ((iHashCode9 + (showTncDialogData != null ? showTncDialogData.f5763a.hashCode() : 0)) * 31) + (this.p ? 1231 : 1237);
    }

    public final String toString() {
        return "MTicketPassengerSelectionDataState(routeDetails=" + this.f5743a + ", fromStopDetails=" + this.b + ", toStopDetails=" + this.c + ", showPayBtn=" + this.d + ", brandingType=" + this.e + ", productConfig=" + this.f + ", source=" + this.g + ", isLoading=" + this.h + ", showError=" + this.i + ", snackBarType=" + this.j + ", fareDetails=" + this.k + ", showFaresChangedDialog=" + this.l + ", passengerSelectionContainer=" + this.m + ", fareContainer=" + this.n + ", showTncDialog=" + this.o + ", expandTripDetailsSection=" + this.p + ")";
    }
}
