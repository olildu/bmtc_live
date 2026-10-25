package app.chalo.home.domain;

import app.chalo.productpurchase.utils.BookingHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetNextStepOnPassApplicationRejectedUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetNextStepOnPassApplicationRejectedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchAndStoreProductConfigByIdUseCase f3040a;
    public final BookingHelper b;

    public GetNextStepOnPassApplicationRejectedUseCase(FetchAndStoreProductConfigByIdUseCase fetchAndStoreProductConfigByIdUseCase, BookingHelper bookingHelper) {
        this.f3040a = fetchAndStoreProductConfigByIdUseCase;
        this.b = bookingHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r9 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.superpass.data.models.entities.SuperPassApplication r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase$invoke$1 r0 = (app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase$invoke$1 r0 = new app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase$invoke$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.productpurchase.utils.BookingHelper r3 = r7.b
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L47
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r9)
            goto L74
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.L$0
            app.chalo.superpass.data.models.entities.SuperPassApplication r8 = (app.chalo.superpass.data.models.entities.SuperPassApplication) r8
            kotlin.ResultKt.b(r9)
            goto L68
        L3f:
            java.lang.Object r8 = r0.L$0
            app.chalo.superpass.data.models.entities.SuperPassApplication r8 = (app.chalo.superpass.data.models.entities.SuperPassApplication) r8
            kotlin.ResultKt.b(r9)
            goto L55
        L47:
            kotlin.ResultKt.b(r9)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r3.a(r8, r0)
            if (r9 != r1) goto L55
            goto L73
        L55:
            app.chalo.models.BookableSuperPassConfiguration r9 = (app.chalo.models.BookableSuperPassConfiguration) r9
            if (r9 != 0) goto L76
            java.lang.String r9 = r8.c
            r0.L$0 = r8
            r0.label = r5
            app.chalo.home.domain.FetchAndStoreProductConfigByIdUseCase r2 = r7.f3040a
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L68
            goto L73
        L68:
            r9 = 0
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r9 = r3.a(r8, r0)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            app.chalo.models.BookableSuperPassConfiguration r9 = (app.chalo.models.BookableSuperPassConfiguration) r9
        L76:
            if (r9 == 0) goto L85
            boolean r8 = r9.c()
            if (r8 != 0) goto L7f
            goto L85
        L7f:
            app.chalo.home.domain.ProcessRejectedPassApplicationForNextStep$ProceedForReapplication r8 = new app.chalo.home.domain.ProcessRejectedPassApplicationForNextStep$ProceedForReapplication
            r8.<init>(r9)
            return r8
        L85:
            app.chalo.home.domain.ProcessRejectedPassApplicationForNextStep$ProductDisabled r8 = app.chalo.home.domain.ProcessRejectedPassApplicationForNextStep.ProductDisabled.f3065a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase.a(app.chalo.superpass.data.models.entities.SuperPassApplication, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
