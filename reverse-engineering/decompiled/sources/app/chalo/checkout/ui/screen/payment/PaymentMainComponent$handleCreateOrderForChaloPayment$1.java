package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.ChaloPayOrderResponseAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModelKt;
import app.chalo.checkout.data.model.app.ProviderDetailsAppModel;
import app.chalo.checkout.domain.CreateOrderForChaloPaymentUseCase;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.models.CheckoutPaymentProvider;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import defpackage.hj0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleCreateOrderForChaloPayment$1", f = "PaymentMainComponent.kt", l = {2834, 2835}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$handleCreateOrderForChaloPayment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX INFO: renamed from: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleCreateOrderForChaloPayment$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleCreateOrderForChaloPayment$1$1", f = "PaymentMainComponent.kt", l = {2836, 2857, 2868, 2881}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$launch;
        final /* synthetic */ String $bottomsheetCTA;
        Object L$0;
        int label;
        final /* synthetic */ PaymentMainComponent this$0;

        /* JADX INFO: renamed from: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleCreateOrderForChaloPayment$1$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1534a;

            static {
                int[] iArr = new int[WalletType.values().length];
                try {
                    iArr[WalletType.SEMI_CLOSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WalletType.CLOSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f1534a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PaymentMainComponent paymentMainComponent, CoroutineScope coroutineScope, String str, Continuation continuation) {
            super(1, continuation);
            this.this$0 = paymentMainComponent;
            this.$$this$launch = coroutineScope;
            this.$bottomsheetCTA = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$$this$launch, this.$bottomsheetCTA, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:56:0x0105  */
        /* JADX WARN: Code duplicated, block: B:60:0x0114  */
        /* JADX WARN: Code duplicated, block: B:63:0x0126 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:64:0x0127 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:65:0x0128  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WalletTypeIdentifier walletTypeIdentifier;
            int id;
            ProviderDetailsAppModel c;
            ProviderDetailsAppModel c2;
            ChaloUseCaseResult chaloUseCaseResult;
            UseCaseOperationError useCaseOperationError;
            String str;
            PaymentMainComponent paymentMainComponent;
            PaymentMainComponent paymentMainComponent2;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i == 0) {
                ResultKt.b(obj);
                PaymentMainComponent paymentMainComponent3 = this.this$0;
                this.label = 1;
                obj = paymentMainComponent3.X.b(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.b(obj);
                        return unit;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                walletTypeIdentifier = (WalletTypeIdentifier) this.L$0;
                ResultKt.b(obj);
            }
            chaloUseCaseResult = (ChaloUseCaseResult) obj;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                this.this$0.t.h("chaloPayOrderCreationSuccess", null, walletTypeIdentifier.f10959a == WalletType.CLOSED);
                paymentMainComponent2 = this.this$0;
                str2 = ((ChaloPayOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b;
                this.L$0 = null;
                this.label = 3;
                if (PaymentMainComponent.N0(paymentMainComponent2, str2, walletTypeIdentifier, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = this.this$0.t;
            useCaseOperationError = (UseCaseOperationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            str = useCaseOperationError.c;
            if (str == null) {
                str = "";
            }
            iCheckoutAnalyticsHelper.h("chaloPayOrderCreationFailed", vo1.s("failureReason", str), walletTypeIdentifier.f10959a == WalletType.CLOSED);
            paymentMainComponent = this.this$0;
            this.L$0 = null;
            this.label = 4;
            if (PaymentMainComponent.J0(paymentMainComponent, useCaseOperationError, this) != coroutineSingletons) {
                return coroutineSingletons;
            }
            return unit;
            walletTypeIdentifier = (WalletTypeIdentifier) obj;
            if (walletTypeIdentifier == null) {
                this.this$0.l1();
                return unit;
            }
            int i2 = WhenMappings.f1534a[walletTypeIdentifier.f10959a.ordinal()];
            if (i2 == 1) {
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModelA = PaymentMethodsAppModelKt.a(this.this$0.m.H());
                id = (paymentMethodOptionsAppModelA == null || (c = paymentMethodOptionsAppModelA.getC()) == null) ? CheckoutPaymentProvider.CHALOPAY.getId() : c.f1326a;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModelB = PaymentMethodsAppModelKt.b(this.this$0.m.H());
                id = (paymentMethodOptionsAppModelB == null || (c2 = paymentMethodOptionsAppModelB.getC()) == null) ? CheckoutPaymentProvider.CLDW.getId() : c2.f1326a;
            }
            this.this$0.E0(new hj0(this.$bottomsheetCTA, 20));
            CheckoutPaymentData c3 = this.this$0.m.getC();
            CreateOrderForChaloPaymentUseCase createOrderForChaloPaymentUseCase = this.this$0.B;
            String str3 = c3.f2691a.b;
            this.L$0 = walletTypeIdentifier;
            this.label = 2;
            obj = createOrderForChaloPaymentUseCase.b(id, str3, walletTypeIdentifier, this);
            if (obj != coroutineSingletons) {
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    this.this$0.t.h("chaloPayOrderCreationSuccess", null, walletTypeIdentifier.f10959a == WalletType.CLOSED);
                    paymentMainComponent2 = this.this$0;
                    str2 = ((ChaloPayOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b;
                    this.L$0 = null;
                    this.label = 3;
                    if (PaymentMainComponent.N0(paymentMainComponent2, str2, walletTypeIdentifier, this) != coroutineSingletons) {
                        return unit;
                    }
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper2 = this.this$0.t;
                    useCaseOperationError = (UseCaseOperationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    str = useCaseOperationError.c;
                    if (str == null) {
                        str = "";
                    }
                    iCheckoutAnalyticsHelper2.h("chaloPayOrderCreationFailed", vo1.s("failureReason", str), walletTypeIdentifier.f10959a == WalletType.CLOSED);
                    paymentMainComponent = this.this$0;
                    this.L$0 = null;
                    this.label = 4;
                    if (PaymentMainComponent.J0(paymentMainComponent, useCaseOperationError, this) != coroutineSingletons) {
                        return unit;
                    }
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handleCreateOrderForChaloPayment$1(PaymentMainComponent paymentMainComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMainComponent$handleCreateOrderForChaloPayment$1 paymentMainComponent$handleCreateOrderForChaloPayment$1 = new PaymentMainComponent$handleCreateOrderForChaloPayment$1(this.this$0, continuation);
        paymentMainComponent$handleCreateOrderForChaloPayment$1.L$0 = obj;
        return paymentMainComponent$handleCreateOrderForChaloPayment$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$handleCreateOrderForChaloPayment$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (app.chalo.checkout.ui.screen.payment.PaymentMainComponent.G0(r3, r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L51
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r7)
            goto L3c
        L20:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent r7 = r6.this$0
            app.chalo.providers.stringprovider.StringProvider r7 = r7.A
            app.chalo.providers.stringprovider.StringEnum r4 = app.chalo.providers.stringprovider.StringEnum.PLEASE_WAIT
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.b(r4, r5, r6)
            if (r7 != r0) goto L3c
            goto L50
        L3c:
            java.lang.String r7 = (java.lang.String) r7
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent r3 = r6.this$0
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleCreateOrderForChaloPayment$1$1 r4 = new app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleCreateOrderForChaloPayment$1$1
            r5 = 0
            r4.<init>(r3, r1, r7, r5)
            r6.L$0 = r5
            r6.label = r2
            java.lang.Object r7 = app.chalo.checkout.ui.screen.payment.PaymentMainComponent.G0(r3, r4, r6)
            if (r7 != r0) goto L51
        L50:
            return r0
        L51:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleCreateOrderForChaloPayment$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
