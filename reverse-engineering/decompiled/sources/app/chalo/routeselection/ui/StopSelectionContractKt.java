package app.chalo.routeselection.ui;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.ProductBookingNavigation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchViewState;", "StopBasedRouteSearchDataState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopSelectionContractKt {
    public static final ProductBookingNavigation a(StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType) {
        Object objB;
        StopAppModel stopAppModel;
        Intrinsics.i(stopBasedRouteSelectionFlowType, "<this>");
        if (stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.InstantTicket) {
            return new ProductBookingNavigation.InstantTicket.FreshPurchase(false);
        }
        if (stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.PassPurchase) {
            return new ProductBookingNavigation.StopBasedPassFreshPurchase(((StopBasedRouteSelectionFlowType.PassPurchase) stopBasedRouteSelectionFlowType).d);
        }
        if (!(stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.ONDC)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = stopBasedRouteSelectionFlowType.f2400a;
        StopAppModel stopAppModel2 = null;
        Object objB2 = null;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            stopAppModel = (StopAppModel) objB;
        } else {
            stopAppModel = null;
        }
        String str2 = stopBasedRouteSelectionFlowType.b;
        if (str2 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB2 = json2.b(str2, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
            }
            stopAppModel2 = (StopAppModel) objB2;
        }
        return new ProductBookingNavigation.ONDCTicket(stopAppModel, stopAppModel2);
    }
}
