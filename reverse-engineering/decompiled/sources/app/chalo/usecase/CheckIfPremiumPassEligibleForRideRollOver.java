package app.chalo.usecase;

import app.chalo.data.PassPurchaseConfigsApplicableForRollover;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/CheckIfPremiumPassEligibleForRideRollOver;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIfPremiumPassEligibleForRideRollOver {
    public static boolean a(String passConfigId, int i, int i2, List configIdsForRollOverRidePass) {
        Object next;
        Intrinsics.i(passConfigId, "passConfigId");
        Intrinsics.i(configIdsForRollOverRidePass, "configIdsForRollOverRidePass");
        Iterator it = configIdsForRollOverRidePass.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PassPurchaseConfigsApplicableForRollover passPurchaseConfigsApplicableForRollover = (PassPurchaseConfigsApplicableForRollover) next;
            if (Intrinsics.d(passPurchaseConfigsApplicableForRollover.f2365a, passConfigId) && passPurchaseConfigsApplicableForRollover.b.contains(Integer.valueOf(i))) {
                break;
            }
        }
        return next != null && i2 > 0;
    }
}
