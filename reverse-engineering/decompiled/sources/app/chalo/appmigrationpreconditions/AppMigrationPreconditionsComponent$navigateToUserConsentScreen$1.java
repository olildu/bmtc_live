package app.chalo.appmigrationpreconditions;

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
@DebugMetadata(c = "app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$navigateToUserConsentScreen$1", f = "AppMigrationPreconditionsComponent.kt", l = {303, 308}, m = "invokeSuspend", v = 1)
final class AppMigrationPreconditionsComponent$navigateToUserConsentScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ AppMigrationPreconditionsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMigrationPreconditionsComponent$navigateToUserConsentScreen$1(AppMigrationPreconditionsComponent appMigrationPreconditionsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = appMigrationPreconditionsComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppMigrationPreconditionsComponent$navigateToUserConsentScreen$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppMigrationPreconditionsComponent$navigateToUserConsentScreen$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r6 == r0) goto L21;
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
            goto L59
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
            app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent r6 = r5.this$0
            app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager r1 = r6.q
            java.lang.String r4 = r5.$requestId
            kotlinx.coroutines.flow.Flow r1 = r1.b(r4)
            r5.label = r3
            app.chalo.resultstatemanager.DecomposeResultStateDataCollector r6 = r6.b
            java.lang.Object r6 = r6.v(r1, r5)
            if (r6 != r0) goto L34
            goto L58
        L34:
            app.chalo.resultstatemanager.ResultStateData r6 = (app.chalo.resultstatemanager.ResultStateData) r6
            boolean r1 = r6 instanceof app.chalo.resultstatemanager.ResultStateData.Cancelled
            if (r1 != 0) goto L67
            boolean r1 = r6 instanceof app.chalo.resultstatemanager.ResultStateData.Success
            if (r1 == 0) goto L61
            app.chalo.resultstatemanager.ResultStateData$Success r6 = (app.chalo.resultstatemanager.ResultStateData.Success) r6
            java.lang.Object r6 = r6.f9039a
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L67
            app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent r6 = r5.this$0
            app.chalo.appmigrationpreconditions.orchestrator.MigrationFlowOrchestrator r6 = r6.k
            app.chalo.constants.Source$Companion r1 = app.chalo.constants.Source.INSTANCE
            r5.label = r2
            java.lang.Object r6 = r6.b()
            if (r6 != r0) goto L59
        L58:
            return r0
        L59:
            app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision r6 = (app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision) r6
            app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent r0 = r5.this$0
            r0.I0(r6)
            goto L67
        L61:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L67:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$navigateToUserConsentScreen$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
