package app.chalo.login.ui.options;

import app.chalo.config.CountryPhoneNumberConfig;
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
@DebugMetadata(c = "app.chalo.login.ui.options.LoginOptionsComponent$handleInitializationIntent$1", f = "LoginOptionsComponent.kt", l = {262, 286}, m = "invokeSuspend", v = 1)
final class LoginOptionsComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CountryPhoneNumberConfig $defaultPhoneNumberConfig;
    final /* synthetic */ LoginOptionsIntent.InitializationIntent $intent;
    int label;
    final /* synthetic */ LoginOptionsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOptionsComponent$handleInitializationIntent$1(LoginOptionsComponent loginOptionsComponent, LoginOptionsIntent.InitializationIntent initializationIntent, CountryPhoneNumberConfig countryPhoneNumberConfig, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOptionsComponent;
        this.$intent = initializationIntent;
        this.$defaultPhoneNumberConfig = countryPhoneNumberConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOptionsComponent$handleInitializationIntent$1(this.this$0, this.$intent, this.$defaultPhoneNumberConfig, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOptionsComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (app.chalo.login.ui.options.LoginOptionsComponent.F0(r10, r9) == r0) goto L15;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r10)
            goto L65
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            kotlin.ResultKt.b(r10)
            goto L2c
        L1c:
            kotlin.ResultKt.b(r10)
            app.chalo.login.ui.options.LoginOptionsComponent r10 = r9.this$0
            app.chalo.login.domain.FetchLoginAfterCitySelectionConfigUseCase r10 = r10.u
            r9.label = r3
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L2c
            goto L64
        L2c:
            r7 = r10
            app.chalo.login.data.models.app.LoginAfterCitySelectionRemoteConfigModel r7 = (app.chalo.login.data.models.app.LoginAfterCitySelectionRemoteConfigModel) r7
            app.chalo.login.ui.options.LoginOptionsComponent r5 = r9.this$0
            app.chalo.login.ui.options.LoginOptionsIntent$InitializationIntent r4 = r9.$intent
            app.chalo.config.CountryPhoneNumberConfig r6 = r9.$defaultPhoneNumberConfig
            n3 r3 = new n3
            r8 = 10
            r3.<init>(r4, r5, r6, r7, r8)
            r5.E0(r3)
            app.chalo.login.ui.options.LoginOptionsComponent r10 = r9.this$0
            app.chalo.login.ui.options.LoginOptionsIntent$InitializationIntent r1 = r9.$intent
            app.chalo.constants.Source r1 = r1.f5305a
            java.lang.String r1 = r1.getSourceName()
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r4 = "src"
            r3.<init>(r4, r1)
            java.util.Map r1 = kotlin.collections.MapsKt.h(r3)
            java.lang.String r3 = "login screen displayed"
            r10.R0(r3, r1)
            app.chalo.login.ui.options.LoginOptionsComponent r10 = r9.this$0
            r9.label = r2
            java.lang.Object r10 = app.chalo.login.ui.options.LoginOptionsComponent.F0(r10, r9)
            if (r10 != r0) goto L65
        L64:
            return r0
        L65:
            kotlin.Unit r10 = kotlin.Unit.f17538a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.options.LoginOptionsComponent$handleInitializationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
