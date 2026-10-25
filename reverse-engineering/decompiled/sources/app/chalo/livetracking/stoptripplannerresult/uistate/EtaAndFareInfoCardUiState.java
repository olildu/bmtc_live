package app.chalo.livetracking.stoptripplannerresult.uistate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/EtaAndFareInfoCardUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EtaAndFareInfoCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EtaAndFareInfoSpecs f4578a;
    public final LiveEtaInfoUiState b;
    public final FareAndTravelTimeInfoUiState c;

    public EtaAndFareInfoCardUiState(EtaAndFareInfoSpecs etaAndFareInfoSpecs, LiveEtaInfoUiState liveEtaInfo, FareAndTravelTimeInfoUiState fareAndTravelTimeInfoUiState) {
        Intrinsics.i(liveEtaInfo, "liveEtaInfo");
        this.f4578a = etaAndFareInfoSpecs;
        this.b = liveEtaInfo;
        this.c = fareAndTravelTimeInfoUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EtaAndFareInfoCardUiState)) {
            return false;
        }
        EtaAndFareInfoCardUiState etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
        return Intrinsics.d(this.f4578a, etaAndFareInfoCardUiState.f4578a) && Intrinsics.d(this.b, etaAndFareInfoCardUiState.b) && Intrinsics.d(this.c, etaAndFareInfoCardUiState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f4578a.hashCode() * 31)) * 31;
        FareAndTravelTimeInfoUiState fareAndTravelTimeInfoUiState = this.c;
        return iHashCode + (fareAndTravelTimeInfoUiState == null ? 0 : fareAndTravelTimeInfoUiState.hashCode());
    }

    public final String toString() {
        return "EtaAndFareInfoCardUiState(specs=" + this.f4578a + ", liveEtaInfo=" + this.b + ", fareATravelTimeInfo=" + this.c + ")";
    }
}
