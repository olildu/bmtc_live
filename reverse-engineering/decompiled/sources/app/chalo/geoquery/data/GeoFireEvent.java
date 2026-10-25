package app.chalo.geoquery.data;

import app.chalo.location.LatLng;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/geoquery/data/GeoFireEvent;", "", "Type", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GeoFireEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f2790a;
    public final LiveTripInfoDataModel b;
    public final LatLng c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/geoquery/data/GeoFireEvent$Type;", "", "<init>", "(Ljava/lang/String;I)V", "ENTERED", "MOVED", "EXITED", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Type {
        ENTERED,
        MOVED,
        EXITED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }
    }

    public GeoFireEvent(Type type, LiveTripInfoDataModel liveTripInfoDataModel, LatLng queryCenter) {
        Intrinsics.i(queryCenter, "queryCenter");
        this.f2790a = type;
        this.b = liveTripInfoDataModel;
        this.c = queryCenter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoFireEvent)) {
            return false;
        }
        GeoFireEvent geoFireEvent = (GeoFireEvent) obj;
        return this.f2790a == geoFireEvent.f2790a && Intrinsics.d(this.b, geoFireEvent.b) && Intrinsics.d(this.c, geoFireEvent.c);
    }

    public final int hashCode() {
        Type type = this.f2790a;
        int iHashCode = (type == null ? 0 : type.hashCode()) * 31;
        LiveTripInfoDataModel liveTripInfoDataModel = this.b;
        return this.c.hashCode() + ((iHashCode + (liveTripInfoDataModel != null ? liveTripInfoDataModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GeoFireEvent(requestId=, type=" + this.f2790a + ", cardInfo=" + this.b + ", queryCenter=" + this.c + ")";
    }
}
