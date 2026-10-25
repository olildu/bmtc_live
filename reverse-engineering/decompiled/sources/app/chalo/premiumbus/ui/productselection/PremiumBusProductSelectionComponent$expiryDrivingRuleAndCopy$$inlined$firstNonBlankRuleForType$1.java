package app.chalo.premiumbus.ui.productselection;

import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusProductSelectionComponent$expiryDrivingRuleAndCopy$$inlined$firstNonBlankRuleForType$1 implements Function1<ApplicableRuleAppModel, Pair<? extends ApplicableRuleAppModel, ? extends String>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        ApplicableRuleAppModel rule = (ApplicableRuleAppModel) obj;
        Intrinsics.i(rule, "rule");
        List list = rule.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ApplicableRuleUxCopyAppModel.ProductScreen) {
                arrayList.add(obj2);
            }
        }
        ApplicableRuleUxCopyAppModel applicableRuleUxCopyAppModel = (ApplicableRuleUxCopyAppModel) CollectionsKt.H(arrayList);
        if (applicableRuleUxCopyAppModel == null || (str = ((ApplicableRuleUxCopyAppModel.ProductScreen) applicableRuleUxCopyAppModel).b) == null) {
            return null;
        }
        return new Pair(rule, str);
    }
}
