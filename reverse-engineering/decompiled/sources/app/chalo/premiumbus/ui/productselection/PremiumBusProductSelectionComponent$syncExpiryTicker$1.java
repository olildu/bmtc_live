package app.chalo.premiumbus.ui.productselection;

import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryDisplayResolverKt;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryDisplayState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class PremiumBusProductSelectionComponent$syncExpiryTicker$1 extends FunctionReferenceImpl implements Function1<Long, List<? extends PricingEngineRuleExpiryDisplayState>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ApplicableRuleAppModel applicableRuleAppModel;
        Long l;
        long jLongValue = ((Number) obj).longValue();
        Iterable iterable = ((PremiumBusProductSelectionDataState) ((PremiumBusProductSelectionComponent) this.receiver).f.getValue()).c;
        if (iterable == null) {
            iterable = EmptyList.f17557a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pairH0 = PremiumBusProductSelectionComponent.H0((PBProductConfigUiModel) it.next());
            PricingEngineRuleExpiryDisplayState pricingEngineRuleExpiryDisplayStateA = (pairH0 == null || (applicableRuleAppModel = (ApplicableRuleAppModel) pairH0.d()) == null || (l = applicableRuleAppModel.i) == null) ? null : PricingEngineRuleExpiryDisplayResolverKt.a(l.longValue(), jLongValue);
            if (pricingEngineRuleExpiryDisplayStateA != null) {
                arrayList.add(pricingEngineRuleExpiryDisplayStateA);
            }
        }
        return arrayList;
    }
}
