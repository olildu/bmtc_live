package app.chalo.home.ui.base;

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
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$checkUserConsentStatus$1", f = "HomeComponent.kt", l = {2736, 2737, 2744}, m = "invokeSuspend", v = 1)
final class HomeComponent$checkUserConsentStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$checkUserConsentStatus$1(HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$checkUserConsentStatus$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$checkUserConsentStatus$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r10 == r0) goto L30;
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
            r2 = 0
            r3 = 0
            kotlin.Unit r4 = kotlin.Unit.f17538a
            r5 = 3
            r6 = 1
            r7 = 2
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L27
            if (r1 == r7) goto L1f
            if (r1 != r5) goto L17
            kotlin.ResultKt.b(r10)
            goto L7b
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.b(r10)
            goto L50
        L27:
            kotlin.ResultKt.b(r10)
            goto L3b
        L2b:
            kotlin.ResultKt.b(r10)
            app.chalo.home.ui.base.HomeComponent r10 = r9.this$0
            app.chalo.providers.UserProfileDetailsProvider r10 = r10.v
            r9.label = r6
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L3b
            goto L7a
        L3b:
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L41
            goto Lab
        L41:
            app.chalo.home.ui.base.HomeComponent r10 = r9.this$0
            app.chalo.login.manager.DpdpaConsentManager r10 = r10.a0
            r9.L$0 = r1
            r9.label = r7
            java.lang.Enum r10 = r10.b(r1, r9)
            if (r10 != r0) goto L50
            goto L7a
        L50:
            app.chalo.login.manager.CachedConsentResultStatus r10 = (app.chalo.login.manager.CachedConsentResultStatus) r10
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r10, r8)
            int[] r8 = app.chalo.login.manager.DpdpaConsentManagerKt.WhenMappings.f5259a
            int r10 = r10.ordinal()
            r10 = r8[r10]
            if (r10 == r6) goto Lab
            if (r10 == r7) goto L6c
            if (r10 != r5) goto L66
            goto L6c
        L66:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L6c:
            app.chalo.home.ui.base.HomeComponent r10 = r9.this$0
            app.chalo.login.manager.DpdpaConsentManager r10 = r10.a0
            r9.L$0 = r3
            r9.label = r5
            java.lang.Object r10 = r10.c(r1, r9, r2)
            if (r10 != r0) goto L7b
        L7a:
            return r0
        L7b:
            app.chalo.utils.ChaloUseCaseResult r10 = (app.chalo.utils.ChaloUseCaseResult) r10
            boolean r0 = r10 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r0 == 0) goto La0
            app.chalo.utils.ChaloUseCaseResult$Success r10 = (app.chalo.utils.ChaloUseCaseResult.Success) r10
            java.lang.Object r10 = r10.f10419a
            app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel r10 = (app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel) r10
            boolean r10 = app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModelKt.a(r10)
            if (r10 == 0) goto Lab
            app.chalo.home.ui.base.HomeComponent r10 = r9.this$0
            app.chalo.scenes.ChaloNavigationManager r10 = r10.M
            app.chalo.scenes.args.UserConsentScreenArgs r0 = new app.chalo.scenes.args.UserConsentScreenArgs
            app.chalo.userconsent.UserConsentFlowType$ExistingUser r1 = new app.chalo.userconsent.UserConsentFlowType$ExistingUser
            r1.<init>(r2, r2)
            r0.<init>(r1, r3)
            r1 = 6
            app.chalo.scenes.ChaloNavigationManagerKt.e(r10, r0, r3, r1)
            return r4
        La0:
            boolean r10 = r10 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r10 == 0) goto La5
            goto Lab
        La5:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent$checkUserConsentStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
