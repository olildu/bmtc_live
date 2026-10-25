package app.chalo.ridehailing.feedback;

import app.chalo.ridefeedback.data.app.RideFeedbackRequestAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate$queueAndSubmitFeedback$2", f = "DefaultRideFeedbackDelegate.kt", l = {247}, m = "invokeSuspend", v = 1)
final class DefaultRideFeedbackDelegate$queueAndSubmitFeedback$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RideFeedbackRequestAppModel $request;
    int label;
    final /* synthetic */ DefaultRideFeedbackDelegate this$0;

    /* JADX INFO: renamed from: app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate$queueAndSubmitFeedback$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate$queueAndSubmitFeedback$2$1", f = "DefaultRideFeedbackDelegate.kt", l = {247}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RideFeedbackRequestAppModel $request;
        int label;
        final /* synthetic */ DefaultRideFeedbackDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultRideFeedbackDelegate defaultRideFeedbackDelegate, RideFeedbackRequestAppModel rideFeedbackRequestAppModel, Continuation continuation) {
            super(2, continuation);
            this.this$0 = defaultRideFeedbackDelegate;
            this.$request = rideFeedbackRequestAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                DefaultRideFeedbackDelegate defaultRideFeedbackDelegate = this.this$0;
                RideFeedbackRequestAppModel rideFeedbackRequestAppModel = this.$request;
                this.label = 1;
                if (defaultRideFeedbackDelegate.m.c(rideFeedbackRequestAppModel.f9069a, rideFeedbackRequestAppModel.b, rideFeedbackRequestAppModel.c, new DefaultRideFeedbackDelegate$submitQueuedFeedbackBestEffort$2(defaultRideFeedbackDelegate, rideFeedbackRequestAppModel, null), this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRideFeedbackDelegate$queueAndSubmitFeedback$2(DefaultRideFeedbackDelegate defaultRideFeedbackDelegate, RideFeedbackRequestAppModel rideFeedbackRequestAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultRideFeedbackDelegate;
        this.$request = rideFeedbackRequestAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultRideFeedbackDelegate$queueAndSubmitFeedback$2(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultRideFeedbackDelegate$queueAndSubmitFeedback$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            NonCancellable nonCancellable = NonCancellable.f17739a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, null);
            this.label = 1;
            if (BuildersKt.g(nonCancellable, anonymousClass1, this) == coroutineSingletons) {
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
