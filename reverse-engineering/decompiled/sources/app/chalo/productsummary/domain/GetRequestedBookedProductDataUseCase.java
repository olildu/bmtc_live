package app.chalo.productsummary.domain;

import app.chalo.data.BookingsRequestType;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/domain/GetRequestedBookedProductDataUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRequestedBookedProductDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f8719a;
    public final QuickPayRepository b;
    public final InstantTicketRepository c;
    public final PremiumBusRepository d;
    public final OndcRepository e;
    public final MetroRepository f;
    public final MultiModalGroupTicketRepository g;
    public final CoroutineContextProvider h;
    public final TicketRepository i;

    public GetRequestedBookedProductDataUseCase(SuperPassRepository superPassRepository, QuickPayRepository quickPayRepository, InstantTicketRepository instantTicketRepository, PremiumBusRepository premiumBusRepository, OndcRepository ondcRepository, MetroRepository metroRepository, MultiModalGroupTicketRepository multiModalGroupTicketRepository, CoroutineContextProvider coroutineContextProvider, TicketRepository ticketRepository) {
        this.f8719a = superPassRepository;
        this.b = quickPayRepository;
        this.c = instantTicketRepository;
        this.d = premiumBusRepository;
        this.e = ondcRepository;
        this.f = metroRepository;
        this.g = multiModalGroupTicketRepository;
        this.h = coroutineContextProvider;
        this.i = ticketRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r12 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r12 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
    
        if (r12 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0184, code lost:
    
        if (r12 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        if (r12 == r1) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(final app.chalo.data.BookingsRequestType r10, app.chalo.models.UserBookingsStatusType r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase.a(app.chalo.data.BookingsRequestType, app.chalo.models.UserBookingsStatusType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(BookingsRequestType bookingsRequestType, UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetRequestedBookedProductDataUseCase$invoke$1 getRequestedBookedProductDataUseCase$invoke$1;
        if (continuationImpl instanceof GetRequestedBookedProductDataUseCase$invoke$1) {
            getRequestedBookedProductDataUseCase$invoke$1 = (GetRequestedBookedProductDataUseCase$invoke$1) continuationImpl;
            int i = getRequestedBookedProductDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRequestedBookedProductDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRequestedBookedProductDataUseCase$invoke$1 = new GetRequestedBookedProductDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRequestedBookedProductDataUseCase$invoke$1 = new GetRequestedBookedProductDataUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getRequestedBookedProductDataUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRequestedBookedProductDataUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getRequestedBookedProductDataUseCase$invoke$1.label = 1;
            objA = a(bookingsRequestType, userBookingsStatusType, getRequestedBookedProductDataUseCase$invoke$1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return (Flow) objA;
    }
}
