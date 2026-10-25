package app.chalo.multimodalticket.data.model.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.GroupTicketBookingLeg;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.scenes.args.GroupTicketMetroLineOverview;
import app.chalo.scenes.args.GroupTicketPassengerDetail;
import app.chalo.scenes.args.GroupTicketStop;
import app.chalo.scenes.args.GroupTicketTripDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketSummaryRequestAppModelKt {
    public static final GroupTicketSummaryRequestAppModel a(GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs, String str) {
        Iterator it;
        int i;
        String str2;
        GroupTicketSummaryTripDetailAppModel groupTicketSummaryTripDetailAppModel;
        Intrinsics.i(groupTicketBookingSummaryArgs, "<this>");
        String str3 = groupTicketBookingSummaryArgs.b;
        String str4 = groupTicketBookingSummaryArgs.c;
        List<GroupTicketPassengerDetail> list = groupTicketBookingSummaryArgs.d;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (GroupTicketPassengerDetail groupTicketPassengerDetail : list) {
            arrayList.add(new GroupTicketSummaryPassengerDetailAppModel(groupTicketPassengerDetail.f9258a, groupTicketPassengerDetail.c));
        }
        List list2 = groupTicketBookingSummaryArgs.e;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            GroupTicketBookingLeg groupTicketBookingLeg = (GroupTicketBookingLeg) it2.next();
            int i3 = groupTicketBookingLeg.f9252a;
            ChaloTransitMode chaloTransitMode = groupTicketBookingLeg.c;
            String str5 = groupTicketBookingLeg.b;
            GroupTicketTripDetail groupTicketTripDetail = groupTicketBookingLeg.d;
            if (groupTicketTripDetail instanceof GroupTicketTripDetail.Bus) {
                GroupTicketTripDetail.Bus bus = (GroupTicketTripDetail.Bus) groupTicketTripDetail;
                groupTicketSummaryTripDetailAppModel = new GroupTicketSummaryTripDetailAppModel(bus.b, b(bus.d), b(bus.e), null);
                it = it2;
                i = i2;
                str2 = str4;
            } else {
                if (!(groupTicketTripDetail instanceof GroupTicketTripDetail.Metro)) {
                    throw new NoWhenBranchMatchedException();
                }
                GroupTicketTripDetail.Metro metro = (GroupTicketTripDetail.Metro) groupTicketTripDetail;
                GroupTicketSummaryStopAppModel groupTicketSummaryStopAppModelB = b(metro.b);
                GroupTicketSummaryStopAppModel groupTicketSummaryStopAppModelB2 = b(metro.c);
                List list3 = metro.d;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list3, i2));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    GroupTicketMetroLineOverview groupTicketMetroLineOverview = (GroupTicketMetroLineOverview) it3.next();
                    String str6 = groupTicketMetroLineOverview.f9256a;
                    String str7 = groupTicketMetroLineOverview.b;
                    List list4 = groupTicketMetroLineOverview.c;
                    Iterator it4 = it2;
                    Iterator it5 = it3;
                    String str8 = str4;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list4, 10));
                    Iterator it6 = list4.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(b((GroupTicketStop) it6.next()));
                    }
                    arrayList3.add(new GroupTicketSummaryMetroLineOverviewAppModel(str6, str7, arrayList4));
                    i2 = 10;
                    str4 = str8;
                    it2 = it4;
                    it3 = it5;
                }
                it = it2;
                i = i2;
                str2 = str4;
                groupTicketSummaryTripDetailAppModel = new GroupTicketSummaryTripDetailAppModel(null, groupTicketSummaryStopAppModelB, groupTicketSummaryStopAppModelB2, arrayList3);
            }
            arrayList2.add(new GroupTicketSummaryLegAppModel(i3, chaloTransitMode, str5, groupTicketSummaryTripDetailAppModel));
            i2 = i;
            str4 = str2;
            it2 = it;
        }
        return new GroupTicketSummaryRequestAppModel(str, str4, str3, arrayList, arrayList2);
    }

    public static final GroupTicketSummaryStopAppModel b(GroupTicketStop groupTicketStop) {
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
        return new GroupTicketSummaryStopAppModel(str, str2, str4);
    }
}
