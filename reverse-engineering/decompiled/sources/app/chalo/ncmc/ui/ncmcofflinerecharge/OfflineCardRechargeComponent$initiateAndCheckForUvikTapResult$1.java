package app.chalo.ncmc.ui.ncmcofflinerecharge;

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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1", f = "OfflineCardRechargeComponent.kt", l = {554}, m = "invokeSuspend", v = 1)
final class OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UvikServiceRequest $request;
    int label;
    final /* synthetic */ OfflineCardRechargeComponent this$0;

    /* JADX INFO: renamed from: app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OfflineCardRechargeComponent f6386a;
        public final /* synthetic */ UvikServiceRequest b;

        public AnonymousClass1(OfflineCardRechargeComponent offlineCardRechargeComponent, UvikServiceRequest uvikServiceRequest) {
            this.f6386a = offlineCardRechargeComponent;
            this.b = uvikServiceRequest;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Continuation continuation) {
            OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1 offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1;
            if (continuation instanceof OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1) {
                offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1 = (OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1) continuation;
                int i = offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1 = new OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1(this, continuation);
                }
            } else {
                offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1 = new OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1(this, continuation);
            }
            Object objT = offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1.label;
            OfflineCardRechargeComponent offlineCardRechargeComponent = this.f6386a;
            if (i2 == 0) {
                ResultKt.b(objT);
                Flow flowB = offlineCardRechargeComponent.u.b(this.b);
                offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1.label = 1;
                objT = FlowKt.t(flowB, offlineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1);
                if (objT == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objT);
            }
            UvikResult uvikResult = (UvikResult) objT;
            String message = "viewModelScope uvik result collect " + uvikResult;
            Intrinsics.i(message, "message");
            BuildersKt.d(offlineCardRechargeComponent.j, null, null, new OfflineCardRechargeComponent$handleUvikTapResult$1(offlineCardRechargeComponent, uvikResult, null), 3);
            return Unit.f17538a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return a(continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1(OfflineCardRechargeComponent offlineCardRechargeComponent, UvikServiceRequest uvikServiceRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offlineCardRechargeComponent;
        this.$request = uvikServiceRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowB = this.this$0.u.b(this.$request);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request);
            this.label = 1;
            if (flowB.collect(anonymousClass1, this) == coroutineSingletons) {
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
