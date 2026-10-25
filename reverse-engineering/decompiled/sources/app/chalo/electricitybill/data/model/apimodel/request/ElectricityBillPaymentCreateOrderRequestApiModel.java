package app.chalo.electricitybill.data.model.apimodel.request;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/request/ElectricityBillPaymentCreateOrderRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ElectricityBillPaymentCreateOrderRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2528a;
    public final int b;
    public final String c;
    public final String d;
    public final PaymentProps e;
    public final EbillProps f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/request/ElectricityBillPaymentCreateOrderRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/electricitybill/data/model/apimodel/request/ElectricityBillPaymentCreateOrderRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ElectricityBillPaymentCreateOrderRequestApiModel> serializer() {
            return ElectricityBillPaymentCreateOrderRequestApiModel$$serializer.f2529a;
        }
    }

    public /* synthetic */ ElectricityBillPaymentCreateOrderRequestApiModel(int i, String str, int i2, String str2, String str3, PaymentProps paymentProps, EbillProps ebillProps) {
        if (47 != (i & 47)) {
            PluginExceptionsKt.b(ElectricityBillPaymentCreateOrderRequestApiModel$$serializer.f2529a.getDescriptor(), i, 47);
            throw null;
        }
        this.f2528a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = new PaymentProps();
        } else {
            this.e = paymentProps;
        }
        this.f = ebillProps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityBillPaymentCreateOrderRequestApiModel)) {
            return false;
        }
        ElectricityBillPaymentCreateOrderRequestApiModel electricityBillPaymentCreateOrderRequestApiModel = (ElectricityBillPaymentCreateOrderRequestApiModel) obj;
        return Intrinsics.d(this.f2528a, electricityBillPaymentCreateOrderRequestApiModel.f2528a) && this.b == electricityBillPaymentCreateOrderRequestApiModel.b && Intrinsics.d(this.c, electricityBillPaymentCreateOrderRequestApiModel.c) && Intrinsics.d(this.d, electricityBillPaymentCreateOrderRequestApiModel.d) && Intrinsics.d(this.e, electricityBillPaymentCreateOrderRequestApiModel.e) && Intrinsics.d(this.f, electricityBillPaymentCreateOrderRequestApiModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + nf1.e(nf1.e(((this.f2528a.hashCode() * 31) + this.b) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "ElectricityBillPaymentCreateOrderRequestApiModel(cityId=", this.f2528a, ", appVer=", ", deviceId=");
        cb0.t(sbM, this.c, ", userId=", this.d, ", paymentProps=");
        sbM.append(this.e);
        sbM.append(", billProps=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }

    public ElectricityBillPaymentCreateOrderRequestApiModel(String cityId, int i, String deviceId, String userId, EbillProps ebillProps) {
        PaymentProps paymentProps = new PaymentProps();
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(deviceId, "deviceId");
        Intrinsics.i(userId, "userId");
        this.f2528a = cityId;
        this.b = i;
        this.c = deviceId;
        this.d = userId;
        this.e = paymentProps;
        this.f = ebillProps;
    }
}
