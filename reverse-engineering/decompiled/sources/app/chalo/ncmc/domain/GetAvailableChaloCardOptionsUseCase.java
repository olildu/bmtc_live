package app.chalo.ncmc.domain;

import app.chalo.models.ChaloCardOption;
import app.chalo.models.ChaloCardOptions;
import app.chalo.ncmc.data.CardOptions;
import app.chalo.ncmc.data.CityWiseCardOptions;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/GetAvailableChaloCardOptionsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAvailableChaloCardOptionsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetChaloCardExpOptionsUseCase f6234a;
    public final CityProvider b;

    public GetAvailableChaloCardOptionsUseCase(GetChaloCardExpOptionsUseCase getChaloCardExpOptionsUseCase, CityProvider cityProvider) {
        this.f6234a = getChaloCardExpOptionsUseCase;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetAvailableChaloCardOptionsUseCase$invoke$1 getAvailableChaloCardOptionsUseCase$invoke$1;
        CityAppModel cityAppModel;
        String str;
        Object next;
        ChaloCardOption chaloCardOptionValueOf;
        if (continuationImpl instanceof GetAvailableChaloCardOptionsUseCase$invoke$1) {
            getAvailableChaloCardOptionsUseCase$invoke$1 = (GetAvailableChaloCardOptionsUseCase$invoke$1) continuationImpl;
            int i = getAvailableChaloCardOptionsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAvailableChaloCardOptionsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAvailableChaloCardOptionsUseCase$invoke$1 = new GetAvailableChaloCardOptionsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getAvailableChaloCardOptionsUseCase$invoke$1 = new GetAvailableChaloCardOptionsUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getAvailableChaloCardOptionsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAvailableChaloCardOptionsUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getAvailableChaloCardOptionsUseCase$invoke$1.label = 1;
            objA = this.f6234a.a(getAvailableChaloCardOptionsUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        CardOptions cardOptions = (CardOptions) objA;
        if (cardOptions != null && (cityAppModel = (CityAppModel) this.b.b().getValue()) != null && (str = cityAppModel.f8854a) != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            Iterator it = cardOptions.f6024a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((CityWiseCardOptions) next).f6028a, lowerCase));
            CityWiseCardOptions cityWiseCardOptions = (CityWiseCardOptions) next;
            if (cityWiseCardOptions != null) {
                List list = cityWiseCardOptions.b;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        chaloCardOptionValueOf = ChaloCardOption.valueOf((String) it2.next());
                    } catch (Exception unused) {
                        chaloCardOptionValueOf = null;
                    }
                    if (chaloCardOptionValueOf != null) {
                        arrayList.add(chaloCardOptionValueOf);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new ChaloCardOptions(cityWiseCardOptions.c, cityWiseCardOptions.d, arrayList);
                }
            }
        }
        return null;
    }
}
