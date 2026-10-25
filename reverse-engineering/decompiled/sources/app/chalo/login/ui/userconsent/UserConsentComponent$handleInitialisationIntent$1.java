package app.chalo.login.ui.userconsent;

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
@DebugMetadata(c = "app.chalo.login.ui.userconsent.UserConsentComponent$handleInitialisationIntent$1", f = "UserConsentComponent.kt", l = {120, 127}, m = "invokeSuspend", v = 1)
final class UserConsentComponent$handleInitialisationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserConsentIntent.InitializationIntent $intent;
    int label;
    final /* synthetic */ UserConsentComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserConsentComponent$handleInitialisationIntent$1(UserConsentComponent userConsentComponent, UserConsentIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userConsentComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserConsentComponent$handleInitialisationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserConsentComponent$handleInitialisationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (app.chalo.login.ui.userconsent.UserConsentComponent.F0(r7, r1, r6) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r7)
            goto L91
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.ResultKt.b(r7)
            goto L6e
        L1d:
            kotlin.ResultKt.b(r7)
            app.chalo.login.ui.userconsent.UserConsentComponent r7 = r6.this$0
            app.chalo.login.ui.userconsent.UserConsentIntent$InitializationIntent r1 = r6.$intent
            app.chalo.userconsent.UserConsentFlowType r1 = r1.f5354a
            r6.label = r3
            app.chalo.login.domain.CheckIfSkipConsentOptionAvailableUseCase r7 = r7.q
            app.chalo.userconsent.UserConsentFlowType$FreshLogin r3 = app.chalo.userconsent.UserConsentFlowType.FreshLogin.INSTANCE
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r4 == 0) goto L4d
            r7.getClass()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r3 == 0) goto L3e
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L6b
        L3e:
            boolean r1 = r1 instanceof app.chalo.userconsent.UserConsentFlowType.ExistingUser
            if (r1 == 0) goto L47
            java.lang.Object r7 = r7.a(r6)
            goto L6b
        L47:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L4d:
            boolean r4 = r1 instanceof app.chalo.userconsent.UserConsentFlowType.ExistingUser
            if (r4 == 0) goto L94
            r4 = r1
            app.chalo.userconsent.UserConsentFlowType$ExistingUser r4 = (app.chalo.userconsent.UserConsentFlowType.ExistingUser) r4
            boolean r4 = r4.b
            if (r4 == 0) goto L5b
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L6b
        L5b:
            r7.getClass()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r1 == 0) goto L67
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L6b
        L67:
            java.lang.Object r7 = r7.a(r6)
        L6b:
            if (r7 != r0) goto L6e
            goto L90
        L6e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            app.chalo.login.ui.userconsent.UserConsentComponent r1 = r6.this$0
            app.chalo.login.ui.userconsent.UserConsentIntent$InitializationIntent r3 = r6.$intent
            n8 r4 = new n8
            r5 = 14
            r4.<init>(r3, r7, r5)
            r1.E0(r4)
            app.chalo.login.ui.userconsent.UserConsentComponent r7 = r6.this$0
            app.chalo.login.ui.userconsent.UserConsentIntent$InitializationIntent r1 = r6.$intent
            app.chalo.userconsent.UserConsentFlowType r1 = r1.f5354a
            r6.label = r2
            java.lang.Object r7 = app.chalo.login.ui.userconsent.UserConsentComponent.F0(r7, r1, r6)
            if (r7 != r0) goto L91
        L90:
            return r0
        L91:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        L94:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.userconsent.UserConsentComponent$handleInitialisationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
