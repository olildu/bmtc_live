package app.chalo.stoptripdetails.data.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.q7;
import defpackage.r30;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel;", "", "FrequencyTrip", "FixedTime", "UnknownTiming", "Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel$FixedTime;", "Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel$FrequencyTrip;", "Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel$UnknownTiming;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopTripDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9501a;
    public final TimeTableStatus b;
    public final int c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel$FixedTime;", "Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FixedTime extends StopTripDetailsAppModel {
        public final String e;
        public final TimeTableStatus f;
        public final StopAppModel g;
        public final StopAppModel h;
        public final String i;
        public final String j;
        public final List k;
        public final List l;
        public final String m;
        public final int n;
        public final String o;
        public final int p;
        public final String q;
        public final RouteNamingSchemeType r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedTime(String str, TimeTableStatus ttStatus, StopAppModel stopAppModel, StopAppModel stopAppModel2, String routeId, String str2, List specialFeatures, List spf, String tripId, int i, String str3, int i2, String str4, RouteNamingSchemeType routeNamingScheme) {
            super(str, ttStatus, i, routeId);
            Intrinsics.i(ttStatus, "ttStatus");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(specialFeatures, "specialFeatures");
            Intrinsics.i(spf, "spf");
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(routeNamingScheme, "routeNamingScheme");
            this.e = str;
            this.f = ttStatus;
            this.g = stopAppModel;
            this.h = stopAppModel2;
            this.i = routeId;
            this.j = str2;
            this.k = specialFeatures;
            this.l = spf;
            this.m = tripId;
            this.n = i;
            this.o = str3;
            this.p = i2;
            this.q = str4;
            this.r = routeNamingScheme;
        }

        @Override // app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF9501a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FixedTime)) {
                return false;
            }
            FixedTime fixedTime = (FixedTime) obj;
            return Intrinsics.d(this.e, fixedTime.e) && this.f == fixedTime.f && Intrinsics.d(this.g, fixedTime.g) && Intrinsics.d(this.h, fixedTime.h) && Intrinsics.d(this.i, fixedTime.i) && Intrinsics.d(this.j, fixedTime.j) && Intrinsics.d(this.k, fixedTime.k) && Intrinsics.d(this.l, fixedTime.l) && Intrinsics.d(this.m, fixedTime.m) && this.n == fixedTime.n && Intrinsics.d(this.o, fixedTime.o) && this.p == fixedTime.p && Intrinsics.d(this.q, fixedTime.q) && this.r == fixedTime.r;
        }

        public final int hashCode() {
            int iE = (nf1.e((nf1.e(r30.b(r30.b(nf1.e(nf1.e(n21.b(this.h, n21.b(this.g, (this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m) + this.n) * 31, 31, this.o) + this.p) * 31;
            String str = this.q;
            return this.r.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FixedTime(id=");
            sb.append(this.e);
            sb.append(", ttStatus=");
            sb.append(this.f);
            sb.append(", firstStop=");
            sb.append(this.g);
            sb.append(", lastStop=");
            sb.append(this.h);
            sb.append(", routeId=");
            cb0.t(sb, this.i, ", routeName=", this.j, ", specialFeatures=");
            dd.o(sb, this.k, ", spf=", this.l, ", tripId=");
            cb0.o(this.n, this.m, ", ttSid=", ", platform=", sb);
            cb0.o(this.p, this.o, ", arrivalTime=", ", viaString=", sb);
            sb.append(this.q);
            sb.append(", routeNamingScheme=");
            sb.append(this.r);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel$FrequencyTrip;", "Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FrequencyTrip extends StopTripDetailsAppModel {
        public final String e;
        public final List f;
        public final TimeTableStatus g;
        public final StopAppModel h;
        public final StopAppModel i;
        public final String j;
        public final String k;
        public final List l;
        public final List m;
        public final String n;
        public final int o;
        public final String p;
        public final String q;
        public final RouteNamingSchemeType r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrequencyTrip(String str, List frequencyDataArray, TimeTableStatus ttStatus, StopAppModel stopAppModel, StopAppModel stopAppModel2, String routeId, String str2, List specialFeatures, List spf, String tripId, int i, String str3, String str4, RouteNamingSchemeType routeNamingScheme) {
            super(str, ttStatus, i, routeId);
            Intrinsics.i(frequencyDataArray, "frequencyDataArray");
            Intrinsics.i(ttStatus, "ttStatus");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(specialFeatures, "specialFeatures");
            Intrinsics.i(spf, "spf");
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(routeNamingScheme, "routeNamingScheme");
            this.e = str;
            this.f = frequencyDataArray;
            this.g = ttStatus;
            this.h = stopAppModel;
            this.i = stopAppModel2;
            this.j = routeId;
            this.k = str2;
            this.l = specialFeatures;
            this.m = spf;
            this.n = tripId;
            this.o = i;
            this.p = str3;
            this.q = str4;
            this.r = routeNamingScheme;
        }

        @Override // app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF9501a() {
            return this.e;
        }

        public final Integer c(int i) {
            Object next;
            TimeIntervalAppModel timeIntervalAppModel;
            FrequencyAppModel frequencyAppModel;
            Iterator it = this.f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                frequencyAppModel = (FrequencyAppModel) next;
                if (frequencyAppModel.f9493a.a(i)) {
                    break;
                }
            } while (frequencyAppModel.f9493a.f9503a <= i);
            FrequencyAppModel frequencyAppModel2 = (FrequencyAppModel) next;
            if (frequencyAppModel2 == null || (timeIntervalAppModel = frequencyAppModel2.f9493a) == null) {
                return null;
            }
            return Integer.valueOf(timeIntervalAppModel.f9503a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyTrip)) {
                return false;
            }
            FrequencyTrip frequencyTrip = (FrequencyTrip) obj;
            return Intrinsics.d(this.e, frequencyTrip.e) && Intrinsics.d(this.f, frequencyTrip.f) && this.g == frequencyTrip.g && Intrinsics.d(this.h, frequencyTrip.h) && Intrinsics.d(this.i, frequencyTrip.i) && Intrinsics.d(this.j, frequencyTrip.j) && Intrinsics.d(this.k, frequencyTrip.k) && Intrinsics.d(this.l, frequencyTrip.l) && Intrinsics.d(this.m, frequencyTrip.m) && Intrinsics.d(this.n, frequencyTrip.n) && this.o == frequencyTrip.o && Intrinsics.d(this.p, frequencyTrip.p) && Intrinsics.d(this.q, frequencyTrip.q) && this.r == frequencyTrip.r;
        }

        public final int hashCode() {
            int iE = nf1.e((nf1.e(r30.b(r30.b(nf1.e(nf1.e(n21.b(this.i, n21.b(this.h, (this.g.hashCode() + r30.b(this.e.hashCode() * 31, 31, this.f)) * 31, 31), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n) + this.o) * 31, 31, this.p);
            String str = this.q;
            return this.r.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbH = q7.h("FrequencyTrip(id=", this.e, ", frequencyDataArray=", ", ttStatus=", this.f);
            sbH.append(this.g);
            sbH.append(", firstStop=");
            sbH.append(this.h);
            sbH.append(", lastStop=");
            sbH.append(this.i);
            sbH.append(", routeId=");
            sbH.append(this.j);
            sbH.append(", routeName=");
            pk0.w(this.k, ", specialFeatures=", ", spf=", sbH, this.l);
            cb0.s(", tripId=", this.n, ", ttSid=", sbH, this.m);
            pk0.t(this.o, ", platform=", this.p, ", viaString=", sbH);
            sbH.append(this.q);
            sbH.append(", routeNamingScheme=");
            sbH.append(this.r);
            sbH.append(")");
            return sbH.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel$UnknownTiming;", "Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownTiming extends StopTripDetailsAppModel {
        public final String e;
        public final TimeTableStatus f;
        public final StopAppModel g;
        public final StopAppModel h;
        public final String i;
        public final String j;
        public final List k;
        public final List l;
        public final String m;
        public final int n;
        public final String o;
        public final String p;
        public final RouteNamingSchemeType q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownTiming(String str, TimeTableStatus ttStatus, StopAppModel stopAppModel, StopAppModel stopAppModel2, String routeId, String str2, List specialFeatures, List spf, String tripId, int i, String str3, String str4, RouteNamingSchemeType routeNamingScheme) {
            super(str, ttStatus, i, routeId);
            Intrinsics.i(ttStatus, "ttStatus");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(specialFeatures, "specialFeatures");
            Intrinsics.i(spf, "spf");
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(routeNamingScheme, "routeNamingScheme");
            this.e = str;
            this.f = ttStatus;
            this.g = stopAppModel;
            this.h = stopAppModel2;
            this.i = routeId;
            this.j = str2;
            this.k = specialFeatures;
            this.l = spf;
            this.m = tripId;
            this.n = i;
            this.o = str3;
            this.p = str4;
            this.q = routeNamingScheme;
        }

        @Override // app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF9501a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownTiming)) {
                return false;
            }
            UnknownTiming unknownTiming = (UnknownTiming) obj;
            return Intrinsics.d(this.e, unknownTiming.e) && this.f == unknownTiming.f && Intrinsics.d(this.g, unknownTiming.g) && Intrinsics.d(this.h, unknownTiming.h) && Intrinsics.d(this.i, unknownTiming.i) && Intrinsics.d(this.j, unknownTiming.j) && Intrinsics.d(this.k, unknownTiming.k) && Intrinsics.d(this.l, unknownTiming.l) && Intrinsics.d(this.m, unknownTiming.m) && this.n == unknownTiming.n && Intrinsics.d(this.o, unknownTiming.o) && Intrinsics.d(this.p, unknownTiming.p) && this.q == unknownTiming.q;
        }

        public final int hashCode() {
            int iE = nf1.e((nf1.e(r30.b(r30.b(nf1.e(nf1.e(n21.b(this.h, n21.b(this.g, (this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m) + this.n) * 31, 31, this.o);
            String str = this.p;
            return this.q.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UnknownTiming(id=");
            sb.append(this.e);
            sb.append(", ttStatus=");
            sb.append(this.f);
            sb.append(", firstStop=");
            sb.append(this.g);
            sb.append(", lastStop=");
            sb.append(this.h);
            sb.append(", routeId=");
            cb0.t(sb, this.i, ", routeName=", this.j, ", specialFeatures=");
            dd.o(sb, this.k, ", spf=", this.l, ", tripId=");
            cb0.o(this.n, this.m, ", ttSid=", ", platform=", sb);
            cb0.t(sb, this.o, ", viaString=", this.p, ", routeNamingScheme=");
            sb.append(this.q);
            sb.append(")");
            return sb.toString();
        }
    }

    public StopTripDetailsAppModel(String str, TimeTableStatus timeTableStatus, int i, String str2) {
        this.f9501a = str;
        this.b = timeTableStatus;
        this.c = i;
        this.d = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF9501a() {
        return this.f9501a;
    }

    public final int b(int i) {
        if (this instanceof FixedTime) {
            return ((FixedTime) this).p;
        }
        if (!(this instanceof FrequencyTrip)) {
            if (this instanceof UnknownTiming) {
                return 0;
            }
            throw new NoWhenBranchMatchedException();
        }
        Integer numC = ((FrequencyTrip) this).c(i);
        if (numC != null) {
            return numC.intValue();
        }
        return 0;
    }
}
