package app.chalo.validationsdk.blevalidation.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/RideRatingBottomsheetInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideRatingBottomsheetInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10620a;
    public final long b;
    public final List c;

    public RideRatingBottomsheetInfo(List availableFeedbackOptions, int i, long j) {
        Intrinsics.i(availableFeedbackOptions, "availableFeedbackOptions");
        this.f10620a = i;
        this.b = j;
        this.c = availableFeedbackOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideRatingBottomsheetInfo)) {
            return false;
        }
        RideRatingBottomsheetInfo rideRatingBottomsheetInfo = (RideRatingBottomsheetInfo) obj;
        return this.f10620a == rideRatingBottomsheetInfo.f10620a && this.b == rideRatingBottomsheetInfo.b && Intrinsics.d(this.c, rideRatingBottomsheetInfo.c);
    }

    public final int hashCode() {
        int i = this.f10620a * 31;
        long j = this.b;
        return this.c.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "RideRatingBottomsheetInfo(maxStarRating=" + this.f10620a + ", punchTsInMillis=" + this.b + ", availableFeedbackOptions=" + this.c + ")";
    }
}
