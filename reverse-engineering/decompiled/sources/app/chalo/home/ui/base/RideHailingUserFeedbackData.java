package app.chalo.home.ui.base;

import defpackage.q7;
import defpackage.r30;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/RideHailingUserFeedbackData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideHailingUserFeedbackData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3232a;
    public final List b;
    public final String c;

    public RideHailingUserFeedbackData(String bookingId, String str, List userFeedbackRatingData) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userFeedbackRatingData, "userFeedbackRatingData");
        this.f3232a = bookingId;
        this.b = userFeedbackRatingData;
        this.c = str;
    }

    public static RideHailingUserFeedbackData a(RideHailingUserFeedbackData rideHailingUserFeedbackData, ArrayList arrayList, String str, int i) {
        String bookingId = rideHailingUserFeedbackData.f3232a;
        List userFeedbackRatingData = arrayList;
        if ((i & 2) != 0) {
            userFeedbackRatingData = rideHailingUserFeedbackData.b;
        }
        if ((i & 4) != 0) {
            str = rideHailingUserFeedbackData.c;
        }
        rideHailingUserFeedbackData.getClass();
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userFeedbackRatingData, "userFeedbackRatingData");
        return new RideHailingUserFeedbackData(bookingId, str, userFeedbackRatingData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingUserFeedbackData)) {
            return false;
        }
        RideHailingUserFeedbackData rideHailingUserFeedbackData = (RideHailingUserFeedbackData) obj;
        return Intrinsics.d(this.f3232a, rideHailingUserFeedbackData.f3232a) && Intrinsics.d(this.b, rideHailingUserFeedbackData.b) && Intrinsics.d(this.c, rideHailingUserFeedbackData.c);
    }

    public final int hashCode() {
        int iB = r30.b(this.f3232a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(q7.h("RideHailingUserFeedbackData(bookingId=", this.f3232a, ", userFeedbackRatingData=", ", otherFeedbackReasonText=", this.b), this.c, ")");
    }
}
