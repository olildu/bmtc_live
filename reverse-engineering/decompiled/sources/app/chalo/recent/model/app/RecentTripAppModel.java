package app.chalo.recent.model.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.ChaloDescriptiveLocationEntityModel;
import app.chalo.recent.database.entities.RecentTripEntity;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.u01;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/model/app/RecentTripAppModel;", "Lapp/chalo/recent/model/app/RecentsType;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RecentTripAppModel extends RecentsType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new u01(0)), null, null};
    public final String e;
    public final String f;
    public final UniversalSearchDescriptiveLocationAppModel g;
    public final UniversalSearchDescriptiveLocationAppModel h;
    public final ChaloTransitMode i;
    public final long j;
    public final int k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentTripAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/model/app/RecentTripAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RecentTripAppModel> serializer() {
            return RecentTripAppModel$$serializer.f9004a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecentTripAppModel(int i, String str, String str2, long j, String str3, String str4, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2, ChaloTransitMode chaloTransitMode, long j2, int i2) {
        super(str, str2, j);
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(RecentTripAppModel$$serializer.f9004a.getDescriptor(), i, 255);
            throw null;
        }
        this.e = str3;
        this.f = str4;
        this.g = universalSearchDescriptiveLocationAppModel;
        this.h = universalSearchDescriptiveLocationAppModel2;
        this.i = chaloTransitMode;
        if ((i & 256) == 0) {
            this.j = -1L;
        } else {
            this.j = j2;
        }
        if ((i & 512) == 0) {
            this.k = 0;
        } else {
            this.k = i2;
        }
    }

    public final RecentTripEntity b() {
        ChaloDescriptiveLocationEntityModel chaloDescriptiveLocationEntityModelA;
        ChaloDescriptiveLocationEntityModel chaloDescriptiveLocationEntityModelA2 = this.g.a();
        if (chaloDescriptiveLocationEntityModelA2 == null || (chaloDescriptiveLocationEntityModelA = this.h.a()) == null) {
            return null;
        }
        return new RecentTripEntity(this.e, this.f, chaloDescriptiveLocationEntityModelA2, chaloDescriptiveLocationEntityModelA, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentTripAppModel)) {
            return false;
        }
        RecentTripAppModel recentTripAppModel = (RecentTripAppModel) obj;
        return Intrinsics.d(this.e, recentTripAppModel.e) && Intrinsics.d(this.f, recentTripAppModel.f) && Intrinsics.d(this.g, recentTripAppModel.g) && Intrinsics.d(this.h, recentTripAppModel.h) && this.i == recentTripAppModel.i && this.j == recentTripAppModel.j && this.k == recentTripAppModel.k;
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + ((this.g.hashCode() + nf1.e(this.e.hashCode() * 31, 31, this.f)) * 31)) * 31;
        ChaloTransitMode chaloTransitMode = this.i;
        int iHashCode2 = chaloTransitMode == null ? 0 : chaloTransitMode.hashCode();
        long j = this.j;
        return ((((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentTripAppModel(tripId=", this.e, ", cityId=", this.f, ", fromLocation=");
        sbE.append(this.g);
        sbE.append(", toLocation=");
        sbE.append(this.h);
        sbE.append(", transitMode=");
        sbE.append(this.i);
        sbE.append(", accessTime=");
        sbE.append(this.j);
        return t10.k(sbE, ", accessCount=", this.k, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentTripAppModel(String tripId, String cityId, UniversalSearchDescriptiveLocationAppModel fromLocation, UniversalSearchDescriptiveLocationAppModel toLocation, ChaloTransitMode chaloTransitMode, long j, int i) {
        super(j, tripId, cityId, 0);
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(fromLocation, "fromLocation");
        Intrinsics.i(toLocation, "toLocation");
        this.e = tripId;
        this.f = cityId;
        this.g = fromLocation;
        this.h = toLocation;
        this.i = chaloTransitMode;
        this.j = j;
        this.k = i;
    }
}
