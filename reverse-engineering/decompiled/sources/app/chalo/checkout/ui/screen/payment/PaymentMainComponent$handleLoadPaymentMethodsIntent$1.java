package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.resolver.InaiCheckoutInstanceResult;
import app.chalo.checkout.domain.CheckoutErrorType;
import app.chalo.checkout.domain.GetPaymentMethodsUseCase;
import app.chalo.checkout.paymentprovider.inai.InaiSdkCheckout;
import app.chalo.models.CheckoutPaymentProvider;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CustomUrlCheckoutArgs;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hq0;
import defpackage.jq0;
import defpackage.mq0;
import defpackage.nq0;
import defpackage.yi0;
import java.util.LinkedHashMap;
import java.util.Locale;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleLoadPaymentMethodsIntent$1", f = "PaymentMainComponent.kt", l = {2623, 2636, 2672, 2687, 2697, 2712, 2713, 2714}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$handleLoadPaymentMethodsIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handleLoadPaymentMethodsIntent$1(PaymentMainComponent paymentMainComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMainComponent$handleLoadPaymentMethodsIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$handleLoadPaymentMethodsIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x013f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0168  */
    /* JADX WARN: Code duplicated, block: B:46:0x0174  */
    /* JADX WARN: Code duplicated, block: B:48:0x019c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x01de  */
    /* JADX WARN: Code duplicated, block: B:64:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0220  */
    /* JADX WARN: Code duplicated, block: B:74:0x0232  */
    /* JADX WARN: Code duplicated, block: B:90:0x0264 A[PHI: r1 r12
      0x0264: PHI (r1v37 app.chalo.utils.ChaloUseCaseResult) = (r1v22 app.chalo.utils.ChaloUseCaseResult), (r1v40 app.chalo.utils.ChaloUseCaseResult) binds: [B:88:0x0261, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r12v74 java.lang.Object) = (r12v39 java.lang.Object), (r12v0 java.lang.Object) binds: [B:88:0x0261, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x027c  */
    /* JADX WARN: Code duplicated, block: B:97:0x029b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        ChaloUseCaseResult chaloUseCaseResult;
        CheckoutErrorType checkoutErrorType;
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        PaymentMainComponent paymentMainComponent;
        InaiCheckoutInstanceResult e;
        KotlinToastManager kotlinToastManager3;
        KotlinToastManager kotlinToastManager4;
        String str;
        Object objB;
        String str2;
        ChaloUseCaseResult chaloUseCaseResult2;
        String str3;
        Object objB2;
        String str4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                ResultKt.b(obj);
                PaymentMainComponent paymentMainComponent2 = this.this$0;
                Job job = paymentMainComponent2.c0;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                paymentMainComponent2.c0 = BuildersKt.d(paymentMainComponent2.j, null, null, new PaymentMainComponent$checkAndRequestNotificationPermissionIfRequired$1(paymentMainComponent2, null), 3);
                OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel = this.this$0.m.getC().d;
                if (orderPaymentProviderInfoAppModel instanceof OrderPaymentProviderInfoAppModel.ProviderPaymentUrl) {
                    PaymentMainComponent paymentMainComponent3 = this.this$0;
                    String str5 = ((OrderPaymentProviderInfoAppModel.ProviderPaymentUrl) orderPaymentProviderInfoAppModel).e;
                    if (!((PaymentDataState) paymentMainComponent3.f.getValue()).g) {
                        paymentMainComponent3.E0(new jq0(16));
                        BuildersKt.d(paymentMainComponent3.j, null, null, new PaymentMainComponent$initPaymentInfoStateCollectionForCustomPaymentUrl$1(paymentMainComponent3, null), 3);
                        paymentMainComponent3.H.b(new ChaloNavigationRequest.Navigate(new CustomUrlCheckoutArgs(str5), null, null, 6));
                        return unit;
                    }
                } else if (this.this$0.m.b0()) {
                    PaymentMainComponent paymentMainComponent4 = this.this$0;
                    this.label = 1;
                    if (PaymentMainComponent.F0(paymentMainComponent4, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (((PaymentDataState) this.this$0.f.getValue()).l.isEmpty()) {
                    this.this$0.E0(new mq0(2));
                    String strB = CityProviderKt.b(this.this$0.v);
                    if (strB != null) {
                        lowerCase = strB.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = "";
                    }
                    PaymentMainComponent paymentMainComponent5 = this.this$0;
                    GetPaymentMethodsUseCase getPaymentMethodsUseCase = paymentMainComponent5.n;
                    String str6 = paymentMainComponent5.m.getC().c;
                    this.label = 2;
                    obj = getPaymentMethodsUseCase.a(str6, lowerCase, this);
                    if (obj != coroutineSingletons) {
                        chaloUseCaseResult = (ChaloUseCaseResult) obj;
                        this.this$0.t.b("Payment methods app model fetched", MapsKt.h(new Pair("appModel", chaloUseCaseResult.toString())));
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.t, "payment methods success response", null, 14);
                            this.this$0.m.j0((PaymentMethodsAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
                            if (this.this$0.m.getC().d.f5657a == CheckoutPaymentProvider.INAI) {
                                e = this.this$0.m.getE();
                                if (e instanceof InaiCheckoutInstanceResult.Success) {
                                    PaymentMainComponent paymentMainComponent6 = this.this$0;
                                    InaiSdkCheckout inaiSdkCheckout = ((InaiCheckoutInstanceResult.Success) e).f1356a;
                                    paymentMainComponent6.getClass();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("action", "getInstalledApps");
                                    linkedHashMap.put("paymentMethodOption", CheckoutPaymentMethod.Inai.Upi.INSTANCE.b);
                                    paymentMainComponent6.r0(new PaymentSideEffect.InaiFetchInstalledUpiAppsSideEffect(inaiSdkCheckout, linkedHashMap));
                                    return unit;
                                }
                                if ((e instanceof InaiCheckoutInstanceResult.Failure) && !(e instanceof InaiCheckoutInstanceResult.NotInitialised)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.this$0.E0(new mq0(3));
                                PaymentMainComponent paymentMainComponent7 = this.this$0;
                                kotlinToastManager3 = paymentMainComponent7.S;
                                this.L$0 = kotlinToastManager3;
                                this.label = 3;
                                obj = paymentMainComponent7.A.b(StringEnum.RETRY_PAYMENT, new Object[0], this);
                                if (obj != coroutineSingletons) {
                                    kotlinToastManager4 = kotlinToastManager3;
                                    hq0.s(kotlinToastManager4, (String) obj);
                                    PaymentMainComponent paymentMainComponent8 = this.this$0;
                                    paymentMainComponent8.q0(new nq0(paymentMainComponent8, 0));
                                    return unit;
                                }
                            } else {
                                paymentMainComponent = this.this$0;
                                this.label = 4;
                                if (PaymentMainComponent.P0(paymentMainComponent, this) != coroutineSingletons) {
                                }
                            }
                        } else {
                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                throw new NoWhenBranchMatchedException();
                            }
                            checkoutErrorType = (CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                            if (Intrinsics.d(checkoutErrorType, CheckoutErrorType.UnknownPaymentProvider.d)) {
                                this.this$0.E0(new mq0(4));
                                PaymentMainComponent paymentMainComponent9 = this.this$0;
                                kotlinToastManager = paymentMainComponent9.S;
                                this.L$0 = kotlinToastManager;
                                this.label = 5;
                                obj = paymentMainComponent9.A.b(StringEnum.RETRY_PAYMENT, new Object[0], this);
                                if (obj != coroutineSingletons) {
                                    kotlinToastManager2 = kotlinToastManager;
                                    hq0.s(kotlinToastManager2, (String) obj);
                                    PaymentMainComponent paymentMainComponent10 = this.this$0;
                                    paymentMainComponent10.q0(new nq0(paymentMainComponent10, 1));
                                    return unit;
                                }
                            } else {
                                if ((checkoutErrorType instanceof CheckoutErrorType.API) && !Intrinsics.d(checkoutErrorType, CheckoutErrorType.ResponseParsing.d) && !(checkoutErrorType instanceof CheckoutErrorType.Unknown) && !(checkoutErrorType instanceof CheckoutErrorType.Local) && !(checkoutErrorType instanceof CheckoutErrorType.InvalidData)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.L$0 = chaloUseCaseResult;
                                this.label = 6;
                                obj = this.this$0.A.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                                if (obj != coroutineSingletons) {
                                    str = (String) obj;
                                    this.L$0 = chaloUseCaseResult;
                                    this.L$1 = str;
                                    this.label = 7;
                                    objB = this.this$0.A.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], this);
                                    if (objB != coroutineSingletons) {
                                        ChaloUseCaseResult chaloUseCaseResult3 = chaloUseCaseResult;
                                        str2 = str;
                                        obj = objB;
                                        chaloUseCaseResult2 = chaloUseCaseResult3;
                                        str3 = (String) obj;
                                        this.L$0 = chaloUseCaseResult2;
                                        this.L$1 = str2;
                                        this.L$2 = str3;
                                        this.label = 8;
                                        objB2 = this.this$0.A.b(StringEnum.TRY_AGAIN, new Object[0], this);
                                        if (objB2 != coroutineSingletons) {
                                            str4 = str3;
                                            obj = objB2;
                                            this.this$0.E0(new yi0(str2, str4, (String) obj, 4));
                                            ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.t, "payment methods failed response", MapsKt.h(new Pair("reason", ((CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a).f1364a)), 12);
                                            return unit;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return unit;
            case 1:
                ResultKt.b(obj);
                return unit;
            case 2:
                ResultKt.b(obj);
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                this.this$0.t.b("Payment methods app model fetched", MapsKt.h(new Pair("appModel", chaloUseCaseResult.toString())));
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.t, "payment methods success response", null, 14);
                    this.this$0.m.j0((PaymentMethodsAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
                    if (this.this$0.m.getC().d.f5657a == CheckoutPaymentProvider.INAI) {
                        e = this.this$0.m.getE();
                        if (e instanceof InaiCheckoutInstanceResult.Success) {
                            PaymentMainComponent paymentMainComponent11 = this.this$0;
                            InaiSdkCheckout inaiSdkCheckout2 = ((InaiCheckoutInstanceResult.Success) e).f1356a;
                            paymentMainComponent11.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("action", "getInstalledApps");
                            linkedHashMap2.put("paymentMethodOption", CheckoutPaymentMethod.Inai.Upi.INSTANCE.b);
                            paymentMainComponent11.r0(new PaymentSideEffect.InaiFetchInstalledUpiAppsSideEffect(inaiSdkCheckout2, linkedHashMap2));
                            return unit;
                        }
                        if (e instanceof InaiCheckoutInstanceResult.Failure) {
                        }
                        this.this$0.E0(new mq0(3));
                        PaymentMainComponent paymentMainComponent12 = this.this$0;
                        kotlinToastManager3 = paymentMainComponent12.S;
                        this.L$0 = kotlinToastManager3;
                        this.label = 3;
                        obj = paymentMainComponent12.A.b(StringEnum.RETRY_PAYMENT, new Object[0], this);
                        if (obj != coroutineSingletons) {
                            kotlinToastManager4 = kotlinToastManager3;
                            hq0.s(kotlinToastManager4, (String) obj);
                            PaymentMainComponent paymentMainComponent13 = this.this$0;
                            paymentMainComponent13.q0(new nq0(paymentMainComponent13, 0));
                            return unit;
                        }
                    } else {
                        paymentMainComponent = this.this$0;
                        this.label = 4;
                        if (PaymentMainComponent.P0(paymentMainComponent, this) != coroutineSingletons) {
                            return unit;
                        }
                    }
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    checkoutErrorType = (CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    if (Intrinsics.d(checkoutErrorType, CheckoutErrorType.UnknownPaymentProvider.d)) {
                        this.this$0.E0(new mq0(4));
                        PaymentMainComponent paymentMainComponent14 = this.this$0;
                        kotlinToastManager = paymentMainComponent14.S;
                        this.L$0 = kotlinToastManager;
                        this.label = 5;
                        obj = paymentMainComponent14.A.b(StringEnum.RETRY_PAYMENT, new Object[0], this);
                        if (obj != coroutineSingletons) {
                            kotlinToastManager2 = kotlinToastManager;
                            hq0.s(kotlinToastManager2, (String) obj);
                            PaymentMainComponent paymentMainComponent15 = this.this$0;
                            paymentMainComponent15.q0(new nq0(paymentMainComponent15, 1));
                            return unit;
                        }
                    } else {
                        if (checkoutErrorType instanceof CheckoutErrorType.API) {
                        }
                        this.L$0 = chaloUseCaseResult;
                        this.label = 6;
                        obj = this.this$0.A.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                        if (obj != coroutineSingletons) {
                            str = (String) obj;
                            this.L$0 = chaloUseCaseResult;
                            this.L$1 = str;
                            this.label = 7;
                            objB = this.this$0.A.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], this);
                            if (objB != coroutineSingletons) {
                                ChaloUseCaseResult chaloUseCaseResult4 = chaloUseCaseResult;
                                str2 = str;
                                obj = objB;
                                chaloUseCaseResult2 = chaloUseCaseResult4;
                                str3 = (String) obj;
                                this.L$0 = chaloUseCaseResult2;
                                this.L$1 = str2;
                                this.L$2 = str3;
                                this.label = 8;
                                objB2 = this.this$0.A.b(StringEnum.TRY_AGAIN, new Object[0], this);
                                if (objB2 != coroutineSingletons) {
                                    str4 = str3;
                                    obj = objB2;
                                    this.this$0.E0(new yi0(str2, str4, (String) obj, 4));
                                    ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.t, "payment methods failed response", MapsKt.h(new Pair("reason", ((CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a).f1364a)), 12);
                                    return unit;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                kotlinToastManager4 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                hq0.s(kotlinToastManager4, (String) obj);
                PaymentMainComponent paymentMainComponent16 = this.this$0;
                paymentMainComponent16.q0(new nq0(paymentMainComponent16, 0));
                return unit;
            case 4:
                ResultKt.b(obj);
                return unit;
            case 5:
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                hq0.s(kotlinToastManager2, (String) obj);
                PaymentMainComponent paymentMainComponent17 = this.this$0;
                paymentMainComponent17.q0(new nq0(paymentMainComponent17, 1));
                return unit;
            case 6:
                chaloUseCaseResult = (ChaloUseCaseResult) this.L$0;
                ResultKt.b(obj);
                str = (String) obj;
                this.L$0 = chaloUseCaseResult;
                this.L$1 = str;
                this.label = 7;
                objB = this.this$0.A.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], this);
                if (objB != coroutineSingletons) {
                    ChaloUseCaseResult chaloUseCaseResult5 = chaloUseCaseResult;
                    str2 = str;
                    obj = objB;
                    chaloUseCaseResult2 = chaloUseCaseResult5;
                    str3 = (String) obj;
                    this.L$0 = chaloUseCaseResult2;
                    this.L$1 = str2;
                    this.L$2 = str3;
                    this.label = 8;
                    objB2 = this.this$0.A.b(StringEnum.TRY_AGAIN, new Object[0], this);
                    if (objB2 != coroutineSingletons) {
                        str4 = str3;
                        obj = objB2;
                        this.this$0.E0(new yi0(str2, str4, (String) obj, 4));
                        ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.t, "payment methods failed response", MapsKt.h(new Pair("reason", ((CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a).f1364a)), 12);
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 7:
                str2 = (String) this.L$1;
                chaloUseCaseResult2 = (ChaloUseCaseResult) this.L$0;
                ResultKt.b(obj);
                str3 = (String) obj;
                this.L$0 = chaloUseCaseResult2;
                this.L$1 = str2;
                this.L$2 = str3;
                this.label = 8;
                objB2 = this.this$0.A.b(StringEnum.TRY_AGAIN, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    str4 = str3;
                    obj = objB2;
                    this.this$0.E0(new yi0(str2, str4, (String) obj, 4));
                    ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.t, "payment methods failed response", MapsKt.h(new Pair("reason", ((CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a).f1364a)), 12);
                    return unit;
                }
                return coroutineSingletons;
            case 8:
                str4 = (String) this.L$2;
                str2 = (String) this.L$1;
                chaloUseCaseResult2 = (ChaloUseCaseResult) this.L$0;
                ResultKt.b(obj);
                this.this$0.E0(new yi0(str2, str4, (String) obj, 4));
                ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.t, "payment methods failed response", MapsKt.h(new Pair("reason", ((CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a).f1364a)), 12);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
