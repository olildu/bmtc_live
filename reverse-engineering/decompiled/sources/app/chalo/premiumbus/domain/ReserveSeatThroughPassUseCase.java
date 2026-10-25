package app.chalo.premiumbus.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.data.exceptions.ReserveSeatThroughPassFailedException;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.app.PBReserveTicketThroughPassResponseAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassUseCase;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReserveSeatThroughPassUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7250a;
    public final FetchPremiumReserveTicketAndStoreLocallyUseCase b;
    public final CheckIsUserLoggedInUseCase c;
    public final CityProvider d;
    public int e = 1;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassUseCase$Companion;", "", "", "MAX_HISTORY_CALL_ATTEMPT_ALLOWED", "I", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ReserveSeatThroughPassUseCase(PremiumBusRepository premiumBusRepository, FetchPremiumReserveTicketAndStoreLocallyUseCase fetchPremiumReserveTicketAndStoreLocallyUseCase, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, CityProvider cityProvider) {
        this.f7250a = premiumBusRepository;
        this.b = fetchPremiumReserveTicketAndStoreLocallyUseCase;
        this.c = checkIsUserLoggedInUseCase;
        this.d = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel, String str, String str2, List list, ContinuationImpl continuationImpl) {
        ReserveSeatThroughPassUseCase$invoke$1 reserveSeatThroughPassUseCase$invoke$1;
        if (continuationImpl instanceof ReserveSeatThroughPassUseCase$invoke$1) {
            reserveSeatThroughPassUseCase$invoke$1 = (ReserveSeatThroughPassUseCase$invoke$1) continuationImpl;
            int i = reserveSeatThroughPassUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reserveSeatThroughPassUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                reserveSeatThroughPassUseCase$invoke$1 = new ReserveSeatThroughPassUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            reserveSeatThroughPassUseCase$invoke$1 = new ReserveSeatThroughPassUseCase$invoke$1(this, continuationImpl);
        }
        ReserveSeatThroughPassUseCase$invoke$1 reserveSeatThroughPassUseCase$invoke$2 = reserveSeatThroughPassUseCase$invoke$1;
        Object objH = reserveSeatThroughPassUseCase$invoke$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reserveSeatThroughPassUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objH);
                if (!this.c.a()) {
                    return new ChaloUseCaseResult.Failure(ReserveSeatThroughPassErrorReasons.UserNotLoggedIn.f7249a);
                }
                PremiumBusRepository premiumBusRepository = this.f7250a;
                String lowerCase = String.valueOf(CityProviderKt.b(this.d)).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                reserveSeatThroughPassUseCase$invoke$2.label = 1;
                objH = premiumBusRepository.H(pBTicketSelectedTripDetailsApiRequestModel, str, str2, lowerCase, list, reserveSeatThroughPassUseCase$invoke$2);
                if (objH == obj) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objH);
                return objH;
            }
            ResultKt.b(objH);
            this.e = 1;
            reserveSeatThroughPassUseCase$invoke$2.label = 2;
            Object objB = b((PBReserveTicketThroughPassResponseAppModel) objH, reserveSeatThroughPassUseCase$invoke$2);
            return objB == obj ? obj : objB;
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(ReserveSeatThroughPassErrorReasons.LocalError.f7245a);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(ReserveSeatThroughPassErrorReasons.ParseError.f7246a);
        } catch (ReserveSeatThroughPassFailedException e) {
            GenericChaloErrorResponse genericChaloErrorResponse = e.getGenericChaloErrorResponse();
            Integer num = genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null;
            return (num != null && num.intValue() == 6034) ? new ChaloUseCaseResult.Failure(new ReserveSeatThroughPassErrorReasons.GenderMismatchError(e.getMessage())) : new ChaloUseCaseResult.Failure(new ReserveSeatThroughPassErrorReasons.ServerError(e.getMessage()));
        } catch (Exception unused3) {
            return new ChaloUseCaseResult.Failure(ReserveSeatThroughPassErrorReasons.UnknownError.f7248a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(PBReserveTicketThroughPassResponseAppModel pBReserveTicketThroughPassResponseAppModel, ContinuationImpl continuationImpl) {
        ReserveSeatThroughPassUseCase$makeHistoryCallForResponse$1 reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1;
        if (continuationImpl instanceof ReserveSeatThroughPassUseCase$makeHistoryCallForResponse$1) {
            reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1 = (ReserveSeatThroughPassUseCase$makeHistoryCallForResponse$1) continuationImpl;
            int i = reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1 = new ReserveSeatThroughPassUseCase$makeHistoryCallForResponse$1(this, continuationImpl);
            }
        } else {
            reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1 = new ReserveSeatThroughPassUseCase$makeHistoryCallForResponse$1(this, continuationImpl);
        }
        Object objA = reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (this.e > 3) {
                return new ChaloUseCaseResult.Failure(ReserveSeatThroughPassErrorReasons.HistoryCallFailed.f7244a);
            }
            String str = pBReserveTicketThroughPassResponseAppModel.f7094a;
            reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.L$0 = pBReserveTicketThroughPassResponseAppModel;
            reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.label = 1;
            objA = this.b.a(str, reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        pBReserveTicketThroughPassResponseAppModel = (PBReserveTicketThroughPassResponseAppModel) reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.L$0;
        ResultKt.b(objA);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ChaloUseCaseResult.Success(pBReserveTicketThroughPassResponseAppModel);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        this.e++;
        reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.L$0 = null;
        reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1.label = 2;
        Object objB = b(pBReserveTicketThroughPassResponseAppModel, reserveSeatThroughPassUseCase$makeHistoryCallForResponse$1);
        return objB == obj ? obj : objB;
    }
}
