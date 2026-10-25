package app.chalo.constants;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CurrencyRoundOffLogicKt {
    public static final CurrencyRoundOffLogic a(int i) {
        CurrencyRoundOffLogic currencyRoundOffLogic = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING;
        if (i != currencyRoundOffLogic.getValue()) {
            CurrencyRoundOffLogic currencyRoundOffLogic2 = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_FLOOR;
            if (i == currencyRoundOffLogic2.getValue()) {
                return currencyRoundOffLogic2;
            }
            CurrencyRoundOffLogic currencyRoundOffLogic3 = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_CEILING;
            if (i == currencyRoundOffLogic3.getValue()) {
                return currencyRoundOffLogic3;
            }
            CurrencyRoundOffLogic currencyRoundOffLogic4 = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_NEAREST_INT;
            if (i == currencyRoundOffLogic4.getValue()) {
                return currencyRoundOffLogic4;
            }
        }
        return currencyRoundOffLogic;
    }
}
