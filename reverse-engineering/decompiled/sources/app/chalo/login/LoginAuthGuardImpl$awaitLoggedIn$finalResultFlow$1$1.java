package app.chalo.login;

import app.chalo.constants.Source;
import app.chalo.resultstatemanager.ResultStateDataCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/login/LoginGuardResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1", f = "LoginAuthGuardImpl.kt", l = {EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, EACTags.DEPRECATED, 76}, m = "invokeSuspend", v = 1)
final class LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1 extends SuspendLambda implements Function2<ProducerScope<? super LoginGuardResult>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<Unit> $resultDataFlow;
    final /* synthetic */ ResultStateDataCollector $resultStateCollector;
    final /* synthetic */ Source $source;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginAuthGuardImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1(LoginAuthGuardImpl loginAuthGuardImpl, Source source, ResultStateDataCollector resultStateDataCollector, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginAuthGuardImpl;
        this.$source = source;
        this.$resultStateCollector = resultStateDataCollector;
        this.$resultDataFlow = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1 loginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1 = new LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1(this.this$0, this.$source, this.$resultStateCollector, this.$resultDataFlow, continuation);
        loginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1.L$0 = obj;
        return loginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r1.send(r12, r11) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r1.send(r12, r11) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            kotlin.ResultKt.b(r12)
            goto L85
        L1d:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.b(r12)
            goto L61
        L25:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            app.chalo.login.LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1$resultAsyncTask$1 r12 = new app.chalo.login.LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1$resultAsyncTask$1
            app.chalo.resultstatemanager.ResultStateDataCollector r6 = r11.$resultStateCollector
            kotlinx.coroutines.flow.Flow<kotlin.Unit> r7 = r11.$resultDataFlow
            r12.<init>(r6, r7, r4)
            kotlinx.coroutines.Deferred r12 = kotlinx.coroutines.BuildersKt.b(r1, r4, r4, r12, r2)
            app.chalo.login.LoginAuthGuardImpl r6 = r11.this$0
            app.chalo.scenes.ChaloNavigationManager r6 = r6.b
            app.chalo.scenes.args.LoginOptionsArgs r7 = new app.chalo.scenes.args.LoginOptionsArgs
            app.chalo.constants.Source r8 = r11.$source
            r9 = 0
            r7.<init>(r8, r9)
            app.chalo.scenes.ChaloNavOptions r8 = new app.chalo.scenes.ChaloNavOptions
            app.chalo.scenes.PopUpToConfig$Scene r9 = new app.chalo.scenes.PopUpToConfig$Scene
            app.chalo.scenes.ChaloScenes r10 = app.chalo.scenes.ChaloScenes.LoginOptions
            r9.<init>(r10, r5)
            r8.<init>(r9, r2)
            r9 = 4
            app.chalo.scenes.ChaloNavigationManagerKt.e(r6, r7, r8, r9)
            r11.L$0 = r1
            r11.label = r5
            java.lang.Object r12 = r12.q(r11)
            if (r12 != r0) goto L61
            goto L84
        L61:
            app.chalo.resultstatemanager.ResultStateData r12 = (app.chalo.resultstatemanager.ResultStateData) r12
            boolean r5 = r12 instanceof app.chalo.resultstatemanager.ResultStateData.Cancelled
            if (r5 == 0) goto L74
            app.chalo.login.LoginGuardResult r12 = app.chalo.login.LoginGuardResult.DISMISSED
            r11.L$0 = r4
            r11.label = r3
            java.lang.Object r12 = r1.send(r12, r11)
            if (r12 != r0) goto L85
            goto L84
        L74:
            boolean r12 = r12 instanceof app.chalo.resultstatemanager.ResultStateData.Success
            if (r12 == 0) goto L88
            app.chalo.login.LoginGuardResult r12 = app.chalo.login.LoginGuardResult.LOGGED_IN
            r11.L$0 = r4
            r11.label = r2
            java.lang.Object r12 = r1.send(r12, r11)
            if (r12 != r0) goto L85
        L84:
            return r0
        L85:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        L88:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
