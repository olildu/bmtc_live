package app.chalo.ncmc.ui.ncmcofflinerecharge;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeViewState;", "OfflineCardRechargeDataState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OfflineCardRechargeContractKt {
    public static final LinkedHashMap a(OfflineCardRechargeViewState offlineCardRechargeViewState, Map map) {
        Intrinsics.i(offlineCardRechargeViewState, "<this>");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("online recharge balance", String.valueOf(offlineCardRechargeViewState.e)), new Pair("card no", offlineCardRechargeViewState.c), new Pair("kit no", offlineCardRechargeViewState.d), new Pair("ncmc recharge mode", "OFFLINE"), new Pair("recharge amount", "null"));
        if (map != null) {
            linkedHashMapK.putAll(map);
        }
        return linkedHashMapK;
    }
}
