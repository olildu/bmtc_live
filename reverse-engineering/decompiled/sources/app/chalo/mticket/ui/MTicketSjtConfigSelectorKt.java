package app.chalo.mticket.ui;

import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MTicketSjtConfigSelectorKt {
    public static final ProductConfigResponseAppModel.SingleJourneyTicketAppModel a(String agency, List list) {
        Object obj;
        Intrinsics.i(agency, "agency");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) obj3;
            if (StringsKt.x(singleJourneyTicketAppModel.t, agency, true) && singleJourneyTicketAppModel.E) {
                arrayList2.add(obj3);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i2 = ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) next).q;
                do {
                    Object next2 = it.next();
                    int i3 = ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) next2).q;
                    if (i2 > i3) {
                        next = next2;
                        i2 = i3;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) obj;
    }
}
