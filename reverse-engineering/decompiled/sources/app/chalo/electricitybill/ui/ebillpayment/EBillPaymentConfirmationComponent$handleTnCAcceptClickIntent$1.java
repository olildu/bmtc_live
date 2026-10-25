package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.domain.EBillCreateOrderUseCase;
import app.chalo.electricitybill.exception.EBillPaymentException;
import app.chalo.features.checkout.CheckoutAnalyticsData;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.features.checkout.CheckoutIntentModelHelperKt;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutPaymentProviderVpaConfig;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.features.checkout.CheckoutUserDetails;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderBookingInfoAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderCustomerDetailsAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastData;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.b00;
import defpackage.yg;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent$handleTnCAcceptClickIntent$1", f = "EBillPaymentConfirmationComponent.kt", l = {149, 154}, m = "invokeSuspend", v = 1)
final class EBillPaymentConfirmationComponent$handleTnCAcceptClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EBillPaymentConfirmationIntent.TnCAcceptClickIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ EBillPaymentConfirmationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBillPaymentConfirmationComponent$handleTnCAcceptClickIntent$1(EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent, EBillPaymentConfirmationIntent.TnCAcceptClickIntent tnCAcceptClickIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eBillPaymentConfirmationComponent;
        this.$intent = tnCAcceptClickIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EBillPaymentConfirmationComponent$handleTnCAcceptClickIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EBillPaymentConfirmationComponent$handleTnCAcceptClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String str;
        String str2;
        String strA;
        String str3;
        String str4;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        Long l;
        KotlinToastManager kotlinToastManager;
        String message;
        Object objB;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                objA = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB = obj;
            }
            message = (String) objB;
            kotlinToastManager = kotlinToastManager2;
            kotlinToastManager.a(new KotlinToastData(message, ToastLength.SHORT));
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent = this.this$0;
        ElectricityBillAppModel electricityBillAppModel = this.$intent.f2575a;
        AnalyticsContract analyticsContract = eBillPaymentConfirmationComponent.l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
        MixpanelUtil.a(linkedHashMap, electricityBillAppModel);
        AnalyticsContract.DefaultImpls.a(analyticsContract, "eBill payment tnc accept clicked", "", linkedHashMap, null, false, 24);
        this.this$0.E0(new b00(14));
        EBillCreateOrderUseCase eBillCreateOrderUseCase = this.this$0.m;
        ElectricityBillAppModel electricityBillAppModel2 = this.$intent.f2575a;
        this.label = 1;
        objA = eBillCreateOrderUseCase.a(electricityBillAppModel2, this);
        if (objA != coroutineSingletons) {
        }
        return coroutineSingletons;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            this.this$0.E0(new b00(15));
            kotlinToastManager = this.this$0.n;
            message = ((EBillPaymentException) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).getMessage();
            if (message == null) {
                this.L$0 = kotlinToastManager;
                this.label = 2;
                objB = this.this$0.q.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    message = (String) objB;
                    kotlinToastManager = kotlinToastManager2;
                }
                return coroutineSingletons;
            }
            kotlinToastManager.a(new KotlinToastData(message, ToastLength.SHORT));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloUseCaseResult.Success success = (ChaloUseCaseResult.Success) chaloUseCaseResult;
            this.this$0.E0(new yg(success, 3));
            EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent2 = this.this$0;
            CreateOrderResponseAppModel orderData = (CreateOrderResponseAppModel) success.f10419a;
            String str5 = orderData.f;
            String str6 = orderData.g;
            AnalyticsContract analyticsContract2 = eBillPaymentConfirmationComponent2.l;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(PaymentConstants.ORDER_ID_CAMEL, str5);
            linkedHashMap2.put("chaloOrderId", str6);
            AnalyticsContract.DefaultImpls.a(analyticsContract2, "eBill payment order created", "", linkedHashMap2, null, false, 24);
            EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent3 = this.this$0;
            String str7 = this.$intent.f2575a.h;
            if (str7 == null) {
                str7 = "";
            }
            Job job = eBillPaymentConfirmationComponent3.v;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            eBillPaymentConfirmationComponent3.v = BuildersKt.d(eBillPaymentConfirmationComponent3.j, null, null, new EBillPaymentConfirmationComponent$waitForCheckoutResult$1(eBillPaymentConfirmationComponent3, str7, null), 3);
            UserProfileAppModel userProfileAppModelF = this.this$0.o.f();
            String eBillAgency = Source.ELECTRICITY_BILL_AGENCY.getSourceName();
            String customerNumber = this.$intent.f2575a.c;
            if (userProfileAppModelF == null || (str = userProfileAppModelF.i) == null) {
                str = "";
            }
            if (userProfileAppModelF == null || (str2 = userProfileAppModelF.e) == null) {
                str2 = "";
            }
            String source = Source.SOURCE_CARD_RECHARGE_CONFIRM_PAYMENT_FRAGMENT.getSourceName();
            TimeUtilsContract timeUtilsContract = this.this$0.p;
            OrderBookingInfoAppModel orderBookingInfoAppModel = orderData.c;
            String bookingDate = timeUtilsContract.Q((orderBookingInfoAppModel == null || (l = orderBookingInfoAppModel.f5642a) == null) ? 0L : l.longValue());
            Intrinsics.i(orderData, "orderData");
            Intrinsics.i(eBillAgency, "eBillAgency");
            Intrinsics.i(customerNumber, "customerNumber");
            Intrinsics.i(source, "source");
            Intrinsics.i(bookingDate, "bookingDate");
            OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC = CheckoutIntentModelHelperKt.c(orderData);
            OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(orderData);
            String str8 = orderData.f;
            String str9 = orderData.g;
            int i2 = orderData.f5638a;
            CheckoutPaymentData checkoutPaymentData = new CheckoutPaymentData(new CheckoutOrderData(str8, str9, String.valueOf(i2), orderData.d, orderData.e, (providerConfigAppModelC == null || (orderPaymentProviderCustomerDetailsAppModel = providerConfigAppModelC.e) == null) ? null : orderPaymentProviderCustomerDetailsAppModel.f5646a, providerConfigAppModelC != null ? providerConfigAppModelC.f : null, orderData.b, (providerConfigAppModelC == null || (str4 = providerConfigAppModelC.g) == null) ? "" : str4, (providerConfigAppModelC == null || (str3 = providerConfigAppModelC.h) == null) ? "" : str3, null), new CheckoutUserDetails(str2, str), eBillAgency, orderData.h, merchantUPIConfigAppModelA != null ? new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g) : null);
            CheckoutProductType checkoutProductType = CheckoutProductType.ELECTRICITY_BILL;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.putAll(MapsKt.i(new Pair("customerNumber", customerNumber), new Pair("transactionId", orderData.b), new Pair("bookingDate", bookingDate), new Pair("productType", "electricityBill"), new Pair("productSubType", "electricityBill"), new Pair(PaymentConstants.AMOUNT, String.valueOf(i2))));
            CheckoutIntentModel checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData, new CheckoutProductData(checkoutProductType, false, new CheckoutAnalyticsData(source, linkedHashMap3)));
            ChaloNavigationManager chaloNavigationManager = this.this$0.k;
            String str10 = this.$intent.f2575a.h;
            if (str10 == null) {
                str10 = "";
            }
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel);
            } catch (Exception unused) {
                strA = null;
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new CheckoutPaymentMainArgs(str10, strA != null ? strA : ""), null, null, 6));
        }
        return Unit.f17538a;
    }
}
