package app.chalo.contract;

import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/contract/MetroBookingFlowAvailability;", "", "FlowNotApplicable", "Available", "Lapp/chalo/contract/MetroBookingFlowAvailability$Available;", "Lapp/chalo/contract/MetroBookingFlowAvailability$FlowNotApplicable;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MetroBookingFlowAvailability {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/MetroBookingFlowAvailability$Available;", "Lapp/chalo/contract/MetroBookingFlowAvailability;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Available extends MetroBookingFlowAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f1948a;

        public Available(List list) {
            this.f1948a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Available) && Intrinsics.d(this.f1948a, ((Available) obj).f1948a);
        }

        public final int hashCode() {
            return this.f1948a.hashCode();
        }

        public final String toString() {
            return r1.d("Available(applicableFlows=", ")", this.f1948a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/MetroBookingFlowAvailability$FlowNotApplicable;", "Lapp/chalo/contract/MetroBookingFlowAvailability;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlowNotApplicable extends MetroBookingFlowAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FlowNotApplicable f1949a = new FlowNotApplicable();
    }
}
