package app.chalo.citydata.repository.local.room.entity;

import defpackage.i71;
import defpackage.t10;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntityTimeTableWithFrequencyModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteEntityTimeTableWithFrequencyModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1790a;
    public final long b;
    public final long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntityTimeTableWithFrequencyModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/RouteEntityTimeTableWithFrequencyModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteEntityTimeTableWithFrequencyModel> serializer() {
            return RouteEntityTimeTableWithFrequencyModel$$serializer.f1791a;
        }
    }

    public /* synthetic */ RouteEntityTimeTableWithFrequencyModel(int i, long j, long j2, long j3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(RouteEntityTimeTableWithFrequencyModel$$serializer.f1791a.getDescriptor(), i, 7);
            throw null;
        }
        this.f1790a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteEntityTimeTableWithFrequencyModel)) {
            return false;
        }
        RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel = (RouteEntityTimeTableWithFrequencyModel) obj;
        return this.f1790a == routeEntityTimeTableWithFrequencyModel.f1790a && this.b == routeEntityTimeTableWithFrequencyModel.b && this.c == routeEntityTimeTableWithFrequencyModel.c;
    }

    public final int hashCode() {
        long j = this.f1790a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f1790a, "RouteEntityTimeTableWithFrequencyModel(startTime=", ", endTime=");
        sbG.append(this.b);
        return t10.g(this.c, ", frequency=", ")", sbG);
    }

    public RouteEntityTimeTableWithFrequencyModel(long j, long j2, long j3) {
        this.f1790a = j;
        this.b = j2;
        this.c = j3;
    }
}
