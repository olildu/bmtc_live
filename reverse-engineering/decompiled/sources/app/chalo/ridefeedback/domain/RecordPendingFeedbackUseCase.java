package app.chalo.ridefeedback.domain;

import app.chalo.ridefeedback.data.RideFeedbackRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/RecordPendingFeedbackUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordPendingFeedbackUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackRepository f9083a;

    public RecordPendingFeedbackUseCase(RideFeedbackRepository rideFeedbackRepository) {
        this.f9083a = rideFeedbackRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r8 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase$invoke$1 r0 = (app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase$invoke$1 r0 = new app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.ridefeedback.data.RideFeedbackRepository r3 = r6.f9083a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r7 = r0.L$0
            app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity r7 = (app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity) r7
            kotlin.ResultKt.b(r8)
            goto L5f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.L$0
            app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity r7 = (app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity) r7
            kotlin.ResultKt.b(r8)
            goto L4e
        L40:
            kotlin.ResultKt.b(r8)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r3.k(r7, r0)
            if (r8 != r1) goto L4e
            goto L5e
        L4e:
            java.lang.String r8 = r7.f9071a
            java.lang.String r2 = r7.b
            java.lang.String r5 = r7.c
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r3.l(r8, r2, r5, r0)
            if (r8 != r1) goto L5f
        L5e:
            return r1
        L5f:
            app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity r8 = (app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity) r8
            if (r8 == 0) goto L69
            app.chalo.ridefeedback.data.app.RideFeedbackFillStatus r8 = r8.m
            if (r8 != 0) goto L68
            goto L69
        L68:
            return r8
        L69:
            app.chalo.ridefeedback.data.app.RideFeedbackFillStatus r7 = r7.m
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase.a(app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }
}
