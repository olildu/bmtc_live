package app.chalo.metro.dao.ondc;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.ondc.model.app.PaymentInfoAppModel;
import app.chalo.productbooking.common.data.models.entity.PaymentInfoEntityModel;
import app.chalo.ticketvalidation.TicketValidationInfoEntity;
import app.chalo.ticketvalidation.TicketValidationInfoEntityKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketEntityKt {
    public static final OndcMetroTicketAppModel a(OndcMetroTicketEntity ondcMetroTicketEntity) {
        ArrayList arrayList;
        Intrinsics.i(ondcMetroTicketEntity, "<this>");
        String str = ondcMetroTicketEntity.f5403a;
        String str2 = ondcMetroTicketEntity.b;
        long j = ondcMetroTicketEntity.c;
        long j2 = ondcMetroTicketEntity.d;
        OndcMetroTicketStatus ondcMetroTicketStatus = ondcMetroTicketEntity.e;
        Long l = ondcMetroTicketEntity.f;
        String str3 = ondcMetroTicketEntity.g;
        String str4 = ondcMetroTicketEntity.h;
        List list = ondcMetroTicketEntity.i;
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
        String str5 = ondcMetroTicketEntity.j;
        Long l2 = ondcMetroTicketEntity.k;
        long jLongValue = l2 != null ? l2.longValue() : -1L;
        Map map = ondcMetroTicketEntity.l;
        String str6 = ondcMetroTicketEntity.m;
        String str7 = ondcMetroTicketEntity.n;
        String str8 = ondcMetroTicketEntity.o;
        RefundInfoAppModel refundInfoAppModel = ondcMetroTicketEntity.p;
        List list3 = ondcMetroTicketEntity.q;
        PaymentInfoEntityModel paymentInfoEntityModel = ondcMetroTicketEntity.r;
        PaymentInfoAppModel paymentInfoAppModel = paymentInfoEntityModel != null ? new PaymentInfoAppModel(paymentInfoEntityModel.f8243a) : null;
        String str9 = ondcMetroTicketEntity.s;
        String str10 = (str9 == null || StringsKt.F(str9)) ? null : str9;
        String str11 = ondcMetroTicketEntity.t;
        return new OndcMetroTicketAppModel(str, str2, j, j2, ondcMetroTicketStatus, l, str3, str4, arrayList, str5, jLongValue, map, str6, str7, str8, refundInfoAppModel, list3, paymentInfoAppModel, str10, (str11 == null || StringsKt.F(str11)) ? null : str11);
    }
}
