package app.chalo.validationsdk.blevalidation.data.models.api;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/FetchProductPunchDataForActivationApiResponseModel;", "", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FetchProductPunchDataForActivationApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10485a;
    public final String b;
    public final String c;
    public final PunchInfo d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/FetchProductPunchDataForActivationApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/FetchProductPunchDataForActivationApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FetchProductPunchDataForActivationApiResponseModel> serializer() {
            return FetchProductPunchDataForActivationApiResponseModel$$serializer.f10486a;
        }
    }

    public /* synthetic */ FetchProductPunchDataForActivationApiResponseModel(int i, String str, String str2, String str3, PunchInfo punchInfo) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(FetchProductPunchDataForActivationApiResponseModel$$serializer.f10486a.getDescriptor(), i, 15);
            throw null;
        }
        this.f10485a = str;
        this.b = str2;
        this.c = str3;
        this.d = punchInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchProductPunchDataForActivationApiResponseModel)) {
            return false;
        }
        FetchProductPunchDataForActivationApiResponseModel fetchProductPunchDataForActivationApiResponseModel = (FetchProductPunchDataForActivationApiResponseModel) obj;
        return Intrinsics.d(this.f10485a, fetchProductPunchDataForActivationApiResponseModel.f10485a) && Intrinsics.d(this.b, fetchProductPunchDataForActivationApiResponseModel.b) && Intrinsics.d(this.c, fetchProductPunchDataForActivationApiResponseModel.c) && Intrinsics.d(this.d, fetchProductPunchDataForActivationApiResponseModel.d);
    }

    public final int hashCode() {
        String str = this.f10485a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PunchInfo punchInfo = this.d;
        return iHashCode3 + (punchInfo != null ? punchInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("FetchProductPunchDataForActivationApiResponseModel(validationType=", this.f10485a, ", productType=", this.b, ", productSubType=");
        sbE.append(this.c);
        sbE.append(", punchInfo=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
