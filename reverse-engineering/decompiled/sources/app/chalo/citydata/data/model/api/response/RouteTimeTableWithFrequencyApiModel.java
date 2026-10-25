package app.chalo.citydata.data.model.api.response;

import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteTimeTableWithFrequencyApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteTimeTableWithFrequencyApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1686a;
    public final Integer b;
    public final Integer c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteTimeTableWithFrequencyApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/RouteTimeTableWithFrequencyApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteTimeTableWithFrequencyApiModel> serializer() {
            return RouteTimeTableWithFrequencyApiModel$$serializer.f1687a;
        }
    }

    public /* synthetic */ RouteTimeTableWithFrequencyApiModel(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f1686a = null;
        } else {
            this.f1686a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteTimeTableWithFrequencyApiModel)) {
            return false;
        }
        RouteTimeTableWithFrequencyApiModel routeTimeTableWithFrequencyApiModel = (RouteTimeTableWithFrequencyApiModel) obj;
        return Intrinsics.d(this.f1686a, routeTimeTableWithFrequencyApiModel.f1686a) && Intrinsics.d(this.b, routeTimeTableWithFrequencyApiModel.b) && Intrinsics.d(this.c, routeTimeTableWithFrequencyApiModel.c);
    }

    public final int hashCode() {
        Integer num = this.f1686a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteTimeTableWithFrequencyApiModel(startTime=");
        sb.append(this.f1686a);
        sb.append(", endTime=");
        sb.append(this.b);
        sb.append(", frequency=");
        return pk0.k(sb, this.c, ")");
    }
}
