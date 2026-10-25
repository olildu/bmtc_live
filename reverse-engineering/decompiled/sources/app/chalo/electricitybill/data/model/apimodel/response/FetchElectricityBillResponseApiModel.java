package app.chalo.electricitybill.data.model.apimodel.response;

import defpackage.cb0;
import defpackage.i71;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/response/FetchElectricityBillResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FetchElectricityBillResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2536a;
    public final long b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final int f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/response/FetchElectricityBillResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/electricitybill/data/model/apimodel/response/FetchElectricityBillResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FetchElectricityBillResponseApiModel> serializer() {
            return FetchElectricityBillResponseApiModel$$serializer.f2537a;
        }
    }

    public /* synthetic */ FetchElectricityBillResponseApiModel(int i, long j, long j2, Boolean bool, String str, String str2, int i2) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(FetchElectricityBillResponseApiModel$$serializer.f2537a.getDescriptor(), i, 63);
            throw null;
        }
        this.f2536a = j;
        this.b = j2;
        this.c = bool;
        this.d = str;
        this.e = str2;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchElectricityBillResponseApiModel)) {
            return false;
        }
        FetchElectricityBillResponseApiModel fetchElectricityBillResponseApiModel = (FetchElectricityBillResponseApiModel) obj;
        return this.f2536a == fetchElectricityBillResponseApiModel.f2536a && this.b == fetchElectricityBillResponseApiModel.b && Intrinsics.d(this.c, fetchElectricityBillResponseApiModel.c) && Intrinsics.d(this.d, fetchElectricityBillResponseApiModel.d) && Intrinsics.d(this.e, fetchElectricityBillResponseApiModel.e) && this.f == fetchElectricityBillResponseApiModel.f;
    }

    public final int hashCode() {
        long j = this.f2536a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Boolean bool = this.c;
        return nf1.e(nf1.e((i + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31, this.e) + this.f;
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f2536a, "FetchElectricityBillResponseApiModel(billDate=", ", dueDate=");
        sbG.append(this.b);
        sbG.append(", isPaymentDone=");
        sbG.append(this.c);
        cb0.t(sbG, ", accountNo=", this.d, ", customerName=", this.e);
        return t10.k(sbG, ", totalBillAmount=", this.f, ")");
    }
}
