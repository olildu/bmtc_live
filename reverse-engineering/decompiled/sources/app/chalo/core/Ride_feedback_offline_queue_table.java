package app.chalo.core;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Ride_feedback_offline_queue_table;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Ride_feedback_offline_queue_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2010a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;

    public Ride_feedback_offline_queue_table(String bookingId, String userId, String cityId, String productType, String productSubType, Long l, String str, String str2, String str3, long j, long j2) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f2010a = bookingId;
        this.b = userId;
        this.c = cityId;
        this.d = productType;
        this.e = productSubType;
        this.f = l;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = j;
        this.k = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ride_feedback_offline_queue_table)) {
            return false;
        }
        Ride_feedback_offline_queue_table ride_feedback_offline_queue_table = (Ride_feedback_offline_queue_table) obj;
        return Intrinsics.d(this.f2010a, ride_feedback_offline_queue_table.f2010a) && Intrinsics.d(this.b, ride_feedback_offline_queue_table.b) && Intrinsics.d(this.c, ride_feedback_offline_queue_table.c) && Intrinsics.d(this.d, ride_feedback_offline_queue_table.d) && Intrinsics.d(this.e, ride_feedback_offline_queue_table.e) && Intrinsics.d(this.f, ride_feedback_offline_queue_table.f) && Intrinsics.d(this.g, ride_feedback_offline_queue_table.g) && Intrinsics.d(this.h, ride_feedback_offline_queue_table.h) && Intrinsics.d(this.i, ride_feedback_offline_queue_table.i) && this.j == ride_feedback_offline_queue_table.j && this.k == ride_feedback_offline_queue_table.k;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f2010a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Long l = this.f;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.g;
        int iE2 = nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int iHashCode2 = (iE2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.j;
        long j2 = this.k;
        return ((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Ride_feedback_offline_queue_table(bookingId=", this.f2010a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
        cb0.r(this.f, this.e, ", rating=", ", feedbackTag=", sbE);
        cb0.t(sbE, this.g, ", feedbackSubtag=", this.h, ", comment=");
        n21.p(this.j, this.i, ", skipped=", sbE);
        return t10.g(this.k, ", submissionTimestamp=", ")", sbE);
    }
}
