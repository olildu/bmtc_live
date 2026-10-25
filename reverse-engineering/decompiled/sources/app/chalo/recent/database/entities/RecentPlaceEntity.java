package app.chalo.recent.database.entities;

import app.chalo.location.LatLng;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/database/entities/RecentPlaceEntity;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RecentPlaceEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(27)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8940a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final LatLng f;
    public final RecentsSpecialEntityStatus g;
    public final long h;
    public final int i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentPlaceEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentPlaceEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RecentPlaceEntity> serializer() {
            return RecentPlaceEntity$$serializer.f8941a;
        }
    }

    public /* synthetic */ RecentPlaceEntity(int i, String str, String str2, String str3, String str4, String str5, LatLng latLng, RecentsSpecialEntityStatus recentsSpecialEntityStatus, long j, int i2, String str6) {
        if (119 != (i & 119)) {
            PluginExceptionsKt.b(RecentPlaceEntity$$serializer.f8941a.getDescriptor(), i, 119);
            throw null;
        }
        this.f8940a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        this.f = latLng;
        this.g = recentsSpecialEntityStatus;
        if ((i & 128) == 0) {
            this.h = -1L;
        } else {
            this.h = j;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentPlaceEntity)) {
            return false;
        }
        RecentPlaceEntity recentPlaceEntity = (RecentPlaceEntity) obj;
        return Intrinsics.d(this.f8940a, recentPlaceEntity.f8940a) && Intrinsics.d(this.b, recentPlaceEntity.b) && Intrinsics.d(this.c, recentPlaceEntity.c) && Intrinsics.d(this.d, recentPlaceEntity.d) && Intrinsics.d(this.e, recentPlaceEntity.e) && Intrinsics.d(this.f, recentPlaceEntity.f) && this.g == recentPlaceEntity.g && this.h == recentPlaceEntity.h && this.i == recentPlaceEntity.i && Intrinsics.d(this.j, recentPlaceEntity.j);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f8940a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (this.g.hashCode() + i71.d(this.f, nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31)) * 31;
        long j = this.h;
        int i = (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.i) * 31;
        String str2 = this.j;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentPlaceEntity(placeId=", this.f8940a, ", searchPartner=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", locationDescription=", this.d, ", locationTitle=");
        sbE.append(this.e);
        sbE.append(", latLng=");
        sbE.append(this.f);
        sbE.append(", recentsSpecialEntityStatus=");
        sbE.append(this.g);
        sbE.append(", accessTime=");
        sbE.append(this.h);
        sbE.append(", accessCount=");
        sbE.append(this.i);
        sbE.append(", label=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public RecentPlaceEntity(String placeId, String searchPartner, String cityId, String str, String locationTitle, LatLng latLng, RecentsSpecialEntityStatus recentsSpecialEntityStatus, long j, int i, String str2) {
        Intrinsics.i(placeId, "placeId");
        Intrinsics.i(searchPartner, "searchPartner");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(locationTitle, "locationTitle");
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(recentsSpecialEntityStatus, "recentsSpecialEntityStatus");
        this.f8940a = placeId;
        this.b = searchPartner;
        this.c = cityId;
        this.d = str;
        this.e = locationTitle;
        this.f = latLng;
        this.g = recentsSpecialEntityStatus;
        this.h = j;
        this.i = i;
        this.j = str2;
    }
}
