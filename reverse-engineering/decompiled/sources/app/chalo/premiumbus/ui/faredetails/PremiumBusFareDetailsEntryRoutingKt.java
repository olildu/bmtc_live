package app.chalo.premiumbus.ui.faredetails;

import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsEntryContext;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.scenes.args.PremiumBusFareDetailsArgs;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsEntryRoutingKt {
    public static final PremiumBusFareDetailsArgs a(PremiumBusFareDetailsFlowType flowType, FareDetailsData fareDetailsData, PremiumBusFareDetailsEntryContext entryContext, List selectedSeats, String str) {
        Intrinsics.i(flowType, "flowType");
        Intrinsics.i(fareDetailsData, "fareDetailsData");
        Intrinsics.i(entryContext, "entryContext");
        Intrinsics.i(selectedSeats, "selectedSeats");
        Json json = ChaloJson.b;
        json.getClass();
        String strA = json.a(PremiumBusFareDetailsFlowType.INSTANCE.serializer(), flowType);
        String strA2 = json.a(FareDetailsData.INSTANCE.serializer(), fareDetailsData);
        String strName = entryContext.name();
        if (selectedSeats.isEmpty()) {
            selectedSeats = null;
        }
        return new PremiumBusFareDetailsArgs(strA, strA2, strName, selectedSeats != null ? json.a(new ArrayListSerializer(SeatInfoAppModel.INSTANCE.serializer()), selectedSeats) : null, str);
    }

    public static final PremiumBusPassUpsellAppModel b(ProductConfigCompleteDetailsAppModel config) {
        Object next;
        Intrinsics.i(config, "config");
        if (!Intrinsics.d(config.t, "premiumReserveTicket")) {
            return null;
        }
        Iterator it = config.L.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ApplicableRuleAppModel) next).j == null);
        ApplicableRuleAppModel applicableRuleAppModel = (ApplicableRuleAppModel) next;
        if (applicableRuleAppModel != null) {
            return applicableRuleAppModel.j;
        }
        return null;
    }
}
