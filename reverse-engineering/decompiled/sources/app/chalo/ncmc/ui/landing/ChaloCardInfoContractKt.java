package app.chalo.ncmc.ui.landing;

import app.chalo.ncmc.data.appmodel.ChaloCardActivePass;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.utils.ChaloCardAnalyticsExtentionsKt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoViewState;", "ChaloCardInfoDataState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardInfoContractKt {
    public static final HashMap a(ChaloCardInfoViewState chaloCardInfoViewState, Map map) {
        Intrinsics.i(chaloCardInfoViewState, "<this>");
        List list = chaloCardInfoViewState.b;
        HashMap map2 = new HashMap();
        ChaloCardDetails chaloCardDetails = chaloCardInfoViewState.f6359a;
        if (chaloCardDetails != null) {
            ChaloCardAnalyticsExtentionsKt.b(chaloCardDetails, map2);
        }
        ChaloCardActivePass chaloCardActivePass = chaloCardInfoViewState.f;
        if (chaloCardActivePass != null) {
            ChaloCardAnalyticsExtentionsKt.a(chaloCardActivePass, map2);
        }
        int size = list.size();
        int i = chaloCardInfoViewState.d;
        map2.put("maskedCardNumber", size <= i ? "" : (String) list.get(i));
        map2.put("passDescription", chaloCardInfoViewState.g);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }
}
