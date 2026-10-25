package app.chalo.multimodalticket.data.model.app;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketPassengerDetailsEntity;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.instantticket.data.model.app.InstantTicketAppModel;
import app.chalo.instantticket.data.model.app.InstantTicketPassengerDetailsAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.multimodalticket.data.model.GroupTicketLegFareDetailEntityModel;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketChildEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
import app.chalo.ondc.model.app.OndcMetroTicketAppModelKt;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModelKt;
import app.chalo.productbooking.common.data.models.entity.FareBreakupEntityModel;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketAppModelToEntityMapperKt {
    public static final MultiModalGroupTicketPersistenceData a(MultiModalGroupTicketAppModel multiModalGroupTicketAppModel) {
        String str;
        ArrayList arrayList;
        String str2 = "<this>";
        Intrinsics.i(multiModalGroupTicketAppModel, "<this>");
        List list = multiModalGroupTicketAppModel.r;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str3 = multiModalGroupTicketAppModel.f5874a;
        String str4 = multiModalGroupTicketAppModel.b;
        String str5 = multiModalGroupTicketAppModel.c;
        String str6 = multiModalGroupTicketAppModel.d;
        long j = multiModalGroupTicketAppModel.e;
        long j2 = multiModalGroupTicketAppModel.f;
        MultiModalGroupTicketStatus multiModalGroupTicketStatus = multiModalGroupTicketAppModel.g;
        String str7 = multiModalGroupTicketAppModel.h;
        String lowerCase = multiModalGroupTicketAppModel.i.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String str8 = multiModalGroupTicketAppModel.j;
        long j3 = multiModalGroupTicketAppModel.k;
        MultiModalGroupTicketStopDetails multiModalGroupTicketStopDetails = multiModalGroupTicketAppModel.l;
        MultiModalGroupTicketStopDetails multiModalGroupTicketStopDetails2 = multiModalGroupTicketAppModel.m;
        List list2 = multiModalGroupTicketAppModel.n;
        RefundInfoAppModel refundInfoAppModel = multiModalGroupTicketAppModel.o;
        RefundInfoEntityModel refundInfoEntityModelA = refundInfoAppModel != null ? GenericMobileTicketProductApiResponseModelKt.a(refundInfoAppModel) : null;
        List list3 = multiModalGroupTicketAppModel.p;
        List list4 = multiModalGroupTicketAppModel.q;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            GroupTicketLegFareDetailAppModel groupTicketLegFareDetailAppModel = (GroupTicketLegFareDetailAppModel) it.next();
            Intrinsics.i(groupTicketLegFareDetailAppModel, str2);
            int i = groupTicketLegFareDetailAppModel.f5860a;
            String str9 = str2;
            FareBreakupAppModel fareBreakupAppModel = groupTicketLegFareDetailAppModel.b;
            Iterator it2 = it;
            String str10 = str5;
            String str11 = str6;
            long j4 = j;
            FareBreakupEntityModel fareBreakupEntityModel = new FareBreakupEntityModel(fareBreakupAppModel.f3890a, fareBreakupAppModel.b, fareBreakupAppModel.c);
            List<FareBreakupAppModel> list5 = groupTicketLegFareDetailAppModel.c;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list5, 10));
            for (FareBreakupAppModel fareBreakupAppModel2 : list5) {
                fareBreakupAppModel2.getClass();
                arrayList5.add(new FareBreakupEntityModel(fareBreakupAppModel2.f3890a, fareBreakupAppModel2.b, fareBreakupAppModel2.c));
                j2 = j2;
            }
            arrayList4.add(new GroupTicketLegFareDetailEntityModel(i, fareBreakupEntityModel, arrayList5));
            str2 = str9;
            it = it2;
            str5 = str10;
            str6 = str11;
            j = j4;
        }
        String str12 = str5;
        String str13 = str6;
        long j5 = j;
        long j6 = j2;
        int size = list.size();
        List list6 = list;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list6, 10));
        Iterator it3 = list6.iterator();
        while (it3.hasNext()) {
            MultiModalGroupTicketChildAppModel multiModalGroupTicketChildAppModel = (MultiModalGroupTicketChildAppModel) it3.next();
            if (multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.InstantTicketChild) {
                InstantTicketAppModel instantTicketAppModel = ((MultiModalGroupTicketChildAppModel.InstantTicketChild) multiModalGroupTicketChildAppModel).b;
                String str14 = instantTicketAppModel.f3881a;
                String str15 = instantTicketAppModel.b;
                String str16 = instantTicketAppModel.c;
                long j7 = instantTicketAppModel.d;
                long j8 = instantTicketAppModel.e;
                InstantTicketStatus instantTicketStatus = instantTicketAppModel.f;
                Long l = instantTicketAppModel.g;
                String str17 = instantTicketAppModel.h;
                String str18 = instantTicketAppModel.i;
                String str19 = instantTicketAppModel.j;
                Long l2 = instantTicketAppModel.k;
                RouteStopsInfo routeStopsInfo = instantTicketAppModel.l;
                String str20 = routeStopsInfo != null ? routeStopsInfo.f1717a : null;
                String str21 = routeStopsInfo != null ? routeStopsInfo.b : null;
                String str22 = routeStopsInfo != null ? routeStopsInfo.c : null;
                String str23 = routeStopsInfo != null ? routeStopsInfo.d : null;
                String str24 = routeStopsInfo != null ? routeStopsInfo.e : null;
                String str25 = routeStopsInfo != null ? routeStopsInfo.f : null;
                List list7 = instantTicketAppModel.m;
                if (list7 != null) {
                    List list8 = list7;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list8, 10));
                    Iterator it4 = list8.iterator();
                    while (it4.hasNext()) {
                        InstantTicketPassengerDetailsAppModel instantTicketPassengerDetailsAppModel = (InstantTicketPassengerDetailsAppModel) it4.next();
                        arrayList7.add(new InstantTicketPassengerDetailsEntity(instantTicketPassengerDetailsAppModel.f3882a, instantTicketPassengerDetailsAppModel.b, instantTicketPassengerDetailsAppModel.c, instantTicketPassengerDetailsAppModel.d, instantTicketPassengerDetailsAppModel.e, instantTicketPassengerDetailsAppModel.f, instantTicketPassengerDetailsAppModel.g));
                        it4 = it4;
                        str15 = str15;
                        str16 = str16;
                    }
                    arrayList = arrayList7;
                } else {
                    arrayList = null;
                }
                String str26 = str15;
                String str27 = str16;
                RefundInfoAppModel refundInfoAppModel2 = instantTicketAppModel.n;
                arrayList2.add(new InstantTicketEntity(str14, str26, str27, j7, j8, instantTicketStatus, l, str17, str18, str19, l2, str20, str21, str22, str23, str24, str25, arrayList, refundInfoAppModel2 != null ? GenericMobileTicketProductApiResponseModelKt.a(refundInfoAppModel2) : null));
            } else {
                arrayList4 = arrayList4;
                if (!(multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.OndcMetroTicketChild)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList3.add(OndcMetroTicketAppModelKt.b(((MultiModalGroupTicketChildAppModel.OndcMetroTicketChild) multiModalGroupTicketChildAppModel).b));
            }
            String str28 = multiModalGroupTicketAppModel.f5874a;
            int f5877a = multiModalGroupTicketChildAppModel.getF5877a();
            String strB = MultiModalGroupTicketChildAppModelKt.b(multiModalGroupTicketChildAppModel);
            boolean z = multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.InstantTicketChild;
            if (!z && !(multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.OndcMetroTicketChild)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                str = "instantTicket";
            } else {
                if (!(multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.OndcMetroTicketChild)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "ondcMetroTicket";
            }
            arrayList6.add(new MultiModalGroupTicketChildEntity(str28, f5877a, strB, "mobileTicket", str));
            size = size;
            it3 = it3;
            arrayList4 = arrayList4;
        }
        return new MultiModalGroupTicketPersistenceData(new MultiModalGroupTicketEntity(str3, str4, str12, str13, j5, j6, multiModalGroupTicketStatus, str7, lowerCase, str8, j3, multiModalGroupTicketStopDetails, multiModalGroupTicketStopDetails2, list2, refundInfoEntityModelA, list3, arrayList4, size, arrayList6), arrayList2, arrayList3);
    }
}
