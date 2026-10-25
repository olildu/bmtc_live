package app.chalo.stoptripdetails.data.model.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopTripDetailsResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9502a;
    public final StopTripDetailsAppModel b;

    public StopTripDetailsResponseAppModel(int i, StopTripDetailsAppModel stopTripDetailsAppModel) {
        this.f9502a = i;
        this.b = stopTripDetailsAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripDetailsResponseAppModel)) {
            return false;
        }
        StopTripDetailsResponseAppModel stopTripDetailsResponseAppModel = (StopTripDetailsResponseAppModel) obj;
        return this.f9502a == stopTripDetailsResponseAppModel.f9502a && Intrinsics.d(this.b, stopTripDetailsResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9502a * 31);
    }

    public final String toString() {
        return "StopTripDetailsResponseAppModel(arrivalTime=" + this.f9502a + ", stopTrip=" + this.b + ")";
    }
}
