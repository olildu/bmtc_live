package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusInfoCardUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusInfoCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BusInfoCardSpecs f4572a = new BusInfoCardSpecs();
    public final TextUIState.ChaloTextUIState b;
    public final SpecialFeaturesTagListUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final BusNumberContainerUIState e;

    public BusInfoCardUiState(TextUIState.ChaloTextUIState chaloTextUIState, SpecialFeaturesTagListUIState specialFeaturesTagListUIState, TextUIState.ChaloTextUIState chaloTextUIState2, BusNumberContainerUIState busNumberContainerUIState) {
        this.b = chaloTextUIState;
        this.c = specialFeaturesTagListUIState;
        this.d = chaloTextUIState2;
        this.e = busNumberContainerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusInfoCardUiState)) {
            return false;
        }
        BusInfoCardUiState busInfoCardUiState = (BusInfoCardUiState) obj;
        return Intrinsics.d(this.f4572a, busInfoCardUiState.f4572a) && Intrinsics.d(this.b, busInfoCardUiState.b) && Intrinsics.d(this.c, busInfoCardUiState.c) && Intrinsics.d(this.d, busInfoCardUiState.d) && Intrinsics.d(this.e, busInfoCardUiState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f4572a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.d;
        int iHashCode3 = (iHashCode2 + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        BusNumberContainerUIState busNumberContainerUIState = this.e;
        return iHashCode3 + (busNumberContainerUIState != null ? busNumberContainerUIState.hashCode() : 0);
    }

    public final String toString() {
        return "BusInfoCardUiState(specs=" + this.f4572a + ", header=" + this.b + ", spf=" + this.c + ", via=" + this.d + ", busNumberAndCta=" + this.e + ")";
    }
}
