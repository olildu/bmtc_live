package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketFareAndPassengerPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.domain.GetRecentPremiumBusProductsPurchasedUseCase", f = "GetRecentPremiumBusProductsPurchasedUseCase.kt", l = {17}, m = "invoke", v = 1)
final class GetRecentPremiumBusProductsPurchasedUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetRecentPremiumBusProductsPurchasedUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecentPremiumBusProductsPurchasedUseCase$invoke$1(GetRecentPremiumBusProductsPurchasedUseCase getRecentPremiumBusProductsPurchasedUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = getRecentPremiumBusProductsPurchasedUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetRecentPremiumBusProductsPurchasedUseCase$invoke$1 getRecentPremiumBusProductsPurchasedUseCase$invoke$1;
        String lowerCase;
        String str;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        GetRecentPremiumBusProductsPurchasedUseCase getRecentPremiumBusProductsPurchasedUseCase = this.this$0;
        getRecentPremiumBusProductsPurchasedUseCase.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            getRecentPremiumBusProductsPurchasedUseCase$invoke$1 = this;
        } else {
            getRecentPremiumBusProductsPurchasedUseCase$invoke$1 = new GetRecentPremiumBusProductsPurchasedUseCase$invoke$1(getRecentPremiumBusProductsPurchasedUseCase, this);
        }
        Object objV = getRecentPremiumBusProductsPurchasedUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRecentPremiumBusProductsPurchasedUseCase$invoke$1.label;
        ArrayList arrayList = null;
        if (i2 == 0) {
            ResultKt.b(objV);
            PremiumBusRepository premiumBusRepository = getRecentPremiumBusProductsPurchasedUseCase.f7206a;
            CityAppModel cityAppModel = (CityAppModel) getRecentPremiumBusProductsPurchasedUseCase.b.getE().getValue();
            if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
                lowerCase = null;
            } else {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            }
            Flow flowA = PremiumBusRepository.DefaultImpls.a(premiumBusRepository, String.valueOf(lowerCase), null, 6);
            getRecentPremiumBusProductsPurchasedUseCase$invoke$1.label = 1;
            objV = FlowKt.v(flowA, getRecentPremiumBusProductsPurchasedUseCase$invoke$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        List list = (List) objV;
        if (list != null) {
            List<PremiumReserveTicketAppModel> list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (PremiumReserveTicketAppModel premiumReserveTicketAppModel : list2) {
                PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
                String str2 = premiumReserveTicketBookingPropertiesAppModel.f7114a;
                String str3 = premiumReserveTicketBookingPropertiesAppModel.c;
                long j = premiumReserveTicketBookingPropertiesAppModel.b;
                String str4 = premiumReserveTicketBookingPropertiesAppModel.d;
                String str5 = premiumReserveTicketBookingPropertiesAppModel.e;
                PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
                PremiumStopDetailsAppModel premiumStopDetailsAppModel = premiumReserveTicketTripPropertiesAppModel.g;
                PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = premiumReserveTicketTripPropertiesAppModel.h;
                PremiumReserveTicketFareAndPassengerPropertiesAppModel premiumReserveTicketFareAndPassengerPropertiesAppModel = premiumReserveTicketAppModel.d;
                arrayList.add(new PremiumBusRecentProductsPurchased.PreBookTicket(str2, str3, j, str4, str5, premiumStopDetailsAppModel, premiumStopDetailsAppModel2, premiumReserveTicketFareAndPassengerPropertiesAppModel.f7115a, premiumReserveTicketFareAndPassengerPropertiesAppModel.b));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList2.size() > 1) {
            CollectionsKt.t0(arrayList2, new GetRecentPremiumBusProductsPurchasedUseCase$invoke$lambda$1$$inlined$sortByDescending$1());
        }
        return arrayList2;
    }
}
