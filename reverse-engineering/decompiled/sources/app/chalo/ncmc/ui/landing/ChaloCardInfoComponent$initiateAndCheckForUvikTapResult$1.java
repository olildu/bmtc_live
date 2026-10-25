package app.chalo.ncmc.ui.landing;

import app.chalo.ncmc.uvik.UvikResult;
import app.chalo.ncmc.uvik.UvikServiceRequest;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.landing.ChaloCardInfoComponent$initiateAndCheckForUvikTapResult$1", f = "ChaloCardInfoComponent.kt", l = {337}, m = "invokeSuspend", v = 1)
final class ChaloCardInfoComponent$initiateAndCheckForUvikTapResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UvikServiceRequest $request;
    int label;
    final /* synthetic */ ChaloCardInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardInfoComponent$initiateAndCheckForUvikTapResult$1(ChaloCardInfoComponent chaloCardInfoComponent, UvikServiceRequest uvikServiceRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardInfoComponent;
        this.$request = uvikServiceRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardInfoComponent$initiateAndCheckForUvikTapResult$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardInfoComponent$initiateAndCheckForUvikTapResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowB = this.this$0.B.b(this.$request);
            this.label = 1;
            obj = FlowKt.t(flowB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        UvikResult uvikResult = (UvikResult) obj;
        String message = "viewModelScope uvik result collect " + uvikResult;
        Intrinsics.i(message, "message");
        ChaloCardInfoComponent chaloCardInfoComponent = this.this$0;
        BuildersKt.d(chaloCardInfoComponent.j, null, null, new ChaloCardInfoComponent$handleUvikTapResult$1(chaloCardInfoComponent, uvikResult, null), 3);
        return Unit.f17538a;
    }
}
