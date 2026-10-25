package app.chalo.core.database.mappers;

import app.chalo.core.GetAllGroupsForUserAndCities;
import app.chalo.core.GetGroupInfoByID;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketChildEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import defpackage.z40;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/database/mappers/MultiModalGroupTicketEntityMapper;", "", "GroupTicketQueryRow", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketEntityMapper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/MultiModalGroupTicketEntityMapper$GroupTicketQueryRow;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GroupTicketQueryRow {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2092a;
        public final String b;
        public final String c;
        public final String d;
        public final long e;
        public final long f;
        public final MultiModalGroupTicketStatus g;
        public final String h;
        public final String i;
        public final String j;
        public final long k;
        public final MultiModalGroupTicketStopDetails l;
        public final MultiModalGroupTicketStopDetails m;
        public final List n;
        public final RefundInfoEntityModel o;
        public final List p;
        public final List q;
        public final long r;
        public final Long s;
        public final String t;
        public final String u;
        public final String v;

        public GroupTicketQueryRow(String str, String str2, String str3, String str4, long j, long j2, MultiModalGroupTicketStatus status, String str5, String str6, String str7, long j3, MultiModalGroupTicketStopDetails fromStopDetails, MultiModalGroupTicketStopDetails toStopDetails, List passengerDetails, RefundInfoEntityModel refundInfoEntityModel, List sequenceInfo, List fareDetails, long j4, Long l, String str8, String str9, String str10) {
            Intrinsics.i(status, "status");
            Intrinsics.i(fromStopDetails, "fromStopDetails");
            Intrinsics.i(toStopDetails, "toStopDetails");
            Intrinsics.i(passengerDetails, "passengerDetails");
            Intrinsics.i(sequenceInfo, "sequenceInfo");
            Intrinsics.i(fareDetails, "fareDetails");
            this.f2092a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = j;
            this.f = j2;
            this.g = status;
            this.h = str5;
            this.i = str6;
            this.j = str7;
            this.k = j3;
            this.l = fromStopDetails;
            this.m = toStopDetails;
            this.n = passengerDetails;
            this.o = refundInfoEntityModel;
            this.p = sequenceInfo;
            this.q = fareDetails;
            this.r = j4;
            this.s = l;
            this.t = str8;
            this.u = str9;
            this.v = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupTicketQueryRow)) {
                return false;
            }
            GroupTicketQueryRow groupTicketQueryRow = (GroupTicketQueryRow) obj;
            return Intrinsics.d(this.f2092a, groupTicketQueryRow.f2092a) && Intrinsics.d(this.b, groupTicketQueryRow.b) && Intrinsics.d(this.c, groupTicketQueryRow.c) && Intrinsics.d(this.d, groupTicketQueryRow.d) && this.e == groupTicketQueryRow.e && this.f == groupTicketQueryRow.f && this.g == groupTicketQueryRow.g && Intrinsics.d(this.h, groupTicketQueryRow.h) && Intrinsics.d(this.i, groupTicketQueryRow.i) && Intrinsics.d(this.j, groupTicketQueryRow.j) && this.k == groupTicketQueryRow.k && Intrinsics.d(this.l, groupTicketQueryRow.l) && Intrinsics.d(this.m, groupTicketQueryRow.m) && Intrinsics.d(this.n, groupTicketQueryRow.n) && Intrinsics.d(this.o, groupTicketQueryRow.o) && Intrinsics.d(this.p, groupTicketQueryRow.p) && Intrinsics.d(this.q, groupTicketQueryRow.q) && this.r == groupTicketQueryRow.r && Intrinsics.d(this.s, groupTicketQueryRow.s) && Intrinsics.d(this.t, groupTicketQueryRow.t) && Intrinsics.d(this.u, groupTicketQueryRow.u) && Intrinsics.d(this.v, groupTicketQueryRow.v);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(this.f2092a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            long j = this.e;
            int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            int iE2 = nf1.e(nf1.e(nf1.e((this.g.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
            long j3 = this.k;
            int iB = r30.b((this.m.hashCode() + ((this.l.hashCode() + ((iE2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31, 31, this.n);
            RefundInfoEntityModel refundInfoEntityModel = this.o;
            int iB2 = r30.b(r30.b((iB + (refundInfoEntityModel == null ? 0 : refundInfoEntityModel.hashCode())) * 31, 31, this.p), 31, this.q);
            long j4 = this.r;
            int i2 = (iB2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
            Long l = this.s;
            int iHashCode = (i2 + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.t;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.u;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.v;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("GroupTicketQueryRow(groupId=", this.f2092a, ", productName=", this.b, ", productType=");
            cb0.t(sbE, this.c, ", productSubType=", this.d, ", bookingTime=");
            sbE.append(this.e);
            xs.r(this.f, ", amount=", ", status=", sbE);
            sbE.append(this.g);
            sbE.append(", userId=");
            sbE.append(this.h);
            sbE.append(", city=");
            cb0.t(sbE, this.i, ", configurationId=", this.j, ", expiryTime=");
            sbE.append(this.k);
            sbE.append(", fromStopDetails=");
            sbE.append(this.l);
            sbE.append(", toStopDetails=");
            sbE.append(this.m);
            sbE.append(", passengerDetails=");
            sbE.append(this.n);
            sbE.append(", refundInfo=");
            sbE.append(this.o);
            sbE.append(", sequenceInfo=");
            sbE.append(this.p);
            sbE.append(", fareDetails=");
            sbE.append(this.q);
            sbE.append(", expectedChildCount=");
            sbE.append(this.r);
            sbE.append(", childSequence=");
            sbE.append(this.s);
            cb0.t(sbE, ", childSubTicketId=", this.t, ", childProductType=", this.u);
            return z40.h(sbE, ", childProductSubType=", this.v, ")");
        }
    }

    public static ArrayList a(List rows) {
        Intrinsics.i(rows, "rows");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : rows) {
            String str = ((GetAllGroupsForUserAndCities) obj).f1955a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            List<GetAllGroupsForUserAndCities> list = (List) it.next();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list, 10));
            for (GetAllGroupsForUserAndCities getAllGroupsForUserAndCities : list) {
                arrayList3.add(new GroupTicketQueryRow(getAllGroupsForUserAndCities.f1955a, getAllGroupsForUserAndCities.b, getAllGroupsForUserAndCities.c, getAllGroupsForUserAndCities.d, getAllGroupsForUserAndCities.e, getAllGroupsForUserAndCities.f, getAllGroupsForUserAndCities.g, getAllGroupsForUserAndCities.h, getAllGroupsForUserAndCities.i, getAllGroupsForUserAndCities.j, getAllGroupsForUserAndCities.k, getAllGroupsForUserAndCities.l, getAllGroupsForUserAndCities.m, getAllGroupsForUserAndCities.n, getAllGroupsForUserAndCities.o, getAllGroupsForUserAndCities.p, getAllGroupsForUserAndCities.q, getAllGroupsForUserAndCities.r, getAllGroupsForUserAndCities.s, getAllGroupsForUserAndCities.t, getAllGroupsForUserAndCities.u, getAllGroupsForUserAndCities.v));
                it = it;
            }
            Iterator it2 = it;
            MultiModalGroupTicketEntity multiModalGroupTicketEntityC = c(arrayList3);
            if (multiModalGroupTicketEntityC != null) {
                arrayList2.add(multiModalGroupTicketEntityC);
            }
            it = it2;
        }
        return arrayList2;
    }

    public static MultiModalGroupTicketEntity b(List list) {
        List rows = list;
        Intrinsics.i(rows, "rows");
        if (rows.isEmpty()) {
            rows = null;
        }
        if (rows == null) {
            return null;
        }
        List list2 = rows;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            GetGroupInfoByID getGroupInfoByID = (GetGroupInfoByID) it.next();
            arrayList.add(new GroupTicketQueryRow(getGroupInfoByID.f1957a, getGroupInfoByID.b, getGroupInfoByID.c, getGroupInfoByID.d, getGroupInfoByID.e, getGroupInfoByID.f, getGroupInfoByID.g, getGroupInfoByID.h, getGroupInfoByID.i, getGroupInfoByID.j, getGroupInfoByID.k, getGroupInfoByID.l, getGroupInfoByID.m, getGroupInfoByID.n, getGroupInfoByID.o, getGroupInfoByID.p, getGroupInfoByID.q, getGroupInfoByID.r, getGroupInfoByID.s, getGroupInfoByID.t, getGroupInfoByID.u, getGroupInfoByID.v));
        }
        return c(arrayList);
    }

    public static MultiModalGroupTicketEntity c(ArrayList arrayList) {
        Object next;
        MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity;
        ArrayList arrayList2 = arrayList;
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Long l = ((GroupTicketQueryRow) next).s;
                long jLongValue = l != null ? l.longValue() : 0L;
                while (true) {
                    Object next2 = it.next();
                    Long l2 = ((GroupTicketQueryRow) next2).s;
                    long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                    if (jLongValue > jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    arrayList2 = arrayList;
                }
            }
        } else {
            next = null;
        }
        GroupTicketQueryRow groupTicketQueryRow = (GroupTicketQueryRow) next;
        if (groupTicketQueryRow == null) {
            return null;
        }
        String str = groupTicketQueryRow.j;
        String str2 = groupTicketQueryRow.i;
        String str3 = groupTicketQueryRow.h;
        String str4 = groupTicketQueryRow.d;
        String str5 = groupTicketQueryRow.c;
        String str6 = groupTicketQueryRow.b;
        String str7 = groupTicketQueryRow.f2092a;
        long j = groupTicketQueryRow.r;
        List list = groupTicketQueryRow.q;
        List list2 = groupTicketQueryRow.p;
        if (arrayList2.isEmpty()) {
            multiModalGroupTicketChildEntity = null;
        } else {
            int size = arrayList2.size();
            int i = 0;
            multiModalGroupTicketChildEntity = null;
            while (i < size) {
                Object obj = arrayList2.get(i);
                int i2 = i + 1;
                GroupTicketQueryRow groupTicketQueryRow2 = (GroupTicketQueryRow) obj;
                if (!groupTicketQueryRow2.f2092a.equals(str7) || !groupTicketQueryRow2.b.equals(str6) || !groupTicketQueryRow2.c.equals(str5) || !groupTicketQueryRow2.d.equals(str4)) {
                    return null;
                }
                List list3 = list;
                if (groupTicketQueryRow2.e != groupTicketQueryRow.e || groupTicketQueryRow2.f != groupTicketQueryRow.f || groupTicketQueryRow2.g != groupTicketQueryRow.g || !groupTicketQueryRow2.h.equals(str3) || !groupTicketQueryRow2.i.equals(str2) || !groupTicketQueryRow2.j.equals(str) || groupTicketQueryRow2.k != groupTicketQueryRow.k || !Intrinsics.d(groupTicketQueryRow2.l, groupTicketQueryRow.l) || !Intrinsics.d(groupTicketQueryRow2.m, groupTicketQueryRow.m) || !Intrinsics.d(groupTicketQueryRow2.n, groupTicketQueryRow.n) || !Intrinsics.d(groupTicketQueryRow2.o, groupTicketQueryRow.o)) {
                    return null;
                }
                String str8 = str;
                if (!Intrinsics.d(CollectionsKt.v0(new MultiModalGroupTicketEntityMapper$toEntity$lambda$1$$inlined$sortedBy$1(), groupTicketQueryRow2.p), CollectionsKt.v0(new MultiModalGroupTicketEntityMapper$toEntity$lambda$1$$inlined$sortedBy$2(), list2))) {
                    return null;
                }
                if (!Intrinsics.d(CollectionsKt.v0(new MultiModalGroupTicketEntityMapper$toEntity$lambda$1$$inlined$sortedBy$3(), groupTicketQueryRow2.q), CollectionsKt.v0(new MultiModalGroupTicketEntityMapper$toEntity$lambda$1$$inlined$sortedBy$4(), list3)) || groupTicketQueryRow2.r != j) {
                    return null;
                }
                i = i2;
                list = list3;
                str = str8;
            }
        }
        String str9 = str;
        List list4 = list;
        long j2 = groupTicketQueryRow.e;
        long j3 = groupTicketQueryRow.f;
        MultiModalGroupTicketStatus multiModalGroupTicketStatus = groupTicketQueryRow.g;
        long j4 = groupTicketQueryRow.k;
        MultiModalGroupTicketStopDetails multiModalGroupTicketStopDetails = groupTicketQueryRow.l;
        MultiModalGroupTicketStopDetails multiModalGroupTicketStopDetails2 = groupTicketQueryRow.m;
        List list5 = groupTicketQueryRow.n;
        RefundInfoEntityModel refundInfoEntityModel = groupTicketQueryRow.o;
        List listV0 = CollectionsKt.v0(new MultiModalGroupTicketEntityMapper$toEntity$$inlined$sortedBy$1(), list2);
        List listV1 = CollectionsKt.v0(new MultiModalGroupTicketEntityMapper$toEntity$$inlined$sortedBy$2(), list4);
        int i3 = (int) j;
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            int i5 = i4 + 1;
            GroupTicketQueryRow groupTicketQueryRow3 = (GroupTicketQueryRow) obj2;
            Long l3 = groupTicketQueryRow3.s;
            MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity2 = (l3 == null || groupTicketQueryRow3.t == null || groupTicketQueryRow3.u == null || groupTicketQueryRow3.v == null) ? multiModalGroupTicketChildEntity : new MultiModalGroupTicketChildEntity(groupTicketQueryRow3.f2092a, (int) l3.longValue(), groupTicketQueryRow3.t, groupTicketQueryRow3.u, groupTicketQueryRow3.v);
            if (multiModalGroupTicketChildEntity2 != null) {
                arrayList3.add(multiModalGroupTicketChildEntity2);
            }
            arrayList2 = arrayList;
            i4 = i5;
            i3 = i3;
        }
        return new MultiModalGroupTicketEntity(str7, str6, str5, str4, j2, j3, multiModalGroupTicketStatus, str3, str2, str9, j4, multiModalGroupTicketStopDetails, multiModalGroupTicketStopDetails2, list5, refundInfoEntityModel, listV0, listV1, i3, CollectionsKt.v0(new MultiModalGroupTicketEntityMapper$toEntity$$inlined$sortedBy$3(), arrayList3));
    }
}
