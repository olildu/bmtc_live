package app.chalo.ncmc.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigurationListAppModel;
import app.chalo.ncmc.data.error.FetchCardRechargeConfigurationException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/FetchChaloCardRechargeConfigurationUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchChaloCardRechargeConfigurationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6229a;
    public final CityProvider b;
    public final BasicInfoContract c;

    public FetchChaloCardRechargeConfigurationUseCase(INcmcCardRepository iNcmcCardRepository, CityProvider cityProvider, BasicInfoContract basicInfoContract) {
        this.f6229a = iNcmcCardRepository;
        this.b = cityProvider;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    public final ChaloCardRechargeConfigAppModel a(List list) {
        Object next;
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = (ChaloCardRechargeConfigAppModel) next;
            int iH = this.c.h();
            Boolean bool = chaloCardRechargeConfigAppModel.c;
            boolean z2 = true;
            if (bool != null ? bool.booleanValue() : true) {
                Integer num = chaloCardRechargeConfigAppModel.d;
                if ((num != null ? num.intValue() : 0) > iH) {
                    z = false;
                } else {
                    Integer num2 = chaloCardRechargeConfigAppModel.e;
                    if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) >= iH) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            if (!z || !Intrinsics.d(chaloCardRechargeConfigAppModel.k, "cardRecharge") || !Intrinsics.d(chaloCardRechargeConfigAppModel.l, "cardRecharge")) {
                z2 = false;
            }
            if (z2) {
                return (ChaloCardRechargeConfigAppModel) next;
            }
        }
        next = null;
        return (ChaloCardRechargeConfigAppModel) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        FetchChaloCardRechargeConfigurationUseCase$invoke$1 fetchChaloCardRechargeConfigurationUseCase$invoke$1;
        if (continuationImpl instanceof FetchChaloCardRechargeConfigurationUseCase$invoke$1) {
            fetchChaloCardRechargeConfigurationUseCase$invoke$1 = (FetchChaloCardRechargeConfigurationUseCase$invoke$1) continuationImpl;
            int i = fetchChaloCardRechargeConfigurationUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchChaloCardRechargeConfigurationUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchChaloCardRechargeConfigurationUseCase$invoke$1 = new FetchChaloCardRechargeConfigurationUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchChaloCardRechargeConfigurationUseCase$invoke$1 = new FetchChaloCardRechargeConfigurationUseCase$invoke$1(this, continuationImpl);
        }
        Object objJ = fetchChaloCardRechargeConfigurationUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchChaloCardRechargeConfigurationUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objJ);
                INcmcCardRepository iNcmcCardRepository = this.f6229a;
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    strB = "";
                }
                fetchChaloCardRechargeConfigurationUseCase$invoke$1.label = 1;
                objJ = iNcmcCardRepository.j(strB, fetchChaloCardRechargeConfigurationUseCase$invoke$1);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objJ);
            }
            ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModelA = a(((ChaloCardRechargeConfigurationListAppModel) objJ).f6130a);
            if (chaloCardRechargeConfigAppModelA != null) {
                return new ChaloUseCaseResult.Success(chaloCardRechargeConfigAppModelA);
            }
            FetchChaloCardRechargeConfigurationFailureReason fetchChaloCardRechargeConfigurationFailureReason = FetchChaloCardRechargeConfigurationFailureReason.NO_ACTIVE_RECHARGE_CONFIG_FOUND;
            return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardRechargeConfigurationFailureReason), fetchChaloCardRechargeConfigurationFailureReason.getErrorCode(), null));
        } catch (Exception e) {
            if (!(e instanceof FetchCardRechargeConfigurationException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                FetchChaloCardRechargeConfigurationFailureReason fetchChaloCardRechargeConfigurationFailureReason2 = FetchChaloCardRechargeConfigurationFailureReason.UNKNOWN;
                return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardRechargeConfigurationFailureReason2), fetchChaloCardRechargeConfigurationFailureReason2.getErrorCode(), null));
            }
            GenericChaloErrorResponse genericChaloErrorResponse = ((FetchCardRechargeConfigurationException) e).getGenericChaloErrorResponse();
            if (genericChaloErrorResponse != null) {
                int i3 = genericChaloErrorResponse.f6497a;
                FetchChaloCardRechargeConfigurationFailureReason fetchChaloCardRechargeConfigurationFailureReason3 = FetchChaloCardRechargeConfigurationFailureReason.NO_ACTIVE_RECHARGE_CONFIG_FOUND;
                if (i3 == fetchChaloCardRechargeConfigurationFailureReason3.getErrorCode()) {
                    return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardRechargeConfigurationFailureReason3), fetchChaloCardRechargeConfigurationFailureReason3.getErrorCode(), null));
                }
            }
            FetchChaloCardRechargeConfigurationFailureReason fetchChaloCardRechargeConfigurationFailureReason4 = FetchChaloCardRechargeConfigurationFailureReason.UNKNOWN;
            return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardRechargeConfigurationFailureReason4), fetchChaloCardRechargeConfigurationFailureReason4.getErrorCode(), null));
        }
    }
}
