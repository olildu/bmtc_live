package app.chalo.ncmc.ui.cardrechargeamount;

import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.utils.ChaloCardAnalyticsExtentionsKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountViewState;", "ChaloCardRechargeAmountDataState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardRechargeAmountContractKt {
    public static final HashMap a(ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState, Map map) {
        Intrinsics.i(chaloCardRechargeAmountViewState, "<this>");
        HashMap map2 = new HashMap();
        ChaloCardDetails chaloCardDetails = chaloCardRechargeAmountViewState.c;
        if (chaloCardDetails != null) {
            ChaloCardAnalyticsExtentionsKt.b(chaloCardDetails, map2);
        }
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = chaloCardRechargeAmountViewState.b;
        if (chaloCardRechargeConfigAppModel != null) {
            map2.put("configId", chaloCardRechargeConfigAppModel.f6126a);
            String str = chaloCardRechargeConfigAppModel.g;
            if (str != null) {
                map2.put("productName", str);
            }
            Boolean bool = chaloCardRechargeConfigAppModel.c;
            if (bool != null) {
                map2.put("isActive", bool);
            }
            String str2 = chaloCardRechargeConfigAppModel.k;
            if (str2 != null) {
                map2.put("productType", str2);
            }
            String str3 = chaloCardRechargeConfigAppModel.l;
            if (str3 != null) {
                map2.put("productSubType", str3);
            }
            String str4 = chaloCardRechargeConfigAppModel.j;
            if (str4 != null) {
                map2.put("cardAgency", str4);
            }
            String str5 = chaloCardRechargeConfigAppModel.f;
            if (str5 != null) {
                map2.put("cardCity", str5);
            }
        }
        map2.put("maskedCardNumber", chaloCardRechargeAmountViewState.e);
        map2.put("cardNumber", chaloCardRechargeAmountViewState.d);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }
}
