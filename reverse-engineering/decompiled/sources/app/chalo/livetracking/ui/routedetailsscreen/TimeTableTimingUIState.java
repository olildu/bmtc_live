package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableTimingUIState;", "", "FixedTiming", "FrequencyTiming", "Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableTimingUIState$FixedTiming;", "Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableTimingUIState$FrequencyTiming;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TimeTableTimingUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableTimingUIState$FixedTiming;", "Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableTimingUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FixedTiming extends TimeTableTimingUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f4894a;

        public FixedTiming(TextUIState.ChaloTextUIState chaloTextUIState) {
            this.f4894a = chaloTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixedTiming) && Intrinsics.d(this.f4894a, ((FixedTiming) obj).f4894a);
        }

        public final int hashCode() {
            return this.f4894a.hashCode();
        }

        public final String toString() {
            return "FixedTiming(text=" + this.f4894a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableTimingUIState$FrequencyTiming;", "Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableTimingUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FrequencyTiming extends TimeTableTimingUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f4895a;
        public final TextUIState.StyledTextUIState b;

        public FrequencyTiming(TextUIState.ChaloTextUIState timingText, TextUIState.StyledTextUIState styledTextUIState) {
            Intrinsics.i(timingText, "timingText");
            this.f4895a = timingText;
            this.b = styledTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyTiming)) {
                return false;
            }
            FrequencyTiming frequencyTiming = (FrequencyTiming) obj;
            return Intrinsics.d(this.f4895a, frequencyTiming.f4895a) && Intrinsics.d(this.b, frequencyTiming.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4895a.hashCode() * 31);
        }

        public final String toString() {
            return "FrequencyTiming(timingText=" + this.f4895a + ", frequency=" + this.b + ")";
        }
    }
}
