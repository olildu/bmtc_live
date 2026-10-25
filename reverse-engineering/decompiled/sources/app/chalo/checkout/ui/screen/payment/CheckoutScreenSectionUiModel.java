package app.chalo.checkout.ui.screen.payment;

import app.chalo.providers.stringprovider.StringEnum;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel;", "", "PreferredModes", "ChaloPay", "UPIApps", "OneClickUPI", "OtherPaymentModes", "NativeUPIApps", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$ChaloPay;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$NativeUPIApps;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$OneClickUPI;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$OtherPaymentModes;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$PreferredModes;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$UPIApps;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutScreenSectionUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringEnum f1512a;
    public final String b;
    public final List c;
    public final CheckoutCtaDetail d;
    public final boolean e;
    public final CheckoutCtaDetail f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$ChaloPay;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloPay extends CheckoutScreenSectionUiModel {
        public final StringEnum g;
        public final String h;
        public final List i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChaloPay(StringEnum title, String str, List list) {
            super(title, str, list, null, 56);
            Intrinsics.i(title, "title");
            this.g = title;
            this.h = str;
            this.i = list;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getC() {
            return this.i;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final StringEnum getF1512a() {
            return this.g;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getB() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloPay)) {
                return false;
            }
            ChaloPay chaloPay = (ChaloPay) obj;
            return this.g == chaloPay.g && Intrinsics.d(this.h, chaloPay.h) && Intrinsics.d(this.i, chaloPay.i);
        }

        public final int hashCode() {
            int iHashCode = this.g.hashCode() * 31;
            String str = this.h;
            return this.i.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChaloPay(title=");
            sb.append(this.g);
            sb.append(", warningMsg=");
            sb.append(this.h);
            sb.append(", checkoutItems=");
            return xs.l(sb, this.i, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$NativeUPIApps;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NativeUPIApps extends CheckoutScreenSectionUiModel {
        public final StringEnum g;
        public final List h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeUPIApps(StringEnum title, List checkoutItems) {
            super(title, null, checkoutItems, null, 48);
            Intrinsics.i(title, "title");
            Intrinsics.i(checkoutItems, "checkoutItems");
            this.g = title;
            this.h = checkoutItems;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getC() {
            return this.h;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: b */
        public final CheckoutCtaDetail getD() {
            return null;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final StringEnum getF1512a() {
            return this.g;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: e */
        public final String getB() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NativeUPIApps)) {
                return false;
            }
            NativeUPIApps nativeUPIApps = (NativeUPIApps) obj;
            return this.g == nativeUPIApps.g && Intrinsics.d(this.h, nativeUPIApps.h);
        }

        public final int hashCode() {
            return r30.b(this.g.hashCode() * 961, 31, this.h);
        }

        public final String toString() {
            return "NativeUPIApps(title=" + this.g + ", warningMsg=null, checkoutItems=" + this.h + ", ctaDetail=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$OneClickUPI;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OneClickUPI extends CheckoutScreenSectionUiModel {
        public final StringEnum g;
        public final String h;
        public final List i;
        public final CheckoutCtaDetail j;
        public final boolean k;
        public final CheckoutCtaDetail l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneClickUPI(StringEnum title, String str, List checkoutItemList, CheckoutCtaDetail checkoutCtaDetail, boolean z, CheckoutCtaDetail checkoutCtaDetail2) {
            super(title, str, checkoutItemList, checkoutCtaDetail, z, checkoutCtaDetail2);
            Intrinsics.i(title, "title");
            Intrinsics.i(checkoutItemList, "checkoutItemList");
            this.g = title;
            this.h = str;
            this.i = checkoutItemList;
            this.j = checkoutCtaDetail;
            this.k = z;
            this.l = checkoutCtaDetail2;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final CheckoutCtaDetail getD() {
            return this.j;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final CheckoutCtaDetail getF() {
            return this.l;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final StringEnum getF1512a() {
            return this.g;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getB() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OneClickUPI)) {
                return false;
            }
            OneClickUPI oneClickUPI = (OneClickUPI) obj;
            return this.g == oneClickUPI.g && Intrinsics.d(this.h, oneClickUPI.h) && Intrinsics.d(this.i, oneClickUPI.i) && Intrinsics.d(this.j, oneClickUPI.j) && this.k == oneClickUPI.k && Intrinsics.d(this.l, oneClickUPI.l);
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getE() {
            return this.k;
        }

        public final int hashCode() {
            int iHashCode = this.g.hashCode() * 31;
            String str = this.h;
            int iB = r30.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
            CheckoutCtaDetail checkoutCtaDetail = this.j;
            int iHashCode2 = (((iB + (checkoutCtaDetail == null ? 0 : checkoutCtaDetail.hashCode())) * 31) + (this.k ? 1231 : 1237)) * 31;
            CheckoutCtaDetail checkoutCtaDetail2 = this.l;
            return iHashCode2 + (checkoutCtaDetail2 != null ? checkoutCtaDetail2.hashCode() : 0);
        }

        public final String toString() {
            return "OneClickUPI(title=" + this.g + ", warningMsg=" + this.h + ", checkoutItemList=" + this.i + ", ctaDetail=" + this.j + ", isSectionLoading=" + this.k + ", sectionHeaderCtaDetails=" + this.l + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$OtherPaymentModes;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OtherPaymentModes extends CheckoutScreenSectionUiModel {
        public final StringEnum g;
        public final List h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherPaymentModes(StringEnum title, List checkoutItems) {
            super(title, null, checkoutItems, null, 56);
            Intrinsics.i(title, "title");
            Intrinsics.i(checkoutItems, "checkoutItems");
            this.g = title;
            this.h = checkoutItems;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getC() {
            return this.h;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final StringEnum getF1512a() {
            return this.g;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: e */
        public final String getB() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtherPaymentModes)) {
                return false;
            }
            OtherPaymentModes otherPaymentModes = (OtherPaymentModes) obj;
            return this.g == otherPaymentModes.g && Intrinsics.d(this.h, otherPaymentModes.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + (this.g.hashCode() * 961);
        }

        public final String toString() {
            return "OtherPaymentModes(title=" + this.g + ", warningMsg=null, checkoutItems=" + this.h + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$PreferredModes;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PreferredModes extends CheckoutScreenSectionUiModel {
        public final StringEnum g;
        public final List h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreferredModes(StringEnum title, List checkoutItems) {
            super(title, null, checkoutItems, null, 56);
            Intrinsics.i(title, "title");
            Intrinsics.i(checkoutItems, "checkoutItems");
            this.g = title;
            this.h = checkoutItems;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getC() {
            return this.h;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final StringEnum getF1512a() {
            return this.g;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: e */
        public final String getB() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreferredModes)) {
                return false;
            }
            PreferredModes preferredModes = (PreferredModes) obj;
            return this.g == preferredModes.g && Intrinsics.d(this.h, preferredModes.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + (this.g.hashCode() * 961);
        }

        public final String toString() {
            return "PreferredModes(title=" + this.g + ", warningMsg=null, checkoutItems=" + this.h + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel$UPIApps;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutScreenSectionUiModel;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UPIApps extends CheckoutScreenSectionUiModel {
        public final StringEnum g;
        public final String h;
        public final List i;
        public final CheckoutCtaDetail j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UPIApps(StringEnum title, String str, List checkoutItems, CheckoutCtaDetail checkoutCtaDetail) {
            super(title, str, checkoutItems, checkoutCtaDetail, 48);
            Intrinsics.i(title, "title");
            Intrinsics.i(checkoutItems, "checkoutItems");
            this.g = title;
            this.h = str;
            this.i = checkoutItems;
            this.j = checkoutCtaDetail;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getC() {
            return this.i;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final CheckoutCtaDetail getD() {
            return this.j;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final StringEnum getF1512a() {
            return this.g;
        }

        @Override // app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getB() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UPIApps)) {
                return false;
            }
            UPIApps uPIApps = (UPIApps) obj;
            return this.g == uPIApps.g && Intrinsics.d(this.h, uPIApps.h) && Intrinsics.d(this.i, uPIApps.i) && Intrinsics.d(this.j, uPIApps.j);
        }

        public final int hashCode() {
            int iHashCode = this.g.hashCode() * 31;
            String str = this.h;
            int iB = r30.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
            CheckoutCtaDetail checkoutCtaDetail = this.j;
            return iB + (checkoutCtaDetail != null ? checkoutCtaDetail.hashCode() : 0);
        }

        public final String toString() {
            return "UPIApps(title=" + this.g + ", warningMsg=" + this.h + ", checkoutItems=" + this.i + ", ctaDetail=" + this.j + ")";
        }
    }

    public CheckoutScreenSectionUiModel(StringEnum stringEnum, String str, List list, CheckoutCtaDetail checkoutCtaDetail, boolean z, CheckoutCtaDetail checkoutCtaDetail2) {
        this.f1512a = stringEnum;
        this.b = str;
        this.c = list;
        this.d = checkoutCtaDetail;
        this.e = z;
        this.f = checkoutCtaDetail2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public List getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public CheckoutCtaDetail getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public CheckoutCtaDetail getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public StringEnum getF1512a() {
        return this.f1512a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getE() {
        return this.e;
    }

    public /* synthetic */ CheckoutScreenSectionUiModel(StringEnum stringEnum, String str, List list, CheckoutCtaDetail checkoutCtaDetail, int i) {
        this(stringEnum, str, list, (i & 8) != 0 ? null : checkoutCtaDetail, false, null);
    }
}
