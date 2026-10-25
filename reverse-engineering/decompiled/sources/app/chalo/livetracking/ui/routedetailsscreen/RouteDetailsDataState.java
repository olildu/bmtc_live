package app.chalo.livetracking.ui.routedetailsscreen;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import app.chalo.livetracking.routedetails.ReportProblemMetaData;
import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails;
import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDialogInfo;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapStopUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteTimeTableUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetails;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import defpackage.z40;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsDataState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsDataState {
    public final boolean A;
    public final List B;
    public final List C;
    public final boolean D;
    public final boolean E;
    public final Map F;
    public final String G;
    public final boolean H;
    public final List I;
    public final boolean J;
    public final String K;
    public final boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4834a;
    public final RouteBookingType b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final RouteNamingSchemeType g;
    public final RouteDetailsViewType h;
    public final List i;
    public final List j;
    public final String k;
    public final RouteDetailsMapStopUiModel l;
    public final RouteDetailsMapUiModel m;
    public final RouteTimeTableUiModel n;
    public final boolean o;
    public final boolean p;
    public final LivePassengerIndicatorBottomSheetDetails q;
    public final RouteAvailabilityBannerDetails r;
    public final RouteAvailabilityBannerDialogInfo s;
    public final ReportProblemMetaData t;
    public final boolean u;
    public final boolean v;
    public final List w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public RouteDetailsDataState(boolean z, RouteBookingType routeBookingType, String str, String str2, String str3, String str4, RouteNamingSchemeType routeNamingSchemeType, RouteDetailsViewType routeDetailsViewType, List optionsMenuList, List routeStopUiModelList, String str5, RouteDetailsMapStopUiModel routeDetailsMapStopUiModel, RouteDetailsMapUiModel routeDetailsMapUiModel, RouteTimeTableUiModel routeTimeTableUiModel, boolean z2, boolean z3, LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails, RouteAvailabilityBannerDetails routeAvailabilityBannerDetails, RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo, ReportProblemMetaData reportProblemMetaData, boolean z4, boolean z5, List routeSpfTagList, String str6, boolean z6, boolean z7, boolean z8, List stopMarkerList, List liveVehiclesMarkerList, boolean z9, boolean z10, Map map, String str7, boolean z11, List reportProblemSelectedTags, boolean z12, String str8, boolean z13) {
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        Intrinsics.i(optionsMenuList, "optionsMenuList");
        Intrinsics.i(routeStopUiModelList, "routeStopUiModelList");
        Intrinsics.i(routeSpfTagList, "routeSpfTagList");
        Intrinsics.i(stopMarkerList, "stopMarkerList");
        Intrinsics.i(liveVehiclesMarkerList, "liveVehiclesMarkerList");
        Intrinsics.i(reportProblemSelectedTags, "reportProblemSelectedTags");
        this.f4834a = z;
        this.b = routeBookingType;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = routeNamingSchemeType;
        this.h = routeDetailsViewType;
        this.i = optionsMenuList;
        this.j = routeStopUiModelList;
        this.k = str5;
        this.l = routeDetailsMapStopUiModel;
        this.m = routeDetailsMapUiModel;
        this.n = routeTimeTableUiModel;
        this.o = z2;
        this.p = z3;
        this.q = livePassengerIndicatorBottomSheetDetails;
        this.r = routeAvailabilityBannerDetails;
        this.s = routeAvailabilityBannerDialogInfo;
        this.t = reportProblemMetaData;
        this.u = z4;
        this.v = z5;
        this.w = routeSpfTagList;
        this.x = str6;
        this.y = z6;
        this.z = z7;
        this.A = z8;
        this.B = stopMarkerList;
        this.C = liveVehiclesMarkerList;
        this.D = z9;
        this.E = z10;
        this.F = map;
        this.G = str7;
        this.H = z11;
        this.I = reportProblemSelectedTags;
        this.J = z12;
        this.K = str8;
        this.L = z13;
    }

    public static RouteDetailsDataState a(RouteDetailsDataState routeDetailsDataState, boolean z, RouteBookingType routeBookingType, String str, String str2, String str3, String str4, RouteNamingSchemeType routeNamingSchemeType, RouteDetailsViewType routeDetailsViewType, List list, ArrayList arrayList, String str5, RouteDetailsMapUiModel routeDetailsMapUiModel, RouteTimeTableUiModel routeTimeTableUiModel, boolean z2, boolean z3, LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails, RouteAvailabilityBannerDetails routeAvailabilityBannerDetails, RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo, ReportProblemMetaData reportProblemMetaData, boolean z4, ArrayList arrayList2, String str6, boolean z5, boolean z6, boolean z7, ArrayList arrayList3, List list2, boolean z8, boolean z9, Map map, String str7, boolean z10, List list3, boolean z11, String str8, boolean z12, int i, int i2) {
        boolean z13 = (i & 1) != 0 ? routeDetailsDataState.f4834a : z;
        RouteBookingType routeBookingType2 = (i & 2) != 0 ? routeDetailsDataState.b : routeBookingType;
        String routeName = (i & 4) != 0 ? routeDetailsDataState.c : str;
        String routeLastStopName = (i & 8) != 0 ? routeDetailsDataState.d : str2;
        String routeFirstStopName = (i & 16) != 0 ? routeDetailsDataState.e : str3;
        String str9 = (i & 32) != 0 ? routeDetailsDataState.f : str4;
        RouteNamingSchemeType routeNamingSchemeType2 = (i & 64) != 0 ? routeDetailsDataState.g : routeNamingSchemeType;
        RouteDetailsViewType routeDetailsViewType2 = (i & 128) != 0 ? routeDetailsDataState.h : routeDetailsViewType;
        List optionsMenuList = (i & 256) != 0 ? routeDetailsDataState.i : list;
        List routeStopUiModelList = (i & 512) != 0 ? routeDetailsDataState.j : arrayList;
        String userDestinationName = (i & 1024) != 0 ? routeDetailsDataState.k : str5;
        RouteDetailsMapStopUiModel routeDetailsMapStopUiModel = routeDetailsDataState.l;
        RouteDetailsMapUiModel routeDetailsMapUiModel2 = (i & 4096) != 0 ? routeDetailsDataState.m : routeDetailsMapUiModel;
        RouteTimeTableUiModel routeTimeTableUiModel2 = (i & 8192) != 0 ? routeDetailsDataState.n : routeTimeTableUiModel;
        boolean z14 = z13;
        boolean z15 = (i & 16384) != 0 ? routeDetailsDataState.o : z2;
        routeDetailsDataState.getClass();
        boolean z16 = (i & 65536) != 0 ? routeDetailsDataState.p : z3;
        LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails2 = (i & 131072) != 0 ? routeDetailsDataState.q : livePassengerIndicatorBottomSheetDetails;
        RouteAvailabilityBannerDetails routeAvailabilityBannerDetails2 = (i & 262144) != 0 ? routeDetailsDataState.r : routeAvailabilityBannerDetails;
        RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo2 = (i & 524288) != 0 ? routeDetailsDataState.s : routeAvailabilityBannerDialogInfo;
        ReportProblemMetaData reportProblemMetaData2 = (i & 1048576) != 0 ? routeDetailsDataState.t : reportProblemMetaData;
        boolean z17 = (i & 2097152) != 0 ? routeDetailsDataState.u : false;
        boolean z18 = (i & 4194304) != 0 ? routeDetailsDataState.v : z4;
        List routeSpfTagList = (i & 8388608) != 0 ? routeDetailsDataState.w : arrayList2;
        boolean z19 = z15;
        String str10 = (i & 16777216) != 0 ? routeDetailsDataState.x : str6;
        boolean z20 = (i & 33554432) != 0 ? routeDetailsDataState.y : z5;
        boolean z21 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? routeDetailsDataState.z : z6;
        boolean z22 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? routeDetailsDataState.A : z7;
        List stopMarkerList = (i & 268435456) != 0 ? routeDetailsDataState.B : arrayList3;
        List liveVehiclesMarkerList = (i & 536870912) != 0 ? routeDetailsDataState.C : list2;
        boolean z23 = (i & 1073741824) != 0 ? routeDetailsDataState.D : z8;
        boolean z24 = (i & Integer.MIN_VALUE) != 0 ? routeDetailsDataState.E : z9;
        Map adTargeting = (i2 & 1) != 0 ? routeDetailsDataState.F : map;
        String stopSearchQuery = (i2 & 2) != 0 ? routeDetailsDataState.G : str7;
        boolean z25 = (i2 & 4) != 0 ? routeDetailsDataState.H : z10;
        List reportProblemSelectedTags = (i2 & 8) != 0 ? routeDetailsDataState.I : list3;
        boolean z26 = (i2 & 16) != 0 ? routeDetailsDataState.J : z11;
        String reportProblemFeedbackText = (i2 & 32) != 0 ? routeDetailsDataState.K : str8;
        boolean z27 = (i2 & 64) != 0 ? routeDetailsDataState.L : z12;
        routeDetailsDataState.getClass();
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeLastStopName, "routeLastStopName");
        Intrinsics.i(routeFirstStopName, "routeFirstStopName");
        Intrinsics.i(routeNamingSchemeType2, "routeNamingSchemeType");
        Intrinsics.i(optionsMenuList, "optionsMenuList");
        Intrinsics.i(routeStopUiModelList, "routeStopUiModelList");
        Intrinsics.i(userDestinationName, "userDestinationName");
        Intrinsics.i(routeSpfTagList, "routeSpfTagList");
        Intrinsics.i(stopMarkerList, "stopMarkerList");
        Intrinsics.i(liveVehiclesMarkerList, "liveVehiclesMarkerList");
        Intrinsics.i(adTargeting, "adTargeting");
        Intrinsics.i(stopSearchQuery, "stopSearchQuery");
        Intrinsics.i(reportProblemSelectedTags, "reportProblemSelectedTags");
        Intrinsics.i(reportProblemFeedbackText, "reportProblemFeedbackText");
        return new RouteDetailsDataState(z14, routeBookingType2, routeName, routeLastStopName, routeFirstStopName, str9, routeNamingSchemeType2, routeDetailsViewType2, optionsMenuList, routeStopUiModelList, userDestinationName, routeDetailsMapStopUiModel, routeDetailsMapUiModel2, routeTimeTableUiModel2, z19, z16, livePassengerIndicatorBottomSheetDetails2, routeAvailabilityBannerDetails2, routeAvailabilityBannerDialogInfo2, reportProblemMetaData2, z17, z18, routeSpfTagList, str10, z20, z21, z22, stopMarkerList, liveVehiclesMarkerList, z23, z24, adTargeting, stopSearchQuery, z25, reportProblemSelectedTags, z26, reportProblemFeedbackText, z27);
    }

    public final ArrayList b(int i, StopEtaStatus stopEtaStatus, StopEtaUiModel stopEtaUiModel) {
        StopEtaStatus newEtaStatus = stopEtaStatus;
        Intrinsics.i(newEtaStatus, "newEtaStatus");
        StopEtaUiModel newEtaUiModel = stopEtaUiModel;
        Intrinsics.i(newEtaUiModel, "newEtaUiModel");
        List list = this.j;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            RouteDetailsStopUiModel routeDetailsStopUiModelA = (RouteDetailsStopUiModel) obj;
            if (i2 == i) {
                routeDetailsStopUiModelA = RouteDetailsStopUiModel.a(routeDetailsStopUiModelA, false, false, false, false, false, newEtaStatus, newEtaUiModel, null, null, 15615);
            }
            arrayList.add(routeDetailsStopUiModelA);
            newEtaStatus = stopEtaStatus;
            newEtaUiModel = stopEtaUiModel;
            i2 = i3;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsDataState)) {
            return false;
        }
        RouteDetailsDataState routeDetailsDataState = (RouteDetailsDataState) obj;
        return this.f4834a == routeDetailsDataState.f4834a && this.b == routeDetailsDataState.b && this.c.equals(routeDetailsDataState.c) && this.d.equals(routeDetailsDataState.d) && this.e.equals(routeDetailsDataState.e) && Intrinsics.d(this.f, routeDetailsDataState.f) && this.g == routeDetailsDataState.g && Intrinsics.d(this.h, routeDetailsDataState.h) && Intrinsics.d(this.i, routeDetailsDataState.i) && Intrinsics.d(this.j, routeDetailsDataState.j) && this.k.equals(routeDetailsDataState.k) && this.l.equals(routeDetailsDataState.l) && this.m.equals(routeDetailsDataState.m) && Intrinsics.d(this.n, routeDetailsDataState.n) && this.o == routeDetailsDataState.o && this.p == routeDetailsDataState.p && Intrinsics.d(this.q, routeDetailsDataState.q) && Intrinsics.d(this.r, routeDetailsDataState.r) && Intrinsics.d(this.s, routeDetailsDataState.s) && Intrinsics.d(this.t, routeDetailsDataState.t) && this.u == routeDetailsDataState.u && this.v == routeDetailsDataState.v && Intrinsics.d(this.w, routeDetailsDataState.w) && Intrinsics.d(this.x, routeDetailsDataState.x) && this.y == routeDetailsDataState.y && this.z == routeDetailsDataState.z && this.A == routeDetailsDataState.A && Intrinsics.d(this.B, routeDetailsDataState.B) && Intrinsics.d(this.C, routeDetailsDataState.C) && this.D == routeDetailsDataState.D && this.E == routeDetailsDataState.E && this.F.equals(routeDetailsDataState.F) && this.G.equals(routeDetailsDataState.G) && this.H == routeDetailsDataState.H && Intrinsics.d(this.I, routeDetailsDataState.I) && this.J == routeDetailsDataState.J && this.K.equals(routeDetailsDataState.K) && this.L == routeDetailsDataState.L;
    }

    public final int hashCode() {
        int i = (this.f4834a ? 1231 : 1237) * 31;
        RouteBookingType routeBookingType = this.b;
        int iE = nf1.e(nf1.e(nf1.e((i + (routeBookingType == null ? 0 : routeBookingType.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (this.g.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        RouteDetailsViewType routeDetailsViewType = this.h;
        int iHashCode2 = (this.m.hashCode() + ((this.l.hashCode() + nf1.e(r30.b(r30.b((iHashCode + (routeDetailsViewType == null ? 0 : routeDetailsViewType.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k)) * 31)) * 31;
        RouteTimeTableUiModel routeTimeTableUiModel = this.n;
        int iHashCode3 = (((((((iHashCode2 + (routeTimeTableUiModel == null ? 0 : routeTimeTableUiModel.hashCode())) * 31) + (this.o ? 1231 : 1237)) * 31) + 1237) * 31) + (this.p ? 1231 : 1237)) * 31;
        LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails = this.q;
        int iHashCode4 = (iHashCode3 + (livePassengerIndicatorBottomSheetDetails == null ? 0 : livePassengerIndicatorBottomSheetDetails.hashCode())) * 31;
        RouteAvailabilityBannerDetails routeAvailabilityBannerDetails = this.r;
        int iHashCode5 = (iHashCode4 + (routeAvailabilityBannerDetails == null ? 0 : routeAvailabilityBannerDetails.hashCode())) * 31;
        RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo = this.s;
        int iHashCode6 = (iHashCode5 + (routeAvailabilityBannerDialogInfo == null ? 0 : routeAvailabilityBannerDialogInfo.hashCode())) * 31;
        ReportProblemMetaData reportProblemMetaData = this.t;
        int iB = r30.b((((((iHashCode6 + (reportProblemMetaData == null ? 0 : reportProblemMetaData.hashCode())) * 31) + (this.u ? 1231 : 1237)) * 31) + (this.v ? 1231 : 1237)) * 31, 31, this.w);
        String str2 = this.x;
        return nf1.e((r30.b((nf1.e(d.f(this.F, (((r30.b(r30.b((((((((iB + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.y ? 1231 : 1237)) * 31) + (this.z ? 1231 : 1237)) * 31) + (this.A ? 1231 : 1237)) * 31, 31, this.B), 31, this.C) + (this.D ? 1231 : 1237)) * 31) + (this.E ? 1231 : 1237)) * 31, 31), 31, this.G) + (this.H ? 1231 : 1237)) * 31, 31, this.I) + (this.J ? 1231 : 1237)) * 31, 31, this.K) + (this.L ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteDetailsDataState(showFullScreenLoader=");
        sb.append(this.f4834a);
        sb.append(", routeDetailsBookingType=");
        sb.append(this.b);
        sb.append(", routeName=");
        cb0.t(sb, this.c, ", routeLastStopName=", this.d, ", routeFirstStopName=");
        cb0.t(sb, this.e, ", via=", this.f, ", routeNamingSchemeType=");
        sb.append(this.g);
        sb.append(", routeDetailsViewType=");
        sb.append(this.h);
        sb.append(", optionsMenuList=");
        dd.o(sb, this.i, ", routeStopUiModelList=", this.j, ", userDestinationName=");
        sb.append(this.k);
        sb.append(", currSelectedStopEtaUiModelForMap=");
        sb.append(this.l);
        sb.append(", mapUiModel=");
        sb.append(this.m);
        sb.append(", timeTableUiModel=");
        sb.append(this.n);
        sb.append(", isShortTripAvailable=");
        z40.r(sb, this.o, ", showLoadingDialogue=false, scrollSelectedStopOnTop=", this.p, ", livePassengerDetailsBottomSheetDetails=");
        sb.append(this.q);
        sb.append(", routeAvailabilityBannerDetails=");
        sb.append(this.r);
        sb.append(", routeAvailabilityBannerDialogInfo=");
        sb.append(this.s);
        sb.append(", reportProblemMetaData=");
        sb.append(this.t);
        sb.append(", showReportProblemButton=");
        z40.r(sb, this.u, ", animateMapZoom=", this.v, ", routeSpfTagList=");
        cb0.s(", agencyName=", this.x, ", showMyLocationButton=", sb, this.w);
        z40.r(sb, this.y, ", showBusIconForEta=", this.z, ", showNextBusHeadingForEta=");
        hq0.w(sb, this.A, ", stopMarkerList=", this.B, ", liveVehiclesMarkerList=");
        sb.append(this.C);
        sb.append(", shouldShowBonnetNumber=");
        sb.append(this.D);
        sb.append(", showViaStringDialog=");
        sb.append(this.E);
        sb.append(", adTargeting=");
        sb.append(this.F);
        sb.append(", stopSearchQuery=");
        t10.s(this.G, ", shouldShowProblemReportedAck=", ", reportProblemSelectedTags=", sb, this.H);
        sb.append(this.I);
        sb.append(", isReportProblemDialogSubmitEnabled=");
        sb.append(this.J);
        sb.append(", reportProblemFeedbackText=");
        sb.append(this.K);
        sb.append(", showReportProblemHook=");
        sb.append(this.L);
        sb.append(")");
        return sb.toString();
    }
}
