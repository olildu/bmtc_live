package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/LivePassengerIndicatorBottomSheetContentUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LivePassengerIndicatorBottomSheetContentUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LivePassengerIndicatorBottomSheetContentUISpec f4812a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final SeatAvlNoticeTextUIState d;
    public final LiveSeatAvailabilityBottomCtaContainer e;

    public LivePassengerIndicatorBottomSheetContentUIState(TextUIState.ChaloTextUIState title, List availabilityLevels, SeatAvlNoticeTextUIState seatAvlNoticeTextUIState, LiveSeatAvailabilityBottomCtaContainer liveSeatAvailabilityBottomCtaContainer) {
        LivePassengerIndicatorBottomSheetContentUISpec livePassengerIndicatorBottomSheetContentUISpec = new LivePassengerIndicatorBottomSheetContentUISpec();
        Intrinsics.i(title, "title");
        Intrinsics.i(availabilityLevels, "availabilityLevels");
        this.f4812a = livePassengerIndicatorBottomSheetContentUISpec;
        this.b = title;
        this.c = availabilityLevels;
        this.d = seatAvlNoticeTextUIState;
        this.e = liveSeatAvailabilityBottomCtaContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePassengerIndicatorBottomSheetContentUIState)) {
            return false;
        }
        LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState = (LivePassengerIndicatorBottomSheetContentUIState) obj;
        return Intrinsics.d(this.f4812a, livePassengerIndicatorBottomSheetContentUIState.f4812a) && Intrinsics.d(this.b, livePassengerIndicatorBottomSheetContentUIState.b) && Intrinsics.d(this.c, livePassengerIndicatorBottomSheetContentUIState.c) && Intrinsics.d(this.d, livePassengerIndicatorBottomSheetContentUIState.d) && Intrinsics.d(this.e, livePassengerIndicatorBottomSheetContentUIState.e);
    }

    public final int hashCode() {
        int iB = r30.b(r30.f(this.b, this.f4812a.hashCode() * 31, 31), 31, this.c);
        SeatAvlNoticeTextUIState seatAvlNoticeTextUIState = this.d;
        return this.e.hashCode() + ((iB + (seatAvlNoticeTextUIState == null ? 0 : seatAvlNoticeTextUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "LivePassengerIndicatorBottomSheetContentUIState(spec=" + this.f4812a + ", title=" + this.b + ", availabilityLevels=" + this.c + ", noticeText=" + this.d + ", ctaContainer=" + this.e + ")";
    }
}
