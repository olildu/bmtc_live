package app.chalo.mticket.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/CheckIfFreeRideAvailableUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIfFreeRideAvailableUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f5722a;
    public final BasicInfoContract b;
    public final CityProvider c;
    public List d;

    public CheckIfFreeRideAvailableUseCase(ChaloConfigFeature chaloConfigFeature, BasicInfoContract basicInfoContract, CityProvider cityProvider) {
        this.f5722a = chaloConfigFeature;
        this.b = basicInfoContract;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x001f A[RETURN] */
    public static boolean b(String str, List list) {
        for (Object obj : list) {
            if (StringsKt.x((String) obj, str, true)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        CheckIfFreeRideAvailableUseCase$invoke$1 checkIfFreeRideAvailableUseCase$invoke$1;
        String str;
        String str2;
        Object objB;
        if (continuationImpl instanceof CheckIfFreeRideAvailableUseCase$invoke$1) {
            checkIfFreeRideAvailableUseCase$invoke$1 = (CheckIfFreeRideAvailableUseCase$invoke$1) continuationImpl;
            int i = checkIfFreeRideAvailableUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIfFreeRideAvailableUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIfFreeRideAvailableUseCase$invoke$1 = new CheckIfFreeRideAvailableUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            checkIfFreeRideAvailableUseCase$invoke$1 = new CheckIfFreeRideAvailableUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = checkIfFreeRideAvailableUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkIfFreeRideAvailableUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strB = CityProviderKt.b(this.c);
            if (strB == null) {
                return Boolean.FALSE;
            }
            List list = this.d;
            if (list != null) {
                return Boolean.valueOf(b(strB, list));
            }
            boolean zF = this.b.f();
            ChaloConfigFeature chaloConfigFeature = this.f5722a;
            if (zF) {
                checkIfFreeRideAvailableUseCase$invoke$1.L$0 = strB;
                checkIfFreeRideAvailableUseCase$invoke$1.label = 1;
                Object objA = chaloConfigFeature.a("cityListForFreeRidesDebug", checkIfFreeRideAvailableUseCase$invoke$1);
                if (objA != coroutineSingletons) {
                    str = strB;
                    obj = objA;
                    str2 = (String) obj;
                }
            } else {
                checkIfFreeRideAvailableUseCase$invoke$1.L$0 = strB;
                checkIfFreeRideAvailableUseCase$invoke$1.label = 2;
                Object objA2 = chaloConfigFeature.a("cityListForFreeRides", checkIfFreeRideAvailableUseCase$invoke$1);
                if (objA2 != coroutineSingletons) {
                    str = strB;
                    obj = objA2;
                    str2 = (String) obj;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) checkIfFreeRideAvailableUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            str2 = (String) obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) checkIfFreeRideAvailableUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            str2 = (String) obj;
        }
        if (str2.length() == 0) {
            return Boolean.FALSE;
        }
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str2, new ArrayListSerializer(StringSerializer.f18170a));
        } catch (Exception unused) {
            objB = null;
        }
        List list2 = (List) objB;
        if (list2 == null) {
            return Boolean.FALSE;
        }
        this.d = list2;
        return Boolean.valueOf(b(str, list2));
    }
}
