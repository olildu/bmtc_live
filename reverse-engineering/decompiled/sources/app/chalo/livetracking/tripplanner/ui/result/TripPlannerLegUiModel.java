package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
import defpackage.xj1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "", "MonoRail", "Metro", "Auto", "Taxi", "Walk", "Railway", "Bus", "Ferry", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Auto;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Bus;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Ferry;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Metro;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$MonoRail;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Railway;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Taxi;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Walk;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TripPlannerLegUiModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Auto;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Auto extends TripPlannerLegUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4754a;
        public final String b;
        public final String c;

        public Auto(String str, String travelTimeString, String str2) {
            Intrinsics.i(travelTimeString, "travelTimeString");
            this.f4754a = str;
            this.b = travelTimeString;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Auto)) {
                return false;
            }
            Auto auto = (Auto) obj;
            return Intrinsics.d(this.f4754a, auto.f4754a) && Intrinsics.d(this.b, auto.b) && Intrinsics.d(this.c, auto.c);
        }

        public final int hashCode() {
            int iE = nf1.e(this.f4754a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return vo1.p(dd.e("Auto(lastStop=", this.f4754a, ", travelTimeString=", this.b, ", fare="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Bus;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bus extends TripPlannerLegUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4755a;
        public final String b;
        public final RouteNamingSchemeType c;
        public final String d;
        public final String e;
        public final String f;
        public final List g;
        public final String h;
        public final String i;
        public final SeatAvailabilityLevel j;
        public final List k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final int p;
        public final String q;
        public final RouteServiceType r;

        public Bus(String routeId, String str, RouteNamingSchemeType routeSchemeType, String str2, String firstStopName, String routeLastStopName, List tags, String str3, String str4, SeatAvailabilityLevel seatAvailabilityLevel, List intermediateStopsList, String str5, String travelTimeString, String str6, String str7, int i, String str8, RouteServiceType routeType) {
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(routeSchemeType, "routeSchemeType");
            Intrinsics.i(firstStopName, "firstStopName");
            Intrinsics.i(routeLastStopName, "routeLastStopName");
            Intrinsics.i(tags, "tags");
            Intrinsics.i(intermediateStopsList, "intermediateStopsList");
            Intrinsics.i(travelTimeString, "travelTimeString");
            Intrinsics.i(routeType, "routeType");
            this.f4755a = routeId;
            this.b = str;
            this.c = routeSchemeType;
            this.d = str2;
            this.e = firstStopName;
            this.f = routeLastStopName;
            this.g = tags;
            this.h = str3;
            this.i = str4;
            this.j = seatAvailabilityLevel;
            this.k = intermediateStopsList;
            this.l = str5;
            this.m = travelTimeString;
            this.n = str6;
            this.o = str7;
            this.p = i;
            this.q = str8;
            this.r = routeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bus)) {
                return false;
            }
            Bus bus = (Bus) obj;
            return Intrinsics.d(this.f4755a, bus.f4755a) && Intrinsics.d(this.b, bus.b) && this.c == bus.c && Intrinsics.d(this.d, bus.d) && Intrinsics.d(this.e, bus.e) && Intrinsics.d(this.f, bus.f) && Intrinsics.d(this.g, bus.g) && Intrinsics.d(this.h, bus.h) && Intrinsics.d(this.i, bus.i) && this.j == bus.j && Intrinsics.d(this.k, bus.k) && Intrinsics.d(this.l, bus.l) && Intrinsics.d(this.m, bus.m) && Intrinsics.d(this.n, bus.n) && Intrinsics.d(this.o, bus.o) && this.p == bus.p && Intrinsics.d(this.q, bus.q) && this.r == bus.r;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + nf1.e(this.f4755a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            int iB = r30.b(nf1.e(nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
            String str2 = this.h;
            int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            SeatAvailabilityLevel seatAvailabilityLevel = this.j;
            int iE = (nf1.e(nf1.e(nf1.e(nf1.e(r30.b((iHashCode3 + (seatAvailabilityLevel == null ? 0 : seatAvailabilityLevel.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o) + this.p) * 31;
            String str4 = this.q;
            return this.r.hashCode() + ((iE + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Bus(routeId=", this.f4755a, ", routeName=", this.b, ", routeSchemeType=");
            sbE.append(this.c);
            sbE.append(", via=");
            sbE.append(this.d);
            sbE.append(", firstStopName=");
            cb0.t(sbE, this.e, ", routeLastStopName=", this.f, ", tags=");
            cb0.s(", etaString=", this.h, ", scheduledString=", sbE, this.g);
            sbE.append(this.i);
            sbE.append(", seatAvailabilityLevel=");
            sbE.append(this.j);
            sbE.append(", intermediateStopsList=");
            cb0.s(", fare=", this.l, ", travelTimeString=", sbE, this.k);
            cb0.t(sbE, this.m, ", trackBusBtnString=", this.n, ", buyProductBtnString=");
            cb0.o(this.p, this.o, ", intermediateStopsCountExcludingStartAndLastStop=", ", disclaimerText=", sbE);
            sbE.append(this.q);
            sbE.append(", routeType=");
            sbE.append(this.r);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Ferry;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ferry extends TripPlannerLegUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ferry f4756a = new Ferry();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Metro;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Metro extends TripPlannerLegUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4757a;
        public final String b;
        public final RouteNamingSchemeType c;
        public final String d;
        public final String e;
        public final String f;
        public final List g;
        public final String h;
        public final String i;
        public final SeatAvailabilityLevel j;
        public final List k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final int p;
        public final String q;
        public final RouteServiceType r;
        public final String s;
        public final String t;

        public Metro(String routeId, String str, RouteNamingSchemeType routeSchemeType, String str2, String firstStopName, String routeLastStopName, List tags, String str3, String str4, SeatAvailabilityLevel seatAvailabilityLevel, List list, String str5, String travelTimeString, String str6, String str7, int i, String str8, RouteServiceType routeType, String str9, String str10) {
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(routeSchemeType, "routeSchemeType");
            Intrinsics.i(firstStopName, "firstStopName");
            Intrinsics.i(routeLastStopName, "routeLastStopName");
            Intrinsics.i(tags, "tags");
            Intrinsics.i(travelTimeString, "travelTimeString");
            Intrinsics.i(routeType, "routeType");
            this.f4757a = routeId;
            this.b = str;
            this.c = routeSchemeType;
            this.d = str2;
            this.e = firstStopName;
            this.f = routeLastStopName;
            this.g = tags;
            this.h = str3;
            this.i = str4;
            this.j = seatAvailabilityLevel;
            this.k = list;
            this.l = str5;
            this.m = travelTimeString;
            this.n = str6;
            this.o = str7;
            this.p = i;
            this.q = str8;
            this.r = routeType;
            this.s = str9;
            this.t = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metro)) {
                return false;
            }
            Metro metro = (Metro) obj;
            return Intrinsics.d(this.f4757a, metro.f4757a) && Intrinsics.d(this.b, metro.b) && this.c == metro.c && Intrinsics.d(this.d, metro.d) && Intrinsics.d(this.e, metro.e) && Intrinsics.d(this.f, metro.f) && Intrinsics.d(this.g, metro.g) && Intrinsics.d(this.h, metro.h) && Intrinsics.d(this.i, metro.i) && this.j == metro.j && Intrinsics.d(this.k, metro.k) && Intrinsics.d(this.l, metro.l) && Intrinsics.d(this.m, metro.m) && Intrinsics.d(this.n, metro.n) && Intrinsics.d(this.o, metro.o) && this.p == metro.p && Intrinsics.d(this.q, metro.q) && this.r == metro.r && Intrinsics.d(this.s, metro.s) && Intrinsics.d(this.t, metro.t);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + nf1.e(this.f4757a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            int iB = r30.b(nf1.e(nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
            String str2 = this.h;
            int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            SeatAvailabilityLevel seatAvailabilityLevel = this.j;
            int iE = (nf1.e(nf1.e(nf1.e(nf1.e(r30.b((iHashCode3 + (seatAvailabilityLevel == null ? 0 : seatAvailabilityLevel.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o) + this.p) * 31;
            String str4 = this.q;
            int iHashCode4 = (this.r.hashCode() + ((iE + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
            String str5 = this.s;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.t;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Metro(routeId=", this.f4757a, ", routeName=", this.b, ", routeSchemeType=");
            sbE.append(this.c);
            sbE.append(", via=");
            sbE.append(this.d);
            sbE.append(", firstStopName=");
            cb0.t(sbE, this.e, ", routeLastStopName=", this.f, ", tags=");
            cb0.s(", etaString=", this.h, ", scheduledString=", sbE, this.g);
            sbE.append(this.i);
            sbE.append(", seatAvailabilityLevel=");
            sbE.append(this.j);
            sbE.append(", intermediateStopsList=");
            cb0.s(", fare=", this.l, ", travelTimeString=", sbE, this.k);
            cb0.t(sbE, this.m, ", trackBusBtnString=", this.n, ", buyProductBtnString=");
            cb0.o(this.p, this.o, ", intermediateStopsCountExcludingStartAndLastStop=", ", disclaimerText=", sbE);
            sbE.append(this.q);
            sbE.append(", routeType=");
            sbE.append(this.r);
            sbE.append(", routeColorName=");
            return r30.i(sbE, this.s, ", routeColourHex=", this.t, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$MonoRail;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MonoRail extends TripPlannerLegUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MonoRail f4758a = new MonoRail();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Railway;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Railway extends TripPlannerLegUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Railway f4759a = new Railway();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Taxi;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Taxi extends TripPlannerLegUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4760a;
        public final String b;
        public final String c;

        public Taxi(String str, String travelTimeString, String str2) {
            Intrinsics.i(travelTimeString, "travelTimeString");
            this.f4760a = str;
            this.b = travelTimeString;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Taxi)) {
                return false;
            }
            Taxi taxi = (Taxi) obj;
            return Intrinsics.d(this.f4760a, taxi.f4760a) && Intrinsics.d(this.b, taxi.b) && Intrinsics.d(this.c, taxi.c);
        }

        public final int hashCode() {
            int iE = nf1.e(this.f4760a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return vo1.p(dd.e("Taxi(lastStop=", this.f4760a, ", travelTimeString=", this.b, ", fare="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel$Walk;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerLegUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Walk extends TripPlannerLegUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4761a;
        public final String b;

        public Walk(String str, String travelTimeString) {
            Intrinsics.i(travelTimeString, "travelTimeString");
            this.f4761a = str;
            this.b = travelTimeString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Walk)) {
                return false;
            }
            Walk walk = (Walk) obj;
            return Intrinsics.d(this.f4761a, walk.f4761a) && Intrinsics.d(this.b, walk.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4761a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("Walk(lastStop=", this.f4761a, ", travelTimeString=", this.b, ")");
        }
    }

    public final String a() {
        xj1 xj1Var = new xj1(10);
        if (this instanceof Auto) {
            String str = ((Auto) this).f4754a;
            String str2 = (String) xj1Var.invoke(str);
            return str2 == null ? str : str2;
        }
        if (this instanceof Bus) {
            return ((Bus) this).e;
        }
        if (this instanceof Taxi) {
            String str3 = ((Taxi) this).f4760a;
            String str4 = (String) xj1Var.invoke(str3);
            return str4 == null ? str3 : str4;
        }
        if (this instanceof Walk) {
            String str5 = ((Walk) this).f4761a;
            String str6 = (String) xj1Var.invoke(str5);
            return str6 == null ? str5 : str6;
        }
        if (equals(Ferry.f4756a)) {
            return "";
        }
        if (this instanceof Metro) {
            return ((Metro) this).e;
        }
        if (equals(MonoRail.f4758a) || equals(Railway.f4759a)) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }
}
