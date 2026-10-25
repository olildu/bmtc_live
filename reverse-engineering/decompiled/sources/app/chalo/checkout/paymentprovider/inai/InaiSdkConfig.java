package app.chalo.checkout.paymentprovider.inai;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/inai/InaiSdkConfig;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InaiSdkConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1409a;
    public final String b;
    public final String c;

    public InaiSdkConfig(String orderId, String token, String str) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(token, "token");
        this.f1409a = orderId;
        this.b = token;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InaiSdkConfig)) {
            return false;
        }
        InaiSdkConfig inaiSdkConfig = (InaiSdkConfig) obj;
        return Intrinsics.d(this.f1409a, inaiSdkConfig.f1409a) && Intrinsics.d(this.b, inaiSdkConfig.b) && Intrinsics.d(this.c, inaiSdkConfig.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1409a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(dd.e("InaiSdkConfig(orderId=", this.f1409a, ", token=", this.b, ", countryCode="), this.c, ")");
    }
}
