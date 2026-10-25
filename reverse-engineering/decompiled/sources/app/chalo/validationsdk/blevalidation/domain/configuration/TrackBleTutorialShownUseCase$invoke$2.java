package app.chalo.validationsdk.blevalidation.domain.configuration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase$invoke$2", f = "TrackBleTutorialShownUseCase.kt", l = {16, 17}, m = "invokeSuspend", v = 1)
final class TrackBleTutorialShownUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TrackBleTutorialShownUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackBleTutorialShownUseCase$invoke$2(TrackBleTutorialShownUseCase trackBleTutorialShownUseCase, Continuation continuation) {
        super(2, continuation);
        this.this$0 = trackBleTutorialShownUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackBleTutorialShownUseCase$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackBleTutorialShownUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r5.b.a(r7 + 1, r1, r6) == r0) goto L17;
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
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r7)
            goto L59
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            java.lang.Object r1 = r6.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r6.L$0
            app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase r5 = (app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase) r5
            kotlin.ResultKt.b(r7)
            goto L43
        L25:
            kotlin.ResultKt.b(r7)
            app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase r7 = r6.this$0
            app.chalo.providers.UserProfileDetailsProvider r7 = r7.f10516a
            java.lang.String r1 = r7.m()
            if (r1 == 0) goto L5c
            app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase r5 = r6.this$0
            app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore r7 = r5.b
            r6.L$0 = r5
            r6.L$1 = r1
            r6.label = r4
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 != r0) goto L43
            goto L58
        L43:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore r5 = r5.b
            int r7 = r7 + r4
            r6.L$0 = r3
            r6.L$1 = r3
            r6.label = r2
            java.lang.Object r7 = r5.a(r7, r1, r6)
            if (r7 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
