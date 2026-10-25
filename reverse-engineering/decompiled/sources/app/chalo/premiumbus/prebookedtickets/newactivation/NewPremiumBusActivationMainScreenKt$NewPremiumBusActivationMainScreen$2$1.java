package app.chalo.premiumbus.prebookedtickets.newactivation;

import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationEffect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1", f = "NewPremiumBusActivationMainScreen.kt", l = {54}, m = "invokeSuspend", v = 1)
final class NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NewPremiumBusReserveTicketActivationComponent $component;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ BottomDrawerState $secondaryBottomDrawerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1(NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent, BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.$component = newPremiumBusReserveTicketActivationComponent;
        this.$secondaryBottomDrawerState = bottomDrawerState;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1(this.$component, this.$secondaryBottomDrawerState, this.$coroutineScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final BottomDrawerState bottomDrawerState = this.$secondaryBottomDrawerState;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1.1

                /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1$1$1", f = "NewPremiumBusActivationMainScreen.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invokeSuspend", v = 1)
                final class C01341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ BottomDrawerState $secondaryBottomDrawerState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01341(BottomDrawerState bottomDrawerState, Continuation continuation) {
                        super(2, continuation);
                        this.$secondaryBottomDrawerState = bottomDrawerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01341(this.$secondaryBottomDrawerState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01341) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.b(obj);
                            BottomDrawerState bottomDrawerState = this.$secondaryBottomDrawerState;
                            this.label = 1;
                            if (bottomDrawerState.j(this) == coroutineSingletons) {
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

                /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1$1$2", f = "NewPremiumBusActivationMainScreen.kt", l = {67}, m = "invokeSuspend", v = 1)
                final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ BottomDrawerState $secondaryBottomDrawerState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(BottomDrawerState bottomDrawerState, Continuation continuation) {
                        super(2, continuation);
                        this.$secondaryBottomDrawerState = bottomDrawerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass2(this.$secondaryBottomDrawerState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.b(obj);
                            BottomDrawerState bottomDrawerState = this.$secondaryBottomDrawerState;
                            this.label = 1;
                            if (bottomDrawerState.i(this) == coroutineSingletons) {
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

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    NewPremiumBusReserveTicketActivationEffect newPremiumBusReserveTicketActivationEffect = (NewPremiumBusReserveTicketActivationEffect) obj2;
                    boolean zD = Intrinsics.d(newPremiumBusReserveTicketActivationEffect, NewPremiumBusReserveTicketActivationEffect.ShowBottomSheet.f7366a);
                    CoroutineScope coroutineScope2 = coroutineScope;
                    BottomDrawerState bottomDrawerState2 = bottomDrawerState;
                    if (zD) {
                        if (bottomDrawerState2.c.getValue() == BottomDrawerValue.Closed) {
                            BuildersKt.d(coroutineScope2, null, null, new C01341(bottomDrawerState2, null), 3);
                        }
                    } else {
                        if (!Intrinsics.d(newPremiumBusReserveTicketActivationEffect, NewPremiumBusReserveTicketActivationEffect.HideBottomSheet.f7365a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (bottomDrawerState2.c.getValue() != BottomDrawerValue.Closed) {
                            BuildersKt.d(coroutineScope2, null, null, new AnonymousClass2(bottomDrawerState2, null), 3);
                        }
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
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
