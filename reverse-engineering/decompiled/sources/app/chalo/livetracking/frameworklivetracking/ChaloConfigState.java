package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloSocketConfigResponseAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/ChaloConfigState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloConfigState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigStateFetchState f4175a;
    public final ChaloSocketConfigResponseAppModel b;

    public ChaloConfigState(ChaloConfigStateFetchState configFetchState, ChaloSocketConfigResponseAppModel chaloSocketConfigResponseAppModel) {
        Intrinsics.i(configFetchState, "configFetchState");
        this.f4175a = configFetchState;
        this.b = chaloSocketConfigResponseAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloConfigState)) {
            return false;
        }
        ChaloConfigState chaloConfigState = (ChaloConfigState) obj;
        return this.f4175a == chaloConfigState.f4175a && Intrinsics.d(this.b, chaloConfigState.b);
    }

    public final int hashCode() {
        int iHashCode = this.f4175a.hashCode() * 31;
        ChaloSocketConfigResponseAppModel chaloSocketConfigResponseAppModel = this.b;
        return iHashCode + (chaloSocketConfigResponseAppModel == null ? 0 : chaloSocketConfigResponseAppModel.hashCode());
    }

    public final String toString() {
        return "ChaloConfigState(configFetchState=" + this.f4175a + ", configData=" + this.b + ")";
    }
}
