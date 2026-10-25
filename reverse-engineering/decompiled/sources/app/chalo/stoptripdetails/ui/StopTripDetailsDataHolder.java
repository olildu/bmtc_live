package app.chalo.stoptripdetails.ui;

import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsDataHolder;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopTripDetailsDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopTripDetailsAppModel f9512a;
    public final StopTripDetailsUiModel b;

    public StopTripDetailsDataHolder(StopTripDetailsAppModel stopTripDetailsAppModel, StopTripDetailsUiModel stopTripDetailsUiModel) {
        this.f9512a = stopTripDetailsAppModel;
        this.b = stopTripDetailsUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripDetailsDataHolder)) {
            return false;
        }
        StopTripDetailsDataHolder stopTripDetailsDataHolder = (StopTripDetailsDataHolder) obj;
        return Intrinsics.d(this.f9512a, stopTripDetailsDataHolder.f9512a) && Intrinsics.d(this.b, stopTripDetailsDataHolder.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9512a.hashCode() * 31);
    }

    public final String toString() {
        return "StopTripDetailsDataHolder(appModel=" + this.f9512a + ", staticUiModel=" + this.b + ")";
    }
}
