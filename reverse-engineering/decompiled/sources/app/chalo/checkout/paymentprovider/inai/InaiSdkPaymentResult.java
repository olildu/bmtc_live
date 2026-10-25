package app.chalo.checkout.paymentprovider.inai;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/inai/InaiSdkPaymentResult;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InaiSdkPaymentResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1412a;
    public final InaiSdkPaymentStatus b;

    public InaiSdkPaymentResult(LinkedHashMap linkedHashMap, InaiSdkPaymentStatus status) {
        Intrinsics.i(status, "status");
        this.f1412a = linkedHashMap;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InaiSdkPaymentResult)) {
            return false;
        }
        InaiSdkPaymentResult inaiSdkPaymentResult = (InaiSdkPaymentResult) obj;
        return this.f1412a.equals(inaiSdkPaymentResult.f1412a) && this.b == inaiSdkPaymentResult.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1412a.hashCode() * 31);
    }

    public final String toString() {
        return "InaiSdkPaymentResult(data=" + this.f1412a + ", status=" + this.b + ")";
    }
}
