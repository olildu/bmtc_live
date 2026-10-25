package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StepCardUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepCardSpecs f4612a = new StepCardSpecs();
    public final TextWithLeftAndRightIconUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;

    public StepCardUIState(TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = textWithLeftAndRightIconUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepCardUIState)) {
            return false;
        }
        StepCardUIState stepCardUIState = (StepCardUIState) obj;
        return Intrinsics.d(this.f4612a, stepCardUIState.f4612a) && Intrinsics.d(this.b, stepCardUIState.b) && Intrinsics.d(this.c, stepCardUIState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f4612a.hashCode() * 31)) * 31;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = this.c;
        return iHashCode + (uiEventHandler$Companion$fromLambda$1 == null ? 0 : uiEventHandler$Companion$fromLambda$1.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepCardUIState(specs=");
        sb.append(this.f4612a);
        sb.append(", step=");
        sb.append(this.b);
        sb.append(", clickHandler=");
        return nf1.n(sb, this.c, ")");
    }
}
