package app.chalo.premiumbus.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/GetPremiumReserveTicketsWithPendingTripFeedbackUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumReserveTicketsWithPendingTripFeedbackUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7204a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;
    public final BasicInfoContract d;

    public GetPremiumReserveTicketsWithPendingTripFeedbackUseCase(BasicInfoContract basicInfoContract, PremiumBusRepository premiumBusRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f7204a = premiumBusRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        GetPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1 getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1;
        String str;
        String str2;
        PremiumBusRepository premiumBusRepository;
        long j2;
        int i;
        if (continuationImpl instanceof GetPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1) {
            getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1 = (GetPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1) continuationImpl;
            int i2 = getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1 = new GetPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1 = new GetPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1(this, continuationImpl);
        }
        GetPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1 getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2 = getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$1;
        Object obj = getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            UserProfileDetailsProvider userProfileDetailsProvider = this.b;
            if (!((Boolean) userProfileDetailsProvider.g().getValue()).booleanValue()) {
                return EmptyList.f17557a;
            }
            String strM = userProfileDetailsProvider.m();
            if (strM == null) {
                return EmptyList.f17557a;
            }
            String strB = CityProviderKt.b(this.c);
            if (strB == null) {
                return EmptyList.f17557a;
            }
            String lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            PremiumBusRepository premiumBusRepository2 = this.f7204a;
            getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$0 = premiumBusRepository2;
            getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$1 = strM;
            getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$2 = lowerCase;
            getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.J$0 = j;
            getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.label = 1;
            Object objC = this.d.c(getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2);
            if (objC != coroutineSingletons) {
                str = strM;
                obj = objC;
                str2 = lowerCase;
                premiumBusRepository = premiumBusRepository2;
                j2 = j;
                i = 2;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        long j3 = getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.J$0;
        String str3 = (String) getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$2;
        String str4 = (String) getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$1;
        PremiumBusRepository premiumBusRepository3 = (PremiumBusRepository) getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$0;
        ResultKt.b(obj);
        str2 = str3;
        premiumBusRepository = premiumBusRepository3;
        j2 = j3;
        i = 2;
        str = str4;
        long jLongValue = ((Number) obj).longValue();
        getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$0 = null;
        getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$1 = null;
        getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.L$2 = null;
        getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2.label = i;
        Serializable serializableL = premiumBusRepository.L(str, str2, j2, jLongValue, getPremiumReserveTicketsWithPendingTripFeedbackUseCase$invoke$2);
        return serializableL == coroutineSingletons ? coroutineSingletons : serializableL;
    }
}
