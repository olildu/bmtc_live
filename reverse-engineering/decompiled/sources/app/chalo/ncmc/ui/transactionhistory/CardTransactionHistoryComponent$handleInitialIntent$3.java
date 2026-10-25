package app.chalo.ncmc.ui.transactionhistory;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.ncmc.data.appmodel.ChaloCardUnsyncedRechargeDetails;
import app.chalo.ncmc.domain.CardUnsyncedRechargesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent$handleInitialIntent$3", f = "CardTransactionHistoryComponent.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
final class CardTransactionHistoryComponent$handleInitialIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CardTransactionHistoryIntent.InitialIntent $intent;
    int label;
    final /* synthetic */ CardTransactionHistoryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTransactionHistoryComponent$handleInitialIntent$3(CardTransactionHistoryComponent cardTransactionHistoryComponent, CardTransactionHistoryIntent.InitialIntent initialIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardTransactionHistoryComponent;
        this.$intent = initialIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardTransactionHistoryComponent$handleInitialIntent$3(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardTransactionHistoryComponent$handleInitialIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        final CardTransactionHistoryComponent cardTransactionHistoryComponent = this.this$0;
        final String cardNumber = this.$intent.f6431a;
        this.label = 1;
        CardUnsyncedRechargesHelper cardUnsyncedRechargesHelper = cardTransactionHistoryComponent.t;
        cardUnsyncedRechargesHelper.getClass();
        Intrinsics.i(cardNumber, "cardNumber");
        final MutableStateFlow mutableStateFlow = cardUnsyncedRechargesHelper.f6213a;
        Object objCollect = FlowKt.m(new Flow<ChaloCardUnsyncedRechargeDetails>() { // from class: app.chalo.ncmc.domain.CardUnsyncedRechargesHelper$getUnsyncedRechargeDetails$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.ncmc.domain.CardUnsyncedRechargesHelper$getUnsyncedRechargeDetails$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6215a;
                public final /* synthetic */ String b;

                /* JADX INFO: renamed from: app.chalo.ncmc.domain.CardUnsyncedRechargesHelper$getUnsyncedRechargeDetails$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.ncmc.domain.CardUnsyncedRechargesHelper$getUnsyncedRechargeDetails$$inlined$map$1$2", f = "CardUnsyncedRechargesHelper.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.f6215a = flowCollector;
                    this.b = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        Object obj3 = ((Map) obj).get(this.b);
                        anonymousClass1.label = 1;
                        if (this.f6215a.emit(obj3, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect2 = mutableStateFlow.collect(new AnonymousClass2(flowCollector, cardNumber), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : Unit.f17538a;
            }
        }).collect(new FlowCollector() { // from class: app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent$checkUnsyncedRecharges$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                Object objH0;
                ChaloCardUnsyncedRechargeDetails chaloCardUnsyncedRechargeDetails = (ChaloCardUnsyncedRechargeDetails) obj2;
                return (chaloCardUnsyncedRechargeDetails == null || (objH0 = CardTransactionHistoryComponent.H0(cardTransactionHistoryComponent, chaloCardUnsyncedRechargeDetails, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? Unit.f17538a : objH0;
            }
        }, this);
        if (objCollect != coroutineSingletons) {
            objCollect = unit;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : unit;
    }
}
