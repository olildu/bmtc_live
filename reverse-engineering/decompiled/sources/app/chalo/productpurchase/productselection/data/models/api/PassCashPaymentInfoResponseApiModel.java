package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassCashPaymentInfoResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassCashPaymentInfoResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8595a;
    public final String b;
    public final Double c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassCashPaymentInfoResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/PassCashPaymentInfoResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassCashPaymentInfoResponseApiModel> serializer() {
            return PassCashPaymentInfoResponseApiModel$$serializer.f8596a;
        }
    }

    public /* synthetic */ PassCashPaymentInfoResponseApiModel(int i, String str, String str2, Double d) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PassCashPaymentInfoResponseApiModel$$serializer.f8596a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8595a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassCashPaymentInfoResponseApiModel)) {
            return false;
        }
        PassCashPaymentInfoResponseApiModel passCashPaymentInfoResponseApiModel = (PassCashPaymentInfoResponseApiModel) obj;
        return Intrinsics.d(this.f8595a, passCashPaymentInfoResponseApiModel.f8595a) && Intrinsics.d(this.b, passCashPaymentInfoResponseApiModel.b) && Intrinsics.d(this.c, passCashPaymentInfoResponseApiModel.c);
    }

    public final int hashCode() {
        String str = this.f8595a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassCashPaymentInfoResponseApiModel(userId=", this.f8595a, ", referenceId=", this.b, ", amount=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
