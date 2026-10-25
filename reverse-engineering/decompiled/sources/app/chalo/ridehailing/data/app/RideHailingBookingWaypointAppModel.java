package app.chalo.ridehailing.data.app;

import app.chalo.location.LatLng;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingBookingWaypointAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideHailingBookingWaypointAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9112a;
    public final String b;
    public final LatLng c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingBookingWaypointAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridehailing/data/app/RideHailingBookingWaypointAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideHailingBookingWaypointAppModel> serializer() {
            return RideHailingBookingWaypointAppModel$$serializer.f9113a;
        }
    }

    public /* synthetic */ RideHailingBookingWaypointAppModel(int i, String str, String str2, LatLng latLng) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(RideHailingBookingWaypointAppModel$$serializer.f9113a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9112a = str;
        this.b = str2;
        this.c = latLng;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingBookingWaypointAppModel)) {
            return false;
        }
        RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel = (RideHailingBookingWaypointAppModel) obj;
        return Intrinsics.d(this.f9112a, rideHailingBookingWaypointAppModel.f9112a) && Intrinsics.d(this.b, rideHailingBookingWaypointAppModel.b) && Intrinsics.d(this.c, rideHailingBookingWaypointAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f9112a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RideHailingBookingWaypointAppModel(name=", this.f9112a, ", description=", this.b, ", location=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
