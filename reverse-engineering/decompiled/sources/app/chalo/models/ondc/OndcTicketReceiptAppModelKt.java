package app.chalo.models.ondc;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketReceiptAppModelKt {
    public static final OndcTicketReceiptAppModel a(OndcTicketReceiptApiModel ondcTicketReceiptApiModel) {
        String str;
        String str2;
        String str3;
        String str4;
        Map mapD;
        Intrinsics.i(ondcTicketReceiptApiModel, "<this>");
        String str5 = ondcTicketReceiptApiModel.f5628a;
        if (str5 == null || (str = ondcTicketReceiptApiModel.i) == null || (str2 = ondcTicketReceiptApiModel.j) == null) {
            return null;
        }
        Long l = ondcTicketReceiptApiModel.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        Long l2 = ondcTicketReceiptApiModel.c;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        String str6 = ondcTicketReceiptApiModel.d;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = ondcTicketReceiptApiModel.e;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = ondcTicketReceiptApiModel.f;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = ondcTicketReceiptApiModel.g;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = ondcTicketReceiptApiModel.h;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = ondcTicketReceiptApiModel.k;
        if (str11 == null) {
            return null;
        }
        List list = ondcTicketReceiptApiModel.l;
        if (list != null) {
            List list2 = list;
            int iG = MapsKt.g(CollectionsKt.v(list2, 10));
            if (iG < 16) {
                iG = 16;
            }
            mapD = new LinkedHashMap(iG);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                OndcTicketReceiptPassengerDetailsApiResponseModel ondcTicketReceiptPassengerDetailsApiResponseModel = (OndcTicketReceiptPassengerDetailsApiResponseModel) it.next();
                String str12 = str6;
                String str13 = ondcTicketReceiptPassengerDetailsApiResponseModel.b;
                if (str13 == null) {
                    str13 = "";
                }
                Integer num = ondcTicketReceiptPassengerDetailsApiResponseModel.c;
                String str14 = str5;
                Pair pair = new Pair(str13, Integer.valueOf(num != null ? num.intValue() : 0));
                mapD.put(pair.d(), pair.e());
                it = it2;
                str6 = str12;
                str5 = str14;
            }
            str3 = str6;
            str4 = str5;
        } else {
            str3 = str6;
            str4 = str5;
            mapD = MapsKt.d();
        }
        return new OndcTicketReceiptAppModel(str4, jLongValue, jLongValue2, str3, str7, str8, str9, str10, str, str2, str11, mapD);
    }
}
