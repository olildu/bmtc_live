package app.chalo.login.ui.options;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.login.data.models.app.LoginModeAppModel;
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
@DebugMetadata(c = "app.chalo.login.ui.options.LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1", f = "LoginOptionsComponent.kt", l = {548, 554, 652}, m = "invokeSuspend", v = 1)
final class LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LoginOptionsIntent.OnTruecallerSuccessCallback $intent;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LoginOptionsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.login.ui.options.LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.login.ui.options.LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1$3", f = "LoginOptionsComponent.kt", l = {598, 600, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 621, 640}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LoginModeAppModel.TruecallerLoginModel $truecallerLoginAppModel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LoginOptionsComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LoginOptionsComponent loginOptionsComponent, LoginModeAppModel.TruecallerLoginModel truecallerLoginModel, Continuation continuation) {
            super(2, continuation);
            this.this$0 = loginOptionsComponent;
            this.$truecallerLoginAppModel = truecallerLoginModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$truecallerLoginAppModel, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (r0 == r6) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
        
            if (r0 == r6) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0163, code lost:
        
            if (r0 == r6) goto L58;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 385
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.options.LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1(LoginOptionsComponent loginOptionsComponent, LoginOptionsIntent.OnTruecallerSuccessCallback onTruecallerSuccessCallback, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOptionsComponent;
        this.$intent = onTruecallerSuccessCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1 loginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1 = new LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1(this.this$0, this.$intent, continuation);
        loginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1.L$0 = obj;
        return loginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r2 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0127, code lost:
    
        if (r2 == r1) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.options.LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
