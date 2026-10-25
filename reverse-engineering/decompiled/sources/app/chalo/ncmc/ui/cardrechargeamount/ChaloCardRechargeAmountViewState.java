package app.chalo.ncmc.ui.cardrechargeamount;

import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardRechargeAmountViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCardRechargeAmountFlowType f6308a;
    public final ChaloCardRechargeConfigAppModel b;
    public final ChaloCardDetails c;
    public final String d;
    public final String e;
    public final List f;
    public final long g;
    public final String h;
    public final String i;
    public final CardRechargeAmountLayoutType j;
    public final CardRechargeAmountErrorType k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final boolean s;
    public final List t;

    public ChaloCardRechargeAmountViewState(ChaloCardRechargeAmountFlowType flowType, ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, ChaloCardDetails chaloCardDetails, String str, String maskedCardNumber, List suggestedAmountsList, long j, String enteredAmountString, String currencySymbol, CardRechargeAmountLayoutType cardRechargeAmountLayoutType, CardRechargeAmountErrorType cardRechargeAmountErrorType, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, boolean z3, List tncList) {
        Intrinsics.i(flowType, "flowType");
        Intrinsics.i(maskedCardNumber, "maskedCardNumber");
        Intrinsics.i(suggestedAmountsList, "suggestedAmountsList");
        Intrinsics.i(enteredAmountString, "enteredAmountString");
        Intrinsics.i(currencySymbol, "currencySymbol");
        Intrinsics.i(cardRechargeAmountLayoutType, "cardRechargeAmountLayoutType");
        Intrinsics.i(cardRechargeAmountErrorType, "cardRechargeAmountErrorType");
        Intrinsics.i(tncList, "tncList");
        this.f6308a = flowType;
        this.b = chaloCardRechargeConfigAppModel;
        this.c = chaloCardDetails;
        this.d = str;
        this.e = maskedCardNumber;
        this.f = suggestedAmountsList;
        this.g = j;
        this.h = enteredAmountString;
        this.i = currencySymbol;
        this.j = cardRechargeAmountLayoutType;
        this.k = cardRechargeAmountErrorType;
        this.l = z;
        this.m = z2;
        this.n = str2;
        this.o = str3;
        this.p = str4;
        this.q = str5;
        this.r = str6;
        this.s = z3;
        this.t = tncList;
    }

    public static ChaloCardRechargeAmountViewState a(ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState, ChaloCardRechargeAmountFlowType chaloCardRechargeAmountFlowType, ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, ChaloCardDetails chaloCardDetails, String str, String str2, long j, String str3, String str4, CardRechargeAmountLayoutType cardRechargeAmountLayoutType, CardRechargeAmountErrorType cardRechargeAmountErrorType, boolean z, boolean z2, String str5, String str6, String str7, String str8, String str9, boolean z3, List list, int i) {
        ChaloCardRechargeAmountFlowType flowType = (i & 1) != 0 ? chaloCardRechargeAmountViewState.f6308a : chaloCardRechargeAmountFlowType;
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel2 = (i & 2) != 0 ? chaloCardRechargeAmountViewState.b : chaloCardRechargeConfigAppModel;
        ChaloCardDetails chaloCardDetails2 = (i & 4) != 0 ? chaloCardRechargeAmountViewState.c : chaloCardDetails;
        String cardNumber = (i & 8) != 0 ? chaloCardRechargeAmountViewState.d : str;
        String maskedCardNumber = (i & 16) != 0 ? chaloCardRechargeAmountViewState.e : str2;
        List suggestedAmountsList = chaloCardRechargeAmountViewState.f;
        long j2 = (i & 64) != 0 ? chaloCardRechargeAmountViewState.g : j;
        String enteredAmountString = (i & 128) != 0 ? chaloCardRechargeAmountViewState.h : str3;
        String currencySymbol = (i & 256) != 0 ? chaloCardRechargeAmountViewState.i : str4;
        CardRechargeAmountLayoutType cardRechargeAmountLayoutType2 = (i & 512) != 0 ? chaloCardRechargeAmountViewState.j : cardRechargeAmountLayoutType;
        CardRechargeAmountErrorType cardRechargeAmountErrorType2 = (i & 1024) != 0 ? chaloCardRechargeAmountViewState.k : cardRechargeAmountErrorType;
        boolean z4 = (i & 2048) != 0 ? chaloCardRechargeAmountViewState.l : z;
        boolean z5 = (i & 4096) != 0 ? chaloCardRechargeAmountViewState.m : z2;
        chaloCardRechargeAmountViewState.getClass();
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel3 = chaloCardRechargeConfigAppModel2;
        String str10 = (i & 16384) != 0 ? chaloCardRechargeAmountViewState.n : str5;
        String sampleTitle = (i & 32768) != 0 ? chaloCardRechargeAmountViewState.o : str6;
        String str11 = str10;
        String sampleSubtitle = (i & 65536) != 0 ? chaloCardRechargeAmountViewState.p : str7;
        ChaloCardDetails chaloCardDetails3 = chaloCardDetails2;
        String sampleReceiptUrl = (i & 131072) != 0 ? chaloCardRechargeAmountViewState.q : str8;
        long j3 = j2;
        String transactionId = (i & 262144) != 0 ? chaloCardRechargeAmountViewState.r : str9;
        boolean z6 = (i & 524288) != 0 ? chaloCardRechargeAmountViewState.s : z3;
        List tncList = (i & 1048576) != 0 ? chaloCardRechargeAmountViewState.t : list;
        chaloCardRechargeAmountViewState.getClass();
        Intrinsics.i(flowType, "flowType");
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(maskedCardNumber, "maskedCardNumber");
        Intrinsics.i(suggestedAmountsList, "suggestedAmountsList");
        Intrinsics.i(enteredAmountString, "enteredAmountString");
        Intrinsics.i(currencySymbol, "currencySymbol");
        Intrinsics.i(cardRechargeAmountLayoutType2, "cardRechargeAmountLayoutType");
        Intrinsics.i(cardRechargeAmountErrorType2, "cardRechargeAmountErrorType");
        Intrinsics.i(sampleTitle, "sampleTitle");
        Intrinsics.i(sampleSubtitle, "sampleSubtitle");
        Intrinsics.i(sampleReceiptUrl, "sampleReceiptUrl");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(tncList, "tncList");
        return new ChaloCardRechargeAmountViewState(flowType, chaloCardRechargeConfigAppModel3, chaloCardDetails3, cardNumber, maskedCardNumber, suggestedAmountsList, j3, enteredAmountString, currencySymbol, cardRechargeAmountLayoutType2, cardRechargeAmountErrorType2, z4, z5, str11, sampleTitle, sampleSubtitle, sampleReceiptUrl, transactionId, z6, tncList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardRechargeAmountViewState)) {
            return false;
        }
        ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState = (ChaloCardRechargeAmountViewState) obj;
        return Intrinsics.d(this.f6308a, chaloCardRechargeAmountViewState.f6308a) && Intrinsics.d(this.b, chaloCardRechargeAmountViewState.b) && Intrinsics.d(this.c, chaloCardRechargeAmountViewState.c) && Intrinsics.d(this.d, chaloCardRechargeAmountViewState.d) && Intrinsics.d(this.e, chaloCardRechargeAmountViewState.e) && Intrinsics.d(this.f, chaloCardRechargeAmountViewState.f) && this.g == chaloCardRechargeAmountViewState.g && Intrinsics.d(this.h, chaloCardRechargeAmountViewState.h) && Intrinsics.d(this.i, chaloCardRechargeAmountViewState.i) && Intrinsics.d(this.j, chaloCardRechargeAmountViewState.j) && Intrinsics.d(this.k, chaloCardRechargeAmountViewState.k) && this.l == chaloCardRechargeAmountViewState.l && this.m == chaloCardRechargeAmountViewState.m && Intrinsics.d(this.n, chaloCardRechargeAmountViewState.n) && Intrinsics.d(this.o, chaloCardRechargeAmountViewState.o) && Intrinsics.d(this.p, chaloCardRechargeAmountViewState.p) && Intrinsics.d(this.q, chaloCardRechargeAmountViewState.q) && Intrinsics.d(this.r, chaloCardRechargeAmountViewState.r) && this.s == chaloCardRechargeAmountViewState.s && Intrinsics.d(this.t, chaloCardRechargeAmountViewState.t);
    }

    public final int hashCode() {
        int iHashCode = this.f6308a.hashCode() * 31;
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = this.b;
        int iHashCode2 = (iHashCode + (chaloCardRechargeConfigAppModel == null ? 0 : chaloCardRechargeConfigAppModel.hashCode())) * 31;
        ChaloCardDetails chaloCardDetails = this.c;
        int iB = r30.b(nf1.e(nf1.e((iHashCode2 + (chaloCardDetails == null ? 0 : chaloCardDetails.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        long j = this.g;
        int iHashCode3 = (((((((this.k.hashCode() + ((this.j.hashCode() + nf1.e(nf1.e((iB + ((int) (j ^ (j >>> 32)))) * 31, 31, this.h), 31, this.i)) * 31)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237)) * 31) + 1237) * 31;
        String str = this.n;
        return this.t.hashCode() + ((nf1.e(nf1.e(nf1.e(nf1.e((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r) + (this.s ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCardRechargeAmountViewState(flowType=");
        sb.append(this.f6308a);
        sb.append(", chaloCardRechargeConfigAppModel=");
        sb.append(this.b);
        sb.append(", chaloCardDetails=");
        sb.append(this.c);
        sb.append(", cardNumber=");
        sb.append(this.d);
        sb.append(", maskedCardNumber=");
        pk0.w(this.e, ", suggestedAmountsList=", ", enteredAmountInSubcurrency=", sb, this.f);
        dd.k(this.g, ", enteredAmountString=", this.h, sb);
        sb.append(", currencySymbol=");
        sb.append(this.i);
        sb.append(", cardRechargeAmountLayoutType=");
        sb.append(this.j);
        sb.append(", cardRechargeAmountErrorType=");
        sb.append(this.k);
        sb.append(", isProceedBtnEnabled=");
        sb.append(this.l);
        sb.append(", shouldShowLoadingDialog=");
        sb.append(this.m);
        sb.append(", showFullScreenLoader=false, minimumRequiredAmountFormatted=");
        sb.append(this.n);
        cb0.t(sb, ", sampleTitle=", this.o, ", sampleSubtitle=", this.p);
        cb0.t(sb, ", sampleReceiptUrl=", this.q, ", transactionId=", this.r);
        sb.append(", showTncDialog=");
        sb.append(this.s);
        sb.append(", tncList=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChaloCardRechargeAmountViewState(List list, CardRechargeAmountLayoutType.ErrorLayout errorLayout, int i) {
        String str;
        ChaloCardRechargeAmountFlowType.Unknown unknown = ChaloCardRechargeAmountFlowType.Unknown.INSTANCE;
        String str2 = (i & 16) != 0 ? "" : "43 ** ** 65";
        List list2 = (i & 32) != 0 ? EmptyList.f17557a : list;
        long j = (i & 64) != 0 ? 0L : 40L;
        if ((i & 256) != 0) {
            str = "";
        } else {
            str = "Rs";
        }
        this(unknown, null, null, "", str2, list2, j, "", str, (i & 512) != 0 ? CardRechargeAmountLayoutType.FullScreenLoadingLayout.f6287a : errorLayout, CardRechargeAmountErrorType.NoError.f6284a, false, false, null, "", "", "", "", false, EmptyList.f17557a);
    }
}
