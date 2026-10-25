package app.chalo.contract;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductBookingHelperKt {
    public static final MetroBookingFlowType a(MetroBookingFlowAvailability metroBookingFlowAvailability) {
        Intrinsics.i(metroBookingFlowAvailability, "<this>");
        if (!(metroBookingFlowAvailability instanceof MetroBookingFlowAvailability.Available)) {
            if (metroBookingFlowAvailability instanceof MetroBookingFlowAvailability.FlowNotApplicable) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        List listZ = CollectionsKt.z(((MetroBookingFlowAvailability.Available) metroBookingFlowAvailability).f1948a);
        if (listZ.size() == 1) {
            return (MetroBookingFlowType) CollectionsKt.H(listZ);
        }
        return null;
    }
}
