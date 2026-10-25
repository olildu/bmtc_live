package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseBaseManager;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionManager;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseBaseManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SuperPassPassengerSelectionManager extends SuperPassPurchaseBaseManager {
    void D(String str, long j, SuperPassUserDetails superPassUserDetails);

    void F(SuperPassUserDetails superPassUserDetails);

    void W();
}
