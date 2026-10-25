package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.ncmc.uvik.UvikServiceType;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$startUvikTapFlowForBalanceUpdate$1", f = "OfflineCardRechargeComponent.kt", l = {169, 177}, m = "invokeSuspend", v = 1)
final class OfflineCardRechargeComponent$startUvikTapFlowForBalanceUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UvikServiceType $serviceType;
    int label;
    final /* synthetic */ OfflineCardRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeComponent$startUvikTapFlowForBalanceUpdate$1(OfflineCardRechargeComponent offlineCardRechargeComponent, UvikServiceType uvikServiceType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offlineCardRechargeComponent;
        this.$serviceType = uvikServiceType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfflineCardRechargeComponent$startUvikTapFlowForBalanceUpdate$1(this.this$0, this.$serviceType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfflineCardRechargeComponent$startUvikTapFlowForBalanceUpdate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent.G0(r1, r3, r6, r5) == r0) goto L20;
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
            goto L7a
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L3d
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent r6 = r5.this$0
            r6.getClass()
            va r1 = new va
            r4 = 10
            r1.<init>(r3, r4)
            r6.E0(r1)
            app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent r6 = r5.this$0
            app.chalo.ncmc.domain.GenerateUvikIntentHashUseCase r6 = r6.s
            app.chalo.ncmc.uvik.UvikServiceType r1 = r5.$serviceType
            r5.label = r3
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L3d
            goto L79
        L3d:
            app.chalo.utils.ChaloUseCaseResult r6 = (app.chalo.utils.ChaloUseCaseResult) r6
            boolean r1 = r6 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 == 0) goto L63
            app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent r0 = r5.this$0
            r0.getClass()
            va r1 = new va
            r2 = 10
            r3 = 0
            r1.<init>(r3, r2)
            r0.E0(r1)
            app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent r0 = r5.this$0
            app.chalo.providers.toast.KotlinToastManager r0 = r0.y
            app.chalo.utils.ChaloUseCaseResult$Failure r6 = (app.chalo.utils.ChaloUseCaseResult.Failure) r6
            java.lang.Object r6 = r6.f10418a
            app.chalo.ncmc.domain.UvikIntentHashFailureReason r6 = (app.chalo.ncmc.domain.UvikIntentHashFailureReason) r6
            java.lang.String r6 = r6.f6251a
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r6)
            goto L7a
        L63:
            boolean r1 = r6 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r1 == 0) goto L7d
            app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent r1 = r5.this$0
            app.chalo.ncmc.uvik.UvikServiceType r3 = r5.$serviceType
            app.chalo.utils.ChaloUseCaseResult$Success r6 = (app.chalo.utils.ChaloUseCaseResult.Success) r6
            java.lang.Object r6 = r6.f10419a
            app.chalo.ncmc.data.appmodel.IntentHashAppModel r6 = (app.chalo.ncmc.data.appmodel.IntentHashAppModel) r6
            r5.label = r2
            java.lang.Object r6 = app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent.G0(r1, r3, r6, r5)
            if (r6 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        L7d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$startUvikTapFlowForBalanceUpdate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
