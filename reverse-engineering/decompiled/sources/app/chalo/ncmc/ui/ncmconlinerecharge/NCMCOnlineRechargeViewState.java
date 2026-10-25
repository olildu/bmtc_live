package app.chalo.ncmc.ui.ncmconlinerecharge;

import app.chalo.constants.Source;
import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NCMCOnlineRechargeViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f6413a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Long h;
    public final List i;
    public final Long j;
    public final String k;
    public final long l;
    public final boolean m;
    public final List n;
    public final String o;
    public final String p;
    public final NcmcOnlineRechargeSuccessBottomSheetType q;

    public NCMCOnlineRechargeViewState(Source source, boolean z, boolean z2, String currentlyEnteredAmountString, String str, String str2, Long l, Long l2, List suggestedAmountsDenominations, Long l3, String minimumRechargeAmountFormatted, long j, boolean z3, List tncList, String str3, String str4, NcmcOnlineRechargeSuccessBottomSheetType rechargeSuccessBottomSheetType) {
        Intrinsics.i(source, "source");
        Intrinsics.i(currentlyEnteredAmountString, "currentlyEnteredAmountString");
        Intrinsics.i(suggestedAmountsDenominations, "suggestedAmountsDenominations");
        Intrinsics.i(minimumRechargeAmountFormatted, "minimumRechargeAmountFormatted");
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(rechargeSuccessBottomSheetType, "rechargeSuccessBottomSheetType");
        this.f6413a = source;
        this.b = z;
        this.c = z2;
        this.d = currentlyEnteredAmountString;
        this.e = str;
        this.f = str2;
        this.g = l;
        this.h = l2;
        this.i = suggestedAmountsDenominations;
        this.j = l3;
        this.k = minimumRechargeAmountFormatted;
        this.l = j;
        this.m = z3;
        this.n = tncList;
        this.o = str3;
        this.p = str4;
        this.q = rechargeSuccessBottomSheetType;
    }

    public static NCMCOnlineRechargeViewState a(NCMCOnlineRechargeViewState nCMCOnlineRechargeViewState, Source source, boolean z, boolean z2, String str, String str2, String str3, Long l, Long l2, List list, String str4, long j, String str5, String str6, NcmcOnlineRechargeSuccessBottomSheetType ncmcOnlineRechargeSuccessBottomSheetType, int i) {
        Source source2 = (i & 1) != 0 ? nCMCOnlineRechargeViewState.f6413a : source;
        boolean z3 = (i & 2) != 0 ? nCMCOnlineRechargeViewState.b : z;
        boolean z4 = (i & 4) != 0 ? nCMCOnlineRechargeViewState.c : z2;
        String currentlyEnteredAmountString = (i & 8) != 0 ? nCMCOnlineRechargeViewState.d : str;
        String str7 = (i & 16) != 0 ? nCMCOnlineRechargeViewState.e : str2;
        String str8 = (i & 32) != 0 ? nCMCOnlineRechargeViewState.f : str3;
        Long l3 = (i & 64) != 0 ? nCMCOnlineRechargeViewState.g : l;
        Long l4 = (i & 128) != 0 ? nCMCOnlineRechargeViewState.h : l2;
        List suggestedAmountsDenominations = (i & 256) != 0 ? nCMCOnlineRechargeViewState.i : list;
        Long l5 = nCMCOnlineRechargeViewState.j;
        String minimumRechargeAmountFormatted = (i & 1024) != 0 ? nCMCOnlineRechargeViewState.k : str4;
        long j2 = (i & 2048) != 0 ? nCMCOnlineRechargeViewState.l : j;
        boolean z5 = (i & 4096) != 0 ? nCMCOnlineRechargeViewState.m : false;
        List tncList = nCMCOnlineRechargeViewState.n;
        String str9 = (i & 16384) != 0 ? nCMCOnlineRechargeViewState.o : str5;
        String str10 = (32768 & i) != 0 ? nCMCOnlineRechargeViewState.p : str6;
        NcmcOnlineRechargeSuccessBottomSheetType rechargeSuccessBottomSheetType = (i & 65536) != 0 ? nCMCOnlineRechargeViewState.q : ncmcOnlineRechargeSuccessBottomSheetType;
        nCMCOnlineRechargeViewState.getClass();
        Intrinsics.i(source2, "source");
        Intrinsics.i(currentlyEnteredAmountString, "currentlyEnteredAmountString");
        Intrinsics.i(suggestedAmountsDenominations, "suggestedAmountsDenominations");
        Intrinsics.i(minimumRechargeAmountFormatted, "minimumRechargeAmountFormatted");
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(rechargeSuccessBottomSheetType, "rechargeSuccessBottomSheetType");
        return new NCMCOnlineRechargeViewState(source2, z3, z4, currentlyEnteredAmountString, str7, str8, l3, l4, suggestedAmountsDenominations, l5, minimumRechargeAmountFormatted, j2, z5, tncList, str9, str10, rechargeSuccessBottomSheetType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NCMCOnlineRechargeViewState)) {
            return false;
        }
        NCMCOnlineRechargeViewState nCMCOnlineRechargeViewState = (NCMCOnlineRechargeViewState) obj;
        return this.f6413a == nCMCOnlineRechargeViewState.f6413a && this.b == nCMCOnlineRechargeViewState.b && this.c == nCMCOnlineRechargeViewState.c && Intrinsics.d(this.d, nCMCOnlineRechargeViewState.d) && Intrinsics.d(this.e, nCMCOnlineRechargeViewState.e) && Intrinsics.d(this.f, nCMCOnlineRechargeViewState.f) && Intrinsics.d(this.g, nCMCOnlineRechargeViewState.g) && Intrinsics.d(this.h, nCMCOnlineRechargeViewState.h) && Intrinsics.d(this.i, nCMCOnlineRechargeViewState.i) && Intrinsics.d(this.j, nCMCOnlineRechargeViewState.j) && Intrinsics.d(this.k, nCMCOnlineRechargeViewState.k) && this.l == nCMCOnlineRechargeViewState.l && this.m == nCMCOnlineRechargeViewState.m && Intrinsics.d(this.n, nCMCOnlineRechargeViewState.n) && Intrinsics.d(this.o, nCMCOnlineRechargeViewState.o) && Intrinsics.d(this.p, nCMCOnlineRechargeViewState.p) && this.q == nCMCOnlineRechargeViewState.q;
    }

    public final int hashCode() {
        int iE = nf1.e(((((this.f6413a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.g;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        int iB = r30.b((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.i);
        Long l3 = this.j;
        int iE2 = nf1.e((iB + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.k);
        long j = this.l;
        int iB2 = r30.b((((iE2 + ((int) (j ^ (j >>> 32)))) * 31) + (this.m ? 1231 : 1237)) * 31, 31, this.n);
        String str3 = this.o;
        int iHashCode4 = (iB2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        return this.q.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NCMCOnlineRechargeViewState(source=");
        sb.append(this.f6413a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isNextBtnEnabled=");
        pk0.x(", currentlyEnteredAmountString=", this.d, ", enteredAmountError=", sb, this.c);
        cb0.t(sb, this.e, ", formattedRechargedAmount=", this.f, ", onlineRechargeBalance=");
        nf1.w(sb, this.g, ", amountInSubcurrency=", this.h, ", suggestedAmountsDenominations=");
        sb.append(this.i);
        sb.append(", minimumRechargeAmount=");
        sb.append(this.j);
        sb.append(", minimumRechargeAmountFormatted=");
        n21.p(this.l, this.k, ", loadLimitAmount=", sb);
        sb.append(", showTncDialog=");
        sb.append(this.m);
        sb.append(", tncList=");
        sb.append(this.n);
        cb0.t(sb, ", cardNo=", this.o, ", kitNo=", this.p);
        sb.append(", rechargeSuccessBottomSheetType=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NCMCOnlineRechargeViewState(int i) {
        String str;
        Source source = Source.UNKNOWN;
        boolean z = (i & 4) == 0;
        String str2 = (i & 16) != 0 ? null : "some error";
        EmptyList emptyList = EmptyList.f17557a;
        Long l = (i & 512) != 0 ? null : 10L;
        if ((i & 1024) != 0) {
            str = "";
        } else {
            str = "10";
        }
        this(source, false, z, "", str2, null, null, null, emptyList, l, str, 1700000L, false, emptyList, null, null, NcmcOnlineRechargeSuccessBottomSheetType.UNDEFINED);
    }
}
