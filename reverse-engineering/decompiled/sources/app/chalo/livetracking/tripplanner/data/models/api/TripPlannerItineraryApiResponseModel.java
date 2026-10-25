package app.chalo.livetracking.tripplanner.data.models.api;

import defpackage.cl1;
import defpackage.dd;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerItineraryApiResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerItineraryApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4634a;
    public final Double b;
    public final Double c;
    public final Boolean d;
    public final List e;
    public final List f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerItineraryApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerItineraryApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerItineraryApiResponseModel> serializer() {
            return TripPlannerItineraryApiResponseModel$$serializer.f4635a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new cl1(4)), LazyKt.a(lazyThreadSafetyMode, new cl1(5)), LazyKt.a(lazyThreadSafetyMode, new cl1(6))};
    }

    public /* synthetic */ TripPlannerItineraryApiResponseModel(int i, Double d, Double d2, Double d3, Boolean bool, List list, List list2, List list3) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(TripPlannerItineraryApiResponseModel$$serializer.f4635a.getDescriptor(), i, 127);
            throw null;
        }
        this.f4634a = d;
        this.b = d2;
        this.c = d3;
        this.d = bool;
        this.e = list;
        this.f = list2;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerItineraryApiResponseModel)) {
            return false;
        }
        TripPlannerItineraryApiResponseModel tripPlannerItineraryApiResponseModel = (TripPlannerItineraryApiResponseModel) obj;
        return Intrinsics.d(this.f4634a, tripPlannerItineraryApiResponseModel.f4634a) && Intrinsics.d(this.b, tripPlannerItineraryApiResponseModel.b) && Intrinsics.d(this.c, tripPlannerItineraryApiResponseModel.c) && Intrinsics.d(this.d, tripPlannerItineraryApiResponseModel.d) && Intrinsics.d(this.e, tripPlannerItineraryApiResponseModel.e) && Intrinsics.d(this.f, tripPlannerItineraryApiResponseModel.f) && Intrinsics.d(this.g, tripPlannerItineraryApiResponseModel.g);
    }

    public final int hashCode() {
        Double d = this.f4634a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.g;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripPlannerItineraryApiResponseModel(distance=");
        sb.append(this.f4634a);
        sb.append(", totalFare=");
        sb.append(this.b);
        sb.append(", travelTime=");
        sb.append(this.c);
        sb.append(", incompleteFare=");
        sb.append(this.d);
        sb.append(", legs=");
        dd.o(sb, this.e, ", fares=", this.f, ", serviceTypeFilter=");
        return xs.l(sb, this.g, ")");
    }
}
