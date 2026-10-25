package app.chalo.domain;

import app.chalo.models.bookinghelp.BookingHelpConfigAppModel;
import app.chalo.models.bookinghelp.BookingHelpFaq;
import app.chalo.models.bookinghelp.BookingHelpFaqGroupType;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetBookingHelpFaqsUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetBookingHelpFaqsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetBookingHelpRemoteConfigUseCase f2489a;

    public GetBookingHelpFaqsUseCase(GetBookingHelpRemoteConfigUseCase getBookingHelpRemoteConfigUseCase) {
        this.f2489a = getBookingHelpRemoteConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BookingHelpFaqGroupType bookingHelpFaqGroupType, ContinuationImpl continuationImpl) {
        GetBookingHelpFaqsUseCase$invoke$1 getBookingHelpFaqsUseCase$invoke$1;
        if (continuationImpl instanceof GetBookingHelpFaqsUseCase$invoke$1) {
            getBookingHelpFaqsUseCase$invoke$1 = (GetBookingHelpFaqsUseCase$invoke$1) continuationImpl;
            int i = getBookingHelpFaqsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBookingHelpFaqsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getBookingHelpFaqsUseCase$invoke$1 = new GetBookingHelpFaqsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getBookingHelpFaqsUseCase$invoke$1 = new GetBookingHelpFaqsUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getBookingHelpFaqsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getBookingHelpFaqsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                GetBookingHelpRemoteConfigUseCase getBookingHelpRemoteConfigUseCase = this.f2489a;
                getBookingHelpFaqsUseCase$invoke$1.L$0 = bookingHelpFaqGroupType;
                getBookingHelpFaqsUseCase$invoke$1.label = 1;
                objA = getBookingHelpRemoteConfigUseCase.a(getBookingHelpFaqsUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bookingHelpFaqGroupType = (BookingHelpFaqGroupType) getBookingHelpFaqsUseCase$invoke$1.L$0;
                ResultKt.b(objA);
            }
            BookingHelpConfigAppModel bookingHelpConfigAppModel = (BookingHelpConfigAppModel) objA;
            if (bookingHelpConfigAppModel.b.isEmpty()) {
                return new ChaloUseCaseResult.Failure(BookingHelpFaqsErrorType.FaqsNotAvailableForCity.f2481a);
            }
            List list = bookingHelpConfigAppModel.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BookingHelpFaq) obj).e == bookingHelpFaqGroupType) {
                    arrayList.add(obj);
                }
            }
            List listV0 = CollectionsKt.v0(new GetBookingHelpFaqsUseCase$invoke$$inlined$sortedBy$1(), arrayList);
            return listV0.isEmpty() ? new ChaloUseCaseResult.Failure(BookingHelpFaqsErrorType.NoFaqsFoundForGroup.f2483a) : new ChaloUseCaseResult.Success(listV0);
        } catch (Exception unused) {
            return new ChaloUseCaseResult.Failure(BookingHelpFaqsErrorType.Generic.f2482a);
        }
    }
}
