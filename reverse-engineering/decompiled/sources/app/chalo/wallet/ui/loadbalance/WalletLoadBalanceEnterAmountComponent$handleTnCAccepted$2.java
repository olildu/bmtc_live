package app.chalo.wallet.ui.loadbalance;

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
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.walletframework.wallet.domain.model.WalletLoadBalanceConfigAndRechargeOrderCombined;
import defpackage.vo1;
import defpackage.w31;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$handleTnCAccepted$2", f = "WalletLoadBalanceEnterAmountComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletLoadBalanceEnterAmountComponent$handleTnCAccepted$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletLoadBalanceConfigAndRechargeOrderCombined $combinedData;
    final /* synthetic */ WalletLoadBalanceEnterAmountIntent.TnCAcceptClickIntent $intent;
    int label;
    final /* synthetic */ WalletLoadBalanceEnterAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoadBalanceEnterAmountComponent$handleTnCAccepted$2(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined, WalletLoadBalanceEnterAmountIntent.TnCAcceptClickIntent tnCAcceptClickIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletLoadBalanceEnterAmountComponent;
        this.$combinedData = walletLoadBalanceConfigAndRechargeOrderCombined;
        this.$intent = tnCAcceptClickIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletLoadBalanceEnterAmountComponent$handleTnCAccepted$2(this.this$0, this.$combinedData, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WalletLoadBalanceEnterAmountComponent$handleTnCAccepted$2 walletLoadBalanceEnterAmountComponent$handleTnCAccepted$2 = (WalletLoadBalanceEnterAmountComponent$handleTnCAccepted$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        walletLoadBalanceEnterAmountComponent$handleTnCAccepted$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String strA;
        String str2;
        String str3;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        Long l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        String strM = this.this$0.E.m();
        Unit unit = Unit.f17538a;
        if (strM == null) {
            return unit;
        }
        UserProfileAppModel userProfileAppModelF = this.this$0.E.f();
        if (userProfileAppModelF == null || (str = userProfileAppModelF.e) == null) {
            str = "";
        }
        OrderBookingInfoAppModel orderBookingInfoAppModel = this.$combinedData.b.c;
        String bookingDate = this.this$0.F.Q((orderBookingInfoAppModel == null || (l = orderBookingInfoAppModel.f5642a) == null) ? 0L : l.longValue());
        String str4 = this.$intent.f10839a.b;
        String str5 = str4 == null ? "" : str4;
        CreateOrderResponseAppModel createOrderResponseAppModel = this.$combinedData.b;
        String strN = vo1.n(createOrderResponseAppModel.b, "_", createOrderResponseAppModel.f);
        WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent = this.this$0;
        walletLoadBalanceEnterAmountComponent.K = strN;
        Job job = walletLoadBalanceEnterAmountComponent.J;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        walletLoadBalanceEnterAmountComponent.J = BuildersKt.d(walletLoadBalanceEnterAmountComponent.j, null, null, new WalletLoadBalanceEnterAmountComponent$checkForCheckoutPaymentCompletedEvent$1(walletLoadBalanceEnterAmountComponent, strN, null), 3);
        CreateOrderResponseAppModel orderData = this.$combinedData.b;
        Intrinsics.i(orderData, "orderData");
        Intrinsics.i(bookingDate, "bookingDate");
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC = CheckoutIntentModelHelperKt.c(orderData);
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(orderData);
        String str6 = orderData.f;
        String str7 = orderData.g;
        String str8 = orderData.b;
        int i = orderData.f5638a;
        CheckoutPaymentData checkoutPaymentData = new CheckoutPaymentData(new CheckoutOrderData(str6, str7, String.valueOf(i), orderData.d, orderData.e, (providerConfigAppModelC == null || (orderPaymentProviderCustomerDetailsAppModel = providerConfigAppModelC.e) == null) ? null : orderPaymentProviderCustomerDetailsAppModel.f5646a, providerConfigAppModelC != null ? providerConfigAppModelC.f : null, str8, (providerConfigAppModelC == null || (str3 = providerConfigAppModelC.g) == null) ? "" : str3, (providerConfigAppModelC == null || (str2 = providerConfigAppModelC.h) == null) ? "" : str2, null), new CheckoutUserDetails(str, strM), str5, orderData.h, merchantUPIConfigAppModelA != null ? new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g) : null);
        CheckoutProductType checkoutProductType = CheckoutProductType.WALLET;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(MapsKt.i(new Pair("transactionId", str8), new Pair("bookingDate", bookingDate), new Pair("productType", "mobileWalletRecharge"), new Pair("productSubType", "mobileWalletRecharge"), new Pair(PaymentConstants.AMOUNT, String.valueOf(i))));
        CheckoutIntentModel checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData, new CheckoutProductData(checkoutProductType, false, new CheckoutAnalyticsData("wallet_load_money_screen", linkedHashMap)));
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel);
        } catch (Exception unused) {
            strA = null;
        }
        String str9 = strA != null ? strA : "";
        WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent2 = this.this$0;
        walletLoadBalanceEnterAmountComponent2.q0(new w31(10, walletLoadBalanceEnterAmountComponent2, strN, str9));
        return unit;
    }
}
