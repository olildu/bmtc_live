package app.chalo.livetracking.search.uistate;

import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType;", "", "None", "NearestStops", "NearestStopFetchError", "Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType$NearestStopFetchError;", "Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType$NearestStops;", "Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType$None;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopBasedTripPlannerSearchBottomSheetUiStateType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f4520a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType$NearestStopFetchError;", "Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearestStopFetchError extends StopBasedTripPlannerSearchBottomSheetUiStateType {
        public final BottomSheetStandardContentUiState b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearestStopFetchError(BottomSheetStandardContentUiState uiState) {
            super(uiState.f9904a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType$NearestStops;", "Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearestStops extends StopBasedTripPlannerSearchBottomSheetUiStateType {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType$None;", "Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchBottomSheetUiStateType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends StopBasedTripPlannerSearchBottomSheetUiStateType {
        public static final None b = new None(new BottomSheetUiState((BottomSheetEventHandler) null, 3));
    }

    public StopBasedTripPlannerSearchBottomSheetUiStateType(BottomSheetUiState bottomSheetUiState) {
        this.f4520a = bottomSheetUiState;
    }
}
