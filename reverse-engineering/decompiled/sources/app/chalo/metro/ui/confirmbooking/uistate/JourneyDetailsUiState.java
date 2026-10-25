package app.chalo.metro.ui.confirmbooking.uistate;

import app.chalo.uistate.VerticalDashedLineUIState;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/uistate/JourneyDetailsUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JourneyDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JourneyDetailsUiSpec f5479a;
    public final StopDetailUiState b;
    public final StopDetailUiState c;
    public final List d;
    public final DividerUIState e;
    public final VerticalDashedLineUIState f;

    public JourneyDetailsUiState(StopDetailUiState startStop, StopDetailUiState stopDetailUiState, List passengerCount, DividerUIState dividerUIState) {
        JourneyDetailsUiSpec journeyDetailsUiSpec = new JourneyDetailsUiSpec();
        VerticalDashedLineUIState verticalDashedLineUIState = new VerticalDashedLineUIState(3);
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(passengerCount, "passengerCount");
        this.f5479a = journeyDetailsUiSpec;
        this.b = startStop;
        this.c = stopDetailUiState;
        this.d = passengerCount;
        this.e = dividerUIState;
        this.f = verticalDashedLineUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JourneyDetailsUiState)) {
            return false;
        }
        JourneyDetailsUiState journeyDetailsUiState = (JourneyDetailsUiState) obj;
        return Intrinsics.d(this.f5479a, journeyDetailsUiState.f5479a) && Intrinsics.d(this.b, journeyDetailsUiState.b) && Intrinsics.d(this.c, journeyDetailsUiState.c) && Intrinsics.d(this.d, journeyDetailsUiState.d) && Intrinsics.d(this.e, journeyDetailsUiState.e) && Intrinsics.d(this.f, journeyDetailsUiState.f);
    }

    public final int hashCode() {
        int iB = r30.b((this.c.hashCode() + ((this.b.hashCode() + (this.f5479a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        DividerUIState dividerUIState = this.e;
        return this.f.hashCode() + ((iB + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "JourneyDetailsUiState(uiSpec=" + this.f5479a + ", startStop=" + this.b + ", endStop=" + this.c + ", passengerCount=" + this.d + ", dividerUiState=" + this.e + ", verticalDashedLineUIState=" + this.f + ")";
    }
}
