package app.chalo.checkout.ui.screen.payment;

import defpackage.cb0;
import defpackage.d;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import defpackage.z40;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentDataState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1530a;
    public final boolean b;
    public final FullScreenErrorDetails c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean j;
    public final PaymentBottomSheetType k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final List p;
    public final boolean q;
    public final Map r;
    public final boolean s;
    public final String t;

    public PaymentDataState(String str, boolean z, FullScreenErrorDetails fullScreenErrorDetails, boolean z2, String str2, String str3, boolean z3, String str4, String str5, boolean z4, PaymentBottomSheetType paymentBottomSheetType, List checkoutScreenUiItemList, boolean z5, boolean z6, boolean z7, List inAppUpiItemList, boolean z8, Map map, boolean z9, String str6) {
        Intrinsics.i(checkoutScreenUiItemList, "checkoutScreenUiItemList");
        Intrinsics.i(inAppUpiItemList, "inAppUpiItemList");
        this.f1530a = str;
        this.b = z;
        this.c = fullScreenErrorDetails;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = z3;
        this.h = str4;
        this.i = str5;
        this.j = z4;
        this.k = paymentBottomSheetType;
        this.l = checkoutScreenUiItemList;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = inAppUpiItemList;
        this.q = z8;
        this.r = map;
        this.s = z9;
        this.t = str6;
    }

    public static PaymentDataState a(PaymentDataState paymentDataState, String str, boolean z, FullScreenErrorDetails fullScreenErrorDetails, boolean z2, String str2, String str3, boolean z3, String str4, String str5, PaymentBottomSheetType paymentBottomSheetType, List list, boolean z4, boolean z5, boolean z6, Map map, boolean z7, String str6, int i) {
        String str7 = (i & 1) != 0 ? paymentDataState.f1530a : str;
        boolean z8 = (i & 2) != 0 ? paymentDataState.b : z;
        FullScreenErrorDetails fullScreenErrorDetails2 = (i & 4) != 0 ? paymentDataState.c : fullScreenErrorDetails;
        boolean z9 = (i & 8) != 0 ? paymentDataState.d : z2;
        String str8 = (i & 16) != 0 ? paymentDataState.e : str2;
        String bottomsheetCTA = (i & 32) != 0 ? paymentDataState.f : str3;
        boolean z10 = (i & 64) != 0 ? paymentDataState.g : z3;
        String payableAmount = (i & 128) != 0 ? paymentDataState.h : str4;
        String walletBalance = (i & 256) != 0 ? paymentDataState.i : str5;
        boolean z11 = (i & 512) != 0 ? paymentDataState.j : true;
        PaymentBottomSheetType paymentBottomSheetType2 = (i & 1024) != 0 ? paymentDataState.k : paymentBottomSheetType;
        List checkoutScreenUiItemList = (i & 2048) != 0 ? paymentDataState.l : list;
        boolean z12 = (i & 4096) != 0 ? paymentDataState.m : z4;
        boolean z13 = (i & 8192) != 0 ? paymentDataState.n : z5;
        paymentDataState.getClass();
        boolean z14 = (32768 & i) != 0 ? paymentDataState.o : true;
        List inAppUpiItemList = paymentDataState.p;
        boolean z15 = (131072 & i) != 0 ? paymentDataState.q : z6;
        Map adTargeting = (262144 & i) != 0 ? paymentDataState.r : map;
        boolean z16 = (i & 524288) != 0 ? paymentDataState.s : z7;
        String appTncLink = (i & 1048576) != 0 ? paymentDataState.t : str6;
        paymentDataState.getClass();
        Intrinsics.i(bottomsheetCTA, "bottomsheetCTA");
        Intrinsics.i(payableAmount, "payableAmount");
        Intrinsics.i(walletBalance, "walletBalance");
        Intrinsics.i(checkoutScreenUiItemList, "checkoutScreenUiItemList");
        Intrinsics.i(inAppUpiItemList, "inAppUpiItemList");
        Intrinsics.i(adTargeting, "adTargeting");
        Intrinsics.i(appTncLink, "appTncLink");
        return new PaymentDataState(str7, z8, fullScreenErrorDetails2, z9, str8, bottomsheetCTA, z10, payableAmount, walletBalance, z11, paymentBottomSheetType2, checkoutScreenUiItemList, z12, z13, z14, inAppUpiItemList, z15, adTargeting, z16, appTncLink);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDataState)) {
            return false;
        }
        PaymentDataState paymentDataState = (PaymentDataState) obj;
        return Intrinsics.d(this.f1530a, paymentDataState.f1530a) && this.b == paymentDataState.b && Intrinsics.d(this.c, paymentDataState.c) && this.d == paymentDataState.d && Intrinsics.d(this.e, paymentDataState.e) && this.f.equals(paymentDataState.f) && this.g == paymentDataState.g && this.h.equals(paymentDataState.h) && this.i.equals(paymentDataState.i) && this.j == paymentDataState.j && Intrinsics.d(this.k, paymentDataState.k) && Intrinsics.d(this.l, paymentDataState.l) && this.m == paymentDataState.m && this.n == paymentDataState.n && this.o == paymentDataState.o && Intrinsics.d(this.p, paymentDataState.p) && this.q == paymentDataState.q && this.r.equals(paymentDataState.r) && this.s == paymentDataState.s && this.t.equals(paymentDataState.t);
    }

    public final int hashCode() {
        String str = this.f1530a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31;
        FullScreenErrorDetails fullScreenErrorDetails = this.c;
        int iHashCode2 = (((iHashCode + (fullScreenErrorDetails == null ? 0 : fullScreenErrorDetails.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str2 = this.e;
        int iE = (nf1.e(nf1.e((nf1.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f) + (this.g ? 1231 : 1237)) * 31, 31, this.h), 31, this.i) + (this.j ? 1231 : 1237)) * 31;
        PaymentBottomSheetType paymentBottomSheetType = this.k;
        return this.t.hashCode() + ((d.f(this.r, (r30.b((((((((r30.b((iE + (paymentBottomSheetType != null ? paymentBottomSheetType.hashCode() : 0)) * 31, 31, this.l) + (this.m ? 1231 : 1237)) * 31) + (this.n ? 1231 : 1237)) * 31) + 1237) * 31) + (this.o ? 1231 : 1237)) * 31, 31, this.p) + (this.q ? 1231 : 1237)) * 31, 31) + (this.s ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("PaymentDataState(toolbarTitle=", this.f1530a, ", isFullScreenLoader=", ", fullScreenError=", this.b);
        sbM.append(this.c);
        sbM.append(", showLoadingDialogue=");
        sbM.append(this.d);
        sbM.append(", errorInfo=");
        cb0.t(sbM, this.e, ", bottomsheetCTA=", this.f, ", isPaymentInProgress=");
        pk0.x(", payableAmount=", this.h, ", walletBalance=", sbM, this.g);
        t10.s(this.i, ", showSnackBarError=", ", paymentBottomSheetType=", sbM, this.j);
        sbM.append(this.k);
        sbM.append(", checkoutScreenUiItemList=");
        sbM.append(this.l);
        sbM.append(", showNoNativeUpiAppAvailableError=");
        z40.r(sbM, this.m, ", inAppUpiItemInteracted=", this.n, ", showInAppUpiShimmer=false, showUpiManagementSettings=");
        hq0.w(sbM, this.o, ", inAppUpiItemList=", this.p, ", showPermissionThroughSettingDialogue=");
        sbM.append(this.q);
        sbM.append(", adTargeting=");
        sbM.append(this.r);
        sbM.append(", isWalletClosedLoopType=");
        sbM.append(this.s);
        sbM.append(", appTncLink=");
        sbM.append(this.t);
        sbM.append(")");
        return sbM.toString();
    }
}
