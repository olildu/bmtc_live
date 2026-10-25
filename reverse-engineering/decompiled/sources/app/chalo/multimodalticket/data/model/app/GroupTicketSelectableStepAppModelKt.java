package app.chalo.multimodalticket.data.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyLeg;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.multimodalticket.domain.GroupTicketAppModelCreationFailure;
import app.chalo.scenes.args.GroupTicketStop;
import defpackage.b3;
import defpackage.pk0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketSelectableStepAppModelKt {
    public static final GroupTicketStop a(StopAppModel stopAppModel) {
        return new GroupTicketStop(stopAppModel.f1727a, stopAppModel.b, stopAppModel.f);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static final GroupTicketLegsAppModel b(GroupTicketSelectableStepAppModel groupTicketSelectableStepAppModel) throws GroupTicketAppModelCreationFailure {
        String str;
        ?? r15;
        ?? r4;
        Intrinsics.i(groupTicketSelectableStepAppModel, "<this>");
        int i = groupTicketSelectableStepAppModel.f5864a;
        GroupTicketSelectableStepLegDetails groupTicketSelectableStepLegDetails = groupTicketSelectableStepAppModel.c;
        TripPlannerLegAppModel.Bus bus = null;
        if (groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Bus) {
            GroupTicketJourneyLeg groupTicketJourneyLeg = ((GroupTicketSelectableStepLegDetails.Bus) groupTicketSelectableStepLegDetails).f5865a;
            String str2 = groupTicketJourneyLeg.f4651a;
            if (StringsKt.F(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                throw new GroupTicketAppModelCreationFailure(b3.d(i, "Blank bus configId while building group-ticket fare request for stepSequence=", CLConstants.DOT_SALT_DELIMETER));
            }
            TripPlannerLegAppModel tripPlannerLegAppModel = groupTicketJourneyLeg.d;
            bus = tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus ? (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel : null;
            if (bus != null) {
                return new GroupTicketLegsAppModel.GroupTicketBusLegsAppModel(i, str2, new GroupTicketBusTripDetailsAppModel(bus.p, bus.s, bus.t));
            }
            throw new GroupTicketAppModelCreationFailure(b3.d(i, "Invalid bus leg while building group-ticket fare request for stepSequence=", CLConstants.DOT_SALT_DELIMETER));
        }
        if (!(groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Metro)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = ((GroupTicketSelectableStepLegDetails.Metro) groupTicketSelectableStepLegDetails).f5866a;
        if (arrayList.isEmpty()) {
            throw new GroupTicketAppModelCreationFailure(b3.d(i, "Empty metro source legs for stepSequence=", CLConstants.DOT_SALT_DELIMETER));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(((GroupTicketJourneyLeg) obj).f4651a);
        }
        String str3 = (String) CollectionsKt.q0(CollectionsKt.z(arrayList2));
        if (str3 == null || StringsKt.F(str3)) {
            str3 = null;
        }
        if (str3 == null) {
            throw new GroupTicketAppModelCreationFailure(b3.d(i, "Invalid metro leg configId for stepSequence=", CLConstants.DOT_SALT_DELIMETER));
        }
        if (arrayList.isEmpty()) {
            throw new GroupTicketAppModelCreationFailure(b3.d(i, "Empty metro source legs for stepSequence=", CLConstants.DOT_SALT_DELIMETER));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TripPlannerLegAppModel tripPlannerLegAppModel2 = ((GroupTicketJourneyLeg) obj2).d;
            TripPlannerLegAppModel.Metro metro = tripPlannerLegAppModel2 instanceof TripPlannerLegAppModel.Metro ? (TripPlannerLegAppModel.Metro) tripPlannerLegAppModel2 : null;
            if (metro == null) {
                throw new GroupTicketAppModelCreationFailure(pk0.f(i, i3, "Invalid metro leg while building group-ticket fare request for stepSequence=", ", legIndex=", CLConstants.DOT_SALT_DELIMETER));
            }
            arrayList3.add(metro);
            i3 = i5;
        }
        StopAppModel stopAppModel = ((TripPlannerLegAppModel.Metro) CollectionsKt.F(arrayList3)).s;
        StopAppModel stopAppModel2 = ((TripPlannerLegAppModel.Metro) CollectionsKt.P(arrayList3)).t;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(arrayList3, 10));
        int size3 = arrayList3.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size3) {
            Object obj3 = arrayList3.get(i7);
            i7++;
            int i8 = i6 + 1;
            if (i6 < 0) {
                ?? r17 = bus;
                CollectionsKt.z0();
                throw r17;
            }
            TripPlannerLegAppModel.Metro metro2 = (TripPlannerLegAppModel.Metro) obj3;
            String str4 = metro2.H;
            if (str4 == null) {
                str = metro2.q;
                if (str != null || StringsKt.F(str)) {
                    r15 = str;
                    r15 = bus;
                }
                if (r15 == 0) {
                    throw new GroupTicketAppModelCreationFailure(pk0.f(i, i6, "Missing metro line color name and route name while building group-ticket fare request for stepSequence=", ", legIndex=", CLConstants.DOT_SALT_DELIMETER));
                }
            } else {
                if (StringsKt.F(str4)) {
                    r15 = str4;
                    r15 = bus;
                }
                if (r15 == 0) {
                    str = metro2.q;
                    if (str != null) {
                        r15 = str;
                        r15 = bus;
                    } else {
                        r15 = str;
                        r15 = bus;
                    }
                    if (r15 == 0) {
                        throw new GroupTicketAppModelCreationFailure(pk0.f(i, i6, "Missing metro line color name and route name while building group-ticket fare request for stepSequence=", ", legIndex=", CLConstants.DOT_SALT_DELIMETER));
                    }
                }
            }
            TripPlannerLegAppModel.Bus bus2 = bus;
            String str5 = metro2.I;
            if (str5 != null) {
                if (StringsKt.F(str5)) {
                    r4 = str5;
                    r4 = bus2;
                }
                if (r4 != 0) {
                    arrayList4.add(new GroupTicketJourneyOverviewItemAppModel(r15, r4, CollectionsKt.S(metro2.s, metro2.t)));
                    bus = bus2;
                    i6 = i8;
                }
            }
            throw new GroupTicketAppModelCreationFailure(pk0.f(i, i6, "Missing metro line color hex while building group-ticket fare request for stepSequence=", ", legIndex=", CLConstants.DOT_SALT_DELIMETER));
        }
        return new GroupTicketLegsAppModel.GroupTicketMetroLegsAppModel(i, str3, new GroupTicketMetroTripDetailsAppModel(stopAppModel, stopAppModel2, arrayList4));
    }
}
