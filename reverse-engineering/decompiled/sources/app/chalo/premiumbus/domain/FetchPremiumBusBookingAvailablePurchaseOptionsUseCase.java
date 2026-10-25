package app.chalo.premiumbus.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PremiumBusAvailableOptionsFetchFailedException;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionsAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPremiumBusBookingAvailablePurchaseOptionsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchPremiumBusBookingAvailablePurchaseOptionsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7194a;
    public final CityProvider b;
    public final CheckIsUserLoggedInUseCase c;

    public FetchPremiumBusBookingAvailablePurchaseOptionsUseCase(PremiumBusRepository premiumBusRepository, CityProvider cityProvider, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase) {
        this.f7194a = premiumBusRepository;
        this.b = cityProvider;
        this.c = checkIsUserLoggedInUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(long j, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        FetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1 fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1;
        if (continuationImpl instanceof FetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1) {
            fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1 = (FetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1) continuationImpl;
            int i = fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1 = new FetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1 = new FetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1(this, continuationImpl);
        }
        FetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1 fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$2 = fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$1;
        Object objJ = fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objJ);
                if (!this.c.a()) {
                    return new ChaloUseCaseResult.Failure(PremiumBusBookingAvailablePurchaseOptionFailureReason.USER_NOT_LOGGED_IN);
                }
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(PremiumBusBookingAvailablePurchaseOptionFailureReason.INVALID_CITY);
                }
                PremiumBusRepository premiumBusRepository = this.f7194a;
                fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$2.label = 1;
                objJ = premiumBusRepository.J(strB, str, str2, str3, j, str4, fetchPremiumBusBookingAvailablePurchaseOptionsUseCase$invoke$2);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objJ);
            }
            return new ChaloUseCaseResult.Success((PremiumBusBookingAvailableOptionsAppModel) objJ);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(PremiumBusBookingAvailablePurchaseOptionFailureReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(PremiumBusBookingAvailablePurchaseOptionFailureReason.PARSE_ERROR);
        } catch (PremiumBusAvailableOptionsFetchFailedException unused3) {
            return new ChaloUseCaseResult.Failure(PremiumBusBookingAvailablePurchaseOptionFailureReason.SERVER_ERROR);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(PremiumBusBookingAvailablePurchaseOptionFailureReason.UNKNOWN_ERROR);
        }
    }
}
