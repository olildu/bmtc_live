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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/NearbyRoutesRequestBody;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NearbyRoutesRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1636a;
    public final RoutesDataRequestLocationApiModel b;
    public final Integer c;
    public final Integer d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/NearbyRoutesRequestBody$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/request/NearbyRoutesRequestBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NearbyRoutesRequestBody> serializer() {
            return NearbyRoutesRequestBody$$serializer.f1637a;
        }
    }

    public /* synthetic */ NearbyRoutesRequestBody(int i, String str, RoutesDataRequestLocationApiModel routesDataRequestLocationApiModel, Integer num, Integer num2, String str2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(NearbyRoutesRequestBody$$serializer.f1637a.getDescriptor(), i, 31);
            throw null;
        }
        this.f1636a = str;
        this.b = routesDataRequestLocationApiModel;
        this.c = num;
        this.d = num2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRoutesRequestBody)) {
            return false;
        }
        NearbyRoutesRequestBody nearbyRoutesRequestBody = (NearbyRoutesRequestBody) obj;
        return Intrinsics.d(this.f1636a, nearbyRoutesRequestBody.f1636a) && Intrinsics.d(this.b, nearbyRoutesRequestBody.b) && Intrinsics.d(this.c, nearbyRoutesRequestBody.c) && Intrinsics.d(this.d, nearbyRoutesRequestBody.d) && Intrinsics.d(this.e, nearbyRoutesRequestBody.e);
    }

    public final int hashCode() {
        int iHashCode = this.f1636a.hashCode() * 31;
        RoutesDataRequestLocationApiModel routesDataRequestLocationApiModel = this.b;
        int iHashCode2 = (iHashCode + (routesDataRequestLocationApiModel == null ? 0 : routesDataRequestLocationApiModel.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyRoutesRequestBody(serviceType=");
        sb.append(this.f1636a);
        sb.append(", location=");
        sb.append(this.b);
        sb.append(", radius=");
        pk0.y(sb, this.c, ", numberOfResults=", this.d, ", day=");
        return vo1.p(sb, this.e, ")");
    }
}
