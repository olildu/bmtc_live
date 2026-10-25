package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.location.LatLng;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerIntermediateStopInfoAppResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerIntermediateStopInfoAppResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4661a;
    public final String b;
    public final LatLng c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerIntermediateStopInfoAppResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerIntermediateStopInfoAppResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerIntermediateStopInfoAppResponseModel> serializer() {
            return TripPlannerIntermediateStopInfoAppResponseModel$$serializer.f4662a;
        }
    }

    public /* synthetic */ TripPlannerIntermediateStopInfoAppResponseModel(int i, String str, String str2, LatLng latLng) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(TripPlannerIntermediateStopInfoAppResponseModel$$serializer.f4662a.getDescriptor(), i, 7);
            throw null;
        }
        this.f4661a = str;
        this.b = str2;
        this.c = latLng;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerIntermediateStopInfoAppResponseModel)) {
            return false;
        }
        TripPlannerIntermediateStopInfoAppResponseModel tripPlannerIntermediateStopInfoAppResponseModel = (TripPlannerIntermediateStopInfoAppResponseModel) obj;
        return Intrinsics.d(this.f4661a, tripPlannerIntermediateStopInfoAppResponseModel.f4661a) && Intrinsics.d(this.b, tripPlannerIntermediateStopInfoAppResponseModel.b) && Intrinsics.d(this.c, tripPlannerIntermediateStopInfoAppResponseModel.c);
    }

    public final int hashCode() {
        String str = this.f4661a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TripPlannerIntermediateStopInfoAppResponseModel(stopId=", this.f4661a, ", stopName=", this.b, ", stopLocation=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }

    public TripPlannerIntermediateStopInfoAppResponseModel(String str, String str2, LatLng latLng) {
        this.f4661a = str;
        this.b = str2;
        this.c = latLng;
    }
}
