package app.chalo.geoquery.data.models.api;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoParametersApiResponseModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GeoQueryBusInfoParametersApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2809a;
    public final Double b;
    public final Double c;
    public final Long d;
    public final String e;
    public final Integer f;
    public final Boolean g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoParametersApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoParametersApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GeoQueryBusInfoParametersApiResponseModel> serializer() {
            return GeoQueryBusInfoParametersApiResponseModel$$serializer.f2810a;
        }
    }

    public /* synthetic */ GeoQueryBusInfoParametersApiResponseModel(int i, String str, Double d, Double d2, Long l, String str2, Integer num, Boolean bool, String str3) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(GeoQueryBusInfoParametersApiResponseModel$$serializer.f2810a.getDescriptor(), i, 255);
            throw null;
        }
        this.f2809a = str;
        this.b = d;
        this.c = d2;
        this.d = l;
        this.e = str2;
        this.f = num;
        this.g = bool;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryBusInfoParametersApiResponseModel)) {
            return false;
        }
        GeoQueryBusInfoParametersApiResponseModel geoQueryBusInfoParametersApiResponseModel = (GeoQueryBusInfoParametersApiResponseModel) obj;
        return Intrinsics.d(this.f2809a, geoQueryBusInfoParametersApiResponseModel.f2809a) && Intrinsics.d(this.b, geoQueryBusInfoParametersApiResponseModel.b) && Intrinsics.d(this.c, geoQueryBusInfoParametersApiResponseModel.c) && Intrinsics.d(this.d, geoQueryBusInfoParametersApiResponseModel.d) && Intrinsics.d(this.e, geoQueryBusInfoParametersApiResponseModel.e) && Intrinsics.d(this.f, geoQueryBusInfoParametersApiResponseModel.f) && Intrinsics.d(this.g, geoQueryBusInfoParametersApiResponseModel.g) && Intrinsics.d(this.h, geoQueryBusInfoParametersApiResponseModel.h);
    }

    public final int hashCode() {
        String str = this.f2809a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoQueryBusInfoParametersApiResponseModel(nextStopId=");
        sb.append(this.f2809a);
        sb.append(", lat=");
        sb.append(this.b);
        sb.append(", lon=");
        sb.append(this.c);
        sb.append(", time=");
        sb.append(this.d);
        sb.append(", nextStopName=");
        xs.u(this.f, this.e, ", nextStopEta=", ", isHalted=", sb);
        sb.append(this.g);
        sb.append(", via=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
