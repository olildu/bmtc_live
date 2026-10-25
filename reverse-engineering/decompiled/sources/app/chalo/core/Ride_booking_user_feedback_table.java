package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import defpackage.dd;
import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Ride_booking_user_feedback_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Ride_booking_user_feedback_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2008a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Ride_booking_user_feedback_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f2009a;

        public Adapter(ColumnAdapter subtagsAdapter) {
            Intrinsics.i(subtagsAdapter, "subtagsAdapter");
            this.f2009a = subtagsAdapter;
        }
    }

    public Ride_booking_user_feedback_table(long j, String bookingId, String city, String str, String str2, List subtags) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(city, "city");
        Intrinsics.i(subtags, "subtags");
        this.f2008a = bookingId;
        this.b = city;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.f = subtags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ride_booking_user_feedback_table)) {
            return false;
        }
        Ride_booking_user_feedback_table ride_booking_user_feedback_table = (Ride_booking_user_feedback_table) obj;
        return Intrinsics.d(this.f2008a, ride_booking_user_feedback_table.f2008a) && Intrinsics.d(this.b, ride_booking_user_feedback_table.b) && this.c == ride_booking_user_feedback_table.c && Intrinsics.d(this.d, ride_booking_user_feedback_table.d) && Intrinsics.d(this.e, ride_booking_user_feedback_table.e) && Intrinsics.d(this.f, ride_booking_user_feedback_table.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f2008a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.d;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Ride_booking_user_feedback_table(bookingId=", this.f2008a, ", city=", this.b, ", rating=");
        dd.k(this.c, ", selectedReason=", this.d, sbE);
        sbE.append(", comments=");
        sbE.append(this.e);
        sbE.append(", subtags=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
