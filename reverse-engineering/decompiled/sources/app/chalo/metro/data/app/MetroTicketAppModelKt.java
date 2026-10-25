package app.chalo.metro.data.app;

import app.chalo.metro.dao.MetroTicketEntity;
import app.chalo.metro.dao.MetroTicketStopDetailsEntity;
import app.chalo.ondc.model.app.OndcMetroTicketAppModelKt;
import app.chalo.productbooking.common.data.models.app.ChaloPassengerType;
import app.chalo.ticketvalidation.TicketValidationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketAppModelKt {
    public static final Integer a(MetroTicketAppModel metroTicketAppModel, ChaloPassengerType passengerType) {
        Set setEntrySet;
        Object next;
        Intrinsics.i(metroTicketAppModel, "<this>");
        Intrinsics.i(passengerType, "passengerType");
        Map map = metroTicketAppModel.l;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator it = setEntrySet.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x((String) ((Map.Entry) next).getKey(), passengerType.getType(), true));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return (Integer) entry.getValue();
            }
        }
        return null;
    }

    public static final MetroTicketEntity b(MetroTicketAppModel metroTicketAppModel) {
        ArrayList arrayList;
        Intrinsics.i(metroTicketAppModel, "<this>");
        String str = metroTicketAppModel.f5431a;
        String str2 = metroTicketAppModel.b;
        long j = metroTicketAppModel.c;
        long j2 = metroTicketAppModel.d;
        MetroTicketStatus metroTicketStatus = metroTicketAppModel.e;
        Long l = metroTicketAppModel.f;
        String str3 = metroTicketAppModel.g;
        String str4 = metroTicketAppModel.h;
        List list = metroTicketAppModel.i;
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
        String str5 = metroTicketAppModel.j;
        Long lValueOf = Long.valueOf(metroTicketAppModel.k);
        Map map = metroTicketAppModel.l;
        String str6 = metroTicketAppModel.m;
        MetroTicketStopDetails metroTicketStopDetails = metroTicketAppModel.n;
        MetroTicketStopDetailsEntity metroTicketStopDetailsEntity = metroTicketStopDetails != null ? new MetroTicketStopDetailsEntity(metroTicketStopDetails.f5434a, metroTicketStopDetails.b) : null;
        MetroTicketStopDetails metroTicketStopDetails2 = metroTicketAppModel.o;
        return new MetroTicketEntity(str, str2, j, j2, metroTicketStatus, l, str3, str4, arrayList, str5, lValueOf, map, str6, metroTicketStopDetailsEntity, metroTicketStopDetails2 != null ? new MetroTicketStopDetailsEntity(metroTicketStopDetails2.f5434a, metroTicketStopDetails2.b) : null, metroTicketAppModel.p);
    }
}
