package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackThankYouUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackThankYouUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackThankYouUISpecs f9152a;
    public final GifImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public RideFeedbackThankYouUIState(GifImageUIState gif, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        RideFeedbackThankYouUISpecs rideFeedbackThankYouUISpecs = new RideFeedbackThankYouUISpecs();
        Intrinsics.i(gif, "gif");
        this.f9152a = rideFeedbackThankYouUISpecs;
        this.b = gif;
        this.c = chaloTextUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackThankYouUIState)) {
            return false;
        }
        RideFeedbackThankYouUIState rideFeedbackThankYouUIState = (RideFeedbackThankYouUIState) obj;
        return Intrinsics.d(this.f9152a, rideFeedbackThankYouUIState.f9152a) && Intrinsics.d(this.b, rideFeedbackThankYouUIState.b) && Intrinsics.d(this.c, rideFeedbackThankYouUIState.c) && Intrinsics.d(this.d, rideFeedbackThankYouUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, (this.b.hashCode() + (Dp.m7284hashCodeimpl(this.f9152a.f9151a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "RideFeedbackThankYouUIState(specs=" + this.f9152a + ", gif=" + this.b + ", message=" + this.c + ", animationCompletedEventHandler=" + this.d + ")";
    }
}
