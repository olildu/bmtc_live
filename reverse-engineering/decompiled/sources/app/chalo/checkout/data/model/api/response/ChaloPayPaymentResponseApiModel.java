package app.chalo.checkout.data.model.api.response;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/api/response/ChaloPayPaymentResponseApiModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloPayPaymentResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1254a;
    public final Integer b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/api/response/ChaloPayPaymentResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/api/response/ChaloPayPaymentResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloPayPaymentResponseApiModel> serializer() {
            return ChaloPayPaymentResponseApiModel$$serializer.f1255a;
        }
    }

    public /* synthetic */ ChaloPayPaymentResponseApiModel(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ChaloPayPaymentResponseApiModel$$serializer.f1255a.getDescriptor(), i, 7);
            throw null;
        }
        this.f1254a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayPaymentResponseApiModel)) {
            return false;
        }
        ChaloPayPaymentResponseApiModel chaloPayPaymentResponseApiModel = (ChaloPayPaymentResponseApiModel) obj;
        return Intrinsics.d(this.f1254a, chaloPayPaymentResponseApiModel.f1254a) && Intrinsics.d(this.b, chaloPayPaymentResponseApiModel.b) && Intrinsics.d(this.c, chaloPayPaymentResponseApiModel.c);
    }

    public final int hashCode() {
        String str = this.f1254a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloPayPaymentResponseApiModel(paymentId=");
        sb.append(this.f1254a);
        sb.append(", balance=");
        sb.append(this.b);
        sb.append(", status=");
        return vo1.p(sb, this.c, ")");
    }
}
