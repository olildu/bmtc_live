package app.chalo.premiumbus.data.models.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class PBAvailableSlotsAppModelKt$firstNonBlankRuleForType$1 implements Function1<ApplicableRuleAppModel, Pair<? extends ApplicableRuleAppModel, ? extends String>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ApplicableRuleAppModel rule = (ApplicableRuleAppModel) obj;
        Intrinsics.i(rule, "rule");
        List list = rule.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            Intrinsics.p();
            throw null;
        }
        if (((ApplicableRuleUxCopyAppModel) CollectionsKt.H(arrayList)) == null) {
            return null;
        }
        throw null;
    }
}
