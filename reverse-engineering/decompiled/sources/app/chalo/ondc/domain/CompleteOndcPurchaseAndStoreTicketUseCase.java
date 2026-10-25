package app.chalo.ondc.domain;

import app.chalo.ondc.repository.OndcRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/CompleteOndcPurchaseAndStoreTicketUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompleteOndcPurchaseAndStoreTicketUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcRepository f6699a;

    public CompleteOndcPurchaseAndStoreTicketUseCase(OndcRepository ondcRepository, GetOndcTicketAppModelFromApiUseCase getOndcTicketAppModelFromApiUseCase) {
        this.f6699a = ondcRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r3.d(r7, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase$invoke$1 r0 = (app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase$invoke$1 r0 = new app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.ondc.repository.OndcRepository r3 = r6.f6699a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L2c
            goto L57
        L2c:
            r7 = move-exception
            goto L67
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L2c
            goto L46
        L3a:
            kotlin.ResultKt.b(r8)
            r0.label = r5     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = r3.q(r7, r0)     // Catch: java.lang.Exception -> L2c
            if (r8 != r1) goto L46
            goto L56
        L46:
            app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel r8 = (app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel) r8     // Catch: java.lang.Exception -> L2c
            app.chalo.ondc.model.app.OndcTicketAppModel r7 = app.chalo.ondc.domain.GetOndcTicketAppModelFromApiUseCase.a(r8)     // Catch: java.lang.Exception -> L2c
            if (r7 == 0) goto L5f
            r0.label = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = r3.d(r7, r0)     // Catch: java.lang.Exception -> L2c
            if (r7 != r1) goto L57
        L56:
            return r1
        L57:
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: java.lang.Exception -> L2c
            kotlin.Unit r8 = kotlin.Unit.f17538a     // Catch: java.lang.Exception -> L2c
            r7.<init>(r8)     // Catch: java.lang.Exception -> L2c
            return r7
        L5f:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure     // Catch: java.lang.Exception -> L2c
            app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason$InvalidTicket r8 = app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason.InvalidTicket.f6701a     // Catch: java.lang.Exception -> L2c
            r7.<init>(r8)     // Catch: java.lang.Exception -> L2c
            return r7
        L67:
            boolean r8 = r7 instanceof app.chalo.network.exception.ChaloLocalException
            if (r8 == 0) goto L75
            app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason$LocalError r8 = new app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason$LocalError
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r7)
            goto La3
        L75:
            boolean r8 = r7 instanceof app.chalo.instantticket.data.exception.ProductBookingRemoteDataException
            if (r8 == 0) goto L9a
            app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason$ApiError r8 = new app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason$ApiError
            java.lang.String r0 = r7.getMessage()
            app.chalo.instantticket.data.exception.ProductBookingRemoteDataException r7 = (app.chalo.instantticket.data.exception.ProductBookingRemoteDataException) r7
            app.chalo.network.model.GenericChaloErrorResponse r7 = r7.getErrorResponse()
            if (r7 == 0) goto L8f
            int r7 = r7.f6497a
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            goto L90
        L8f:
            r1 = 0
        L90:
            java.lang.String r7 = " code: "
            java.lang.String r7 = defpackage.dd.c(r1, r0, r7)
            r8.<init>(r7)
            goto La3
        L9a:
            boolean r7 = r7 instanceof app.chalo.network.exception.NetworkSuccessResponseParseException
            if (r7 == 0) goto La1
            app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason$ResponseParsing r8 = app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason.ResponseParsing.f6703a
            goto La3
        La1:
            app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason$UnknownError r8 = app.chalo.ondc.domain.CompleteOndcPurchaseFailureReason.UnknownError.f6704a
        La3:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
