package app.chalo.premiumbus.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusBookingPurchaseOptionAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusBookingPurchaseOptionAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7098a;
    public final PremiumBusBookingAvailableOptionType b;
    public final PremiumBusBookingPurchaseOptionDetailsAppModel c;

    public PremiumBusBookingPurchaseOptionAppModel(int i, PremiumBusBookingAvailableOptionType premiumBusBookingAvailableOptionType, PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel) {
        this.f7098a = i;
        this.b = premiumBusBookingAvailableOptionType;
        this.c = premiumBusBookingPurchaseOptionDetailsAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBookingPurchaseOptionAppModel)) {
            return false;
        }
        PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel = (PremiumBusBookingPurchaseOptionAppModel) obj;
        return this.f7098a == premiumBusBookingPurchaseOptionAppModel.f7098a && this.b == premiumBusBookingPurchaseOptionAppModel.b && Intrinsics.d(this.c, premiumBusBookingPurchaseOptionAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f7098a * 31)) * 31;
        PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel = this.c;
        return iHashCode + (premiumBusBookingPurchaseOptionDetailsAppModel == null ? 0 : premiumBusBookingPurchaseOptionDetailsAppModel.hashCode());
    }

    public final String toString() {
        return "PremiumBusBookingPurchaseOptionAppModel(priority=" + this.f7098a + ", optionType=" + this.b + ", details=" + this.c + ")";
    }
}
