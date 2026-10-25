package app.chalo.checkout.data.model.app;

import app.chalo.checkout.data.model.api.response.ChaloPaymentStatus;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/app/ChaloPayPaymentResponseAppModel;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloPayPaymentResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1275a;
    public final int b;
    public final ChaloPaymentStatus c;

    public ChaloPayPaymentResponseAppModel(String paymentId, int i, ChaloPaymentStatus status) {
        Intrinsics.i(paymentId, "paymentId");
        Intrinsics.i(status, "status");
        this.f1275a = paymentId;
        this.b = i;
        this.c = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayPaymentResponseAppModel)) {
            return false;
        }
        ChaloPayPaymentResponseAppModel chaloPayPaymentResponseAppModel = (ChaloPayPaymentResponseAppModel) obj;
        return Intrinsics.d(this.f1275a, chaloPayPaymentResponseAppModel.f1275a) && this.b == chaloPayPaymentResponseAppModel.b && this.c == chaloPayPaymentResponseAppModel.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f1275a.hashCode() * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "ChaloPayPaymentResponseAppModel(paymentId=", this.f1275a, ", balance=", ", status=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
