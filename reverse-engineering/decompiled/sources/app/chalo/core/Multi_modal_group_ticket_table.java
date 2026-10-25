package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.uf0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Multi_modal_group_ticket_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1970a;
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f1971a;
        public final MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1 b;
        public final MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2 c;
        public final MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3 d;
        public final ColumnAdapter e;
        public final MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4 f;
        public final MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5 g;

        public Adapter(EnumColumnAdapter enumColumnAdapter, MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1, MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2, MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3, ColumnAdapter refundInfoAdapter, MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4, MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5) {
            Intrinsics.i(refundInfoAdapter, "refundInfoAdapter");
            this.f1971a = enumColumnAdapter;
            this.b = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1;
            this.c = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2;
            this.d = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3;
            this.e = refundInfoAdapter;
            this.f = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4;
            this.g = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5;
        }
    }

    public Multi_modal_group_ticket_table(String groupId, String productName, String productType, String productSubType, long j, long j2, MultiModalGroupTicketStatus status, String userId, String str, String configurationId, long j3, MultiModalGroupTicketStopDetails fromStopDetails, MultiModalGroupTicketStopDetails toStopDetails, List passengerDetails, RefundInfoEntityModel refundInfoEntityModel, List sequenceInfo, List fareDetails, long j4) {
        Intrinsics.i(groupId, "groupId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(status, "status");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(configurationId, "configurationId");
        Intrinsics.i(fromStopDetails, "fromStopDetails");
        Intrinsics.i(toStopDetails, "toStopDetails");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(sequenceInfo, "sequenceInfo");
        Intrinsics.i(fareDetails, "fareDetails");
        this.f1970a = groupId;
        this.b = productName;
        this.c = productType;
        this.d = productSubType;
        this.e = j;
        this.f = j2;
        this.g = status;
        this.h = userId;
        this.i = str;
        this.j = configurationId;
        this.k = j3;
        this.l = fromStopDetails;
        this.m = toStopDetails;
        this.n = passengerDetails;
        this.o = refundInfoEntityModel;
        this.p = sequenceInfo;
        this.q = fareDetails;
        this.r = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Multi_modal_group_ticket_table)) {
            return false;
        }
        Multi_modal_group_ticket_table multi_modal_group_ticket_table = (Multi_modal_group_ticket_table) obj;
        return Intrinsics.d(this.f1970a, multi_modal_group_ticket_table.f1970a) && Intrinsics.d(this.b, multi_modal_group_ticket_table.b) && Intrinsics.d(this.c, multi_modal_group_ticket_table.c) && Intrinsics.d(this.d, multi_modal_group_ticket_table.d) && this.e == multi_modal_group_ticket_table.e && this.f == multi_modal_group_ticket_table.f && this.g == multi_modal_group_ticket_table.g && Intrinsics.d(this.h, multi_modal_group_ticket_table.h) && Intrinsics.d(this.i, multi_modal_group_ticket_table.i) && Intrinsics.d(this.j, multi_modal_group_ticket_table.j) && this.k == multi_modal_group_ticket_table.k && Intrinsics.d(this.l, multi_modal_group_ticket_table.l) && Intrinsics.d(this.m, multi_modal_group_ticket_table.m) && Intrinsics.d(this.n, multi_modal_group_ticket_table.n) && Intrinsics.d(this.o, multi_modal_group_ticket_table.o) && Intrinsics.d(this.p, multi_modal_group_ticket_table.p) && Intrinsics.d(this.q, multi_modal_group_ticket_table.q) && this.r == multi_modal_group_ticket_table.r;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f1970a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int iE2 = nf1.e(nf1.e(nf1.e((this.g.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
        long j3 = this.k;
        int iB = r30.b((this.m.hashCode() + ((this.l.hashCode() + ((iE2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31, 31, this.n);
        RefundInfoEntityModel refundInfoEntityModel = this.o;
        int iB2 = r30.b(r30.b((iB + (refundInfoEntityModel == null ? 0 : refundInfoEntityModel.hashCode())) * 31, 31, this.p), 31, this.q);
        long j4 = this.r;
        return iB2 + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Multi_modal_group_ticket_table(groupId=", this.f1970a, ", productName=", this.b, ", productType=");
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
        return uf0.m(this.r, ")", sbE);
    }
}
