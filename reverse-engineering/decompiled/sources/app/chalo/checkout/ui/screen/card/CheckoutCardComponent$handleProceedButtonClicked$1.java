package app.chalo.checkout.ui.screen.card;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.domain.CardFieldType;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.on;
import defpackage.tn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.card.CheckoutCardComponent$handleProceedButtonClicked$1", f = "CheckoutCardComponent.kt", l = {109}, m = "invokeSuspend", v = 1)
final class CheckoutCardComponent$handleProceedButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectedPaymentInstrumentData.CardData $cardData;
    int label;
    final /* synthetic */ CheckoutCardComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCardComponent$handleProceedButtonClicked$1(CheckoutCardComponent checkoutCardComponent, SelectedPaymentInstrumentData.CardData cardData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = checkoutCardComponent;
        this.$cardData = cardData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutCardComponent$handleProceedButtonClicked$1(this.this$0, this.$cardData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutCardComponent$handleProceedButtonClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowA = this.this$0.l.a(this.$cardData);
            final CheckoutCardComponent checkoutCardComponent = this.this$0;
            final SelectedPaymentInstrumentData.CardData cardData = this.$cardData;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.checkout.ui.screen.card.CheckoutCardComponent$handleProceedButtonClicked$1.1

                /* JADX INFO: renamed from: app.chalo.checkout.ui.screen.card.CheckoutCardComponent$handleProceedButtonClicked$1$1$WhenMappings */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final /* synthetic */ class WhenMappings {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f1438a;

                    static {
                        int[] iArr = new int[CardFieldType.values().length];
                        try {
                            iArr[CardFieldType.CARD_NUMBER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CardFieldType.CARD_EXPIRY_DATE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CardFieldType.NEW_CARD_CVV.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[CardFieldType.CARD_NAME.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        f1438a = iArr;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj2;
                    boolean z = chaloUseCaseResult instanceof ChaloUseCaseResult.Success;
                    CheckoutCardComponent checkoutCardComponent2 = checkoutCardComponent;
                    if (z) {
                        checkoutCardComponent2.k.t(cardData);
                        checkoutCardComponent2.q0(new tn(checkoutCardComponent2, 4));
                        ICheckoutAnalyticsHelper.DefaultImpls.a(checkoutCardComponent2.n, "card details submitted", null, 14);
                    } else {
                        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i2 = WhenMappings.f1438a[((CardFieldType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
                        if (i2 == 1) {
                            checkoutCardComponent2.E0(new on(2));
                        } else if (i2 == 2) {
                            checkoutCardComponent2.E0(new on(3));
                        } else if (i2 == 3) {
                            checkoutCardComponent2.E0(new on(4));
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            checkoutCardComponent2.E0(new on(5));
                        }
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (((AbstractFlow) flowA).collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
