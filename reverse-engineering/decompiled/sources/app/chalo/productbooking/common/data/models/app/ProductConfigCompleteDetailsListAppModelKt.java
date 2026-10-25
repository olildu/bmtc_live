package app.chalo.productbooking.common.data.models.app;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductConfigCompleteDetailsListAppModelKt {
    public static final String a(List list, ProductImageType type) {
        Object next;
        Intrinsics.i(list, "<this>");
        Intrinsics.i(type, "type");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ProductImageAppModel productImageAppModel = (ProductImageAppModel) next;
            if (productImageAppModel.b == type && productImageAppModel.f8224a.length() > 0) {
                break;
            }
        }
        ProductImageAppModel productImageAppModel2 = (ProductImageAppModel) next;
        if (productImageAppModel2 != null) {
            return productImageAppModel2.f8224a;
        }
        return null;
    }
}
