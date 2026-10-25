package app.chalo.home.ui.profile;

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
@DebugMetadata(c = "app.chalo.home.ui.profile.ProfileScreenComponent$handleLogoutClickedIntent$1", f = "ProfileScreenComponent.kt", l = {449, 458, 462}, m = "invokeSuspend", v = 1)
final class ProfileScreenComponent$handleLogoutClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ProfileScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileScreenComponent$handleLogoutClickedIntent$1(ProfileScreenComponent profileScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = profileScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileScreenComponent$handleLogoutClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileScreenComponent$handleLogoutClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r7 == r0) goto L26;
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
            r2 = 3
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L28
            if (r1 == r3) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.b(r7)
            goto L9f
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r0 = r6.L$0
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            kotlin.ResultKt.b(r7)
            goto L7b
        L24:
            kotlin.ResultKt.b(r7)
            goto L44
        L28:
            kotlin.ResultKt.b(r7)
            app.chalo.home.ui.profile.ProfileScreenComponent r7 = r6.this$0
            ux0 r1 = new ux0
            r5 = 17
            r1.<init>(r5)
            r7.E0(r1)
            app.chalo.home.ui.profile.ProfileScreenComponent r7 = r6.this$0
            app.chalo.userprofile.domain.AccountSettingsInteractor r7 = r7.w
            r6.label = r3
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r0) goto L44
            goto L9e
        L44:
            app.chalo.userprofile.domain.AccountSettingsLogoutResult r7 = (app.chalo.userprofile.domain.AccountSettingsLogoutResult) r7
            app.chalo.userprofile.domain.AccountSettingsLogoutResult$Success r1 = app.chalo.userprofile.domain.AccountSettingsLogoutResult.Success.f10320a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r7, r1)
            r3 = 0
            if (r1 == 0) goto L86
            app.chalo.home.ui.profile.ProfileScreenComponent r7 = r6.this$0
            ux0 r1 = new ux0
            r2 = 18
            r1.<init>(r2)
            r7.E0(r1)
            app.chalo.home.ui.profile.ProfileScreenComponent r7 = r6.this$0
            app.chalo.home.ui.profile.ProfileScreenSideEffect$HideBottomSheet r1 = new app.chalo.home.ui.profile.ProfileScreenSideEffect$HideBottomSheet
            r1.<init>(r3)
            r7.r0(r1)
            app.chalo.home.ui.profile.ProfileScreenComponent r7 = r6.this$0
            app.chalo.providers.toast.KotlinToastManager r1 = r7.y
            app.chalo.providers.stringprovider.StringProvider r7 = r7.x
            app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.PROFILE_LOGOUT_SUCCESSFUL
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6.L$0 = r1
            r6.label = r4
            java.lang.Object r7 = r7.b(r2, r3, r6)
            if (r7 != r0) goto L7a
            goto L9e
        L7a:
            r0 = r1
        L7b:
            java.lang.String r7 = (java.lang.String) r7
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r7)
            app.chalo.home.ui.profile.ProfileScreenComponent r7 = r6.this$0
            app.chalo.home.ui.profile.ProfileScreenComponent.F0(r7)
            goto Lad
        L86:
            app.chalo.userprofile.domain.AccountSettingsLogoutResult$Failure r1 = app.chalo.userprofile.domain.AccountSettingsLogoutResult.Failure.f10319a
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r1)
            if (r7 == 0) goto Lb0
            app.chalo.home.ui.profile.ProfileScreenComponent r7 = r6.this$0
            app.chalo.providers.stringprovider.StringProvider r7 = r7.x
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.LOGOUT_FAILED_COPY
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6.label = r2
            java.lang.Object r7 = r7.b(r1, r3, r6)
            if (r7 != r0) goto L9f
        L9e:
            return r0
        L9f:
            java.lang.String r7 = (java.lang.String) r7
            app.chalo.home.ui.profile.ProfileScreenComponent r0 = r6.this$0
            eu0 r1 = new eu0
            r2 = 14
            r1.<init>(r7, r2)
            r0.E0(r1)
        Lad:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        Lb0:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.profile.ProfileScreenComponent$handleLogoutClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
