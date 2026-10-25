package app.chalo.metro.ui.regular.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.passengercounter.PassengerCounterUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/uistate/PassengerSelectionItemUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerSelectionItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassengerSelectionItemSpec f5549a;
    public final CardUISpec b;
    public final TextUIState.ChaloTextUIState c;
    public final PassengerCounterUiState d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PassengerSelectionItemUIState(TextUIState.ChaloTextUIState chaloTextUIState, PassengerCounterUiState passengerCounterUiState) {
        PassengerSelectionItemSpec passengerSelectionItemSpec = new PassengerSelectionItemSpec();
        CardUISpec cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
        this.f5549a = passengerSelectionItemSpec;
        this.b = cardUISpec;
        this.c = chaloTextUIState;
        this.d = passengerCounterUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerSelectionItemUIState)) {
            return false;
        }
        PassengerSelectionItemUIState passengerSelectionItemUIState = (PassengerSelectionItemUIState) obj;
        return Intrinsics.d(this.f5549a, passengerSelectionItemUIState.f5549a) && Intrinsics.d(this.b, passengerSelectionItemUIState.b) && Intrinsics.d(this.c, passengerSelectionItemUIState.c) && Intrinsics.d(this.d, passengerSelectionItemUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, (this.b.hashCode() + (this.f5549a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PassengerSelectionItemUIState(spec=" + this.f5549a + ", cardSpec=" + this.b + ", passengerName=" + this.c + ", passengerCounter=" + this.d + ")";
    }
}
