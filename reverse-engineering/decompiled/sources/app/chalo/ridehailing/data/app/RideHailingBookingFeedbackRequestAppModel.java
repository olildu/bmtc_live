package app.chalo.ridehailing.data.app;

import defpackage.cb0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingBookingFeedbackRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideHailingBookingFeedbackRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9109a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;

    public RideHailingBookingFeedbackRequestAppModel(int i, String bookingId, String str, String str2, List list) {
        Intrinsics.i(bookingId, "bookingId");
        this.f9109a = bookingId;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingBookingFeedbackRequestAppModel)) {
            return false;
        }
        RideHailingBookingFeedbackRequestAppModel rideHailingBookingFeedbackRequestAppModel = (RideHailingBookingFeedbackRequestAppModel) obj;
        return Intrinsics.d(this.f9109a, rideHailingBookingFeedbackRequestAppModel.f9109a) && this.b == rideHailingBookingFeedbackRequestAppModel.b && Intrinsics.d(this.c, rideHailingBookingFeedbackRequestAppModel.c) && Intrinsics.d(this.d, rideHailingBookingFeedbackRequestAppModel.d) && Intrinsics.d(this.e, rideHailingBookingFeedbackRequestAppModel.e);
    }

    public final int hashCode() {
        int iHashCode = ((this.f9109a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "RideHailingBookingFeedbackRequestAppModel(bookingId=", this.f9109a, ", rating=", ", tag=");
        cb0.t(sbM, this.c, ", comment=", this.d, ", subtags=");
        return xs.l(sbM, this.e, ")");
    }
}
