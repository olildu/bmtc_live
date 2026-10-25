package app.chalo.premiumbus.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PremiumBusSeatSelectionLayoutFetchFailureException;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatSelectionLayoutRequestAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatSelectionLayoutResponseAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchSeatSelectionLayoutUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchSeatSelectionLayoutUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f7197a;
    public final PremiumBusRepository b;

    public FetchSeatSelectionLayoutUseCase(PremiumBusRepository premiumBusRepository, CityProvider cityProvider) {
        this.f7197a = cityProvider;
        this.b = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FetchSeatSelectionLayoutUseCase$invoke$1 fetchSeatSelectionLayoutUseCase$invoke$1;
        Object next;
        if (continuationImpl instanceof FetchSeatSelectionLayoutUseCase$invoke$1) {
            fetchSeatSelectionLayoutUseCase$invoke$1 = (FetchSeatSelectionLayoutUseCase$invoke$1) continuationImpl;
            int i = fetchSeatSelectionLayoutUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchSeatSelectionLayoutUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchSeatSelectionLayoutUseCase$invoke$1 = new FetchSeatSelectionLayoutUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchSeatSelectionLayoutUseCase$invoke$1 = new FetchSeatSelectionLayoutUseCase$invoke$1(this, continuationImpl);
        }
        Object objW = fetchSeatSelectionLayoutUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchSeatSelectionLayoutUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objW);
                String strB = CityProviderKt.b(this.f7197a);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(PremiumBusSeatSelectionLayoutFetchException.INVALID_CITY);
                }
                PremiumBusSeatSelectionLayoutRequestAppModel premiumBusSeatSelectionLayoutRequestAppModel = new PremiumBusSeatSelectionLayoutRequestAppModel(strB, str2, str3, CollectionsKt.R(str));
                PremiumBusRepository premiumBusRepository = this.b;
                fetchSeatSelectionLayoutUseCase$invoke$1.L$0 = str;
                fetchSeatSelectionLayoutUseCase$invoke$1.label = 1;
                objW = premiumBusRepository.w(premiumBusSeatSelectionLayoutRequestAppModel, fetchSeatSelectionLayoutUseCase$invoke$1);
                if (objW == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) fetchSeatSelectionLayoutUseCase$invoke$1.L$0;
                ResultKt.b(objW);
            }
            Iterator it = ((Iterable) objW).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((PremiumBusSeatSelectionLayoutResponseAppModel) next).f7106a, str));
            PremiumBusSeatSelectionLayoutResponseAppModel premiumBusSeatSelectionLayoutResponseAppModel = (PremiumBusSeatSelectionLayoutResponseAppModel) next;
            return premiumBusSeatSelectionLayoutResponseAppModel == null ? new ChaloUseCaseResult.Failure(PremiumBusSeatSelectionLayoutFetchException.NO_LAYOUT_FOUND) : new ChaloUseCaseResult.Success(premiumBusSeatSelectionLayoutResponseAppModel);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(PremiumBusSeatSelectionLayoutFetchException.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(PremiumBusSeatSelectionLayoutFetchException.PARSE_ERROR);
        } catch (PremiumBusSeatSelectionLayoutFetchFailureException unused3) {
            return new ChaloUseCaseResult.Failure(PremiumBusSeatSelectionLayoutFetchException.SERVER_ERROR);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(PremiumBusSeatSelectionLayoutFetchException.UNKNOWN_ERROR);
        }
    }
}
