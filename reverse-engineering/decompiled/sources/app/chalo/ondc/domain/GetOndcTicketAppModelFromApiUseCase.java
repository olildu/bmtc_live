package app.chalo.ondc.domain;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModelKt;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.ondc.model.api.TicketValidationEntityApiModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketFareBreakupApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketPassengerDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModelKt;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketStopDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import app.chalo.ticketvalidation.TicketValidationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/GetOndcTicketAppModelFromApiUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetOndcTicketAppModelFromApiUseCase {
    /* JADX WARN: Code duplicated, block: B:116:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static OndcTicketAppModel a(GenericMobileTicketProductApiResponseModel genericMobileTicketModel) {
        String str;
        String str2;
        Long l;
        app.chalo.ondc.model.app.OndcTicketStatus next;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap;
        String str5;
        List list;
        String str6;
        String str7;
        long j;
        List list2;
        String str8;
        String str9;
        long j2;
        Object fareBreakupAppModel;
        Integer num;
        Intrinsics.i(genericMobileTicketModel, "genericMobileTicketModel");
        if (!Intrinsics.d(genericMobileTicketModel.c, "mobileTicket") || !Intrinsics.d(genericMobileTicketModel.d, "ondcTicket") || (str = genericMobileTicketModel.f8124a) == null || (str2 = genericMobileTicketModel.q) == null || (l = genericMobileTicketModel.e) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Long l2 = genericMobileTicketModel.f;
        if (l2 == null) {
            return null;
        }
        long jLongValue2 = l2.longValue();
        String str10 = genericMobileTicketModel.g;
        if (str10 == null) {
            return null;
        }
        app.chalo.ondc.model.app.OndcTicketStatus.INSTANCE.getClass();
        Iterator<app.chalo.ondc.model.app.OndcTicketStatus> it = app.chalo.ondc.model.app.OndcTicketStatus.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.name(), str10));
        app.chalo.ondc.model.app.OndcTicketStatus ondcTicketStatus = next;
        if (ondcTicketStatus == null) {
            ondcTicketStatus = app.chalo.ondc.model.app.OndcTicketStatus.EXPIRED;
        }
        if (ondcTicketStatus == null) {
            return null;
        }
        Long l3 = genericMobileTicketModel.x;
        String str11 = genericMobileTicketModel.h;
        if (str11 == null) {
            return null;
        }
        String lowerCase = str11.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String str12 = genericMobileTicketModel.i;
        String str13 = genericMobileTicketModel.j;
        Long l4 = genericMobileTicketModel.t;
        if (l4 == null) {
            return null;
        }
        long jLongValue3 = l4.longValue();
        List list3 = genericMobileTicketModel.v;
        if (list3 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                GenericMobileTicketPassengerDetailsApiResponseModel genericMobileTicketPassengerDetailsApiResponseModel = (GenericMobileTicketPassengerDetailsApiResponseModel) it2.next();
                Iterator it3 = it2;
                String str14 = genericMobileTicketPassengerDetailsApiResponseModel.b;
                Pair pair = (str14 == null || (num = genericMobileTicketPassengerDetailsApiResponseModel.c) == null) ? null : new Pair(str14, num);
                if (pair != null) {
                    arrayList.add(pair);
                }
                it2 = it3;
                str = str;
            }
            str3 = str;
            str4 = null;
            int iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                int i2 = i + 1;
                Pair pair2 = (Pair) obj;
                Pair pair3 = new Pair(pair2.d(), pair2.e());
                linkedHashMap2.put(pair3.d(), pair3.e());
                i = i2;
                size = size;
                arrayList = arrayList;
            }
            linkedHashMap = linkedHashMap2;
        } else {
            str3 = str;
            str4 = null;
            linkedHashMap = null;
        }
        String str15 = genericMobileTicketModel.r;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel = genericMobileTicketModel.n;
        String str16 = genericMobileTicketStopDetailsApiResponseModel != null ? genericMobileTicketStopDetailsApiResponseModel.b : str4;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2 = genericMobileTicketModel.o;
        String str17 = genericMobileTicketStopDetailsApiResponseModel2 != null ? genericMobileTicketStopDetailsApiResponseModel2.b : str4;
        RefundInfoApiModel refundInfoApiModel = genericMobileTicketModel.F;
        RefundInfoAppModel refundInfoAppModelB = refundInfoApiModel != null ? GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel) : str4;
        List list4 = genericMobileTicketModel.H;
        if (list4 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                String str18 = str15;
                TicketValidationInfo ticketValidationInfoA = GetOndcMetroTicketAppModelFromApiUseCaseKt.a((TicketValidationEntityApiModel) it4.next());
                if (ticketValidationInfoA != null) {
                    arrayList2.add(ticketValidationInfoA);
                }
                str15 = str18;
            }
            str5 = str15;
            list = arrayList2;
        } else {
            str5 = str15;
            list = EmptyList.f17557a;
        }
        List list5 = list;
        List list6 = genericMobileTicketModel.I;
        if (list6 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = list6.iterator();
            while (it5.hasNext()) {
                GenericMobileTicketFareBreakupApiResponseModel genericMobileTicketFareBreakupApiResponseModel = (GenericMobileTicketFareBreakupApiResponseModel) it5.next();
                Iterator it6 = it5;
                String str19 = genericMobileTicketFareBreakupApiResponseModel.f8120a;
                if (str19 == null) {
                    str8 = str16;
                    str9 = str2;
                    j2 = jLongValue;
                } else {
                    str8 = str16;
                    Long l5 = genericMobileTicketFareBreakupApiResponseModel.b;
                    str9 = str2;
                    j2 = jLongValue;
                    if (l5 != null) {
                        long jLongValue4 = l5.longValue();
                        Integer num2 = genericMobileTicketFareBreakupApiResponseModel.c;
                        fareBreakupAppModel = new FareBreakupAppModel(str19, FetchMobileTicketFareResponseApiModelKt.a(num2 != null ? num2.intValue() : -1), jLongValue4);
                    }
                    if (fareBreakupAppModel != null) {
                        arrayList3.add(fareBreakupAppModel);
                    }
                    it5 = it6;
                    str16 = str8;
                    str2 = str9;
                    jLongValue = j2;
                }
                fareBreakupAppModel = str4;
                if (fareBreakupAppModel != null) {
                    arrayList3.add(fareBreakupAppModel);
                }
                it5 = it6;
                str16 = str8;
                str2 = str9;
                jLongValue = j2;
            }
            str6 = str16;
            str7 = str2;
            j = jLongValue;
            list2 = arrayList3;
        } else {
            str6 = str16;
            str7 = str2;
            j = jLongValue;
            list2 = EmptyList.f17557a;
        }
        return new OndcTicketAppModel(str3, str7, j, jLongValue2, ondcTicketStatus, l3, lowerCase, str12, str13, jLongValue3, linkedHashMap, str5, str6, str17, refundInfoAppModelB, list5, list2, genericMobileTicketModel.J);
    }
}
