package app.chalo.productpurchase.productselection.ui;

import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ProductSelectionComponent$sortBasedOnPriority$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ProductConfigResponseAppModel productConfigResponseAppModel = (ProductConfigResponseAppModel) obj;
        ProductConfigResponseAppModel productConfigResponseAppModel2 = (ProductConfigResponseAppModel) obj2;
        return ComparisonsKt.a(Integer.valueOf(productConfigResponseAppModel.getE() ? productConfigResponseAppModel.getG() : productConfigResponseAppModel.getG() + 1000), Integer.valueOf(productConfigResponseAppModel2.getE() ? productConfigResponseAppModel2.getG() : productConfigResponseAppModel2.getG() + 1000));
    }
}
