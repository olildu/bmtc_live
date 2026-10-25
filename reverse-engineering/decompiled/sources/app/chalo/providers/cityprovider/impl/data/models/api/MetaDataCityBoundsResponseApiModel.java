package app.chalo.providers.cityprovider.impl.data.models.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityBoundsResponseApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetaDataCityBoundsResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f8840a;
    public final Double b;
    public final Double c;
    public final Double d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityBoundsResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityBoundsResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetaDataCityBoundsResponseApiModel> serializer() {
            return MetaDataCityBoundsResponseApiModel$$serializer.f8841a;
        }
    }

    public /* synthetic */ MetaDataCityBoundsResponseApiModel(int i, Double d, Double d2, Double d3, Double d4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(MetaDataCityBoundsResponseApiModel$$serializer.f8841a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8840a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaDataCityBoundsResponseApiModel)) {
            return false;
        }
        MetaDataCityBoundsResponseApiModel metaDataCityBoundsResponseApiModel = (MetaDataCityBoundsResponseApiModel) obj;
        return Intrinsics.d(this.f8840a, metaDataCityBoundsResponseApiModel.f8840a) && Intrinsics.d(this.b, metaDataCityBoundsResponseApiModel.b) && Intrinsics.d(this.c, metaDataCityBoundsResponseApiModel.c) && Intrinsics.d(this.d, metaDataCityBoundsResponseApiModel.d);
    }

    public final int hashCode() {
        Double d = this.f8840a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        return "MetaDataCityBoundsResponseApiModel(southWestLat=" + this.f8840a + ", southWestLon=" + this.b + ", northEastLat=" + this.c + ", northEastLon=" + this.d + ")";
    }
}
