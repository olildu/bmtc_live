package app.chalo.checkout.ui.screen.checkout.razorpay;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.mapper.data.PaymentMethodsApiToAppModelHelperKt;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.CommonRazorPayData;
import app.chalo.checkout.data.model.app.RazorPayNotes;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.domain.GetLazyPayCheckoutUrlUseCase;
import app.chalo.checkout.domain.razorpay.CreateRazorPayDataUseCase;
import app.chalo.checkout.domain.razorpay.ValidateRazorPayDataUseCase;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutUserDetails;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutRazorpayArgs;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.ComponentContext;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.on;
import defpackage.yn;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewState;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutComponent extends ChaloBaseStateMviComponent<CheckoutViewIntent, CheckoutViewState, CheckoutViewState, CheckoutSideEffect> {
    public final CheckoutRazorpayArgs k;
    public final CheckoutPaymentDataResolver l;
    public final CreateRazorPayDataUseCase m;
    public final ValidateRazorPayDataUseCase n;
    public final GetLazyPayCheckoutUrlUseCase o;
    public final StringProvider p;
    public final ICheckoutAnalyticsHelper q;
    public final ChaloNavigationManager r;
    public final RazorPaySdkProvider s;
    public final KotlinToastManager t;
    public final Lazy u;

    public CheckoutComponent(CheckoutRazorpayArgs checkoutRazorpayArgs, ComponentContext componentContext, CheckoutPaymentDataResolver checkoutPaymentDataResolver, CreateRazorPayDataUseCase createRazorPayDataUseCase, ValidateRazorPayDataUseCase validateRazorPayDataUseCase, GetLazyPayCheckoutUrlUseCase getLazyPayCheckoutUrlUseCase, StringProvider stringProvider, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, ChaloNavigationManager chaloNavigationManager, RazorPaySdkProvider razorPaySdkProvider, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = checkoutRazorpayArgs;
        this.l = checkoutPaymentDataResolver;
        this.m = createRazorPayDataUseCase;
        this.n = validateRazorPayDataUseCase;
        this.o = getLazyPayCheckoutUrlUseCase;
        this.p = stringProvider;
        this.q = iCheckoutAnalyticsHelper;
        this.r = chaloNavigationManager;
        this.s = razorPaySdkProvider;
        this.t = kotlinToastManager;
        this.u = LazyKt.b(new yn(this, 0));
        I0(CheckoutViewIntent.InitiateCheckoutViewIntent.f1488a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if (r8 == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent.F0(app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object G0(CheckoutComponent checkoutComponent, ContinuationImpl continuationImpl) {
        CheckoutComponent$handleRazorpayFlow$1 checkoutComponent$handleRazorpayFlow$1;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver;
        Map map;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver2 = checkoutComponent.l;
        if (continuationImpl instanceof CheckoutComponent$handleRazorpayFlow$1) {
            checkoutComponent$handleRazorpayFlow$1 = (CheckoutComponent$handleRazorpayFlow$1) continuationImpl;
            int i = checkoutComponent$handleRazorpayFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutComponent$handleRazorpayFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutComponent$handleRazorpayFlow$1 = new CheckoutComponent$handleRazorpayFlow$1(checkoutComponent, continuationImpl);
            }
        } else {
            checkoutComponent$handleRazorpayFlow$1 = new CheckoutComponent$handleRazorpayFlow$1(checkoutComponent, continuationImpl);
        }
        Object obj = checkoutComponent$handleRazorpayFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutComponent$handleRazorpayFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            checkoutComponent.E0(new on(7));
            SelectedPaymentInstrumentData selectedPaymentInstrumentData = ((PaymentInfoState) checkoutPaymentDataResolver2.P().getValue()).d;
            CreateRazorPayDataUseCase createRazorPayDataUseCase = checkoutComponent.m;
            CheckoutPaymentData checkoutPaymentDataU = createRazorPayDataUseCase.b.u();
            CheckoutOrderData checkoutOrderData = checkoutPaymentDataU.f2691a;
            String str = checkoutOrderData.c;
            String str2 = checkoutOrderData.d;
            String str3 = checkoutOrderData.f2689a;
            String str4 = checkoutOrderData.h;
            String str5 = checkoutPaymentDataU.c;
            CheckoutUserDetails checkoutUserDetails = checkoutPaymentDataU.b;
            checkoutPaymentDataResolver = checkoutPaymentDataResolver2;
            String str6 = checkoutUserDetails.b;
            String type = createRazorPayDataUseCase.f1396a.a().getType();
            RazorPayNotes razorPayNotes = new RazorPayNotes(str4, str5, str6, type);
            String str7 = checkoutUserDetails.f2697a;
            CheckoutOrderData checkoutOrderData2 = checkoutPaymentDataU.f2691a;
            String str8 = checkoutOrderData2.f;
            String str9 = checkoutOrderData2.g;
            new CommonRazorPayData(str, str2, str3, razorPayNotes, str7, str8, str9);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(PaymentConstants.AMOUNT, str);
            linkedHashMap.put(FirebaseAnalytics.Param.CURRENCY, str2);
            linkedHashMap.put(PaymentConstants.ORDER_ID, str3);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (str4 != null) {
                linkedHashMap2.put("transactionId", str4);
            }
            linkedHashMap2.put("agency", str5);
            linkedHashMap2.put("userId", str6);
            linkedHashMap2.put("productType", type);
            linkedHashMap.put("notes", linkedHashMap2);
            linkedHashMap.put("contact", str7);
            if (str8 != null) {
                linkedHashMap.put(PaymentConstants.CUSTOMER_ID, str8);
            }
            if (str9 != null) {
                linkedHashMap.put("account_id", str9);
            }
            if (selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.UpiData) {
                SelectedPaymentInstrumentData.UpiData upiData = (SelectedPaymentInstrumentData.UpiData) selectedPaymentInstrumentData;
                linkedHashMap.put(FirebaseAnalytics.Param.METHOD, CheckoutPaymentMethod.RazorPay.Upi.INSTANCE.b);
                if (!(upiData instanceof SelectedPaymentInstrumentData.UpiData.IntentFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedHashMap.put("upi_app_package_name", ((SelectedPaymentInstrumentData.UpiData.IntentFlow) upiData).c);
                linkedHashMap.put("_[flow]", "intent");
            } else if (selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.WalletData) {
                String lowerCase = ((SelectedPaymentInstrumentData.WalletData) selectedPaymentInstrumentData).b.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                linkedHashMap.put("wallet", lowerCase);
                linkedHashMap.put(FirebaseAnalytics.Param.METHOD, CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE.b);
            } else if (selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.NetBankingData) {
                linkedHashMap.put(PaymentConstants.BANK, ((SelectedPaymentInstrumentData.NetBankingData) selectedPaymentInstrumentData).b);
                linkedHashMap.put(FirebaseAnalytics.Param.METHOD, CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE.b);
            } else if (selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.CardData) {
                SelectedPaymentInstrumentData.CardData cardData = (SelectedPaymentInstrumentData.CardData) selectedPaymentInstrumentData;
                linkedHashMap.put(FirebaseAnalytics.Param.METHOD, CheckoutPaymentMethod.RazorPay.Card.INSTANCE.b);
                List listU = StringsKt.U(cardData.d, new String[]{"/"}, 6);
                linkedHashMap.put("card[cvv]", cardData.b);
                linkedHashMap.put("card[number]", cardData.c);
                linkedHashMap.put("card[name]", cardData.e);
                linkedHashMap.put("card[expiry_month]", CollectionsKt.F(listU));
                linkedHashMap.put("card[expiry_year]", CollectionsKt.P(listU));
            }
            Map mapR = MapsKt.r(linkedHashMap);
            checkoutPaymentDataResolver.z();
            ValidateRazorPayDataUseCase validateRazorPayDataUseCase = checkoutComponent.n;
            checkoutComponent$handleRazorpayFlow$1.L$0 = mapR;
            checkoutComponent$handleRazorpayFlow$1.label = 1;
            Object objA = validateRazorPayDataUseCase.a(mapR, checkoutComponent$handleRazorpayFlow$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = mapR;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) checkoutComponent$handleRazorpayFlow$1.L$0;
            ResultKt.b(obj);
            checkoutPaymentDataResolver = checkoutPaymentDataResolver2;
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        int i3 = 3;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            checkoutComponent.E0(new on(8));
            checkoutComponent.r0(new CheckoutSideEffect.RazorpayFlowInitiated(checkoutPaymentDataResolver.u().f2691a.i, map));
            ICheckoutAnalyticsHelper.DefaultImpls.a(checkoutComponent.q, "checkout screen opened", MapsKt.i(new Pair("checkoutFlowType", "razorpay"), new Pair("isAccountIdAvailable", Boolean.valueOf(map.containsKey("account_id"))), new Pair("paymentProvider", checkoutPaymentDataResolver.u().d.f5657a.name())), 12);
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            checkoutComponent.E0(new on(9));
            KotlinToastManagerKt.a(checkoutComponent.t, (String) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a, ToastLength.LONG);
            checkoutComponent.q0(new yn(checkoutComponent, i3));
        }
        return Unit.f17538a;
    }

    public final void H0(String str) {
        E0(new on(12));
        ICheckoutAnalyticsHelper.DefaultImpls.a(this.q, "checkout screen opened", MapsKt.h(new Pair("checkoutFlowType", "lazypay")), 4);
        r0(new CheckoutSideEffect.LazyPayFlowInitiated(str));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Code duplicated, block: B:79:0x0159  */
    public final void I0(CheckoutViewIntent intent) {
        String c;
        String c2;
        String c3;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitiveA;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitiveA2;
        JsonElement jsonElement3;
        JsonPrimitive jsonPrimitiveA3;
        JsonElement jsonElement4;
        JsonPrimitive jsonPrimitiveA4;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof CheckoutViewIntent.InitiateCheckoutViewIntent;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.l;
        ContextScope contextScope = this.j;
        String c4 = null;
        if (z) {
            CheckoutPaymentMethod checkoutPaymentMethodD = PaymentMethodsApiToAppModelHelperKt.d(((PaymentInfoState) checkoutPaymentDataResolver.P().getValue()).c);
            if (Intrinsics.d(checkoutPaymentMethodD, CheckoutPaymentMethod.RazorPay.Upi.INSTANCE) || Intrinsics.d(checkoutPaymentMethodD, CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE) || Intrinsics.d(checkoutPaymentMethodD, CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE) || Intrinsics.d(checkoutPaymentMethodD, CheckoutPaymentMethod.RazorPay.Card.INSTANCE)) {
                BuildersKt.d(contextScope, null, null, new CheckoutComponent$handleInitiateCheckoutViewIntent$1(this, null), 3);
                BuildersKt.d(contextScope, null, null, new CheckoutComponent$handleInitiateCheckoutViewIntent$2(this, null), 3);
                return;
            } else if (Intrinsics.d(checkoutPaymentMethodD, CheckoutPaymentMethod.RazorPay.Lazypay.INSTANCE)) {
                BuildersKt.d(contextScope, null, null, new CheckoutComponent$handleInitiateCheckoutViewIntent$3(this, null), 3);
                return;
            } else {
                E0(new on(6));
                q0(new yn(this, 1));
                return;
            }
        }
        if (intent instanceof CheckoutViewIntent.LazyPayLoadingCompleted) {
            E0(new on(13));
            return;
        }
        boolean z2 = intent instanceof CheckoutViewIntent.WebViewPageLoaded;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = this.q;
        if (z2) {
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "Razorpay webview loaded", null, 14);
            return;
        }
        if (!(intent instanceof CheckoutViewIntent.PaymentCompletedIntent)) {
            if (!(intent instanceof CheckoutViewIntent.CheckoutBackPressed)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new CheckoutComponent$handleBackPressedIntent$1(this, null), 3);
            return;
        }
        CheckoutViewIntent.PaymentCompletedIntent paymentCompletedIntent = (CheckoutViewIntent.PaymentCompletedIntent) intent;
        String str = paymentCompletedIntent.f1490a;
        checkoutPaymentDataResolver.U(str);
        String message = "Payment completed with intent: " + paymentCompletedIntent;
        Intrinsics.i(message, "message");
        if (paymentCompletedIntent instanceof CheckoutViewIntent.PaymentCompletedIntent.Success) {
            iCheckoutAnalyticsHelper.j(str);
        } else if (paymentCompletedIntent instanceof CheckoutViewIntent.PaymentCompletedIntent.Failed) {
            CheckoutViewIntent.PaymentCompletedIntent.Failed failed = (CheckoutViewIntent.PaymentCompletedIntent.Failed) paymentCompletedIntent;
            int i = failed.b;
            String str2 = failed.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("errorCode", String.valueOf(i));
            try {
                ChaloJson chaloJson = ChaloJson.f6455a;
                JsonElement jsonElement5 = (JsonElement) JsonElementKt.g(ChaloJson.b.f(str2)).get("error");
                JsonObject jsonObjectG = jsonElement5 != null ? JsonElementKt.g(jsonElement5) : null;
                String str3 = "";
                if (jsonObjectG == null || (jsonElement4 = (JsonElement) jsonObjectG.get(InMobiNetworkValues.DESCRIPTION)) == null || (jsonPrimitiveA4 = ChaloJson.a(jsonElement4)) == null) {
                    c = "";
                } else {
                    c = jsonPrimitiveA4 instanceof JsonNull ? null : jsonPrimitiveA4.getC();
                    if (c == null) {
                        c = "";
                    }
                }
                linkedHashMap.put(InMobiNetworkValues.DESCRIPTION, c);
                if (jsonObjectG == null || (jsonElement3 = (JsonElement) jsonObjectG.get("source")) == null || (jsonPrimitiveA3 = ChaloJson.a(jsonElement3)) == null) {
                    c2 = "";
                } else {
                    c2 = jsonPrimitiveA3 instanceof JsonNull ? null : jsonPrimitiveA3.getC();
                    if (c2 == null) {
                        c2 = "";
                    }
                }
                linkedHashMap.put("source", c2);
                if (jsonObjectG == null || (jsonElement2 = (JsonElement) jsonObjectG.get("step")) == null || (jsonPrimitiveA2 = ChaloJson.a(jsonElement2)) == null) {
                    c3 = "";
                } else {
                    c3 = jsonPrimitiveA2 instanceof JsonNull ? null : jsonPrimitiveA2.getC();
                    if (c3 == null) {
                        c3 = "";
                    }
                }
                linkedHashMap.put("step", c3);
                if (jsonObjectG != null && (jsonElement = (JsonElement) jsonObjectG.get("reason")) != null && (jsonPrimitiveA = ChaloJson.a(jsonElement)) != null) {
                    if (!(jsonPrimitiveA instanceof JsonNull)) {
                        c4 = jsonPrimitiveA.getC();
                    }
                    if (c4 != null) {
                        str3 = c4;
                    }
                }
                linkedHashMap.put("reason", str3);
            } catch (Exception unused) {
                linkedHashMap.put("reason", str2);
            }
            iCheckoutAnalyticsHelper.l(linkedHashMap);
        }
        q0(new yn(this, 2));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (CheckoutViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new CheckoutViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new CheckoutViewState();
    }
}
