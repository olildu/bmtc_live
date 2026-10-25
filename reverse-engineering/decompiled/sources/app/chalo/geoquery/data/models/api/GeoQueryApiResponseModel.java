package app.chalo.geoquery.data.models.api;

import defpackage.t40;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryApiResponseModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GeoQueryApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new t40(22)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2805a;
    public final JsonElement b;
    public final JsonElement c;
    public final JsonElement d;
    public final JsonElement e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GeoQueryApiResponseModel> serializer() {
            return GeoQueryApiResponseModel$$serializer.f2806a;
        }
    }

    public /* synthetic */ GeoQueryApiResponseModel(int i, List list, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(GeoQueryApiResponseModel$$serializer.f2806a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2805a = list;
        this.b = jsonElement;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jsonElement2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = jsonElement3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = jsonElement4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryApiResponseModel)) {
            return false;
        }
        GeoQueryApiResponseModel geoQueryApiResponseModel = (GeoQueryApiResponseModel) obj;
        return Intrinsics.d(this.f2805a, geoQueryApiResponseModel.f2805a) && Intrinsics.d(this.b, geoQueryApiResponseModel.b) && Intrinsics.d(this.c, geoQueryApiResponseModel.c) && Intrinsics.d(this.d, geoQueryApiResponseModel.d) && Intrinsics.d(this.e, geoQueryApiResponseModel.e);
    }

    public final int hashCode() {
        List list = this.f2805a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        JsonElement jsonElement = this.b;
        int iHashCode2 = (iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        JsonElement jsonElement2 = this.c;
        int iHashCode3 = (iHashCode2 + (jsonElement2 == null ? 0 : jsonElement2.hashCode())) * 31;
        JsonElement jsonElement3 = this.d;
        int iHashCode4 = (iHashCode3 + (jsonElement3 == null ? 0 : jsonElement3.hashCode())) * 31;
        JsonElement jsonElement4 = this.e;
        return iHashCode4 + (jsonElement4 != null ? jsonElement4.hashCode() : 0);
    }

    public final String toString() {
        return "GeoQueryApiResponseModel(buses=" + this.f2805a + ", reportProblemData=" + this.b + ", cityInfo=" + this.c + ", cardsInfo=" + this.d + ", bannerInfo=" + this.e + ")";
    }
}
