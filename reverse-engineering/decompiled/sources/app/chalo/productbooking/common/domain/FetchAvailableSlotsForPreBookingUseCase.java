package app.chalo.productbooking.common.domain;

import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.data.exceptions.PBPreBookingSlotsFetchFailedException;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.productbooking.common.data.models.app.request.AvailableSlotsRequestForPBPreBookingAppModel;
import app.chalo.productbooking.common.data.models.app.response.AvailableSlotsResponseForPBPreBookingAppModel;
import app.chalo.productbooking.common.data.models.app.response.SlotAvailableOnDateInfo;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.dialog.DateAvailabilityStatus;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productbooking/common/domain/FetchAvailableSlotsForPreBookingUseCase;", "", "AvailableSlotsForPreBookingFetchFailedReason", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchAvailableSlotsForPreBookingUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f8259a;
    public final CityProvider b;
    public final StringProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lapp/chalo/productbooking/common/domain/FetchAvailableSlotsForPreBookingUseCase$AvailableSlotsForPreBookingFetchFailedReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "UNKNOWN_ERROR", "CITY_NOT_FOUND", "NO_SLOTS", "INTERNAL_SERVER_ERROR", "UNKNOWN_SERVER_ERROR", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum AvailableSlotsForPreBookingFetchFailedReason {
        UNKNOWN_ERROR(0),
        CITY_NOT_FOUND(1),
        NO_SLOTS(2),
        INTERNAL_SERVER_ERROR(1004),
        UNKNOWN_SERVER_ERROR(1001);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
        private final int errorCode;

        AvailableSlotsForPreBookingFetchFailedReason(int i) {
            this.errorCode = i;
        }

        public static EnumEntries<AvailableSlotsForPreBookingFetchFailedReason> getEntries() {
            return $ENTRIES;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public FetchAvailableSlotsForPreBookingUseCase(PremiumBusRepository premiumBusRepository, CityProvider cityProvider, StringProvider stringProvider) {
        this.f8259a = premiumBusRepository;
        this.b = cityProvider;
        this.c = stringProvider;
    }

    public static ChaloUseCaseResult.Failure a(AvailableSlotsForPreBookingFetchFailedReason availableSlotsForPreBookingFetchFailedReason, String str) {
        return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(availableSlotsForPreBookingFetchFailedReason), availableSlotsForPreBookingFetchFailedReason.getErrorCode(), str));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x011a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:19:0x0053, B:70:0x0135, B:24:0x0063, B:48:0x00e0, B:25:0x0068, B:42:0x00c1, B:44:0x00cb, B:50:0x00ea, B:52:0x00f2, B:66:0x0120, B:55:0x00fc, B:56:0x0100, B:58:0x0106, B:60:0x0112, B:62:0x0116, B:64:0x011a, B:28:0x0074, B:37:0x0098, B:31:0x007b, B:33:0x0083, B:39:0x00a2), top: B:101:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:19:0x0053, B:70:0x0135, B:24:0x0063, B:48:0x00e0, B:25:0x0068, B:42:0x00c1, B:44:0x00cb, B:50:0x00ea, B:52:0x00f2, B:66:0x0120, B:55:0x00fc, B:56:0x0100, B:58:0x0106, B:60:0x0112, B:62:0x0116, B:64:0x011a, B:28:0x0074, B:37:0x0098, B:31:0x007b, B:33:0x0083, B:39:0x00a2), top: B:101:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:19:0x0053, B:70:0x0135, B:24:0x0063, B:48:0x00e0, B:25:0x0068, B:42:0x00c1, B:44:0x00cb, B:50:0x00ea, B:52:0x00f2, B:66:0x0120, B:55:0x00fc, B:56:0x0100, B:58:0x0106, B:60:0x0112, B:62:0x0116, B:64:0x011a, B:28:0x0074, B:37:0x0098, B:31:0x007b, B:33:0x0083, B:39:0x00a2), top: B:101:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0106 A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:19:0x0053, B:70:0x0135, B:24:0x0063, B:48:0x00e0, B:25:0x0068, B:42:0x00c1, B:44:0x00cb, B:50:0x00ea, B:52:0x00f2, B:66:0x0120, B:55:0x00fc, B:56:0x0100, B:58:0x0106, B:60:0x0112, B:62:0x0116, B:64:0x011a, B:28:0x0074, B:37:0x0098, B:31:0x007b, B:33:0x0083, B:39:0x00a2), top: B:101:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0112 A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:19:0x0053, B:70:0x0135, B:24:0x0063, B:48:0x00e0, B:25:0x0068, B:42:0x00c1, B:44:0x00cb, B:50:0x00ea, B:52:0x00f2, B:66:0x0120, B:55:0x00fc, B:56:0x0100, B:58:0x0106, B:60:0x0112, B:62:0x0116, B:64:0x011a, B:28:0x0074, B:37:0x0098, B:31:0x007b, B:33:0x0083, B:39:0x00a2), top: B:101:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(List list, String str, String str2, String str3, long j, long j2, long j3, ContinuationImpl continuationImpl) {
        FetchAvailableSlotsForPreBookingUseCase$invoke$1 fetchAvailableSlotsForPreBookingUseCase$invoke$1;
        AvailableSlotsForPreBookingFetchFailedReason availableSlotsForPreBookingFetchFailedReason;
        FetchAvailableSlotsForPreBookingUseCase fetchAvailableSlotsForPreBookingUseCase;
        AvailableSlotsForPreBookingFetchFailedReason next;
        AvailableSlotsForPreBookingFetchFailedReason availableSlotsForPreBookingFetchFailedReason2;
        FetchAvailableSlotsForPreBookingUseCase fetchAvailableSlotsForPreBookingUseCase2;
        AvailableSlotsResponseForPBPreBookingAppModel availableSlotsResponseForPBPreBookingAppModel;
        List list2;
        Iterator it;
        DateAvailabilityStatus dateAvailabilityStatus;
        AvailableSlotsForPreBookingFetchFailedReason availableSlotsForPreBookingFetchFailedReason3;
        FetchAvailableSlotsForPreBookingUseCase fetchAvailableSlotsForPreBookingUseCase3;
        AvailableSlotsForPreBookingFetchFailedReason availableSlotsForPreBookingFetchFailedReason4;
        FetchAvailableSlotsForPreBookingUseCase fetchAvailableSlotsForPreBookingUseCase4;
        if (continuationImpl instanceof FetchAvailableSlotsForPreBookingUseCase$invoke$1) {
            fetchAvailableSlotsForPreBookingUseCase$invoke$1 = (FetchAvailableSlotsForPreBookingUseCase$invoke$1) continuationImpl;
            int i = fetchAvailableSlotsForPreBookingUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchAvailableSlotsForPreBookingUseCase$invoke$1 = new FetchAvailableSlotsForPreBookingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchAvailableSlotsForPreBookingUseCase$invoke$1 = new FetchAvailableSlotsForPreBookingUseCase$invoke$1(this, continuationImpl);
        }
        Object objK = fetchAvailableSlotsForPreBookingUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchAvailableSlotsForPreBookingUseCase$invoke$1.label;
        StringProvider stringProvider = this.c;
        try {
            if (i2 == 0) {
                ResultKt.b(objK);
                String strH = this.b.h();
                if (strH == null) {
                    availableSlotsForPreBookingFetchFailedReason2 = AvailableSlotsForPreBookingFetchFailedReason.CITY_NOT_FOUND;
                    fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0 = this;
                    fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1 = availableSlotsForPreBookingFetchFailedReason2;
                    fetchAvailableSlotsForPreBookingUseCase$invoke$1.label = 1;
                    objK = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], fetchAvailableSlotsForPreBookingUseCase$invoke$1);
                    if (objK != coroutineSingletons) {
                        fetchAvailableSlotsForPreBookingUseCase2 = this;
                        fetchAvailableSlotsForPreBookingUseCase2.getClass();
                        return a(availableSlotsForPreBookingFetchFailedReason2, (String) objK);
                    }
                } else {
                    PremiumBusRepository premiumBusRepository = this.f8259a;
                    AvailableSlotsRequestForPBPreBookingAppModel availableSlotsRequestForPBPreBookingAppModel = new AvailableSlotsRequestForPBPreBookingAppModel(str, str2, str3, list, j, j2, j3);
                    fetchAvailableSlotsForPreBookingUseCase$invoke$1.label = 2;
                    objK = premiumBusRepository.K(availableSlotsRequestForPBPreBookingAppModel, strH, fetchAvailableSlotsForPreBookingUseCase$invoke$1);
                    if (objK != coroutineSingletons) {
                        availableSlotsResponseForPBPreBookingAppModel = (AvailableSlotsResponseForPBPreBookingAppModel) objK;
                        if (availableSlotsResponseForPBPreBookingAppModel.f8232a.isEmpty()) {
                            availableSlotsForPreBookingFetchFailedReason4 = AvailableSlotsForPreBookingFetchFailedReason.NO_SLOTS;
                            fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0 = this;
                            fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1 = availableSlotsForPreBookingFetchFailedReason4;
                            fetchAvailableSlotsForPreBookingUseCase$invoke$1.label = 3;
                            objK = stringProvider.b(StringEnum.TRY_CHANGING_DATES, new Object[0], fetchAvailableSlotsForPreBookingUseCase$invoke$1);
                            if (objK == coroutineSingletons) {
                                fetchAvailableSlotsForPreBookingUseCase4 = this;
                                fetchAvailableSlotsForPreBookingUseCase4.getClass();
                                return a(availableSlotsForPreBookingFetchFailedReason4, (String) objK);
                            }
                        } else {
                            list2 = availableSlotsResponseForPBPreBookingAppModel.f8232a;
                            if (list2 instanceof Collection) {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    dateAvailabilityStatus = ((SlotAvailableOnDateInfo) it.next()).c;
                                    if (dateAvailabilityStatus != DateAvailabilityStatus.FEW_SEATS_LEFT) {
                                    }
                                    return new ChaloUseCaseResult.Success(availableSlotsResponseForPBPreBookingAppModel);
                                }
                            }
                            it = list2.iterator();
                            while (it.hasNext()) {
                                dateAvailabilityStatus = ((SlotAvailableOnDateInfo) it.next()).c;
                                if (dateAvailabilityStatus != DateAvailabilityStatus.FEW_SEATS_LEFT) {
                                }
                                return new ChaloUseCaseResult.Success(availableSlotsResponseForPBPreBookingAppModel);
                            }
                            availableSlotsForPreBookingFetchFailedReason3 = AvailableSlotsForPreBookingFetchFailedReason.NO_SLOTS;
                            fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0 = this;
                            fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1 = availableSlotsForPreBookingFetchFailedReason3;
                            fetchAvailableSlotsForPreBookingUseCase$invoke$1.label = 4;
                            objK = stringProvider.b(StringEnum.TRY_CHANGING_DATES, new Object[0], fetchAvailableSlotsForPreBookingUseCase$invoke$1);
                            if (objK == coroutineSingletons) {
                                fetchAvailableSlotsForPreBookingUseCase3 = this;
                                fetchAvailableSlotsForPreBookingUseCase3.getClass();
                                return a(availableSlotsForPreBookingFetchFailedReason3, (String) objK);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                availableSlotsForPreBookingFetchFailedReason2 = (AvailableSlotsForPreBookingFetchFailedReason) fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1;
                fetchAvailableSlotsForPreBookingUseCase2 = (FetchAvailableSlotsForPreBookingUseCase) fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0;
                ResultKt.b(objK);
                fetchAvailableSlotsForPreBookingUseCase2.getClass();
                return a(availableSlotsForPreBookingFetchFailedReason2, (String) objK);
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    availableSlotsForPreBookingFetchFailedReason4 = (AvailableSlotsForPreBookingFetchFailedReason) fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1;
                    fetchAvailableSlotsForPreBookingUseCase4 = (FetchAvailableSlotsForPreBookingUseCase) fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0;
                    ResultKt.b(objK);
                    fetchAvailableSlotsForPreBookingUseCase4.getClass();
                    return a(availableSlotsForPreBookingFetchFailedReason4, (String) objK);
                }
                if (i2 == 4) {
                    availableSlotsForPreBookingFetchFailedReason3 = (AvailableSlotsForPreBookingFetchFailedReason) fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1;
                    fetchAvailableSlotsForPreBookingUseCase3 = (FetchAvailableSlotsForPreBookingUseCase) fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0;
                    ResultKt.b(objK);
                    fetchAvailableSlotsForPreBookingUseCase3.getClass();
                    return a(availableSlotsForPreBookingFetchFailedReason3, (String) objK);
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                availableSlotsForPreBookingFetchFailedReason = (AvailableSlotsForPreBookingFetchFailedReason) fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1;
                fetchAvailableSlotsForPreBookingUseCase = (FetchAvailableSlotsForPreBookingUseCase) fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0;
                ResultKt.b(objK);
                fetchAvailableSlotsForPreBookingUseCase.getClass();
                return a(availableSlotsForPreBookingFetchFailedReason, (String) objK);
            }
            ResultKt.b(objK);
            availableSlotsResponseForPBPreBookingAppModel = (AvailableSlotsResponseForPBPreBookingAppModel) objK;
            if (availableSlotsResponseForPBPreBookingAppModel.f8232a.isEmpty()) {
                availableSlotsForPreBookingFetchFailedReason4 = AvailableSlotsForPreBookingFetchFailedReason.NO_SLOTS;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0 = this;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1 = availableSlotsForPreBookingFetchFailedReason4;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.label = 3;
                objK = stringProvider.b(StringEnum.TRY_CHANGING_DATES, new Object[0], fetchAvailableSlotsForPreBookingUseCase$invoke$1);
                if (objK == coroutineSingletons) {
                    fetchAvailableSlotsForPreBookingUseCase4 = this;
                    fetchAvailableSlotsForPreBookingUseCase4.getClass();
                    return a(availableSlotsForPreBookingFetchFailedReason4, (String) objK);
                }
            } else {
                list2 = availableSlotsResponseForPBPreBookingAppModel.f8232a;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        dateAvailabilityStatus = ((SlotAvailableOnDateInfo) it.next()).c;
                        if (dateAvailabilityStatus != DateAvailabilityStatus.FEW_SEATS_LEFT || dateAvailabilityStatus == DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE || dateAvailabilityStatus == DateAvailabilityStatus.AVAILABLE) {
                            return new ChaloUseCaseResult.Success(availableSlotsResponseForPBPreBookingAppModel);
                        }
                    }
                }
                availableSlotsForPreBookingFetchFailedReason3 = AvailableSlotsForPreBookingFetchFailedReason.NO_SLOTS;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0 = this;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1 = availableSlotsForPreBookingFetchFailedReason3;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.label = 4;
                objK = stringProvider.b(StringEnum.TRY_CHANGING_DATES, new Object[0], fetchAvailableSlotsForPreBookingUseCase$invoke$1);
                if (objK == coroutineSingletons) {
                    fetchAvailableSlotsForPreBookingUseCase3 = this;
                    fetchAvailableSlotsForPreBookingUseCase3.getClass();
                    return a(availableSlotsForPreBookingFetchFailedReason3, (String) objK);
                }
            }
            return coroutineSingletons;
        } catch (Exception e) {
            if (!(e instanceof PBPreBookingSlotsFetchFailedException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                AvailableSlotsForPreBookingFetchFailedReason availableSlotsForPreBookingFetchFailedReason5 = AvailableSlotsForPreBookingFetchFailedReason.UNKNOWN_ERROR;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$0 = this;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.L$1 = availableSlotsForPreBookingFetchFailedReason5;
                fetchAvailableSlotsForPreBookingUseCase$invoke$1.label = 5;
                Object objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], fetchAvailableSlotsForPreBookingUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    availableSlotsForPreBookingFetchFailedReason = availableSlotsForPreBookingFetchFailedReason5;
                    objK = objB;
                    fetchAvailableSlotsForPreBookingUseCase = this;
                }
                return coroutineSingletons;
            }
            PBPreBookingSlotsFetchFailedException pBPreBookingSlotsFetchFailedException = (PBPreBookingSlotsFetchFailedException) e;
            GenericChaloErrorResponse genericChaloErrorResponse = pBPreBookingSlotsFetchFailedException.getGenericChaloErrorResponse();
            int errorCode = genericChaloErrorResponse != null ? genericChaloErrorResponse.f6497a : AvailableSlotsForPreBookingFetchFailedReason.UNKNOWN_ERROR.getErrorCode();
            Iterator<AvailableSlotsForPreBookingFetchFailedReason> it2 = AvailableSlotsForPreBookingFetchFailedReason.getEntries().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (next.getErrorCode() != errorCode);
            AvailableSlotsForPreBookingFetchFailedReason availableSlotsForPreBookingFetchFailedReason6 = next;
            if (availableSlotsForPreBookingFetchFailedReason6 == null) {
                availableSlotsForPreBookingFetchFailedReason6 = AvailableSlotsForPreBookingFetchFailedReason.UNKNOWN_ERROR;
            }
            GenericChaloErrorResponse genericChaloErrorResponse2 = pBPreBookingSlotsFetchFailedException.getGenericChaloErrorResponse();
            return a(availableSlotsForPreBookingFetchFailedReason6, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
        }
    }
}
