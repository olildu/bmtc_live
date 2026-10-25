package app.chalo.multimodalticket.data.model.app;

import app.chalo.instantticket.data.model.api.response.FareBreakupApiModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModelKt;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegFareDetailApiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketSummaryResponseAppModelKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static final GroupTicketLegFareDetailAppModel a(GroupTicketLegFareDetailApiModel groupTicketLegFareDetailApiModel) {
        ?? arrayList;
        Intrinsics.i(groupTicketLegFareDetailApiModel, "<this>");
        int i = groupTicketLegFareDetailApiModel.f5828a;
        if (i > 0) {
            FareBreakupApiModel fareBreakupApiModel = groupTicketLegFareDetailApiModel.b;
            Intrinsics.i(fareBreakupApiModel, "<this>");
            if (fareBreakupApiModel.f3861a == null) {
                fareBreakupApiModel = null;
            }
            if (fareBreakupApiModel != null) {
                FareBreakupAppModel fareBreakupAppModelC = FetchMobileTicketFareResponseApiModelKt.c(fareBreakupApiModel);
                List list = groupTicketLegFareDetailApiModel.c;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(FetchMobileTicketFareResponseApiModelKt.c((FareBreakupApiModel) it.next()));
                    }
                } else {
                    arrayList = EmptyList.f17557a;
                }
                return new GroupTicketLegFareDetailAppModel(i, fareBreakupAppModelC, arrayList);
            }
        }
        return null;
    }
}
