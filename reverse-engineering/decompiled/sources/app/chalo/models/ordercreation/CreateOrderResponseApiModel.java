package app.chalo.models.ordercreation;

import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/CreateOrderResponseApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CreateOrderResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5635a;
    public final String b;
    public final OrderBookingInfo c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final OrderPaymentProviderInfo h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/CreateOrderResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/CreateOrderResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CreateOrderResponseApiModel> serializer() {
            return CreateOrderResponseApiModel$$serializer.f5636a;
        }
    }

    public /* synthetic */ CreateOrderResponseApiModel(int i, int i2, String str, OrderBookingInfo orderBookingInfo, String str2, String str3, String str4, String str5, OrderPaymentProviderInfo orderPaymentProviderInfo) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(CreateOrderResponseApiModel$$serializer.f5636a.getDescriptor(), i, 255);
            throw null;
        }
        this.f5635a = i2;
        this.b = str;
        this.c = orderBookingInfo;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = orderPaymentProviderInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderResponseApiModel)) {
            return false;
        }
        CreateOrderResponseApiModel createOrderResponseApiModel = (CreateOrderResponseApiModel) obj;
        return this.f5635a == createOrderResponseApiModel.f5635a && Intrinsics.d(this.b, createOrderResponseApiModel.b) && Intrinsics.d(this.c, createOrderResponseApiModel.c) && Intrinsics.d(this.d, createOrderResponseApiModel.d) && Intrinsics.d(this.e, createOrderResponseApiModel.e) && Intrinsics.d(this.f, createOrderResponseApiModel.f) && Intrinsics.d(this.g, createOrderResponseApiModel.g) && Intrinsics.d(this.h, createOrderResponseApiModel.h);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5635a * 31, 31, this.b);
        OrderBookingInfo orderBookingInfo = this.c;
        return this.h.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e((iE + (orderBookingInfo == null ? 0 : orderBookingInfo.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f5635a, "CreateOrderResponseApiModel(amount=", ", bookingId=", this.b, ", bookingInfo=");
        sbP.append(this.c);
        sbP.append(", currency=");
        sbP.append(this.d);
        sbP.append(", countryId=");
        cb0.t(sbP, this.e, ", orderId=", this.f, ", chaloOrderId=");
        sbP.append(this.g);
        sbP.append(", paymentProviderInfo=");
        sbP.append(this.h);
        sbP.append(")");
        return sbP.toString();
    }
}
