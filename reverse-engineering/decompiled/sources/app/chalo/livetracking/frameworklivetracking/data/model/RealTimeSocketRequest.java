package app.chalo.livetracking.frameworklivetracking.data.model;

import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest;", "", "Etas", "Route", "EtasList", "Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest$Etas;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest$EtasList;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest$Route;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RealTimeSocketRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RtsServiceType f4266a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest$Etas;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Etas extends RealTimeSocketRequest {
        public final String b;
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Etas(String stopId, String routeId) {
            super(RtsServiceType.ETA);
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(routeId, "routeId");
            this.b = stopId;
            this.c = routeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Etas)) {
                return false;
            }
            Etas etas = (Etas) obj;
            return Intrinsics.d(this.b, etas.b) && Intrinsics.d(this.c, etas.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("Etas(stopId=", this.b, ", routeId=", this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest$EtasList;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EtasList extends RealTimeSocketRequest {
        public final List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EtasList(List stopRouteIdList) {
            super(RtsServiceType.ETAS_LIST);
            Intrinsics.i(stopRouteIdList, "stopRouteIdList");
            this.b = stopRouteIdList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EtasList) && Intrinsics.d(this.b, ((EtasList) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return r1.d("EtasList(stopRouteIdList=", ")", this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest$Route;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/RealTimeSocketRequest;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Route extends RealTimeSocketRequest {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Route(String routeId) {
            super(RtsServiceType.ROUTE);
            Intrinsics.i(routeId, "routeId");
            this.b = routeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Route) && Intrinsics.d(this.b, ((Route) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Route(routeId=", this.b, ")");
        }
    }

    public RealTimeSocketRequest(RtsServiceType rtsServiceType) {
        this.f4266a = rtsServiceType;
    }

    public final String a() {
        if (!(this instanceof Etas)) {
            if (this instanceof Route) {
                return vo1.n(this.f4266a.getServiceName(), ":", ((Route) this).b);
            }
            if (this instanceof EtasList) {
                return this.f4266a.getServiceName();
            }
            throw new NoWhenBranchMatchedException();
        }
        Etas etas = (Etas) this;
        return this.f4266a.getServiceName() + ":" + etas.b + ":" + etas.c;
    }
}
