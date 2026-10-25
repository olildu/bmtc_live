package app.chalo.ondc.model.app;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.ondc.dao.OndcTicketEntity;
import app.chalo.productbooking.common.data.models.entity.FareBreakupEntityModel;
import app.chalo.ticketvalidation.TicketValidationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketAppModelKt {
    public static final OndcTicketEntity a(OndcTicketAppModel ondcTicketAppModel) {
        ArrayList arrayList;
        Intrinsics.i(ondcTicketAppModel, "<this>");
        String str = ondcTicketAppModel.f6771a;
        String str2 = ondcTicketAppModel.b;
        long j = ondcTicketAppModel.c;
        long j2 = ondcTicketAppModel.d;
        OndcTicketStatus ondcTicketStatus = ondcTicketAppModel.e;
        Long l = ondcTicketAppModel.f;
        String str3 = ondcTicketAppModel.g;
        String str4 = ondcTicketAppModel.h;
        String str5 = ondcTicketAppModel.i;
        long j3 = ondcTicketAppModel.j;
        Map map = ondcTicketAppModel.k;
        String str6 = ondcTicketAppModel.l;
        String str7 = ondcTicketAppModel.m;
        String str8 = ondcTicketAppModel.n;
        RefundInfoAppModel refundInfoAppModel = ondcTicketAppModel.o;
        List list = ondcTicketAppModel.p;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(OndcMetroTicketAppModelKt.c((TicketValidationInfo) it.next()));
            }
        } else {
            arrayList = null;
        }
        List list3 = ondcTicketAppModel.q;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            FareBreakupAppModel fareBreakupAppModel = (FareBreakupAppModel) it2.next();
            fareBreakupAppModel.getClass();
            arrayList2.add(new FareBreakupEntityModel(fareBreakupAppModel.f3890a, fareBreakupAppModel.b, fareBreakupAppModel.c));
            it2 = it2;
            arrayList = arrayList;
            j = j;
            j2 = j2;
        }
        String str9 = ondcTicketAppModel.r;
        return new OndcTicketEntity(str, str2, j, j2, ondcTicketStatus, l, str3, str4, str5, Long.valueOf(j3), map, str6, str7, str8, refundInfoAppModel, arrayList2, arrayList, str9);
    }
}
