package app.chalo.login.userprofiling.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.login.userprofiling.data.UserProfilingHooksRulesCityConfig;
import app.chalo.login.userprofiling.data.UserProfilingHooksRulesForCity;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/userprofiling/domain/FetchUserProfilingHooksRulesConfigUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchUserProfilingHooksRulesConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f5374a;
    public final CityProvider b;
    public final CrashlyticsLogger c;
    public final ChaloBuildConfig d;
    public final BasicInfoContract e;
    public UserProfilingHooksRulesCityConfig f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5375a;

        static {
            int[] iArr = new int[ProductFlavor.values().length];
            try {
                iArr[ProductFlavor.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductFlavor.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductFlavor.ALPHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5375a = iArr;
        }
    }

    public FetchUserProfilingHooksRulesConfigUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f5374a = chaloConfigFeature;
        this.b = cityProvider;
        this.c = crashlyticsLogger;
        this.d = chaloBuildConfig;
        this.e = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[LOOP:0: B:50:0x00c2->B:63:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchUserProfilingHooksRulesConfigUseCase$invoke$1 fetchUserProfilingHooksRulesConfigUseCase$invoke$1;
        UserProfilingHooksRulesCityConfig userProfilingHooksRulesCityConfig;
        String str;
        FetchUserProfilingHooksRulesConfigUseCase fetchUserProfilingHooksRulesConfigUseCase;
        String strB;
        UserProfilingHooksRulesForCity userProfilingHooksRulesForCity;
        if (continuationImpl instanceof FetchUserProfilingHooksRulesConfigUseCase$invoke$1) {
            fetchUserProfilingHooksRulesConfigUseCase$invoke$1 = (FetchUserProfilingHooksRulesConfigUseCase$invoke$1) continuationImpl;
            int i = fetchUserProfilingHooksRulesConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchUserProfilingHooksRulesConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchUserProfilingHooksRulesConfigUseCase$invoke$1 = new FetchUserProfilingHooksRulesConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchUserProfilingHooksRulesConfigUseCase$invoke$1 = new FetchUserProfilingHooksRulesConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchUserProfilingHooksRulesConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchUserProfilingHooksRulesConfigUseCase$invoke$1.label;
        Object obj = null;
        if (i2 == 0) {
            ResultKt.b(objA);
            userProfilingHooksRulesCityConfig = this.f;
            if (userProfilingHooksRulesCityConfig == null) {
                fetchUserProfilingHooksRulesConfigUseCase$invoke$1.L$0 = this;
                fetchUserProfilingHooksRulesConfigUseCase$invoke$1.label = 1;
                if (this.e.f()) {
                    str = "userProfilingHooksRulesDev";
                } else {
                    int i3 = WhenMappings.f5375a[this.d.m().ordinal()];
                    if (i3 == 1) {
                        str = "userProfilingHooksRulesProd";
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "userProfilingHooksRulesBeta";
                    }
                }
                objA = this.f5374a.a(str, fetchUserProfilingHooksRulesConfigUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fetchUserProfilingHooksRulesConfigUseCase = this;
            }
            strB = CityProviderKt.b(this.b);
            for (Object obj2 : userProfilingHooksRulesCityConfig.f5370a) {
                if (StringsKt.x(((UserProfilingHooksRulesForCity) obj2).f5372a, strB, true)) {
                    obj = obj2;
                    break;
                }
            }
            userProfilingHooksRulesForCity = (UserProfilingHooksRulesForCity) obj;
            if (userProfilingHooksRulesForCity == null) {
                return userProfilingHooksRulesCityConfig.b;
            }
            return userProfilingHooksRulesForCity;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fetchUserProfilingHooksRulesConfigUseCase = (FetchUserProfilingHooksRulesConfigUseCase) fetchUserProfilingHooksRulesConfigUseCase$invoke$1.L$0;
        ResultKt.b(objA);
        String str2 = (String) objA;
        fetchUserProfilingHooksRulesConfigUseCase.getClass();
        if (StringsKt.F(str2)) {
            userProfilingHooksRulesCityConfig = null;
        } else {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                userProfilingHooksRulesCityConfig = (UserProfilingHooksRulesCityConfig) json.b(str2, UserProfilingHooksRulesCityConfig.INSTANCE.serializer());
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                fetchUserProfilingHooksRulesConfigUseCase.c.i(e2);
                userProfilingHooksRulesCityConfig = null;
            }
        }
        if (userProfilingHooksRulesCityConfig == null) {
            return new UserProfilingHooksRulesForCity("", EmptyList.f17557a);
        }
        fetchUserProfilingHooksRulesConfigUseCase.f = userProfilingHooksRulesCityConfig;
        strB = CityProviderKt.b(this.b);
        while (r1.hasNext()) {
            if (StringsKt.x(((UserProfilingHooksRulesForCity) obj2).f5372a, strB, true)) {
                obj = obj2;
                break;
            }
        }
        userProfilingHooksRulesForCity = (UserProfilingHooksRulesForCity) obj;
        if (userProfilingHooksRulesForCity == null) {
            return userProfilingHooksRulesCityConfig.b;
        }
        return userProfilingHooksRulesForCity;
    }
}
