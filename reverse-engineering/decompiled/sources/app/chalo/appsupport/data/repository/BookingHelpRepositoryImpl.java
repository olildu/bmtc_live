package app.chalo.appsupport.data.repository;

import app.chalo.appsupport.data.models.api.CancelBookingRequestApiModel;
import app.chalo.appsupport.data.models.api.CancelBookingResponseApiModel;
import app.chalo.appsupport.data.models.app.CancelBookingAppModel;
import app.chalo.appsupport.data.remote.BookingHelpRemoteDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/data/repository/BookingHelpRepositoryImpl;", "Lapp/chalo/appsupport/data/repository/BookingHelpRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BookingHelpRepositoryImpl implements BookingHelpRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingHelpRemoteDataSource f982a;

    public BookingHelpRepositoryImpl(BookingHelpRemoteDataSource bookingHelpRemoteDataSource) {
        this.f982a = bookingHelpRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.appsupport.data.repository.BookingHelpRepository
    public final Object a(String str, ContinuationImpl continuationImpl) {
        BookingHelpRepositoryImpl$cancelBooking$1 bookingHelpRepositoryImpl$cancelBooking$1;
        if (continuationImpl instanceof BookingHelpRepositoryImpl$cancelBooking$1) {
            bookingHelpRepositoryImpl$cancelBooking$1 = (BookingHelpRepositoryImpl$cancelBooking$1) continuationImpl;
            int i = bookingHelpRepositoryImpl$cancelBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bookingHelpRepositoryImpl$cancelBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                bookingHelpRepositoryImpl$cancelBooking$1 = new BookingHelpRepositoryImpl$cancelBooking$1(this, continuationImpl);
            }
        } else {
            bookingHelpRepositoryImpl$cancelBooking$1 = new BookingHelpRepositoryImpl$cancelBooking$1(this, continuationImpl);
        }
        Object objB = bookingHelpRepositoryImpl$cancelBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bookingHelpRepositoryImpl$cancelBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            CancelBookingRequestApiModel cancelBookingRequestApiModel = new CancelBookingRequestApiModel(str);
            bookingHelpRepositoryImpl$cancelBooking$1.label = 1;
            objB = this.f982a.b(cancelBookingRequestApiModel, bookingHelpRepositoryImpl$cancelBooking$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        CancelBookingResponseApiModel cancelBookingResponseApiModel = (CancelBookingResponseApiModel) objB;
        Intrinsics.i(cancelBookingResponseApiModel, "<this>");
        return new CancelBookingAppModel(cancelBookingResponseApiModel.f978a.toCancelBookingStatus(), cancelBookingResponseApiModel.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.appsupport.data.repository.BookingHelpRepository
    public final Object b(String str, ContinuationImpl continuationImpl) {
        BookingHelpRepositoryImpl$cancelOndcBooking$1 bookingHelpRepositoryImpl$cancelOndcBooking$1;
        if (continuationImpl instanceof BookingHelpRepositoryImpl$cancelOndcBooking$1) {
            bookingHelpRepositoryImpl$cancelOndcBooking$1 = (BookingHelpRepositoryImpl$cancelOndcBooking$1) continuationImpl;
            int i = bookingHelpRepositoryImpl$cancelOndcBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bookingHelpRepositoryImpl$cancelOndcBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                bookingHelpRepositoryImpl$cancelOndcBooking$1 = new BookingHelpRepositoryImpl$cancelOndcBooking$1(this, continuationImpl);
            }
        } else {
            bookingHelpRepositoryImpl$cancelOndcBooking$1 = new BookingHelpRepositoryImpl$cancelOndcBooking$1(this, continuationImpl);
        }
        Object objA = bookingHelpRepositoryImpl$cancelOndcBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bookingHelpRepositoryImpl$cancelOndcBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            CancelBookingRequestApiModel cancelBookingRequestApiModel = new CancelBookingRequestApiModel(str);
            bookingHelpRepositoryImpl$cancelOndcBooking$1.label = 1;
            objA = this.f982a.a(cancelBookingRequestApiModel, bookingHelpRepositoryImpl$cancelOndcBooking$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        CancelBookingResponseApiModel cancelBookingResponseApiModel = (CancelBookingResponseApiModel) objA;
        Intrinsics.i(cancelBookingResponseApiModel, "<this>");
        return new CancelBookingAppModel(cancelBookingResponseApiModel.f978a.toCancelBookingStatus(), cancelBookingResponseApiModel.b);
    }
}
