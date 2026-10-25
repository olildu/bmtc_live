package app.chalo.multimodalticket.domain;

import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.productbooking.common.domain.FetchMobileTicketProductByIdUseCase;
import app.chalo.productbooking.common.domain.MobileTicketByIdFetchFailedReason;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/domain/FetchMultiModalGroupTicketAndStoreLocallyUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchMultiModalGroupTicketAndStoreLocallyUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModalGroupTicketRepository f5883a;
    public final FetchMobileTicketProductByIdUseCase b;
    public final GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase c;
    public final UserProfileDetailsProvider d;
    public final CityProvider e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5884a;

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
            f5884a = iArr;
        }
    }

    public FetchMultiModalGroupTicketAndStoreLocallyUseCase(MultiModalGroupTicketRepository multiModalGroupTicketRepository, FetchMobileTicketProductByIdUseCase fetchMobileTicketProductByIdUseCase, GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase getMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f5883a = multiModalGroupTicketRepository;
        this.b = fetchMobileTicketProductByIdUseCase;
        this.c = getMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase;
        this.d = userProfileDetailsProvider;
        this.e = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1 fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1;
        String strM;
        String str2;
        FetchMultiModalGroupTicketFailureReason fetchMultiModalGroupTicketFailureReason;
        if (continuationImpl instanceof FetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1) {
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1 = (FetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1) continuationImpl;
            int i = fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1 = new FetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1 = new FetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            strM = this.d.m();
            if (strM == null) {
                return new ChaloUseCaseResult.Failure(FetchMultiModalGroupTicketFailureReason.USER_NOT_LOGGED_IN);
            }
            String strH = this.e.h();
            if (strH == null) {
                return new ChaloUseCaseResult.Failure(FetchMultiModalGroupTicketFailureReason.CITY_MISSING);
            }
            String lowerCase = strH.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.L$0 = strM;
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.L$1 = lowerCase;
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.label = 1;
            Object objA = this.b.a(str, "mobileTicket", "multiModalTicket", fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1);
            if (objA != obj2) {
                obj = objA;
                str2 = lowerCase;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        str2 = (String) fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.L$1;
        strM = (String) fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.L$0;
        ResultKt.b(obj);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            MultiModalGroupTicketAppModel multiModalGroupTicketAppModelA = this.c.a((GenericMobileTicketProductApiResponseModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
            if (multiModalGroupTicketAppModelA == null) {
                return new ChaloUseCaseResult.Failure(FetchMultiModalGroupTicketFailureReason.INVALID_TICKET_RECEIVED);
            }
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.L$0 = null;
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.L$1 = null;
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1.label = 2;
            Object objB = b(strM, str2, multiModalGroupTicketAppModelA, fetchMultiModalGroupTicketAndStoreLocallyUseCase$invoke$1);
            return objB == obj2 ? obj2 : objB;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.f5884a[((MobileTicketByIdFetchFailedReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        if (i3 == 1) {
            fetchMultiModalGroupTicketFailureReason = FetchMultiModalGroupTicketFailureReason.NO_TICKET_RECEIVED;
        } else if (i3 == 2) {
            fetchMultiModalGroupTicketFailureReason = FetchMultiModalGroupTicketFailureReason.SERVER_ERROR;
        } else if (i3 == 3) {
            fetchMultiModalGroupTicketFailureReason = FetchMultiModalGroupTicketFailureReason.LOCAL_ERROR;
        } else if (i3 == 4) {
            fetchMultiModalGroupTicketFailureReason = FetchMultiModalGroupTicketFailureReason.UNKNOWN_ERROR;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            fetchMultiModalGroupTicketFailureReason = FetchMultiModalGroupTicketFailureReason.PARSE_ERROR;
        }
        return new ChaloUseCaseResult.Failure(fetchMultiModalGroupTicketFailureReason);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, MultiModalGroupTicketAppModel multiModalGroupTicketAppModel, ContinuationImpl continuationImpl) {
        FetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1 fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1;
        if (continuationImpl instanceof FetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1) {
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1 = (FetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1) continuationImpl;
            int i = fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1 = new FetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1(this, continuationImpl);
            }
        } else {
            fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1 = new FetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1(this, continuationImpl);
        }
        Object objH = fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objH);
                MultiModalGroupTicketRepository multiModalGroupTicketRepository = this.f5883a;
                fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1.label = 1;
                objH = multiModalGroupTicketRepository.h(str, str2, multiModalGroupTicketAppModel, fetchMultiModalGroupTicketAndStoreLocallyUseCase$persistGroupTicket$1);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objH);
            }
            return ((Boolean) objH).booleanValue() ? new ChaloUseCaseResult.Success(Unit.f17538a) : new ChaloUseCaseResult.Failure(FetchMultiModalGroupTicketFailureReason.LOCAL_ERROR);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new ChaloUseCaseResult.Failure(FetchMultiModalGroupTicketFailureReason.LOCAL_ERROR);
        }
    }
}
