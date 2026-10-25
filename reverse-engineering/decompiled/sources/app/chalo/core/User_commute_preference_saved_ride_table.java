package app.chalo.core;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/User_commute_preference_saved_ride_table;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class User_commute_preference_saved_ride_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2024a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;

    public User_commute_preference_saved_ride_table(long j, String id, String userId, String cityId, String origin, String destination) {
        Intrinsics.i(id, "id");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(origin, "origin");
        Intrinsics.i(destination, "destination");
        this.f2024a = id;
        this.b = userId;
        this.c = cityId;
        this.d = j;
        this.e = origin;
        this.f = destination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User_commute_preference_saved_ride_table)) {
            return false;
        }
        User_commute_preference_saved_ride_table user_commute_preference_saved_ride_table = (User_commute_preference_saved_ride_table) obj;
        return Intrinsics.d(this.f2024a, user_commute_preference_saved_ride_table.f2024a) && Intrinsics.d(this.b, user_commute_preference_saved_ride_table.b) && Intrinsics.d(this.c, user_commute_preference_saved_ride_table.c) && this.d == user_commute_preference_saved_ride_table.d && Intrinsics.d(this.e, user_commute_preference_saved_ride_table.e) && Intrinsics.d(this.f, user_commute_preference_saved_ride_table.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f2024a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        return this.f.hashCode() + nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("User_commute_preference_saved_ride_table(id=", this.f2024a, ", userId=", this.b, ", cityId=");
        n21.p(this.d, this.c, ", time=", sbE);
        cb0.t(sbE, ", origin=", this.e, ", destination=", this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
