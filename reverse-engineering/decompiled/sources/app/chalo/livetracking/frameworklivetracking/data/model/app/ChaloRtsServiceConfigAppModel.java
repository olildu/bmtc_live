package app.chalo.livetracking.frameworklivetracking.data.model.app;

import defpackage.i71;
import defpackage.ji;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel;", "", "Companion", "WithPolling", "WithSubscription", "Unknown", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel$Unknown;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel$WithPolling;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel$WithSubscription;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ChaloRtsServiceConfigAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4296a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(29));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ChaloRtsServiceConfigAppModel> serializer() {
            return (KSerializer) ChaloRtsServiceConfigAppModel.f4296a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel$Unknown;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends ChaloRtsServiceConfigAppModel {
        public static final Unknown b = new Unknown();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel$WithPolling;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithPolling extends ChaloRtsServiceConfigAppModel {
        public final long b;
        public final double c;

        public WithPolling(long j, double d) {
            this.b = j;
            this.c = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithPolling)) {
                return false;
            }
            WithPolling withPolling = (WithPolling) obj;
            return this.b == withPolling.b && Double.compare(this.c, withPolling.c) == 0;
        }

        public final int hashCode() {
            long j = this.b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.c);
            return i + ((int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits));
        }

        public final String toString() {
            StringBuilder sbG = i71.g(this.b, "WithPolling(pollingFrequency=", ", randomizationFactor=");
            sbG.append(this.c);
            sbG.append(")");
            return sbG.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel$WithSubscription;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloRtsServiceConfigAppModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithSubscription extends ChaloRtsServiceConfigAppModel {
        public final long b;
        public final double c;
        public final SubscriptionRetryPolicy d;

        public WithSubscription(long j, double d, SubscriptionRetryPolicy subscriptionRetryPolicy) {
            this.b = j;
            this.c = d;
            this.d = subscriptionRetryPolicy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithSubscription)) {
                return false;
            }
            WithSubscription withSubscription = (WithSubscription) obj;
            return this.b == withSubscription.b && Double.compare(this.c, withSubscription.c) == 0 && Intrinsics.d(this.d, withSubscription.d);
        }

        public final int hashCode() {
            long j = this.b;
            long jDoubleToLongBits = Double.doubleToLongBits(this.c);
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits))) * 31;
            SubscriptionRetryPolicy subscriptionRetryPolicy = this.d;
            return i + (subscriptionRetryPolicy == null ? 0 : subscriptionRetryPolicy.hashCode());
        }

        public final String toString() {
            StringBuilder sbG = i71.g(this.b, "WithSubscription(resyncFrequency=", ", randomizationFactor=");
            sbG.append(this.c);
            sbG.append(", retryPolicy=");
            sbG.append(this.d);
            sbG.append(")");
            return sbG.toString();
        }
    }
}
