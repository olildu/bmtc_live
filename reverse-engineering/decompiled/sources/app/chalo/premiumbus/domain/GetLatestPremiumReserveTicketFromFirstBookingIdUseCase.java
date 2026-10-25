package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetLatestPremiumReserveTicketFromFirstBookingIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7202a;

    public GetLatestPremiumReserveTicketFromFirstBookingIdUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7202a = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1 getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1;
        if (continuationImpl instanceof GetLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1) {
            getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1 = (GetLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1) continuationImpl;
            int i = getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1 = new GetLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1 = new GetLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1.label = 1;
            objA = this.f7202a.A(str, getLatestPremiumReserveTicketFromFirstBookingIdUseCase$invoke$1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        Iterator it = ((Iterable) objA).iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        long j = ((PremiumReserveTicketAppModel) next).f7113a.b;
        do {
            Object next2 = it.next();
            long j2 = ((PremiumReserveTicketAppModel) next2).f7113a.b;
            if (j < j2) {
                next = next2;
                j = j2;
            }
        } while (it.hasNext());
        return next;
    }
}
