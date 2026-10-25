package app.chalo.productbooking.common.data.models.api.request;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/FetchCompleteProductConfigApiRequestModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FetchCompleteProductConfigApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8104a;
    public final String b;
    public final String c;
    public final CompleteProductConfigFilterRequestModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/FetchCompleteProductConfigApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/request/FetchCompleteProductConfigApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FetchCompleteProductConfigApiRequestModel> serializer() {
            return FetchCompleteProductConfigApiRequestModel$$serializer.f8105a;
        }
    }

    public /* synthetic */ FetchCompleteProductConfigApiRequestModel(int i, String str, String str2, String str3, CompleteProductConfigFilterRequestModel completeProductConfigFilterRequestModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(FetchCompleteProductConfigApiRequestModel$$serializer.f8105a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8104a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = completeProductConfigFilterRequestModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchCompleteProductConfigApiRequestModel)) {
            return false;
        }
        FetchCompleteProductConfigApiRequestModel fetchCompleteProductConfigApiRequestModel = (FetchCompleteProductConfigApiRequestModel) obj;
        return Intrinsics.d(this.f8104a, fetchCompleteProductConfigApiRequestModel.f8104a) && Intrinsics.d(this.b, fetchCompleteProductConfigApiRequestModel.b) && Intrinsics.d(this.c, fetchCompleteProductConfigApiRequestModel.c) && Intrinsics.d(this.d, fetchCompleteProductConfigApiRequestModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f8104a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CompleteProductConfigFilterRequestModel completeProductConfigFilterRequestModel = this.d;
        return iHashCode3 + (completeProductConfigFilterRequestModel != null ? completeProductConfigFilterRequestModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("FetchCompleteProductConfigApiRequestModel(configId=", this.f8104a, ", userAcquisitionChannel=", this.b, ", userCampaign=");
        sbE.append(this.c);
        sbE.append(", filters=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public FetchCompleteProductConfigApiRequestModel(String configId, String str, String str2, CompleteProductConfigFilterRequestModel completeProductConfigFilterRequestModel) {
        Intrinsics.i(configId, "configId");
        this.f8104a = configId;
        this.b = str;
        this.c = str2;
        this.d = completeProductConfigFilterRequestModel;
    }
}
