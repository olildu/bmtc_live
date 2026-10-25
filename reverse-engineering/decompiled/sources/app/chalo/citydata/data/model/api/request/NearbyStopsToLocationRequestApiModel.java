package app.chalo.citydata.data.model.api.request;

import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/NearbyStopsToLocationRequestApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NearbyStopsToLocationRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1638a;
    public final double b;
    public final double c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/NearbyStopsToLocationRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/request/NearbyStopsToLocationRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NearbyStopsToLocationRequestApiModel> serializer() {
            return NearbyStopsToLocationRequestApiModel$$serializer.f1639a;
        }
    }

    public /* synthetic */ NearbyStopsToLocationRequestApiModel(int i, String str, double d, double d2, String str2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(NearbyStopsToLocationRequestApiModel$$serializer.f1639a.getDescriptor(), i, 15);
            throw null;
        }
        this.f1638a = str;
        this.b = d;
        this.c = d2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopsToLocationRequestApiModel)) {
            return false;
        }
        NearbyStopsToLocationRequestApiModel nearbyStopsToLocationRequestApiModel = (NearbyStopsToLocationRequestApiModel) obj;
        return Intrinsics.d(this.f1638a, nearbyStopsToLocationRequestApiModel.f1638a) && Double.compare(this.b, nearbyStopsToLocationRequestApiModel.b) == 0 && Double.compare(this.c, nearbyStopsToLocationRequestApiModel.c) == 0 && Intrinsics.d(this.d, nearbyStopsToLocationRequestApiModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f1638a.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.c);
        return this.d.hashCode() + ((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyStopsToLocationRequestApiModel(cityId=");
        sb.append(this.f1638a);
        sb.append(", latitude=");
        sb.append(this.b);
        pk0.z(sb, ", longitude=", this.c, ", transitMode=");
        return vo1.p(sb, this.d, ")");
    }

    public NearbyStopsToLocationRequestApiModel(String cityId, double d, double d2, String transitMode) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(transitMode, "transitMode");
        this.f1638a = cityId;
        this.b = d;
        this.c = d2;
        this.d = transitMode;
    }
}
