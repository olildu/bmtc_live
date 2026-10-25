package app.chalo.usecase;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.userprofile.UserProfileAppModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usecase/IsDebugAnalyticsEventsEnabledUseCase;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsDebugAnalyticsEventsEnabledUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f10205a;
    public final BasicInfoContract b;
    public final CityProvider c;
    public final UserProfileDetailsProvider d;
    public final CrashlyticsLogger e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/usecase/IsDebugAnalyticsEventsEnabledUseCase$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public IsDebugAnalyticsEventsEnabledUseCase(ChaloConfigFeature chaloConfigFeature, BasicInfoContract basicInfoContract, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, CrashlyticsLogger crashlyticsLogger) {
        this.f10205a = chaloConfigFeature;
        this.b = basicInfoContract;
        this.c = cityProvider;
        this.d = userProfileDetailsProvider;
        this.e = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        IsDebugAnalyticsEventsEnabledUseCase$invoke$1 isDebugAnalyticsEventsEnabledUseCase$invoke$1;
        String str;
        String currentCityName;
        String str2;
        if (continuationImpl instanceof IsDebugAnalyticsEventsEnabledUseCase$invoke$1) {
            isDebugAnalyticsEventsEnabledUseCase$invoke$1 = (IsDebugAnalyticsEventsEnabledUseCase$invoke$1) continuationImpl;
            int i = isDebugAnalyticsEventsEnabledUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                isDebugAnalyticsEventsEnabledUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                isDebugAnalyticsEventsEnabledUseCase$invoke$1 = new IsDebugAnalyticsEventsEnabledUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            isDebugAnalyticsEventsEnabledUseCase$invoke$1 = new IsDebugAnalyticsEventsEnabledUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = isDebugAnalyticsEventsEnabledUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = isDebugAnalyticsEventsEnabledUseCase$invoke$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(obj);
            CityAppModel cityAppModel = (CityAppModel) this.c.b().getValue();
            if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
                return Boolean.FALSE;
            }
            isDebugAnalyticsEventsEnabledUseCase$invoke$1.L$0 = str;
            isDebugAnalyticsEventsEnabledUseCase$invoke$1.label = 1;
            Object objA = this.f10205a.a("appDebugEventsForUser", isDebugAnalyticsEventsEnabledUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            currentCityName = str;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currentCityName = (String) isDebugAnalyticsEventsEnabledUseCase$invoke$1.L$0;
            ResultKt.b(obj);
        }
        String str3 = (String) obj;
        if (str3.length() == 0) {
            return Boolean.FALSE;
        }
        boolean z2 = false;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            List list = ((DebugAnalyticsEventsRemoteConfigModel) json.b(str3, DebugAnalyticsEventsRemoteConfigModel.INSTANCE.serializer())).f10161a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    DebugAnalyticsEventsValidUserConfig debugAnalyticsEventsValidUserConfig = (DebugAnalyticsEventsValidUserConfig) it.next();
                    int iH = this.b.h();
                    UserProfileAppModel userProfileAppModelF = this.d.f();
                    if (userProfileAppModelF == null || (str2 = userProfileAppModelF.e) == null) {
                        str2 = "";
                    }
                    debugAnalyticsEventsValidUserConfig.getClass();
                    Intrinsics.i(currentCityName, "currentCityName");
                    if (debugAnalyticsEventsValidUserConfig.f10163a == iH && StringsKt.x(debugAnalyticsEventsValidUserConfig.b, currentCityName, true) && Intrinsics.d(debugAnalyticsEventsValidUserConfig.c, str2)) {
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            z2 = z;
        } catch (Exception e) {
            this.e.i(e);
        }
        return Boolean.valueOf(z2);
    }
}
