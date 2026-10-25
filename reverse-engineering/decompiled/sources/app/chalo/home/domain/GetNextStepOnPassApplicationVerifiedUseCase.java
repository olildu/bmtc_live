package app.chalo.home.domain;

import app.chalo.productpurchase.utils.BookingHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetNextStepOnPassApplicationVerifiedUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetNextStepOnPassApplicationVerifiedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchAndStoreProductConfigByIdUseCase f3041a;
    public final BookingHelper b;

    public GetNextStepOnPassApplicationVerifiedUseCase(FetchAndStoreProductConfigByIdUseCase fetchAndStoreProductConfigByIdUseCase, BookingHelper bookingHelper) {
        this.f3041a = fetchAndStoreProductConfigByIdUseCase;
        this.b = bookingHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r9 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.superpass.data.models.entities.SuperPassApplication r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase$invoke$1 r0 = (app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase$invoke$1 r0 = new app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase$invoke$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.productpurchase.utils.BookingHelper r3 = r7.b
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.L$0
            app.chalo.superpass.data.models.entities.SuperPassApplication r8 = (app.chalo.superpass.data.models.entities.SuperPassApplication) r8
            kotlin.ResultKt.b(r9)
            goto L77
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.L$0
            app.chalo.superpass.data.models.entities.SuperPassApplication r8 = (app.chalo.superpass.data.models.entities.SuperPassApplication) r8
            kotlin.ResultKt.b(r9)
            goto L6c
        L43:
            java.lang.Object r8 = r0.L$0
            app.chalo.superpass.data.models.entities.SuperPassApplication r8 = (app.chalo.superpass.data.models.entities.SuperPassApplication) r8
            kotlin.ResultKt.b(r9)
            goto L59
        L4b:
            kotlin.ResultKt.b(r9)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r3.a(r8, r0)
            if (r9 != r1) goto L59
            goto L76
        L59:
            app.chalo.models.BookableSuperPassConfiguration r9 = (app.chalo.models.BookableSuperPassConfiguration) r9
            if (r9 != 0) goto L79
            java.lang.String r9 = r8.c
            r0.L$0 = r8
            r0.label = r5
            app.chalo.home.domain.FetchAndStoreProductConfigByIdUseCase r2 = r7.f3041a
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L6c
            goto L76
        L6c:
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r3.a(r8, r0)
            if (r9 != r1) goto L77
        L76:
            return r1
        L77:
            app.chalo.models.BookableSuperPassConfiguration r9 = (app.chalo.models.BookableSuperPassConfiguration) r9
        L79:
            if (r9 == 0) goto La5
            boolean r0 = r9.c()
            if (r0 != 0) goto L82
            goto La5
        L82:
            long r0 = r8.i
            r2 = -1
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L9f
            app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel r8 = r9.c
            int r8 = app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModelKt.i(r8)
            long r2 = (long) r8
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r4
            long r0 = r0 - r2
            r2 = 1
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L9f
            app.chalo.home.domain.ProcessVerifiedPassApplicationForNextStep$ProductValidityExpired r8 = app.chalo.home.domain.ProcessVerifiedPassApplicationForNextStep.ProductValidityExpired.f3068a
            return r8
        L9f:
            app.chalo.home.domain.ProcessVerifiedPassApplicationForNextStep$ProceedForPayment r8 = new app.chalo.home.domain.ProcessVerifiedPassApplicationForNextStep$ProceedForPayment
            r8.<init>(r9)
            return r8
        La5:
            app.chalo.home.domain.ProcessVerifiedPassApplicationForNextStep$ProductDisabled r8 = app.chalo.home.domain.ProcessVerifiedPassApplicationForNextStep.ProductDisabled.f3067a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase.a(app.chalo.superpass.data.models.entities.SuperPassApplication, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
