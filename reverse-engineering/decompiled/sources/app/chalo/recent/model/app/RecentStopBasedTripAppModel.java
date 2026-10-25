package app.chalo.recent.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentStopBasedTripEntity;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/model/app/RecentStopBasedTripAppModel;", "Lapp/chalo/recent/model/app/RecentsType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentStopBasedTripAppModel extends RecentsType {
    public static final /* synthetic */ int l = 0;
    public final String e;
    public final String f;
    public final StopAppModel g;
    public final StopAppModel h;
    public final ChaloTransitMode i;
    public final long j;
    public final int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopBasedTripAppModel(String stopBasedTripId, String cityId, StopAppModel originStop, StopAppModel destinationStop, ChaloTransitMode transitMode, long j, int i) {
        super(j, stopBasedTripId, cityId, 0);
        Intrinsics.i(stopBasedTripId, "stopBasedTripId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(originStop, "originStop");
        Intrinsics.i(destinationStop, "destinationStop");
        Intrinsics.i(transitMode, "transitMode");
        this.e = stopBasedTripId;
        this.f = cityId;
        this.g = originStop;
        this.h = destinationStop;
        this.i = transitMode;
        this.j = j;
        this.k = i;
    }

    public final RecentStopBasedTripEntity b() {
        return new RecentStopBasedTripEntity(this.e, this.f, RecentsAppModelKt.e(this.g), RecentsAppModelKt.e(this.h), this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentStopBasedTripAppModel)) {
            return false;
        }
        RecentStopBasedTripAppModel recentStopBasedTripAppModel = (RecentStopBasedTripAppModel) obj;
        return Intrinsics.d(this.e, recentStopBasedTripAppModel.e) && Intrinsics.d(this.f, recentStopBasedTripAppModel.f) && Intrinsics.d(this.g, recentStopBasedTripAppModel.g) && Intrinsics.d(this.h, recentStopBasedTripAppModel.h) && this.i == recentStopBasedTripAppModel.i && this.j == recentStopBasedTripAppModel.j && this.k == recentStopBasedTripAppModel.k;
    }

    public final int hashCode() {
        int iC = n21.c(this.i, n21.b(this.h, n21.b(this.g, nf1.e(this.e.hashCode() * 31, 31, this.f), 31), 31), 31);
        long j = this.j;
        return ((iC + ((int) (j ^ (j >>> 32)))) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentStopBasedTripAppModel(stopBasedTripId=", this.e, ", cityId=", this.f, ", originStop=");
        sbE.append(this.g);
        sbE.append(", destinationStop=");
        sbE.append(this.h);
        sbE.append(", transitMode=");
        sbE.append(this.i);
        sbE.append(", accessTime=");
        sbE.append(this.j);
        return t10.k(sbE, ", accessCount=", this.k, ")");
    }
}
