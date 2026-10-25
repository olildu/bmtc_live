package app.chalo.geoquery.data.models.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoApiResponseModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GeoQueryBusInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeoQueryBusInfoSessionApiResponseModel f2807a;
    public final GeoQueryBusInfoParametersApiResponseModel b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GeoQueryBusInfoApiResponseModel> serializer() {
            return GeoQueryBusInfoApiResponseModel$$serializer.f2808a;
        }
    }

    public /* synthetic */ GeoQueryBusInfoApiResponseModel(int i, GeoQueryBusInfoSessionApiResponseModel geoQueryBusInfoSessionApiResponseModel, GeoQueryBusInfoParametersApiResponseModel geoQueryBusInfoParametersApiResponseModel) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(GeoQueryBusInfoApiResponseModel$$serializer.f2808a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2807a = geoQueryBusInfoSessionApiResponseModel;
        this.b = geoQueryBusInfoParametersApiResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryBusInfoApiResponseModel)) {
            return false;
        }
        GeoQueryBusInfoApiResponseModel geoQueryBusInfoApiResponseModel = (GeoQueryBusInfoApiResponseModel) obj;
        return Intrinsics.d(this.f2807a, geoQueryBusInfoApiResponseModel.f2807a) && Intrinsics.d(this.b, geoQueryBusInfoApiResponseModel.b);
    }

    public final int hashCode() {
        GeoQueryBusInfoSessionApiResponseModel geoQueryBusInfoSessionApiResponseModel = this.f2807a;
        int iHashCode = (geoQueryBusInfoSessionApiResponseModel == null ? 0 : geoQueryBusInfoSessionApiResponseModel.hashCode()) * 31;
        GeoQueryBusInfoParametersApiResponseModel geoQueryBusInfoParametersApiResponseModel = this.b;
        return iHashCode + (geoQueryBusInfoParametersApiResponseModel != null ? geoQueryBusInfoParametersApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        return "GeoQueryBusInfoApiResponseModel(session=" + this.f2807a + ", parameters=" + this.b + ")";
    }
}
