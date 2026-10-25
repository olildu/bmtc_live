package app.chalo.usercommutepreference.data.dao;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/dao/UserCommutePreferenceSavedRideEntity;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCommutePreferenceSavedRideEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10238a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;

    public UserCommutePreferenceSavedRideEntity(long j, String id, String userId, String cityId, String origin, String destination) {
        Intrinsics.i(id, "id");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(origin, "origin");
        Intrinsics.i(destination, "destination");
        this.f10238a = id;
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
        if (!(obj instanceof UserCommutePreferenceSavedRideEntity)) {
            return false;
        }
        UserCommutePreferenceSavedRideEntity userCommutePreferenceSavedRideEntity = (UserCommutePreferenceSavedRideEntity) obj;
        return Intrinsics.d(this.f10238a, userCommutePreferenceSavedRideEntity.f10238a) && Intrinsics.d(this.b, userCommutePreferenceSavedRideEntity.b) && Intrinsics.d(this.c, userCommutePreferenceSavedRideEntity.c) && this.d == userCommutePreferenceSavedRideEntity.d && Intrinsics.d(this.e, userCommutePreferenceSavedRideEntity.e) && Intrinsics.d(this.f, userCommutePreferenceSavedRideEntity.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f10238a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        return this.f.hashCode() + nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserCommutePreferenceSavedRideEntity(id=", this.f10238a, ", userId=", this.b, ", cityId=");
        n21.p(this.d, this.c, ", time=", sbE);
        cb0.t(sbE, ", origin=", this.e, ", destination=", this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
