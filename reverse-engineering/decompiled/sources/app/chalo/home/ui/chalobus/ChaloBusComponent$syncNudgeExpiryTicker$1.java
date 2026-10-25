package app.chalo.home.ui.chalobus;

import app.chalo.premiumbus.domain.PricingEngineRuleExpiryDisplayResolverKt;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryDisplayState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ChaloBusComponent$syncNudgeExpiryTicker$1 extends FunctionReferenceImpl implements Function1<Long, List<? extends PricingEngineRuleExpiryDisplayState>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Iterable iterable = ((ChaloBusComponent) this.receiver).V0().c;
        if (iterable == null) {
            iterable = EmptyList.f17557a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Long l = ((ProductPurchaseNudgeDisplayInfo) it.next()).g;
            PricingEngineRuleExpiryDisplayState pricingEngineRuleExpiryDisplayStateA = l != null ? PricingEngineRuleExpiryDisplayResolverKt.a(l.longValue(), jLongValue) : null;
            if (pricingEngineRuleExpiryDisplayStateA != null) {
                arrayList.add(pricingEngineRuleExpiryDisplayStateA);
            }
        }
        return arrayList;
    }
}
