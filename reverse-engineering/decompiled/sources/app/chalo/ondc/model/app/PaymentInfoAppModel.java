package app.chalo.ondc.model.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/PaymentInfoAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentInfoAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6774a;

    public PaymentInfoAppModel(String paymentId) {
        Intrinsics.i(paymentId, "paymentId");
        this.f6774a = paymentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentInfoAppModel) && Intrinsics.d(this.f6774a, ((PaymentInfoAppModel) obj).f6774a);
    }

    public final int hashCode() {
        return this.f6774a.hashCode();
    }

    public final String toString() {
        return vo1.B("PaymentInfoAppModel(paymentId=", this.f6774a, ")");
    }
}
