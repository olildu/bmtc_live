package app.chalo.ncmc.ui.cardlinking.linking;

import androidx.media3.extractor.ts.TsExtractor;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent$handleProceedClickedIntent$2", f = "ChaloCardLinkCardComponent.kt", l = {133, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 1)
final class ChaloCardLinkCardComponent$handleProceedClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloCardLinkCardComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardLinkCardComponent$handleProceedClickedIntent$2(ChaloCardLinkCardComponent chaloCardLinkCardComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardLinkCardComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardLinkCardComponent$handleProceedClickedIntent$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardLinkCardComponent$handleProceedClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent.F0(r1, r8, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r8)
            goto L90
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            kotlin.ResultKt.b(r8)
            goto L46
        L1d:
            kotlin.ResultKt.b(r8)
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent r8 = r7.this$0
            kotlinx.coroutines.flow.StateFlow r8 = r8.f
            java.lang.Object r8 = r8.getValue()
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState r8 = (app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState) r8
            java.lang.String r8 = r8.f6279a
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent r1 = r7.this$0
            kotlinx.coroutines.flow.StateFlow r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState r1 = (app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState) r1
            java.lang.String r1 = r1.b
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent r4 = r7.this$0
            app.chalo.ncmc.domain.LinkChaloCardUseCase r4 = r4.k
            r7.label = r3
            r3 = 0
            java.lang.Object r8 = r4.a(r8, r1, r7, r3)
            if (r8 != r0) goto L46
            goto L5c
        L46:
            app.chalo.utils.ChaloUseCaseResult r8 = (app.chalo.utils.ChaloUseCaseResult) r8
            boolean r1 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 == 0) goto L5d
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent r1 = r7.this$0
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = (app.chalo.utils.ChaloUseCaseResult.Failure) r8
            java.lang.Object r8 = r8.f10418a
            app.chalo.mvibase.simple.UseCaseOperationError r8 = (app.chalo.mvibase.simple.UseCaseOperationError) r8
            r7.label = r2
            java.lang.Object r8 = app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent.F0(r1, r8, r7)
            if (r8 != r0) goto L90
        L5c:
            return r0
        L5d:
            boolean r8 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r8 == 0) goto L93
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent r8 = r7.this$0
            app.chalo.analytics.contract.AnalyticsContract r0 = r8.m
            kotlinx.coroutines.flow.StateFlow r8 = r8.f
            java.lang.Object r8 = r8.getValue()
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState r8 = (app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState) r8
            r1 = 0
            java.util.HashMap r3 = app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardContractKt.a(r8, r1)
            r5 = 0
            r6 = 24
            java.lang.String r1 = "chalocard linking success"
            java.lang.String r2 = "CHALO_CARD_LINKING_SCREEN"
            r4 = 0
            app.chalo.analytics.contract.AnalyticsContract.DefaultImpls.a(r0, r1, r2, r3, r4, r5, r6)
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent r8 = r7.this$0
            pi r0 = new pi
            r1 = 24
            r0.<init>(r1)
            r8.E0(r0)
            app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent r8 = r7.this$0
            app.chalo.scenes.ChaloNavigationManager r8 = r8.p
            app.chalo.scenes.ChaloNavigationManagerKt.c(r8)
        L90:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        L93:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent$handleProceedClickedIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
