package app.chalo.superpass.data.models.entities;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideBasedSuperPassRideDetailsRoom;", "Lapp/chalo/superpass/data/models/entities/RideBasedSuperPassRideDetails;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideBasedSuperPassRideDetailsRoom extends RideBasedSuperPassRideDetails {
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideBasedSuperPassRideDetailsRoom(String passId, List previousRideTimeStamps, boolean z, long j, boolean z2, long j2, long j3) {
        super(previousRideTimeStamps, z, j, z2, j2, j3);
        Intrinsics.i(passId, "passId");
        Intrinsics.i(previousRideTimeStamps, "previousRideTimeStamps");
        this.h = passId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RideBasedSuperPassRideDetailsRoom(String passId, RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails) {
        this(passId, rideBasedSuperPassRideDetails.c, rideBasedSuperPassRideDetails.d, rideBasedSuperPassRideDetails.e, rideBasedSuperPassRideDetails.f, rideBasedSuperPassRideDetails.f9570a, rideBasedSuperPassRideDetails.b);
        Intrinsics.i(passId, "passId");
        Intrinsics.i(rideBasedSuperPassRideDetails, "rideBasedSuperPassRideDetails");
    }
}
