package app.chalo.ondc.domain;

import app.chalo.ondc.model.api.MetroJourneyOverviewApiModel;
import app.chalo.ondc.model.api.MetroJourneyStopApiModel;
import app.chalo.ondc.model.api.OndcMetroTicketApiModel;
import app.chalo.ondc.model.api.TicketValidationEntityApiModel;
import app.chalo.ondc.model.app.MetroJourneyOverview;
import app.chalo.ondc.model.app.MetroJourneyStop;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.ondc.model.app.PaymentInfoAppModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketPassengerDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModelKt;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketStopDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.PaymentInfoApiModel;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import app.chalo.ticketvalidation.TicketValidationInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/GetOndcMetroTicketAppModelFromApiUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetOndcMetroTicketAppModelFromApiUseCase {
    /* JADX WARN: Code duplicated, block: B:134:0x022b A[LOOP:5: B:122:0x0200->B:134:0x022b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0295  */
    /* JADX WARN: Code duplicated, block: B:174:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r22v2, types: [app.chalo.data.RefundInfoAppModel] */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v2, types: [app.chalo.ondc.model.app.PaymentInfoAppModel] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static OndcMetroTicketAppModel a(OndcMetroTicketApiModel genericMobileTicketModel) {
        String str;
        String str2;
        Long l;
        OndcMetroTicketStatus ondcMetroTicketStatus;
        ArrayList arrayList;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap;
        Object paymentInfoAppModel;
        Object obj;
        LinkedHashMap linkedHashMap2;
        Object obj2;
        String str5;
        long j;
        ?? r2;
        Object obj3;
        List list;
        String str6;
        long j2;
        Object metroJourneyOverview;
        Object metroJourneyStop;
        String str7;
        String str8;
        Integer num;
        Intrinsics.i(genericMobileTicketModel, "genericMobileTicketModel");
        if (!Intrinsics.d(genericMobileTicketModel.b, "mobileTicket") || !Intrinsics.d(genericMobileTicketModel.c, "ondcMetroTicket") || (str = genericMobileTicketModel.f6726a) == null || (str2 = genericMobileTicketModel.o) == null || (l = genericMobileTicketModel.d) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Long l2 = genericMobileTicketModel.e;
        if (l2 == null) {
            return null;
        }
        long jLongValue2 = l2.longValue();
        String str9 = genericMobileTicketModel.f;
        if (str9 == null) {
            return null;
        }
        OndcMetroTicketStatus.INSTANCE.getClass();
        OndcMetroTicketStatus[] ondcMetroTicketStatusArrValues = OndcMetroTicketStatus.values();
        int length = ondcMetroTicketStatusArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ondcMetroTicketStatus = null;
                break;
            }
            ondcMetroTicketStatus = ondcMetroTicketStatusArrValues[i];
            if (Intrinsics.d(ondcMetroTicketStatus.name(), str9)) {
                break;
            }
            i++;
        }
        if (ondcMetroTicketStatus == null) {
            ondcMetroTicketStatus = OndcMetroTicketStatus.EXPIRED;
        }
        OndcMetroTicketStatus ondcMetroTicketStatus2 = ondcMetroTicketStatus;
        if (ondcMetroTicketStatus2 == null) {
            return null;
        }
        Long l3 = genericMobileTicketModel.t;
        String str10 = genericMobileTicketModel.g;
        if (str10 == null) {
            return null;
        }
        String lowerCase = str10.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String str11 = genericMobileTicketModel.h;
        List list2 = genericMobileTicketModel.i;
        if (list2 != null) {
            arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                TicketValidationInfo ticketValidationInfoA = GetOndcMetroTicketAppModelFromApiUseCaseKt.a((TicketValidationEntityApiModel) it.next());
                if (ticketValidationInfoA != null) {
                    arrayList.add(ticketValidationInfoA);
                }
            }
        } else {
            arrayList = null;
        }
        String str12 = genericMobileTicketModel.j;
        Long l4 = genericMobileTicketModel.q;
        if (l4 == null) {
            return null;
        }
        long jLongValue3 = l4.longValue();
        List list3 = genericMobileTicketModel.r;
        if (list3 != null) {
            str4 = null;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                GenericMobileTicketPassengerDetailsApiResponseModel genericMobileTicketPassengerDetailsApiResponseModel = (GenericMobileTicketPassengerDetailsApiResponseModel) it2.next();
                Iterator it3 = it2;
                String str13 = genericMobileTicketPassengerDetailsApiResponseModel.b;
                Pair pair = (str13 == null || (num = genericMobileTicketPassengerDetailsApiResponseModel.c) == null) ? null : new Pair(str13, num);
                if (pair != null) {
                    arrayList2.add(pair);
                }
                it2 = it3;
                str = str;
            }
            str3 = str;
            int iG = MapsKt.g(CollectionsKt.v(arrayList2, 10));
            if (iG < 16) {
                iG = 16;
            }
            linkedHashMap = new LinkedHashMap(iG);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj4 = arrayList2.get(i2);
                int i3 = i2 + 1;
                Pair pair2 = (Pair) obj4;
                Pair pair3 = new Pair(pair2.d(), pair2.e());
                linkedHashMap.put(pair3.d(), pair3.e());
                i2 = i3;
                size = size;
                arrayList2 = arrayList2;
            }
        } else {
            str3 = str;
            str4 = null;
            linkedHashMap = null;
        }
        String str14 = genericMobileTicketModel.p;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel = genericMobileTicketModel.l;
        String str15 = genericMobileTicketStopDetailsApiResponseModel != null ? genericMobileTicketStopDetailsApiResponseModel.b : str4;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2 = genericMobileTicketModel.m;
        String str16 = genericMobileTicketStopDetailsApiResponseModel2 != null ? genericMobileTicketStopDetailsApiResponseModel2.b : str4;
        RefundInfoApiModel refundInfoApiModel = genericMobileTicketModel.w;
        Object objB = refundInfoApiModel != null ? GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel) : str4;
        PaymentInfoApiModel paymentInfoApiModel = genericMobileTicketModel.v;
        if (paymentInfoApiModel == null || (str8 = paymentInfoApiModel.f8147a) == null) {
            paymentInfoAppModel = str4;
        } else {
            if (StringsKt.F(str8)) {
                str8 = str4;
            }
            if (str8 != null) {
                paymentInfoAppModel = new PaymentInfoAppModel(str8);
            } else {
                paymentInfoAppModel = str4;
            }
        }
        String str17 = genericMobileTicketModel.u;
        String str18 = (str17 == null || StringsKt.F(str17)) ? str4 : str17;
        String str19 = genericMobileTicketModel.y;
        String str20 = (str19 == null || StringsKt.F(str19)) ? str4 : str19;
        Object obj5 = genericMobileTicketModel.x;
        if (obj5 == null) {
            obj = paymentInfoAppModel;
            linkedHashMap2 = linkedHashMap;
            obj2 = objB;
            str5 = str2;
            j = jLongValue;
            r2 = str4;
        } else {
            if (((Collection) obj5).isEmpty()) {
                obj5 = str4;
            }
            if (obj5 != null) {
                Iterable iterable = (Iterable) obj5;
                obj = paymentInfoAppModel;
                linkedHashMap2 = linkedHashMap;
                ?? arrayList3 = new ArrayList(CollectionsKt.v(iterable, 10));
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    MetroJourneyOverviewApiModel metroJourneyOverviewApiModel = (MetroJourneyOverviewApiModel) it4.next();
                    String str21 = "<this>";
                    Intrinsics.i(metroJourneyOverviewApiModel, "<this>");
                    Iterator it5 = it4;
                    String str22 = metroJourneyOverviewApiModel.f6722a;
                    if (str22 == null) {
                        obj3 = objB;
                    } else {
                        obj3 = objB;
                        String str23 = metroJourneyOverviewApiModel.b;
                        if (str23 != null && (list = metroJourneyOverviewApiModel.c) != null) {
                            List list4 = list;
                            str6 = str2;
                            j2 = jLongValue;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list4, 10));
                            Iterator it6 = list4.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    metroJourneyOverview = new MetroJourneyOverview(str22, str23, arrayList4);
                                    break;
                                }
                                MetroJourneyStopApiModel metroJourneyStopApiModel = (MetroJourneyStopApiModel) it6.next();
                                Intrinsics.i(metroJourneyStopApiModel, str21);
                                Iterator it7 = it6;
                                String str24 = metroJourneyStopApiModel.f6724a;
                                if (str24 == null) {
                                    str7 = str21;
                                } else {
                                    str7 = str21;
                                    String str25 = metroJourneyStopApiModel.b;
                                    if (str25 != null) {
                                        metroJourneyStop = new MetroJourneyStop(str24, str25, metroJourneyStopApiModel.c);
                                    }
                                    if (metroJourneyStop == null) {
                                        arrayList4.add(metroJourneyStop);
                                        it6 = it7;
                                        str21 = str7;
                                    }
                                }
                                metroJourneyStop = str4;
                                if (metroJourneyStop == null) {
                                    arrayList4.add(metroJourneyStop);
                                    it6 = it7;
                                    str21 = str7;
                                }
                            }
                            arrayList3.add(metroJourneyOverview);
                            it4 = it5;
                            objB = obj3;
                            str2 = str6;
                            jLongValue = j2;
                        }
                        metroJourneyOverview = str4;
                        arrayList3.add(metroJourneyOverview);
                        it4 = it5;
                        objB = obj3;
                        str2 = str6;
                        jLongValue = j2;
                    }
                    str6 = str2;
                    j2 = jLongValue;
                    metroJourneyOverview = str4;
                    arrayList3.add(metroJourneyOverview);
                    it4 = it5;
                    objB = obj3;
                    str2 = str6;
                    jLongValue = j2;
                }
                obj2 = objB;
                str5 = str2;
                j = jLongValue;
                if (!arrayList3.isEmpty()) {
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj6 = arrayList3.get(i4);
                        i4++;
                        if (((MetroJourneyOverview) obj6) == null) {
                            arrayList3 = str4;
                            break;
                        }
                    }
                }
                if (arrayList3 != 0) {
                    int size3 = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj7 = arrayList3.get(i5);
                        i5++;
                        if (obj7 == null) {
                            throw new IllegalArgumentException("null element found in " + arrayList3 + FilenameUtils.EXTENSION_SEPARATOR);
                        }
                    }
                    r2 = arrayList3;
                }
            } else {
                obj = paymentInfoAppModel;
                linkedHashMap2 = linkedHashMap;
                obj2 = objB;
                str5 = str2;
                j = jLongValue;
            }
            r2 = str4;
        }
        return new OndcMetroTicketAppModel(str3, str5, j, jLongValue2, ondcMetroTicketStatus2, l3, lowerCase, str11, arrayList, str12, jLongValue3, linkedHashMap2, str14, str15, str16, obj2, r2, obj, str18, str20);
    }
}
