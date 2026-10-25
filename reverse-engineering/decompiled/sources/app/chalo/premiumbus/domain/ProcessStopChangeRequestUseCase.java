package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ProcessStopChangeRequestUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessStopChangeRequestUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7234a;
    public final FetchPremiumReserveTicketAndStoreLocallyUseCase b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7235a;

        static {
            int[] iArr = new int[FetchPremiumReserveTicketFailureReason.values().length];
            try {
                iArr[FetchPremiumReserveTicketFailureReason.NO_TICKET_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchPremiumReserveTicketFailureReason.INVALID_TICKET_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchPremiumReserveTicketFailureReason.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchPremiumReserveTicketFailureReason.LOCAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FetchPremiumReserveTicketFailureReason.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FetchPremiumReserveTicketFailureReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7235a = iArr;
        }
    }

    public ProcessStopChangeRequestUseCase(PremiumBusRepository premiumBusRepository, FetchPremiumReserveTicketAndStoreLocallyUseCase fetchPremiumReserveTicketAndStoreLocallyUseCase) {
        this.f7234a = premiumBusRepository;
        this.b = fetchPremiumReserveTicketAndStoreLocallyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r10 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domain.ProcessStopChangeRequestUseCase.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
