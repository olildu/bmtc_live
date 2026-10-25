package app.chalo.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/IsStopBasedTripPlannerApplicableUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsStopBasedTripPlannerApplicableUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f2512a;
    public final BasicInfoContract b;
    public final ChaloConfigFeature c;
    public final CrashlyticsLogger d;
    public List e;

    public IsStopBasedTripPlannerApplicableUseCase(BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f2512a = cityProvider;
        this.b = basicInfoContract;
        this.c = chaloConfigFeature;
        this.d = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        IsStopBasedTripPlannerApplicableUseCase$invoke$1 isStopBasedTripPlannerApplicableUseCase$invoke$1;
        String str;
        String str2;
        boolean zContains;
        if (continuationImpl instanceof IsStopBasedTripPlannerApplicableUseCase$invoke$1) {
            isStopBasedTripPlannerApplicableUseCase$invoke$1 = (IsStopBasedTripPlannerApplicableUseCase$invoke$1) continuationImpl;
            int i = isStopBasedTripPlannerApplicableUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                isStopBasedTripPlannerApplicableUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                isStopBasedTripPlannerApplicableUseCase$invoke$1 = new IsStopBasedTripPlannerApplicableUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            isStopBasedTripPlannerApplicableUseCase$invoke$1 = new IsStopBasedTripPlannerApplicableUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = isStopBasedTripPlannerApplicableUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = isStopBasedTripPlannerApplicableUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strB = CityProviderKt.b(this.f2512a);
            if (strB == null) {
                return Boolean.FALSE;
            }
            String lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            List list = this.e;
            if (list != null) {
                return Boolean.valueOf(list.contains(lowerCase));
            }
            boolean zF = this.b.f();
            ChaloConfigFeature chaloConfigFeature = this.c;
            if (zF) {
                isStopBasedTripPlannerApplicableUseCase$invoke$1.L$0 = lowerCase;
                isStopBasedTripPlannerApplicableUseCase$invoke$1.label = 1;
                Object objA = chaloConfigFeature.a("cityListForStopBasedTripPlannerDebug", isStopBasedTripPlannerApplicableUseCase$invoke$1);
                if (objA != coroutineSingletons) {
                    str = lowerCase;
                    obj = objA;
                    str2 = (String) obj;
                }
            } else {
                isStopBasedTripPlannerApplicableUseCase$invoke$1.L$0 = lowerCase;
                isStopBasedTripPlannerApplicableUseCase$invoke$1.label = 2;
                Object objA2 = chaloConfigFeature.a("cityListForStopBasedTripPlannerProd", isStopBasedTripPlannerApplicableUseCase$invoke$1);
                if (objA2 != coroutineSingletons) {
                    str = lowerCase;
                    obj = objA2;
                    str2 = (String) obj;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) isStopBasedTripPlannerApplicableUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            str2 = (String) obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) isStopBasedTripPlannerApplicableUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            str2 = (String) obj;
        }
        if (str2 == null || str2.length() == 0) {
            return Boolean.FALSE;
        }
        try {
            Json json = ChaloJson.b;
            json.getClass();
            Object objB = json.b(str2, new ArrayListSerializer(StringSerializer.f18170a));
            this.e = (List) objB;
            zContains = ((List) objB).contains(str);
        } catch (Exception e) {
            this.d.i(e);
            zContains = false;
        }
        return Boolean.valueOf(zContains);
    }
}
