package app.chalo.uistate.multimodal;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/StepBasedRouteDetailsToggleUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepBasedRouteDetailsToggleUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepBasedRouteDetailsToggleUISpecs f10053a = new StepBasedRouteDetailsToggleUISpecs();
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public StepBasedRouteDetailsToggleUIState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.b = chaloTextUIState;
        this.c = imageUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepBasedRouteDetailsToggleUIState)) {
            return false;
        }
        StepBasedRouteDetailsToggleUIState stepBasedRouteDetailsToggleUIState = (StepBasedRouteDetailsToggleUIState) obj;
        return Intrinsics.d(this.f10053a, stepBasedRouteDetailsToggleUIState.f10053a) && Intrinsics.d(this.b, stepBasedRouteDetailsToggleUIState.b) && Intrinsics.d(this.c, stepBasedRouteDetailsToggleUIState.c) && Intrinsics.d(this.d, stepBasedRouteDetailsToggleUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.e(this.c, r30.f(this.b, this.f10053a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "StepBasedRouteDetailsToggleUIState(specs=" + this.f10053a + ", toggleTextUIState=" + this.b + ", toggleImgUIState=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
