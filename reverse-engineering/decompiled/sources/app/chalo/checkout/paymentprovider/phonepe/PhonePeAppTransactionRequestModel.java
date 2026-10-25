package app.chalo.checkout.paymentprovider.phonepe;

import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PhonePeAppTransactionRequestModel;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PhonePeAppTransactionRequestModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1417a;
    public final String b;
    public final String c;
    public final SelectedPaymentInstrumentData d;

    public PhonePeAppTransactionRequestModel(String merchantId, String orderId, String token, SelectedPaymentInstrumentData paymentData) {
        Intrinsics.i(merchantId, "merchantId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(token, "token");
        Intrinsics.i(paymentData, "paymentData");
        this.f1417a = merchantId;
        this.b = orderId;
        this.c = token;
        this.d = paymentData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonePeAppTransactionRequestModel)) {
            return false;
        }
        PhonePeAppTransactionRequestModel phonePeAppTransactionRequestModel = (PhonePeAppTransactionRequestModel) obj;
        return Intrinsics.d(this.f1417a, phonePeAppTransactionRequestModel.f1417a) && Intrinsics.d(this.b, phonePeAppTransactionRequestModel.b) && Intrinsics.d(this.c, phonePeAppTransactionRequestModel.c) && Intrinsics.d(this.d, phonePeAppTransactionRequestModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f1417a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PhonePeAppTransactionRequestModel(merchantId=", this.f1417a, ", orderId=", this.b, ", token=");
        sbE.append(this.c);
        sbE.append(", paymentData=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
