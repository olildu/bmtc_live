package app.chalo.premiumbus.data.models.app;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumReserveTicketAckAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketAckAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7112a;
    public final String b;
    public final String c;
    public final String d;
    public final PremiumReserveTicketAckType e;
    public final boolean f;
    public final String g;

    public PremiumReserveTicketAckAppModel(String bookingId, String productType, String productSubType, String userId, PremiumReserveTicketAckType ackNeededFor, boolean z, String str) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(ackNeededFor, "ackNeededFor");
        this.f7112a = bookingId;
        this.b = productType;
        this.c = productSubType;
        this.d = userId;
        this.e = ackNeededFor;
        this.f = z;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketAckAppModel)) {
            return false;
        }
        PremiumReserveTicketAckAppModel premiumReserveTicketAckAppModel = (PremiumReserveTicketAckAppModel) obj;
        return Intrinsics.d(this.f7112a, premiumReserveTicketAckAppModel.f7112a) && Intrinsics.d(this.b, premiumReserveTicketAckAppModel.b) && Intrinsics.d(this.c, premiumReserveTicketAckAppModel.c) && Intrinsics.d(this.d, premiumReserveTicketAckAppModel.d) && this.e == premiumReserveTicketAckAppModel.e && this.f == premiumReserveTicketAckAppModel.f && Intrinsics.d(this.g, premiumReserveTicketAckAppModel.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f7112a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31) + (this.f ? 1231 : 1237)) * 31;
        String str = this.g;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumReserveTicketAckAppModel(bookingId=", this.f7112a, ", productType=", this.b, ", productSubType=");
        cb0.t(sbE, this.c, ", userId=", this.d, ", ackNeededFor=");
        sbE.append(this.e);
        sbE.append(", hasAcknowledged=");
        sbE.append(this.f);
        sbE.append(", firstBookingId=");
        return vo1.p(sbE, this.g, ")");
    }
}
