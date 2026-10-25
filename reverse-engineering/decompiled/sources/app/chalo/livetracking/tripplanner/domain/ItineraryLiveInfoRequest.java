package app.chalo.livetracking.tripplanner.domain;

import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoRequest;", "", "FirstValidVehicle", "SpecificVehicle", "Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoRequest$FirstValidVehicle;", "Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoRequest$SpecificVehicle;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ItineraryLiveInfoRequest {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoRequest$FirstValidVehicle;", "Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoRequest;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FirstValidVehicle extends ItineraryLiveInfoRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4699a;
        public final String b;
        public final String c;
        public final long d;

        public FirstValidVehicle(long j, String id, String routeId, String stopId) {
            Intrinsics.i(id, "id");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(stopId, "stopId");
            this.f4699a = id;
            this.b = routeId;
            this.c = stopId;
            this.d = j;
        }

        @Override // app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF4700a() {
            return this.f4699a;
        }

        @Override // app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FirstValidVehicle)) {
                return false;
            }
            FirstValidVehicle firstValidVehicle = (FirstValidVehicle) obj;
            return Intrinsics.d(this.f4699a, firstValidVehicle.f4699a) && Intrinsics.d(this.b, firstValidVehicle.b) && Intrinsics.d(this.c, firstValidVehicle.c) && this.d == firstValidVehicle.d;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.f4699a.hashCode() * 31, 31, this.b), 31, this.c);
            long j = this.d;
            return iE + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sbE = dd.e("FirstValidVehicle(id=", this.f4699a, ", routeId=", this.b, ", stopId=");
            n21.p(this.d, this.c, ", minimumArrivalTimeInMillis=", sbE);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoRequest$SpecificVehicle;", "Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoRequest;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpecificVehicle extends ItineraryLiveInfoRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4700a;
        public final String b;
        public final String c;
        public final String d;

        public SpecificVehicle(String id, String routeId, String stopId, String vehicleNumber) {
            Intrinsics.i(id, "id");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(vehicleNumber, "vehicleNumber");
            this.f4700a = id;
            this.b = routeId;
            this.c = stopId;
            this.d = vehicleNumber;
        }

        @Override // app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF4700a() {
            return this.f4700a;
        }

        @Override // app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpecificVehicle)) {
                return false;
            }
            SpecificVehicle specificVehicle = (SpecificVehicle) obj;
            return Intrinsics.d(this.f4700a, specificVehicle.f4700a) && Intrinsics.d(this.b, specificVehicle.b) && Intrinsics.d(this.c, specificVehicle.c) && Intrinsics.d(this.d, specificVehicle.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + nf1.e(nf1.e(this.f4700a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return r30.i(dd.e("SpecificVehicle(id=", this.f4700a, ", routeId=", this.b, ", stopId="), this.c, ", vehicleNumber=", this.d, ")");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF4700a();

    /* JADX INFO: renamed from: b */
    public abstract String getB();

    /* JADX INFO: renamed from: c */
    public abstract String getC();
}
