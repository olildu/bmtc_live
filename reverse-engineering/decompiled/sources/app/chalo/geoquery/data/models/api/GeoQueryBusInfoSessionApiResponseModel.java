package app.chalo.geoquery.data.models.api;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoSessionApiResponseModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GeoQueryBusInfoSessionApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2811a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoSessionApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoSessionApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GeoQueryBusInfoSessionApiResponseModel> serializer() {
            return GeoQueryBusInfoSessionApiResponseModel$$serializer.f2812a;
        }
    }

    public /* synthetic */ GeoQueryBusInfoSessionApiResponseModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(GeoQueryBusInfoSessionApiResponseModel$$serializer.f2812a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f2811a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryBusInfoSessionApiResponseModel)) {
            return false;
        }
        GeoQueryBusInfoSessionApiResponseModel geoQueryBusInfoSessionApiResponseModel = (GeoQueryBusInfoSessionApiResponseModel) obj;
        return Intrinsics.d(this.f2811a, geoQueryBusInfoSessionApiResponseModel.f2811a) && Intrinsics.d(this.b, geoQueryBusInfoSessionApiResponseModel.b) && Intrinsics.d(this.c, geoQueryBusInfoSessionApiResponseModel.c) && Intrinsics.d(this.d, geoQueryBusInfoSessionApiResponseModel.d) && Intrinsics.d(this.e, geoQueryBusInfoSessionApiResponseModel.e) && Intrinsics.d(this.f, geoQueryBusInfoSessionApiResponseModel.f) && Intrinsics.d(this.g, geoQueryBusInfoSessionApiResponseModel.g) && Intrinsics.d(this.h, geoQueryBusInfoSessionApiResponseModel.h) && Intrinsics.d(this.i, geoQueryBusInfoSessionApiResponseModel.i);
    }

    public final int hashCode() {
        String str = this.f2811a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GeoQueryBusInfoSessionApiResponseModel(routeId=", this.f2811a, ", agencyName=", this.b, ", vehicleId=");
        cb0.t(sbE, this.c, ", fromName=", this.d, ", toName=");
        cb0.t(sbE, this.e, ", routeName=", this.f, ", streamId=");
        cb0.t(sbE, this.g, ", operatorId=", this.h, ", mode=");
        return vo1.p(sbE, this.i, ")");
    }
}
