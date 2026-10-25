package app.chalo.livetracking.routedetails.data.model.ui;

import defpackage.y21;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsCustomStopTagInfo;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteDetailsCustomStopTagInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new y21(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4403a;
    public final RouteDetailsStopHelpTag b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsCustomStopTagInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsCustomStopTagInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteDetailsCustomStopTagInfo> serializer() {
            return RouteDetailsCustomStopTagInfo$$serializer.f4404a;
        }
    }

    public /* synthetic */ RouteDetailsCustomStopTagInfo(int i, String str, RouteDetailsStopHelpTag routeDetailsStopHelpTag) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(RouteDetailsCustomStopTagInfo$$serializer.f4404a.getDescriptor(), i, 3);
            throw null;
        }
        this.f4403a = str;
        this.b = routeDetailsStopHelpTag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsCustomStopTagInfo)) {
            return false;
        }
        RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj;
        return Intrinsics.d(this.f4403a, routeDetailsCustomStopTagInfo.f4403a) && this.b == routeDetailsCustomStopTagInfo.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4403a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteDetailsCustomStopTagInfo(stopId=" + this.f4403a + ", tagType=" + this.b + ")";
    }

    public RouteDetailsCustomStopTagInfo(String stopId, RouteDetailsStopHelpTag tagType) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(tagType, "tagType");
        this.f4403a = stopId;
        this.b = tagType;
    }
}
