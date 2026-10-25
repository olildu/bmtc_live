package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/FareAndTravelTimeInfoUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareAndTravelTimeInfoUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FareAndTravelTimeInfoSpecs f4581a = new FareAndTravelTimeInfoSpecs();
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;

    public FareAndTravelTimeInfoUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareAndTravelTimeInfoUiState)) {
            return false;
        }
        FareAndTravelTimeInfoUiState fareAndTravelTimeInfoUiState = (FareAndTravelTimeInfoUiState) obj;
        return Intrinsics.d(this.f4581a, fareAndTravelTimeInfoUiState.f4581a) && Intrinsics.d(this.b, fareAndTravelTimeInfoUiState.b) && Intrinsics.d(this.c, fareAndTravelTimeInfoUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f4581a.f4580a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FareAndTravelTimeInfoUiState(specs=");
        sb.append(this.f4581a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", details=");
        return py.f(sb, this.c, ")");
    }
}
