package app.chalo.livetracking.tripplanner.data.models.api;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerIntermediateStopInfoApiResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerIntermediateStopInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4632a;
    public final String b;
    public final Double c;
    public final Double d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerIntermediateStopInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerIntermediateStopInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerIntermediateStopInfoApiResponseModel> serializer() {
            return TripPlannerIntermediateStopInfoApiResponseModel$$serializer.f4633a;
        }
    }

    public /* synthetic */ TripPlannerIntermediateStopInfoApiResponseModel(int i, String str, String str2, Double d, Double d2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(TripPlannerIntermediateStopInfoApiResponseModel$$serializer.f4633a.getDescriptor(), i, 15);
            throw null;
        }
        this.f4632a = str;
        this.b = str2;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerIntermediateStopInfoApiResponseModel)) {
            return false;
        }
        TripPlannerIntermediateStopInfoApiResponseModel tripPlannerIntermediateStopInfoApiResponseModel = (TripPlannerIntermediateStopInfoApiResponseModel) obj;
        return Intrinsics.d(this.f4632a, tripPlannerIntermediateStopInfoApiResponseModel.f4632a) && Intrinsics.d(this.b, tripPlannerIntermediateStopInfoApiResponseModel.b) && Intrinsics.d(this.c, tripPlannerIntermediateStopInfoApiResponseModel.c) && Intrinsics.d(this.d, tripPlannerIntermediateStopInfoApiResponseModel.d);
    }

    public final int hashCode() {
        String str = this.f4632a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TripPlannerIntermediateStopInfoApiResponseModel(stopId=", this.f4632a, ", stopName=", this.b, ", stopLat=");
        sbE.append(this.c);
        sbE.append(", stopLon=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
