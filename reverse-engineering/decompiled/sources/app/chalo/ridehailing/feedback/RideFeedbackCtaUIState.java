package app.chalo.ridehailing.feedback;

import app.chalo.uistate.button.ButtonUIState;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackCtaUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackCtaUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackCtaUISpecs f9140a = new RideFeedbackCtaUISpecs();
    public final ButtonUIState b;
    public final ButtonUIState c;

    public RideFeedbackCtaUIState(ButtonUIState buttonUIState, ButtonUIState buttonUIState2) {
        this.b = buttonUIState;
        this.c = buttonUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackCtaUIState)) {
            return false;
        }
        RideFeedbackCtaUIState rideFeedbackCtaUIState = (RideFeedbackCtaUIState) obj;
        return Intrinsics.d(this.f9140a, rideFeedbackCtaUIState.f9140a) && Intrinsics.d(this.b, rideFeedbackCtaUIState.b) && Intrinsics.d(this.c, rideFeedbackCtaUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f9140a.hashCode() * 31;
        ButtonUIState buttonUIState = this.b;
        return this.c.hashCode() + ((iHashCode + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideFeedbackCtaUIState(specs=");
        sb.append(this.f9140a);
        sb.append(", submitFeedbackCta=");
        sb.append(this.b);
        sb.append(", skipFeedbackCta=");
        return hq0.j(sb, this.c, ")");
    }
}
