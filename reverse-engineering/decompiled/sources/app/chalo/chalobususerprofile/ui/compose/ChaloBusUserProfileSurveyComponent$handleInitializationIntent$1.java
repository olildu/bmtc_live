package app.chalo.chalobususerprofile.ui.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$handleInitializationIntent$1", f = "ChaloBusUserProfileSurveyComponent.kt", l = {247, 248}, m = "invokeSuspend", v = 1)
final class ChaloBusUserProfileSurveyComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloBusUserProfileSurveyComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusUserProfileSurveyComponent$handleInitializationIntent$1(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusUserProfileSurveyComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusUserProfileSurveyComponent$handleInitializationIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusUserProfileSurveyComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent.F0(r1, r5, r4) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r5)     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            goto L60
        L10:
            r5 = move-exception
            goto L63
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.ResultKt.b(r5)     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            goto L2e
        L1e:
            kotlin.ResultKt.b(r5)
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r5 = r4.this$0     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            app.chalo.chalobususerprofile.domain.GetPremiumBusUserSurveyPreferenceUseCase r5 = r5.l     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            r4.label = r3     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            java.lang.Object r5 = r5.a(r4)     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            if (r5 != r0) goto L2e
            goto L44
        L2e:
            app.chalo.utils.ChaloUseCaseResult r5 = (app.chalo.utils.ChaloUseCaseResult) r5     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            boolean r1 = r5 instanceof app.chalo.utils.ChaloUseCaseResult.Failure     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            if (r1 == 0) goto L45
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r1 = r4.this$0     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            app.chalo.utils.ChaloUseCaseResult$Failure r5 = (app.chalo.utils.ChaloUseCaseResult.Failure) r5     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            java.lang.Object r5 = r5.f10418a     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            app.chalo.chalobususerprofile.domain.GetPremiumBusUserSurveyPreferenceUseCase$GetPremiumBusUserSurveyPreferenceError r5 = (app.chalo.chalobususerprofile.domain.GetPremiumBusUserSurveyPreferenceUseCase.GetPremiumBusUserSurveyPreferenceError) r5     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            r4.label = r2     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            java.lang.Object r5 = app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent.F0(r1, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            if (r5 != r0) goto L60
        L44:
            return r0
        L45:
            boolean r0 = r5 instanceof app.chalo.utils.ChaloUseCaseResult.Success     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            if (r0 == 0) goto L55
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r0 = r4.this$0     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            app.chalo.utils.ChaloUseCaseResult$Success r5 = (app.chalo.utils.ChaloUseCaseResult.Success) r5     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            java.lang.Object r5 = r5.f10419a     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference r5 = (app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference) r5     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent.G0(r0, r5)     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            goto L60
        L55:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
            throw r5     // Catch: java.util.concurrent.CancellationException -> L10 java.lang.Exception -> L5b
        L5b:
            app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent r5 = r4.this$0
            r5.K0()
        L60:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        L63:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$handleInitializationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
