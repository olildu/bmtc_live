package app.chalo.ridehailing.data.app;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingBookingFeedbackResultAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideHailingBookingFeedbackResultAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9111a;
    public final boolean b;

    public RideHailingBookingFeedbackResultAppModel(String bookingId, boolean z) {
        Intrinsics.i(bookingId, "bookingId");
        this.f9111a = bookingId;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingBookingFeedbackResultAppModel)) {
            return false;
        }
        RideHailingBookingFeedbackResultAppModel rideHailingBookingFeedbackResultAppModel = (RideHailingBookingFeedbackResultAppModel) obj;
        return Intrinsics.d(this.f9111a, rideHailingBookingFeedbackResultAppModel.f9111a) && this.b == rideHailingBookingFeedbackResultAppModel.b;
    }

    public final int hashCode() {
        return (this.f9111a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return xs.k("RideHailingBookingFeedbackResultAppModel(bookingId=", this.f9111a, ", success=", ")", this.b);
    }
}
