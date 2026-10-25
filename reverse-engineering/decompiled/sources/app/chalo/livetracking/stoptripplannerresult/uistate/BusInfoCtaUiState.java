package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusInfoCtaUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusInfoCtaUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BusInfoCtaSpecs f4574a;
    public final TextWithLeftAndRightIconUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;

    public BusInfoCtaUiState(BusInfoCtaSpecs specs, TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        Intrinsics.i(specs, "specs");
        this.f4574a = specs;
        this.b = textWithLeftAndRightIconUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusInfoCtaUiState)) {
            return false;
        }
        BusInfoCtaUiState busInfoCtaUiState = (BusInfoCtaUiState) obj;
        return Intrinsics.d(this.f4574a, busInfoCtaUiState.f4574a) && this.b.equals(busInfoCtaUiState.b) && this.c.equals(busInfoCtaUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4574a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusInfoCtaUiState(specs=");
        sb.append(this.f4574a);
        sb.append(", textState=");
        sb.append(this.b);
        sb.append(", clickHandler=");
        return nf1.n(sb, this.c, ")");
    }
}
