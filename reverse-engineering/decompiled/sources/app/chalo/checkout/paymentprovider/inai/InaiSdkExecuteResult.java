package app.chalo.checkout.paymentprovider.inai;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/inai/InaiSdkExecuteResult;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InaiSdkExecuteResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1411a;
    public final InaiSdkExecuteStatus b;

    public InaiSdkExecuteResult(String str, InaiSdkExecuteStatus status) {
        Intrinsics.i(status, "status");
        this.f1411a = str;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InaiSdkExecuteResult)) {
            return false;
        }
        InaiSdkExecuteResult inaiSdkExecuteResult = (InaiSdkExecuteResult) obj;
        return Intrinsics.d(this.f1411a, inaiSdkExecuteResult.f1411a) && this.b == inaiSdkExecuteResult.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1411a.hashCode() * 31);
    }

    public final String toString() {
        return "InaiSdkExecuteResult(data=" + this.f1411a + ", status=" + this.b + ")";
    }
}
