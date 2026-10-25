package app.chalo.titoridedetail.ui;

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
@DebugMetadata(c = "app.chalo.titoridedetail.ui.TitoRideDetailsComponent$handleTapOutMissedFeedbackSubmitButtonClickIntent$1", f = "TitoRideDetailComponent.kt", l = {418, 419}, m = "invokeSuspend", v = 1)
final class TitoRideDetailsComponent$handleTapOutMissedFeedbackSubmitButtonClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TitoRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitoRideDetailsComponent$handleTapOutMissedFeedbackSubmitButtonClickIntent$1(TitoRideDetailsComponent titoRideDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = titoRideDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TitoRideDetailsComponent$handleTapOutMissedFeedbackSubmitButtonClickIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TitoRideDetailsComponent$handleTapOutMissedFeedbackSubmitButtonClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r7.a(r4, r3, r6) == r0) goto L20;
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
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L65
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$1
            app.chalo.titoridedetail.data.app.TITOValidationAppModel r1 = (app.chalo.titoridedetail.data.app.TITOValidationAppModel) r1
            java.lang.Object r3 = r6.L$0
            app.chalo.titoridedetail.ui.TitoRideDetailsComponent r3 = (app.chalo.titoridedetail.ui.TitoRideDetailsComponent) r3
            kotlin.ResultKt.b(r7)
            goto L4d
        L24:
            kotlin.ResultKt.b(r7)
            app.chalo.titoridedetail.ui.TitoRideDetailsComponent r7 = r6.this$0
            kotlinx.coroutines.flow.StateFlow r7 = r7.f
            java.lang.Object r7 = r7.getValue()
            app.chalo.titoridedetail.ui.TitoRideDetailsViewState r7 = (app.chalo.titoridedetail.ui.TitoRideDetailsViewState) r7
            app.chalo.titoridedetail.data.app.TitoRideDataAppModel r7 = r7.f9723a
            if (r7 == 0) goto L65
            app.chalo.titoridedetail.data.app.TITOValidationAppModel r1 = r7.f9677a
            if (r1 == 0) goto L65
            app.chalo.titoridedetail.ui.TitoRideDetailsComponent r7 = r6.this$0
            app.chalo.titoridedetail.data.app.TapInDetailAppModel r4 = r1.f9672a
            java.lang.String r4 = r4.f9673a
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = app.chalo.titoridedetail.ui.TitoRideDetailsComponent.G0(r7, r4, r6)
            if (r3 != r0) goto L4c
            goto L64
        L4c:
            r3 = r7
        L4d:
            app.chalo.titoridedetail.domain.HandleLastProductActivationOnTitoMissedTapOutUseCase r7 = r3.x
            app.chalo.titoridedetail.data.app.TITOProductDetailAppModel r3 = r1.c
            app.chalo.models.validation.ValidationProduct r3 = r3.b
            app.chalo.titoridedetail.data.app.TapInDetailAppModel r1 = r1.f9672a
            long r4 = r1.c
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r7.a(r4, r3, r6)
            if (r7 != r0) goto L65
        L64:
            return r0
        L65:
            app.chalo.titoridedetail.ui.TitoRideDetailsComponent r7 = r6.this$0
            wi1 r0 = new wi1
            r1 = 29
            r0.<init>(r1)
            r7.E0(r0)
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.titoridedetail.ui.TitoRideDetailsComponent$handleTapOutMissedFeedbackSubmitButtonClickIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
