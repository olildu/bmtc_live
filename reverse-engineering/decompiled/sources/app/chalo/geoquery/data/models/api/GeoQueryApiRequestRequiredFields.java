package app.chalo.geoquery.data.models.api;

import app.chalo.models.ApiRequestEmptyObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestRequiredFields;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GeoQueryApiRequestRequiredFields {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeoQueryApiRequestNearbyBuses f2803a;
    public final ApiRequestEmptyObject b;
    public final ApiRequestEmptyObject c;
    public final GeoQueryApiRequestReportProblem d;
    public final GeoQueryApiRequestDisruptionInfo e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestRequiredFields$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestRequiredFields;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GeoQueryApiRequestRequiredFields> serializer() {
            return GeoQueryApiRequestRequiredFields$$serializer.f2804a;
        }
    }

    public /* synthetic */ GeoQueryApiRequestRequiredFields(int i, GeoQueryApiRequestNearbyBuses geoQueryApiRequestNearbyBuses, ApiRequestEmptyObject apiRequestEmptyObject, ApiRequestEmptyObject apiRequestEmptyObject2, GeoQueryApiRequestReportProblem geoQueryApiRequestReportProblem, GeoQueryApiRequestDisruptionInfo geoQueryApiRequestDisruptionInfo) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(GeoQueryApiRequestRequiredFields$$serializer.f2804a.getDescriptor(), i, 1);
            throw null;
        }
        this.f2803a = geoQueryApiRequestNearbyBuses;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = apiRequestEmptyObject;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = apiRequestEmptyObject2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = geoQueryApiRequestReportProblem;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = geoQueryApiRequestDisruptionInfo;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryApiRequestRequiredFields)) {
            return false;
        }
        GeoQueryApiRequestRequiredFields geoQueryApiRequestRequiredFields = (GeoQueryApiRequestRequiredFields) obj;
        return Intrinsics.d(this.f2803a, geoQueryApiRequestRequiredFields.f2803a) && Intrinsics.d(this.b, geoQueryApiRequestRequiredFields.b) && Intrinsics.d(this.c, geoQueryApiRequestRequiredFields.c) && Intrinsics.d(this.d, geoQueryApiRequestRequiredFields.d) && Intrinsics.d(this.e, geoQueryApiRequestRequiredFields.e);
    }

    public final int hashCode() {
        int iHashCode = this.f2803a.hashCode() * 31;
        ApiRequestEmptyObject apiRequestEmptyObject = this.b;
        int iHashCode2 = (iHashCode + (apiRequestEmptyObject == null ? 0 : apiRequestEmptyObject.hashCode())) * 31;
        ApiRequestEmptyObject apiRequestEmptyObject2 = this.c;
        int iHashCode3 = (iHashCode2 + (apiRequestEmptyObject2 == null ? 0 : apiRequestEmptyObject2.hashCode())) * 31;
        GeoQueryApiRequestReportProblem geoQueryApiRequestReportProblem = this.d;
        int iHashCode4 = (iHashCode3 + (geoQueryApiRequestReportProblem == null ? 0 : geoQueryApiRequestReportProblem.f2801a.hashCode())) * 31;
        GeoQueryApiRequestDisruptionInfo geoQueryApiRequestDisruptionInfo = this.e;
        return iHashCode4 + (geoQueryApiRequestDisruptionInfo != null ? geoQueryApiRequestDisruptionInfo.f2793a.hashCode() : 0);
    }

    public final String toString() {
        return "GeoQueryApiRequestRequiredFields(nearbyBuses=" + this.f2803a + ", cityInfo=" + this.b + ", cardsInfo=" + this.c + ", reportProblem=" + this.d + ", bannerInfo=" + this.e + ")";
    }

    public GeoQueryApiRequestRequiredFields(GeoQueryApiRequestNearbyBuses nearbyBuses, ApiRequestEmptyObject apiRequestEmptyObject, ApiRequestEmptyObject apiRequestEmptyObject2, GeoQueryApiRequestReportProblem geoQueryApiRequestReportProblem, GeoQueryApiRequestDisruptionInfo geoQueryApiRequestDisruptionInfo) {
        Intrinsics.i(nearbyBuses, "nearbyBuses");
        this.f2803a = nearbyBuses;
        this.b = apiRequestEmptyObject;
        this.c = apiRequestEmptyObject2;
        this.d = geoQueryApiRequestReportProblem;
        this.e = geoQueryApiRequestDisruptionInfo;
    }
}
