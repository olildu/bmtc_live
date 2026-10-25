package app.chalo.productbooking.pickroutelocation;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PickRouteLocationDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8279a;
    public final boolean b;
    public final List c;
    public final List d;
    public final SearchScreenLayoutType e;
    public final String f;
    public final PickRouteSnackBarErrorType g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final RouteAppModel k;

    public PickRouteLocationDataState(boolean z, boolean z2, List routesList, List list, SearchScreenLayoutType layoutType, String str, PickRouteSnackBarErrorType pickRouteSnackBarErrorType, String str2, boolean z3, boolean z4, RouteAppModel routeAppModel) {
        Intrinsics.i(routesList, "routesList");
        Intrinsics.i(layoutType, "layoutType");
        this.f8279a = z;
        this.b = z2;
        this.c = routesList;
        this.d = list;
        this.e = layoutType;
        this.f = str;
        this.g = pickRouteSnackBarErrorType;
        this.h = str2;
        this.i = z3;
        this.j = z4;
        this.k = routeAppModel;
    }

    public static PickRouteLocationDataState a(PickRouteLocationDataState pickRouteLocationDataState, boolean z, boolean z2, List list, List list2, SearchScreenLayoutType searchScreenLayoutType, String str, PickRouteSnackBarErrorType pickRouteSnackBarErrorType, String str2, boolean z3, boolean z4, RouteAppModel routeAppModel, int i) {
        if ((i & 1) != 0) {
            z = pickRouteLocationDataState.f8279a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = pickRouteLocationDataState.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            list = pickRouteLocationDataState.c;
        }
        List routesList = list;
        List list3 = (i & 8) != 0 ? pickRouteLocationDataState.d : list2;
        SearchScreenLayoutType layoutType = (i & 16) != 0 ? pickRouteLocationDataState.e : searchScreenLayoutType;
        String currentQuery = (i & 32) != 0 ? pickRouteLocationDataState.f : str;
        PickRouteSnackBarErrorType pickRouteSnackBarErrorType2 = (i & 64) != 0 ? pickRouteLocationDataState.g : pickRouteSnackBarErrorType;
        String str3 = (i & 128) != 0 ? pickRouteLocationDataState.h : str2;
        boolean z7 = (i & 256) != 0 ? pickRouteLocationDataState.i : z3;
        boolean z8 = (i & 512) != 0 ? pickRouteLocationDataState.j : z4;
        RouteAppModel routeAppModel2 = (i & 1024) != 0 ? pickRouteLocationDataState.k : routeAppModel;
        pickRouteLocationDataState.getClass();
        Intrinsics.i(routesList, "routesList");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(currentQuery, "currentQuery");
        return new PickRouteLocationDataState(z5, z6, routesList, list3, layoutType, currentQuery, pickRouteSnackBarErrorType2, str3, z7, z8, routeAppModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickRouteLocationDataState)) {
            return false;
        }
        PickRouteLocationDataState pickRouteLocationDataState = (PickRouteLocationDataState) obj;
        return this.f8279a == pickRouteLocationDataState.f8279a && this.b == pickRouteLocationDataState.b && Intrinsics.d(this.c, pickRouteLocationDataState.c) && Intrinsics.d(this.d, pickRouteLocationDataState.d) && this.e == pickRouteLocationDataState.e && Intrinsics.d(this.f, pickRouteLocationDataState.f) && this.g == pickRouteLocationDataState.g && Intrinsics.d(this.h, pickRouteLocationDataState.h) && this.i == pickRouteLocationDataState.i && this.j == pickRouteLocationDataState.j && Intrinsics.d(this.k, pickRouteLocationDataState.k);
    }

    public final int hashCode() {
        int iB = r30.b((((this.f8279a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c);
        List list = this.d;
        int iE = nf1.e((this.e.hashCode() + ((iB + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.f);
        PickRouteSnackBarErrorType pickRouteSnackBarErrorType = this.g;
        int iHashCode = (iE + (pickRouteSnackBarErrorType == null ? 0 : pickRouteSnackBarErrorType.hashCode())) * 31;
        String str = this.h;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31;
        RouteAppModel routeAppModel = this.k;
        return iHashCode2 + (routeAppModel != null ? routeAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("PickRouteLocationDataState(showScreenLoader=", ", showSearchLoader=", ", routesList=", this.f8279a, this.b);
        dd.o(sbR, this.c, ", recentRoutesList=", this.d, ", layoutType=");
        sbR.append(this.e);
        sbR.append(", currentQuery=");
        sbR.append(this.f);
        sbR.append(", snackBarErrorType=");
        sbR.append(this.g);
        sbR.append(", selectedRouteId=");
        sbR.append(this.h);
        sbR.append(", isForMobileTicketing=");
        z40.r(sbR, this.i, ", shouldShowMobileTicketingUnavailableDialog=", this.j, ", selectedRoute=");
        sbR.append(this.k);
        sbR.append(")");
        return sbR.toString();
    }
}
