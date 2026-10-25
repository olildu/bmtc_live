package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationState;", "NewPremiumBusReserveTicketActivationDataState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NewPremiumBusReserveTicketActivationContractKt {
    public static final ArrayList a(List list, PBStopImageType pBStopImageType) {
        Intrinsics.i(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(PBStopImagesDetails.a((PBStopImagesDetails) it.next(), pBStopImageType));
        }
        return arrayList;
    }

    public static final boolean b(List list) {
        Intrinsics.i(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((PBStopImagesDetails) it.next()).c instanceof PBStopImageType.ImagesAvailable) {
                return true;
            }
        }
        return false;
    }
}
