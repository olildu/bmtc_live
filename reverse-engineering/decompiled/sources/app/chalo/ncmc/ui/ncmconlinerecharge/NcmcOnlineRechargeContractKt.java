package app.chalo.ncmc.ui.ncmconlinerecharge;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeViewState;", "NCMCOnlineRechargeDataState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NcmcOnlineRechargeContractKt {
    public static final LinkedHashMap a(NCMCOnlineRechargeViewState nCMCOnlineRechargeViewState, Map map) {
        Intrinsics.i(nCMCOnlineRechargeViewState, "<this>");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("online recharge balance", String.valueOf(nCMCOnlineRechargeViewState.g)), new Pair("card no", String.valueOf(nCMCOnlineRechargeViewState.o)), new Pair("kit no", String.valueOf(nCMCOnlineRechargeViewState.p)), new Pair("ncmc recharge mode", "ONLINE"), new Pair("recharge amount", String.valueOf(nCMCOnlineRechargeViewState.h)));
        if (map != null) {
            linkedHashMapK.putAll(map);
        }
        return linkedHashMapK;
    }
}
