package app.chalo.kyc.min.data.models.apimodels;

import defpackage.cb0;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/kyc/min/data/models/apimodels/MinKycRegisterApiModel;", "", "Companion", "$serializer", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MinKycRegisterApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4098a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/data/models/apimodels/MinKycRegisterApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/kyc/min/data/models/apimodels/MinKycRegisterApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MinKycRegisterApiModel> serializer() {
            return MinKycRegisterApiModel$$serializer.f4099a;
        }
    }

    public /* synthetic */ MinKycRegisterApiModel(int i, String str, String str2, String str3, String str4, String str5, Integer num) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(MinKycRegisterApiModel$$serializer.f4099a.getDescriptor(), i, 1);
            throw null;
        }
        this.f4098a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
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
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycRegisterApiModel)) {
            return false;
        }
        MinKycRegisterApiModel minKycRegisterApiModel = (MinKycRegisterApiModel) obj;
        return Intrinsics.d(this.f4098a, minKycRegisterApiModel.f4098a) && Intrinsics.d(this.b, minKycRegisterApiModel.b) && Intrinsics.d(this.c, minKycRegisterApiModel.c) && Intrinsics.d(this.d, minKycRegisterApiModel.d) && Intrinsics.d(this.e, minKycRegisterApiModel.e) && Intrinsics.d(this.f, minKycRegisterApiModel.f);
    }

    public final int hashCode() {
        int iHashCode = this.f4098a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MinKycRegisterApiModel(status=", this.f4098a, ", userId=", this.b, ", referenceNum=");
        cb0.t(sbE, this.c, ", message=", this.d, ", walletId=");
        sbE.append(this.e);
        sbE.append(", walletStatus=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
