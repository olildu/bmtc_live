package app.chalo.ncmc.ui.cardlinking.linking;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkViewState;", "ChaloCardLinkDataState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardLinkCardContractKt {
    public static final HashMap a(ChaloCardLinkViewState chaloCardLinkViewState, Map map) {
        Intrinsics.i(chaloCardLinkViewState, "<this>");
        HashMap map2 = new HashMap();
        map2.put("cardNumber", chaloCardLinkViewState.f6279a);
        map2.put("activationCode", chaloCardLinkViewState.b);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }
}
