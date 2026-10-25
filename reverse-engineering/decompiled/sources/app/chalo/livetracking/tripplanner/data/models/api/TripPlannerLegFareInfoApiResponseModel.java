package app.chalo.livetracking.tripplanner.data.models.api;

import defpackage.cl1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerLegFareInfoApiResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerLegFareInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4638a;
    public final Double b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerLegFareInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerLegFareInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerLegFareInfoApiResponseModel> serializer() {
            return TripPlannerLegFareInfoApiResponseModel$$serializer.f4639a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new cl1(24)), null, LazyKt.a(lazyThreadSafetyMode, new cl1(25))};
    }

    public /* synthetic */ TripPlannerLegFareInfoApiResponseModel(int i, List list, Double d2, List list2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(TripPlannerLegFareInfoApiResponseModel$$serializer.f4639a.getDescriptor(), i, 7);
            throw null;
        }
        this.f4638a = list;
        this.b = d2;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerLegFareInfoApiResponseModel)) {
            return false;
        }
        TripPlannerLegFareInfoApiResponseModel tripPlannerLegFareInfoApiResponseModel = (TripPlannerLegFareInfoApiResponseModel) obj;
        return Intrinsics.d(this.f4638a, tripPlannerLegFareInfoApiResponseModel.f4638a) && Intrinsics.d(this.b, tripPlannerLegFareInfoApiResponseModel.b) && Intrinsics.d(this.c, tripPlannerLegFareInfoApiResponseModel.c);
    }

    public final int hashCode() {
        List list = this.f4638a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Double d2 = this.b;
        return this.c.hashCode() + ((iHashCode + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripPlannerLegFareInfoApiResponseModel(fareTuples=");
        sb.append(this.f4638a);
        sb.append(", defaultFare=");
        sb.append(this.b);
        sb.append(", legIndex=");
        return xs.l(sb, this.c, ")");
    }
}
