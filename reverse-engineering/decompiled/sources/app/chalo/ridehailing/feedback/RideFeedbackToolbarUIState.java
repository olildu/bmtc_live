package app.chalo.ridehailing.feedback;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackToolbarUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackToolbarUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9153a;
    public final TextUIState.ChaloTextUIState b;

    public RideFeedbackToolbarUIState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState) {
        Intrinsics.i(title, "title");
        this.f9153a = title;
        this.b = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackToolbarUIState)) {
            return false;
        }
        RideFeedbackToolbarUIState rideFeedbackToolbarUIState = (RideFeedbackToolbarUIState) obj;
        return Intrinsics.d(this.f9153a, rideFeedbackToolbarUIState.f9153a) && Intrinsics.d(this.b, rideFeedbackToolbarUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9153a.hashCode() * 31);
    }

    public final String toString() {
        return "RideFeedbackToolbarUIState(title=" + this.f9153a + ", subtitle=" + this.b + ")";
    }
}
