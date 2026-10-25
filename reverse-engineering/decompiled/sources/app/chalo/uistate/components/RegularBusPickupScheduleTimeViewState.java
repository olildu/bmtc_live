package app.chalo.uistate.components;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/components/RegularBusPickupScheduleTimeViewState;", "", "FixedTime", "LiveTime", "Lapp/chalo/uistate/components/RegularBusPickupScheduleTimeViewState$FixedTime;", "Lapp/chalo/uistate/components/RegularBusPickupScheduleTimeViewState$LiveTime;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RegularBusPickupScheduleTimeViewState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/RegularBusPickupScheduleTimeViewState$FixedTime;", "Lapp/chalo/uistate/components/RegularBusPickupScheduleTimeViewState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FixedTime extends RegularBusPickupScheduleTimeViewState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f9945a;

        public FixedTime(TextUIState.ChaloTextUIState chaloTextUIState) {
            this.f9945a = chaloTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixedTime) && Intrinsics.d(this.f9945a, ((FixedTime) obj).f9945a);
        }

        public final int hashCode() {
            return this.f9945a.hashCode();
        }

        public final String toString() {
            return "FixedTime(time=" + this.f9945a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/RegularBusPickupScheduleTimeViewState$LiveTime;", "Lapp/chalo/uistate/components/RegularBusPickupScheduleTimeViewState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveTime extends RegularBusPickupScheduleTimeViewState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LiveTime);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "LiveTime(liveImage=null, time=null)";
        }
    }
}
