package app.chalo.wallet.ui.mainbalance;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import defpackage.ge0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1", f = "WalletBalanceMainScreen.kt", l = {56}, m = "invokeSuspend", v = 1)
final class WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletBalanceComponent $component;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1(PagerState pagerState, WalletBalanceComponent walletBalanceComponent, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$component = walletBalanceComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1(this.$pagerState, this.$component, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1$invokeSuspend$$inlined$filter$1 walletBalanceMainScreenKt$WalletBalanceMainScreen$3$1$invokeSuspend$$inlined$filter$1 = new WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1$invokeSuspend$$inlined$filter$1(SnapshotStateKt.snapshotFlow(new ge0(this.$pagerState, 7)));
            Flow flowM = FlowKt.m(new Flow<Integer>() { // from class: app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f10877a;

                    /* JADX INFO: renamed from: app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1$invokeSuspend$$inlined$map$1$2", f = "WalletBalanceMainScreen.kt", l = {50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f10877a = flowCollector;
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
                            Integer num = new Integer(((Number) ((Pair) obj).getFirst()).intValue());
                            anonymousClass1.label = 1;
                            if (this.f10877a.emit(num, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = walletBalanceMainScreenKt$WalletBalanceMainScreen$3$1$invokeSuspend$$inlined$filter$1.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            });
            final WalletBalanceComponent walletBalanceComponent = this.$component;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1.4
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    walletBalanceComponent.N0(new WalletBalanceIntent.ScrollPromotionBanner(((Number) obj2).intValue()));
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowM.collect(flowCollector, this) == coroutineSingletons) {
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
