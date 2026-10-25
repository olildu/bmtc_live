package app.chalo.stoptripdetails.data.model.api;

import defpackage.hf0;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryAndRouteStatusApiResponseModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LocationSummaryAndRouteStatusApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9473a;
    public final LocationSummaryApiResponseModel b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryAndRouteStatusApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryAndRouteStatusApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LocationSummaryAndRouteStatusApiResponseModel> serializer() {
            return LocationSummaryAndRouteStatusApiResponseModel$$serializer.f9474a;
        }
    }

    public /* synthetic */ LocationSummaryAndRouteStatusApiResponseModel(int i, List list, LocationSummaryApiResponseModel locationSummaryApiResponseModel) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(LocationSummaryAndRouteStatusApiResponseModel$$serializer.f9474a.getDescriptor(), i, 3);
            throw null;
        }
        this.f9473a = list;
        this.b = locationSummaryApiResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSummaryAndRouteStatusApiResponseModel)) {
            return false;
        }
        LocationSummaryAndRouteStatusApiResponseModel locationSummaryAndRouteStatusApiResponseModel = (LocationSummaryAndRouteStatusApiResponseModel) obj;
        return Intrinsics.d(this.f9473a, locationSummaryAndRouteStatusApiResponseModel.f9473a) && Intrinsics.d(this.b, locationSummaryAndRouteStatusApiResponseModel.b);
    }

    public final int hashCode() {
        List list = this.f9473a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        LocationSummaryApiResponseModel locationSummaryApiResponseModel = this.b;
        return iHashCode + (locationSummaryApiResponseModel != null ? locationSummaryApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        return "LocationSummaryAndRouteStatusApiResponseModel(routesStatus=" + this.f9473a + ", tripSummary=" + this.b + ")";
    }
}
