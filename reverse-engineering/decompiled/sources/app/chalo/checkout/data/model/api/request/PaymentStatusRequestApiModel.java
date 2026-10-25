package app.chalo.checkout.data.model.api.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/api/request/PaymentStatusRequestApiModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PaymentStatusRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1250a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/api/request/PaymentStatusRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/api/request/PaymentStatusRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PaymentStatusRequestApiModel> serializer() {
            return PaymentStatusRequestApiModel$$serializer.f1251a;
        }
    }

    public /* synthetic */ PaymentStatusRequestApiModel(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(PaymentStatusRequestApiModel$$serializer.f1251a.getDescriptor(), i, 3);
            throw null;
        }
        this.f1250a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentStatusRequestApiModel)) {
            return false;
        }
        PaymentStatusRequestApiModel paymentStatusRequestApiModel = (PaymentStatusRequestApiModel) obj;
        return Intrinsics.d(this.f1250a, paymentStatusRequestApiModel.f1250a) && Intrinsics.d(this.b, paymentStatusRequestApiModel.b) && Intrinsics.d(this.c, paymentStatusRequestApiModel.c) && Intrinsics.d(this.d, paymentStatusRequestApiModel.d);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1250a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return r30.i(dd.e("PaymentStatusRequestApiModel(orderId=", this.f1250a, ", chaloOrderId=", this.b, ", paymentId="), this.c, ", paymentApp=", this.d, ")");
    }

    public PaymentStatusRequestApiModel(String orderId, String chaloOrderId, String str, String str2) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(chaloOrderId, "chaloOrderId");
        this.f1250a = orderId;
        this.b = chaloOrderId;
        this.c = str;
        this.d = str2;
    }
}
