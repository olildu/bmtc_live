package app.chalo.ondc.domain;

import app.chalo.ondc.repository.OndcRepository;
import app.chalo.productbooking.common.domain.MobileTicketByIdFetchFailedReason;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/FetchAndStoreOndcMetroTicketUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchAndStoreOndcMetroTicketUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcRepository f6707a;
    public final FetchOndcMetroTicketUseCase b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6708a;

        static {
            int[] iArr = new int[MobileTicketByIdFetchFailedReason.values().length];
            try {
                iArr[MobileTicketByIdFetchFailedReason.NO_PRODUCT_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileTicketByIdFetchFailedReason.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileTicketByIdFetchFailedReason.LOCAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MobileTicketByIdFetchFailedReason.UNKNOWN_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MobileTicketByIdFetchFailedReason.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6708a = iArr;
        }
    }

    public FetchAndStoreOndcMetroTicketUseCase(OndcRepository ondcRepository, FetchOndcMetroTicketUseCase fetchOndcMetroTicketUseCase, GetOndcMetroTicketAppModelFromApiUseCase getOndcMetroTicketAppModelFromApiUseCase) {
        this.f6707a = ondcRepository;
        this.b = fetchOndcMetroTicketUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r6.f6707a.r(r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase$invoke$1 r0 = (app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase$invoke$1 r0 = new app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.ResultKt.b(r8)
            goto L48
        L36:
            kotlin.ResultKt.b(r8)
            r0.label = r4
            app.chalo.ondc.domain.FetchOndcMetroTicketUseCase r8 = r6.b
            java.lang.String r2 = "mobileTicket"
            java.lang.String r5 = "ondcMetroTicket"
            java.lang.Object r8 = r8.a(r7, r2, r5, r0)
            if (r8 != r1) goto L48
            goto L64
        L48:
            app.chalo.utils.ChaloUseCaseResult r8 = (app.chalo.utils.ChaloUseCaseResult) r8
            boolean r7 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r7 == 0) goto L75
            app.chalo.utils.ChaloUseCaseResult$Success r8 = (app.chalo.utils.ChaloUseCaseResult.Success) r8
            java.lang.Object r7 = r8.f10419a
            app.chalo.ondc.model.api.OndcMetroTicketApiModel r7 = (app.chalo.ondc.model.api.OndcMetroTicketApiModel) r7
            app.chalo.ondc.model.app.OndcMetroTicketAppModel r7 = app.chalo.ondc.domain.GetOndcMetroTicketAppModelFromApiUseCase.a(r7)
            if (r7 == 0) goto L6d
            r0.label = r3
            app.chalo.ondc.repository.OndcRepository r8 = r6.f6707a
            java.lang.Object r7 = r8.r(r7, r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success
            kotlin.Unit r8 = kotlin.Unit.f17538a
            r7.<init>(r8)
            return r7
        L6d:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.ondc.domain.FetchOndcTicketFailureReason r8 = app.chalo.ondc.domain.FetchOndcTicketFailureReason.INVALID_TICKET_RECEIVED
            r7.<init>(r8)
            return r7
        L75:
            boolean r7 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r7 == 0) goto Lae
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = (app.chalo.utils.ChaloUseCaseResult.Failure) r8
            java.lang.Object r7 = r8.f10418a
            app.chalo.productbooking.common.domain.MobileTicketByIdFetchFailedReason r7 = (app.chalo.productbooking.common.domain.MobileTicketByIdFetchFailedReason) r7
            int[] r8 = app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase.WhenMappings.f6708a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto La6
            if (r7 == r3) goto La3
            r8 = 3
            if (r7 == r8) goto La0
            r8 = 4
            if (r7 == r8) goto L9d
            r8 = 5
            if (r7 != r8) goto L97
            app.chalo.ondc.domain.FetchOndcTicketFailureReason r7 = app.chalo.ondc.domain.FetchOndcTicketFailureReason.PARSE_ERROR
            goto La8
        L97:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L9d:
            app.chalo.ondc.domain.FetchOndcTicketFailureReason r7 = app.chalo.ondc.domain.FetchOndcTicketFailureReason.UNKNOWN_ERROR
            goto La8
        La0:
            app.chalo.ondc.domain.FetchOndcTicketFailureReason r7 = app.chalo.ondc.domain.FetchOndcTicketFailureReason.LOCAL_ERROR
            goto La8
        La3:
            app.chalo.ondc.domain.FetchOndcTicketFailureReason r7 = app.chalo.ondc.domain.FetchOndcTicketFailureReason.SERVER_ERROR
            goto La8
        La6:
            app.chalo.ondc.domain.FetchOndcTicketFailureReason r7 = app.chalo.ondc.domain.FetchOndcTicketFailureReason.NO_TICKET_RECEIVED
        La8:
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r8.<init>(r7)
            return r8
        Lae:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
