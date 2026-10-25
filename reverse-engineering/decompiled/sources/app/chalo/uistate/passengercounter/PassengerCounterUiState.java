package app.chalo.uistate.passengercounter;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/passengercounter/PassengerCounterUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerCounterUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassengerCounterSpec f10063a;
    public final ImageUIState b;
    public final ImageUIState c;
    public final TextUIState.ChaloTextUIState d;

    public PassengerCounterUiState(PassengerCounterSpec passengerCounterSpec, ImageUIState imageUIState, ImageUIState imageUIState2, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.f10063a = passengerCounterSpec;
        this.b = imageUIState;
        this.c = imageUIState2;
        this.d = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerCounterUiState)) {
            return false;
        }
        PassengerCounterUiState passengerCounterUiState = (PassengerCounterUiState) obj;
        return Intrinsics.d(this.f10063a, passengerCounterUiState.f10063a) && Intrinsics.d(this.b, passengerCounterUiState.b) && Intrinsics.d(this.c, passengerCounterUiState.c) && Intrinsics.d(this.d, passengerCounterUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.e(this.c, r30.e(this.b, this.f10063a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PassengerCounterUiState(spec=" + this.f10063a + ", increaseButton=" + this.b + ", decreaseButton=" + this.c + ", passengerCount=" + this.d + ")";
    }
}
