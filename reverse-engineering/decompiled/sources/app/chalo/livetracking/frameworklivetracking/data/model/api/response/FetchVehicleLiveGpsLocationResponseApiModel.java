package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/FetchVehicleLiveGpsLocationResponseApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FetchVehicleLiveGpsLocationResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VehicleLatestPointApiModel f4280a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/FetchVehicleLiveGpsLocationResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/FetchVehicleLiveGpsLocationResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FetchVehicleLiveGpsLocationResponseApiModel> serializer() {
            return FetchVehicleLiveGpsLocationResponseApiModel$$serializer.f4281a;
        }
    }

    public /* synthetic */ FetchVehicleLiveGpsLocationResponseApiModel(int i, VehicleLatestPointApiModel vehicleLatestPointApiModel) {
        if (1 == (i & 1)) {
            this.f4280a = vehicleLatestPointApiModel;
        } else {
            PluginExceptionsKt.b(FetchVehicleLiveGpsLocationResponseApiModel$$serializer.f4281a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchVehicleLiveGpsLocationResponseApiModel) && Intrinsics.d(this.f4280a, ((FetchVehicleLiveGpsLocationResponseApiModel) obj).f4280a);
    }

    public final int hashCode() {
        VehicleLatestPointApiModel vehicleLatestPointApiModel = this.f4280a;
        if (vehicleLatestPointApiModel == null) {
            return 0;
        }
        return vehicleLatestPointApiModel.hashCode();
    }

    public final String toString() {
        return "FetchVehicleLiveGpsLocationResponseApiModel(latestPoint=" + this.f4280a + ")";
    }
}
