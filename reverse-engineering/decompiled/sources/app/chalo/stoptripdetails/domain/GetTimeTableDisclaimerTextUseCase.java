package app.chalo.stoptripdetails.domain;

import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/domain/GetTimeTableDisclaimerTextUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetTimeTableDisclaimerTextUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f9507a;
    public final BasicInfoContract b;
    public final CrashlyticsLogger c;

    public GetTimeTableDisclaimerTextUseCase(BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature) {
        this.f9507a = chaloConfigFeature;
        this.b = basicInfoContract;
        this.c = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(TimeTableStatus timeTableStatus, int i, ContinuationImpl continuationImpl) {
        GetTimeTableDisclaimerTextUseCase$invoke$1 getTimeTableDisclaimerTextUseCase$invoke$1;
        Object obj;
        int i2;
        String strS;
        Object obj2;
        String str;
        if (continuationImpl instanceof GetTimeTableDisclaimerTextUseCase$invoke$1) {
            getTimeTableDisclaimerTextUseCase$invoke$1 = (GetTimeTableDisclaimerTextUseCase$invoke$1) continuationImpl;
            int i3 = getTimeTableDisclaimerTextUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getTimeTableDisclaimerTextUseCase$invoke$1.label = i3 - Integer.MIN_VALUE;
            } else {
                getTimeTableDisclaimerTextUseCase$invoke$1 = new GetTimeTableDisclaimerTextUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getTimeTableDisclaimerTextUseCase$invoke$1 = new GetTimeTableDisclaimerTextUseCase$invoke$1(this, continuationImpl);
        }
        Object obj3 = getTimeTableDisclaimerTextUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = getTimeTableDisclaimerTextUseCase$invoke$1.label;
        if (i4 == 0) {
            ResultKt.b(obj3);
            boolean zF = this.b.f();
            ChaloConfigFeature chaloConfigFeature = this.f9507a;
            if (zF) {
                getTimeTableDisclaimerTextUseCase$invoke$1.L$0 = timeTableStatus;
                getTimeTableDisclaimerTextUseCase$invoke$1.L$1 = "";
                getTimeTableDisclaimerTextUseCase$invoke$1.I$0 = i;
                getTimeTableDisclaimerTextUseCase$invoke$1.label = 1;
                Object objA = chaloConfigFeature.a("timeTableStatusDebug", getTimeTableDisclaimerTextUseCase$invoke$1);
                if (objA != coroutineSingletons) {
                    obj2 = objA;
                    i2 = i;
                    strS = "";
                    str = (String) obj2;
                }
            } else {
                getTimeTableDisclaimerTextUseCase$invoke$1.L$0 = timeTableStatus;
                getTimeTableDisclaimerTextUseCase$invoke$1.L$1 = "";
                getTimeTableDisclaimerTextUseCase$invoke$1.I$0 = i;
                getTimeTableDisclaimerTextUseCase$invoke$1.label = 2;
                Object objA2 = chaloConfigFeature.a("timeTableStatusProd", getTimeTableDisclaimerTextUseCase$invoke$1);
                if (objA2 != coroutineSingletons) {
                    obj = objA2;
                    i2 = i;
                    strS = "";
                    str = (String) obj;
                }
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            int i5 = getTimeTableDisclaimerTextUseCase$invoke$1.I$0;
            String str2 = (String) getTimeTableDisclaimerTextUseCase$invoke$1.L$1;
            TimeTableStatus timeTableStatus2 = (TimeTableStatus) getTimeTableDisclaimerTextUseCase$invoke$1.L$0;
            ResultKt.b(obj3);
            strS = str2;
            timeTableStatus = timeTableStatus2;
            obj2 = obj3;
            i2 = i5;
            str = (String) obj2;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = getTimeTableDisclaimerTextUseCase$invoke$1.I$0;
            String str3 = (String) getTimeTableDisclaimerTextUseCase$invoke$1.L$1;
            TimeTableStatus timeTableStatus3 = (TimeTableStatus) getTimeTableDisclaimerTextUseCase$invoke$1.L$0;
            ResultKt.b(obj3);
            strS = str3;
            timeTableStatus = timeTableStatus3;
            obj = obj3;
            i2 = i6;
            str = (String) obj;
        }
        try {
            JsonElement jsonElementF = ChaloJson.b.f(str);
            String strValueOf = String.valueOf(timeTableStatus.getId());
            if (JsonElementExtensionsKt.l(strValueOf, jsonElementF)) {
                strS = JsonElementExtensionsKt.s(JsonElementExtensionsKt.e(strValueOf, jsonElementF), String.valueOf(i2), "");
            }
        } catch (Exception e) {
            this.c.i(e);
        }
        return strS.length() == 0 ? "Timings not available" : strS;
    }
}
