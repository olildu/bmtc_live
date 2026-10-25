package app.chalo.recent.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/model/app/RecentStopAndRouteBasedAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentStopAndRouteBasedAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9003a;
    public final String b;
    public final String c;
    public final String d;
    public final RecentAdditionalRouteInfoModel e;
    public final StopAppModel f;
    public final StopAppModel g;
    public final ChaloTransitMode h;
    public final long i;
    public final int j;

    public RecentStopAndRouteBasedAppModel(String id, String cityId, String routeId, String routeName, RecentAdditionalRouteInfoModel additionRouteInfo, StopAppModel originStop, StopAppModel destinationStop, ChaloTransitMode transitMode, long j, int i) {
        Intrinsics.i(id, "id");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(additionRouteInfo, "additionRouteInfo");
        Intrinsics.i(originStop, "originStop");
        Intrinsics.i(destinationStop, "destinationStop");
        Intrinsics.i(transitMode, "transitMode");
        this.f9003a = id;
        this.b = cityId;
        this.c = routeId;
        this.d = routeName;
        this.e = additionRouteInfo;
        this.f = originStop;
        this.g = destinationStop;
        this.h = transitMode;
        this.i = j;
        this.j = i;
    }

    public final RecentStopAndRouteBasedTripEntity a() {
        RecentAdditionalRouteInfoEntity metro;
        RecentAdditionalRouteInfoModel recentAdditionalRouteInfoModel = this.e;
        Intrinsics.i(recentAdditionalRouteInfoModel, "<this>");
        if (recentAdditionalRouteInfoModel instanceof RecentAdditionalRouteInfoModel.Metro) {
            metro = new RecentAdditionalRouteInfoEntity.Metro(((RecentAdditionalRouteInfoModel.Metro) recentAdditionalRouteInfoModel).f8996a);
        } else {
            if (!(recentAdditionalRouteInfoModel instanceof RecentAdditionalRouteInfoModel.Bus)) {
                throw new NoWhenBranchMatchedException();
            }
            metro = RecentAdditionalRouteInfoEntity.Bus.INSTANCE;
        }
        return new RecentStopAndRouteBasedTripEntity(this.f9003a, this.b, this.c, this.d, metro, RecentsAppModelKt.e(this.f), RecentsAppModelKt.e(this.g), this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentStopAndRouteBasedAppModel)) {
            return false;
        }
        RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel = (RecentStopAndRouteBasedAppModel) obj;
        return Intrinsics.d(this.f9003a, recentStopAndRouteBasedAppModel.f9003a) && Intrinsics.d(this.b, recentStopAndRouteBasedAppModel.b) && Intrinsics.d(this.c, recentStopAndRouteBasedAppModel.c) && Intrinsics.d(this.d, recentStopAndRouteBasedAppModel.d) && Intrinsics.d(this.e, recentStopAndRouteBasedAppModel.e) && Intrinsics.d(this.f, recentStopAndRouteBasedAppModel.f) && Intrinsics.d(this.g, recentStopAndRouteBasedAppModel.g) && this.h == recentStopAndRouteBasedAppModel.h && this.i == recentStopAndRouteBasedAppModel.i && this.j == recentStopAndRouteBasedAppModel.j;
    }

    public final int hashCode() {
        int iC = n21.c(this.h, n21.b(this.g, n21.b(this.f, (this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f9003a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31), 31);
        long j = this.i;
        return ((iC + ((int) (j ^ (j >>> 32)))) * 31) + this.j;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentStopAndRouteBasedAppModel(id=", this.f9003a, ", cityId=", this.b, ", routeId=");
        cb0.t(sbE, this.c, ", routeName=", this.d, ", additionRouteInfo=");
        sbE.append(this.e);
        sbE.append(", originStop=");
        sbE.append(this.f);
        sbE.append(", destinationStop=");
        sbE.append(this.g);
        sbE.append(", transitMode=");
        sbE.append(this.h);
        sbE.append(", accessTime=");
        sbE.append(this.i);
        sbE.append(", accessCount=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }
}
