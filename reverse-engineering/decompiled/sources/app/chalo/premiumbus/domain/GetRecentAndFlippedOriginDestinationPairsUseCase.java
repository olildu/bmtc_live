package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/GetRecentAndFlippedOriginDestinationPairsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRecentAndFlippedOriginDestinationPairsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7205a;
    public final CityProvider b;

    public GetRecentAndFlippedOriginDestinationPairsUseCase(PremiumBusRepository premiumBusRepository, CityProvider cityProvider) {
        this.f7205a = premiumBusRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetRecentAndFlippedOriginDestinationPairsUseCase$invoke$1 getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1;
        String lowerCase;
        if (continuationImpl instanceof GetRecentAndFlippedOriginDestinationPairsUseCase$invoke$1) {
            getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1 = (GetRecentAndFlippedOriginDestinationPairsUseCase$invoke$1) continuationImpl;
            int i = getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1 = new GetRecentAndFlippedOriginDestinationPairsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1 = new GetRecentAndFlippedOriginDestinationPairsUseCase$invoke$1(this, continuationImpl);
        }
        Object objM = getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objM);
            String strB = CityProviderKt.b(this.b);
            if (strB != null) {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            String strValueOf = String.valueOf(lowerCase);
            getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1.label = 1;
            objM = this.f7205a.M(strValueOf, getRecentAndFlippedOriginDestinationPairsUseCase$invoke$1);
            if (objM == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objM);
        }
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = (PremiumReserveTicketTripPropertiesAppModel) CollectionsKt.L(0, (List) objM);
        if (premiumReserveTicketTripPropertiesAppModel == null) {
            return EmptyList.f17557a;
        }
        PBOriginDestinationAppModel.INSTANCE.getClass();
        PBOriginDestinationAppModel pBOriginDestinationAppModelA = PBOriginDestinationAppModel.Companion.a(premiumReserveTicketTripPropertiesAppModel);
        return CollectionsKt.S(pBOriginDestinationAppModelA, new PBOriginDestinationAppModel(pBOriginDestinationAppModelA.f7091a, pBOriginDestinationAppModelA.b, pBOriginDestinationAppModelA.h, pBOriginDestinationAppModelA.i, pBOriginDestinationAppModelA.j, null, pBOriginDestinationAppModelA.l, pBOriginDestinationAppModelA.c, pBOriginDestinationAppModelA.d, pBOriginDestinationAppModelA.e, null, pBOriginDestinationAppModelA.g, 29728));
    }
}
