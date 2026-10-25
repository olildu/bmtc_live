package app.chalo.kyc.min.data.models.apimodels;

import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/kyc/min/data/models/apimodels/MinKycSubmitDataResponseApiModel;", "", "Companion", "$serializer", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MinKycSubmitDataResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4100a;
    public final Integer b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/data/models/apimodels/MinKycSubmitDataResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/kyc/min/data/models/apimodels/MinKycSubmitDataResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MinKycSubmitDataResponseApiModel> serializer() {
            return MinKycSubmitDataResponseApiModel$$serializer.f4101a;
        }
    }

    public /* synthetic */ MinKycSubmitDataResponseApiModel(int i, String str, Integer num, String str2, String str3, int i2, long j) {
        if (61 != (i & 61)) {
            PluginExceptionsKt.b(MinKycSubmitDataResponseApiModel$$serializer.f4101a.getDescriptor(), i, 61);
            throw null;
        }
        this.f4100a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycSubmitDataResponseApiModel)) {
            return false;
        }
        MinKycSubmitDataResponseApiModel minKycSubmitDataResponseApiModel = (MinKycSubmitDataResponseApiModel) obj;
        return Intrinsics.d(this.f4100a, minKycSubmitDataResponseApiModel.f4100a) && Intrinsics.d(this.b, minKycSubmitDataResponseApiModel.b) && Intrinsics.d(this.c, minKycSubmitDataResponseApiModel.c) && Intrinsics.d(this.d, minKycSubmitDataResponseApiModel.d) && this.e == minKycSubmitDataResponseApiModel.e && this.f == minKycSubmitDataResponseApiModel.f;
    }

    public final int hashCode() {
        int iHashCode = this.f4100a.hashCode() * 31;
        Integer num = this.b;
        int iE = (nf1.e(nf1.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d) + this.e) * 31;
        long j = this.f;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinKycSubmitDataResponseApiModel(userId=");
        sb.append(this.f4100a);
        sb.append(", walletStatus=");
        sb.append(this.b);
        sb.append(", status=");
        cb0.t(sb, this.c, ", walletId=", this.d, ", balance=");
        sb.append(this.e);
        sb.append(", remainingLoadLimit=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
