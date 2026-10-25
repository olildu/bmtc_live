package app.chalo.usercommutepreference.data.dao;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/dao/UserCommutePreferenceStopPlaceEntity;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCommutePreferenceStopPlaceEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10239a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final double j;
    public final double k;
    public final String l;

    public UserCommutePreferenceStopPlaceEntity(String id, String userId, String cityId, String tag, String label, String stopPlaceType, String stopPlaceId, String stopPlaceName, String str, double d, double d2, String searchPartner) {
        Intrinsics.i(id, "id");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(tag, "tag");
        Intrinsics.i(label, "label");
        Intrinsics.i(stopPlaceType, "stopPlaceType");
        Intrinsics.i(stopPlaceId, "stopPlaceId");
        Intrinsics.i(stopPlaceName, "stopPlaceName");
        Intrinsics.i(searchPartner, "searchPartner");
        this.f10239a = id;
        this.b = userId;
        this.c = cityId;
        this.d = tag;
        this.e = label;
        this.f = stopPlaceType;
        this.g = stopPlaceId;
        this.h = stopPlaceName;
        this.i = str;
        this.j = d;
        this.k = d2;
        this.l = searchPartner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceStopPlaceEntity)) {
            return false;
        }
        UserCommutePreferenceStopPlaceEntity userCommutePreferenceStopPlaceEntity = (UserCommutePreferenceStopPlaceEntity) obj;
        return Intrinsics.d(this.f10239a, userCommutePreferenceStopPlaceEntity.f10239a) && Intrinsics.d(this.b, userCommutePreferenceStopPlaceEntity.b) && Intrinsics.d(this.c, userCommutePreferenceStopPlaceEntity.c) && Intrinsics.d(this.d, userCommutePreferenceStopPlaceEntity.d) && Intrinsics.d(this.e, userCommutePreferenceStopPlaceEntity.e) && Intrinsics.d(this.f, userCommutePreferenceStopPlaceEntity.f) && Intrinsics.d(this.g, userCommutePreferenceStopPlaceEntity.g) && Intrinsics.d(this.h, userCommutePreferenceStopPlaceEntity.h) && Intrinsics.d(this.i, userCommutePreferenceStopPlaceEntity.i) && Double.compare(this.j, userCommutePreferenceStopPlaceEntity.j) == 0 && Double.compare(this.k, userCommutePreferenceStopPlaceEntity.k) == 0 && Intrinsics.d(this.l, userCommutePreferenceStopPlaceEntity.l);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f10239a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.j);
        int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.k);
        return this.l.hashCode() + ((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserCommutePreferenceStopPlaceEntity(id=", this.f10239a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", tag=", this.d, ", label=");
        cb0.t(sbE, this.e, ", stopPlaceType=", this.f, ", stopPlaceId=");
        cb0.t(sbE, this.g, ", stopPlaceName=", this.h, ", stopAddress=");
        sbE.append(this.i);
        sbE.append(", latitude=");
        sbE.append(this.j);
        pk0.z(sbE, ", longitude=", this.k, ", searchPartner=");
        return vo1.p(sbE, this.l, ")");
    }
}
