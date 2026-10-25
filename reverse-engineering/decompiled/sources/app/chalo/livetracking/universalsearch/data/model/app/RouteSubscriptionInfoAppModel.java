package app.chalo.livetracking.universalsearch.data.model.app;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/RouteSubscriptionInfoAppModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteSubscriptionInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4994a;
    public int b;
    public long c;
    public boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/RouteSubscriptionInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/app/RouteSubscriptionInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteSubscriptionInfoAppModel> serializer() {
            return RouteSubscriptionInfoAppModel$$serializer.f4995a;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSubscriptionInfoAppModel)) {
            return false;
        }
        RouteSubscriptionInfoAppModel routeSubscriptionInfoAppModel = (RouteSubscriptionInfoAppModel) obj;
        return Intrinsics.d(this.f4994a, routeSubscriptionInfoAppModel.f4994a) && this.b == routeSubscriptionInfoAppModel.b && this.c == routeSubscriptionInfoAppModel.c && this.d == routeSubscriptionInfoAppModel.d;
    }

    public final int hashCode() {
        String str = this.f4994a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31;
        long j = this.c;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.f4994a;
        int i = this.b;
        long j = this.c;
        boolean z = this.d;
        StringBuilder sbM = xs.m(i, "RouteSubscriptionInfoAppModel(routeId=", str, ", routeDetailsViewCount=", ", routeDetailsLastSeen=");
        sbM.append(j);
        sbM.append(", isAutoSubscriptionDialogShown=");
        sbM.append(z);
        sbM.append(")");
        return sbM.toString();
    }
}
