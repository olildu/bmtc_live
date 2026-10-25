package app.chalo.ridehailing.feedback;

import app.chalo.uistate.dialog.LoadingDialogUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackViewSpecs f9170a;
    public final LoadingDialogUIState b;
    public final RideFeedbackStep c;
    public final RideFeedbackToolbarUIState d;
    public final RideFeedbackHeaderUIState e;
    public final RideFeedbackContentUIState f;
    public final RideFeedbackCtaUIState g;
    public final RideFeedbackThankYouUIState h;

    public RideFeedbackViewState(RideFeedbackViewSpecs specs, LoadingDialogUIState loadingDialogUIState, RideFeedbackStep step, RideFeedbackToolbarUIState rideFeedbackToolbarUIState, RideFeedbackHeaderUIState rideFeedbackHeaderUIState, RideFeedbackContentUIState rideFeedbackContentUIState, RideFeedbackCtaUIState rideFeedbackCtaUIState, RideFeedbackThankYouUIState rideFeedbackThankYouUIState) {
        Intrinsics.i(specs, "specs");
        Intrinsics.i(step, "step");
        Intrinsics.i(rideFeedbackContentUIState, "rideFeedbackContentUIState");
        Intrinsics.i(rideFeedbackCtaUIState, "rideFeedbackCtaUIState");
        this.f9170a = specs;
        this.b = loadingDialogUIState;
        this.c = step;
        this.d = rideFeedbackToolbarUIState;
        this.e = rideFeedbackHeaderUIState;
        this.f = rideFeedbackContentUIState;
        this.g = rideFeedbackCtaUIState;
        this.h = rideFeedbackThankYouUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackViewState)) {
            return false;
        }
        RideFeedbackViewState rideFeedbackViewState = (RideFeedbackViewState) obj;
        return Intrinsics.d(this.f9170a, rideFeedbackViewState.f9170a) && Intrinsics.d(this.b, rideFeedbackViewState.b) && this.c == rideFeedbackViewState.c && Intrinsics.d(this.d, rideFeedbackViewState.d) && Intrinsics.d(this.e, rideFeedbackViewState.e) && Intrinsics.d(this.f, rideFeedbackViewState.f) && Intrinsics.d(this.g, rideFeedbackViewState.g) && Intrinsics.d(this.h, rideFeedbackViewState.h);
    }

    public final int hashCode() {
        int iHashCode = this.f9170a.hashCode() * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31)) * 31;
        RideFeedbackToolbarUIState rideFeedbackToolbarUIState = this.d;
        int iHashCode3 = (iHashCode2 + (rideFeedbackToolbarUIState == null ? 0 : rideFeedbackToolbarUIState.hashCode())) * 31;
        RideFeedbackHeaderUIState rideFeedbackHeaderUIState = this.e;
        int iHashCode4 = (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (rideFeedbackHeaderUIState == null ? 0 : rideFeedbackHeaderUIState.hashCode())) * 31)) * 31)) * 31;
        RideFeedbackThankYouUIState rideFeedbackThankYouUIState = this.h;
        return iHashCode4 + (rideFeedbackThankYouUIState != null ? rideFeedbackThankYouUIState.hashCode() : 0);
    }

    public final String toString() {
        return "RideFeedbackViewState(specs=" + this.f9170a + ", loading=" + this.b + ", step=" + this.c + ", toolbarUiState=" + this.d + ", rideFeedbackHeaderUIState=" + this.e + ", rideFeedbackContentUIState=" + this.f + ", rideFeedbackCtaUIState=" + this.g + ", thankYouUIState=" + this.h + ")";
    }
}
