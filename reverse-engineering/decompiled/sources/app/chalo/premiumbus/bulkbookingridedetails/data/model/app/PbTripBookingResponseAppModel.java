package app.chalo.premiumbus.bulkbookingridedetails.data.model.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/app/PbTripBookingResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbTripBookingResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassResponseAppModel f6890a;
    public final List b;

    public PbTripBookingResponseAppModel(SuperPassResponseAppModel superPassResponseAppModel, List list) {
        this.f6890a = superPassResponseAppModel;
        this.b = list;
    }

    public static PbTripBookingResponseAppModel a(PbTripBookingResponseAppModel pbTripBookingResponseAppModel, ArrayList arrayList) {
        return new PbTripBookingResponseAppModel(pbTripBookingResponseAppModel.f6890a, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbTripBookingResponseAppModel)) {
            return false;
        }
        PbTripBookingResponseAppModel pbTripBookingResponseAppModel = (PbTripBookingResponseAppModel) obj;
        return Intrinsics.d(this.f6890a, pbTripBookingResponseAppModel.f6890a) && Intrinsics.d(this.b, pbTripBookingResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6890a.hashCode() * 31);
    }

    public final String toString() {
        return "PbTripBookingResponseAppModel(superPassResponseAppModel=" + this.f6890a + ", linkedBookings=" + this.b + ")";
    }
}
