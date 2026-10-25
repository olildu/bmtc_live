package app.chalo.ondc.model.app;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.productbooking.common.data.models.app.ChaloPassengerType;
import app.chalo.productbooking.common.data.models.entity.PaymentInfoEntityModel;
import app.chalo.ticketvalidation.TicketValidationInfo;
import app.chalo.ticketvalidation.TicketValidationInfoEntity;
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
public final class OndcMetroTicketAppModelKt {
    public static final Integer a(OndcMetroTicketAppModel ondcMetroTicketAppModel, ChaloPassengerType passengerType) {
        Set setEntrySet;
        Object next;
        Intrinsics.i(ondcMetroTicketAppModel, "<this>");
        Intrinsics.i(passengerType, "passengerType");
        Map map = ondcMetroTicketAppModel.l;
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

    public static final OndcMetroTicketEntity b(OndcMetroTicketAppModel ondcMetroTicketAppModel) {
        ArrayList arrayList;
        Intrinsics.i(ondcMetroTicketAppModel, "<this>");
        String str = ondcMetroTicketAppModel.f6769a;
        String str2 = ondcMetroTicketAppModel.b;
        long j = ondcMetroTicketAppModel.c;
        long j2 = ondcMetroTicketAppModel.d;
        OndcMetroTicketStatus ondcMetroTicketStatus = ondcMetroTicketAppModel.e;
        Long l = ondcMetroTicketAppModel.f;
        String str3 = ondcMetroTicketAppModel.g;
        String str4 = ondcMetroTicketAppModel.h;
        List list = ondcMetroTicketAppModel.i;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(c((TicketValidationInfo) it.next()));
            }
        } else {
            arrayList = null;
        }
        String str5 = ondcMetroTicketAppModel.j;
        Long lValueOf = Long.valueOf(ondcMetroTicketAppModel.k);
        Map map = ondcMetroTicketAppModel.l;
        String str6 = ondcMetroTicketAppModel.m;
        String str7 = ondcMetroTicketAppModel.n;
        String str8 = ondcMetroTicketAppModel.o;
        RefundInfoAppModel refundInfoAppModel = ondcMetroTicketAppModel.p;
        List list3 = ondcMetroTicketAppModel.q;
        PaymentInfoAppModel paymentInfoAppModel = ondcMetroTicketAppModel.r;
        PaymentInfoEntityModel paymentInfoEntityModel = paymentInfoAppModel != null ? new PaymentInfoEntityModel(paymentInfoAppModel.f6774a) : null;
        String str9 = ondcMetroTicketAppModel.s;
        String str10 = (str9 == null || StringsKt.F(str9)) ? null : str9;
        String str11 = ondcMetroTicketAppModel.t;
        return new OndcMetroTicketEntity(str, str2, j, j2, ondcMetroTicketStatus, l, str3, str4, arrayList, str5, lValueOf, map, str6, str7, str8, refundInfoAppModel, list3, paymentInfoEntityModel, str10, (str11 == null || StringsKt.F(str11)) ? null : str11);
    }

    public static final TicketValidationInfoEntity c(TicketValidationInfo ticketValidationInfo) {
        Intrinsics.i(ticketValidationInfo, "<this>");
        return new TicketValidationInfoEntity(ticketValidationInfo.e, ticketValidationInfo.d, ticketValidationInfo.f9624a, ticketValidationInfo.b, ticketValidationInfo.c);
    }
}
