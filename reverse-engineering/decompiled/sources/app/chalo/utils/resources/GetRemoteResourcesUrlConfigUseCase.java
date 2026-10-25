package app.chalo.utils.resources;

import app.chalo.behaviour.policy.ResolveResourceUrlPolicyUseCase;
import app.chalo.behaviour.policy.ResolvedResourceUrlPolicy;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/resources/GetRemoteResourcesUrlConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRemoteResourcesUrlConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f10448a;
    public final CrashlyticsLogger b;
    public final ResolveResourceUrlPolicyUseCase c;

    public GetRemoteResourcesUrlConfigUseCase(ChaloConfigFeature chaloConfigFeature, CrashlyticsLogger crashlyticsLogger, ResolveResourceUrlPolicyUseCase resolveResourceUrlPolicyUseCase) {
        this.f10448a = chaloConfigFeature;
        this.b = crashlyticsLogger;
        this.c = resolveResourceUrlPolicyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetRemoteResourcesUrlConfigUseCase$invoke$1 getRemoteResourcesUrlConfigUseCase$invoke$1;
        String str;
        RemoteResourcesUrlConfig remoteResourcesUrlConfig;
        String str2;
        String str3;
        String str4;
        if (continuationImpl instanceof GetRemoteResourcesUrlConfigUseCase$invoke$1) {
            getRemoteResourcesUrlConfigUseCase$invoke$1 = (GetRemoteResourcesUrlConfigUseCase$invoke$1) continuationImpl;
            int i = getRemoteResourcesUrlConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRemoteResourcesUrlConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRemoteResourcesUrlConfigUseCase$invoke$1 = new GetRemoteResourcesUrlConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRemoteResourcesUrlConfigUseCase$invoke$1 = new GetRemoteResourcesUrlConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getRemoteResourcesUrlConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRemoteResourcesUrlConfigUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getRemoteResourcesUrlConfigUseCase$invoke$1.label = 1;
            objA = this.f10448a.a("resourceUrls", getRemoteResourcesUrlConfigUseCase$invoke$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) getRemoteResourcesUrlConfigUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        }
        ResolvedResourceUrlPolicy resolvedResourceUrlPolicy = (ResolvedResourceUrlPolicy) objA;
        if (str.length() > 0) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                remoteResourcesUrlConfig = (RemoteResourcesUrlConfig) json.b(str, RemoteResourcesUrlConfig.INSTANCE.serializer());
            } catch (Exception e) {
                this.b.i(e);
                remoteResourcesUrlConfig = new RemoteResourcesUrlConfig();
            }
        } else {
            remoteResourcesUrlConfig = new RemoteResourcesUrlConfig();
        }
        str2 = resolvedResourceUrlPolicy.f1072a;
        if (StringsKt.F(str2)) {
            str2 = remoteResourcesUrlConfig.f10449a;
        }
        String bleTutorialGif = str2;
        str3 = resolvedResourceUrlPolicy.b;
        if (StringsKt.F(str3)) {
            str3 = remoteResourcesUrlConfig.b;
        }
        String bleValidationGif = str3;
        str4 = resolvedResourceUrlPolicy.c;
        if (StringsKt.F(str4)) {
            str4 = remoteResourcesUrlConfig.d;
        }
        String blePermissionTutorialGif = str4;
        String bleOnboardingTutorialGif = remoteResourcesUrlConfig.c;
        String tapInInfoGif = remoteResourcesUrlConfig.e;
        String tapOutInfoGif = remoteResourcesUrlConfig.f;
        Intrinsics.i(bleTutorialGif, "bleTutorialGif");
        Intrinsics.i(bleValidationGif, "bleValidationGif");
        Intrinsics.i(bleOnboardingTutorialGif, "bleOnboardingTutorialGif");
        Intrinsics.i(blePermissionTutorialGif, "blePermissionTutorialGif");
        Intrinsics.i(tapInInfoGif, "tapInInfoGif");
        Intrinsics.i(tapOutInfoGif, "tapOutInfoGif");
        RemoteResourcesUrlConfig remoteResourcesUrlConfig2 = new RemoteResourcesUrlConfig(bleTutorialGif, bleValidationGif, bleOnboardingTutorialGif, blePermissionTutorialGif, tapInInfoGif, tapOutInfoGif);
        String message = "RemoteResourcesUrlConfig after applying policy override: " + remoteResourcesUrlConfig2;
        Intrinsics.i(message, "message");
        return remoteResourcesUrlConfig2;
        String str5 = (String) objA;
        getRemoteResourcesUrlConfigUseCase$invoke$1.L$0 = str5;
        getRemoteResourcesUrlConfigUseCase$invoke$1.label = 2;
        Object objA2 = this.c.a(getRemoteResourcesUrlConfigUseCase$invoke$1);
        if (objA2 != coroutineSingletons) {
            str = str5;
            objA = objA2;
            ResolvedResourceUrlPolicy resolvedResourceUrlPolicy2 = (ResolvedResourceUrlPolicy) objA;
            if (str.length() > 0) {
                Json json2 = ChaloJson.b;
                json2.getClass();
                remoteResourcesUrlConfig = (RemoteResourcesUrlConfig) json2.b(str, RemoteResourcesUrlConfig.INSTANCE.serializer());
            } else {
                remoteResourcesUrlConfig = new RemoteResourcesUrlConfig();
            }
            str2 = resolvedResourceUrlPolicy2.f1072a;
            if (StringsKt.F(str2)) {
                str2 = remoteResourcesUrlConfig.f10449a;
            }
            String bleTutorialGif2 = str2;
            str3 = resolvedResourceUrlPolicy2.b;
            if (StringsKt.F(str3)) {
                str3 = remoteResourcesUrlConfig.b;
            }
            String bleValidationGif2 = str3;
            str4 = resolvedResourceUrlPolicy2.c;
            if (StringsKt.F(str4)) {
                str4 = remoteResourcesUrlConfig.d;
            }
            String blePermissionTutorialGif2 = str4;
            String bleOnboardingTutorialGif2 = remoteResourcesUrlConfig.c;
            String tapInInfoGif2 = remoteResourcesUrlConfig.e;
            String tapOutInfoGif2 = remoteResourcesUrlConfig.f;
            Intrinsics.i(bleTutorialGif2, "bleTutorialGif");
            Intrinsics.i(bleValidationGif2, "bleValidationGif");
            Intrinsics.i(bleOnboardingTutorialGif2, "bleOnboardingTutorialGif");
            Intrinsics.i(blePermissionTutorialGif2, "blePermissionTutorialGif");
            Intrinsics.i(tapInInfoGif2, "tapInInfoGif");
            Intrinsics.i(tapOutInfoGif2, "tapOutInfoGif");
            RemoteResourcesUrlConfig remoteResourcesUrlConfig3 = new RemoteResourcesUrlConfig(bleTutorialGif2, bleValidationGif2, bleOnboardingTutorialGif2, blePermissionTutorialGif2, tapInInfoGif2, tapOutInfoGif2);
            String message2 = "RemoteResourcesUrlConfig after applying policy override: " + remoteResourcesUrlConfig3;
            Intrinsics.i(message2, "message");
            return remoteResourcesUrlConfig3;
        }
        return coroutineSingletons;
    }
}
