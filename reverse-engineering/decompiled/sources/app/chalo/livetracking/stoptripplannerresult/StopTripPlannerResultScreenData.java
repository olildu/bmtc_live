package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.constants.Source;
import defpackage.nf1;
import defpackage.ra1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultScreenData;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class StopTripPlannerResultScreenData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopTripPlannerLocationType f4558a;
    public final StopTripPlannerLocationType b;
    public final Source c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultScreenData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultScreenData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<StopTripPlannerResultScreenData> serializer() {
            return StopTripPlannerResultScreenData$$serializer.f4559a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ra1(26)), LazyKt.a(lazyThreadSafetyMode, new ra1(27)), LazyKt.a(lazyThreadSafetyMode, new ra1(28)), null};
    }

    public /* synthetic */ StopTripPlannerResultScreenData(int i, StopTripPlannerLocationType stopTripPlannerLocationType, StopTripPlannerLocationType stopTripPlannerLocationType2, Source source, String str) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(StopTripPlannerResultScreenData$$serializer.f4559a.getDescriptor(), i, 15);
            throw null;
        }
        this.f4558a = stopTripPlannerLocationType;
        this.b = stopTripPlannerLocationType2;
        this.c = source;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripPlannerResultScreenData)) {
            return false;
        }
        StopTripPlannerResultScreenData stopTripPlannerResultScreenData = (StopTripPlannerResultScreenData) obj;
        return Intrinsics.d(this.f4558a, stopTripPlannerResultScreenData.f4558a) && Intrinsics.d(this.b, stopTripPlannerResultScreenData.b) && this.c == stopTripPlannerResultScreenData.c && Intrinsics.d(this.d, stopTripPlannerResultScreenData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.f(this.c, (this.b.hashCode() + (this.f4558a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "StopTripPlannerResultScreenData(from=" + this.f4558a + ", to=" + this.b + ", prevSource=" + this.c + ", resultManagerId=" + this.d + ")";
    }

    public StopTripPlannerResultScreenData(StopTripPlannerLocationType stopTripPlannerLocationType, StopTripPlannerLocationType stopTripPlannerLocationType2, Source prevSource) {
        Intrinsics.i(prevSource, "prevSource");
        this.f4558a = stopTripPlannerLocationType;
        this.b = stopTripPlannerLocationType2;
        this.c = prevSource;
        this.d = "stop_trip_planner_result_manager_request_id";
    }
}
