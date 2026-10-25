package app.chalo.citydata.data.model.app;

import defpackage.hq0;
import in.juspay.hypersdk.analytics.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/CityDataConfigForCity;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CityDataConfigForCity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1703a;
    public final boolean b;
    public final long c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/CityDataConfigForCity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/CityDataConfigForCity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CityDataConfigForCity> serializer() {
            return CityDataConfigForCity$$serializer.f1704a;
        }
    }

    public CityDataConfigForCity(String str, int i, long j, boolean z) {
        this.f1703a = str;
        this.b = z;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityDataConfigForCity)) {
            return false;
        }
        CityDataConfigForCity cityDataConfigForCity = (CityDataConfigForCity) obj;
        return Intrinsics.d(this.f1703a, cityDataConfigForCity.f1703a) && this.b == cityDataConfigForCity.b && this.c == cityDataConfigForCity.c && this.d == cityDataConfigForCity.d;
    }

    public final int hashCode() {
        int iHashCode = this.f1703a.hashCode() * 31;
        int i = this.b ? 1231 : 1237;
        long j = this.c;
        return ((((iHashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("CityDataConfigForCity(cityName=", this.f1703a, ", isCityDataMigrationDone=", ", savedRouteTimeToLiveInMs=", this.b);
        sbM.append(this.c);
        sbM.append(", mostRecentRoutesToSyncCount=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ CityDataConfigForCity(boolean z, String str, int i, int i2, long j) {
        this.f1703a = (i & 1) == 0 ? LogConstants.DEFAULT_CHANNEL : str;
        this.b = (i & 2) == 0 ? false : z;
        if ((i & 4) == 0) {
            this.c = 172800000L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = 5;
        } else {
            this.d = i2;
        }
    }
}
