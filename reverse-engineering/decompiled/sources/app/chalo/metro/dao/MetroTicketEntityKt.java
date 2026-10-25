package app.chalo.metro.dao;

import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.metro.data.app.MetroTicketStopDetails;
import app.chalo.ticketvalidation.TicketValidationInfoEntity;
import app.chalo.ticketvalidation.TicketValidationInfoEntityKt;
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
public final class MetroTicketEntityKt {
    public static final MetroTicketAppModel a(MetroTicketEntity metroTicketEntity) {
        ArrayList arrayList;
        Intrinsics.i(metroTicketEntity, "<this>");
        String str = metroTicketEntity.f5400a;
        String str2 = metroTicketEntity.b;
        long j = metroTicketEntity.c;
        long j2 = metroTicketEntity.d;
        MetroTicketStatus metroTicketStatus = metroTicketEntity.e;
        Long l = metroTicketEntity.f;
        String str3 = metroTicketEntity.g;
        String str4 = metroTicketEntity.h;
        List list = metroTicketEntity.i;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(TicketValidationInfoEntityKt.a((TicketValidationInfoEntity) it.next()));
            }
        } else {
            arrayList = null;
        }
        String str5 = metroTicketEntity.j;
        Long l2 = metroTicketEntity.k;
        long jLongValue = l2 != null ? l2.longValue() : -1L;
        Map map = metroTicketEntity.l;
        String str6 = metroTicketEntity.m;
        MetroTicketStopDetailsEntity metroTicketStopDetailsEntity = metroTicketEntity.n;
        MetroTicketStopDetails metroTicketStopDetails = metroTicketStopDetailsEntity != null ? new MetroTicketStopDetails(metroTicketStopDetailsEntity.f5401a, metroTicketStopDetailsEntity.b) : null;
        MetroTicketStopDetailsEntity metroTicketStopDetailsEntity2 = metroTicketEntity.o;
        return new MetroTicketAppModel(str, str2, j, j2, metroTicketStatus, l, str3, str4, arrayList, str5, jLongValue, map, str6, metroTicketStopDetails, metroTicketStopDetailsEntity2 != null ? new MetroTicketStopDetails(metroTicketStopDetailsEntity2.f5401a, metroTicketStopDetailsEntity2.b) : null, metroTicketEntity.p);
    }
}
