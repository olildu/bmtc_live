package app.chalo.checkout.data.model.app.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/app/request/PaymentStatusRequestAppModel;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentStatusRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1339a;
    public final String b;
    public final String c;
    public final String d;

    public PaymentStatusRequestAppModel(String orderId, String chaloOrderId, String str, String str2) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(chaloOrderId, "chaloOrderId");
        this.f1339a = orderId;
        this.b = chaloOrderId;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentStatusRequestAppModel)) {
            return false;
        }
        PaymentStatusRequestAppModel paymentStatusRequestAppModel = (PaymentStatusRequestAppModel) obj;
        return Intrinsics.d(this.f1339a, paymentStatusRequestAppModel.f1339a) && Intrinsics.d(this.b, paymentStatusRequestAppModel.b) && Intrinsics.d(this.c, paymentStatusRequestAppModel.c) && Intrinsics.d(this.d, paymentStatusRequestAppModel.d);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1339a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return r30.i(dd.e("PaymentStatusRequestAppModel(orderId=", this.f1339a, ", chaloOrderId=", this.b, ", transactionId="), this.c, ", instrumentName=", this.d, ")");
    }
}
