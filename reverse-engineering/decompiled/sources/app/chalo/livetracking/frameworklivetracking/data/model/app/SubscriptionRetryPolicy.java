package app.chalo.livetracking.frameworklivetracking.data.model.app;

import defpackage.b3;
import defpackage.uf0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/SubscriptionRetryPolicy;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SubscriptionRetryPolicy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4316a;
    public final int b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/SubscriptionRetryPolicy$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/SubscriptionRetryPolicy;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SubscriptionRetryPolicy> serializer() {
            return SubscriptionRetryPolicy$$serializer.f4317a;
        }
    }

    public /* synthetic */ SubscriptionRetryPolicy(int i, int i2, int i3, int i4) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(SubscriptionRetryPolicy$$serializer.f4317a.getDescriptor(), i, 7);
            throw null;
        }
        this.f4316a = i2;
        this.b = i3;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionRetryPolicy)) {
            return false;
        }
        SubscriptionRetryPolicy subscriptionRetryPolicy = (SubscriptionRetryPolicy) obj;
        return this.f4316a == subscriptionRetryPolicy.f4316a && this.b == subscriptionRetryPolicy.b && this.c == subscriptionRetryPolicy.c;
    }

    public final int hashCode() {
        return (((this.f4316a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return b3.f(")", this.c, uf0.s(this.f4316a, this.b, "SubscriptionRetryPolicy(retryBackoffMultiplier=", ", retryMaxAttempts=", ", retryTimeout="));
    }
}
