package app.chalo.livetracking.tripplanner.data.models.app;

import defpackage.cl1;
import defpackage.hq0;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerItineraryAppResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerItineraryAppResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4663a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final boolean e;
    public final List f;
    public final List g;
    public final int h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerItineraryAppResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerItineraryAppResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerItineraryAppResponseModel> serializer() {
            return TripPlannerItineraryAppResponseModel$$serializer.f4664a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new Lazy[]{null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new cl1(7)), LazyKt.a(lazyThreadSafetyMode, new cl1(8)), null};
    }

    public /* synthetic */ TripPlannerItineraryAppResponseModel(int i2, String str, Double d, Double d2, Double d3, boolean z, List list, List list2, int i3) {
        if (255 != (i2 & 255)) {
            PluginExceptionsKt.b(TripPlannerItineraryAppResponseModel$$serializer.f4664a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f4663a = str;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = z;
        this.f = list;
        this.g = list2;
        this.h = i3;
    }

    public static TripPlannerItineraryAppResponseModel a(TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel, List list) {
        String localId = tripPlannerItineraryAppResponseModel.f4663a;
        Double d = tripPlannerItineraryAppResponseModel.b;
        Double d2 = tripPlannerItineraryAppResponseModel.c;
        Double d3 = tripPlannerItineraryAppResponseModel.d;
        boolean z = tripPlannerItineraryAppResponseModel.e;
        List serviceTypeFilter = tripPlannerItineraryAppResponseModel.g;
        int i2 = tripPlannerItineraryAppResponseModel.h;
        Intrinsics.i(localId, "localId");
        Intrinsics.i(serviceTypeFilter, "serviceTypeFilter");
        return new TripPlannerItineraryAppResponseModel(localId, d, d2, d3, z, list, serviceTypeFilter, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerItineraryAppResponseModel)) {
            return false;
        }
        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = (TripPlannerItineraryAppResponseModel) obj;
        return Intrinsics.d(this.f4663a, tripPlannerItineraryAppResponseModel.f4663a) && Intrinsics.d(this.b, tripPlannerItineraryAppResponseModel.b) && Intrinsics.d(this.c, tripPlannerItineraryAppResponseModel.c) && Intrinsics.d(this.d, tripPlannerItineraryAppResponseModel.d) && this.e == tripPlannerItineraryAppResponseModel.e && Intrinsics.d(this.f, tripPlannerItineraryAppResponseModel.f) && Intrinsics.d(this.g, tripPlannerItineraryAppResponseModel.g) && this.h == tripPlannerItineraryAppResponseModel.h;
    }

    public final int hashCode() {
        int iHashCode = this.f4663a.hashCode() * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.d;
        return r30.b(r30.b((((iHashCode3 + (d3 != null ? d3.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237)) * 31, 31, this.f), 31, this.g) + this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripPlannerItineraryAppResponseModel(localId=");
        sb.append(this.f4663a);
        sb.append(", distanceInMeters=");
        sb.append(this.b);
        sb.append(", totalFare=");
        sb.append(this.c);
        sb.append(", travelTimeInSeconds=");
        sb.append(this.d);
        sb.append(", incompleteFare=");
        hq0.w(sb, this.e, ", legs=", this.f, ", serviceTypeFilter=");
        sb.append(this.g);
        sb.append(", rank=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public TripPlannerItineraryAppResponseModel(String str, Double d, Double d2, Double d3, boolean z, List list, List serviceTypeFilter, int i2) {
        Intrinsics.i(serviceTypeFilter, "serviceTypeFilter");
        this.f4663a = str;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = z;
        this.f = list;
        this.g = serviceTypeFilter;
        this.h = i2;
    }
}
