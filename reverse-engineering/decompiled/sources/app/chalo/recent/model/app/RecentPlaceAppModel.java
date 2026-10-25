package app.chalo.recent.model.app;

import app.chalo.location.LatLng;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hz0;
import defpackage.i71;
import defpackage.nf1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/model/app/RecentPlaceAppModel;", "Lapp/chalo/recent/model/app/RecentsType;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RecentPlaceAppModel extends RecentsType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] o = {null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(26)), null, null, null};
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final LatLng j;
    public final RecentsSpecialStatus k;
    public final long l;
    public final int m;
    public final String n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentPlaceAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/model/app/RecentPlaceAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RecentPlaceAppModel> serializer() {
            return RecentPlaceAppModel$$serializer.f9002a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecentPlaceAppModel(int i, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, LatLng latLng, RecentsSpecialStatus recentsSpecialStatus, long j2, int i2, String str8) {
        super(str, str2, j);
        if (895 != (i & 895)) {
            PluginExceptionsKt.b(RecentPlaceAppModel$$serializer.f9002a.getDescriptor(), i, 895);
            throw null;
        }
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        this.j = latLng;
        this.k = recentsSpecialStatus;
        this.l = (i & 1024) == 0 ? -1L : j2;
        this.m = (i & 2048) == 0 ? 0 : i2;
        if ((i & 4096) == 0) {
            this.n = null;
        } else {
            this.n = str8;
        }
    }

    public final RecentPlaceEntity b() {
        return new RecentPlaceEntity(this.e, this.f, this.h, this.i, this.g, this.j, RecentsAppModelKt.d(this.k), this.l, this.m, this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentPlaceAppModel)) {
            return false;
        }
        RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) obj;
        return Intrinsics.d(this.e, recentPlaceAppModel.e) && Intrinsics.d(this.f, recentPlaceAppModel.f) && Intrinsics.d(this.g, recentPlaceAppModel.g) && Intrinsics.d(this.h, recentPlaceAppModel.h) && Intrinsics.d(this.i, recentPlaceAppModel.i) && Intrinsics.d(this.j, recentPlaceAppModel.j) && this.k == recentPlaceAppModel.k && this.l == recentPlaceAppModel.l && this.m == recentPlaceAppModel.m && Intrinsics.d(this.n, recentPlaceAppModel.n);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.e.hashCode() * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (this.k.hashCode() + i71.d(this.j, (iE + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        long j = this.l;
        int i = (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.m) * 31;
        String str2 = this.n;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentPlaceAppModel(placeId=", this.e, ", searchPartner=", this.f, ", locationTitle=");
        cb0.t(sbE, this.g, ", cityId=", this.h, ", locationDescription=");
        sbE.append(this.i);
        sbE.append(", latLng=");
        sbE.append(this.j);
        sbE.append(", recentsSpecialStatus=");
        sbE.append(this.k);
        sbE.append(", accessTime=");
        sbE.append(this.l);
        sbE.append(", accessCount=");
        sbE.append(this.m);
        sbE.append(", label=");
        sbE.append(this.n);
        sbE.append(")");
        return sbE.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentPlaceAppModel(String placeId, String searchPartner, String locationTitle, String cityId, String str, LatLng latLng, RecentsSpecialStatus recentsSpecialStatus, long j, int i, String str2) {
        super(j, placeId, cityId, 0);
        Intrinsics.i(placeId, "placeId");
        Intrinsics.i(searchPartner, "searchPartner");
        Intrinsics.i(locationTitle, "locationTitle");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(recentsSpecialStatus, "recentsSpecialStatus");
        this.e = placeId;
        this.f = searchPartner;
        this.g = locationTitle;
        this.h = cityId;
        this.i = str;
        this.j = latLng;
        this.k = recentsSpecialStatus;
        this.l = j;
        this.m = i;
        this.n = str2;
    }

    public /* synthetic */ RecentPlaceAppModel(String str, String str2, String str3, String str4, String str5, LatLng latLng, RecentsSpecialStatus recentsSpecialStatus, long j, String str6, int i) {
        this(str, str2, str3, str4, str5, latLng, recentsSpecialStatus, (i & 128) != 0 ? -1L : j, (i & 256) != 0 ? 0 : 1, (i & 512) != 0 ? null : str6);
    }
}
