package app.chalo.instantticket.ui.faredetails.contract;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import app.chalo.constants.AppConstants;
import app.chalo.data.ProductBookingBranding;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import defpackage.vo1;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareDetailsViewState {
    public final String A;
    public final String B;
    public final boolean C;
    public final ProductBookingBranding D;
    public final boolean E;
    public final String F;
    public final PassengerSelectionPolicy G;
    public final String H;
    public final List I;
    public final ApplicableRuleUxCopyAppModel.CheckoutScreen J;
    public final String K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3950a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final List h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final FareDetailsScreenType n;
    public final boolean o;
    public final List p;
    public final boolean q;
    public final String r;
    public final FareDetailsBottomSheetType s;
    public final String t;
    public final boolean u;
    public final String v;
    public final RouteNamingSchemeType w;
    public final boolean x;
    public final boolean y;
    public final UserBillingInfoBottomSheetState z;

    public FareDetailsViewState(String str, String str2, String str3, boolean z, boolean z2, boolean z3, List specialFeatures, List passengerFareDetailsViewState, String str4, boolean z4, boolean z5, String str5, boolean z6, FareDetailsScreenType fareDetailsScreenType, boolean z7, List tncList, boolean z8, String str6, FareDetailsBottomSheetType fareDetailsBottomSheetType, String str7, boolean z9, String str8, RouteNamingSchemeType routeNamingSchemeType, boolean z10, boolean z11, UserBillingInfoBottomSheetState userBillingInfoBottomSheetState, String str9, String str10, boolean z12, ProductBookingBranding brandingType, boolean z13, String str11, PassengerSelectionPolicy passengerSelectionPolicy, String str12, List list, ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen, String str13) {
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(passengerFareDetailsViewState, "passengerFareDetailsViewState");
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(passengerSelectionPolicy, "passengerSelectionPolicy");
        this.f3950a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = specialFeatures;
        this.h = passengerFareDetailsViewState;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = str5;
        this.m = z6;
        this.n = fareDetailsScreenType;
        this.o = z7;
        this.p = tncList;
        this.q = z8;
        this.r = str6;
        this.s = fareDetailsBottomSheetType;
        this.t = str7;
        this.u = z9;
        this.v = str8;
        this.w = routeNamingSchemeType;
        this.x = z10;
        this.y = z11;
        this.z = userBillingInfoBottomSheetState;
        this.A = str9;
        this.B = str10;
        this.C = z12;
        this.D = brandingType;
        this.E = z13;
        this.F = str11;
        this.G = passengerSelectionPolicy;
        this.H = str12;
        this.I = list;
        this.J = checkoutScreen;
        this.K = str13;
    }

    public static FareDetailsViewState a(FareDetailsViewState fareDetailsViewState, String str, String str2, String str3, boolean z, boolean z2, boolean z3, List list, List list2, String str4, boolean z4, boolean z5, String str5, boolean z6, FareDetailsScreenType fareDetailsScreenType, List list3, boolean z7, String str6, FareDetailsBottomSheetType fareDetailsBottomSheetType, String str7, RouteNamingSchemeType routeNamingSchemeType, boolean z8, boolean z9, UserBillingInfoBottomSheetState userBillingInfoBottomSheetState, String str8, String str9, boolean z10, ProductBookingBranding productBookingBranding, boolean z11, String str10, PassengerSelectionPolicy passengerSelectionPolicy, String str11, List list4, ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen, String str12, int i, int i2) {
        String routeName = (i & 1) != 0 ? fareDetailsViewState.f3950a : str;
        String startStopName = (i & 2) != 0 ? fareDetailsViewState.b : str2;
        String endStopName = (i & 4) != 0 ? fareDetailsViewState.c : str3;
        boolean z12 = (i & 8) != 0 ? fareDetailsViewState.d : z;
        boolean z13 = (i & 16) != 0 ? fareDetailsViewState.e : z2;
        boolean z14 = (i & 32) != 0 ? fareDetailsViewState.f : z3;
        List specialFeatures = (i & 64) != 0 ? fareDetailsViewState.g : list;
        List passengerFareDetailsViewState = (i & 128) != 0 ? fareDetailsViewState.h : list2;
        String totalPayableAmount = (i & 256) != 0 ? fareDetailsViewState.i : str4;
        boolean z15 = (i & 512) != 0 ? fareDetailsViewState.j : z4;
        boolean z16 = (i & 1024) != 0 ? fareDetailsViewState.k : z5;
        String str13 = (i & 2048) != 0 ? fareDetailsViewState.l : str5;
        boolean z17 = (i & 4096) != 0 ? fareDetailsViewState.m : z6;
        FareDetailsScreenType fareDetailsScreenType2 = (i & 8192) != 0 ? fareDetailsViewState.n : fareDetailsScreenType;
        boolean z18 = (i & 16384) != 0 ? fareDetailsViewState.o : false;
        List tncList = (32768 & i) != 0 ? fareDetailsViewState.p : list3;
        boolean z19 = (i & 65536) != 0 ? fareDetailsViewState.q : z7;
        String str14 = (131072 & i) != 0 ? fareDetailsViewState.r : str6;
        FareDetailsBottomSheetType fareDetailsBottomSheetType2 = (262144 & i) != 0 ? fareDetailsViewState.s : fareDetailsBottomSheetType;
        String str15 = (524288 & i) != 0 ? fareDetailsViewState.t : str7;
        boolean z20 = (1048576 & i) != 0 ? fareDetailsViewState.u : false;
        String str16 = (2097152 & i) != 0 ? fareDetailsViewState.v : null;
        RouteNamingSchemeType routeNamingSchemeType2 = (4194304 & i) != 0 ? fareDetailsViewState.w : routeNamingSchemeType;
        boolean z21 = (i & 8388608) != 0 ? fareDetailsViewState.x : z8;
        boolean z22 = (i & 16777216) != 0 ? fareDetailsViewState.y : z9;
        UserBillingInfoBottomSheetState userBillingData = (i & 33554432) != 0 ? fareDetailsViewState.z : userBillingInfoBottomSheetState;
        boolean z23 = z12;
        String str17 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? fareDetailsViewState.A : str8;
        String str18 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? fareDetailsViewState.B : str9;
        boolean z24 = (i & 268435456) != 0 ? fareDetailsViewState.C : z10;
        ProductBookingBranding brandingType = (i & 536870912) != 0 ? fareDetailsViewState.D : productBookingBranding;
        boolean z25 = z13;
        boolean z26 = (i & 1073741824) != 0 ? fareDetailsViewState.E : z11;
        String str19 = (i & Integer.MIN_VALUE) != 0 ? fareDetailsViewState.F : str10;
        PassengerSelectionPolicy passengerSelectionPolicy2 = (i2 & 1) != 0 ? fareDetailsViewState.G : passengerSelectionPolicy;
        boolean z27 = z14;
        String str20 = (i2 & 2) != 0 ? fareDetailsViewState.H : str11;
        List list5 = (i2 & 4) != 0 ? fareDetailsViewState.I : list4;
        ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen2 = (i2 & 8) != 0 ? fareDetailsViewState.J : checkoutScreen;
        String appTncLink = (i2 & 16) != 0 ? fareDetailsViewState.K : str12;
        fareDetailsViewState.getClass();
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(passengerFareDetailsViewState, "passengerFareDetailsViewState");
        Intrinsics.i(totalPayableAmount, "totalPayableAmount");
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(routeNamingSchemeType2, "routeNamingSchemeType");
        Intrinsics.i(userBillingData, "userBillingData");
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(passengerSelectionPolicy2, "passengerSelectionPolicy");
        Intrinsics.i(appTncLink, "appTncLink");
        return new FareDetailsViewState(routeName, startStopName, endStopName, z23, z25, z27, specialFeatures, passengerFareDetailsViewState, totalPayableAmount, z15, z16, str13, z17, fareDetailsScreenType2, z18, tncList, z19, str14, fareDetailsBottomSheetType2, str15, z20, str16, routeNamingSchemeType2, z21, z22, userBillingData, str17, str18, z24, brandingType, z26, str19, passengerSelectionPolicy2, str20, list5, checkoutScreen2, appTncLink);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareDetailsViewState)) {
            return false;
        }
        FareDetailsViewState fareDetailsViewState = (FareDetailsViewState) obj;
        return Intrinsics.d(this.f3950a, fareDetailsViewState.f3950a) && Intrinsics.d(this.b, fareDetailsViewState.b) && Intrinsics.d(this.c, fareDetailsViewState.c) && this.d == fareDetailsViewState.d && this.e == fareDetailsViewState.e && this.f == fareDetailsViewState.f && Intrinsics.d(this.g, fareDetailsViewState.g) && Intrinsics.d(this.h, fareDetailsViewState.h) && Intrinsics.d(this.i, fareDetailsViewState.i) && this.j == fareDetailsViewState.j && this.k == fareDetailsViewState.k && Intrinsics.d(this.l, fareDetailsViewState.l) && this.m == fareDetailsViewState.m && Intrinsics.d(this.n, fareDetailsViewState.n) && this.o == fareDetailsViewState.o && Intrinsics.d(this.p, fareDetailsViewState.p) && this.q == fareDetailsViewState.q && Intrinsics.d(this.r, fareDetailsViewState.r) && Intrinsics.d(this.s, fareDetailsViewState.s) && Intrinsics.d(this.t, fareDetailsViewState.t) && this.u == fareDetailsViewState.u && Intrinsics.d(this.v, fareDetailsViewState.v) && this.w == fareDetailsViewState.w && this.x == fareDetailsViewState.x && this.y == fareDetailsViewState.y && Intrinsics.d(this.z, fareDetailsViewState.z) && Intrinsics.d(this.A, fareDetailsViewState.A) && Intrinsics.d(this.B, fareDetailsViewState.B) && this.C == fareDetailsViewState.C && Intrinsics.d(this.D, fareDetailsViewState.D) && this.E == fareDetailsViewState.E && Intrinsics.d(this.F, fareDetailsViewState.F) && this.G == fareDetailsViewState.G && Intrinsics.d(this.H, fareDetailsViewState.H) && Intrinsics.d(this.I, fareDetailsViewState.I) && Intrinsics.d(this.J, fareDetailsViewState.J) && Intrinsics.d(this.K, fareDetailsViewState.K);
    }

    public final int hashCode() {
        int iE = (((nf1.e(r30.b(r30.b((((((nf1.e(nf1.e(this.f3950a.hashCode() * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31, 31, this.g), 31, this.h), 31, this.i) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31;
        String str = this.l;
        int iHashCode = (((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.m ? 1231 : 1237)) * 31;
        FareDetailsScreenType fareDetailsScreenType = this.n;
        int iB = (r30.b((((iHashCode + (fareDetailsScreenType == null ? 0 : fareDetailsScreenType.hashCode())) * 31) + (this.o ? 1231 : 1237)) * 31, 31, this.p) + (this.q ? 1231 : 1237)) * 31;
        String str2 = this.r;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        FareDetailsBottomSheetType fareDetailsBottomSheetType = this.s;
        int iHashCode3 = (iHashCode2 + (fareDetailsBottomSheetType == null ? 0 : fareDetailsBottomSheetType.hashCode())) * 31;
        String str3 = this.t;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.u ? 1231 : 1237)) * 31;
        String str4 = this.v;
        int iHashCode5 = (this.z.hashCode() + ((((((this.w.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31) + (this.x ? 1231 : 1237)) * 31) + (this.y ? 1231 : 1237)) * 31)) * 31;
        String str5 = this.A;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.B;
        int iHashCode7 = (((this.D.hashCode() + ((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + (this.C ? 1231 : 1237)) * 31)) * 31) + (this.E ? 1231 : 1237)) * 31;
        String str7 = this.F;
        int iHashCode8 = (this.G.hashCode() + ((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31;
        String str8 = this.H;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list = this.I;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen = this.J;
        return this.K.hashCode() + ((iHashCode10 + (checkoutScreen != null ? checkoutScreen.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("FareDetailsViewState(routeName=", this.f3950a, ", startStopName=", this.b, ", endStopName=");
        t10.s(this.c, ", showLoadingShimmerState=", ", showLoadingDialogue=", sbE, this.d);
        z40.r(sbE, this.e, ", showSnackbar=", this.f, ", specialFeatures=");
        dd.o(sbE, this.g, ", passengerFareDetailsViewState=", this.h, ", totalPayableAmount=");
        t10.s(this.i, ", isPayButtonEnabled=", ", instantTicketOrderCreationInProgress=", sbE, this.j);
        pk0.x(", selectedTime=", this.l, ", shouldDisablePlusCounterForAllCategories=", sbE, this.k);
        sbE.append(this.m);
        sbE.append(", screenType=");
        sbE.append(this.n);
        sbE.append(", showBookingStatusUnclearDialog=");
        hq0.w(sbE, this.o, ", tncList=", this.p, ", showTncSection=");
        pk0.x(", fareNote=", this.r, ", bottomSheetType=", sbE, this.q);
        sbE.append(this.s);
        sbE.append(", via=");
        sbE.append(this.t);
        sbE.append(", shouldShowOrderCreationErrorDialog=");
        pk0.x(", orderCreationErrorDialogCopy=", this.v, ", routeNamingSchemeType=", sbE, this.u);
        sbE.append(this.w);
        sbE.append(", showFareSplit=");
        sbE.append(this.x);
        sbE.append(", showTotalAmount=");
        sbE.append(this.y);
        sbE.append(", userBillingData=");
        sbE.append(this.z);
        sbE.append(", ondcBookingId=");
        cb0.t(sbE, this.A, ", fareAlertText=", this.B, ", showTncDialogue=");
        sbE.append(this.C);
        sbE.append(", brandingType=");
        sbE.append(this.D);
        sbE.append(", showInstantTicketPlotlineWidget=");
        pk0.x(", passengerSelectionPolicyMsg=", this.F, ", passengerSelectionPolicy=", sbE, this.E);
        sbE.append(this.G);
        sbE.append(", selectedPassengerCategory=");
        sbE.append(this.H);
        sbE.append(", appliedRules=");
        sbE.append(this.I);
        sbE.append(", appliedRuleUxCopy=");
        sbE.append(this.J);
        sbE.append(", appTncLink=");
        return vo1.p(sbE, this.K, ")");
    }

    public FareDetailsViewState() {
        EmptyList emptyList = EmptyList.f17557a;
        RouteNamingSchemeType routeNamingSchemeType = RouteNamingSchemeType.DEFAULT;
        UserBillingDataState userBillingDataState = new UserBillingDataState();
        UserBillingDataState userBillingDataState2 = new UserBillingDataState();
        Integer num = (Integer) CollectionsKt.H(AppConstants.f1940a);
        this("", "", "", false, false, false, emptyList, emptyList, "", false, false, null, false, null, false, emptyList, false, null, null, null, false, null, routeNamingSchemeType, false, false, new UserBillingInfoBottomSheetState(userBillingDataState, userBillingDataState2, null, num != null ? num.intValue() : 10), null, null, false, ProductBookingBranding.None.INSTANCE, false, null, PassengerSelectionPolicy.Multiple, null, null, null, "");
    }
}
