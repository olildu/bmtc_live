package app.chalo.instantticket.data.model.api.response;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketPassengerDetailsEntity;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModelKt;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InstantMobileTicketResponseApiModelKt {
    public static final boolean a(InstantTicketResponseApiModel instantTicketResponseApiModel) {
        Intrinsics.i(instantTicketResponseApiModel, "<this>");
        return (instantTicketResponseApiModel.f3869a == null || instantTicketResponseApiModel.c == null || instantTicketResponseApiModel.d == null || instantTicketResponseApiModel.e == null || instantTicketResponseApiModel.f == null || instantTicketResponseApiModel.h == null || instantTicketResponseApiModel.n == null || instantTicketResponseApiModel.b == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    public static final InstantTicketEntity b(InstantTicketResponseApiModel instantTicketResponseApiModel) {
        ArrayList arrayList;
        RefundInfoAppModel refundInfoAppModelB;
        String str;
        Integer num;
        InstantTicketPassengerDetailsEntity instantTicketPassengerDetailsEntity;
        String str2 = instantTicketResponseApiModel.f3869a;
        String str3 = str2 == null ? "" : str2;
        String str4 = instantTicketResponseApiModel.b;
        String str5 = str4 == null ? "" : str4;
        String str6 = instantTicketResponseApiModel.c;
        String str7 = str6 == null ? "" : str6;
        Long l = instantTicketResponseApiModel.d;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = instantTicketResponseApiModel.e;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        InstantTicketStatus.Companion companion = InstantTicketStatus.INSTANCE;
        String str8 = instantTicketResponseApiModel.f;
        if (str8 == null) {
            str8 = "";
        }
        companion.getClass();
        InstantTicketStatus instantTicketStatusA = InstantTicketStatus.Companion.a(str8);
        Long l3 = instantTicketResponseApiModel.g;
        String str9 = instantTicketResponseApiModel.h;
        String str10 = str9 == null ? "" : str9;
        String str11 = instantTicketResponseApiModel.i;
        String str12 = instantTicketResponseApiModel.j;
        Long l4 = instantTicketResponseApiModel.n;
        InstantTicketRouteDetailsApiModel instantTicketRouteDetailsApiModel = instantTicketResponseApiModel.l;
        String str13 = instantTicketRouteDetailsApiModel != null ? instantTicketRouteDetailsApiModel.f3871a : null;
        String str14 = instantTicketRouteDetailsApiModel != null ? instantTicketRouteDetailsApiModel.b : null;
        String str15 = instantTicketRouteDetailsApiModel != null ? instantTicketRouteDetailsApiModel.c : null;
        String str16 = instantTicketRouteDetailsApiModel != null ? instantTicketRouteDetailsApiModel.d : null;
        String str17 = instantTicketRouteDetailsApiModel != null ? instantTicketRouteDetailsApiModel.e : null;
        String str18 = instantTicketRouteDetailsApiModel != null ? instantTicketRouteDetailsApiModel.f : null;
        List list = instantTicketResponseApiModel.m;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l5 = l4;
                InstantTicketPassengerDetailsApiModel instantTicketPassengerDetailsApiModel = (InstantTicketPassengerDetailsApiModel) it.next();
                Iterator it2 = it;
                String str19 = instantTicketPassengerDetailsApiModel.f3867a;
                if (str19 == null || (str = instantTicketPassengerDetailsApiModel.b) == null || (num = instantTicketPassengerDetailsApiModel.c) == null) {
                    instantTicketPassengerDetailsEntity = null;
                } else {
                    int iIntValue = num.intValue();
                    Long l6 = instantTicketPassengerDetailsApiModel.d;
                    if (l6 != null) {
                        long jLongValue3 = l6.longValue();
                        Long l7 = instantTicketPassengerDetailsApiModel.e;
                        if (l7 != null) {
                            instantTicketPassengerDetailsEntity = new InstantTicketPassengerDetailsEntity(str19, str, iIntValue, jLongValue3, l7.longValue(), instantTicketPassengerDetailsApiModel.f, instantTicketPassengerDetailsApiModel.g);
                        } else {
                            instantTicketPassengerDetailsEntity = null;
                        }
                    } else {
                        instantTicketPassengerDetailsEntity = null;
                    }
                }
                if (instantTicketPassengerDetailsEntity != null) {
                    arrayList2.add(instantTicketPassengerDetailsEntity);
                }
                it = it2;
                l4 = l5;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Long l8 = l4;
        RefundInfoApiModel refundInfoApiModel = instantTicketResponseApiModel.o;
        return new InstantTicketEntity(str3, str5, str7, jLongValue, jLongValue2, instantTicketStatusA, l3, str10, str11, str12, l8, str13, str14, str15, str16, str17, str18, arrayList, (refundInfoApiModel == null || (refundInfoAppModelB = GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel)) == null) ? null : GenericMobileTicketProductApiResponseModelKt.a(refundInfoAppModelB));
    }
}
