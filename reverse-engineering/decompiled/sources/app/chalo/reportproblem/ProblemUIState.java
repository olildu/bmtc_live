package app.chalo.reportproblem;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ProblemUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProblemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9016a;
    public final UiEventHandler$Companion$fromLambda$1 b;

    public ProblemUIState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f9016a = chaloTextUIState;
        this.b = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProblemUIState)) {
            return false;
        }
        ProblemUIState problemUIState = (ProblemUIState) obj;
        return this.f9016a.equals(problemUIState.f9016a) && this.b.equals(problemUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9016a.hashCode() * 31);
    }

    public final String toString() {
        return "ProblemUIState(description=" + this.f9016a + ", clickHandler=" + this.b + ")";
    }
}
