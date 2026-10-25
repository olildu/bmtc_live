package app.chalo.multimodalticket.data.model.app;

import app.chalo.multimodalticket.error.MultiModalGroupTicketOrderInvalidResponseException;
import app.chalo.scenes.args.GroupTicketBookingLeg;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.scenes.args.GroupTicketMetroLineOverview;
import app.chalo.scenes.args.GroupTicketPassengerDetail;
import app.chalo.scenes.args.GroupTicketStop;
import app.chalo.scenes.args.GroupTicketTripDetail;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketCreateOrderRequestAppModelKt {
    public static final GroupTicketCreateOrderRequestAppModel a(GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs, String str, long j, LinkedHashMap linkedHashMap) throws MultiModalGroupTicketOrderInvalidResponseException {
        String str2;
        ArrayList arrayList;
        char c;
        GroupTicketCreateOrderTripDetailAppModel groupTicketCreateOrderTripDetailAppModel;
        Intrinsics.i(groupTicketBookingSummaryArgs, "<this>");
        String str3 = groupTicketBookingSummaryArgs.b;
        String str4 = groupTicketBookingSummaryArgs.c;
        List<GroupTicketPassengerDetail> list = groupTicketBookingSummaryArgs.d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
        for (GroupTicketPassengerDetail groupTicketPassengerDetail : list) {
            arrayList2.add(new GroupTicketCreateOrderPassengerDetailAppModel(groupTicketPassengerDetail.f9258a, groupTicketPassengerDetail.c));
        }
        List list2 = groupTicketBookingSummaryArgs.e;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            GroupTicketBookingLeg groupTicketBookingLeg = (GroupTicketBookingLeg) it.next();
            int i = groupTicketBookingLeg.f9252a;
            String mode = groupTicketBookingLeg.c.getMode();
            String str5 = groupTicketBookingLeg.b;
            int i2 = groupTicketBookingLeg.f9252a;
            Long l = (Long) linkedHashMap.get(Integer.valueOf(i2));
            if (l == null) {
                throw new MultiModalGroupTicketOrderInvalidResponseException(vo1.j(i2, "Missing fare summary for leg sequence="));
            }
            long jLongValue = l.longValue();
            GroupTicketTripDetail groupTicketTripDetail = groupTicketBookingLeg.d;
            if (groupTicketTripDetail instanceof GroupTicketTripDetail.Bus) {
                GroupTicketTripDetail.Bus bus = (GroupTicketTripDetail.Bus) groupTicketTripDetail;
                groupTicketCreateOrderTripDetailAppModel = new GroupTicketCreateOrderTripDetailAppModel(bus.b, b(bus.d), b(bus.e), null);
                str2 = str4;
                arrayList = arrayList2;
                c = '\n';
            } else {
                if (!(groupTicketTripDetail instanceof GroupTicketTripDetail.Metro)) {
                    throw new NoWhenBranchMatchedException();
                }
                GroupTicketTripDetail.Metro metro = (GroupTicketTripDetail.Metro) groupTicketTripDetail;
                GroupTicketCreateOrderStopAppModel groupTicketCreateOrderStopAppModelB = b(metro.b);
                GroupTicketCreateOrderStopAppModel groupTicketCreateOrderStopAppModelB2 = b(metro.c);
                List list3 = metro.d;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    GroupTicketMetroLineOverview groupTicketMetroLineOverview = (GroupTicketMetroLineOverview) it2.next();
                    String str6 = groupTicketMetroLineOverview.f9256a;
                    Iterator it3 = it2;
                    String str7 = groupTicketMetroLineOverview.b;
                    List list4 = groupTicketMetroLineOverview.c;
                    String str8 = str4;
                    ArrayList arrayList5 = arrayList2;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(b((GroupTicketStop) it4.next()));
                    }
                    arrayList4.add(new GroupTicketCreateOrderMetroLineOverviewAppModel(str6, str7, arrayList6));
                    it2 = it3;
                    arrayList2 = arrayList5;
                    str4 = str8;
                }
                str2 = str4;
                arrayList = arrayList2;
                c = '\n';
                groupTicketCreateOrderTripDetailAppModel = new GroupTicketCreateOrderTripDetailAppModel(null, groupTicketCreateOrderStopAppModelB, groupTicketCreateOrderStopAppModelB2, arrayList4);
            }
            arrayList3.add(new GroupTicketCreateOrderLegAppModel(i, mode, str5, jLongValue, groupTicketCreateOrderTripDetailAppModel));
            arrayList2 = arrayList;
            it = it;
            str3 = str3;
            str4 = str2;
        }
        return new GroupTicketCreateOrderRequestAppModel(str, str3, str4, j, arrayList2, arrayList3);
    }

    public static final GroupTicketCreateOrderStopAppModel b(GroupTicketStop groupTicketStop) {
        String str = groupTicketStop.f9260a;
        String str2 = groupTicketStop.b;
        String str3 = groupTicketStop.c;
        String str4 = null;
        if (str3 != null) {
            if (StringsKt.F(str3)) {
                str3 = null;
            }
            str4 = str3;
        }
        return new GroupTicketCreateOrderStopAppModel(str, str2, str4);
    }
}
