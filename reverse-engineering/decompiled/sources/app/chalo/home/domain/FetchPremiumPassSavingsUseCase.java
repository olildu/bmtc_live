package app.chalo.home.domain;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.home.data.exceptions.PremiumPassSavingException;
import app.chalo.home.data.exceptions.PremiumPassSavingInvalidDataException;
import app.chalo.home.data.model.PremiumPassSavingsInfo;
import app.chalo.home.data.model.app.response.PassSavingResponseAppModel;
import app.chalo.home.data.repository.PremiumPassSavingRemoteRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/domain/FetchPremiumPassSavingsUseCase;", "", "PremiumPassSavingsFetchException", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchPremiumPassSavingsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumPassSavingRemoteRepository f2996a;
    public final UserProfileDetailsProvider b;
    public final PremiumBusDataStoreWrapper c;
    public final CurrencyFeature d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/home/domain/FetchPremiumPassSavingsUseCase$PremiumPassSavingsFetchException;", "", "<init>", "(Ljava/lang/String;I)V", "NO_USER_FOUND", "NO_PASS_SAVINGS", "INVALID_DATA_ERROR", "SERVER_ERROR", "LOCAL_ERROR", "UNKNOWN_ERROR", "PARSE_ERROR", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum PremiumPassSavingsFetchException {
        NO_USER_FOUND,
        NO_PASS_SAVINGS,
        INVALID_DATA_ERROR,
        SERVER_ERROR,
        LOCAL_ERROR,
        UNKNOWN_ERROR,
        PARSE_ERROR;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<PremiumPassSavingsFetchException> getEntries() {
            return $ENTRIES;
        }
    }

    public FetchPremiumPassSavingsUseCase(PremiumPassSavingRemoteRepository premiumPassSavingRemoteRepository, UserProfileDetailsProvider userProfileDetailsProvider, PremiumBusDataStoreWrapper premiumBusDataStoreWrapper, CurrencyFeature currencyFeature) {
        this.f2996a = premiumPassSavingRemoteRepository;
        this.b = userProfileDetailsProvider;
        this.c = premiumBusDataStoreWrapper;
        this.d = currencyFeature;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[Catch: Exception -> 0x00f8, ChaloLocalException -> 0x0100, NetworkSuccessResponseParseException -> 0x0108, PremiumPassSavingInvalidDataException -> 0x0110, PremiumPassSavingException -> 0x0118, TryCatch #2 {PremiumPassSavingException -> 0x0118, PremiumPassSavingInvalidDataException -> 0x0110, ChaloLocalException -> 0x0100, NetworkSuccessResponseParseException -> 0x0108, Exception -> 0x00f8, blocks: (B:14:0x003b, B:50:0x00bf, B:52:0x00c5, B:54:0x00cd, B:58:0x00e1, B:19:0x004c, B:39:0x009e, B:41:0x00a6, B:45:0x00ae, B:36:0x008c), top: B:66:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[Catch: Exception -> 0x00f8, ChaloLocalException -> 0x0100, NetworkSuccessResponseParseException -> 0x0108, PremiumPassSavingInvalidDataException -> 0x0110, PremiumPassSavingException -> 0x0118, TryCatch #2 {PremiumPassSavingException -> 0x0118, PremiumPassSavingInvalidDataException -> 0x0110, ChaloLocalException -> 0x0100, NetworkSuccessResponseParseException -> 0x0108, Exception -> 0x00f8, blocks: (B:14:0x003b, B:50:0x00bf, B:52:0x00c5, B:54:0x00cd, B:58:0x00e1, B:19:0x004c, B:39:0x009e, B:41:0x00a6, B:45:0x00ae, B:36:0x008c), top: B:66:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd A[Catch: Exception -> 0x00f8, ChaloLocalException -> 0x0100, NetworkSuccessResponseParseException -> 0x0108, PremiumPassSavingInvalidDataException -> 0x0110, PremiumPassSavingException -> 0x0118, TryCatch #2 {PremiumPassSavingException -> 0x0118, PremiumPassSavingInvalidDataException -> 0x0110, ChaloLocalException -> 0x0100, NetworkSuccessResponseParseException -> 0x0108, Exception -> 0x00f8, blocks: (B:14:0x003b, B:50:0x00bf, B:52:0x00c5, B:54:0x00cd, B:58:0x00e1, B:19:0x004c, B:39:0x009e, B:41:0x00a6, B:45:0x00ae, B:36:0x008c), top: B:66:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchPremiumPassSavingsUseCase$invoke$1 fetchPremiumPassSavingsUseCase$invoke$1;
        String strM;
        long jLongValue;
        long j;
        PassSavingResponseAppModel passSavingResponseAppModel;
        long j2;
        String strM2;
        PassSavingResponseAppModel passSavingResponseAppModel2;
        long j3;
        long j4;
        CurrencyFeature currencyFeature = this.d;
        if (continuationImpl instanceof FetchPremiumPassSavingsUseCase$invoke$1) {
            fetchPremiumPassSavingsUseCase$invoke$1 = (FetchPremiumPassSavingsUseCase$invoke$1) continuationImpl;
            int i = fetchPremiumPassSavingsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchPremiumPassSavingsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchPremiumPassSavingsUseCase$invoke$1 = new FetchPremiumPassSavingsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchPremiumPassSavingsUseCase$invoke$1 = new FetchPremiumPassSavingsUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = fetchPremiumPassSavingsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchPremiumPassSavingsUseCase$invoke$1.label;
        String str = "";
        PremiumBusDataStoreWrapper premiumBusDataStoreWrapper = this.c;
        UserProfileDetailsProvider userProfileDetailsProvider = this.b;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.b(objV);
                strM = userProfileDetailsProvider.m();
                if (strM == null) {
                    return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.NO_USER_FOUND);
                }
                String strM3 = userProfileDetailsProvider.m();
                if (strM3 == null) {
                    strM3 = "";
                }
                LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1H = premiumBusDataStoreWrapper.h(strM3);
                fetchPremiumPassSavingsUseCase$invoke$1.L$0 = strM;
                fetchPremiumPassSavingsUseCase$invoke$1.label = 1;
                objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1H, fetchPremiumPassSavingsUseCase$invoke$1);
                if (objV != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                strM = (String) fetchPremiumPassSavingsUseCase$invoke$1.L$0;
                ResultKt.b(objV);
            } else {
                if (i2 == 2) {
                    jLongValue = fetchPremiumPassSavingsUseCase$invoke$1.J$0;
                    ResultKt.b(objV);
                    j = 0;
                    passSavingResponseAppModel = (PassSavingResponseAppModel) objV;
                    j2 = passSavingResponseAppModel.f2965a;
                    if (j2 != jLongValue) {
                        strM2 = userProfileDetailsProvider.m();
                        if (strM2 == null) {
                            str = strM2;
                        }
                        fetchPremiumPassSavingsUseCase$invoke$1.L$0 = passSavingResponseAppModel;
                        fetchPremiumPassSavingsUseCase$invoke$1.J$0 = jLongValue;
                        fetchPremiumPassSavingsUseCase$invoke$1.label = 3;
                        if (premiumBusDataStoreWrapper.f(j2, str, fetchPremiumPassSavingsUseCase$invoke$1) != coroutineSingletons) {
                            passSavingResponseAppModel2 = passSavingResponseAppModel;
                            j3 = jLongValue;
                        }
                        return coroutineSingletons;
                    }
                    j4 = passSavingResponseAppModel.f2965a;
                    if (j4 <= j) {
                        return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.NO_PASS_SAVINGS);
                    }
                    CurrencyRoundOffLogic currencyRoundOffLogic = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_FLOOR;
                    int iF = (int) currencyFeature.f(jLongValue, currencyRoundOffLogic);
                    int iF2 = (int) currencyFeature.f(j4, currencyRoundOffLogic);
                    if (jLongValue >= j4) {
                        z = false;
                    }
                    return new ChaloUseCaseResult.Success(new PremiumPassSavingsInfo(new Integer(iF), new Integer(iF2), currencyFeature.d(), z));
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = fetchPremiumPassSavingsUseCase$invoke$1.J$0;
                passSavingResponseAppModel2 = (PassSavingResponseAppModel) fetchPremiumPassSavingsUseCase$invoke$1.L$0;
                ResultKt.b(objV);
                j = 0;
            }
            passSavingResponseAppModel = passSavingResponseAppModel2;
            jLongValue = j3;
            j4 = passSavingResponseAppModel.f2965a;
            if (j4 <= j) {
                return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.NO_PASS_SAVINGS);
            }
            CurrencyRoundOffLogic currencyRoundOffLogic2 = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_FLOOR;
            int iF3 = (int) currencyFeature.f(jLongValue, currencyRoundOffLogic2);
            int iF4 = (int) currencyFeature.f(j4, currencyRoundOffLogic2);
            if (jLongValue >= j4) {
                z = false;
            }
            return new ChaloUseCaseResult.Success(new PremiumPassSavingsInfo(new Integer(iF3), new Integer(iF4), currencyFeature.d(), z));
            Long l = (Long) objV;
            jLongValue = l != null ? l.longValue() : 0L;
            PremiumPassSavingRemoteRepository premiumPassSavingRemoteRepository = this.f2996a;
            j = 0;
            fetchPremiumPassSavingsUseCase$invoke$1.L$0 = null;
            fetchPremiumPassSavingsUseCase$invoke$1.J$0 = jLongValue;
            fetchPremiumPassSavingsUseCase$invoke$1.label = 2;
            objV = premiumPassSavingRemoteRepository.a(strM, fetchPremiumPassSavingsUseCase$invoke$1);
            if (objV != coroutineSingletons) {
                passSavingResponseAppModel = (PassSavingResponseAppModel) objV;
                j2 = passSavingResponseAppModel.f2965a;
                if (j2 != jLongValue) {
                    strM2 = userProfileDetailsProvider.m();
                    if (strM2 == null) {
                        str = strM2;
                    }
                    fetchPremiumPassSavingsUseCase$invoke$1.L$0 = passSavingResponseAppModel;
                    fetchPremiumPassSavingsUseCase$invoke$1.J$0 = jLongValue;
                    fetchPremiumPassSavingsUseCase$invoke$1.label = 3;
                    if (premiumBusDataStoreWrapper.f(j2, str, fetchPremiumPassSavingsUseCase$invoke$1) != coroutineSingletons) {
                        passSavingResponseAppModel2 = passSavingResponseAppModel;
                        j3 = jLongValue;
                        passSavingResponseAppModel = passSavingResponseAppModel2;
                        jLongValue = j3;
                    }
                }
                j4 = passSavingResponseAppModel.f2965a;
                if (j4 <= j) {
                    return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.NO_PASS_SAVINGS);
                }
                CurrencyRoundOffLogic currencyRoundOffLogic3 = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_FLOOR;
                int iF5 = (int) currencyFeature.f(jLongValue, currencyRoundOffLogic3);
                int iF6 = (int) currencyFeature.f(j4, currencyRoundOffLogic3);
                if (jLongValue >= j4) {
                    z = false;
                }
                return new ChaloUseCaseResult.Success(new PremiumPassSavingsInfo(new Integer(iF5), new Integer(iF6), currencyFeature.d(), z));
            }
            return coroutineSingletons;
        } catch (PremiumPassSavingException unused) {
            return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.SERVER_ERROR);
        } catch (PremiumPassSavingInvalidDataException unused2) {
            return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.INVALID_DATA_ERROR);
        } catch (ChaloLocalException unused3) {
            return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused4) {
            return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.PARSE_ERROR);
        } catch (Exception unused5) {
            return new ChaloUseCaseResult.Failure(PremiumPassSavingsFetchException.UNKNOWN_ERROR);
        }
    }
}
