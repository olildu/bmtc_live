package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

import app.chalo.livetracking.frameworklivetracking.data.model.app.SubscriptionRetryPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/ChaloRtsServiceConfigApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloRtsServiceConfigApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4274a;
    public final double b;
    public final Long c;
    public final Long d;
    public final SubscriptionRetryPolicy e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/ChaloRtsServiceConfigApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/ChaloRtsServiceConfigApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloRtsServiceConfigApiModel> serializer() {
            return ChaloRtsServiceConfigApiModel$$serializer.f4275a;
        }
    }

    public /* synthetic */ ChaloRtsServiceConfigApiModel(int i, boolean z, double d, Long l, Long l2, SubscriptionRetryPolicy subscriptionRetryPolicy) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(ChaloRtsServiceConfigApiModel$$serializer.f4275a.getDescriptor(), i, 1);
            throw null;
        }
        this.f4274a = z;
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = subscriptionRetryPolicy;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloRtsServiceConfigApiModel)) {
            return false;
        }
        ChaloRtsServiceConfigApiModel chaloRtsServiceConfigApiModel = (ChaloRtsServiceConfigApiModel) obj;
        return this.f4274a == chaloRtsServiceConfigApiModel.f4274a && Double.compare(this.b, chaloRtsServiceConfigApiModel.b) == 0 && Intrinsics.d(this.c, chaloRtsServiceConfigApiModel.c) && Intrinsics.d(this.d, chaloRtsServiceConfigApiModel.d) && Intrinsics.d(this.e, chaloRtsServiceConfigApiModel.e);
    }

    public final int hashCode() {
        int i = this.f4274a ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        int i2 = ((i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        Long l = this.c;
        int iHashCode = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        SubscriptionRetryPolicy subscriptionRetryPolicy = this.e;
        return iHashCode2 + (subscriptionRetryPolicy != null ? subscriptionRetryPolicy.hashCode() : 0);
    }

    public final String toString() {
        return "ChaloRtsServiceConfigApiModel(isPolling=" + this.f4274a + ", randomizationFactor=" + this.b + ", resyncFrequency=" + this.c + ", pollingFrequency=" + this.d + ", retryPolicy=" + this.e + ")";
    }
}
