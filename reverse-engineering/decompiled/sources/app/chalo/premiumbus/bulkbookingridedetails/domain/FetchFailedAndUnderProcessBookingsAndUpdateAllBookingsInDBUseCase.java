package app.chalo.premiumbus.bulkbookingridedetails.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.bulkbookingridedetails.data.exception.PbBulkBookingRideDetailsException;
import app.chalo.premiumbus.bulkbookingridedetails.data.exception.PbBulkBookingRideDetailsInvalidDataException;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.PbTripBookingResponseAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRepository;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PbBulkBookingRideDetailsRepository f6896a;
    public final PremiumBusRepository b;

    public FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase(PbBulkBookingRideDetailsRepository pbBulkBookingRideDetailsRepository, PremiumBusRepository premiumBusRepository) {
        this.f6896a = pbBulkBookingRideDetailsRepository;
        this.b = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[Catch: Exception -> 0x00ef, ChaloLocalException -> 0x00f7, NetworkSuccessResponseParseException -> 0x00ff, PbBulkBookingRideDetailsException -> 0x0107, PbBulkBookingRideDetailsInvalidDataException -> 0x010f, TryCatch #2 {ChaloLocalException -> 0x00f7, NetworkSuccessResponseParseException -> 0x00ff, PbBulkBookingRideDetailsException -> 0x0107, PbBulkBookingRideDetailsInvalidDataException -> 0x010f, Exception -> 0x00ef, blocks: (B:13:0x002a, B:41:0x00b0, B:42:0x00bd, B:44:0x00c3, B:46:0x00cd, B:48:0x00d3, B:51:0x00d9, B:52:0x00dd, B:54:0x00e1, B:55:0x00e5, B:18:0x003b, B:24:0x004f, B:26:0x0068, B:28:0x007b, B:29:0x007f, B:31:0x008a, B:33:0x009b, B:36:0x00a0, B:37:0x00a4, B:21:0x0042), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd A[Catch: Exception -> 0x00ef, ChaloLocalException -> 0x00f7, NetworkSuccessResponseParseException -> 0x00ff, PbBulkBookingRideDetailsException -> 0x0107, PbBulkBookingRideDetailsInvalidDataException -> 0x010f, TryCatch #2 {ChaloLocalException -> 0x00f7, NetworkSuccessResponseParseException -> 0x00ff, PbBulkBookingRideDetailsException -> 0x0107, PbBulkBookingRideDetailsInvalidDataException -> 0x010f, Exception -> 0x00ef, blocks: (B:13:0x002a, B:41:0x00b0, B:42:0x00bd, B:44:0x00c3, B:46:0x00cd, B:48:0x00d3, B:51:0x00d9, B:52:0x00dd, B:54:0x00e1, B:55:0x00e5, B:18:0x003b, B:24:0x004f, B:26:0x0068, B:28:0x007b, B:29:0x007f, B:31:0x008a, B:33:0x009b, B:36:0x00a0, B:37:0x00a4, B:21:0x0042), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9 A[Catch: Exception -> 0x00ef, ChaloLocalException -> 0x00f7, NetworkSuccessResponseParseException -> 0x00ff, PbBulkBookingRideDetailsException -> 0x0107, PbBulkBookingRideDetailsInvalidDataException -> 0x010f, TryCatch #2 {ChaloLocalException -> 0x00f7, NetworkSuccessResponseParseException -> 0x00ff, PbBulkBookingRideDetailsException -> 0x0107, PbBulkBookingRideDetailsInvalidDataException -> 0x010f, Exception -> 0x00ef, blocks: (B:13:0x002a, B:41:0x00b0, B:42:0x00bd, B:44:0x00c3, B:46:0x00cd, B:48:0x00d3, B:51:0x00d9, B:52:0x00dd, B:54:0x00e1, B:55:0x00e5, B:18:0x003b, B:24:0x004f, B:26:0x0068, B:28:0x007b, B:29:0x007f, B:31:0x008a, B:33:0x009b, B:36:0x00a0, B:37:0x00a4, B:21:0x0042), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00c3, please report this as an issue */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1 fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1;
        PbTripBookingResponseAppModel pbTripBookingResponseAppModel;
        ArrayList arrayList;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        PremiumReserveTicketStatus premiumReserveTicketStatus;
        if (continuationImpl instanceof FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1) {
            fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1 = (FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1) continuationImpl;
            int i = fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1 = new FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1 = new FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                PbBulkBookingRideDetailsRepository pbBulkBookingRideDetailsRepository = this.f6896a;
                fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.L$0 = str;
                fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.label = 1;
                objA = pbBulkBookingRideDetailsRepository.a(str, fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                str = (String) fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.L$0;
                ResultKt.b(objA);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pbTripBookingResponseAppModel = (PbTripBookingResponseAppModel) fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.L$0;
                ResultKt.b(objA);
            }
            List list = pbTripBookingResponseAppModel.b;
            arrayList = new ArrayList();
            for (Object obj : list) {
                premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
                if (premiumReserveTicketAppModel != null) {
                    premiumReserveTicketStatus = premiumReserveTicketAppModel.f7113a.h;
                } else {
                    premiumReserveTicketStatus = null;
                }
                if (premiumReserveTicketStatus == PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS) {
                    if ((premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.h : null) == PremiumReserveTicketStatus.BOOKING_FAILED) {
                    }
                }
                arrayList.add(obj);
            }
            return new ChaloUseCaseResult.Success(PbTripBookingResponseAppModel.a(pbTripBookingResponseAppModel, arrayList));
            PbTripBookingResponseAppModel pbTripBookingResponseAppModel2 = (PbTripBookingResponseAppModel) objA;
            PremiumBusRepository premiumBusRepository = this.b;
            ArrayList arrayListD = CollectionsKt.D(pbTripBookingResponseAppModel2.b);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayListD.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayListD.get(i4);
                i4++;
                if (((PremiumReserveTicketAppModel) obj2).f7113a.f7114a.length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                PremiumReserveTicketStatus premiumReserveTicketStatus2 = ((PremiumReserveTicketAppModel) obj3).f7113a.h;
                if (premiumReserveTicketStatus2 != PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS && premiumReserveTicketStatus2 != PremiumReserveTicketStatus.BOOKING_FAILED) {
                    arrayList3.add(obj3);
                }
            }
            fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.L$0 = pbTripBookingResponseAppModel2;
            fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1.label = 2;
            if (premiumBusRepository.d(str, arrayList3, fetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase$invoke$1) != coroutineSingletons) {
                pbTripBookingResponseAppModel = pbTripBookingResponseAppModel2;
                List list2 = pbTripBookingResponseAppModel.b;
                arrayList = new ArrayList();
                while (r13.hasNext()) {
                    premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
                    if (premiumReserveTicketAppModel != null) {
                        premiumReserveTicketStatus = premiumReserveTicketAppModel.f7113a.h;
                    } else {
                        premiumReserveTicketStatus = null;
                    }
                    if (premiumReserveTicketStatus == PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS) {
                        if ((premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.h : null) == PremiumReserveTicketStatus.BOOKING_FAILED) {
                        }
                    }
                    arrayList.add(obj);
                }
                return new ChaloUseCaseResult.Success(PbTripBookingResponseAppModel.a(pbTripBookingResponseAppModel, arrayList));
            }
            return coroutineSingletons;
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(PbRideDetailsFetchError.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(PbRideDetailsFetchError.PARSE_ERROR);
        } catch (PbBulkBookingRideDetailsException unused3) {
            return new ChaloUseCaseResult.Failure(PbRideDetailsFetchError.SERVER_ERROR);
        } catch (PbBulkBookingRideDetailsInvalidDataException unused4) {
            return new ChaloUseCaseResult.Failure(PbRideDetailsFetchError.PARSE_ERROR);
        } catch (Exception unused5) {
            return new ChaloUseCaseResult.Failure(PbRideDetailsFetchError.UNKNOWN_ERROR);
        }
    }
}
