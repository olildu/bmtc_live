package app.chalo.citydata.data.model.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/TrafficSignalApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TrafficSignalApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1701a;
    public final double b;
    public final double c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/TrafficSignalApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/TrafficSignalApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TrafficSignalApiModel> serializer() {
            return TrafficSignalApiModel$$serializer.f1702a;
        }
    }

    public /* synthetic */ TrafficSignalApiModel(int i, String str, double d, double d2) {
        this.f1701a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = -1.0d;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = -1.0d;
        } else {
            this.c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficSignalApiModel)) {
            return false;
        }
        TrafficSignalApiModel trafficSignalApiModel = (TrafficSignalApiModel) obj;
        return Intrinsics.d(this.f1701a, trafficSignalApiModel.f1701a) && Double.compare(this.b, trafficSignalApiModel.b) == 0 && Double.compare(this.c, trafficSignalApiModel.c) == 0;
    }

    public final int hashCode() {
        String str = this.f1701a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        int i = ((iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.c);
        return i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "TrafficSignalApiModel(name=" + this.f1701a + ", lat=" + this.b + ", lon=" + this.c + ")";
    }
}
