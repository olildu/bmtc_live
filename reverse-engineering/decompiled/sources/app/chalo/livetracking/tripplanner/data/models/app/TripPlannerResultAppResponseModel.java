package app.chalo.livetracking.tripplanner.data.models.app;

import defpackage.cl1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerResultAppResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerResultAppResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4682a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerResultAppResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerResultAppResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerResultAppResponseModel> serializer() {
            return TripPlannerResultAppResponseModel$$serializer.f4683a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new cl1(28)), LazyKt.a(lazyThreadSafetyMode, new cl1(29))};
    }

    public TripPlannerResultAppResponseModel(List list, int i, List list2) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(TripPlannerResultAppResponseModel$$serializer.f4683a.getDescriptor(), i, 1);
            throw null;
        }
        this.f4682a = list;
        if ((i & 2) == 0) {
            this.b = EmptyList.f17557a;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerResultAppResponseModel)) {
            return false;
        }
        TripPlannerResultAppResponseModel tripPlannerResultAppResponseModel = (TripPlannerResultAppResponseModel) obj;
        return Intrinsics.d(this.f4682a, tripPlannerResultAppResponseModel.f4682a) && Intrinsics.d(this.b, tripPlannerResultAppResponseModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4682a.hashCode() * 31);
    }

    public final String toString() {
        return "TripPlannerResultAppResponseModel(result=" + this.f4682a + ", nearbyStopsResults=" + this.b + ")";
    }

    public TripPlannerResultAppResponseModel(List result, List nearbyStopsResults) {
        Intrinsics.i(result, "result");
        Intrinsics.i(nearbyStopsResults, "nearbyStopsResults");
        this.f4682a = result;
        this.b = nearbyStopsResults;
    }
}
