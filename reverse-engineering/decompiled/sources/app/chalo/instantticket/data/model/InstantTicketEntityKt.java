package app.chalo.instantticket.data.model;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.instantticket.data.model.app.InstantTicketAppModel;
import app.chalo.instantticket.data.model.app.InstantTicketPassengerDetailsAppModel;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketEntityKt {
    public static final InstantTicketAppModel a(InstantTicketEntity instantTicketEntity) {
        ArrayList arrayList;
        Intrinsics.i(instantTicketEntity, "<this>");
        String str = instantTicketEntity.f3840a;
        String str2 = instantTicketEntity.b;
        String str3 = instantTicketEntity.c;
        long j = instantTicketEntity.d;
        long j2 = instantTicketEntity.e;
        InstantTicketStatus instantTicketStatus = instantTicketEntity.f;
        Long l = instantTicketEntity.g;
        String str4 = instantTicketEntity.h;
        String str5 = instantTicketEntity.i;
        String str6 = instantTicketEntity.j;
        Long l2 = instantTicketEntity.k;
        RouteStopsInfo routeStopsInfoB = b(instantTicketEntity);
        List list = instantTicketEntity.r;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                InstantTicketPassengerDetailsEntity instantTicketPassengerDetailsEntity = (InstantTicketPassengerDetailsEntity) it.next();
                arrayList.add(new InstantTicketPassengerDetailsAppModel(instantTicketPassengerDetailsEntity.f3841a, instantTicketPassengerDetailsEntity.b, instantTicketPassengerDetailsEntity.c, instantTicketPassengerDetailsEntity.d, instantTicketPassengerDetailsEntity.e, instantTicketPassengerDetailsEntity.f, instantTicketPassengerDetailsEntity.g));
                it = it;
                str2 = str2;
                str3 = str3;
            }
        } else {
            arrayList = null;
        }
        String str7 = str2;
        String str8 = str3;
        RefundInfoEntityModel refundInfoEntityModel = instantTicketEntity.s;
        return new InstantTicketAppModel(str, str7, str8, j, j2, instantTicketStatus, l, str4, str5, str6, l2, routeStopsInfoB, arrayList, refundInfoEntityModel != null ? RefundInfoEntityModelKt.a(refundInfoEntityModel) : null);
    }

    public static final RouteStopsInfo b(InstantTicketEntity instantTicketEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.i(instantTicketEntity, "<this>");
        String str6 = instantTicketEntity.l;
        if (str6 == null || StringsKt.F(str6) || (str = instantTicketEntity.m) == null || StringsKt.F(str) || (str2 = instantTicketEntity.n) == null || StringsKt.F(str2) || (str3 = instantTicketEntity.o) == null || StringsKt.F(str3) || (str4 = instantTicketEntity.p) == null || StringsKt.F(str4) || (str5 = instantTicketEntity.q) == null || StringsKt.F(str5)) {
            return null;
        }
        return new RouteStopsInfo(instantTicketEntity.l, instantTicketEntity.m, instantTicketEntity.n, instantTicketEntity.o, instantTicketEntity.p, instantTicketEntity.q, null, null);
    }
}
