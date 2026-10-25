package app.chalo.metro.domain;

import app.chalo.metro.data.api.MetroTicketApiModel;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.metro.data.app.MetroTicketStopDetails;
import app.chalo.ondc.domain.GetOndcMetroTicketAppModelFromApiUseCaseKt;
import app.chalo.ondc.model.api.TicketValidationEntityApiModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketPassengerDetailsApiResponseModel;
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
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/domain/GetMetroTicketAppModelFromApiUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetMetroTicketAppModelFromApiUseCase {
    /* JADX WARN: Multi-variable type inference failed */
    public static MetroTicketAppModel a(MetroTicketApiModel genericMobileTicketModel) {
        String str;
        String str2;
        Long l;
        ArrayList arrayList;
        String str3;
        MetroTicketStopDetails metroTicketStopDetails;
        LinkedHashMap linkedHashMap;
        MetroTicketStopDetails metroTicketStopDetails2;
        MetroTicketStopDetails metroTicketStopDetails3;
        Integer num;
        Intrinsics.i(genericMobileTicketModel, "genericMobileTicketModel");
        if (!Intrinsics.d(genericMobileTicketModel.b, "mobileTicket") || !Intrinsics.d(genericMobileTicketModel.c, "metroTicket") || (str = genericMobileTicketModel.f5414a) == null || (str2 = genericMobileTicketModel.o) == null || (l = genericMobileTicketModel.d) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Long l2 = genericMobileTicketModel.e;
        if (l2 == null) {
            return null;
        }
        long jLongValue2 = l2.longValue();
        String str4 = genericMobileTicketModel.f;
        if (str4 == null) {
            return null;
        }
        MetroTicketStatus.INSTANCE.getClass();
        MetroTicketStatus metroTicketStatusA = MetroTicketStatus.Companion.a(str4);
        if (metroTicketStatusA == null) {
            return null;
        }
        Long l3 = genericMobileTicketModel.t;
        String str5 = genericMobileTicketModel.g;
        if (str5 == null) {
            return null;
        }
        String lowerCase = str5.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String str6 = genericMobileTicketModel.h;
        List list = genericMobileTicketModel.i;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TicketValidationInfo ticketValidationInfoA = GetOndcMetroTicketAppModelFromApiUseCaseKt.a((TicketValidationEntityApiModel) it.next());
                if (ticketValidationInfoA != null) {
                    arrayList2.add(ticketValidationInfoA);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String str7 = genericMobileTicketModel.j;
        Long l4 = genericMobileTicketModel.q;
        if (l4 == null) {
            return null;
        }
        long jLongValue3 = l4.longValue();
        List list2 = genericMobileTicketModel.r;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                GenericMobileTicketPassengerDetailsApiResponseModel genericMobileTicketPassengerDetailsApiResponseModel = (GenericMobileTicketPassengerDetailsApiResponseModel) it2.next();
                Iterator it3 = it2;
                String str8 = genericMobileTicketPassengerDetailsApiResponseModel.b;
                Pair pair = (str8 == null || (num = genericMobileTicketPassengerDetailsApiResponseModel.c) == null) ? null : new Pair(str8, num);
                if (pair != null) {
                    arrayList3.add(pair);
                }
                it2 = it3;
                str = str;
            }
            str3 = str;
            metroTicketStopDetails = null;
            int iG = MapsKt.g(CollectionsKt.v(arrayList3, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG);
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                int i2 = i + 1;
                Pair pair2 = (Pair) obj;
                Pair pair3 = new Pair(pair2.d(), pair2.e());
                linkedHashMap2.put(pair3.d(), pair3.e());
                i = i2;
                size = size;
                arrayList3 = arrayList3;
            }
            linkedHashMap = linkedHashMap2;
        } else {
            str3 = str;
            metroTicketStopDetails = null;
            linkedHashMap = null;
        }
        String str9 = genericMobileTicketModel.p;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel = genericMobileTicketModel.l;
        if (genericMobileTicketStopDetailsApiResponseModel != null) {
            String str10 = genericMobileTicketStopDetailsApiResponseModel.b;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = genericMobileTicketStopDetailsApiResponseModel.f8130a;
            if (str11 == null) {
                str11 = "";
            }
            metroTicketStopDetails2 = new MetroTicketStopDetails(str10, str11);
        } else {
            metroTicketStopDetails2 = metroTicketStopDetails;
        }
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2 = genericMobileTicketModel.m;
        if (genericMobileTicketStopDetailsApiResponseModel2 != null) {
            String str12 = genericMobileTicketStopDetailsApiResponseModel2.b;
            if (str12 == null) {
                str12 = "";
            }
            String str13 = genericMobileTicketStopDetailsApiResponseModel2.f8130a;
            if (str13 == null) {
                str13 = "";
            }
            metroTicketStopDetails3 = new MetroTicketStopDetails(str12, str13);
        } else {
            metroTicketStopDetails3 = metroTicketStopDetails;
        }
        RefundInfoApiModel refundInfoApiModel = genericMobileTicketModel.v;
        return new MetroTicketAppModel(str3, str2, jLongValue, jLongValue2, metroTicketStatusA, l3, lowerCase, str6, arrayList, str7, jLongValue3, linkedHashMap, str9, metroTicketStopDetails2, metroTicketStopDetails3, refundInfoApiModel != null ? GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel) : metroTicketStopDetails);
    }
}
