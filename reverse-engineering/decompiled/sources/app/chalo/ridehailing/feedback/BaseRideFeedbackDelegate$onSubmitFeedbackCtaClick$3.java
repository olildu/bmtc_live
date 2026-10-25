package app.chalo.ridehailing.feedback;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate$onSubmitFeedbackCtaClick$3", f = "BaseRideFeedbackDelegate.kt", l = {EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, 78}, m = "invokeSuspend", v = 1)
final class BaseRideFeedbackDelegate$onSubmitFeedbackCtaClick$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    Object L$0;
    int label;
    final /* synthetic */ BaseRideFeedbackDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRideFeedbackDelegate$onSubmitFeedbackCtaClick$3(BaseRideFeedbackDelegate baseRideFeedbackDelegate, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.this$0 = baseRideFeedbackDelegate;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseRideFeedbackDelegate$onSubmitFeedbackCtaClick$3(this.this$0, this.$coroutineScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseRideFeedbackDelegate$onSubmitFeedbackCtaClick$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r10.j(r1, r4, r9) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L27
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r9.L$0
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L14
            goto L73
        L14:
            r0 = move-exception
            r10 = r0
            goto L98
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            kotlin.ResultKt.b(r10)     // Catch: java.util.concurrent.CancellationException -> L24 java.lang.Throwable -> L5c
            goto L3f
        L24:
            r0 = move-exception
            r10 = r0
            goto L97
        L27:
            kotlin.ResultKt.b(r10)
            app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate r10 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L24 java.lang.Throwable -> L5c
            kotlinx.coroutines.flow.StateFlow r1 = r10.g     // Catch: java.util.concurrent.CancellationException -> L24 java.lang.Throwable -> L5c
            java.lang.Object r1 = r1.getValue()     // Catch: java.util.concurrent.CancellationException -> L24 java.lang.Throwable -> L5c
            app.chalo.ridehailing.feedback.RideFeedbackDataState r1 = (app.chalo.ridehailing.feedback.RideFeedbackDataState) r1     // Catch: java.util.concurrent.CancellationException -> L24 java.lang.Throwable -> L5c
            kotlinx.coroutines.CoroutineScope r4 = r9.$coroutineScope     // Catch: java.util.concurrent.CancellationException -> L24 java.lang.Throwable -> L5c
            r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L24 java.lang.Throwable -> L5c
            java.lang.Object r10 = r10.j(r1, r4, r9)     // Catch: java.util.concurrent.CancellationException -> L24 java.lang.Throwable -> L5c
            if (r10 != r0) goto L3f
            goto L71
        L3f:
            app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate r10 = r9.this$0
            kotlinx.coroutines.flow.MutableStateFlow r10 = r10.f
        L43:
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            app.chalo.ridehailing.feedback.RideFeedbackDataState r1 = (app.chalo.ridehailing.feedback.RideFeedbackDataState) r1
            r6 = 0
            r7 = 55
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            app.chalo.ridehailing.feedback.RideFeedbackDataState r1 = app.chalo.ridehailing.feedback.RideFeedbackDataState.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r10.c(r0, r1)
            if (r0 == 0) goto L43
            goto L94
        L5c:
            app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate r10 = r9.this$0     // Catch: java.lang.Throwable -> L14
            app.chalo.providers.toast.KotlinToastManager r1 = r10.b     // Catch: java.lang.Throwable -> L14
            app.chalo.providers.stringprovider.StringProvider r10 = r10.f9129a     // Catch: java.lang.Throwable -> L14
            app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG     // Catch: java.lang.Throwable -> L14
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L14
            r9.L$0 = r1     // Catch: java.lang.Throwable -> L14
            r9.label = r3     // Catch: java.lang.Throwable -> L14
            java.lang.Object r10 = r10.b(r2, r4, r9)     // Catch: java.lang.Throwable -> L14
            if (r10 != r0) goto L72
        L71:
            return r0
        L72:
            r0 = r1
        L73:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L14
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r10)     // Catch: java.lang.Throwable -> L14
            app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate r10 = r9.this$0
            kotlinx.coroutines.flow.MutableStateFlow r10 = r10.f
        L7c:
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            app.chalo.ridehailing.feedback.RideFeedbackDataState r1 = (app.chalo.ridehailing.feedback.RideFeedbackDataState) r1
            r6 = 0
            r7 = 55
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            app.chalo.ridehailing.feedback.RideFeedbackDataState r1 = app.chalo.ridehailing.feedback.RideFeedbackDataState.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r10.c(r0, r1)
            if (r0 == 0) goto L7c
        L94:
            kotlin.Unit r10 = kotlin.Unit.f17538a
            return r10
        L97:
            throw r10     // Catch: java.lang.Throwable -> L14
        L98:
            app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate r0 = r9.this$0
            kotlinx.coroutines.flow.MutableStateFlow r0 = r0.f
        L9c:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            app.chalo.ridehailing.feedback.RideFeedbackDataState r2 = (app.chalo.ridehailing.feedback.RideFeedbackDataState) r2
            r7 = 0
            r8 = 55
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            app.chalo.ridehailing.feedback.RideFeedbackDataState r2 = app.chalo.ridehailing.feedback.RideFeedbackDataState.a(r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = r0.c(r1, r2)
            if (r1 != 0) goto Lb5
            goto L9c
        Lb5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate$onSubmitFeedbackCtaClick$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
