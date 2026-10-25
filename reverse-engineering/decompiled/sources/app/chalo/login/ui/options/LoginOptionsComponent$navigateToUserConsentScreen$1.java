package app.chalo.login.ui.options;

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
@DebugMetadata(c = "app.chalo.login.ui.options.LoginOptionsComponent$navigateToUserConsentScreen$1", f = "LoginOptionsComponent.kt", l = {691, 692}, m = "invokeSuspend", v = 1)
final class LoginOptionsComponent$navigateToUserConsentScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ LoginOptionsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOptionsComponent$navigateToUserConsentScreen$1(LoginOptionsComponent loginOptionsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOptionsComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOptionsComponent$navigateToUserConsentScreen$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOptionsComponent$navigateToUserConsentScreen$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (app.chalo.login.ui.options.LoginOptionsComponent.H0(r1, (app.chalo.resultstatemanager.ResultStateData) r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L41
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L34
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.login.ui.options.LoginOptionsComponent r6 = r5.this$0
            app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager r1 = r6.E
            java.lang.String r4 = r5.$requestId
            kotlinx.coroutines.flow.Flow r1 = r1.b(r4)
            r5.label = r3
            app.chalo.resultstatemanager.DecomposeResultStateDataCollector r6 = r6.b
            java.lang.Object r6 = r6.v(r1, r5)
            if (r6 != r0) goto L34
            goto L40
        L34:
            app.chalo.resultstatemanager.ResultStateData r6 = (app.chalo.resultstatemanager.ResultStateData) r6
            app.chalo.login.ui.options.LoginOptionsComponent r1 = r5.this$0
            r5.label = r2
            java.lang.Object r6 = app.chalo.login.ui.options.LoginOptionsComponent.H0(r1, r6, r5)
            if (r6 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.options.LoginOptionsComponent$navigateToUserConsentScreen$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
