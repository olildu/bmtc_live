package app.chalo.validationsdk.vehiclebasedvalidation.domain;

import app.chalo.contract.ProductBookingHelper;
import app.chalo.validationsdk.vehiclebasedvalidation.data.repository.VehicleBasedValidationRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/ValidateONDCTicketAndFetchReceiptUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateONDCTicketAndFetchReceiptUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VehicleBasedValidationRepository f10718a;
    public final ProductBookingHelper b;

    public ValidateONDCTicketAndFetchReceiptUseCase(VehicleBasedValidationRepository vehicleBasedValidationRepository, ProductBookingHelper productBookingHelper) {
        this.f10718a = vehicleBasedValidationRepository;
        this.b = productBookingHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r8.b(r7, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase$invoke$1 r0 = (app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase$invoke$1 r0 = new app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase$invoke$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason$InvalidReceiptReceived r3 = app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason.InvalidReceiptReceived.f10713a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r7 = r0.L$0
            app.chalo.models.ondc.OndcTicketReceiptAppModel r7 = (app.chalo.models.ondc.OndcTicketReceiptAppModel) r7
            kotlin.ResultKt.b(r9)     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            goto L77
        L30:
            r7 = move-exception
            goto La1
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.b(r9)     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            goto L58
        L43:
            kotlin.ResultKt.b(r9)
            app.chalo.validationsdk.vehiclebasedvalidation.data.models.app.VehicleValidationRequestAppModel r9 = new app.chalo.validationsdk.vehiclebasedvalidation.data.models.app.VehicleValidationRequestAppModel     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            r9.<init>(r8, r7)     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            app.chalo.validationsdk.vehiclebasedvalidation.data.repository.VehicleBasedValidationRepository r8 = r6.f10718a     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            r0.L$0 = r7     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            r0.label = r5     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            java.lang.Object r9 = r8.a(r9, r0)     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            if (r9 != r1) goto L58
            goto L76
        L58:
            r8 = r9
            app.chalo.models.ondc.OndcTicketReceiptAppModel r8 = (app.chalo.models.ondc.OndcTicketReceiptAppModel) r8     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            java.lang.String r8 = r8.f5630a     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r8, r7)     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            if (r7 == 0) goto L64
            goto L65
        L64:
            r9 = 0
        L65:
            r7 = r9
            app.chalo.models.ondc.OndcTicketReceiptAppModel r7 = (app.chalo.models.ondc.OndcTicketReceiptAppModel) r7     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            if (r7 == 0) goto L7d
            app.chalo.contract.ProductBookingHelper r8 = r6.b     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            r0.L$0 = r7     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            r0.label = r4     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            java.lang.Object r8 = r8.b(r7, r0)     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            app.chalo.utils.ChaloUseCaseResult$Success r8 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            r8.<init>(r7)     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            return r8
        L7d:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            r7.<init>(r3)     // Catch: app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException -> L30 java.lang.Exception -> L83 app.chalo.network.exception.NetworkSuccessResponseParseException -> L8b app.chalo.network.exception.ChaloLocalException -> L93 app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException -> L9b
            return r7
        L83:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason$Unknown r8 = app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason.Unknown.f10717a
            r7.<init>(r8)
            goto Lb0
        L8b:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason$ParseError r8 = app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason.ParseError.f10715a
            r7.<init>(r8)
            goto Lb0
        L93:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason$LocalError r8 = app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason.LocalError.f10714a
            r7.<init>(r8)
            goto Lb0
        L9b:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r7.<init>(r3)
            goto Lb0
        La1:
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason$ServerError r9 = new app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason$ServerError
            java.lang.String r7 = r7.getMessage()
            r9.<init>(r7)
            r8.<init>(r9)
            r7 = r8
        Lb0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
