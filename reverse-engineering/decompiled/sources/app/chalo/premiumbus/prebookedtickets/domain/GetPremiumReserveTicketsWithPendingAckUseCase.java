package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/GetPremiumReserveTicketsWithPendingAckUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumReserveTicketsWithPendingAckUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7312a;
    public final CityProvider b;
    public final UserProfileDetailsProvider c;
    public final CheckIsUserLoggedInUseCase d;
    public final BasicInfoContract e;
    public final GetPremiumBusCurrentCityConfigUseCase f;
    public PremiumBusNativeCityWiseConfigAppModel g;

    public GetPremiumReserveTicketsWithPendingAckUseCase(PremiumBusRepository premiumBusRepository, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, GetLatestPremiumReserveTicketFromFirstBookingIdUseCase getLatestPremiumReserveTicketFromFirstBookingIdUseCase, BasicInfoContract basicInfoContract, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase) {
        this.f7312a = premiumBusRepository;
        this.b = cityProvider;
        this.c = userProfileDetailsProvider;
        this.d = checkIsUserLoggedInUseCase;
        this.e = basicInfoContract;
        this.f = getPremiumBusCurrentCityConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(GetPremiumReserveTicketsWithPendingAckUseCase getPremiumReserveTicketsWithPendingAckUseCase, PremiumReserveTicketAppModel premiumReserveTicketAppModel, ContinuationImpl continuationImpl) {
        GetPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1 getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1;
        long j;
        getPremiumReserveTicketsWithPendingAckUseCase.getClass();
        if (continuationImpl instanceof GetPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1) {
            getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1 = (GetPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1) continuationImpl;
            int i = getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.label = i - Integer.MIN_VALUE;
            } else {
                getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1 = new GetPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1(getPremiumReserveTicketsWithPendingAckUseCase, continuationImpl);
            }
        } else {
            getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1 = new GetPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1(getPremiumReserveTicketsWithPendingAckUseCase, continuationImpl);
        }
        Object objB = getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            vo1.x("isLatestBookingInActiveState: ", premiumReserveTicketAppModel.f7113a.k, "message");
            FirstBookingAppModel firstBookingAppModel = premiumReserveTicketAppModel.f7113a.l;
            if (firstBookingAppModel == null) {
                return Boolean.FALSE;
            }
            long jAbs = Math.abs(premiumReserveTicketAppModel.b.b - firstBookingAppModel.c);
            getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.L$0 = premiumReserveTicketAppModel;
            getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.J$0 = jAbs;
            getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.label = 1;
            objB = getPremiumReserveTicketsWithPendingAckUseCase.b(getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1);
            if (objB == obj) {
                return obj;
            }
            j = jAbs;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.J$0;
            premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) getPremiumReserveTicketsWithPendingAckUseCase$isLatestBookingInActiveState$1.L$0;
            ResultKt.b(objB);
        }
        return Boolean.valueOf(premiumReserveTicketAppModel.a(getPremiumReserveTicketsWithPendingAckUseCase.e.j()) && ((j > ((PremiumBusNativeCityWiseConfigAppModel) objB).e.h ? 1 : (j == ((PremiumBusNativeCityWiseConfigAppModel) objB).e.h ? 0 : -1)) > 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        GetPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1 getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1;
        if (continuationImpl instanceof GetPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1) {
            getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1 = (GetPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1) continuationImpl;
            int i = getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1 = new GetPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1(this, continuationImpl);
            }
        } else {
            getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1 = new GetPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1(this, continuationImpl);
        }
        Object objA = getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel = this.g;
            if (premiumBusNativeCityWiseConfigAppModel != null) {
                return premiumBusNativeCityWiseConfigAppModel;
            }
            getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1.label = 1;
            objA = this.f.a(getPremiumReserveTicketsWithPendingAckUseCase$currentCityConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel2 = (PremiumBusNativeCityWiseConfigAppModel) objA;
        this.g = premiumBusNativeCityWiseConfigAppModel2;
        return premiumBusNativeCityWiseConfigAppModel2;
    }
}
