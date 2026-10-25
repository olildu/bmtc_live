package app.chalo.core;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Post_ride_feedback_table;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Post_ride_feedback_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1980a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Long n;

    public Post_ride_feedback_table(String bookingId, String userId, String cityId, String tripId, String routeId, String fromStopName, String toStopName, long j, long j2, String triggerType, String productType, String productSubType, String fillStatus, Long l) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        Intrinsics.i(triggerType, "triggerType");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(fillStatus, "fillStatus");
        this.f1980a = bookingId;
        this.b = userId;
        this.c = cityId;
        this.d = tripId;
        this.e = routeId;
        this.f = fromStopName;
        this.g = toStopName;
        this.h = j;
        this.i = j2;
        this.j = triggerType;
        this.k = productType;
        this.l = productSubType;
        this.m = fillStatus;
        this.n = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Post_ride_feedback_table)) {
            return false;
        }
        Post_ride_feedback_table post_ride_feedback_table = (Post_ride_feedback_table) obj;
        return Intrinsics.d(this.f1980a, post_ride_feedback_table.f1980a) && Intrinsics.d(this.b, post_ride_feedback_table.b) && Intrinsics.d(this.c, post_ride_feedback_table.c) && Intrinsics.d(this.d, post_ride_feedback_table.d) && Intrinsics.d(this.e, post_ride_feedback_table.e) && Intrinsics.d(this.f, post_ride_feedback_table.f) && Intrinsics.d(this.g, post_ride_feedback_table.g) && this.h == post_ride_feedback_table.h && this.i == post_ride_feedback_table.i && Intrinsics.d(this.j, post_ride_feedback_table.j) && Intrinsics.d(this.k, post_ride_feedback_table.k) && Intrinsics.d(this.l, post_ride_feedback_table.l) && Intrinsics.d(this.m, post_ride_feedback_table.m) && Intrinsics.d(this.n, post_ride_feedback_table.n);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f1980a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        long j = this.h;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.i;
        int iE2 = nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        Long l = this.n;
        return iE2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Post_ride_feedback_table(bookingId=", this.f1980a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", tripId=", this.d, ", routeId=");
        cb0.t(sbE, this.e, ", fromStopName=", this.f, ", toStopName=");
        n21.p(this.h, this.g, ", tripStartTimestamp=", sbE);
        xs.r(this.i, ", tripEndTimestamp=", ", triggerType=", sbE);
        cb0.t(sbE, this.j, ", productType=", this.k, ", productSubType=");
        cb0.t(sbE, this.l, ", fillStatus=", this.m, ", prfSubmittedAt=");
        return pk0.l(sbE, this.n, ")");
    }
}
