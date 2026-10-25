package app.chalo.checkout.data.model.ui;

import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.models.CheckoutPaymentProvider;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem;", "", "PaymentMethodItem", "IndividualCheckoutItem", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$PaymentMethodItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutPaymentItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentUiItem f1342a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem;", "UPIIntentPaymentItem", "WalletPaymentItem", "NetBankingPaymentItem", "ChaloPayItem", "ClosedLoopPayItem", "InAppUpiItem", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$ChaloPayItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$ClosedLoopPayItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$InAppUpiItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$NetBankingPaymentItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$UPIIntentPaymentItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$WalletPaymentItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class IndividualCheckoutItem extends CheckoutPaymentItem {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$ChaloPayItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChaloPayItem extends IndividualCheckoutItem {
            public final PaymentUiItem b;

            public ChaloPayItem(PaymentUiItem paymentUiItem) {
                super(paymentUiItem);
                this.b = paymentUiItem;
            }

            @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentUiItem getF1342a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChaloPayItem) && Intrinsics.d(this.b, ((ChaloPayItem) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ChaloPayItem(displayItem=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$ClosedLoopPayItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ClosedLoopPayItem extends IndividualCheckoutItem {
            public final PaymentUiItem b;

            public ClosedLoopPayItem(PaymentUiItem paymentUiItem) {
                super(paymentUiItem);
                this.b = paymentUiItem;
            }

            @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentUiItem getF1342a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClosedLoopPayItem) && Intrinsics.d(this.b, ((ClosedLoopPayItem) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ClosedLoopPayItem(displayItem=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$InAppUpiItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem;", "UserOnBoardingItem", "UpiAccountItem", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$InAppUpiItem$UpiAccountItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$InAppUpiItem$UserOnBoardingItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class InAppUpiItem extends IndividualCheckoutItem {

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$InAppUpiItem$UpiAccountItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$InAppUpiItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UpiAccountItem extends InAppUpiItem {
                public final PaymentUiItem b;
                public final String c;
                public final String d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UpiAccountItem(PaymentUiItem paymentUiItem, String upiId, String accountReferenceId) {
                    super(paymentUiItem);
                    Intrinsics.i(upiId, "upiId");
                    Intrinsics.i(accountReferenceId, "accountReferenceId");
                    this.b = paymentUiItem;
                    this.c = upiId;
                    this.d = accountReferenceId;
                }

                @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem
                /* JADX INFO: renamed from: a, reason: from getter */
                public final PaymentUiItem getF1342a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof UpiAccountItem)) {
                        return false;
                    }
                    UpiAccountItem upiAccountItem = (UpiAccountItem) obj;
                    return Intrinsics.d(this.b, upiAccountItem.b) && Intrinsics.d(this.c, upiAccountItem.c) && Intrinsics.d(this.d, upiAccountItem.d);
                }

                public final int hashCode() {
                    return this.d.hashCode() + nf1.e(this.b.hashCode() * 31, 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("UpiAccountItem(displayItem=");
                    sb.append(this.b);
                    sb.append(", upiId=");
                    sb.append(this.c);
                    sb.append(", accountReferenceId=");
                    return vo1.p(sb, this.d, ")");
                }
            }

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$InAppUpiItem$UserOnBoardingItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$InAppUpiItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UserOnBoardingItem extends InAppUpiItem {
                public final PaymentUiItem b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UserOnBoardingItem(PaymentUiItem displayItem) {
                    super(displayItem);
                    Intrinsics.i(displayItem, "displayItem");
                    this.b = displayItem;
                }

                @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem
                /* JADX INFO: renamed from: a, reason: from getter */
                public final PaymentUiItem getF1342a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserOnBoardingItem) && Intrinsics.d(this.b, ((UserOnBoardingItem) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "UserOnBoardingItem(displayItem=" + this.b + ")";
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$NetBankingPaymentItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NetBankingPaymentItem extends IndividualCheckoutItem {
            public final PaymentUiItem b;
            public final String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetBankingPaymentItem(PaymentUiItem displayItem, String bankCode) {
                super(displayItem);
                Intrinsics.i(displayItem, "displayItem");
                Intrinsics.i(bankCode, "bankCode");
                this.b = displayItem;
                this.c = bankCode;
            }

            @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentUiItem getF1342a() {
                return this.b;
            }

            @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem.IndividualCheckoutItem
            public final SelectedPaymentInstrumentData b() {
                return new SelectedPaymentInstrumentData.NetBankingData(this.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NetBankingPaymentItem)) {
                    return false;
                }
                NetBankingPaymentItem netBankingPaymentItem = (NetBankingPaymentItem) obj;
                return Intrinsics.d(this.b, netBankingPaymentItem.b) && Intrinsics.d(this.c, netBankingPaymentItem.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "NetBankingPaymentItem(displayItem=" + this.b + ", bankCode=" + this.c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$UPIIntentPaymentItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UPIIntentPaymentItem extends IndividualCheckoutItem {
            public final PaymentUiItem b;
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f1343a;

                static {
                    int[] iArr = new int[CheckoutPaymentProvider.values().length];
                    try {
                        iArr[CheckoutPaymentProvider.INAI.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CheckoutPaymentProvider.PHONEPE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CheckoutPaymentProvider.YES_BANK.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CheckoutPaymentProvider.CLDW.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    f1343a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UPIIntentPaymentItem(PaymentUiItem displayItem, String packageName) {
                super(displayItem);
                Intrinsics.i(displayItem, "displayItem");
                Intrinsics.i(packageName, "packageName");
                this.b = displayItem;
                this.c = packageName;
            }

            @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentUiItem getF1342a() {
                return this.b;
            }

            @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem.IndividualCheckoutItem
            public final SelectedPaymentInstrumentData b() {
                return new SelectedPaymentInstrumentData.UpiData.IntentFlow(this.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UPIIntentPaymentItem)) {
                    return false;
                }
                UPIIntentPaymentItem uPIIntentPaymentItem = (UPIIntentPaymentItem) obj;
                return Intrinsics.d(this.b, uPIIntentPaymentItem.b) && Intrinsics.d(this.c, uPIIntentPaymentItem.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "UPIIntentPaymentItem(displayItem=" + this.b + ", packageName=" + this.c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem$WalletPaymentItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$IndividualCheckoutItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WalletPaymentItem extends IndividualCheckoutItem {
            public final PaymentUiItem b;
            public final String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WalletPaymentItem(PaymentUiItem displayItem, String walledId) {
                super(displayItem);
                Intrinsics.i(displayItem, "displayItem");
                Intrinsics.i(walledId, "walledId");
                this.b = displayItem;
                this.c = walledId;
            }

            @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentUiItem getF1342a() {
                return this.b;
            }

            @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem.IndividualCheckoutItem
            public final SelectedPaymentInstrumentData b() {
                return new SelectedPaymentInstrumentData.WalletData(this.b.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WalletPaymentItem)) {
                    return false;
                }
                WalletPaymentItem walletPaymentItem = (WalletPaymentItem) obj;
                return Intrinsics.d(this.b, walletPaymentItem.b) && Intrinsics.d(this.c, walletPaymentItem.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "WalletPaymentItem(displayItem=" + this.b + ", walledId=" + this.c + ")";
            }
        }

        public SelectedPaymentInstrumentData b() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem$PaymentMethodItem;", "Lapp/chalo/checkout/data/model/ui/CheckoutPaymentItem;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentMethodItem extends CheckoutPaymentItem {
        public final PaymentUiItem b;
        public final PaymentMethodOptionsAppModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethodItem(PaymentUiItem displayItem, PaymentMethodOptionsAppModel methodOption) {
            super(displayItem);
            Intrinsics.i(displayItem, "displayItem");
            Intrinsics.i(methodOption, "methodOption");
            this.b = displayItem;
            this.c = methodOption;
        }

        @Override // app.chalo.checkout.data.model.ui.CheckoutPaymentItem
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentUiItem getF1342a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodItem)) {
                return false;
            }
            PaymentMethodItem paymentMethodItem = (PaymentMethodItem) obj;
            return Intrinsics.d(this.b, paymentMethodItem.b) && Intrinsics.d(this.c, paymentMethodItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "PaymentMethodItem(displayItem=" + this.b + ", methodOption=" + this.c + ")";
        }
    }

    public CheckoutPaymentItem(PaymentUiItem paymentUiItem) {
        this.f1342a = paymentUiItem;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public PaymentUiItem getF1342a() {
        return this.f1342a;
    }
}
