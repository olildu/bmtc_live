package app.chalo.tripreceipt.domain;

import app.chalo.models.products.SuperPassRideBookingAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FetchSuperPassTripHistoryDataUseCaseKt {
    public static final SuperPassTripHistoryAppModel a(SuperPassRideBookingAppModel superPassRideBookingAppModel, long j) {
        Intrinsics.i(superPassRideBookingAppModel, "<this>");
        return new SuperPassTripHistoryAppModel(superPassRideBookingAppModel.f5681a, superPassRideBookingAppModel.b, superPassRideBookingAppModel.c, superPassRideBookingAppModel.d, superPassRideBookingAppModel.e, j, superPassRideBookingAppModel.f, superPassRideBookingAppModel.g, superPassRideBookingAppModel.h, superPassRideBookingAppModel.i, superPassRideBookingAppModel.j, superPassRideBookingAppModel.k, superPassRideBookingAppModel.l);
    }
}
