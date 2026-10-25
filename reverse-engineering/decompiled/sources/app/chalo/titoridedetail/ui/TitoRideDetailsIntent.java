package app.chalo.titoridedetail.ui;

import app.chalo.constants.Source;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "", "InitializationIntent", "SlideToTapOutIntent", "MissedTapOutIntent", "FetchRouteRetryButtonClickIntent", "BackButtonClickIntent", "TapOutMissedFeedbackSubmitButtonClickIntent", "OnMapStopClickIntent", "TapOutCompleteBottomSheetExitButtonClickIntent", "TapOutCompleteBottomSheetViewReceiptButtonClickIntent", "TitoOnboardingTutorialStartedIntent", "TitoOnboardingTutorialFinishIntent", "TitoOnboardingGotItButtonClickIntent", "ReplayTutorialButtonClickIntent", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$BackButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$FetchRouteRetryButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$InitializationIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$MissedTapOutIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$OnMapStopClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$ReplayTutorialButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$SlideToTapOutIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TapOutCompleteBottomSheetExitButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TapOutCompleteBottomSheetViewReceiptButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TapOutMissedFeedbackSubmitButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TitoOnboardingGotItButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TitoOnboardingTutorialFinishIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TitoOnboardingTutorialStartedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TitoRideDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$BackButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackButtonClickIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackButtonClickIntent f9710a = new BackButtonClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$FetchRouteRetryButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FetchRouteRetryButtonClickIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FetchRouteRetryButtonClickIntent f9711a = new FetchRouteRetryButtonClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$InitializationIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9712a;
        public final Source b;

        public InitializationIntent(Source previousSource, String tapId) {
            Intrinsics.i(tapId, "tapId");
            Intrinsics.i(previousSource, "previousSource");
            this.f9712a = tapId;
            this.b = previousSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f9712a, initializationIntent.f9712a) && this.b == initializationIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9712a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(tapId=" + this.f9712a + ", previousSource=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$MissedTapOutIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissedTapOutIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MissedTapOutIntent f9713a = new MissedTapOutIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$OnMapStopClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnMapStopClickIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9714a;
        public final String b;

        public OnMapStopClickIntent(String stopId, String routeId) {
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(routeId, "routeId");
            this.f9714a = stopId;
            this.b = routeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMapStopClickIntent)) {
                return false;
            }
            OnMapStopClickIntent onMapStopClickIntent = (OnMapStopClickIntent) obj;
            return Intrinsics.d(this.f9714a, onMapStopClickIntent.f9714a) && Intrinsics.d(this.b, onMapStopClickIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9714a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("OnMapStopClickIntent(stopId=", this.f9714a, ", routeId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$ReplayTutorialButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReplayTutorialButtonClickIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReplayTutorialButtonClickIntent f9715a = new ReplayTutorialButtonClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$SlideToTapOutIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SlideToTapOutIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SlideToTapOutIntent f9716a = new SlideToTapOutIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TapOutCompleteBottomSheetExitButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TapOutCompleteBottomSheetExitButtonClickIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TapOutCompleteBottomSheetExitButtonClickIntent f9717a = new TapOutCompleteBottomSheetExitButtonClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TapOutCompleteBottomSheetViewReceiptButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TapOutCompleteBottomSheetViewReceiptButtonClickIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TapOutCompleteBottomSheetViewReceiptButtonClickIntent f9718a = new TapOutCompleteBottomSheetViewReceiptButtonClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TapOutMissedFeedbackSubmitButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TapOutMissedFeedbackSubmitButtonClickIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f9719a;
        public final String b;

        public TapOutMissedFeedbackSubmitButtonClickIntent(List reviewOptionsSelected, String userFeedbackTextString) {
            Intrinsics.i(reviewOptionsSelected, "reviewOptionsSelected");
            Intrinsics.i(userFeedbackTextString, "userFeedbackTextString");
            this.f9719a = reviewOptionsSelected;
            this.b = userFeedbackTextString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapOutMissedFeedbackSubmitButtonClickIntent)) {
                return false;
            }
            TapOutMissedFeedbackSubmitButtonClickIntent tapOutMissedFeedbackSubmitButtonClickIntent = (TapOutMissedFeedbackSubmitButtonClickIntent) obj;
            return Intrinsics.d(this.f9719a, tapOutMissedFeedbackSubmitButtonClickIntent.f9719a) && Intrinsics.d(this.b, tapOutMissedFeedbackSubmitButtonClickIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9719a.hashCode() * 31);
        }

        public final String toString() {
            return "TapOutMissedFeedbackSubmitButtonClickIntent(reviewOptionsSelected=" + this.f9719a + ", userFeedbackTextString=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TitoOnboardingGotItButtonClickIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TitoOnboardingGotItButtonClickIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TitoOnboardingGotItButtonClickIntent f9720a = new TitoOnboardingGotItButtonClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TitoOnboardingTutorialFinishIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TitoOnboardingTutorialFinishIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TitoOnboardingTutorialFinishIntent f9721a = new TitoOnboardingTutorialFinishIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent$TitoOnboardingTutorialStartedIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TitoOnboardingTutorialStartedIntent extends TitoRideDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TitoOnboardingTutorialStartedIntent f9722a = new TitoOnboardingTutorialStartedIntent();
    }
}
