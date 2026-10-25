package app.chalo.core;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/User_commute_preference_place_table;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class User_commute_preference_place_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2023a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final double i;
    public final double j;
    public final String k;

    public User_commute_preference_place_table(String id, String userId, String cityId, String tag, String label, String stopPlaceId, String stopPlaceName, String str, double d, double d2, String searchPartner) {
        Intrinsics.i(id, "id");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(tag, "tag");
        Intrinsics.i(label, "label");
        Intrinsics.i(stopPlaceId, "stopPlaceId");
        Intrinsics.i(stopPlaceName, "stopPlaceName");
        Intrinsics.i(searchPartner, "searchPartner");
        this.f2023a = id;
        this.b = userId;
        this.c = cityId;
        this.d = tag;
        this.e = label;
        this.f = stopPlaceId;
        this.g = stopPlaceName;
        this.h = str;
        this.i = d;
        this.j = d2;
        this.k = searchPartner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User_commute_preference_place_table)) {
            return false;
        }
        User_commute_preference_place_table user_commute_preference_place_table = (User_commute_preference_place_table) obj;
        return Intrinsics.d(this.f2023a, user_commute_preference_place_table.f2023a) && Intrinsics.d(this.b, user_commute_preference_place_table.b) && Intrinsics.d(this.c, user_commute_preference_place_table.c) && Intrinsics.d(this.d, user_commute_preference_place_table.d) && Intrinsics.d(this.e, user_commute_preference_place_table.e) && Intrinsics.d(this.f, user_commute_preference_place_table.f) && Intrinsics.d(this.g, user_commute_preference_place_table.g) && Intrinsics.d(this.h, user_commute_preference_place_table.h) && Double.compare(this.i, user_commute_preference_place_table.i) == 0 && Double.compare(this.j, user_commute_preference_place_table.j) == 0 && Intrinsics.d(this.k, user_commute_preference_place_table.k);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e((((this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f2023a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31) + 76210407) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.i);
        int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.j);
        return this.k.hashCode() + ((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("User_commute_preference_place_table(id=", this.f2023a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", tag=", this.d, ", label=");
        cb0.t(sbE, this.e, ", stopPlaceType=PLACE, stopPlaceId=", this.f, ", stopPlaceName=");
        cb0.t(sbE, this.g, ", stopAddress=", this.h, ", latitude=");
        sbE.append(this.i);
        pk0.z(sbE, ", longitude=", this.j, ", searchPartner=");
        return vo1.p(sbE, this.k, ")");
    }
}
