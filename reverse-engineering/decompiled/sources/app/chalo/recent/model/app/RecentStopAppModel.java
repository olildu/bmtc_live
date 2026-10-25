package app.chalo.recent.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/model/app/RecentStopAppModel;", "Lapp/chalo/recent/model/app/RecentsType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentStopAppModel extends RecentsType {
    public final String e;
    public final String f;
    public final StopAppModel g;
    public final RecentsSpecialStatus h;
    public final long i;
    public final int j;
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopAppModel(String stopId, String cityId, StopAppModel stopAppModel, RecentsSpecialStatus specialStatus, long j, int i, String str) {
        super(j, stopId, cityId, 0);
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(specialStatus, "specialStatus");
        this.e = stopId;
        this.f = cityId;
        this.g = stopAppModel;
        this.h = specialStatus;
        this.i = j;
        this.j = i;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentStopAppModel)) {
            return false;
        }
        RecentStopAppModel recentStopAppModel = (RecentStopAppModel) obj;
        return Intrinsics.d(this.e, recentStopAppModel.e) && Intrinsics.d(this.f, recentStopAppModel.f) && Intrinsics.d(this.g, recentStopAppModel.g) && this.h == recentStopAppModel.h && this.i == recentStopAppModel.i && this.j == recentStopAppModel.j && Intrinsics.d(this.k, recentStopAppModel.k);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + n21.b(this.g, nf1.e(this.e.hashCode() * 31, 31, this.f), 31)) * 31;
        long j = this.i;
        int i = (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.j) * 31;
        String str = this.k;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentStopAppModel(stopId=", this.e, ", cityId=", this.f, ", stop=");
        sbE.append(this.g);
        sbE.append(", specialStatus=");
        sbE.append(this.h);
        sbE.append(", accessTime=");
        sbE.append(this.i);
        sbE.append(", accessCount=");
        sbE.append(this.j);
        return z40.h(sbE, ", label=", this.k, ")");
    }
}
