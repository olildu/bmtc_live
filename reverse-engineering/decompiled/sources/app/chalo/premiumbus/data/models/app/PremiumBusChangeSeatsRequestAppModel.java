package app.chalo.premiumbus.data.models.app;

import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusChangeSeatsRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusChangeSeatsRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7101a;
    public final List b;

    public PremiumBusChangeSeatsRequestAppModel(String bookingId, List seats) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(seats, "seats");
        this.f7101a = bookingId;
        this.b = seats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusChangeSeatsRequestAppModel)) {
            return false;
        }
        PremiumBusChangeSeatsRequestAppModel premiumBusChangeSeatsRequestAppModel = (PremiumBusChangeSeatsRequestAppModel) obj;
        return Intrinsics.d(this.f7101a, premiumBusChangeSeatsRequestAppModel.f7101a) && Intrinsics.d(this.b, premiumBusChangeSeatsRequestAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7101a.hashCode() * 31);
    }

    public final String toString() {
        return nf1.m("PremiumBusChangeSeatsRequestAppModel(bookingId=", this.f7101a, ", seats=", ")", this.b);
    }
}
