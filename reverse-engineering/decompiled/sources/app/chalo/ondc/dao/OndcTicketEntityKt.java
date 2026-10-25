package app.chalo.ondc.dao;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketStatus;
import app.chalo.productbooking.common.data.models.entity.FareBreakupEntityModel;
import app.chalo.ticketvalidation.TicketValidationInfoEntity;
import app.chalo.ticketvalidation.TicketValidationInfoEntityKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketEntityKt {
    public static final OndcTicketAppModel a(OndcTicketEntity ondcTicketEntity) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j;
        long j2;
        List list;
        Intrinsics.i(ondcTicketEntity, "<this>");
        String str = ondcTicketEntity.f6697a;
        String str2 = ondcTicketEntity.b;
        long j3 = ondcTicketEntity.c;
        long j4 = ondcTicketEntity.d;
        OndcTicketStatus ondcTicketStatus = ondcTicketEntity.e;
        Long l = ondcTicketEntity.f;
        String str3 = ondcTicketEntity.g;
        String str4 = ondcTicketEntity.h;
        String str5 = ondcTicketEntity.i;
        Long l2 = ondcTicketEntity.j;
        long jLongValue = l2 != null ? l2.longValue() : -1L;
        Map map = ondcTicketEntity.k;
        String str6 = ondcTicketEntity.l;
        String str7 = ondcTicketEntity.m;
        String str8 = ondcTicketEntity.n;
        RefundInfoAppModel refundInfoAppModel = ondcTicketEntity.o;
        List list2 = ondcTicketEntity.q;
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(TicketValidationInfoEntityKt.a((TicketValidationInfoEntity) it.next()));
            }
        } else {
            arrayList = null;
        }
        List list4 = ondcTicketEntity.p;
        if (list4 != null) {
            List list5 = list4;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list5, 10));
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                FareBreakupEntityModel fareBreakupEntityModel = (FareBreakupEntityModel) it2.next();
                arrayList3.add(new FareBreakupAppModel(fareBreakupEntityModel.f8241a, fareBreakupEntityModel.b, fareBreakupEntityModel.c));
                it2 = it2;
                arrayList = arrayList;
                j3 = j3;
                j4 = j4;
            }
            arrayList2 = arrayList;
            j = j3;
            j2 = j4;
            list = arrayList3;
        } else {
            arrayList2 = arrayList;
            j = j3;
            j2 = j4;
            list = EmptyList.f17557a;
        }
        return new OndcTicketAppModel(str, str2, j, j2, ondcTicketStatus, l, str3, str4, str5, jLongValue, map, str6, str7, str8, refundInfoAppModel, arrayList2, list, ondcTicketEntity.r);
    }
}
