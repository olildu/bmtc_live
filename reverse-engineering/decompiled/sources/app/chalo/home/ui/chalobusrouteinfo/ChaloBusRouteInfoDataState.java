package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.home.data.model.app.response.ScheduleBlockKey;
import defpackage.dd;
import defpackage.hq0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3316a;
    public final boolean b;
    public final List c;
    public final ScheduleBlockKey d;
    public final List e;
    public final List f;
    public final String g;
    public final ChaloBusRouteInfoErrorType h;
    public final RouteSuggestionSheetState i;

    public ChaloBusRouteInfoDataState(String str, boolean z, List tabs, ScheduleBlockKey scheduleBlockKey, List filters, List corridors, String str2, ChaloBusRouteInfoErrorType chaloBusRouteInfoErrorType, RouteSuggestionSheetState routeSuggestionSheetState) {
        Intrinsics.i(tabs, "tabs");
        Intrinsics.i(filters, "filters");
        Intrinsics.i(corridors, "corridors");
        this.f3316a = str;
        this.b = z;
        this.c = tabs;
        this.d = scheduleBlockKey;
        this.e = filters;
        this.f = corridors;
        this.g = str2;
        this.h = chaloBusRouteInfoErrorType;
        this.i = routeSuggestionSheetState;
    }

    public static ChaloBusRouteInfoDataState a(ChaloBusRouteInfoDataState chaloBusRouteInfoDataState, String str, boolean z, List list, ScheduleBlockKey scheduleBlockKey, List list2, List list3, String str2, ChaloBusRouteInfoErrorType chaloBusRouteInfoErrorType, RouteSuggestionSheetState routeSuggestionSheetState, int i) {
        if ((i & 1) != 0) {
            str = chaloBusRouteInfoDataState.f3316a;
        }
        String toolbarTitle = str;
        if ((i & 2) != 0) {
            z = chaloBusRouteInfoDataState.b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = chaloBusRouteInfoDataState.c;
        }
        List tabs = list;
        if ((i & 8) != 0) {
            scheduleBlockKey = chaloBusRouteInfoDataState.d;
        }
        ScheduleBlockKey scheduleBlockKey2 = scheduleBlockKey;
        if ((i & 16) != 0) {
            list2 = chaloBusRouteInfoDataState.e;
        }
        List filters = list2;
        List corridors = (i & 32) != 0 ? chaloBusRouteInfoDataState.f : list3;
        String str3 = (i & 64) != 0 ? chaloBusRouteInfoDataState.g : str2;
        ChaloBusRouteInfoErrorType chaloBusRouteInfoErrorType2 = (i & 128) != 0 ? chaloBusRouteInfoDataState.h : chaloBusRouteInfoErrorType;
        RouteSuggestionSheetState routeSuggestionSheetState2 = (i & 256) != 0 ? chaloBusRouteInfoDataState.i : routeSuggestionSheetState;
        chaloBusRouteInfoDataState.getClass();
        Intrinsics.i(toolbarTitle, "toolbarTitle");
        Intrinsics.i(tabs, "tabs");
        Intrinsics.i(filters, "filters");
        Intrinsics.i(corridors, "corridors");
        return new ChaloBusRouteInfoDataState(toolbarTitle, z2, tabs, scheduleBlockKey2, filters, corridors, str3, chaloBusRouteInfoErrorType2, routeSuggestionSheetState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoDataState)) {
            return false;
        }
        ChaloBusRouteInfoDataState chaloBusRouteInfoDataState = (ChaloBusRouteInfoDataState) obj;
        return Intrinsics.d(this.f3316a, chaloBusRouteInfoDataState.f3316a) && this.b == chaloBusRouteInfoDataState.b && Intrinsics.d(this.c, chaloBusRouteInfoDataState.c) && Intrinsics.d(this.d, chaloBusRouteInfoDataState.d) && Intrinsics.d(this.e, chaloBusRouteInfoDataState.e) && Intrinsics.d(this.f, chaloBusRouteInfoDataState.f) && Intrinsics.d(this.g, chaloBusRouteInfoDataState.g) && Intrinsics.d(this.h, chaloBusRouteInfoDataState.h) && Intrinsics.d(this.i, chaloBusRouteInfoDataState.i);
    }

    public final int hashCode() {
        int iB = r30.b(((this.f3316a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c);
        ScheduleBlockKey scheduleBlockKey = this.d;
        int iB2 = r30.b(r30.b((iB + (scheduleBlockKey == null ? 0 : scheduleBlockKey.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        ChaloBusRouteInfoErrorType chaloBusRouteInfoErrorType = this.h;
        int iHashCode2 = (iHashCode + (chaloBusRouteInfoErrorType == null ? 0 : chaloBusRouteInfoErrorType.hashCode())) * 31;
        RouteSuggestionSheetState routeSuggestionSheetState = this.i;
        return iHashCode2 + (routeSuggestionSheetState != null ? routeSuggestionSheetState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("ChaloBusRouteInfoDataState(toolbarTitle=", this.f3316a, ", isLoading=", ", tabs=", this.b);
        sbM.append(this.c);
        sbM.append(", selectedTabId=");
        sbM.append(this.d);
        sbM.append(", filters=");
        dd.o(sbM, this.e, ", corridors=", this.f, ", expandedCorridorId=");
        sbM.append(this.g);
        sbM.append(", errorType=");
        sbM.append(this.h);
        sbM.append(", routeSuggestionSheetState=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
