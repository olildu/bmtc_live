package app.chalo.compose.components.chalomap;

import defpackage.hq0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/compose/components/chalomap/LiveBusDelayedState;", "", "NotDelayed", "Delayed", "Lapp/chalo/compose/components/chalomap/LiveBusDelayedState$Delayed;", "Lapp/chalo/compose/components/chalomap/LiveBusDelayedState$NotDelayed;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LiveBusDelayedState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/LiveBusDelayedState$Delayed;", "Lapp/chalo/compose/components/chalomap/LiveBusDelayedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Delayed extends LiveBusDelayedState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1877a;

        public Delayed(long j) {
            this.f1877a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Delayed) && this.f1877a == ((Delayed) obj).f1877a;
        }

        public final int hashCode() {
            long j = this.f1877a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f1877a, "Delayed(delayedByMins=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/LiveBusDelayedState$NotDelayed;", "Lapp/chalo/compose/components/chalomap/LiveBusDelayedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotDelayed extends LiveBusDelayedState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotDelayed f1878a = new NotDelayed();
    }
}
