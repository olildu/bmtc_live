package app.chalo.checkout.domain;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.mapper.data.PaymentMethodsApiToAppModelHelperKt;
import app.chalo.checkout.data.model.api.response.PaymentInstrument;
import app.chalo.checkout.data.model.api.response.PaymentMethodOption;
import app.chalo.checkout.data.model.api.response.PaymentMethodOptionMetaData;
import app.chalo.checkout.data.model.api.response.PaymentMethodsAPIModel;
import app.chalo.checkout.data.model.api.response.PreferredPaymentMethod;
import app.chalo.checkout.data.model.api.response.ProviderDetails;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.PaymentDisplayDetailsAppModel;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodEligibilityDetails;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/ConvertPaymentMethodsApiModelToAppModelForInaiUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConvertPaymentMethodsApiModelToAppModelForInaiUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICheckoutAnalyticsHelper f1365a;

    public ConvertPaymentMethodsApiModelToAppModelForInaiUseCase(ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper) {
        this.f1365a = iCheckoutAnalyticsHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v30, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public final PaymentMethodsAppModel a(PaymentMethodsAPIModel paymentMethodsAPIModel) {
        ?? arrayList;
        Object wallet;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        Object juspayTurboUpi;
        String str;
        PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Cash cash;
        PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic generic;
        PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Card card;
        List list = paymentMethodsAPIModel.b;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : list) {
            if (((PaymentMethodOption) obj).d) {
                arrayList5.add(obj);
            }
        }
        List<PaymentMethodOption> listV0 = CollectionsKt.v0(new ConvertPaymentMethodsApiModelToAppModelForInaiUseCase$getPaymentMethodOptions$$inlined$sortedBy$1(), arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (PaymentMethodOption paymentMethodOption : listV0) {
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModelF = PaymentMethodsApiToAppModelHelperKt.f(paymentMethodOption);
            ProviderDetails providerDetails = paymentMethodOption.l;
            List list2 = paymentMethodOption.i;
            CheckoutPaymentMethod checkoutPaymentMethodA = PaymentMethodsApiToAppModelHelperKt.a(paymentMethodOption.b);
            if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.Inai.Card.INSTANCE)) {
                card = new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Card(paymentDisplayDetailsAppModelF);
            } else if (checkoutPaymentMethodA instanceof CheckoutPaymentMethod.Inai.Default) {
                generic = new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic(paymentDisplayDetailsAppModelF, ((CheckoutPaymentMethod.Inai.Default) checkoutPaymentMethodA).b);
            } else if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.Inai.Cash.INSTANCE)) {
                cash = new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Cash(paymentDisplayDetailsAppModelF);
            } else {
                if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.Inai.Lazypay.INSTANCE)) {
                    PaymentMethodOptionMetaData paymentMethodOptionMetaData = paymentMethodOption.f;
                    if (paymentMethodOptionMetaData == null || (str = paymentMethodOptionMetaData.f1264a) == null) {
                        str = "";
                    }
                    wallet = new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.LazyPay(paymentDisplayDetailsAppModelF, new PaymentMethodEligibilityDetails(str, paymentMethodOptionMetaData != null ? paymentMethodOptionMetaData.b : false));
                } else if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.Inai.NetBanking.INSTANCE)) {
                    if (list2 != null) {
                        List<PaymentInstrument> list3 = list2;
                        arrayList4 = new ArrayList(CollectionsKt.v(list3, 10));
                        for (PaymentInstrument paymentInstrument : list3) {
                            arrayList4.add(new PaymentInstrumentAppModel.NetBankingPaymentInstrumentAppModel(PaymentMethodsApiToAppModelHelperKt.e(paymentInstrument), paymentInstrument.b));
                        }
                    } else {
                        arrayList4 = EmptyList.f17557a;
                    }
                    wallet = new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking(paymentDisplayDetailsAppModelF, arrayList4);
                } else if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.Inai.Upi.INSTANCE)) {
                    if (list2 != null) {
                        List<PaymentInstrument> list4 = list2;
                        arrayList3 = new ArrayList(CollectionsKt.v(list4, 10));
                        for (PaymentInstrument paymentInstrument2 : list4) {
                            arrayList3.add(new PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel(PaymentMethodsApiToAppModelHelperKt.e(paymentInstrument2), paymentInstrument2.f, false));
                        }
                    } else {
                        arrayList3 = EmptyList.f17557a;
                    }
                    wallet = new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI(paymentDisplayDetailsAppModelF, arrayList3);
                } else if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.Inai.Wallet.INSTANCE)) {
                    if (list2 != null) {
                        List<PaymentInstrument> list5 = list2;
                        arrayList2 = new ArrayList(CollectionsKt.v(list5, 10));
                        for (PaymentInstrument paymentInstrument3 : list5) {
                            arrayList2.add(new PaymentInstrumentAppModel.WalletPaymentInstrumentAppModel(PaymentMethodsApiToAppModelHelperKt.e(paymentInstrument3), paymentInstrument3.b));
                        }
                    } else {
                        arrayList2 = EmptyList.f17557a;
                    }
                    wallet = new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet(paymentDisplayDetailsAppModelF, arrayList2);
                } else {
                    wallet = null;
                    if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.ChaloPay.INSTANCE)) {
                        juspayTurboUpi = new PaymentMethodOptionsAppModel.ChaloPay(paymentDisplayDetailsAppModelF, providerDetails != null ? PaymentMethodsApiToAppModelHelperKt.g(providerDetails) : null);
                    } else if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE)) {
                        juspayTurboUpi = new PaymentMethodOptionsAppModel.ClosedLoopWallet(paymentDisplayDetailsAppModelF, providerDetails != null ? PaymentMethodsApiToAppModelHelperKt.g(providerDetails) : null);
                    } else if (checkoutPaymentMethodA.equals(CheckoutPaymentMethod.JuspayTurboUpi.INSTANCE)) {
                        juspayTurboUpi = new PaymentMethodOptionsAppModel.JuspayTurboUpi(paymentDisplayDetailsAppModelF, providerDetails != null ? PaymentMethodsApiToAppModelHelperKt.g(providerDetails) : null);
                    }
                }
                juspayTurboUpi = wallet;
            }
            if (juspayTurboUpi != null) {
                juspayTurboUpi = cash;
                juspayTurboUpi = generic;
                juspayTurboUpi = card;
                arrayList6.add(juspayTurboUpi);
            } else {
                juspayTurboUpi = cash;
                juspayTurboUpi = generic;
                juspayTurboUpi = card;
            }
        }
        this.f1365a.b("payment method app model created for inai", MapsKt.h(new Pair("appModel", arrayList6.toString())));
        String str2 = paymentMethodsAPIModel.f1266a;
        List list6 = paymentMethodsAPIModel.c;
        if (list6 != null) {
            List<PreferredPaymentMethod> list7 = list6;
            arrayList = new ArrayList(CollectionsKt.v(list7, 10));
            for (PreferredPaymentMethod preferredPaymentMethod : list7) {
                Intrinsics.i(preferredPaymentMethod, "<this>");
                arrayList.add(new PreferredPaymentMethodsAppModel(preferredPaymentMethod.f1270a, preferredPaymentMethod.b, PaymentMethodsApiToAppModelHelperKt.a(preferredPaymentMethod.c)));
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new PaymentMethodsAppModel(str2, arrayList6, arrayList);
    }
}
