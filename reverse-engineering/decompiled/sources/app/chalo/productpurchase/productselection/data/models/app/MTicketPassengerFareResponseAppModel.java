package app.chalo.productpurchase.productselection.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/MTicketPassengerFareResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerFareResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8636a;
    public final double b;
    public final Double c;
    public final double d;
    public final MTicketPassengerFareBreakdownResponseAppModel e;

    public MTicketPassengerFareResponseAppModel(String str, double d, Double d2, double d3, MTicketPassengerFareBreakdownResponseAppModel mTicketPassengerFareBreakdownResponseAppModel) {
        this.f8636a = str;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = mTicketPassengerFareBreakdownResponseAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerFareResponseAppModel)) {
            return false;
        }
        MTicketPassengerFareResponseAppModel mTicketPassengerFareResponseAppModel = (MTicketPassengerFareResponseAppModel) obj;
        return Intrinsics.d(this.f8636a, mTicketPassengerFareResponseAppModel.f8636a) && Double.compare(this.b, mTicketPassengerFareResponseAppModel.b) == 0 && Intrinsics.d(this.c, mTicketPassengerFareResponseAppModel.c) && Double.compare(this.d, mTicketPassengerFareResponseAppModel.d) == 0 && Intrinsics.d(this.e, mTicketPassengerFareResponseAppModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8636a.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        Double d = this.c;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.d);
        int i2 = (((i + iHashCode2) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31;
        MTicketPassengerFareBreakdownResponseAppModel mTicketPassengerFareBreakdownResponseAppModel = this.e;
        return i2 + (mTicketPassengerFareBreakdownResponseAppModel != null ? mTicketPassengerFareBreakdownResponseAppModel.hashCode() : 0);
    }

    public final String toString() {
        return "MTicketPassengerFareResponseAppModel(passengerType=" + this.f8636a + ", fare=" + this.b + ", totalFare=" + this.c + ", discountPercentage=" + this.d + ", fareBreakdown=" + this.e + ")";
    }
}
