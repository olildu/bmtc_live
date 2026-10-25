package app.chalo.checkout.data.model.api.request;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/api/request/ChaloPayPaymentRequestApiModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloPayPaymentRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1244a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/api/request/ChaloPayPaymentRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/api/request/ChaloPayPaymentRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloPayPaymentRequestApiModel> serializer() {
            return ChaloPayPaymentRequestApiModel$$serializer.f1245a;
        }
    }

    public /* synthetic */ ChaloPayPaymentRequestApiModel(int i, int i2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(ChaloPayPaymentRequestApiModel$$serializer.f1245a.getDescriptor(), i, 31);
            throw null;
        }
        this.f1244a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayPaymentRequestApiModel)) {
            return false;
        }
        ChaloPayPaymentRequestApiModel chaloPayPaymentRequestApiModel = (ChaloPayPaymentRequestApiModel) obj;
        return Intrinsics.d(this.f1244a, chaloPayPaymentRequestApiModel.f1244a) && Intrinsics.d(this.b, chaloPayPaymentRequestApiModel.b) && Intrinsics.d(this.c, chaloPayPaymentRequestApiModel.c) && Intrinsics.d(this.d, chaloPayPaymentRequestApiModel.d) && this.e == chaloPayPaymentRequestApiModel.e;
    }

    public final int hashCode() {
        return nf1.e(nf1.e(nf1.e(this.f1244a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d) + this.e;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ChaloPayPaymentRequestApiModel(walletId=", this.f1244a, ", orderId=", this.b, ", mobileNumber=");
        cb0.t(sbE, this.c, ", countryCode=", this.d, ", amount=");
        return b3.f(")", this.e, sbE);
    }

    public ChaloPayPaymentRequestApiModel(String walletId, String orderId, String mobileNumber, String str, int i) {
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(mobileNumber, "mobileNumber");
        this.f1244a = walletId;
        this.b = orderId;
        this.c = mobileNumber;
        this.d = str;
        this.e = i;
    }
}
