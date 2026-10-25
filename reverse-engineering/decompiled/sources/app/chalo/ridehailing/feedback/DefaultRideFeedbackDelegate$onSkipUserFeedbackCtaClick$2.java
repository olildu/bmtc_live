package app.chalo.ridehailing.feedback;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate$onSkipUserFeedbackCtaClick$2", f = "DefaultRideFeedbackDelegate.kt", l = {95, 102}, m = "invokeSuspend", v = 1)
final class DefaultRideFeedbackDelegate$onSkipUserFeedbackCtaClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    int label;
    final /* synthetic */ DefaultRideFeedbackDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRideFeedbackDelegate$onSkipUserFeedbackCtaClick$2(DefaultRideFeedbackDelegate defaultRideFeedbackDelegate, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultRideFeedbackDelegate;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultRideFeedbackDelegate$onSkipUserFeedbackCtaClick$2(this.this$0, this.$coroutineScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultRideFeedbackDelegate$onSkipUserFeedbackCtaClick$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate.l(r1, r11, r6, r5, r10) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r2 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r11)
            goto L57
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            kotlin.ResultKt.b(r11)     // Catch: java.util.concurrent.CancellationException -> L1e java.lang.Throwable -> L4d
            goto L4d
        L1e:
            r0 = move-exception
            r11 = r0
            goto L4c
        L21:
            kotlin.ResultKt.b(r11)
            app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate r11 = r10.this$0
            kotlinx.coroutines.flow.StateFlow r11 = r11.g
            java.lang.Object r11 = r11.getValue()
            app.chalo.ridehailing.feedback.RideFeedbackDataState r11 = (app.chalo.ridehailing.feedback.RideFeedbackDataState) r11
            app.chalo.ridehailing.feedback.BookingContext r1 = r11.f9141a
            boolean r5 = r1 instanceof app.chalo.ridehailing.feedback.BookingContext.Default
            r6 = 0
            if (r5 == 0) goto L38
            app.chalo.ridehailing.feedback.BookingContext$Default r1 = (app.chalo.ridehailing.feedback.BookingContext.Default) r1
            goto L39
        L38:
            r1 = r6
        L39:
            if (r1 == 0) goto L3d
            app.chalo.ridefeedback.data.app.RideFeedbackBookingData r6 = r1.f9131a
        L3d:
            if (r6 == 0) goto L4d
            app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate r1 = r10.this$0     // Catch: java.util.concurrent.CancellationException -> L1e java.lang.Throwable -> L4d
            kotlinx.coroutines.CoroutineScope r5 = r10.$coroutineScope     // Catch: java.util.concurrent.CancellationException -> L1e java.lang.Throwable -> L4d
            r10.label = r4     // Catch: java.util.concurrent.CancellationException -> L1e java.lang.Throwable -> L4d
            java.lang.Object r11 = app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate.l(r1, r11, r6, r5, r10)     // Catch: java.util.concurrent.CancellationException -> L1e java.lang.Throwable -> L4d
            if (r11 != r0) goto L4d
            goto L56
        L4c:
            throw r11
        L4d:
            app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate r11 = r10.this$0
            r10.label = r3
            r11.e()
            if (r2 != r0) goto L57
        L56:
            return r0
        L57:
            app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate r11 = r10.this$0
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.f
        L5b:
            java.lang.Object r0 = r11.getValue()
            r3 = r0
            app.chalo.ridehailing.feedback.RideFeedbackDataState r3 = (app.chalo.ridehailing.feedback.RideFeedbackDataState) r3
            r8 = 0
            r9 = 55
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            app.chalo.ridehailing.feedback.RideFeedbackDataState r1 = app.chalo.ridehailing.feedback.RideFeedbackDataState.a(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r11.c(r0, r1)
            if (r0 == 0) goto L5b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate$onSkipUserFeedbackCtaClick$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
