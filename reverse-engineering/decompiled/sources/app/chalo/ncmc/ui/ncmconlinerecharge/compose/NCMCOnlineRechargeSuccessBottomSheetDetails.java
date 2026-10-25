package app.chalo.ncmc.ui.ncmconlinerecharge.compose;

import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeIntent;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/compose/NCMCOnlineRechargeSuccessBottomSheetDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NCMCOnlineRechargeSuccessBottomSheetDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6417a;
    public final String b;
    public final String c;
    public final NCMCOnlineRechargeIntent d;
    public final String e;
    public final NCMCOnlineRechargeIntent f;

    public NCMCOnlineRechargeSuccessBottomSheetDetails(String title, String str, String positiveBtnText, NCMCOnlineRechargeIntent nCMCOnlineRechargeIntent, String str2, NCMCOnlineRechargeIntent.RechargeSuccessBottomSheetCancelCtaClicked rechargeSuccessBottomSheetCancelCtaClicked) {
        Intrinsics.i(title, "title");
        Intrinsics.i(positiveBtnText, "positiveBtnText");
        this.f6417a = title;
        this.b = str;
        this.c = positiveBtnText;
        this.d = nCMCOnlineRechargeIntent;
        this.e = str2;
        this.f = rechargeSuccessBottomSheetCancelCtaClicked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NCMCOnlineRechargeSuccessBottomSheetDetails)) {
            return false;
        }
        NCMCOnlineRechargeSuccessBottomSheetDetails nCMCOnlineRechargeSuccessBottomSheetDetails = (NCMCOnlineRechargeSuccessBottomSheetDetails) obj;
        return Intrinsics.d(this.f6417a, nCMCOnlineRechargeSuccessBottomSheetDetails.f6417a) && Intrinsics.d(this.b, nCMCOnlineRechargeSuccessBottomSheetDetails.b) && Intrinsics.d(this.c, nCMCOnlineRechargeSuccessBottomSheetDetails.c) && Intrinsics.d(this.d, nCMCOnlineRechargeSuccessBottomSheetDetails.d) && Intrinsics.d(this.e, nCMCOnlineRechargeSuccessBottomSheetDetails.e) && Intrinsics.d(this.f, nCMCOnlineRechargeSuccessBottomSheetDetails.f);
    }

    public final int hashCode() {
        int iHashCode = this.f6417a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.d.hashCode() + nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NCMCOnlineRechargeIntent nCMCOnlineRechargeIntent = this.f;
        return iHashCode3 + (nCMCOnlineRechargeIntent != null ? nCMCOnlineRechargeIntent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NCMCOnlineRechargeSuccessBottomSheetDetails(title=", this.f6417a, ", subText=", this.b, ", positiveBtnText=");
        sbE.append(this.c);
        sbE.append(", positiveBtnIntent=");
        sbE.append(this.d);
        sbE.append(", negativeBtnText=");
        sbE.append(this.e);
        sbE.append(", negativeBtnIntent=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
