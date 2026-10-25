package app.chalo.features.checkout;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderCustomerDetailsAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CheckoutIntentModelHelperKt {
    public static final OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel a(CreateOrderResponseAppModel createOrderResponseAppModel) {
        Intrinsics.i(createOrderResponseAppModel, "<this>");
        OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel = createOrderResponseAppModel.h;
        if (orderPaymentProviderInfoAppModel instanceof OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel) {
            return (OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel) orderPaymentProviderInfoAppModel;
        }
        return null;
    }

    public static final CheckoutIntentModel b(CreateOrderResponseAppModel orderData, String agencyName, String str, String str2, String str3, String source) {
        String str4;
        String str5;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        Intrinsics.i(orderData, "orderData");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(source, "source");
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC = c(orderData);
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA = a(orderData);
        String str6 = orderData.b;
        String str7 = orderData.f;
        String str8 = orderData.g;
        int i = orderData.f5638a;
        String strValueOf = String.valueOf(i);
        String str9 = orderData.d;
        String str10 = orderData.e;
        String str11 = (providerConfigAppModelC == null || (orderPaymentProviderCustomerDetailsAppModel = providerConfigAppModelC.e) == null) ? null : orderPaymentProviderCustomerDetailsAppModel.f5646a;
        String str12 = providerConfigAppModelC != null ? providerConfigAppModelC.f : null;
        if (providerConfigAppModelC == null || (str4 = providerConfigAppModelC.g) == null) {
            str4 = "";
        }
        return new CheckoutIntentModel(new CheckoutPaymentData(new CheckoutOrderData(str7, str8, strValueOf, str9, str10, str11, str12, str6, str4, (providerConfigAppModelC == null || (str5 = providerConfigAppModelC.h) == null) ? "" : str5, null), new CheckoutUserDetails(str2, str), agencyName, orderData.h, merchantUPIConfigAppModelA != null ? new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g) : null), new CheckoutProductData(CheckoutProductType.MULTI_MODAL_GROUP_TICKET, false, new CheckoutAnalyticsData(source, MapsKt.i(new Pair("transactionId", str6), new Pair("bookingDate", str3), new Pair("productType", "mobileTicket"), new Pair("productSubType", "multiModalTicket"), new Pair(PaymentConstants.AMOUNT, String.valueOf(i))))));
    }

    public static final OrderPaymentProviderInfoAppModel.ProviderConfigAppModel c(CreateOrderResponseAppModel createOrderResponseAppModel) {
        Intrinsics.i(createOrderResponseAppModel, "<this>");
        OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel = createOrderResponseAppModel.h;
        if (orderPaymentProviderInfoAppModel instanceof OrderPaymentProviderInfoAppModel.ProviderConfigAppModel) {
            return (OrderPaymentProviderInfoAppModel.ProviderConfigAppModel) orderPaymentProviderInfoAppModel;
        }
        return null;
    }
}
