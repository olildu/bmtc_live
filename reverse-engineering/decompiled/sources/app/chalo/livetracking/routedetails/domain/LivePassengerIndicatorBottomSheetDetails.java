package app.chalo.livetracking.routedetails.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetails;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LivePassengerIndicatorBottomSheetDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4439a;
    public final LivePassengerIndicatorBottomSheetDetailsType b;

    public LivePassengerIndicatorBottomSheetDetails(String str, LivePassengerIndicatorBottomSheetDetailsType bottomsheetDetailsType) {
        Intrinsics.i(bottomsheetDetailsType, "bottomsheetDetailsType");
        this.f4439a = str;
        this.b = bottomsheetDetailsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePassengerIndicatorBottomSheetDetails)) {
            return false;
        }
        LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) obj;
        return Intrinsics.d(this.f4439a, livePassengerIndicatorBottomSheetDetails.f4439a) && Intrinsics.d(this.b, livePassengerIndicatorBottomSheetDetails.b);
    }

    public final int hashCode() {
        String str = this.f4439a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "LivePassengerIndicatorBottomSheetDetails(learnMoreUrl=" + this.f4439a + ", bottomsheetDetailsType=" + this.b + ")";
    }
}
