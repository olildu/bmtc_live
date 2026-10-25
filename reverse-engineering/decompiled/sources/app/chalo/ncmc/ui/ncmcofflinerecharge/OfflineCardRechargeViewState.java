package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import defpackage.cb0;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.t10;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OfflineCardRechargeViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OfflineRechargeScreenType f6399a;
    public final NcmcCardRechargeConfigAppModel b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final Long g;
    public final String h;
    public final Long i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final List r;
    public final boolean s;
    public final String t;

    public OfflineCardRechargeViewState(OfflineRechargeScreenType screenType, NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel, String str, String str2, Long l, String str3, Long l2, String str4, Long l3, boolean z, boolean z2, boolean z3, boolean z4, String str5, String enteredAmount, boolean z5, boolean z6, List tncList, boolean z7, String str6) {
        Intrinsics.i(screenType, "screenType");
        Intrinsics.i(enteredAmount, "enteredAmount");
        Intrinsics.i(tncList, "tncList");
        this.f6399a = screenType;
        this.b = ncmcCardRechargeConfigAppModel;
        this.c = str;
        this.d = str2;
        this.e = l;
        this.f = str3;
        this.g = l2;
        this.h = str4;
        this.i = l3;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = str5;
        this.o = enteredAmount;
        this.p = z5;
        this.q = z6;
        this.r = tncList;
        this.s = z7;
        this.t = str6;
    }

    public static OfflineCardRechargeViewState a(OfflineCardRechargeViewState offlineCardRechargeViewState, OfflineRechargeScreenType offlineRechargeScreenType, NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel, String str, String str2, Long l, String str3, Long l2, String str4, Long l3, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, boolean z5, boolean z6, String str7, int i) {
        OfflineRechargeScreenType screenType = (i & 1) != 0 ? offlineCardRechargeViewState.f6399a : offlineRechargeScreenType;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel2 = (i & 2) != 0 ? offlineCardRechargeViewState.b : ncmcCardRechargeConfigAppModel;
        String cardNumber = (i & 4) != 0 ? offlineCardRechargeViewState.c : str;
        String kitNumber = (i & 8) != 0 ? offlineCardRechargeViewState.d : str2;
        Long l4 = (i & 16) != 0 ? offlineCardRechargeViewState.e : l;
        String str8 = (i & 32) != 0 ? offlineCardRechargeViewState.f : str3;
        Long l5 = (i & 64) != 0 ? offlineCardRechargeViewState.g : l2;
        String str9 = (i & 128) != 0 ? offlineCardRechargeViewState.h : str4;
        Long l6 = (i & 256) != 0 ? offlineCardRechargeViewState.i : l3;
        boolean z7 = (i & 512) != 0 ? offlineCardRechargeViewState.j : z;
        boolean z8 = (i & 1024) != 0 ? offlineCardRechargeViewState.k : z2;
        boolean z9 = (i & 2048) != 0 ? offlineCardRechargeViewState.l : z3;
        boolean z10 = (i & 4096) != 0 ? offlineCardRechargeViewState.m : z4;
        String str10 = (i & 8192) != 0 ? offlineCardRechargeViewState.n : str5;
        String enteredAmount = (i & 16384) != 0 ? offlineCardRechargeViewState.o : str6;
        offlineCardRechargeViewState.getClass();
        boolean z11 = (65536 & i) != 0 ? offlineCardRechargeViewState.p : z5;
        boolean z12 = (131072 & i) != 0 ? offlineCardRechargeViewState.q : false;
        List tncList = offlineCardRechargeViewState.r;
        boolean z13 = (i & 524288) != 0 ? offlineCardRechargeViewState.s : z6;
        String str11 = (i & 1048576) != 0 ? offlineCardRechargeViewState.t : str7;
        offlineCardRechargeViewState.getClass();
        Intrinsics.i(screenType, "screenType");
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(kitNumber, "kitNumber");
        Intrinsics.i(enteredAmount, "enteredAmount");
        Intrinsics.i(tncList, "tncList");
        return new OfflineCardRechargeViewState(screenType, ncmcCardRechargeConfigAppModel2, cardNumber, kitNumber, l4, str8, l5, str9, l6, z7, z8, z9, z10, str10, enteredAmount, z11, z12, tncList, z13, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineCardRechargeViewState)) {
            return false;
        }
        OfflineCardRechargeViewState offlineCardRechargeViewState = (OfflineCardRechargeViewState) obj;
        return this.f6399a == offlineCardRechargeViewState.f6399a && Intrinsics.d(this.b, offlineCardRechargeViewState.b) && Intrinsics.d(this.c, offlineCardRechargeViewState.c) && Intrinsics.d(this.d, offlineCardRechargeViewState.d) && Intrinsics.d(this.e, offlineCardRechargeViewState.e) && Intrinsics.d(this.f, offlineCardRechargeViewState.f) && Intrinsics.d(this.g, offlineCardRechargeViewState.g) && Intrinsics.d(this.h, offlineCardRechargeViewState.h) && Intrinsics.d(this.i, offlineCardRechargeViewState.i) && this.j == offlineCardRechargeViewState.j && this.k == offlineCardRechargeViewState.k && this.l == offlineCardRechargeViewState.l && this.m == offlineCardRechargeViewState.m && Intrinsics.d(this.n, offlineCardRechargeViewState.n) && Intrinsics.d(this.o, offlineCardRechargeViewState.o) && this.p == offlineCardRechargeViewState.p && this.q == offlineCardRechargeViewState.q && Intrinsics.d(this.r, offlineCardRechargeViewState.r) && this.s == offlineCardRechargeViewState.s && Intrinsics.d(this.t, offlineCardRechargeViewState.t);
    }

    public final int hashCode() {
        int iHashCode = this.f6399a.hashCode() * 31;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = this.b;
        int iE = nf1.e(nf1.e((iHashCode + (ncmcCardRechargeConfigAppModel == null ? 0 : ncmcCardRechargeConfigAppModel.hashCode())) * 31, 31, this.c), 31, this.d);
        Long l = this.e;
        int iHashCode2 = (iE + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode6 = (((((((((iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237)) * 31;
        String str3 = this.n;
        int iB = (r30.b((((nf1.e((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 961, this.o) + (this.p ? 1231 : 1237)) * 31) + (this.q ? 1231 : 1237)) * 31, 31, this.r) + (this.s ? 1231 : 1237)) * 31;
        String str4 = this.t;
        return iB + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineCardRechargeViewState(screenType=");
        sb.append(this.f6399a);
        sb.append(", rechargeConfig=");
        sb.append(this.b);
        sb.append(", cardNumber=");
        cb0.t(sb, this.c, ", kitNumber=", this.d, ", onlineBalance=");
        py.t(this.e, ", onlineBalanceFormatted=", this.f, ", minRechargeAmount=", sb);
        py.t(this.g, ", minRechargeAmountFormatted=", this.h, ", maxRechargeAmount=", sb);
        sb.append(this.i);
        sb.append(", showLoadingDialog=");
        sb.append(this.j);
        sb.append(", showBalanceFetchLoadingShimmer=");
        z40.r(sb, this.k, ", balanceFetchFailed=", this.l, ", enableContinueBtn=");
        pk0.x(", enteredAmountError=", this.n, ", enteredAmount=", sb, this.m);
        t10.s(this.o, ", enteredAmountInSubcurrency=null, isUvikTapAvailable=", ", showTncDialog=", sb, this.p);
        hq0.w(sb, this.q, ", tncList=", this.r, ", showErrorSnackbar=");
        sb.append(this.s);
        sb.append(", snackbarErrorMsg=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }

    public OfflineCardRechargeViewState(int i) {
        this(OfflineRechargeScreenType.ENTER_AMOUNT, null, "", "", (i & 16) != 0 ? null : 1000L, null, (i & 64) != 0 ? null : 50L, null, null, false, false, false, false, (i & 8192) == 0 ? "Invalid amount, should be less than balance" : null, (i & 16384) != 0 ? "" : "100", false, false, EmptyList.f17557a, false, null);
    }
}
