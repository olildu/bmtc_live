package app.chalo.titoridedetail.data.app;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoRouteData;", "", "Fetching", "RouteData", "DataFetchError", "Lapp/chalo/titoridedetail/data/app/TitoRouteData$DataFetchError;", "Lapp/chalo/titoridedetail/data/app/TitoRouteData$Fetching;", "Lapp/chalo/titoridedetail/data/app/TitoRouteData$RouteData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TitoRouteData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoRouteData$DataFetchError;", "Lapp/chalo/titoridedetail/data/app/TitoRouteData;", "RouteDataNotAvailable", "Lapp/chalo/titoridedetail/data/app/TitoRouteData$DataFetchError$RouteDataNotAvailable;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DataFetchError extends TitoRouteData {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoRouteData$DataFetchError$RouteDataNotAvailable;", "Lapp/chalo/titoridedetail/data/app/TitoRouteData$DataFetchError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RouteDataNotAvailable extends DataFetchError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RouteDataNotAvailable f9679a = new RouteDataNotAvailable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoRouteData$Fetching;", "Lapp/chalo/titoridedetail/data/app/TitoRouteData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fetching extends TitoRouteData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fetching f9680a = new Fetching();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoRouteData$RouteData;", "Lapp/chalo/titoridedetail/data/app/TitoRouteData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteData extends TitoRouteData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteAppModel f9681a;
        public final StopAppModel b;
        public final StopAppModel c;
        public final String d;

        public RouteData(RouteAppModel routeAppModel, StopAppModel stopAppModel, StopAppModel stopAppModel2, String vehicleNumber) {
            Intrinsics.i(routeAppModel, "routeAppModel");
            Intrinsics.i(vehicleNumber, "vehicleNumber");
            this.f9681a = routeAppModel;
            this.b = stopAppModel;
            this.c = stopAppModel2;
            this.d = vehicleNumber;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteData)) {
                return false;
            }
            RouteData routeData = (RouteData) obj;
            return Intrinsics.d(this.f9681a, routeData.f9681a) && Intrinsics.d(this.b, routeData.b) && Intrinsics.d(this.c, routeData.c) && Intrinsics.d(this.d, routeData.d);
        }

        public final int hashCode() {
            int iHashCode = this.f9681a.hashCode() * 31;
            StopAppModel stopAppModel = this.b;
            int iHashCode2 = (iHashCode + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
            StopAppModel stopAppModel2 = this.c;
            return this.d.hashCode() + ((iHashCode2 + (stopAppModel2 != null ? stopAppModel2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "RouteData(routeAppModel=" + this.f9681a + ", startStopAppModel=" + this.b + ", dropOffStopModel=" + this.c + ", vehicleNumber=" + this.d + ")";
        }
    }

    public final RouteData a() {
        if (this instanceof RouteData) {
            return (RouteData) this;
        }
        if (equals(DataFetchError.RouteDataNotAvailable.f9679a) || equals(Fetching.f9680a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
