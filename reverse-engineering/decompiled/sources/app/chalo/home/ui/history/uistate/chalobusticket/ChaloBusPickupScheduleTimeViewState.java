package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusPickupScheduleTimeViewState;", "", "FixedTime", "LiveTime", "Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusPickupScheduleTimeViewState$FixedTime;", "Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusPickupScheduleTimeViewState$LiveTime;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBusPickupScheduleTimeViewState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusPickupScheduleTimeViewState$FixedTime;", "Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusPickupScheduleTimeViewState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FixedTime extends ChaloBusPickupScheduleTimeViewState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f3498a;

        public FixedTime(TextUIState.ChaloTextUIState chaloTextUIState) {
            this.f3498a = chaloTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixedTime) && Intrinsics.d(this.f3498a, ((FixedTime) obj).f3498a);
        }

        public final int hashCode() {
            return this.f3498a.hashCode();
        }

        public final String toString() {
            return "FixedTime(time=" + this.f3498a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusPickupScheduleTimeViewState$LiveTime;", "Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusPickupScheduleTimeViewState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveTime extends ChaloBusPickupScheduleTimeViewState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GifImageUIState f3499a = new GifImageUIState(LottieType.REAL_TIME_INDICATOR_LOTTIE, new ImageUISize(ChaloThemeHelper.a().g), 2);
        public final TextUIState.ChaloTextUIState b;

        public LiveTime(TextUIState.ChaloTextUIState chaloTextUIState) {
            this.b = chaloTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveTime)) {
                return false;
            }
            LiveTime liveTime = (LiveTime) obj;
            return Intrinsics.d(this.f3499a, liveTime.f3499a) && Intrinsics.d(this.b, liveTime.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3499a.hashCode() * 31);
        }

        public final String toString() {
            return "LiveTime(liveImage=" + this.f3499a + ", time=" + this.b + ")";
        }
    }
}
