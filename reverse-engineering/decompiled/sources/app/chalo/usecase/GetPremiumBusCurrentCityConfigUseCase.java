package app.chalo.usecase;

import app.chalo.data.PremiumBusCityWisePollingConfigAppModel;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.data.PremiumBusNativeConfigAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetPremiumBusCurrentCityConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumBusCurrentCityConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f10186a;
    public final GetPremiumBusNativeConfigUseCase b;

    public GetPremiumBusCurrentCityConfigUseCase(CityProvider cityProvider, GetPremiumBusNativeConfigUseCase getPremiumBusNativeConfigUseCase) {
        this.f10186a = cityProvider;
        this.b = getPremiumBusNativeConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetPremiumBusCurrentCityConfigUseCase$invoke$1 getPremiumBusCurrentCityConfigUseCase$invoke$1;
        Object next;
        if (continuationImpl instanceof GetPremiumBusCurrentCityConfigUseCase$invoke$1) {
            getPremiumBusCurrentCityConfigUseCase$invoke$1 = (GetPremiumBusCurrentCityConfigUseCase$invoke$1) continuationImpl;
            int i = getPremiumBusCurrentCityConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPremiumBusCurrentCityConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getPremiumBusCurrentCityConfigUseCase$invoke$1 = new GetPremiumBusCurrentCityConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getPremiumBusCurrentCityConfigUseCase$invoke$1 = new GetPremiumBusCurrentCityConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getPremiumBusCurrentCityConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPremiumBusCurrentCityConfigUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getPremiumBusCurrentCityConfigUseCase$invoke$1.label = 1;
            objA = this.b.a(getPremiumBusCurrentCityConfigUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        List list = ((PremiumBusNativeConfigAppModel) objA).f2380a;
        String lowerCase = null;
        CityProvider cityProvider = this.f10186a;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(((PremiumBusNativeCityWiseConfigAppModel) next).f2378a, String.valueOf(CityProviderKt.b(cityProvider)), true));
            PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel = (PremiumBusNativeCityWiseConfigAppModel) next;
            if (premiumBusNativeCityWiseConfigAppModel != null) {
                return premiumBusNativeCityWiseConfigAppModel;
            }
        }
        String strB = CityProviderKt.b(cityProvider);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        }
        return new PremiumBusNativeCityWiseConfigAppModel(String.valueOf(lowerCase), new PremiumBusCityWisePollingConfigAppModel(), EmptyList.f17557a);
    }
}
