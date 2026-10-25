package app.chalo.premiumbus.data.models.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBReserveTicketThroughPassResponseAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBReserveTicketThroughPassResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7094a;
    public final String b;

    public PBReserveTicketThroughPassResponseAppModel(String bookingId, String status) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(status, "status");
        this.f7094a = bookingId;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBReserveTicketThroughPassResponseAppModel)) {
            return false;
        }
        PBReserveTicketThroughPassResponseAppModel pBReserveTicketThroughPassResponseAppModel = (PBReserveTicketThroughPassResponseAppModel) obj;
        return Intrinsics.d(this.f7094a, pBReserveTicketThroughPassResponseAppModel.f7094a) && Intrinsics.d(this.b, pBReserveTicketThroughPassResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7094a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("PBReserveTicketThroughPassResponseAppModel(bookingId=", this.f7094a, ", status=", this.b, ")");
    }
}
