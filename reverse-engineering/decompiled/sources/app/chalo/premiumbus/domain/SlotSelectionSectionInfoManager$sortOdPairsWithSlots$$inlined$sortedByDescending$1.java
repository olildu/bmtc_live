package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SlotSelectionSectionInfoManager$sortOdPairsWithSlots$$inlined$sortedByDescending$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list;
        List list2;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel = ((ODPairWithSlotsListAppModel) obj2).b;
        boolean z = false;
        Boolean boolValueOf = Boolean.valueOf((pBAvailableSlotsInfoAppModel == null || (list2 = pBAvailableSlotsInfoAppModel.c) == null || !(list2.isEmpty() ^ true)) ? false : true);
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel2 = ((ODPairWithSlotsListAppModel) obj).b;
        if (pBAvailableSlotsInfoAppModel2 != null && (list = pBAvailableSlotsInfoAppModel2.c) != null && (!list.isEmpty())) {
            z = true;
        }
        return ComparisonsKt.a(boolValueOf, Boolean.valueOf(z));
    }
}
