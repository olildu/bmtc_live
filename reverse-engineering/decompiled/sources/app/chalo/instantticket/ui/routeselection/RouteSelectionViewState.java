package app.chalo.instantticket.ui.routeselection;

import app.chalo.data.ProductBookingBranding;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteSelectionViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteSelectionViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductBookingRouteDetails f3969a;
    public final ProductBookingStopDetails b;
    public final ProductBookingStopDetails c;
    public final ProductBookingBranding d;
    public final boolean e;
    public final RouteSelectionStopType f;
    public final RouteSelectionStopType g;
    public final List h;
    public final String i;
    public final boolean j;

    public RouteSelectionViewState(ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, ProductBookingBranding brandingType, boolean z, RouteSelectionStopType stopTypeNotSelectedError, RouteSelectionStopType currentStopType, List routeSpecialFeature, String str, boolean z2) {
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(stopTypeNotSelectedError, "stopTypeNotSelectedError");
        Intrinsics.i(currentStopType, "currentStopType");
        Intrinsics.i(routeSpecialFeature, "routeSpecialFeature");
        this.f3969a = productBookingRouteDetails;
        this.b = productBookingStopDetails;
        this.c = productBookingStopDetails2;
        this.d = brandingType;
        this.e = z;
        this.f = stopTypeNotSelectedError;
        this.g = currentStopType;
        this.h = routeSpecialFeature;
        this.i = str;
        this.j = z2;
    }

    public static RouteSelectionViewState a(RouteSelectionViewState routeSelectionViewState, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, ProductBookingBranding productBookingBranding, boolean z, RouteSelectionStopType routeSelectionStopType, RouteSelectionStopType routeSelectionStopType2, String str, boolean z2, int i) {
        if ((i & 1) != 0) {
            productBookingRouteDetails = routeSelectionViewState.f3969a;
        }
        ProductBookingRouteDetails routeDetails = productBookingRouteDetails;
        if ((i & 2) != 0) {
            productBookingStopDetails = routeSelectionViewState.b;
        }
        ProductBookingStopDetails fromStopDetails = productBookingStopDetails;
        if ((i & 4) != 0) {
            productBookingStopDetails2 = routeSelectionViewState.c;
        }
        ProductBookingStopDetails toStopDetails = productBookingStopDetails2;
        if ((i & 8) != 0) {
            productBookingBranding = routeSelectionViewState.d;
        }
        ProductBookingBranding brandingType = productBookingBranding;
        boolean z3 = (i & 16) != 0 ? routeSelectionViewState.e : z;
        RouteSelectionStopType stopTypeNotSelectedError = (i & 32) != 0 ? routeSelectionViewState.f : routeSelectionStopType;
        RouteSelectionStopType currentStopType = (i & 64) != 0 ? routeSelectionViewState.g : routeSelectionStopType2;
        List routeSpecialFeature = routeSelectionViewState.h;
        String str2 = (i & 256) != 0 ? routeSelectionViewState.i : str;
        boolean z4 = (i & 512) != 0 ? routeSelectionViewState.j : z2;
        routeSelectionViewState.getClass();
        Intrinsics.i(routeDetails, "routeDetails");
        Intrinsics.i(fromStopDetails, "fromStopDetails");
        Intrinsics.i(toStopDetails, "toStopDetails");
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(stopTypeNotSelectedError, "stopTypeNotSelectedError");
        Intrinsics.i(currentStopType, "currentStopType");
        Intrinsics.i(routeSpecialFeature, "routeSpecialFeature");
        return new RouteSelectionViewState(routeDetails, fromStopDetails, toStopDetails, brandingType, z3, stopTypeNotSelectedError, currentStopType, routeSpecialFeature, str2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSelectionViewState)) {
            return false;
        }
        RouteSelectionViewState routeSelectionViewState = (RouteSelectionViewState) obj;
        return Intrinsics.d(this.f3969a, routeSelectionViewState.f3969a) && Intrinsics.d(this.b, routeSelectionViewState.b) && Intrinsics.d(this.c, routeSelectionViewState.c) && Intrinsics.d(this.d, routeSelectionViewState.d) && this.e == routeSelectionViewState.e && this.f == routeSelectionViewState.f && this.g == routeSelectionViewState.g && Intrinsics.d(this.h, routeSelectionViewState.h) && Intrinsics.d(this.i, routeSelectionViewState.i) && this.j == routeSelectionViewState.j;
    }

    public final int hashCode() {
        int iB = r30.b((this.g.hashCode() + ((this.f.hashCode() + ((((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f3969a.hashCode() * 31)) * 31)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31)) * 31)) * 31, 31, this.h);
        String str = this.i;
        return ((iB + (str == null ? 0 : str.hashCode())) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        return "RouteSelectionViewState(routeDetails=" + this.f3969a + ", fromStopDetails=" + this.b + ", toStopDetails=" + this.c + ", brandingType=" + this.d + ", showRouteNotSelectedError=" + this.e + ", stopTypeNotSelectedError=" + this.f + ", currentStopType=" + this.g + ", routeSpecialFeature=" + this.h + ", configFetchedFailedSnackbarText=" + this.i + ", showLoader=" + this.j + ")";
    }
}
