package app.chalo.instantticket.ui.faredetails.compose;

import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsSideEffect;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.compose.SetupInstantTicketFareDetailsSideEffectKt$SetupInstantTicketFareDetailsSideEffect$1$1", f = "SetupInstantTicketFareDetailsSideEffect.kt", l = {16}, m = "invokeSuspend", v = 1)
final class SetupInstantTicketFareDetailsSideEffectKt$SetupInstantTicketFareDetailsSideEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FareDetailsComponent $viewModel;
    int label;

    /* JADX INFO: renamed from: app.chalo.instantticket.ui.faredetails.compose.SetupInstantTicketFareDetailsSideEffectKt$SetupInstantTicketFareDetailsSideEffect$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f3916a = new AnonymousClass1();

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            FareDetailsSideEffect fareDetailsSideEffect = (FareDetailsSideEffect) obj;
            if (Intrinsics.d(fareDetailsSideEffect, FareDetailsSideEffect.ShowBottomSheet.f3949a) || Intrinsics.d(fareDetailsSideEffect, FareDetailsSideEffect.HideBottomSheet.f3948a)) {
                return Unit.f17538a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupInstantTicketFareDetailsSideEffectKt$SetupInstantTicketFareDetailsSideEffect$1$1(FareDetailsComponent fareDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.$viewModel = fareDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SetupInstantTicketFareDetailsSideEffectKt$SetupInstantTicketFareDetailsSideEffect$1$1(this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SetupInstantTicketFareDetailsSideEffectKt$SetupInstantTicketFareDetailsSideEffect$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$viewModel.s0();
            this.label = 1;
            if (flowS0.collect(AnonymousClass1.f3916a, this) == coroutineSingletons) {
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
