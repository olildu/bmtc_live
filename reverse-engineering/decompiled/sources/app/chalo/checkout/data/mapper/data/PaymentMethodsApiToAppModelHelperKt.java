package app.chalo.checkout.data.mapper.data;

import app.chalo.checkout.data.model.api.response.PaymentInstrument;
import app.chalo.checkout.data.model.api.response.PaymentMethodOption;
import app.chalo.checkout.data.model.api.response.ProviderDetails;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.PaymentDisplayDetailsAppModel;
import app.chalo.checkout.data.model.app.ProviderDetailsAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PaymentMethodsApiToAppModelHelperKt {
    public static final CheckoutPaymentMethod a(String id) {
        Intrinsics.i(id, "id");
        CheckoutPaymentMethod checkoutPaymentMethodC = c(id);
        if (checkoutPaymentMethodC != null) {
            return checkoutPaymentMethodC;
        }
        CheckoutPaymentMethod.Inai.Card card = CheckoutPaymentMethod.Inai.Card.INSTANCE;
        if (id.equals(card.b)) {
            return card;
        }
        CheckoutPaymentMethod.Inai.Upi upi = CheckoutPaymentMethod.Inai.Upi.INSTANCE;
        if (id.equals(upi.b)) {
            return upi;
        }
        CheckoutPaymentMethod.Inai.Wallet wallet = CheckoutPaymentMethod.Inai.Wallet.INSTANCE;
        if (id.equals(wallet.b)) {
            return wallet;
        }
        CheckoutPaymentMethod.Inai.NetBanking netBanking = CheckoutPaymentMethod.Inai.NetBanking.INSTANCE;
        if (id.equals(netBanking.b)) {
            return netBanking;
        }
        CheckoutPaymentMethod.Inai.Lazypay lazypay = CheckoutPaymentMethod.Inai.Lazypay.INSTANCE;
        if (id.equals(lazypay.b)) {
            return lazypay;
        }
        CheckoutPaymentMethod.Inai.Cash cash = CheckoutPaymentMethod.Inai.Cash.INSTANCE;
        return id.equals(cash.b) ? cash : new CheckoutPaymentMethod.Inai.Default(id);
    }

    public static final CheckoutPaymentMethod b(String id) {
        Intrinsics.i(id, "id");
        CheckoutPaymentMethod checkoutPaymentMethodC = c(id);
        if (checkoutPaymentMethodC != null) {
            return checkoutPaymentMethodC;
        }
        CheckoutPaymentMethod.PhonePe.Card card = CheckoutPaymentMethod.PhonePe.Card.INSTANCE;
        if (id.equals(card.b)) {
            return card;
        }
        CheckoutPaymentMethod.PhonePe.Upi upi = CheckoutPaymentMethod.PhonePe.Upi.INSTANCE;
        if (id.equals(upi.b)) {
            return upi;
        }
        CheckoutPaymentMethod.PhonePe.NetBanking netBanking = CheckoutPaymentMethod.PhonePe.NetBanking.INSTANCE;
        return id.equals(netBanking.b) ? netBanking : CheckoutPaymentMethod.PhonePe.Unknown.INSTANCE;
    }

    public static final CheckoutPaymentMethod c(String str) {
        CheckoutPaymentMethod.ChaloPay chaloPay = CheckoutPaymentMethod.ChaloPay.INSTANCE;
        chaloPay.getClass();
        if (Intrinsics.d(str, "chalopay")) {
            return chaloPay;
        }
        CheckoutPaymentMethod.ClosedLoopWallet closedLoopWallet = CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE;
        closedLoopWallet.getClass();
        if (Intrinsics.d(str, "cldw")) {
            return closedLoopWallet;
        }
        CheckoutPaymentMethod.JuspayTurboUpi juspayTurboUpi = CheckoutPaymentMethod.JuspayTurboUpi.INSTANCE;
        juspayTurboUpi.getClass();
        if (Intrinsics.d(str, "juspayTurboUpi")) {
            return juspayTurboUpi;
        }
        return null;
    }

    public static final CheckoutPaymentMethod d(String id) {
        Intrinsics.i(id, "id");
        CheckoutPaymentMethod checkoutPaymentMethodC = c(id);
        if (checkoutPaymentMethodC != null) {
            return checkoutPaymentMethodC;
        }
        CheckoutPaymentMethod.RazorPay.Upi upi = CheckoutPaymentMethod.RazorPay.Upi.INSTANCE;
        if (id.equals(upi.b)) {
            return upi;
        }
        CheckoutPaymentMethod.RazorPay.Wallet wallet = CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE;
        if (id.equals(wallet.b)) {
            return wallet;
        }
        CheckoutPaymentMethod.RazorPay.NetBanking netBanking = CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE;
        if (id.equals(netBanking.b)) {
            return netBanking;
        }
        CheckoutPaymentMethod.RazorPay.Card card = CheckoutPaymentMethod.RazorPay.Card.INSTANCE;
        if (id.equals(card.b)) {
            return card;
        }
        CheckoutPaymentMethod.RazorPay.Lazypay lazypay = CheckoutPaymentMethod.RazorPay.Lazypay.INSTANCE;
        if (id.equals(lazypay.b)) {
            return lazypay;
        }
        CheckoutPaymentMethod.RazorPay.Cash cash = CheckoutPaymentMethod.RazorPay.Cash.INSTANCE;
        return id.equals(cash.b) ? cash : CheckoutPaymentMethod.RazorPay.Unknown.INSTANCE;
    }

    public static final PaymentDisplayDetailsAppModel e(PaymentInstrument paymentInstrument) {
        String str;
        Intrinsics.i(paymentInstrument, "<this>");
        String str2 = paymentInstrument.h;
        String str3 = paymentInstrument.f;
        boolean z = paymentInstrument.c;
        String str4 = paymentInstrument.e;
        if (str4 == null || str4.length() == 0) {
            str4 = null;
        }
        String str5 = paymentInstrument.g;
        if (str5 == null || str5.length() == 0) {
            str5 = null;
        }
        String str6 = paymentInstrument.f1260a;
        if (str6 != null) {
            if (str6.length() == 0) {
                str6 = null;
            }
            str = str6;
        } else {
            str = null;
        }
        return new PaymentDisplayDetailsAppModel(str3, str4, str5, str, (str2 == null || str2.length() == 0) ? null : str2, z);
    }

    public static final PaymentDisplayDetailsAppModel f(PaymentMethodOption paymentMethodOption) {
        String str;
        Intrinsics.i(paymentMethodOption, "<this>");
        String str2 = paymentMethodOption.k;
        String str3 = paymentMethodOption.g;
        boolean z = paymentMethodOption.c;
        String str4 = paymentMethodOption.e;
        if (str4 == null || str4.length() == 0) {
            str4 = null;
        }
        String str5 = paymentMethodOption.j;
        if (str5 == null || str5.length() == 0) {
            str5 = null;
        }
        String str6 = paymentMethodOption.f1262a;
        if (str6 != null) {
            if (str6.length() == 0) {
                str6 = null;
            }
            str = str6;
        } else {
            str = null;
        }
        return new PaymentDisplayDetailsAppModel(str3, str4, str5, str, (str2 == null || str2.length() == 0) ? null : str2, z);
    }

    public static final ProviderDetailsAppModel g(ProviderDetails providerDetails) {
        Intrinsics.i(providerDetails, "<this>");
        return new ProviderDetailsAppModel(providerDetails.f1272a, providerDetails.b);
    }
}
