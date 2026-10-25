package app.chalo.kyc.min.data.models.requestapimodels;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/kyc/min/data/models/requestapimodels/MinKycSubmitDataRequestApiModelWithOTP;", "", "Companion", "$serializer", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MinKycSubmitDataRequestApiModelWithOTP {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4104a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/data/models/requestapimodels/MinKycSubmitDataRequestApiModelWithOTP$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/kyc/min/data/models/requestapimodels/MinKycSubmitDataRequestApiModelWithOTP;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MinKycSubmitDataRequestApiModelWithOTP> serializer() {
            return MinKycSubmitDataRequestApiModelWithOTP$$serializer.f4105a;
        }
    }

    public /* synthetic */ MinKycSubmitDataRequestApiModelWithOTP(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(MinKycSubmitDataRequestApiModelWithOTP$$serializer.f4105a.getDescriptor(), i, 63);
            throw null;
        }
        this.f4104a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycSubmitDataRequestApiModelWithOTP)) {
            return false;
        }
        MinKycSubmitDataRequestApiModelWithOTP minKycSubmitDataRequestApiModelWithOTP = (MinKycSubmitDataRequestApiModelWithOTP) obj;
        return Intrinsics.d(this.f4104a, minKycSubmitDataRequestApiModelWithOTP.f4104a) && Intrinsics.d(this.b, minKycSubmitDataRequestApiModelWithOTP.b) && Intrinsics.d(this.c, minKycSubmitDataRequestApiModelWithOTP.c) && Intrinsics.d(this.d, minKycSubmitDataRequestApiModelWithOTP.d) && Intrinsics.d(this.e, minKycSubmitDataRequestApiModelWithOTP.e) && Intrinsics.d(this.f, minKycSubmitDataRequestApiModelWithOTP.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(this.f4104a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MinKycSubmitDataRequestApiModelWithOTP(userId=", this.f4104a, ", phoneNo=", this.b, ", city=");
        cb0.t(sbE, this.c, ", referenceNum=", this.d, ", otp=");
        return r30.i(sbE, this.e, ", userName=", this.f, ")");
    }

    public MinKycSubmitDataRequestApiModelWithOTP(String userId, String phoneNo, String city, String referenceNum, String otp, String userName) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(phoneNo, "phoneNo");
        Intrinsics.i(city, "city");
        Intrinsics.i(referenceNum, "referenceNum");
        Intrinsics.i(otp, "otp");
        Intrinsics.i(userName, "userName");
        this.f4104a = userId;
        this.b = phoneNo;
        this.c = city;
        this.d = referenceNum;
        this.e = otp;
        this.f = userName;
    }
}
