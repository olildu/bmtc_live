package app.chalo.models.ordercreation;

import app.chalo.models.CheckoutPaymentProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CreateOrderResponseApiModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5637a;

        static {
            int[] iArr = new int[CheckoutPaymentProvider.values().length];
            try {
                iArr[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPaymentProvider.CLDW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutPaymentProvider.INAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckoutPaymentProvider.YES_BANK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckoutPaymentProvider.PHONEPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5637a = iArr;
        }
    }

    public static final CreateOrderResponseAppModel a(CreateOrderResponseApiModel createOrderResponseApiModel) {
        OrderBookingInfoAppModel orderBookingInfoAppModel;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        CheckoutPaymentProvider checkoutPaymentProvider;
        OrderPaymentProviderInfoAppModel providerConfigAppModel;
        String str;
        OrderPaymentProviderInfoAppModel merchantUPIConfigAppModel;
        String str2;
        Intrinsics.i(createOrderResponseApiModel, "<this>");
        int i = createOrderResponseApiModel.f5635a;
        String str3 = createOrderResponseApiModel.b;
        OrderBookingInfo orderBookingInfo = createOrderResponseApiModel.c;
        if (orderBookingInfo != null) {
            orderBookingInfoAppModel = new OrderBookingInfoAppModel(orderBookingInfo.f5640a, orderBookingInfo.b, orderBookingInfo.c);
            orderPaymentProviderCustomerDetailsAppModel = null;
        } else {
            orderBookingInfoAppModel = null;
            orderPaymentProviderCustomerDetailsAppModel = null;
        }
        String str4 = createOrderResponseApiModel.d;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel2 = orderPaymentProviderCustomerDetailsAppModel;
        String str5 = createOrderResponseApiModel.e;
        String str6 = createOrderResponseApiModel.f;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel3 = orderPaymentProviderCustomerDetailsAppModel2;
        String str7 = createOrderResponseApiModel.g;
        OrderPaymentProviderInfo orderPaymentProviderInfo = createOrderResponseApiModel.h;
        Intrinsics.i(orderPaymentProviderInfo, "<this>");
        if (orderPaymentProviderInfo instanceof OrderPaymentProviderInfo.PhonePe) {
            OrderPaymentProviderInfo.PhonePe phonePe = (OrderPaymentProviderInfo.PhonePe) orderPaymentProviderInfo;
            OrderProviderConfig orderProviderConfig = phonePe.b;
            if (orderProviderConfig == null) {
                throw new PaymentProviderException("Payment provider error: " + PaymentProviderErrorCode.INVALID_CONFIG + "(" + phonePe.c + ")");
            }
            CheckoutPaymentProvider checkoutPaymentProvider2 = CheckoutPaymentProvider.PHONEPE;
            OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails = phonePe.f5652a;
            if (orderPaymentProviderCustomerDetails != null && (str2 = orderPaymentProviderCustomerDetails.f5644a) != null) {
                orderPaymentProviderCustomerDetailsAppModel3 = new OrderPaymentProviderCustomerDetailsAppModel(str2);
            }
            merchantUPIConfigAppModel = new OrderPaymentProviderInfoAppModel.ProviderConfigAppModel(checkoutPaymentProvider2, orderPaymentProviderCustomerDetailsAppModel3, orderProviderConfig.f5663a, orderProviderConfig.b, orderProviderConfig.c, phonePe.d);
        } else if (orderPaymentProviderInfo instanceof OrderPaymentProviderInfo.CustomUrl) {
            OrderPaymentProviderInfo.CustomUrl customUrl = (OrderPaymentProviderInfo.CustomUrl) orderPaymentProviderInfo;
            String str8 = customUrl.d;
            if (str8 == null) {
                throw new PaymentProviderException("Payment url required: " + PaymentProviderErrorCode.INVALID_CONFIG + "(" + customUrl.c + ")");
            }
            merchantUPIConfigAppModel = new OrderPaymentProviderInfoAppModel.ProviderPaymentUrl(CheckoutPaymentProvider.CUSTOM_URL, str8);
        } else if (orderPaymentProviderInfo instanceof OrderPaymentProviderInfo.YesBank) {
            OrderPaymentProviderInfo.YesBank yesBank = (OrderPaymentProviderInfo.YesBank) orderPaymentProviderInfo;
            OrderPaymentProviderVpaConfig orderPaymentProviderVpaConfig = yesBank.d;
            if (orderPaymentProviderVpaConfig == null) {
                throw new PaymentProviderException("Payment provider error: " + PaymentProviderErrorCode.INVALID_CONFIG + "(" + yesBank.c + ")");
            }
            merchantUPIConfigAppModel = new OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel(CheckoutPaymentProvider.YES_BANK, orderPaymentProviderVpaConfig.f5661a, orderPaymentProviderVpaConfig.b, orderPaymentProviderVpaConfig.c);
        } else {
            if (!(orderPaymentProviderInfo instanceof OrderPaymentProviderInfo.Basic)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutPaymentProvider.Companion companion = CheckoutPaymentProvider.INSTANCE;
            OrderPaymentProviderInfo.Basic basic = (OrderPaymentProviderInfo.Basic) orderPaymentProviderInfo;
            int i2 = basic.c;
            companion.getClass();
            CheckoutPaymentProvider[] checkoutPaymentProviderArrValues = CheckoutPaymentProvider.values();
            int length = checkoutPaymentProviderArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    checkoutPaymentProvider = null;
                    break;
                }
                checkoutPaymentProvider = checkoutPaymentProviderArrValues[i3];
                CheckoutPaymentProvider[] checkoutPaymentProviderArr = checkoutPaymentProviderArrValues;
                if (checkoutPaymentProvider.getId() == i2) {
                    break;
                }
                i3++;
                checkoutPaymentProviderArrValues = checkoutPaymentProviderArr;
            }
            if (checkoutPaymentProvider == null) {
                checkoutPaymentProvider = CheckoutPaymentProvider.UNKNOWN;
            }
            CheckoutPaymentProvider checkoutPaymentProvider3 = checkoutPaymentProvider;
            switch (WhenMappings.f5637a[checkoutPaymentProvider3.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    OrderProviderConfig orderProviderConfig2 = basic.b;
                    if (orderProviderConfig2 != null) {
                        OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails2 = basic.f5648a;
                        providerConfigAppModel = new OrderPaymentProviderInfoAppModel.ProviderConfigAppModel(checkoutPaymentProvider3, (orderPaymentProviderCustomerDetails2 == null || (str = orderPaymentProviderCustomerDetails2.f5644a) == null) ? null : new OrderPaymentProviderCustomerDetailsAppModel(str), orderProviderConfig2.f5663a, orderProviderConfig2.b, orderProviderConfig2.c, null);
                        return new CreateOrderResponseAppModel(i, str3, orderBookingInfoAppModel, str4, str5, str6, str7, providerConfigAppModel);
                    }
                    throw new PaymentProviderException("Payment provider error: " + PaymentProviderErrorCode.INVALID_CONFIG + "(" + i2 + ")");
                case 5:
                    merchantUPIConfigAppModel = OrderPaymentProviderInfoAppModel.NoPaymentRequired.INSTANCE;
                    break;
                case 6:
                    throw new PaymentProviderException("Payment provider error: " + PaymentProviderErrorCode.UNKNOWN_PROVIDER + "(" + i2 + ")");
                case 7:
                case 8:
                case 9:
                    throw new PaymentProviderException("Payment provider error: " + PaymentProviderErrorCode.UNKNOWN_PROVIDER + "(" + i2 + ")");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        providerConfigAppModel = merchantUPIConfigAppModel;
        return new CreateOrderResponseAppModel(i, str3, orderBookingInfoAppModel, str4, str5, str6, str7, providerConfigAppModel);
    }
}
