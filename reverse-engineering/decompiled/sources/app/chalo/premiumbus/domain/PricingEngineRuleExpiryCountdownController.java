package app.chalo.premiumbus.domain;

import app.chalo.providers.CoroutineContextProvider;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryCountdownController;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PricingEngineRuleExpiryCountdownController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f7224a;
    public Job b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryCountdownController$Companion;", "", "", "TICK_INTERVAL_MILLIS", "J", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PricingEngineRuleExpiryCountdownController(CoroutineContextProvider coroutineContextProvider) {
        this.f7224a = coroutineContextProvider;
    }

    public static boolean a(List list) {
        List<PricingEngineRuleExpiryDisplayState> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (PricingEngineRuleExpiryDisplayState pricingEngineRuleExpiryDisplayState : list2) {
            if ((pricingEngineRuleExpiryDisplayState instanceof PricingEngineRuleExpiryDisplayState.DateEnding) || (pricingEngineRuleExpiryDisplayState instanceof PricingEngineRuleExpiryDisplayState.CountdownNormal) || (pricingEngineRuleExpiryDisplayState instanceof PricingEngineRuleExpiryDisplayState.CountdownUrgent)) {
                return true;
            }
        }
        return false;
    }
}
