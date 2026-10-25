package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
import defpackage.cb0;
import defpackage.dd;
import defpackage.q7;
import defpackage.r30;
import defpackage.t10;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbBulkBookingRideDetailsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6934a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final SuperPassResponseAppModel f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final LinkedBookingLayoutType k;
    public final BulkBookingRideDetailsScreenType l;
    public final LinkedBookingLocalDataFetchStateLayoutType m;
    public final SuperPassSubTypes n;
    public final PBPreBookingDetailsLayoutType o;
    public final boolean p;
    public final PbBulkBookingRideDetailsTabType q;
    public final String r;
    public final boolean s;
    public final PremiumBusMeta t;
    public final PbBulkBookingRideDetailsDialogType u;
    public final List v;
    public final String w;
    public final boolean x;
    public final PassTierType y;
    public final boolean z;

    public PbBulkBookingRideDetailsViewState(String str, List pbBulkBookingUpcomingRideDetailList, List pbBulkBookingPastRideDetailList, List upcomingBookingsHeaderList, List pastBookingDateHeaderList, SuperPassResponseAppModel superPassResponseAppModel, String str2, String str3, String str4, Integer num, LinkedBookingLayoutType linkedBookingLayoutType, BulkBookingRideDetailsScreenType bulkBookingRideDetailsScreenType, LinkedBookingLocalDataFetchStateLayoutType linkedBookingLocalDataFetchStateLayoutType, SuperPassSubTypes passType, PBPreBookingDetailsLayoutType layoutType, boolean z, PbBulkBookingRideDetailsTabType currentlySelectedTab, String str5, boolean z2, PremiumBusMeta premiumBusMeta, PbBulkBookingRideDetailsDialogType pbBulkBookingRideDetailsDialogType, List list, String str6, boolean z3, PassTierType passTierType, boolean z4) {
        Intrinsics.i(pbBulkBookingUpcomingRideDetailList, "pbBulkBookingUpcomingRideDetailList");
        Intrinsics.i(pbBulkBookingPastRideDetailList, "pbBulkBookingPastRideDetailList");
        Intrinsics.i(upcomingBookingsHeaderList, "upcomingBookingsHeaderList");
        Intrinsics.i(pastBookingDateHeaderList, "pastBookingDateHeaderList");
        Intrinsics.i(linkedBookingLayoutType, "linkedBookingLayoutType");
        Intrinsics.i(bulkBookingRideDetailsScreenType, "bulkBookingRideDetailsScreenType");
        Intrinsics.i(linkedBookingLocalDataFetchStateLayoutType, "linkedBookingLocalDataFetchStateLayoutType");
        Intrinsics.i(passType, "passType");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(currentlySelectedTab, "currentlySelectedTab");
        Intrinsics.i(passTierType, "passTierType");
        this.f6934a = str;
        this.b = pbBulkBookingUpcomingRideDetailList;
        this.c = pbBulkBookingPastRideDetailList;
        this.d = upcomingBookingsHeaderList;
        this.e = pastBookingDateHeaderList;
        this.f = superPassResponseAppModel;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = num;
        this.k = linkedBookingLayoutType;
        this.l = bulkBookingRideDetailsScreenType;
        this.m = linkedBookingLocalDataFetchStateLayoutType;
        this.n = passType;
        this.o = layoutType;
        this.p = z;
        this.q = currentlySelectedTab;
        this.r = str5;
        this.s = z2;
        this.t = premiumBusMeta;
        this.u = pbBulkBookingRideDetailsDialogType;
        this.v = list;
        this.w = str6;
        this.x = z3;
        this.y = passTierType;
        this.z = z4;
    }

    public static PbBulkBookingRideDetailsViewState a(PbBulkBookingRideDetailsViewState pbBulkBookingRideDetailsViewState, String str, List list, List list2, ArrayList arrayList, ArrayList arrayList2, SuperPassResponseAppModel superPassResponseAppModel, String str2, String str3, String str4, Integer num, LinkedBookingLayoutType linkedBookingLayoutType, BulkBookingRideDetailsScreenType bulkBookingRideDetailsScreenType, LinkedBookingLocalDataFetchStateLayoutType linkedBookingLocalDataFetchStateLayoutType, SuperPassSubTypes superPassSubTypes, PBPreBookingDetailsLayoutType pBPreBookingDetailsLayoutType, boolean z, PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType, String str5, boolean z2, PremiumBusMeta premiumBusMeta, PbBulkBookingRideDetailsDialogType pbBulkBookingRideDetailsDialogType, List list3, String str6, boolean z3, PassTierType passTierType, boolean z4, int i) {
        String toolbarTitle = (i & 1) != 0 ? pbBulkBookingRideDetailsViewState.f6934a : str;
        List pbBulkBookingUpcomingRideDetailList = (i & 2) != 0 ? pbBulkBookingRideDetailsViewState.b : list;
        List pbBulkBookingPastRideDetailList = (i & 4) != 0 ? pbBulkBookingRideDetailsViewState.c : list2;
        List upcomingBookingsHeaderList = (i & 8) != 0 ? pbBulkBookingRideDetailsViewState.d : arrayList;
        List pastBookingDateHeaderList = (i & 16) != 0 ? pbBulkBookingRideDetailsViewState.e : arrayList2;
        SuperPassResponseAppModel superPassResponseAppModel2 = (i & 32) != 0 ? pbBulkBookingRideDetailsViewState.f : superPassResponseAppModel;
        String str7 = (i & 64) != 0 ? pbBulkBookingRideDetailsViewState.g : str2;
        String str8 = (i & 128) != 0 ? pbBulkBookingRideDetailsViewState.h : str3;
        String str9 = (i & 256) != 0 ? pbBulkBookingRideDetailsViewState.i : str4;
        Integer num2 = (i & 512) != 0 ? pbBulkBookingRideDetailsViewState.j : num;
        LinkedBookingLayoutType linkedBookingLayoutType2 = (i & 1024) != 0 ? pbBulkBookingRideDetailsViewState.k : linkedBookingLayoutType;
        BulkBookingRideDetailsScreenType bulkBookingRideDetailsScreenType2 = (i & 2048) != 0 ? pbBulkBookingRideDetailsViewState.l : bulkBookingRideDetailsScreenType;
        LinkedBookingLocalDataFetchStateLayoutType linkedBookingLocalDataFetchStateLayoutType2 = (i & 4096) != 0 ? pbBulkBookingRideDetailsViewState.m : linkedBookingLocalDataFetchStateLayoutType;
        SuperPassSubTypes passType = (i & 8192) != 0 ? pbBulkBookingRideDetailsViewState.n : superPassSubTypes;
        SuperPassResponseAppModel superPassResponseAppModel3 = superPassResponseAppModel2;
        PBPreBookingDetailsLayoutType layoutType = (i & 16384) != 0 ? pbBulkBookingRideDetailsViewState.o : pBPreBookingDetailsLayoutType;
        boolean z5 = (i & 32768) != 0 ? pbBulkBookingRideDetailsViewState.p : z;
        PbBulkBookingRideDetailsTabType currentlySelectedTab = (i & 65536) != 0 ? pbBulkBookingRideDetailsViewState.q : pbBulkBookingRideDetailsTabType;
        String str10 = str7;
        String str11 = (i & 131072) != 0 ? pbBulkBookingRideDetailsViewState.r : str5;
        boolean z6 = (i & 262144) != 0 ? pbBulkBookingRideDetailsViewState.s : z2;
        PremiumBusMeta premiumBusMeta2 = (i & 524288) != 0 ? pbBulkBookingRideDetailsViewState.t : premiumBusMeta;
        PbBulkBookingRideDetailsDialogType pbBulkBookingRideDetailsDialogType2 = (i & 1048576) != 0 ? pbBulkBookingRideDetailsViewState.u : pbBulkBookingRideDetailsDialogType;
        List list4 = (i & 2097152) != 0 ? pbBulkBookingRideDetailsViewState.v : list3;
        String str12 = (i & 4194304) != 0 ? pbBulkBookingRideDetailsViewState.w : str6;
        boolean z7 = (i & 8388608) != 0 ? pbBulkBookingRideDetailsViewState.x : z3;
        PassTierType passTierType2 = (i & 16777216) != 0 ? pbBulkBookingRideDetailsViewState.y : passTierType;
        String str13 = str8;
        boolean z8 = (i & 33554432) != 0 ? pbBulkBookingRideDetailsViewState.z : z4;
        pbBulkBookingRideDetailsViewState.getClass();
        Intrinsics.i(toolbarTitle, "toolbarTitle");
        Intrinsics.i(pbBulkBookingUpcomingRideDetailList, "pbBulkBookingUpcomingRideDetailList");
        Intrinsics.i(pbBulkBookingPastRideDetailList, "pbBulkBookingPastRideDetailList");
        Intrinsics.i(upcomingBookingsHeaderList, "upcomingBookingsHeaderList");
        Intrinsics.i(pastBookingDateHeaderList, "pastBookingDateHeaderList");
        Intrinsics.i(linkedBookingLayoutType2, "linkedBookingLayoutType");
        Intrinsics.i(bulkBookingRideDetailsScreenType2, "bulkBookingRideDetailsScreenType");
        Intrinsics.i(linkedBookingLocalDataFetchStateLayoutType2, "linkedBookingLocalDataFetchStateLayoutType");
        Intrinsics.i(passType, "passType");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(currentlySelectedTab, "currentlySelectedTab");
        Intrinsics.i(passTierType2, "passTierType");
        return new PbBulkBookingRideDetailsViewState(toolbarTitle, pbBulkBookingUpcomingRideDetailList, pbBulkBookingPastRideDetailList, upcomingBookingsHeaderList, pastBookingDateHeaderList, superPassResponseAppModel3, str10, str13, str9, num2, linkedBookingLayoutType2, bulkBookingRideDetailsScreenType2, linkedBookingLocalDataFetchStateLayoutType2, passType, layoutType, z5, currentlySelectedTab, str11, z6, premiumBusMeta2, pbBulkBookingRideDetailsDialogType2, list4, str12, z7, passTierType2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbBulkBookingRideDetailsViewState)) {
            return false;
        }
        PbBulkBookingRideDetailsViewState pbBulkBookingRideDetailsViewState = (PbBulkBookingRideDetailsViewState) obj;
        return Intrinsics.d(this.f6934a, pbBulkBookingRideDetailsViewState.f6934a) && Intrinsics.d(this.b, pbBulkBookingRideDetailsViewState.b) && Intrinsics.d(this.c, pbBulkBookingRideDetailsViewState.c) && Intrinsics.d(this.d, pbBulkBookingRideDetailsViewState.d) && Intrinsics.d(this.e, pbBulkBookingRideDetailsViewState.e) && Intrinsics.d(this.f, pbBulkBookingRideDetailsViewState.f) && Intrinsics.d(this.g, pbBulkBookingRideDetailsViewState.g) && Intrinsics.d(this.h, pbBulkBookingRideDetailsViewState.h) && Intrinsics.d(this.i, pbBulkBookingRideDetailsViewState.i) && Intrinsics.d(this.j, pbBulkBookingRideDetailsViewState.j) && this.k == pbBulkBookingRideDetailsViewState.k && this.l == pbBulkBookingRideDetailsViewState.l && this.m == pbBulkBookingRideDetailsViewState.m && this.n == pbBulkBookingRideDetailsViewState.n && this.o == pbBulkBookingRideDetailsViewState.o && this.p == pbBulkBookingRideDetailsViewState.p && this.q == pbBulkBookingRideDetailsViewState.q && Intrinsics.d(this.r, pbBulkBookingRideDetailsViewState.r) && this.s == pbBulkBookingRideDetailsViewState.s && Intrinsics.d(this.t, pbBulkBookingRideDetailsViewState.t) && Intrinsics.d(this.u, pbBulkBookingRideDetailsViewState.u) && Intrinsics.d(this.v, pbBulkBookingRideDetailsViewState.v) && Intrinsics.d(this.w, pbBulkBookingRideDetailsViewState.w) && this.x == pbBulkBookingRideDetailsViewState.x && this.y == pbBulkBookingRideDetailsViewState.y && this.z == pbBulkBookingRideDetailsViewState.z;
    }

    public final int hashCode() {
        int iB = r30.b(r30.b(r30.b(r30.b(this.f6934a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        SuperPassResponseAppModel superPassResponseAppModel = this.f;
        int iHashCode = (iB + (superPassResponseAppModel == null ? 0 : superPassResponseAppModel.hashCode())) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode5 = (this.q.hashCode() + ((((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.p ? 1231 : 1237)) * 31)) * 31;
        String str4 = this.r;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + (this.s ? 1231 : 1237)) * 31;
        PremiumBusMeta premiumBusMeta = this.t;
        int iHashCode7 = (iHashCode6 + (premiumBusMeta == null ? 0 : premiumBusMeta.hashCode())) * 31;
        PbBulkBookingRideDetailsDialogType pbBulkBookingRideDetailsDialogType = this.u;
        int iHashCode8 = (iHashCode7 + (pbBulkBookingRideDetailsDialogType == null ? 0 : pbBulkBookingRideDetailsDialogType.hashCode())) * 31;
        List list = this.v;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.w;
        return ((this.y.hashCode() + ((((iHashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.x ? 1231 : 1237)) * 31)) * 31) + (this.z ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbH = q7.h("PbBulkBookingRideDetailsViewState(toolbarTitle=", this.f6934a, ", pbBulkBookingUpcomingRideDetailList=", ", pbBulkBookingPastRideDetailList=", this.b);
        dd.o(sbH, this.c, ", upcomingBookingsHeaderList=", this.d, ", pastBookingDateHeaderList=");
        sbH.append(this.e);
        sbH.append(", superPassResponseAppModel=");
        sbH.append(this.f);
        sbH.append(", validityText=");
        cb0.t(sbH, this.g, ", passStartTime=", this.h, ", passExpiryTime=");
        xs.u(this.j, this.i, ", remainingTrips=", ", linkedBookingLayoutType=", sbH);
        sbH.append(this.k);
        sbH.append(", bulkBookingRideDetailsScreenType=");
        sbH.append(this.l);
        sbH.append(", linkedBookingLocalDataFetchStateLayoutType=");
        sbH.append(this.m);
        sbH.append(", passType=");
        sbH.append(this.n);
        sbH.append(", layoutType=");
        sbH.append(this.o);
        sbH.append(", isLoading=");
        sbH.append(this.p);
        sbH.append(", currentlySelectedTab=");
        sbH.append(this.q);
        sbH.append(", passId=");
        sbH.append(this.r);
        sbH.append(", isBulkBookingPass=");
        sbH.append(this.s);
        sbH.append(", premiumBusMeta=");
        sbH.append(this.t);
        sbH.append(", dialogType=");
        sbH.append(this.u);
        sbH.append(", infoBanners=");
        sbH.append(this.v);
        sbH.append(", faqImageUrl=");
        t10.s(this.w, ", showRenewButton=", ", passTierType=", sbH, this.x);
        sbH.append(this.y);
        sbH.append(", markedAsUnlimited=");
        sbH.append(this.z);
        sbH.append(")");
        return sbH.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PbBulkBookingRideDetailsViewState() {
        EmptyList emptyList = EmptyList.f17557a;
        this("", emptyList, emptyList, emptyList, emptyList, null, null, null, null, null, LinkedBookingLayoutType.Initialize, BulkBookingRideDetailsScreenType.Loading, LinkedBookingLocalDataFetchStateLayoutType.Loading, SuperPassSubTypes.UNKNOWN, PBPreBookingDetailsLayoutType.REGULAR_USER, false, PbBulkBookingRideDetailsTabType.UPCOMING, null, false, null, null, null, null, false, PassTierType.UNKNOWN, false);
    }
}
