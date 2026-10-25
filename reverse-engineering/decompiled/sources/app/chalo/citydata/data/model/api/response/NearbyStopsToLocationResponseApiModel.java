package app.chalo.citydata.data.model.api.response;

import defpackage.cb0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/NearbyStopsToLocationResponseApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NearbyStopsToLocationResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f1666a;
    public final String b;
    public final Double c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/NearbyStopsToLocationResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/NearbyStopsToLocationResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NearbyStopsToLocationResponseApiModel> serializer() {
            return NearbyStopsToLocationResponseApiModel$$serializer.f1667a;
        }
    }

    public /* synthetic */ NearbyStopsToLocationResponseApiModel(int i, Double d, String str, Double d2, String str2, String str3, String str4, Integer num) {
        if ((i & 1) == 0) {
            this.f1666a = null;
        } else {
            this.f1666a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopsToLocationResponseApiModel)) {
            return false;
        }
        NearbyStopsToLocationResponseApiModel nearbyStopsToLocationResponseApiModel = (NearbyStopsToLocationResponseApiModel) obj;
        return Intrinsics.d(this.f1666a, nearbyStopsToLocationResponseApiModel.f1666a) && Intrinsics.d(this.b, nearbyStopsToLocationResponseApiModel.b) && Intrinsics.d(this.c, nearbyStopsToLocationResponseApiModel.c) && Intrinsics.d(this.d, nearbyStopsToLocationResponseApiModel.d) && Intrinsics.d(this.e, nearbyStopsToLocationResponseApiModel.e) && Intrinsics.d(this.f, nearbyStopsToLocationResponseApiModel.f) && Intrinsics.d(this.g, nearbyStopsToLocationResponseApiModel.g);
    }

    public final int hashCode() {
        Double d = this.f1666a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyStopsToLocationResponseApiModel(stopLon=");
        sb.append(this.f1666a);
        sb.append(", stopId=");
        sb.append(this.b);
        sb.append(", stopLat=");
        sb.append(this.c);
        sb.append(", stopAddress=");
        sb.append(this.d);
        sb.append(", stationType=");
        cb0.t(sb, this.e, ", stopName=", this.f, ", distance=");
        return pk0.k(sb, this.g, ")");
    }
}
