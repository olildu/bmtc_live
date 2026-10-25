package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/VehicleLatestPointApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class VehicleLatestPointApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4294a;
    public final Double b;
    public final Double c;
    public final Integer d;
    public final Long e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/VehicleLatestPointApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/VehicleLatestPointApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<VehicleLatestPointApiModel> serializer() {
            return VehicleLatestPointApiModel$$serializer.f4295a;
        }
    }

    public /* synthetic */ VehicleLatestPointApiModel(int i, Integer num, Double d, Double d2, Integer num2, Long l) {
        if ((i & 1) == 0) {
            this.f4294a = null;
        } else {
            this.f4294a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleLatestPointApiModel)) {
            return false;
        }
        VehicleLatestPointApiModel vehicleLatestPointApiModel = (VehicleLatestPointApiModel) obj;
        return Intrinsics.d(this.f4294a, vehicleLatestPointApiModel.f4294a) && Intrinsics.d(this.b, vehicleLatestPointApiModel.b) && Intrinsics.d(this.c, vehicleLatestPointApiModel.c) && Intrinsics.d(this.d, vehicleLatestPointApiModel.d) && Intrinsics.d(this.e, vehicleLatestPointApiModel.e);
    }

    public final int hashCode() {
        Integer num = this.f4294a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VehicleLatestPointApiModel(ac=");
        sb.append(this.f4294a);
        sb.append(", longitude=");
        sb.append(this.b);
        sb.append(", latitude=");
        sb.append(this.c);
        sb.append(", pSp=");
        sb.append(this.d);
        sb.append(", timeStamp=");
        return pk0.l(sb, this.e, ")");
    }
}
