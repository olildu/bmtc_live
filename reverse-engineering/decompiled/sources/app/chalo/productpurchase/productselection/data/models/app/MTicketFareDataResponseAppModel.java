package app.chalo.productpurchase.productselection.data.models.app;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/MTicketFareDataResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketFareDataResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f8632a;
    public final int b;
    public final List c;

    public MTicketFareDataResponseAppModel(double d, int i, List passengerDetails) {
        Intrinsics.i(passengerDetails, "passengerDetails");
        this.f8632a = d;
        this.b = i;
        this.c = passengerDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketFareDataResponseAppModel)) {
            return false;
        }
        MTicketFareDataResponseAppModel mTicketFareDataResponseAppModel = (MTicketFareDataResponseAppModel) obj;
        return Double.compare(this.f8632a, mTicketFareDataResponseAppModel.f8632a) == 0 && this.b == mTicketFareDataResponseAppModel.b && Intrinsics.d(this.c, mTicketFareDataResponseAppModel.c);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f8632a);
        return this.c.hashCode() + (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + this.b) * 31);
    }

    public final String toString() {
        return "MTicketFareDataResponseAppModel(discountPercentage=" + this.f8632a + ", roundingLogic=" + this.b + ", passengerDetails=" + this.c + ")";
    }
}
