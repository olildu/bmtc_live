package app.chalo.mticket.ui.tripinfo;

import app.chalo.constants.Source;
import app.chalo.data.ProductBookingBranding;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketTripInfoDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f5765a;
    public final ProductBookingRouteDetails b;
    public final ProductBookingStopDetails c;
    public final ProductBookingStopDetails d;
    public final MTicketTripInfoSnackBarType e;
    public final boolean f;
    public final ProductBookingBranding g;
    public final Boolean h;
    public final MTicketTripInfoMissingFieldError i;

    static {
        ProductBookingBranding.Companion companion = ProductBookingBranding.INSTANCE;
        ProductBookingRouteDetails.Companion companion2 = ProductBookingRouteDetails.INSTANCE;
    }

    public MTicketTripInfoDataState(Source source, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType, boolean z, ProductBookingBranding brandingType, Boolean bool, MTicketTripInfoMissingFieldError mTicketTripInfoMissingFieldError) {
        Intrinsics.i(brandingType, "brandingType");
        this.f5765a = source;
        this.b = productBookingRouteDetails;
        this.c = productBookingStopDetails;
        this.d = productBookingStopDetails2;
        this.e = mTicketTripInfoSnackBarType;
        this.f = z;
        this.g = brandingType;
        this.h = bool;
        this.i = mTicketTripInfoMissingFieldError;
    }

    public static MTicketTripInfoDataState a(MTicketTripInfoDataState mTicketTripInfoDataState, Source source, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType, boolean z, ProductBookingBranding productBookingBranding, Boolean bool, MTicketTripInfoMissingFieldError mTicketTripInfoMissingFieldError, int i) {
        if ((i & 1) != 0) {
            source = mTicketTripInfoDataState.f5765a;
        }
        Source source2 = source;
        if ((i & 2) != 0) {
            productBookingRouteDetails = mTicketTripInfoDataState.b;
        }
        ProductBookingRouteDetails productBookingRouteDetails2 = productBookingRouteDetails;
        if ((i & 4) != 0) {
            productBookingStopDetails = mTicketTripInfoDataState.c;
        }
        ProductBookingStopDetails productBookingStopDetails3 = productBookingStopDetails;
        if ((i & 8) != 0) {
            productBookingStopDetails2 = mTicketTripInfoDataState.d;
        }
        ProductBookingStopDetails productBookingStopDetails4 = productBookingStopDetails2;
        if ((i & 16) != 0) {
            mTicketTripInfoSnackBarType = mTicketTripInfoDataState.e;
        }
        MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType2 = mTicketTripInfoSnackBarType;
        boolean z2 = (i & 32) != 0 ? mTicketTripInfoDataState.f : z;
        mTicketTripInfoDataState.getClass();
        ProductBookingBranding brandingType = (i & 128) != 0 ? mTicketTripInfoDataState.g : productBookingBranding;
        Boolean bool2 = (i & 256) != 0 ? mTicketTripInfoDataState.h : bool;
        MTicketTripInfoMissingFieldError mTicketTripInfoMissingFieldError2 = (i & 512) != 0 ? mTicketTripInfoDataState.i : mTicketTripInfoMissingFieldError;
        mTicketTripInfoDataState.getClass();
        Intrinsics.i(brandingType, "brandingType");
        return new MTicketTripInfoDataState(source2, productBookingRouteDetails2, productBookingStopDetails3, productBookingStopDetails4, mTicketTripInfoSnackBarType2, z2, brandingType, bool2, mTicketTripInfoMissingFieldError2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketTripInfoDataState)) {
            return false;
        }
        MTicketTripInfoDataState mTicketTripInfoDataState = (MTicketTripInfoDataState) obj;
        return this.f5765a == mTicketTripInfoDataState.f5765a && Intrinsics.d(this.b, mTicketTripInfoDataState.b) && Intrinsics.d(this.c, mTicketTripInfoDataState.c) && Intrinsics.d(this.d, mTicketTripInfoDataState.d) && Intrinsics.d(this.e, mTicketTripInfoDataState.e) && this.f == mTicketTripInfoDataState.f && Intrinsics.d(this.g, mTicketTripInfoDataState.g) && Intrinsics.d(this.h, mTicketTripInfoDataState.h) && this.i == mTicketTripInfoDataState.i;
    }

    public final int hashCode() {
        Source source = this.f5765a;
        int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
        ProductBookingRouteDetails productBookingRouteDetails = this.b;
        int iHashCode2 = (iHashCode + (productBookingRouteDetails == null ? 0 : productBookingRouteDetails.hashCode())) * 31;
        ProductBookingStopDetails productBookingStopDetails = this.c;
        int iHashCode3 = (iHashCode2 + (productBookingStopDetails == null ? 0 : productBookingStopDetails.hashCode())) * 31;
        ProductBookingStopDetails productBookingStopDetails2 = this.d;
        int iHashCode4 = (iHashCode3 + (productBookingStopDetails2 == null ? 0 : productBookingStopDetails2.hashCode())) * 31;
        MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType = this.e;
        int iHashCode5 = (this.g.hashCode() + ((((iHashCode4 + (mTicketTripInfoSnackBarType == null ? 0 : mTicketTripInfoSnackBarType.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 961)) * 31;
        Boolean bool = this.h;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        MTicketTripInfoMissingFieldError mTicketTripInfoMissingFieldError = this.i;
        return iHashCode6 + (mTicketTripInfoMissingFieldError != null ? mTicketTripInfoMissingFieldError.hashCode() : 0);
    }

    public final String toString() {
        return "MTicketTripInfoDataState(source=" + this.f5765a + ", selectedRoute=" + this.b + ", fromStop=" + this.c + ", toStop=" + this.d + ", snackBarType=" + this.e + ", isLoading=" + this.f + ", freeRideInfoBanner=null, brandingType=" + this.g + ", isFreeRideAvailableForUser=" + this.h + ", missingFieldError=" + this.i + ")";
    }
}
