package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/GetPremiumReserveTicketByIdUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumReserveTicketByIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7203a;

    public GetPremiumReserveTicketByIdUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7203a = premiumBusRepository;
    }

    public final Flow a(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return this.f7203a.i(bookingId);
    }
}
