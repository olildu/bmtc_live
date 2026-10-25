package app.chalo.home.ui.history;

import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel;
import defpackage.d;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.z40;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MyTicketsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabMetaDataAppModel f3413a;
    public final List b;
    public final List c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final TicketsPassesTabType g;
    public final TicketsPassesSectionWidgetAppModel h;
    public final TicketsScreenBottomSheetType i;
    public final List j;
    public final boolean k;
    public final Map l;
    public final boolean m;
    public final TicketsPageAlertDialogType n;
    public final boolean o;
    public final boolean p;
    public final Boolean q;
    public final boolean r;
    public final String s;
    public final TicketsPageLayoutType t;
    public final TabUiMetaData u;
    public final TabUiMetaData v;
    public final HomeTabScreensRetainedData.MyTicketsScreen w;
    public final boolean x;

    public MyTicketsDataState(TabMetaDataAppModel tabMetaDataAppModel, List productsTabList, List list, List list2, boolean z, boolean z2, TicketsPassesTabType currentlySelectedTab, TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel, TicketsScreenBottomSheetType ticketsScreenBottomSheetType, List list3, boolean z3, Map map, boolean z4, TicketsPageAlertDialogType ticketsPageAlertDialogType, boolean z5, boolean z6, Boolean bool, boolean z7, String str, TicketsPageLayoutType layoutType, TabUiMetaData tabUiMetaData, TabUiMetaData tabUiMetaData2, HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen, boolean z8) {
        Intrinsics.i(productsTabList, "productsTabList");
        Intrinsics.i(currentlySelectedTab, "currentlySelectedTab");
        Intrinsics.i(layoutType, "layoutType");
        this.f3413a = tabMetaDataAppModel;
        this.b = productsTabList;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = z2;
        this.g = currentlySelectedTab;
        this.h = ticketsPassesSectionWidgetAppModel;
        this.i = ticketsScreenBottomSheetType;
        this.j = list3;
        this.k = z3;
        this.l = map;
        this.m = z4;
        this.n = ticketsPageAlertDialogType;
        this.o = z5;
        this.p = z6;
        this.q = bool;
        this.r = z7;
        this.s = str;
        this.t = layoutType;
        this.u = tabUiMetaData;
        this.v = tabUiMetaData2;
        this.w = myTicketsScreen;
        this.x = z8;
    }

    public static MyTicketsDataState a(MyTicketsDataState myTicketsDataState, TabMetaDataAppModel tabMetaDataAppModel, List list, List list2, boolean z, boolean z2, TicketsPassesTabType ticketsPassesTabType, TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel, TicketsScreenBottomSheetType ticketsScreenBottomSheetType, ArrayList arrayList, boolean z3, LinkedHashMap linkedHashMap, boolean z4, TicketsPageAlertDialogType ticketsPageAlertDialogType, boolean z5, boolean z6, Boolean bool, boolean z7, String str, TicketsPageLayoutType ticketsPageLayoutType, HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen, boolean z8, int i) {
        TabMetaDataAppModel tabMetaData = (i & 1) != 0 ? myTicketsDataState.f3413a : tabMetaDataAppModel;
        List productsTabList = myTicketsDataState.b;
        List list3 = (i & 4) != 0 ? myTicketsDataState.c : list;
        List list4 = (i & 8) != 0 ? myTicketsDataState.d : list2;
        boolean z9 = (i & 16) != 0 ? myTicketsDataState.e : z;
        boolean z10 = (i & 32) != 0 ? myTicketsDataState.f : z2;
        TicketsPassesTabType currentlySelectedTab = (i & 64) != 0 ? myTicketsDataState.g : ticketsPassesTabType;
        myTicketsDataState.getClass();
        TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel2 = (i & 256) != 0 ? myTicketsDataState.h : ticketsPassesSectionWidgetAppModel;
        TicketsScreenBottomSheetType ticketsScreenBottomSheetType2 = (i & 512) != 0 ? myTicketsDataState.i : ticketsScreenBottomSheetType;
        List list5 = (i & 1024) != 0 ? myTicketsDataState.j : arrayList;
        boolean z11 = (i & 2048) != 0 ? myTicketsDataState.k : z3;
        Map map = (i & 4096) != 0 ? myTicketsDataState.l : linkedHashMap;
        boolean z12 = (i & 8192) != 0 ? myTicketsDataState.m : z4;
        TicketsPageAlertDialogType ticketsPageAlertDialogType2 = (i & 16384) != 0 ? myTicketsDataState.n : ticketsPageAlertDialogType;
        boolean z13 = (32768 & i) != 0 ? myTicketsDataState.o : z5;
        boolean z14 = (65536 & i) != 0 ? myTicketsDataState.p : z6;
        Boolean bool2 = (131072 & i) != 0 ? myTicketsDataState.q : bool;
        boolean z15 = (262144 & i) != 0 ? myTicketsDataState.r : z7;
        String busService = (524288 & i) != 0 ? myTicketsDataState.s : str;
        TicketsPageLayoutType layoutType = (1048576 & i) != 0 ? myTicketsDataState.t : ticketsPageLayoutType;
        TabUiMetaData tabUiMetaData = myTicketsDataState.u;
        TabUiMetaData tabUiMetaData2 = myTicketsDataState.v;
        HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen2 = (i & 8388608) != 0 ? myTicketsDataState.w : myTicketsScreen;
        boolean z16 = (i & 16777216) != 0 ? myTicketsDataState.x : z8;
        myTicketsDataState.getClass();
        Intrinsics.i(tabMetaData, "tabMetaData");
        Intrinsics.i(productsTabList, "productsTabList");
        Intrinsics.i(currentlySelectedTab, "currentlySelectedTab");
        Intrinsics.i(busService, "busService");
        Intrinsics.i(layoutType, "layoutType");
        return new MyTicketsDataState(tabMetaData, productsTabList, list3, list4, z9, z10, currentlySelectedTab, ticketsPassesSectionWidgetAppModel2, ticketsScreenBottomSheetType2, list5, z11, map, z12, ticketsPageAlertDialogType2, z13, z14, bool2, z15, busService, layoutType, tabUiMetaData, tabUiMetaData2, myTicketsScreen2, z16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TabUiMetaData getU() {
        return this.u;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TicketsPageAlertDialogType getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTicketsDataState)) {
            return false;
        }
        MyTicketsDataState myTicketsDataState = (MyTicketsDataState) obj;
        return this.f3413a.equals(myTicketsDataState.f3413a) && Intrinsics.d(this.b, myTicketsDataState.b) && Intrinsics.d(this.c, myTicketsDataState.c) && Intrinsics.d(this.d, myTicketsDataState.d) && this.e == myTicketsDataState.e && this.f == myTicketsDataState.f && this.g == myTicketsDataState.g && Intrinsics.d(this.h, myTicketsDataState.h) && Intrinsics.d(this.i, myTicketsDataState.i) && Intrinsics.d(this.j, myTicketsDataState.j) && this.k == myTicketsDataState.k && this.l.equals(myTicketsDataState.l) && this.m == myTicketsDataState.m && this.n == myTicketsDataState.n && this.o == myTicketsDataState.o && this.p == myTicketsDataState.p && Intrinsics.d(this.q, myTicketsDataState.q) && this.r == myTicketsDataState.r && this.s.equals(myTicketsDataState.s) && this.t == myTicketsDataState.t && this.u.equals(myTicketsDataState.u) && this.v.equals(myTicketsDataState.v) && Intrinsics.d(this.w, myTicketsDataState.w) && this.x == myTicketsDataState.x;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TabUiMetaData getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Map getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getM() {
        return this.m;
    }

    public final int hashCode() {
        int iB = r30.b(this.f3413a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode2 = (this.g.hashCode() + ((((((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31)) * 961;
        TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel = this.h;
        int iHashCode3 = (iHashCode2 + (ticketsPassesSectionWidgetAppModel == null ? 0 : ticketsPassesSectionWidgetAppModel.hashCode())) * 31;
        TicketsScreenBottomSheetType ticketsScreenBottomSheetType = this.i;
        int iHashCode4 = (iHashCode3 + (ticketsScreenBottomSheetType == null ? 0 : ticketsScreenBottomSheetType.hashCode())) * 31;
        List list3 = this.j;
        int iF = (d.f(this.l, (((iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31) + (this.k ? 1231 : 1237)) * 31, 31) + (this.m ? 1231 : 1237)) * 31;
        TicketsPageAlertDialogType ticketsPageAlertDialogType = this.n;
        int iHashCode5 = (((((iF + (ticketsPageAlertDialogType == null ? 0 : ticketsPageAlertDialogType.hashCode())) * 31) + (this.o ? 1231 : 1237)) * 31) + (this.p ? 1231 : 1237)) * 31;
        Boolean bool = this.q;
        int iHashCode6 = (((((this.t.hashCode() + nf1.e((((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + (this.r ? 1231 : 1237)) * 31, 31, this.s)) * 31) + 565421088) * 31) + 565421088) * 31;
        HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen = this.w;
        return ((iHashCode6 + (myTicketsScreen != null ? myTicketsScreen.hashCode() : 0)) * 31) + (this.x ? 1231 : 1237);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TicketsPassesSectionWidgetAppModel getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getQ() {
        return this.q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTicketsDataState(tabMetaData=");
        sb.append(this.f3413a);
        sb.append(", productsTabList=");
        sb.append(this.b);
        sb.append(", bookingTypeList=");
        dd.o(sb, this.c, ", expiredBookingTypeList=", this.d, ", showMoreTickets=");
        z40.r(sb, this.e, ", showMorePasses=", this.f, ", currentlySelectedTab=");
        sb.append(this.g);
        sb.append(", emptyStateScreenUiData=null, ticketsPageSectionData=");
        sb.append(this.h);
        sb.append(", bottomSheetType=");
        sb.append(this.i);
        sb.append(", gridItemDataList=");
        sb.append(this.j);
        sb.append(", fullScreenEmptyState=");
        sb.append(this.k);
        sb.append(", premiumBusBookingDataMap=");
        sb.append(this.l);
        sb.append(", shouldShowReclaimCard=");
        sb.append(this.m);
        sb.append(", alertDialogType=");
        sb.append(this.n);
        sb.append(", showLoadingDialog=");
        z40.r(sb, this.o, ", isLoading=", this.p, ", isLoggedIn=");
        sb.append(this.q);
        sb.append(", showFloatingButton=");
        sb.append(this.r);
        sb.append(", busService=");
        sb.append(this.s);
        sb.append(", layoutType=");
        sb.append(this.t);
        sb.append(", activeTabUiMetaData=");
        sb.append(this.u);
        sb.append(", expiredTabUiMetaData=");
        sb.append(this.v);
        sb.append(", retainedState=");
        sb.append(this.w);
        sb.append(", showContactSupportDialog=");
        sb.append(this.x);
        sb.append(")");
        return sb.toString();
    }
}
