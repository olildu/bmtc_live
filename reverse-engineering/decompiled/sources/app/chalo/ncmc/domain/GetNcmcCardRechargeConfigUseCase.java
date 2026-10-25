package app.chalo.ncmc.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.data.error.FetchCardRechargeConfigurationException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/GetNcmcCardRechargeConfigUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetNcmcCardRechargeConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6241a;
    public final CityProvider b;
    public final BasicInfoContract c;

    public GetNcmcCardRechargeConfigUseCase(INcmcCardRepository iNcmcCardRepository, CityProvider cityProvider, BasicInfoContract basicInfoContract) {
        this.f6241a = iNcmcCardRepository;
        this.b = cityProvider;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetNcmcCardRechargeConfigUseCase$invoke$1 getNcmcCardRechargeConfigUseCase$invoke$1;
        String lowerCase;
        if (continuationImpl instanceof GetNcmcCardRechargeConfigUseCase$invoke$1) {
            getNcmcCardRechargeConfigUseCase$invoke$1 = (GetNcmcCardRechargeConfigUseCase$invoke$1) continuationImpl;
            int i = getNcmcCardRechargeConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNcmcCardRechargeConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getNcmcCardRechargeConfigUseCase$invoke$1 = new GetNcmcCardRechargeConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getNcmcCardRechargeConfigUseCase$invoke$1 = new GetNcmcCardRechargeConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object objO = getNcmcCardRechargeConfigUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getNcmcCardRechargeConfigUseCase$invoke$1.label;
        Object obj2 = null;
        try {
            if (i2 == 0) {
                ResultKt.b(objO);
                INcmcCardRepository iNcmcCardRepository = this.f6241a;
                String strB = CityProviderKt.b(this.b);
                if (strB != null) {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                String strValueOf = String.valueOf(lowerCase);
                int iH = this.c.h();
                getNcmcCardRechargeConfigUseCase$invoke$1.label = 1;
                objO = iNcmcCardRepository.o(iH, strValueOf, getNcmcCardRechargeConfigUseCase$invoke$1);
                if (objO == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objO);
            }
            for (Object obj3 : (List) objO) {
                NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = (NcmcCardRechargeConfigAppModel) obj3;
                if (Intrinsics.d(ncmcCardRechargeConfigAppModel.i, Boolean.TRUE) && Intrinsics.d(ncmcCardRechargeConfigAppModel.l, "cardRecharge") && Intrinsics.d(ncmcCardRechargeConfigAppModel.m, "ncmcCardRecharge")) {
                    obj2 = obj3;
                    break;
                }
            }
            NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel2 = (NcmcCardRechargeConfigAppModel) obj2;
            return ncmcCardRechargeConfigAppModel2 != null ? new ChaloUseCaseResult.Success(ncmcCardRechargeConfigAppModel2) : new ChaloUseCaseResult.Failure(NcmcConfigFailureReason.NO_VALID_CONFIG);
        } catch (FetchCardRechargeConfigurationException unused) {
            return new ChaloUseCaseResult.Failure(NcmcConfigFailureReason.SERVER_ERROR);
        } catch (Exception unused2) {
            return new ChaloUseCaseResult.Failure(NcmcConfigFailureReason.UNKNOWN_ERROR);
        }
    }
}
