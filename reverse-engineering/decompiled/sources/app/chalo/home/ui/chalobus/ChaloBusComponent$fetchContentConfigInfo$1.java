package app.chalo.home.ui.chalobus;

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
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$fetchContentConfigInfo$1", f = "ChaloBusComponent.kt", l = {1004, 1018}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$fetchContentConfigInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$fetchContentConfigInfo$1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusComponent$fetchContentConfigInfo$1 chaloBusComponent$fetchContentConfigInfo$1 = new ChaloBusComponent$fetchContentConfigInfo$1(this.this$0, continuation);
        chaloBusComponent$fetchContentConfigInfo$1.L$0 = obj;
        return chaloBusComponent$fetchContentConfigInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$fetchContentConfigInfo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r12 == r0) goto L23;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r12)
            r9 = r11
            goto L9a
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r12)
            goto L3a
        L22:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            app.chalo.home.ui.chalobus.ChaloBusComponent r12 = r11.this$0
            app.chalo.home.domain.PremiumBusContentConfigUseCase r12 = r12.M
            r11.L$0 = r1
            r11.label = r3
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r0) goto L3a
            r9 = r11
            goto L99
        L3a:
            app.chalo.utils.ChaloUseCaseResult r12 = (app.chalo.utils.ChaloUseCaseResult) r12
            kotlinx.coroutines.CoroutineScopeKt.d(r1)
            boolean r1 = r12 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 != 0) goto Laf
            boolean r1 = r12 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r1 == 0) goto La8
            app.chalo.utils.ChaloUseCaseResult$Success r12 = (app.chalo.utils.ChaloUseCaseResult.Success) r12
            java.lang.Object r12 = r12.f10419a
            app.chalo.home.data.model.app.response.PremiumBusContentConfigAppResponseModel r12 = (app.chalo.home.data.model.app.response.PremiumBusContentConfigAppResponseModel) r12
            java.util.List r12 = r12.f2967a
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            app.chalo.home.ui.chalobus.ChaloBusComponent r1 = r11.this$0
            java.util.ArrayList r5 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.v(r12, r3)
            r5.<init>(r3)
            java.util.Iterator r12 = r12.iterator()
        L62:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r12.next()
            app.chalo.home.data.model.app.response.PremiumBusTutorialConfigAppResponseModel r3 = (app.chalo.home.data.model.app.response.PremiumBusTutorialConfigAppResponseModel) r3
            java.lang.String r4 = r3.f2969a
            java.lang.String r6 = r3.c
            java.lang.String r7 = r3.d
            app.chalo.utils.timeutil.TimeUtilsContract r8 = r1.x
            long r9 = r3.b
            java.lang.String r3 = r8.L(r9)
            app.chalo.home.ui.chalobus.PremiumBusTutorialConfigUiModel r8 = new app.chalo.home.ui.chalobus.PremiumBusTutorialConfigUiModel
            r8.<init>(r4, r3, r6, r7)
            r5.add(r8)
            goto L62
        L85:
            app.chalo.home.ui.chalobus.ChaloBusComponent r3 = r11.this$0
            r12 = 0
            r11.L$0 = r12
            r11.label = r2
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 29
            r9 = r11
            java.io.Serializable r12 = app.chalo.home.ui.chalobus.ChaloBusComponent.S0(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L9a
        L99:
            return r0
        L9a:
            java.util.List r12 = (java.util.List) r12
            app.chalo.home.ui.chalobus.ChaloBusComponent r0 = r9.this$0
            ud r1 = new ud
            r2 = 2
            r1.<init>(r12, r2)
            r0.E0(r1)
            goto Lb0
        La8:
            r9 = r11
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        Laf:
            r9 = r11
        Lb0:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent$fetchContentConfigInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
