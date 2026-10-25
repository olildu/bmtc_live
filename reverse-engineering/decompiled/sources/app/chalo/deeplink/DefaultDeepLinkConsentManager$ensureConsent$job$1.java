package app.chalo.deeplink;

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
@DebugMetadata(c = "app.chalo.deeplink.DefaultDeepLinkConsentManager$ensureConsent$job$1", f = "DefaultDeepLinkConsentManager.kt", l = {52, 55}, m = "invokeSuspend", v = 1)
final class DefaultDeepLinkConsentManager$ensureConsent$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ DefaultDeepLinkConsentManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDeepLinkConsentManager$ensureConsent$job$1(DefaultDeepLinkConsentManager defaultDeepLinkConsentManager, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultDeepLinkConsentManager;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultDeepLinkConsentManager$ensureConsent$job$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultDeepLinkConsentManager$ensureConsent$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r6.a(false, r5) == r0) goto L22;
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
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r2) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L52
        L11:
            r6 = move-exception
            goto L74
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L3a
        L1f:
            kotlin.ResultKt.b(r6)
            app.chalo.deeplink.DefaultDeepLinkConsentManager r6 = r5.this$0     // Catch: java.lang.Throwable -> L11
            app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager r6 = r6.c     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r5.$requestId     // Catch: java.lang.Throwable -> L11
            kotlinx.coroutines.flow.Flow r6 = r6.b(r1)     // Catch: java.lang.Throwable -> L11
            app.chalo.deeplink.DefaultDeepLinkConsentManager$ensureConsent$job$1$granted$1 r1 = new app.chalo.deeplink.DefaultDeepLinkConsentManager$ensureConsent$job$1$granted$1     // Catch: java.lang.Throwable -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11
            r5.label = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.w(r6, r1, r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L3a
            goto L51
        L3a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L11
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L11
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r1)     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L5b
            app.chalo.deeplink.DefaultDeepLinkConsentManager r6 = r5.this$0     // Catch: java.lang.Throwable -> L11
            app.chalo.login.manager.DpdpaConsentManager r6 = r6.f2472a     // Catch: java.lang.Throwable -> L11
            r5.label = r3     // Catch: java.lang.Throwable -> L11
            r1 = 0
            java.lang.Object r6 = r6.a(r1, r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L52
        L51:
            return r0
        L52:
            app.chalo.deeplink.DefaultDeepLinkConsentManager r6 = r5.this$0     // Catch: java.lang.Throwable -> L11
            kotlinx.coroutines.flow.MutableStateFlow r6 = r6.e     // Catch: java.lang.Throwable -> L11
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L11
            r6.setValue(r0)     // Catch: java.lang.Throwable -> L11
        L5b:
            app.chalo.deeplink.DefaultDeepLinkConsentManager r6 = r5.this$0
            app.chalo.deeplink.DefaultDeepLinkConsentManager$InFlightConsentRequest r6 = r6.f
            if (r6 == 0) goto L64
            java.lang.String r6 = r6.f2473a
            goto L65
        L64:
            r6 = r4
        L65:
            java.lang.String r0 = r5.$requestId
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r0)
            if (r6 == 0) goto L71
            app.chalo.deeplink.DefaultDeepLinkConsentManager r6 = r5.this$0
            r6.f = r4
        L71:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        L74:
            app.chalo.deeplink.DefaultDeepLinkConsentManager r0 = r5.this$0
            app.chalo.deeplink.DefaultDeepLinkConsentManager$InFlightConsentRequest r0 = r0.f
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.f2473a
            goto L7e
        L7d:
            r0 = r4
        L7e:
            java.lang.String r1 = r5.$requestId
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto L8a
            app.chalo.deeplink.DefaultDeepLinkConsentManager r0 = r5.this$0
            r0.f = r4
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.deeplink.DefaultDeepLinkConsentManager$ensureConsent$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
