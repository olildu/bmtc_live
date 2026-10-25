package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.NcmcOfflineRechargeConfirmResponseModel;
import app.chalo.ncmc.data.error.NcmcOfflineRechargeConfirmationFailedException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/ConfirmNcmcOfflineRechargeUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfirmNcmcOfflineRechargeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6224a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;

    public ConfirmNcmcOfflineRechargeUseCase(INcmcCardRepository iNcmcCardRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f6224a = iNcmcCardRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(long j, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        ConfirmNcmcOfflineRechargeUseCase$invoke$1 confirmNcmcOfflineRechargeUseCase$invoke$1;
        if (continuationImpl instanceof ConfirmNcmcOfflineRechargeUseCase$invoke$1) {
            confirmNcmcOfflineRechargeUseCase$invoke$1 = (ConfirmNcmcOfflineRechargeUseCase$invoke$1) continuationImpl;
            int i = confirmNcmcOfflineRechargeUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmNcmcOfflineRechargeUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmNcmcOfflineRechargeUseCase$invoke$1 = new ConfirmNcmcOfflineRechargeUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            confirmNcmcOfflineRechargeUseCase$invoke$1 = new ConfirmNcmcOfflineRechargeUseCase$invoke$1(this, continuationImpl);
        }
        ConfirmNcmcOfflineRechargeUseCase$invoke$1 confirmNcmcOfflineRechargeUseCase$invoke$2 = confirmNcmcOfflineRechargeUseCase$invoke$1;
        Object objI = confirmNcmcOfflineRechargeUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmNcmcOfflineRechargeUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objI);
                INcmcCardRepository iNcmcCardRepository = this.f6224a;
                Intrinsics.h(String.valueOf(CityProviderKt.b(this.c)).toLowerCase(Locale.ROOT), "toLowerCase(...)");
                String strValueOf = String.valueOf(this.b.m());
                confirmNcmcOfflineRechargeUseCase$invoke$2.label = 1;
                objI = iNcmcCardRepository.i(j, str, str2, str3, strValueOf, str4, confirmNcmcOfflineRechargeUseCase$invoke$2);
                if (objI == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objI);
            }
            NcmcOfflineRechargeConfirmResponseModel ncmcOfflineRechargeConfirmResponseModel = (NcmcOfflineRechargeConfirmResponseModel) objI;
            String str5 = ncmcOfflineRechargeConfirmResponseModel.f6047a;
            return (str5 == null || !str5.equalsIgnoreCase("SUCCESS")) ? new ChaloUseCaseResult.Failure(ncmcOfflineRechargeConfirmResponseModel.b) : new ChaloUseCaseResult.Success(Unit.f17538a);
        } catch (NcmcOfflineRechargeConfirmationFailedException e) {
            GenericChaloErrorResponse genericChaloErrorResponse = e.getGenericChaloErrorResponse();
            return new ChaloUseCaseResult.Failure(genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
        } catch (Exception unused) {
            return new ChaloUseCaseResult.Failure(null);
        }
    }
}
