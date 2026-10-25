package app.chalo.citydata.data.model.api.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/NearbyRoutesRequestApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NearbyRoutesRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1634a;
    public final NearbyRoutesRequestBody b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/NearbyRoutesRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/request/NearbyRoutesRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NearbyRoutesRequestApiModel> serializer() {
            return NearbyRoutesRequestApiModel$$serializer.f1635a;
        }
    }

    public /* synthetic */ NearbyRoutesRequestApiModel(int i, String str, NearbyRoutesRequestBody nearbyRoutesRequestBody) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(NearbyRoutesRequestApiModel$$serializer.f1635a.getDescriptor(), i, 3);
            throw null;
        }
        this.f1634a = str;
        this.b = nearbyRoutesRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRoutesRequestApiModel)) {
            return false;
        }
        NearbyRoutesRequestApiModel nearbyRoutesRequestApiModel = (NearbyRoutesRequestApiModel) obj;
        return Intrinsics.d(this.f1634a, nearbyRoutesRequestApiModel.f1634a) && Intrinsics.d(this.b, nearbyRoutesRequestApiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1634a.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyRoutesRequestApiModel(cityName=" + this.f1634a + ", requestBody=" + this.b + ")";
    }
}
