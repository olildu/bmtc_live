package app.chalo.citydata.repository.local.room.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RoutEntityTimingModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RoutEntityTimingModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1781a;
    public final Long b;
    public final RouteEntityTimeTableWithFrequencyModel c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RoutEntityTimingModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/RoutEntityTimingModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RoutEntityTimingModel> serializer() {
            return RoutEntityTimingModel$$serializer.f1782a;
        }
    }

    public /* synthetic */ RoutEntityTimingModel(int i, boolean z, Long l, RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel, String str) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.b(RoutEntityTimingModel$$serializer.f1782a.getDescriptor(), i, 9);
            throw null;
        }
        this.f1781a = z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = routeEntityTimeTableWithFrequencyModel;
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutEntityTimingModel)) {
            return false;
        }
        RoutEntityTimingModel routEntityTimingModel = (RoutEntityTimingModel) obj;
        return this.f1781a == routEntityTimingModel.f1781a && Intrinsics.d(this.b, routEntityTimingModel.b) && Intrinsics.d(this.c, routEntityTimingModel.c) && Intrinsics.d(this.d, routEntityTimingModel.d);
    }

    public final int hashCode() {
        int i = (this.f1781a ? 1231 : 1237) * 31;
        Long l = this.b;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel = this.c;
        return this.d.hashCode() + ((iHashCode + (routeEntityTimeTableWithFrequencyModel != null ? routeEntityTimeTableWithFrequencyModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RoutEntityTimingModel(isFrequency=" + this.f1781a + ", startTime=" + this.b + ", frequencyDetails=" + this.c + ", weekDayValidity=" + this.d + ")";
    }

    public RoutEntityTimingModel(boolean z, Long l, RouteEntityTimeTableWithFrequencyModel routeEntityTimeTableWithFrequencyModel, String weekDayValidity) {
        Intrinsics.i(weekDayValidity, "weekDayValidity");
        this.f1781a = z;
        this.b = l;
        this.c = routeEntityTimeTableWithFrequencyModel;
        this.d = weekDayValidity;
    }
}
