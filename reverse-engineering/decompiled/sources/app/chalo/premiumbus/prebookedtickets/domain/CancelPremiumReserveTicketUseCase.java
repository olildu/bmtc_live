package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.data.PBTicketCancellationRequestAppResponseModel;
import app.chalo.data.PbTicketCancellationRequestStatus;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.premiumbus.data.exceptions.PBTicketUserCancellationFailedException;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domain.FetchPremiumReserveTicketAndStoreLocallyUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CancelPremiumReserveTicketUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7300a;
    public final FetchPremiumReserveTicketAndStoreLocallyUseCase b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7301a;

        static {
            int[] iArr = new int[PbTicketCancellationRequestStatus.values().length];
            try {
                iArr[PbTicketCancellationRequestStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PbTicketCancellationRequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PbTicketCancellationRequestStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7301a = iArr;
        }
    }

    public CancelPremiumReserveTicketUseCase(PremiumBusRepository premiumBusRepository, FetchPremiumReserveTicketAndStoreLocallyUseCase fetchPremiumReserveTicketAndStoreLocallyUseCase) {
        this.f7300a = premiumBusRepository;
        this.b = fetchPremiumReserveTicketAndStoreLocallyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008d A[Catch: PBTicketUserCancellationFailedException -> 0x0032, ChaloLocalException -> 0x00a2, Exception -> 0x00ae, TryCatch #2 {ChaloLocalException -> 0x00a2, PBTicketUserCancellationFailedException -> 0x0032, Exception -> 0x00ae, blocks: (B:14:0x002e, B:41:0x0087, B:43:0x008d, B:45:0x0095, B:47:0x0099, B:49:0x009c, B:50:0x00a1, B:21:0x0042, B:28:0x005d, B:34:0x0072, B:35:0x0077, B:37:0x0079, B:24:0x0049), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[Catch: PBTicketUserCancellationFailedException -> 0x0032, ChaloLocalException -> 0x00a2, Exception -> 0x00ae, TryCatch #2 {ChaloLocalException -> 0x00a2, PBTicketUserCancellationFailedException -> 0x0032, Exception -> 0x00ae, blocks: (B:14:0x002e, B:41:0x0087, B:43:0x008d, B:45:0x0095, B:47:0x0099, B:49:0x009c, B:50:0x00a1, B:21:0x0042, B:28:0x005d, B:34:0x0072, B:35:0x0077, B:37:0x0079, B:24:0x0049), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0099 A[Catch: PBTicketUserCancellationFailedException -> 0x0032, ChaloLocalException -> 0x00a2, Exception -> 0x00ae, TryCatch #2 {ChaloLocalException -> 0x00a2, PBTicketUserCancellationFailedException -> 0x0032, Exception -> 0x00ae, blocks: (B:14:0x002e, B:41:0x0087, B:43:0x008d, B:45:0x0095, B:47:0x0099, B:49:0x009c, B:50:0x00a1, B:21:0x0042, B:28:0x005d, B:34:0x0072, B:35:0x0077, B:37:0x0079, B:24:0x0049), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c A[Catch: PBTicketUserCancellationFailedException -> 0x0032, ChaloLocalException -> 0x00a2, Exception -> 0x00ae, TryCatch #2 {ChaloLocalException -> 0x00a2, PBTicketUserCancellationFailedException -> 0x0032, Exception -> 0x00ae, blocks: (B:14:0x002e, B:41:0x0087, B:43:0x008d, B:45:0x0095, B:47:0x0099, B:49:0x009c, B:50:0x00a1, B:21:0x0042, B:28:0x005d, B:34:0x0072, B:35:0x0077, B:37:0x0079, B:24:0x0049), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, ContinuationImpl continuationImpl) {
        CancelPremiumReserveTicketUseCase$invoke$1 cancelPremiumReserveTicketUseCase$invoke$1;
        String str2;
        PBTicketCancellationRequestAppResponseModel pBTicketCancellationRequestAppResponseModel;
        ChaloUseCaseResult chaloUseCaseResult;
        if (continuationImpl instanceof CancelPremiumReserveTicketUseCase$invoke$1) {
            cancelPremiumReserveTicketUseCase$invoke$1 = (CancelPremiumReserveTicketUseCase$invoke$1) continuationImpl;
            int i = cancelPremiumReserveTicketUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cancelPremiumReserveTicketUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                cancelPremiumReserveTicketUseCase$invoke$1 = new CancelPremiumReserveTicketUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            cancelPremiumReserveTicketUseCase$invoke$1 = new CancelPremiumReserveTicketUseCase$invoke$1(this, continuationImpl);
        }
        CancelPremiumReserveTicketUseCase$invoke$1 cancelPremiumReserveTicketUseCase$invoke$2 = cancelPremiumReserveTicketUseCase$invoke$1;
        Object objB = cancelPremiumReserveTicketUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cancelPremiumReserveTicketUseCase$invoke$2.label;
        CancelPremiumReserveTicketResult.UnknownError unknownError = CancelPremiumReserveTicketResult.UnknownError.f7299a;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                PremiumBusRepository premiumBusRepository = this.f7300a;
                cancelPremiumReserveTicketUseCase$invoke$2.L$0 = str;
                cancelPremiumReserveTicketUseCase$invoke$2.label = 1;
                objB = premiumBusRepository.B(str, "mobileTicket", "premiumReserveTicket", premiumBusProductModificationReasonAppModel, cancelPremiumReserveTicketUseCase$invoke$2);
                if (objB != coroutineSingletons) {
                    str2 = str;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                str2 = (String) cancelPremiumReserveTicketUseCase$invoke$2.L$0;
                ResultKt.b(objB);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pBTicketCancellationRequestAppResponseModel = (PBTicketCancellationRequestAppResponseModel) cancelPremiumReserveTicketUseCase$invoke$2.L$0;
                ResultKt.b(objB);
            }
            chaloUseCaseResult = (ChaloUseCaseResult) objB;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                return new CancelPremiumReserveTicketResult.Success(pBTicketCancellationRequestAppResponseModel.b);
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                return CancelPremiumReserveTicketResult.TicketSyncFailed.f7298a;
            }
            throw new NoWhenBranchMatchedException();
            PBTicketCancellationRequestAppResponseModel pBTicketCancellationRequestAppResponseModel2 = (PBTicketCancellationRequestAppResponseModel) objB;
            int i3 = WhenMappings.f7301a[pBTicketCancellationRequestAppResponseModel2.f2362a.ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return unknownError;
            }
            FetchPremiumReserveTicketAndStoreLocallyUseCase fetchPremiumReserveTicketAndStoreLocallyUseCase = this.b;
            cancelPremiumReserveTicketUseCase$invoke$2.L$0 = pBTicketCancellationRequestAppResponseModel2;
            cancelPremiumReserveTicketUseCase$invoke$2.label = 2;
            objB = fetchPremiumReserveTicketAndStoreLocallyUseCase.a(str2, cancelPremiumReserveTicketUseCase$invoke$2);
            if (objB != coroutineSingletons) {
                pBTicketCancellationRequestAppResponseModel = pBTicketCancellationRequestAppResponseModel2;
                chaloUseCaseResult = (ChaloUseCaseResult) objB;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    return new CancelPremiumReserveTicketResult.Success(pBTicketCancellationRequestAppResponseModel.b);
                }
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    return CancelPremiumReserveTicketResult.TicketSyncFailed.f7298a;
                }
                throw new NoWhenBranchMatchedException();
            }
            return coroutineSingletons;
        } catch (ChaloLocalException unused) {
            return CancelPremiumReserveTicketResult.LocalError.f7295a;
        } catch (PBTicketUserCancellationFailedException e) {
            return new CancelPremiumReserveTicketResult.ServerError(e.getMessage());
        } catch (Exception unused2) {
            return unknownError;
        }
    }
}
