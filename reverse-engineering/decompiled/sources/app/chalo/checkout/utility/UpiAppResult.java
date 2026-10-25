package app.chalo.checkout.utility;

import defpackage.cb0;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/utility/UpiAppResult;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpiAppResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1631a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final String f;

    public UpiAppResult(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.f1631a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpiAppResult)) {
            return false;
        }
        UpiAppResult upiAppResult = (UpiAppResult) obj;
        return Intrinsics.d(this.f1631a, upiAppResult.f1631a) && Intrinsics.d(this.b, upiAppResult.b) && Intrinsics.d(this.c, upiAppResult.c) && Intrinsics.d(this.d, upiAppResult.d) && Intrinsics.d(this.e, upiAppResult.e) && Intrinsics.d(this.f, upiAppResult.f);
    }

    public final int hashCode() {
        String str = this.f1631a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UpiAppResult(status=", this.f1631a, ", code=", this.b, ", transactionId=");
        cb0.t(sbE, this.c, ", transactionReference=", this.d, ", isOperationCancelled=");
        sbE.append(this.e);
        sbE.append(", response=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
