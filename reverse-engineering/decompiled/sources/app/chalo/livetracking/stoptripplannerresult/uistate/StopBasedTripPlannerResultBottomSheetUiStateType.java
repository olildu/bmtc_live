package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.livetracking.search.uistate.NearestStopsBottomSheetContainerUiState;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType;", "", "None", "NearestStops", "NearestStopFetchError", "NoNearestStops", "LiveTrackingNotSupported", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$LiveTrackingNotSupported;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$NearestStopFetchError;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$NearestStops;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$NoNearestStops;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$None;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopBasedTripPlannerResultBottomSheetUiStateType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f4613a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$LiveTrackingNotSupported;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveTrackingNotSupported extends StopBasedTripPlannerResultBottomSheetUiStateType {
        public final LiveTrackingNotSupportedBottomSheet b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveTrackingNotSupported(LiveTrackingNotSupportedBottomSheet uiState) {
            super(uiState.f4592a);
            Intrinsics.i(uiState, "uiState");
            this.b = uiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LiveTrackingNotSupported) && Intrinsics.d(this.b, ((LiveTrackingNotSupported) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LiveTrackingNotSupported(uiState=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$NearestStopFetchError;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearestStopFetchError extends StopBasedTripPlannerResultBottomSheetUiStateType {
        public final NearbyStopFetchErrorBottomSheetUIState b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearestStopFetchError(NearbyStopFetchErrorBottomSheetUIState uiState) {
            super(uiState.f4597a);
            Intrinsics.i(uiState, "uiState");
            this.b = uiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearestStopFetchError) && Intrinsics.d(this.b, ((NearestStopFetchError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NearestStopFetchError(uiState=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$NearestStops;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearestStops extends StopBasedTripPlannerResultBottomSheetUiStateType {
        public final BottomSheetUiState b;
        public final NearestStopsBottomSheetContainerUiState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearestStops(BottomSheetUiState sheetSpec, NearestStopsBottomSheetContainerUiState uiState) {
            super(sheetSpec);
            Intrinsics.i(sheetSpec, "sheetSpec");
            Intrinsics.i(uiState, "uiState");
            this.b = sheetSpec;
            this.c = uiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearestStops)) {
                return false;
            }
            NearestStops nearestStops = (NearestStops) obj;
            return Intrinsics.d(this.b, nearestStops.b) && Intrinsics.d(this.c, nearestStops.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "NearestStops(sheetSpec=" + this.b + ", uiState=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$NoNearestStops;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoNearestStops extends StopBasedTripPlannerResultBottomSheetUiStateType {
        public final NoNearbyStopsBottomSheetUIState b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoNearestStops(NoNearbyStopsBottomSheetUIState uiState) {
            super(uiState.f4603a);
            Intrinsics.i(uiState, "uiState");
            this.b = uiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoNearestStops) && Intrinsics.d(this.b, ((NoNearestStops) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NoNearestStops(uiState=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType$None;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerResultBottomSheetUiStateType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends StopBasedTripPlannerResultBottomSheetUiStateType {
        public static final None b = new None(new BottomSheetUiState((BottomSheetEventHandler) null, 3));
    }

    public StopBasedTripPlannerResultBottomSheetUiStateType(BottomSheetUiState bottomSheetUiState) {
        this.f4613a = bottomSheetUiState;
    }
}
