package app.chalo.productsummary.domain;

import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/domain/PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final app.chalo.premiumbus.bulkbookingridedetails.domain.FetchAllPremiumReserveTicketsBookedThroughPassUseCase f8744a;
    public final GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8745a;

        static {
            int[] iArr = new int[SuperPassStatus.values().length];
            try {
                iArr[SuperPassStatus.USED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassStatus.UNUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperPassStatus.PAYMENT_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SuperPassStatus.PAYMENT_PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SuperPassStatus.INACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SuperPassStatus.CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SuperPassStatus.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f8745a = iArr;
        }
    }

    public PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase(app.chalo.premiumbus.bulkbookingridedetails.domain.FetchAllPremiumReserveTicketsBookedThroughPassUseCase fetchAllPremiumReserveTicketsBookedThroughPassUseCase, GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase) {
        this.f8744a = fetchAllPremiumReserveTicketsBookedThroughPassUseCase;
        this.b = getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, SuperPassStatus superPassStatus, ContinuationImpl continuationImpl) {
        PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1 premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1;
        ArrayList arrayList;
        Iterator it;
        Object next;
        long j;
        Object next2;
        long j2;
        Object obj;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        Object objA;
        PremiumReserveTicketStatus premiumReserveTicketStatus;
        if (continuationImpl instanceof PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1) {
            premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1 = (PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1) continuationImpl;
            int i = premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1 = new PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1(this, continuationImpl);
            }
        } else {
            premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1 = new PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1(this, continuationImpl);
        }
        Object objA2 = premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1.label;
        if (i2 == 0) {
            ResultKt.b(objA2);
            switch (WhenMappings.f8745a[superPassStatus.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1.label = 1;
                    objA2 = this.f8744a.a(str, premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1);
                    if (objA2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return new DownloadInvoiceOptionVisibilityState(false, false);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i2 == 1) {
            ResultKt.b(objA2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA2);
                return objA2;
            }
            ResultKt.b(objA2);
        }
        arrayList = new ArrayList();
        for (Object obj2 : (List) objA2) {
            premiumReserveTicketStatus = ((PremiumReserveTicketAppModel) obj2).f7113a.h;
            if (premiumReserveTicketStatus != PremiumReserveTicketStatus.PUNCHED || premiumReserveTicketStatus == PremiumReserveTicketStatus.USED || premiumReserveTicketStatus == PremiumReserveTicketStatus.EXPIRED) {
                arrayList.add(obj2);
            }
        }
        it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                j = ((PremiumReserveTicketAppModel) next).f7113a.b;
                do {
                    next2 = it.next();
                    j2 = ((PremiumReserveTicketAppModel) next2).f7113a.b;
                    if (j > j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
        if (premiumReserveTicketAppModel != null) {
            return new DownloadInvoiceOptionVisibilityState(false, true);
        }
        premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1.label = 3;
        objA = this.b.a(premiumReserveTicketAppModel, premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1);
        if (objA != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objA;
        premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1.label = 2;
        objA2 = FlowKt.t((Flow) objA2, premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1);
        if (objA2 != coroutineSingletons) {
            arrayList = new ArrayList();
            while (r13.hasNext()) {
                premiumReserveTicketStatus = ((PremiumReserveTicketAppModel) obj2).f7113a.h;
                if (premiumReserveTicketStatus != PremiumReserveTicketStatus.PUNCHED) {
                }
                arrayList.add(obj2);
            }
            it = arrayList.iterator();
            if (it.hasNext()) {
                obj = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    j = ((PremiumReserveTicketAppModel) next).f7113a.b;
                    do {
                        next2 = it.next();
                        j2 = ((PremiumReserveTicketAppModel) next2).f7113a.b;
                        if (j > j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            }
            premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
            if (premiumReserveTicketAppModel != null) {
                return new DownloadInvoiceOptionVisibilityState(false, true);
            }
            premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1.label = 3;
            objA = this.b.a(premiumReserveTicketAppModel, premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase$handlePass$1);
            if (objA != coroutineSingletons) {
                return objA;
            }
        }
        return coroutineSingletons;
    }

    public final Object b(ChaloUserBookingType.SuperPassBooking superPassBooking, Continuation continuation) {
        if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            MagicSuperPass magicSuperPass = ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) superPassBooking).d;
            return !magicSuperPass.l() ? new DownloadInvoiceOptionVisibilityState(false, false) : a(magicSuperPass.f9560a.f9566a, magicSuperPass.b.f9582a, (ContinuationImpl) continuation);
        }
        if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
            RideBasedSuperPass rideBasedSuperPass = ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) superPassBooking).d;
            return !rideBasedSuperPass.l() ? new DownloadInvoiceOptionVisibilityState(false, false) : a(rideBasedSuperPass.f9560a.f9566a, rideBasedSuperPass.g.f9582a, (ContinuationImpl) continuation);
        }
        if ((superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) || (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking)) {
            return new DownloadInvoiceOptionVisibilityState(false, false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
