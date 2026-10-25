package app.chalo.citydata.repository.local.room.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/TrafficSignalEntityModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TrafficSignalEntityModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1796a;
    public final double b;
    public final double c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/TrafficSignalEntityModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/TrafficSignalEntityModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TrafficSignalEntityModel> serializer() {
            return TrafficSignalEntityModel$$serializer.f1797a;
        }
    }

    public /* synthetic */ TrafficSignalEntityModel(int i, String str, double d, double d2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(TrafficSignalEntityModel$$serializer.f1797a.getDescriptor(), i, 7);
            throw null;
        }
        this.f1796a = str;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficSignalEntityModel)) {
            return false;
        }
        TrafficSignalEntityModel trafficSignalEntityModel = (TrafficSignalEntityModel) obj;
        return Intrinsics.d(this.f1796a, trafficSignalEntityModel.f1796a) && Double.compare(this.b, trafficSignalEntityModel.b) == 0 && Double.compare(this.c, trafficSignalEntityModel.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f1796a.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.c);
        return i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "TrafficSignalEntityModel(name=" + this.f1796a + ", lat=" + this.b + ", lon=" + this.c + ")";
    }

    public TrafficSignalEntityModel(String name, double d, double d2) {
        Intrinsics.i(name, "name");
        this.f1796a = name;
        this.b = d;
        this.c = d2;
    }
}
