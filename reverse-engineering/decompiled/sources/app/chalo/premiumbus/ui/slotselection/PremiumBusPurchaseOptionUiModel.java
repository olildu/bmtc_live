package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionType;
import defpackage.cb0;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel;", "", "SuperPassOption", "DefaultOption", "CustomerSupportOption", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel$CustomerSupportOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel$DefaultOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel$SuperPassOption;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusPurchaseOptionUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusBookingAvailableOptionType f7851a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel$CustomerSupportOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomerSupportOption extends PremiumBusPurchaseOptionUiModel {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerSupportOption(String customerSupportNumber) {
            super(PremiumBusBookingAvailableOptionType.CUSTOMER_SUPPORT);
            Intrinsics.i(customerSupportNumber, "customerSupportNumber");
            this.b = customerSupportNumber;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomerSupportOption) && Intrinsics.d(this.b, ((CustomerSupportOption) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("CustomerSupportOption(customerSupportNumber=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel$DefaultOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultOption extends PremiumBusPurchaseOptionUiModel {
        public static final DefaultOption b = new DefaultOption(PremiumBusBookingAvailableOptionType.OTHERS);
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel$SuperPassOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUiModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuperPassOption extends PremiumBusPurchaseOptionUiModel {
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final int i;
        public final String j;
        public final PassTierType k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuperPassOption(String productName, boolean z, String bookingId, String productType, String productSubType, String expiryDate, String maxPricePerTrip, int i, String str, PassTierType passTierType) {
            super(PremiumBusBookingAvailableOptionType.SUPER_PASS);
            Intrinsics.i(productName, "productName");
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(expiryDate, "expiryDate");
            Intrinsics.i(maxPricePerTrip, "maxPricePerTrip");
            Intrinsics.i(passTierType, "passTierType");
            this.b = productName;
            this.c = z;
            this.d = bookingId;
            this.e = productType;
            this.f = productSubType;
            this.g = expiryDate;
            this.h = maxPricePerTrip;
            this.i = i;
            this.j = str;
            this.k = passTierType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperPassOption)) {
                return false;
            }
            SuperPassOption superPassOption = (SuperPassOption) obj;
            return Intrinsics.d(this.b, superPassOption.b) && this.c == superPassOption.c && Intrinsics.d(this.d, superPassOption.d) && Intrinsics.d(this.e, superPassOption.e) && Intrinsics.d(this.f, superPassOption.f) && Intrinsics.d(this.g, superPassOption.g) && Intrinsics.d(this.h, superPassOption.h) && this.i == superPassOption.i && Intrinsics.d(this.j, superPassOption.j) && this.k == superPassOption.k;
        }

        public final int hashCode() {
            int iE = (nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(((this.b.hashCode() * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h) + this.i) * 31;
            String str = this.j;
            return this.k.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbM = hq0.m("SuperPassOption(productName=", this.b, ", isProductSupported=", ", bookingId=", this.c);
            cb0.t(sbM, this.d, ", productType=", this.e, ", productSubType=");
            cb0.t(sbM, this.f, ", expiryDate=", this.g, ", maxPricePerTrip=");
            cb0.o(this.i, this.h, ", remainingTrips=", ", additionalInfo=", sbM);
            sbM.append(this.j);
            sbM.append(", passTierType=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }
    }

    public PremiumBusPurchaseOptionUiModel(PremiumBusBookingAvailableOptionType premiumBusBookingAvailableOptionType) {
        this.f7851a = premiumBusBookingAvailableOptionType;
    }
}
