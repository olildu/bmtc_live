package app.chalo.checkout.utility;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/utility/UpiIntentData;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpiIntentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1632a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public UpiIntentData(String str, String currency, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.i(currency, "currency");
        this.f1632a = str;
        this.b = currency;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpiIntentData)) {
            return false;
        }
        UpiIntentData upiIntentData = (UpiIntentData) obj;
        return Intrinsics.d(this.f1632a, upiIntentData.f1632a) && Intrinsics.d(this.b, upiIntentData.b) && Intrinsics.d(this.c, upiIntentData.c) && Intrinsics.d(this.d, upiIntentData.d) && Intrinsics.d(this.e, upiIntentData.e) && Intrinsics.d(this.f, upiIntentData.f) && Intrinsics.d(this.g, upiIntentData.g);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f1632a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UpiIntentData(amount=", this.f1632a, ", currency=", this.b, ", merchantName=");
        cb0.t(sbE, this.c, ", merchantVpa=", this.d, ", merchantCategoryCode=");
        cb0.t(sbE, this.e, ", transactionRefNumber=", this.f, ", transactionNotes=");
        return vo1.p(sbE, this.g, ")");
    }
}
