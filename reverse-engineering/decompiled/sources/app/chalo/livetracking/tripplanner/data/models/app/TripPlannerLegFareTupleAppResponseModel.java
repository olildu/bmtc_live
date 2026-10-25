package app.chalo.livetracking.tripplanner.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegFareTupleAppResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerLegFareTupleAppResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4674a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegFareTupleAppResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegFareTupleAppResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerLegFareTupleAppResponseModel> serializer() {
            return TripPlannerLegFareTupleAppResponseModel$$serializer.f4675a;
        }
    }

    public /* synthetic */ TripPlannerLegFareTupleAppResponseModel(int i, Double d, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(TripPlannerLegFareTupleAppResponseModel$$serializer.f4675a.getDescriptor(), i, 3);
            throw null;
        }
        this.f4674a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerLegFareTupleAppResponseModel)) {
            return false;
        }
        TripPlannerLegFareTupleAppResponseModel tripPlannerLegFareTupleAppResponseModel = (TripPlannerLegFareTupleAppResponseModel) obj;
        return Intrinsics.d(this.f4674a, tripPlannerLegFareTupleAppResponseModel.f4674a) && Intrinsics.d(this.b, tripPlannerLegFareTupleAppResponseModel.b);
    }

    public final int hashCode() {
        Double d = this.f4674a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TripPlannerLegFareTupleAppResponseModel(amount=" + this.f4674a + ", fareType=" + this.b + ")";
    }

    public TripPlannerLegFareTupleAppResponseModel(Double d, String str) {
        this.f4674a = d;
        this.b = str;
    }
}
