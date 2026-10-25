package app.chalo.productpurchase.passpurchase.utils;

import app.chalo.constants.Source;
import app.chalo.features.checkout.CheckoutAnalyticsData;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.features.checkout.CheckoutIntentModelHelperKt;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutPaymentProviderVpaConfig;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.features.checkout.CheckoutUserDetails;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderBookingInfoAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderCustomerDetailsAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModelKt;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.utils.timeutil.TimeUtilsContract;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassCheckoutIntentModelHelperKt {
    public static final CheckoutIntentModel a(CreateOrderResponseAppModel orderData, BookableSuperPassConfiguration bookableSuperPassConfiguration, boolean z, String passSubType, String source, String phone, String userId, TimeUtilsContract timeUtilsContract, Source previousScreenSource) {
        CheckoutProductType checkoutProductType;
        Long l;
        Long l2;
        String str;
        String str2;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        Intrinsics.i(orderData, "orderData");
        OrderBookingInfoAppModel orderBookingInfoAppModel = orderData.c;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties = bookableSuperPassConfiguration.b;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c;
        Intrinsics.i(passSubType, "passSubType");
        Intrinsics.i(source, "source");
        Intrinsics.i(phone, "phone");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(previousScreenSource, "previousScreenSource");
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC = CheckoutIntentModelHelperKt.c(orderData);
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(orderData);
        String str3 = orderData.f;
        String str4 = orderData.g;
        String str5 = orderData.b;
        if (passSubType.equals("rideBasedPass")) {
            checkoutProductType = CheckoutProductType.SUPER_PASS_RIDE_PASS;
        } else {
            checkoutProductType = passSubType.equals("magicPass") ? CheckoutProductType.SUPER_PASS_MAGIC_PASS : CheckoutProductType.UNKNOWN;
        }
        CheckoutPaymentData checkoutPaymentData = new CheckoutPaymentData(new CheckoutOrderData(str3, str4, String.valueOf(orderData.f5638a), orderData.d, orderData.e, (providerConfigAppModelC == null || (orderPaymentProviderCustomerDetailsAppModel = providerConfigAppModelC.e) == null) ? null : orderPaymentProviderCustomerDetailsAppModel.f5646a, providerConfigAppModelC != null ? providerConfigAppModelC.f : null, str5, (providerConfigAppModelC == null || (str2 = providerConfigAppModelC.g) == null) ? "" : str2, (providerConfigAppModelC == null || (str = providerConfigAppModelC.h) == null) ? "" : str, superPassProductConfigurationProperties.f5600a), new CheckoutUserDetails(phone, userId), superPassProductConfigurationProperties.k, orderData.h, merchantUPIConfigAppModelA != null ? new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g) : null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair pair = new Pair(PaymentConstants.ORDER_ID_CAMEL, str3);
        Pair pair2 = new Pair("chaloOrderId", str4);
        Pair pair3 = new Pair("passengerType", bookableSuperPassConfiguration.d.f8639a);
        Pair pair4 = new Pair("numDays", String.valueOf(AllProductConfigsResponseAppModelKt.i(superPassProductConfigFareMappingResponseAppModel)));
        Pair pair5 = new Pair("bookingId", str5);
        long jLongValue = 0;
        Pair pair6 = new Pair("bookingDate", timeUtilsContract.Q((orderBookingInfoAppModel == null || (l2 = orderBookingInfoAppModel.f5642a) == null) ? 0L : l2.longValue()));
        if (orderBookingInfoAppModel != null && (l = orderBookingInfoAppModel.b) != null) {
            jLongValue = l.longValue();
        }
        linkedHashMap.putAll(MapsKt.i(pair, pair2, pair3, pair4, pair5, pair6, new Pair("expiryDate", timeUtilsContract.Q(jLongValue)), new Pair("productId", superPassProductConfigurationProperties.f5600a), new Pair("productType", superPassProductConfigurationProperties.i), new Pair("productSubType", superPassProductConfigurationProperties.j), new Pair("productCost", AllProductConfigsResponseAppModelKt.c(superPassProductConfigFareMappingResponseAppModel.o)), new Pair("isSuperPass", "true"), new Pair("maxRides", String.valueOf(superPassProductConfigFareMappingResponseAppModel.g)), new Pair("maxRidesPerDay", String.valueOf(superPassProductConfigFareMappingResponseAppModel.k)), new Pair("previousScreen", previousScreenSource.getSourceName()), new Pair("maxPricePerTrip", String.valueOf(superPassProductConfigFareMappingResponseAppModel.l)), new Pair("transaction id", str5), new Pair("userId", userId)));
        return new CheckoutIntentModel(checkoutPaymentData, new CheckoutProductData(checkoutProductType, z, new CheckoutAnalyticsData(source, linkedHashMap)));
    }
}
