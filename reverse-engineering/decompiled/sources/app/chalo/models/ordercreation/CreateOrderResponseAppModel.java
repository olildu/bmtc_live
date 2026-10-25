package app.chalo.models.ordercreation;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.sr;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/CreateOrderResponseAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CreateOrderResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sr(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5638a;
    public final String b;
    public final OrderBookingInfoAppModel c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final OrderPaymentProviderInfoAppModel h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/CreateOrderResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/CreateOrderResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CreateOrderResponseAppModel> serializer() {
            return CreateOrderResponseAppModel$$serializer.f5639a;
        }
    }

    public /* synthetic */ CreateOrderResponseAppModel(int i2, int i3, String str, OrderBookingInfoAppModel orderBookingInfoAppModel, String str2, String str3, String str4, String str5, OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel) {
        if (255 != (i2 & 255)) {
            PluginExceptionsKt.b(CreateOrderResponseAppModel$$serializer.f5639a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f5638a = i3;
        this.b = str;
        this.c = orderBookingInfoAppModel;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = orderPaymentProviderInfoAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderResponseAppModel)) {
            return false;
        }
        CreateOrderResponseAppModel createOrderResponseAppModel = (CreateOrderResponseAppModel) obj;
        return this.f5638a == createOrderResponseAppModel.f5638a && Intrinsics.d(this.b, createOrderResponseAppModel.b) && Intrinsics.d(this.c, createOrderResponseAppModel.c) && Intrinsics.d(this.d, createOrderResponseAppModel.d) && Intrinsics.d(this.e, createOrderResponseAppModel.e) && Intrinsics.d(this.f, createOrderResponseAppModel.f) && Intrinsics.d(this.g, createOrderResponseAppModel.g) && Intrinsics.d(this.h, createOrderResponseAppModel.h);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5638a * 31, 31, this.b);
        OrderBookingInfoAppModel orderBookingInfoAppModel = this.c;
        return this.h.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e((iE + (orderBookingInfoAppModel == null ? 0 : orderBookingInfoAppModel.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f5638a, "CreateOrderResponseAppModel(amount=", ", transactionId=", this.b, ", bookingInfo=");
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

    public CreateOrderResponseAppModel(int i2, String transactionId, OrderBookingInfoAppModel orderBookingInfoAppModel, String currency, String countryId, String orderId, String chaloOrderId, OrderPaymentProviderInfoAppModel paymentProviderInfo) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(currency, "currency");
        Intrinsics.i(countryId, "countryId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(chaloOrderId, "chaloOrderId");
        Intrinsics.i(paymentProviderInfo, "paymentProviderInfo");
        this.f5638a = i2;
        this.b = transactionId;
        this.c = orderBookingInfoAppModel;
        this.d = currency;
        this.e = countryId;
        this.f = orderId;
        this.g = chaloOrderId;
        this.h = paymentProviderInfo;
    }
}
