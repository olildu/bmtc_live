package app.chalo.multimodalticket.ui.uistates;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/FareBreakupItemUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareBreakupItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f5957a;
    public final TextUIState.ChaloTextUIState b;

    public FareBreakupItemUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.f5957a = chaloTextUIState;
        this.b = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareBreakupItemUIState)) {
            return false;
        }
        FareBreakupItemUIState fareBreakupItemUIState = (FareBreakupItemUIState) obj;
        return Intrinsics.d(this.f5957a, fareBreakupItemUIState.f5957a) && Intrinsics.d(this.b, fareBreakupItemUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5957a.hashCode() * 31);
    }

    public final String toString() {
        return "FareBreakupItemUIState(label=" + this.f5957a + ", value=" + this.b + ")";
    }
}
