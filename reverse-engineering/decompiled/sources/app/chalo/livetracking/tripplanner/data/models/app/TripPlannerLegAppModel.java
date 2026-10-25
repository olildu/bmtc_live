package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.location.LatLng;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.cl1;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "", "Companion", "MonoRail", "Metro", "Auto", "Taxi", "Walk", "Railway", "Bus", "Ferry", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Auto;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Bus;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Ferry;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Metro;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$MonoRail;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Railway;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Taxi;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Walk;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class TripPlannerLegAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object h = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new cl1(11));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f4665a;
    public final LatLng b;
    public final Double c;
    public final Double d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Auto;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Auto extends TripPlannerLegAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final LatLng i;
        public final LatLng j;
        public final Double k;
        public final String l;
        public final String m;
        public final String n;
        public final TripPlannerLegFareInfoAppResponseModel o;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Auto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Auto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Auto> serializer() {
                return TripPlannerLegAppModel$Auto$$serializer.f4666a;
            }
        }

        public /* synthetic */ Auto(int i, LatLng latLng, LatLng latLng2, Double d, String str, String str2, String str3, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel) {
            if (127 != (i & 127)) {
                PluginExceptionsKt.b(TripPlannerLegAppModel$Auto$$serializer.f4666a.getDescriptor(), i, 127);
                throw null;
            }
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = str;
            this.m = str2;
            this.n = str3;
            this.o = tripPlannerLegFareInfoAppResponseModel;
        }

        public static Auto h(Auto auto, String str, String str2) {
            LatLng latLng = auto.i;
            LatLng latLng2 = auto.j;
            Double d = auto.k;
            String str3 = auto.m;
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = auto.o;
            auto.getClass();
            return new Auto(latLng, latLng2, d, str, str3, str2, tripPlannerLegFareInfoAppResponseModel);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF() {
            return this.l;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getF4665a() {
            return this.i;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getG() {
            return this.m;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getE() {
            return this.n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Auto)) {
                return false;
            }
            Auto auto = (Auto) obj;
            return Intrinsics.d(this.i, auto.i) && Intrinsics.d(this.j, auto.j) && Intrinsics.d(this.k, auto.k) && Intrinsics.d(this.l, auto.l) && Intrinsics.d(this.m, auto.m) && Intrinsics.d(this.n, auto.n) && Intrinsics.d(this.o, auto.o);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final LatLng getB() {
            return this.j;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Double getD() {
            return this.k;
        }

        public final int hashCode() {
            LatLng latLng = this.i;
            int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
            LatLng latLng2 = this.j;
            int iHashCode2 = (iHashCode + (latLng2 == null ? 0 : latLng2.hashCode())) * 31;
            Double d = this.k;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.l;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.m;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.n;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = this.o;
            return iHashCode6 + (tripPlannerLegFareInfoAppResponseModel != null ? tripPlannerLegFareInfoAppResponseModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Auto(fromLatLng=");
            sb.append(this.i);
            sb.append(", toLatLng=");
            sb.append(this.j);
            sb.append(", travelTimeInSeconds=");
            sb.append(this.k);
            sb.append(", endPlaceName=");
            sb.append(this.l);
            sb.append(", polyline=");
            cb0.t(sb, this.m, ", startPlaceName=", this.n, ", fare=");
            sb.append(this.o);
            sb.append(")");
            return sb.toString();
        }

        public Auto(LatLng latLng, LatLng latLng2, Double d, String str, String str2, String str3, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel) {
            super(latLng, latLng2, null, d, str3, str, str2);
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = str;
            this.m = str2;
            this.n = str3;
            this.o = tripPlannerLegFareInfoAppResponseModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Bus;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Bus extends TripPlannerLegAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] J;
        public final List A;
        public final TripPlannerLegFareInfoAppResponseModel B;
        public final RouteNamingSchemeType C;
        public final String D;
        public final Integer E;
        public final Integer F;
        public final RouteServiceType G;
        public final LiveEtaAppModel H;
        public final TripPlannerModeRunningTimeRangeAppModel I;
        public final LatLng i;
        public final LatLng j;
        public final Double k;
        public final Double l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final StopAppModel s;
        public final StopAppModel t;
        public final StopAppModel u;
        public final boolean v;
        public final Integer w;
        public final Integer x;
        public final TimeTableStatus y;
        public final List z;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Bus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Bus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Bus> serializer() {
                return TripPlannerLegAppModel$Bus$$serializer.f4667a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            J = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new cl1(12)), LazyKt.a(lazyThreadSafetyMode, new cl1(13)), LazyKt.a(lazyThreadSafetyMode, new cl1(14)), null, LazyKt.a(lazyThreadSafetyMode, new cl1(15)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new cl1(16)), null, null};
        }

        public /* synthetic */ Bus(int i, LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3, String str4, String str5, String str6, StopAppModel stopAppModel, StopAppModel stopAppModel2, StopAppModel stopAppModel3, boolean z, Integer num, Integer num2, TimeTableStatus timeTableStatus, List list, List list2, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel, RouteNamingSchemeType routeNamingSchemeType, String str7, Integer num3, Integer num4, RouteServiceType routeServiceType, LiveEtaAppModel liveEtaAppModel, TripPlannerModeRunningTimeRangeAppModel tripPlannerModeRunningTimeRangeAppModel) {
            if (134217727 != (i & 134217727)) {
                PluginExceptionsKt.b(TripPlannerLegAppModel$Bus$$serializer.f4667a.getDescriptor(), i, 134217727);
                throw null;
            }
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = d2;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = str4;
            this.q = str5;
            this.r = str6;
            this.s = stopAppModel;
            this.t = stopAppModel2;
            this.u = stopAppModel3;
            this.v = z;
            this.w = num;
            this.x = num2;
            this.y = timeTableStatus;
            this.z = list;
            this.A = list2;
            this.B = tripPlannerLegFareInfoAppResponseModel;
            this.C = routeNamingSchemeType;
            this.D = str7;
            this.E = num3;
            this.F = num4;
            this.G = routeServiceType;
            this.H = liveEtaAppModel;
            this.I = tripPlannerModeRunningTimeRangeAppModel;
        }

        public static Bus h(Bus bus, String str, String str2) {
            LatLng latLng = bus.i;
            LatLng latLng2 = bus.j;
            Double d = bus.k;
            Double d2 = bus.l;
            String str3 = bus.o;
            String routeId = bus.p;
            String str4 = bus.q;
            String str5 = bus.r;
            StopAppModel firstStop = bus.s;
            StopAppModel lastStop = bus.t;
            StopAppModel directionStop = bus.u;
            boolean z = bus.v;
            Integer num = bus.w;
            Integer num2 = bus.x;
            TimeTableStatus ttStatus = bus.y;
            List tags = bus.z;
            List intermediateStopsInfo = bus.A;
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = bus.B;
            RouteNamingSchemeType routeSchemeType = bus.C;
            String str6 = bus.D;
            Integer num3 = bus.E;
            Integer num4 = bus.F;
            RouteServiceType routeType = bus.G;
            LiveEtaAppModel liveEtaAppModel = bus.H;
            TripPlannerModeRunningTimeRangeAppModel tripPlannerModeRunningTimeRangeAppModel = bus.I;
            bus.getClass();
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(firstStop, "firstStop");
            Intrinsics.i(lastStop, "lastStop");
            Intrinsics.i(directionStop, "directionStop");
            Intrinsics.i(ttStatus, "ttStatus");
            Intrinsics.i(tags, "tags");
            Intrinsics.i(intermediateStopsInfo, "intermediateStopsInfo");
            Intrinsics.i(routeSchemeType, "routeSchemeType");
            Intrinsics.i(routeType, "routeType");
            return new Bus(latLng, latLng2, d, d2, str, str2, str3, routeId, str4, str5, firstStop, lastStop, directionStop, z, num, num2, ttStatus, tags, intermediateStopsInfo, tripPlannerLegFareInfoAppResponseModel, routeSchemeType, str6, num3, num4, routeType, liveEtaAppModel, tripPlannerModeRunningTimeRangeAppModel);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getC() {
            return this.k;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF() {
            return this.n;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getF4665a() {
            return this.i;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getG() {
            return this.o;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getE() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bus)) {
                return false;
            }
            Bus bus = (Bus) obj;
            return Intrinsics.d(this.i, bus.i) && Intrinsics.d(this.j, bus.j) && Intrinsics.d(this.k, bus.k) && Intrinsics.d(this.l, bus.l) && Intrinsics.d(this.m, bus.m) && Intrinsics.d(this.n, bus.n) && Intrinsics.d(this.o, bus.o) && Intrinsics.d(this.p, bus.p) && Intrinsics.d(this.q, bus.q) && Intrinsics.d(this.r, bus.r) && Intrinsics.d(this.s, bus.s) && Intrinsics.d(this.t, bus.t) && Intrinsics.d(this.u, bus.u) && this.v == bus.v && Intrinsics.d(this.w, bus.w) && Intrinsics.d(this.x, bus.x) && this.y == bus.y && Intrinsics.d(this.z, bus.z) && Intrinsics.d(this.A, bus.A) && Intrinsics.d(this.B, bus.B) && this.C == bus.C && Intrinsics.d(this.D, bus.D) && Intrinsics.d(this.E, bus.E) && Intrinsics.d(this.F, bus.F) && this.G == bus.G && Intrinsics.d(this.H, bus.H) && Intrinsics.d(this.I, bus.I);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final LatLng getB() {
            return this.j;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Double getD() {
            return this.l;
        }

        public final int hashCode() {
            LatLng latLng = this.i;
            int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
            LatLng latLng2 = this.j;
            int iHashCode2 = (iHashCode + (latLng2 == null ? 0 : latLng2.hashCode())) * 31;
            Double d = this.k;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.l;
            int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
            String str = this.m;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.n;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.o;
            int iE = nf1.e((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.p);
            String str4 = this.q;
            int iHashCode7 = (iE + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.r;
            int iB = (n21.b(this.u, n21.b(this.t, n21.b(this.s, (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31), 31) + (this.v ? 1231 : 1237)) * 31;
            Integer num = this.w;
            int iHashCode8 = (iB + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.x;
            int iB2 = r30.b(r30.b((this.y.hashCode() + ((iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31, 31, this.z), 31, this.A);
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = this.B;
            int iHashCode9 = (this.C.hashCode() + ((iB2 + (tripPlannerLegFareInfoAppResponseModel == null ? 0 : tripPlannerLegFareInfoAppResponseModel.hashCode())) * 31)) * 31;
            String str6 = this.D;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.E;
            int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.F;
            int iHashCode12 = (this.G.hashCode() + ((iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31)) * 31;
            LiveEtaAppModel liveEtaAppModel = this.H;
            int iHashCode13 = (iHashCode12 + (liveEtaAppModel == null ? 0 : liveEtaAppModel.hashCode())) * 31;
            TripPlannerModeRunningTimeRangeAppModel tripPlannerModeRunningTimeRangeAppModel = this.I;
            return iHashCode13 + (tripPlannerModeRunningTimeRangeAppModel != null ? tripPlannerModeRunningTimeRangeAppModel.hashCode() : 0);
        }

        public final boolean i() {
            LiveEtaAppModel liveEtaAppModel = this.H;
            return (liveEtaAppModel == null || liveEtaAppModel.f4655a < 0 || StringsKt.F(liveEtaAppModel.b)) ? false : true;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bus(fromLatLng=");
            sb.append(this.i);
            sb.append(", toLatLng=");
            sb.append(this.j);
            sb.append(", distanceInMeters=");
            sb.append(this.k);
            sb.append(", travelTimeInSeconds=");
            sb.append(this.l);
            sb.append(", startPlaceName=");
            cb0.t(sb, this.m, ", endPlaceName=", this.n, ", polyline=");
            cb0.t(sb, this.o, ", routeId=", this.p, ", routeName=");
            cb0.t(sb, this.q, ", agencyName=", this.r, ", firstStop=");
            sb.append(this.s);
            sb.append(", lastStop=");
            sb.append(this.t);
            sb.append(", directionStop=");
            sb.append(this.u);
            sb.append(", isFrequencyLeg=");
            sb.append(this.v);
            sb.append(", frequency=");
            pk0.y(sb, this.w, ", ttSid=", this.x, ", ttStatus=");
            sb.append(this.y);
            sb.append(", tags=");
            sb.append(this.z);
            sb.append(", intermediateStopsInfo=");
            sb.append(this.A);
            sb.append(", fare=");
            sb.append(this.B);
            sb.append(", routeSchemeType=");
            sb.append(this.C);
            sb.append(", via=");
            sb.append(this.D);
            sb.append(", startTimeInSecondsElapsedFromMidnight=");
            pk0.y(sb, this.E, ", endTimeInSecondsElapsedFromMidnight=", this.F, ", routeType=");
            sb.append(this.G);
            sb.append(", liveEta=");
            sb.append(this.H);
            sb.append(", busRunningTimeRange=");
            sb.append(this.I);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bus(LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3, String routeId, String str4, String str5, StopAppModel stopAppModel, StopAppModel stopAppModel2, StopAppModel stopAppModel3, boolean z, Integer num, Integer num2, TimeTableStatus ttStatus, List tags, List intermediateStopsInfo, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel, RouteNamingSchemeType routeSchemeType, String str6, Integer num3, Integer num4, RouteServiceType routeType, LiveEtaAppModel liveEtaAppModel, TripPlannerModeRunningTimeRangeAppModel tripPlannerModeRunningTimeRangeAppModel) {
            super(latLng, latLng2, d, d2, str, str2, str3);
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(ttStatus, "ttStatus");
            Intrinsics.i(tags, "tags");
            Intrinsics.i(intermediateStopsInfo, "intermediateStopsInfo");
            Intrinsics.i(routeSchemeType, "routeSchemeType");
            Intrinsics.i(routeType, "routeType");
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = d2;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = routeId;
            this.q = str4;
            this.r = str5;
            this.s = stopAppModel;
            this.t = stopAppModel2;
            this.u = stopAppModel3;
            this.v = z;
            this.w = num;
            this.x = num2;
            this.y = ttStatus;
            this.z = tags;
            this.A = intermediateStopsInfo;
            this.B = tripPlannerLegFareInfoAppResponseModel;
            this.C = routeSchemeType;
            this.D = str6;
            this.E = num3;
            this.F = num4;
            this.G = routeType;
            this.H = liveEtaAppModel;
            this.I = tripPlannerModeRunningTimeRangeAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<TripPlannerLegAppModel> serializer() {
            return (KSerializer) TripPlannerLegAppModel.h.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Ferry;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Ferry extends TripPlannerLegAppModel {
        public static final Ferry INSTANCE = new Ferry(null, null, null, null, null, null, null);
        public static final /* synthetic */ Object i = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new cl1(17));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ferry);
        }

        public final int hashCode() {
            return -1366904782;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<Ferry> serializer() {
            return (KSerializer) i.getValue();
        }

        public final String toString() {
            return "Ferry";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Metro;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Metro extends TripPlannerLegAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] J;
        public final List A;
        public final TripPlannerLegFareInfoAppResponseModel B;
        public final RouteNamingSchemeType C;
        public final String D;
        public final Integer E;
        public final Integer F;
        public final RouteServiceType G;
        public final String H;
        public final String I;
        public final LatLng i;
        public final LatLng j;
        public final Double k;
        public final Double l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final StopAppModel s;
        public final StopAppModel t;
        public final StopAppModel u;
        public final boolean v;
        public final Integer w;
        public final Integer x;
        public final TimeTableStatus y;
        public final List z;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Metro$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Metro;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Metro> serializer() {
                return TripPlannerLegAppModel$Metro$$serializer.f4668a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            J = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new cl1(18)), LazyKt.a(lazyThreadSafetyMode, new cl1(19)), LazyKt.a(lazyThreadSafetyMode, new cl1(20)), null, LazyKt.a(lazyThreadSafetyMode, new cl1(21)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new cl1(22)), null, null};
        }

        public /* synthetic */ Metro(int i, LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3, String str4, String str5, String str6, StopAppModel stopAppModel, StopAppModel stopAppModel2, StopAppModel stopAppModel3, boolean z, Integer num, Integer num2, TimeTableStatus timeTableStatus, List list, List list2, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel, RouteNamingSchemeType routeNamingSchemeType, String str7, Integer num3, Integer num4, RouteServiceType routeServiceType, String str8, String str9) {
            if (134217727 != (i & 134217727)) {
                PluginExceptionsKt.b(TripPlannerLegAppModel$Metro$$serializer.f4668a.getDescriptor(), i, 134217727);
                throw null;
            }
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = d2;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = str4;
            this.q = str5;
            this.r = str6;
            this.s = stopAppModel;
            this.t = stopAppModel2;
            this.u = stopAppModel3;
            this.v = z;
            this.w = num;
            this.x = num2;
            this.y = timeTableStatus;
            this.z = list;
            this.A = list2;
            this.B = tripPlannerLegFareInfoAppResponseModel;
            this.C = routeNamingSchemeType;
            this.D = str7;
            this.E = num3;
            this.F = num4;
            this.G = routeServiceType;
            this.H = str8;
            this.I = str9;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getC() {
            return this.k;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF() {
            return this.n;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getF4665a() {
            return this.i;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getG() {
            return this.o;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getE() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metro)) {
                return false;
            }
            Metro metro = (Metro) obj;
            return Intrinsics.d(this.i, metro.i) && Intrinsics.d(this.j, metro.j) && Intrinsics.d(this.k, metro.k) && Intrinsics.d(this.l, metro.l) && Intrinsics.d(this.m, metro.m) && Intrinsics.d(this.n, metro.n) && Intrinsics.d(this.o, metro.o) && Intrinsics.d(this.p, metro.p) && Intrinsics.d(this.q, metro.q) && Intrinsics.d(this.r, metro.r) && Intrinsics.d(this.s, metro.s) && Intrinsics.d(this.t, metro.t) && Intrinsics.d(this.u, metro.u) && this.v == metro.v && Intrinsics.d(this.w, metro.w) && Intrinsics.d(this.x, metro.x) && this.y == metro.y && Intrinsics.d(this.z, metro.z) && Intrinsics.d(this.A, metro.A) && Intrinsics.d(this.B, metro.B) && this.C == metro.C && Intrinsics.d(this.D, metro.D) && Intrinsics.d(this.E, metro.E) && Intrinsics.d(this.F, metro.F) && this.G == metro.G && Intrinsics.d(this.H, metro.H) && Intrinsics.d(this.I, metro.I);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final LatLng getB() {
            return this.j;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Double getD() {
            return this.l;
        }

        public final int hashCode() {
            LatLng latLng = this.i;
            int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
            LatLng latLng2 = this.j;
            int iHashCode2 = (iHashCode + (latLng2 == null ? 0 : latLng2.hashCode())) * 31;
            Double d = this.k;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.l;
            int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
            String str = this.m;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.n;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.o;
            int iE = nf1.e((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.p);
            String str4 = this.q;
            int iHashCode7 = (iE + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.r;
            int iB = (n21.b(this.u, n21.b(this.t, n21.b(this.s, (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31), 31) + (this.v ? 1231 : 1237)) * 31;
            Integer num = this.w;
            int iHashCode8 = (iB + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.x;
            int iB2 = r30.b(r30.b((this.y.hashCode() + ((iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31, 31, this.z), 31, this.A);
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = this.B;
            int iHashCode9 = (this.C.hashCode() + ((iB2 + (tripPlannerLegFareInfoAppResponseModel == null ? 0 : tripPlannerLegFareInfoAppResponseModel.hashCode())) * 31)) * 31;
            String str6 = this.D;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.E;
            int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.F;
            int iHashCode12 = (this.G.hashCode() + ((iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31)) * 31;
            String str7 = this.H;
            int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.I;
            return iHashCode13 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metro(fromLatLng=");
            sb.append(this.i);
            sb.append(", toLatLng=");
            sb.append(this.j);
            sb.append(", distanceInMeters=");
            sb.append(this.k);
            sb.append(", travelTimeInSeconds=");
            sb.append(this.l);
            sb.append(", startPlaceName=");
            cb0.t(sb, this.m, ", endPlaceName=", this.n, ", polyline=");
            cb0.t(sb, this.o, ", routeId=", this.p, ", routeName=");
            cb0.t(sb, this.q, ", agencyName=", this.r, ", firstStop=");
            sb.append(this.s);
            sb.append(", lastStop=");
            sb.append(this.t);
            sb.append(", directionStop=");
            sb.append(this.u);
            sb.append(", isFrequencyLeg=");
            sb.append(this.v);
            sb.append(", frequency=");
            pk0.y(sb, this.w, ", ttSid=", this.x, ", ttStatus=");
            sb.append(this.y);
            sb.append(", tags=");
            sb.append(this.z);
            sb.append(", intermediateStopsInfo=");
            sb.append(this.A);
            sb.append(", fare=");
            sb.append(this.B);
            sb.append(", routeSchemeType=");
            sb.append(this.C);
            sb.append(", via=");
            sb.append(this.D);
            sb.append(", startTimeInSecondsElapsedFromMidnight=");
            pk0.y(sb, this.E, ", endTimeInSecondsElapsedFromMidnight=", this.F, ", routeType=");
            sb.append(this.G);
            sb.append(", routeColorName=");
            sb.append(this.H);
            sb.append(", routeColorHex=");
            return vo1.p(sb, this.I, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metro(LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3, String routeId, String str4, String str5, StopAppModel stopAppModel, StopAppModel stopAppModel2, StopAppModel stopAppModel3, boolean z, Integer num, Integer num2, TimeTableStatus ttStatus, List tags, List intermediateStopsInfo, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel, RouteNamingSchemeType routeSchemeType, String str6, Integer num3, Integer num4, RouteServiceType routeType, String str7, String str8) {
            super(latLng, latLng2, d, d2, str, str2, str3);
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(ttStatus, "ttStatus");
            Intrinsics.i(tags, "tags");
            Intrinsics.i(intermediateStopsInfo, "intermediateStopsInfo");
            Intrinsics.i(routeSchemeType, "routeSchemeType");
            Intrinsics.i(routeType, "routeType");
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = d2;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = routeId;
            this.q = str4;
            this.r = str5;
            this.s = stopAppModel;
            this.t = stopAppModel2;
            this.u = stopAppModel3;
            this.v = z;
            this.w = num;
            this.x = num2;
            this.y = ttStatus;
            this.z = tags;
            this.A = intermediateStopsInfo;
            this.B = tripPlannerLegFareInfoAppResponseModel;
            this.C = routeSchemeType;
            this.D = str6;
            this.E = num3;
            this.F = num4;
            this.G = routeType;
            this.H = str7;
            this.I = str8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$MonoRail;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MonoRail extends TripPlannerLegAppModel {
        public static final MonoRail INSTANCE = new MonoRail(null, null, null, null, null, null, null);
        public static final /* synthetic */ Object i = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new cl1(23));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MonoRail);
        }

        public final int hashCode() {
            return -1393906947;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<MonoRail> serializer() {
            return (KSerializer) i.getValue();
        }

        public final String toString() {
            return "MonoRail";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Railway;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Railway extends TripPlannerLegAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final LatLng i;
        public final LatLng j;
        public final Double k;
        public final Double l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final StopAppModel q;
        public final StopAppModel r;
        public final TripPlannerLegFareInfoAppResponseModel s;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Railway$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Railway;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Railway> serializer() {
                return TripPlannerLegAppModel$Railway$$serializer.f4669a;
            }
        }

        public /* synthetic */ Railway(int i, LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3, String str4, StopAppModel stopAppModel, StopAppModel stopAppModel2, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel) {
            if (2047 != (i & 2047)) {
                PluginExceptionsKt.b(TripPlannerLegAppModel$Railway$$serializer.f4669a.getDescriptor(), i, 2047);
                throw null;
            }
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = d2;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = str4;
            this.q = stopAppModel;
            this.r = stopAppModel2;
            this.s = tripPlannerLegFareInfoAppResponseModel;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getC() {
            return this.k;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF() {
            return this.n;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getF4665a() {
            return this.i;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getG() {
            return this.o;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getE() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Railway)) {
                return false;
            }
            Railway railway = (Railway) obj;
            return Intrinsics.d(this.i, railway.i) && Intrinsics.d(this.j, railway.j) && Intrinsics.d(this.k, railway.k) && Intrinsics.d(this.l, railway.l) && Intrinsics.d(this.m, railway.m) && Intrinsics.d(this.n, railway.n) && Intrinsics.d(this.o, railway.o) && Intrinsics.d(this.p, railway.p) && Intrinsics.d(this.q, railway.q) && Intrinsics.d(this.r, railway.r) && Intrinsics.d(this.s, railway.s);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final LatLng getB() {
            return this.j;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Double getD() {
            return this.l;
        }

        public final int hashCode() {
            LatLng latLng = this.i;
            int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
            LatLng latLng2 = this.j;
            int iHashCode2 = (iHashCode + (latLng2 == null ? 0 : latLng2.hashCode())) * 31;
            Double d = this.k;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.l;
            int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
            String str = this.m;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.n;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.o;
            int iB = n21.b(this.r, n21.b(this.q, nf1.e((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.p), 31), 31);
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = this.s;
            return iB + (tripPlannerLegFareInfoAppResponseModel != null ? tripPlannerLegFareInfoAppResponseModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Railway(fromLatLng=");
            sb.append(this.i);
            sb.append(", toLatLng=");
            sb.append(this.j);
            sb.append(", distanceInMeters=");
            sb.append(this.k);
            sb.append(", travelTimeInSeconds=");
            sb.append(this.l);
            sb.append(", startPlaceName=");
            cb0.t(sb, this.m, ", endPlaceName=", this.n, ", polyline=");
            cb0.t(sb, this.o, ", tripId=", this.p, ", firstStop=");
            sb.append(this.q);
            sb.append(", lastStop=");
            sb.append(this.r);
            sb.append(", fare=");
            sb.append(this.s);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Railway(LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3, String tripId, StopAppModel stopAppModel, StopAppModel stopAppModel2, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel) {
            super(latLng, latLng2, d, d2, str, str2, str3);
            Intrinsics.i(tripId, "tripId");
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = d2;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = tripId;
            this.q = stopAppModel;
            this.r = stopAppModel2;
            this.s = tripPlannerLegFareInfoAppResponseModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Taxi;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Taxi extends TripPlannerLegAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final LatLng i;
        public final LatLng j;
        public final Double k;
        public final String l;
        public final String m;
        public final String n;
        public final TripPlannerLegFareInfoAppResponseModel o;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Taxi$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Taxi;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Taxi> serializer() {
                return TripPlannerLegAppModel$Taxi$$serializer.f4670a;
            }
        }

        public /* synthetic */ Taxi(int i, LatLng latLng, LatLng latLng2, Double d, String str, String str2, String str3, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel) {
            if (127 != (i & 127)) {
                PluginExceptionsKt.b(TripPlannerLegAppModel$Taxi$$serializer.f4670a.getDescriptor(), i, 127);
                throw null;
            }
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = str;
            this.m = str2;
            this.n = str3;
            this.o = tripPlannerLegFareInfoAppResponseModel;
        }

        public static Taxi h(Taxi taxi, String str, String str2) {
            LatLng latLng = taxi.i;
            LatLng latLng2 = taxi.j;
            Double d = taxi.k;
            String str3 = taxi.m;
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = taxi.o;
            taxi.getClass();
            return new Taxi(latLng, latLng2, d, str, str3, str2, tripPlannerLegFareInfoAppResponseModel);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF() {
            return this.l;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getF4665a() {
            return this.i;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getG() {
            return this.m;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getE() {
            return this.n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Taxi)) {
                return false;
            }
            Taxi taxi = (Taxi) obj;
            return Intrinsics.d(this.i, taxi.i) && Intrinsics.d(this.j, taxi.j) && Intrinsics.d(this.k, taxi.k) && Intrinsics.d(this.l, taxi.l) && Intrinsics.d(this.m, taxi.m) && Intrinsics.d(this.n, taxi.n) && Intrinsics.d(this.o, taxi.o);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final LatLng getB() {
            return this.j;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Double getD() {
            return this.k;
        }

        public final int hashCode() {
            LatLng latLng = this.i;
            int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
            LatLng latLng2 = this.j;
            int iHashCode2 = (iHashCode + (latLng2 == null ? 0 : latLng2.hashCode())) * 31;
            Double d = this.k;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.l;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.m;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.n;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = this.o;
            return iHashCode6 + (tripPlannerLegFareInfoAppResponseModel != null ? tripPlannerLegFareInfoAppResponseModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Taxi(fromLatLng=");
            sb.append(this.i);
            sb.append(", toLatLng=");
            sb.append(this.j);
            sb.append(", travelTimeInSeconds=");
            sb.append(this.k);
            sb.append(", endPlaceName=");
            sb.append(this.l);
            sb.append(", polyline=");
            cb0.t(sb, this.m, ", startPlaceName=", this.n, ", fare=");
            sb.append(this.o);
            sb.append(")");
            return sb.toString();
        }

        public Taxi(LatLng latLng, LatLng latLng2, Double d, String str, String str2, String str3, TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel) {
            super(latLng, latLng2, null, d, str3, str, str2);
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = str;
            this.m = str2;
            this.n = str3;
            this.o = tripPlannerLegFareInfoAppResponseModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Walk;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Walk extends TripPlannerLegAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final LatLng i;
        public final LatLng j;
        public final Double k;
        public final Double l;
        public final String m;
        public final String n;
        public final String o;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Walk$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Walk;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Walk> serializer() {
                return TripPlannerLegAppModel$Walk$$serializer.f4671a;
            }
        }

        public /* synthetic */ Walk(int i, LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3) {
            if (127 != (i & 127)) {
                PluginExceptionsKt.b(TripPlannerLegAppModel$Walk$$serializer.f4671a.getDescriptor(), i, 127);
                throw null;
            }
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = d2;
            this.m = str;
            this.n = str2;
            this.o = str3;
        }

        public static Walk h(Walk walk, String str, String str2) {
            LatLng latLng = walk.i;
            LatLng latLng2 = walk.j;
            Double d = walk.k;
            Double d2 = walk.l;
            String str3 = walk.o;
            walk.getClass();
            return new Walk(latLng, latLng2, d, d2, str, str2, str3);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getC() {
            return this.k;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF() {
            return this.n;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getF4665a() {
            return this.i;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getG() {
            return this.o;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getE() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Walk)) {
                return false;
            }
            Walk walk = (Walk) obj;
            return Intrinsics.d(this.i, walk.i) && Intrinsics.d(this.j, walk.j) && Intrinsics.d(this.k, walk.k) && Intrinsics.d(this.l, walk.l) && Intrinsics.d(this.m, walk.m) && Intrinsics.d(this.n, walk.n) && Intrinsics.d(this.o, walk.o);
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final LatLng getB() {
            return this.j;
        }

        @Override // app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Double getD() {
            return this.l;
        }

        public final int hashCode() {
            LatLng latLng = this.i;
            int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
            LatLng latLng2 = this.j;
            int iHashCode2 = (iHashCode + (latLng2 == null ? 0 : latLng2.hashCode())) * 31;
            Double d = this.k;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.l;
            int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
            String str = this.m;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.n;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.o;
            return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Walk(fromLatLng=");
            sb.append(this.i);
            sb.append(", toLatLng=");
            sb.append(this.j);
            sb.append(", distanceInMeters=");
            sb.append(this.k);
            sb.append(", travelTimeInSeconds=");
            sb.append(this.l);
            sb.append(", startPlaceName=");
            cb0.t(sb, this.m, ", endPlaceName=", this.n, ", polyline=");
            return vo1.p(sb, this.o, ")");
        }

        public Walk(LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3) {
            super(latLng, latLng2, d, d2, str, str2, str3);
            this.i = latLng;
            this.j = latLng2;
            this.k = d;
            this.l = d2;
            this.m = str;
            this.n = str2;
            this.o = str3;
        }
    }

    public /* synthetic */ TripPlannerLegAppModel() {
        this.f4665a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Double getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public LatLng getF4665a() {
        return this.f4665a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public LatLng getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public Double getD() {
        return this.d;
    }

    public TripPlannerLegAppModel(LatLng latLng, LatLng latLng2, Double d, Double d2, String str, String str2, String str3) {
        this.f4665a = latLng;
        this.b = latLng2;
        this.c = d;
        this.d = d2;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }
}
