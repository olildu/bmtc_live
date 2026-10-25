package app.chalo.livetracking.tripplanner.data.models.api.request;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.d;
import defpackage.i71;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/request/MakeTripPlannerRequestData;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MakeTripPlannerRequestData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f4648a;
    public final LatLng b;
    public final ChaloTransitMode c;
    public final long d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final int i;
    public final String j;
    public final String k;
    public final long l;
    public final TripPlannerItineraryType m;
    public final String n;
    public final String o;
    public final boolean p;

    public MakeTripPlannerRequestData(LatLng fromLatLng, LatLng toLatLng, ChaloTransitMode transitMode, long j, String str, String str2, int i, String str3, int i2, String androidModel, String day, long j2, TripPlannerItineraryType itineraryType, String str4, String str5, boolean z) {
        Intrinsics.i(fromLatLng, "fromLatLng");
        Intrinsics.i(toLatLng, "toLatLng");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(androidModel, "androidModel");
        Intrinsics.i(day, "day");
        Intrinsics.i(itineraryType, "itineraryType");
        this.f4648a = fromLatLng;
        this.b = toLatLng;
        this.c = transitMode;
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = str3;
        this.i = i2;
        this.j = androidModel;
        this.k = day;
        this.l = j2;
        this.m = itineraryType;
        this.n = str4;
        this.o = str5;
        this.p = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MakeTripPlannerRequestData)) {
            return false;
        }
        MakeTripPlannerRequestData makeTripPlannerRequestData = (MakeTripPlannerRequestData) obj;
        return Intrinsics.d(this.f4648a, makeTripPlannerRequestData.f4648a) && Intrinsics.d(this.b, makeTripPlannerRequestData.b) && this.c == makeTripPlannerRequestData.c && this.d == makeTripPlannerRequestData.d && Intrinsics.d(this.e, makeTripPlannerRequestData.e) && Intrinsics.d(this.f, makeTripPlannerRequestData.f) && this.g == makeTripPlannerRequestData.g && Intrinsics.d(this.h, makeTripPlannerRequestData.h) && this.i == makeTripPlannerRequestData.i && Intrinsics.d(this.j, makeTripPlannerRequestData.j) && Intrinsics.d(this.k, makeTripPlannerRequestData.k) && this.l == makeTripPlannerRequestData.l && this.m == makeTripPlannerRequestData.m && Intrinsics.d(this.n, makeTripPlannerRequestData.n) && Intrinsics.d(this.o, makeTripPlannerRequestData.o) && this.p == makeTripPlannerRequestData.p;
    }

    public final int hashCode() {
        int iC = n21.c(this.c, i71.d(this.b, this.f4648a.hashCode() * 31, 31), 31);
        long j = this.d;
        int iE = nf1.e(nf1.e((nf1.e((nf1.e(nf1.e((iC + ((int) (j ^ (j >>> 32)))) * 31, 31, this.e), 31, this.f) + this.g) * 31, 31, this.h) + this.i) * 31, 31, this.j), 31, this.k);
        long j2 = this.l;
        int iHashCode = (this.m.hashCode() + ((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        String str = this.n;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.o;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.p ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MakeTripPlannerRequestData(fromLatLng=");
        sb.append(this.f4648a);
        sb.append(", toLatLng=");
        sb.append(this.b);
        sb.append(", transitMode=");
        sb.append(this.c);
        sb.append(", startTimeElapsedFromMidnight=");
        sb.append(this.d);
        cb0.t(sb, ", userId=", this.e, ", currentLanguage=", this.f);
        sb.append(", versionCode=");
        sb.append(this.g);
        sb.append(", city=");
        sb.append(this.h);
        sb.append(", osVersion=");
        sb.append(this.i);
        sb.append(", androidModel=");
        sb.append(this.j);
        d.t(sb, ", day=", this.k, ", startTimeMillis=");
        sb.append(this.l);
        sb.append(", itineraryType=");
        sb.append(this.m);
        cb0.t(sb, ", startStopId=", this.n, ", endStopId=", this.o);
        sb.append(", skipWalkAndAutoLegs=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
