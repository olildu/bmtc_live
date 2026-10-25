package app.chalo.checkout.paymentprovider.phonepe;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData;", "", "Card", "NetBanking", "UpiIntent", "Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData$Card;", "Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData$NetBanking;", "Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData$UpiIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PhonePePaymentModeData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData$Card;", "Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Card extends PhonePePaymentModeData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1418a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public Card(String cardNumber, String cardHolderName, String cvv, String expiryMonth, String expiryYear, String str) {
            Intrinsics.i(cardNumber, "cardNumber");
            Intrinsics.i(cardHolderName, "cardHolderName");
            Intrinsics.i(cvv, "cvv");
            Intrinsics.i(expiryMonth, "expiryMonth");
            Intrinsics.i(expiryYear, "expiryYear");
            this.f1418a = cardNumber;
            this.b = cardHolderName;
            this.c = cvv;
            this.d = expiryMonth;
            this.e = expiryYear;
            this.f = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return Intrinsics.d(this.f1418a, card.f1418a) && Intrinsics.d(this.b, card.b) && Intrinsics.d(this.c, card.c) && Intrinsics.d(this.d, card.d) && Intrinsics.d(this.e, card.e) && Intrinsics.d(this.f, card.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(this.f1418a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Card(cardNumber=", this.f1418a, ", cardHolderName=", this.b, ", cvv=");
            cb0.t(sbE, this.c, ", expiryMonth=", this.d, ", expiryYear=");
            return r30.i(sbE, this.e, ", merchantUserId=", this.f, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData$NetBanking;", "Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NetBanking extends PhonePePaymentModeData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1419a;

        public NetBanking(String bankId) {
            Intrinsics.i(bankId, "bankId");
            this.f1419a = bankId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetBanking) && Intrinsics.d(this.f1419a, ((NetBanking) obj).f1419a);
        }

        public final int hashCode() {
            return this.f1419a.hashCode();
        }

        public final String toString() {
            return vo1.B("NetBanking(bankId=", this.f1419a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData$UpiIntent;", "Lapp/chalo/checkout/paymentprovider/phonepe/PhonePePaymentModeData;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpiIntent extends PhonePePaymentModeData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1420a;

        public UpiIntent(String targetApp) {
            Intrinsics.i(targetApp, "targetApp");
            this.f1420a = targetApp;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpiIntent) && Intrinsics.d(this.f1420a, ((UpiIntent) obj).f1420a);
        }

        public final int hashCode() {
            return this.f1420a.hashCode();
        }

        public final String toString() {
            return vo1.B("UpiIntent(targetApp=", this.f1420a, ")");
        }
    }
}
