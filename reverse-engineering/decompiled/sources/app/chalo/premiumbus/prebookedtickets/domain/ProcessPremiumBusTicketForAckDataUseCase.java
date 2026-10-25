package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/ProcessPremiumBusTicketForAckDataUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessPremiumBusTicketForAckDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUtilsContract f7319a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PremiumReserveTicketStatus.values().length];
            try {
                iArr[PremiumReserveTicketStatus.SYSTEM_CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumReserveTicketStatus.SYSTEM_RESCHEDULED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ProcessPremiumBusTicketForAckDataUseCase(GetLatestPremiumReserveTicketFromFirstBookingIdUseCase getLatestPremiumReserveTicketFromFirstBookingIdUseCase, TimeUtilsContract timeUtilsContract) {
        this.f7319a = timeUtilsContract;
    }
}
