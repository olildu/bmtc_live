package app.chalo.premiumbus.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusBookingPurchaseOptionDetailsAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusBookingPurchaseOptionDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7099a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final Integer g;
    public final boolean h;
    public final String i;
    public final PassTierType j;

    public PremiumBusBookingPurchaseOptionDetailsAppModel(String str, String str2, String str3, String str4, Long l, Long l2, Integer num, boolean z, String str5, PassTierType passTierType) {
        Intrinsics.i(passTierType, "passTierType");
        this.f7099a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = l2;
        this.g = num;
        this.h = z;
        this.i = str5;
        this.j = passTierType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBookingPurchaseOptionDetailsAppModel)) {
            return false;
        }
        PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel = (PremiumBusBookingPurchaseOptionDetailsAppModel) obj;
        return Intrinsics.d(this.f7099a, premiumBusBookingPurchaseOptionDetailsAppModel.f7099a) && Intrinsics.d(this.b, premiumBusBookingPurchaseOptionDetailsAppModel.b) && Intrinsics.d(this.c, premiumBusBookingPurchaseOptionDetailsAppModel.c) && Intrinsics.d(this.d, premiumBusBookingPurchaseOptionDetailsAppModel.d) && Intrinsics.d(this.e, premiumBusBookingPurchaseOptionDetailsAppModel.e) && Intrinsics.d(this.f, premiumBusBookingPurchaseOptionDetailsAppModel.f) && Intrinsics.d(this.g, premiumBusBookingPurchaseOptionDetailsAppModel.g) && this.h == premiumBusBookingPurchaseOptionDetailsAppModel.h && Intrinsics.d(this.i, premiumBusBookingPurchaseOptionDetailsAppModel.i) && this.j == premiumBusBookingPurchaseOptionDetailsAppModel.j;
    }

    public final int hashCode() {
        String str = this.f7099a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31;
        String str5 = this.i;
        return this.j.hashCode() + ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusBookingPurchaseOptionDetailsAppModel(productType=", this.f7099a, ", productSubType=", this.b, ", bookingId=");
        cb0.t(sbE, this.c, ", productName=", this.d, ", expiryTime=");
        nf1.w(sbE, this.e, ", maxPricePerTrip=", this.f, ", remainingTrips=");
        sbE.append(this.g);
        sbE.append(", isSupported=");
        sbE.append(this.h);
        sbE.append(", additionalInfo=");
        sbE.append(this.i);
        sbE.append(", passTierType=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }
}
