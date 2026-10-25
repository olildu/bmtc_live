package app.chalo.features.reportproblem;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ReportProblemPath;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.Environment;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.extensions.JsonException;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ReportProblemArgs;
import in.juspay.hypersdk.analytics.LogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/reportproblem/ReportProblemFeature;", "Lapp/chalo/features/reportproblem/IReportProblemFeature;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReportProblemFeature implements IReportProblemFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportProblemResponseConverter f2757a;
    public final LocalDataStore b;
    public final LocalDataStore c;
    public final ApplicationForegroundManager d;
    public final AnalyticsContract e;
    public final CityProvider f;
    public final UserProfileDetailsProvider g;
    public final ChaloNavigationManager h;
    public final ChaloConfigFeature i;
    public final ChaloBuildConfig j;
    public final CrashlyticsLogger k;
    public final ChaloAppFeatureHelper l;
    public final UrlOpenHelper m;
    public Object n;

    /* JADX INFO: renamed from: app.chalo.features.reportproblem.ReportProblemFeature$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.features.reportproblem.ReportProblemFeature$1", f = "ReportProblemFeature.kt", l = {66}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ReportProblemFeature.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = ReportProblemFeature.this.b.e(PreferencesKeys.stringKey("keyReportProblemFeatureData"));
                    this.label = 1;
                    obj = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str));
                    ReportProblemFeature reportProblemFeature = ReportProblemFeature.this;
                    reportProblemFeature.n = reportProblemFeature.f2757a.a(jsonObjectG);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                ReportProblemFeature reportProblemFeature2 = ReportProblemFeature.this;
                reportProblemFeature2.getClass();
                if (reportProblemFeature2.d.getF2712a()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("Report Problem feature event description ", "Report Problem store parsing error");
                    AnalyticsContract.DefaultImpls.a(reportProblemFeature2.e, "Report Problem feature event", "ReportProblemFeature", linkedHashMap, null, false, 24);
                }
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, d2 = {"Lapp/chalo/features/reportproblem/ReportProblemFeature$Companion;", "", "", "REPORT_PROBLEM_DATA_STORE", "Ljava/lang/String;", "KEY_REPORT_PROBLEM_TYPE_METADATA", "PROBLEM_TYPE_STOP_ETA", "PROBLEM_TYPE_GENERAL_PROBLEMS", "PROBLEM_TYPE_QRCODE_TICKETING_PROBLEMS", "PROBLEM_TYPE_ACTIVATION_SCREEN_TICKETING_PROBLEMS", "PROBLEM_TYPE_TICKETING_PROBLEMS", "KEY_TAGS", "KEY_DEFAULT", "KEY_TITLE", "KEY_HINT", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2758a;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.DEVELOPMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Environment.PREPROD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2758a = iArr;
        }
    }

    public ReportProblemFeature(ReportProblemResponseConverter reportProblemResponseConverter, LocalDataStore localDataStore, LocalDataStore localDataStore2, ApplicationForegroundManager applicationForegroundManager, AnalyticsContract analyticsContract, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, ChaloNavigationManager chaloNavigationManager, ChaloConfigFeature chaloConfigFeature, ChaloBuildConfig chaloBuildConfig, CrashlyticsLogger crashlyticsLogger, ChaloAppFeatureHelper chaloAppFeatureHelper, UrlOpenHelper urlOpenHelper, CoroutineContextProvider coroutineContextProvider) {
        this.f2757a = reportProblemResponseConverter;
        this.b = localDataStore;
        this.c = localDataStore2;
        this.d = applicationForegroundManager;
        this.e = analyticsContract;
        this.f = cityProvider;
        this.g = userProfileDetailsProvider;
        this.h = chaloNavigationManager;
        this.i = chaloConfigFeature;
        this.j = chaloBuildConfig;
        this.k = crashlyticsLogger;
        this.l = chaloAppFeatureHelper;
        this.m = urlOpenHelper;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.n = MapsKt.d();
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
    }

    @Override // app.chalo.features.reportproblem.IReportProblemFeature
    public final Object a(String str, Continuation continuation) {
        Object objG = this.c.g(PreferencesKeys.stringKey("keyReportProblemFeatureCachedResponseCity"), str, continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    @Override // app.chalo.features.reportproblem.IReportProblemFeature
    public final Object b(String str, String str2, Map map, boolean z, String str3, ContinuationImpl continuationImpl) {
        ReportProblemFeature$launchReportProblemFeature$1 reportProblemFeature$launchReportProblemFeature$1;
        String str4;
        String str5;
        String str6;
        Object objD;
        Map map2;
        boolean z2;
        ArrayList arrayList;
        if (continuationImpl instanceof ReportProblemFeature$launchReportProblemFeature$1) {
            reportProblemFeature$launchReportProblemFeature$1 = (ReportProblemFeature$launchReportProblemFeature$1) continuationImpl;
            int i = reportProblemFeature$launchReportProblemFeature$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportProblemFeature$launchReportProblemFeature$1.label = i - Integer.MIN_VALUE;
            } else {
                reportProblemFeature$launchReportProblemFeature$1 = new ReportProblemFeature$launchReportProblemFeature$1(this, continuationImpl);
            }
        } else {
            reportProblemFeature$launchReportProblemFeature$1 = new ReportProblemFeature$launchReportProblemFeature$1(this, continuationImpl);
        }
        Object obj = reportProblemFeature$launchReportProblemFeature$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reportProblemFeature$launchReportProblemFeature$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            str4 = str;
            reportProblemFeature$launchReportProblemFeature$1.L$0 = str4;
            str5 = str2;
            reportProblemFeature$launchReportProblemFeature$1.L$1 = str5;
            reportProblemFeature$launchReportProblemFeature$1.L$2 = map;
            str6 = str3;
            reportProblemFeature$launchReportProblemFeature$1.L$3 = str6;
            reportProblemFeature$launchReportProblemFeature$1.Z$0 = z;
            reportProblemFeature$launchReportProblemFeature$1.label = 1;
            objD = this.l.d(reportProblemFeature$launchReportProblemFeature$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            map2 = map;
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = reportProblemFeature$launchReportProblemFeature$1.Z$0;
            String str7 = (String) reportProblemFeature$launchReportProblemFeature$1.L$3;
            map2 = (Map) reportProblemFeature$launchReportProblemFeature$1.L$2;
            String str8 = (String) reportProblemFeature$launchReportProblemFeature$1.L$1;
            String str9 = (String) reportProblemFeature$launchReportProblemFeature$1.L$0;
            ResultKt.b(obj);
            objD = obj;
            str4 = str9;
            str6 = str7;
            str5 = str8;
        }
        ReportProblemPath reportProblemPath = (ReportProblemPath) objD;
        boolean z3 = reportProblemPath instanceof ReportProblemPath.WebViewPath;
        ChaloNavigationManager chaloNavigationManager = this.h;
        Unit unit = Unit.f17538a;
        if (z3) {
            ChaloNavigationManagerKt.e(chaloNavigationManager, ((ReportProblemPath.WebViewPath) reportProblemPath).f1033a, null, 6);
            return unit;
        }
        if (reportProblemPath instanceof ReportProblemPath.WhatsAppPath) {
            this.m.a(((ReportProblemPath.WhatsAppPath) reportProblemPath).a(), null);
            return unit;
        }
        if (!Intrinsics.d(reportProblemPath, ReportProblemPath.FreshChatPath.f1032a)) {
            throw new NoWhenBranchMatchedException();
        }
        ReportProblemCollection reportProblemCollection = (ReportProblemCollection) this.n.get(str4);
        if (z2) {
            if (str5.equals("activatePassScreen")) {
                arrayList = new ArrayList();
                ReportProblemFeatureProblem reportProblemFeatureProblem = new ReportProblemFeatureProblem("reclaimPassesProblem", "Cant find my pass after I changed/reset my mobile device.", "", "reclaimPasses", new ArrayList());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(reportProblemFeatureProblem);
                arrayList.add(new ReportProblemFeatureCategory("reclaimPassesCategory", "Don't see my active pass", arrayList2));
            } else {
                arrayList = null;
            }
            if (reportProblemCollection == null && arrayList != null) {
                reportProblemCollection = str5.equals("activatePassScreen") ? new ReportProblemCollection("defaultCollectionIdHistoryScreen", "Help", arrayList) : new ReportProblemCollection("dummyProblemCollectionId", "Help", arrayList);
            }
        } else {
            arrayList = null;
        }
        if (reportProblemCollection == null) {
            return unit;
        }
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ReportProblemArgs(reportProblemCollection, str5, map2, arrayList, str6), null, null, 6));
        return unit;
    }

    @Override // app.chalo.features.reportproblem.IReportProblemFeature
    public final Object c(Continuation continuation) {
        return FlowKt.v(this.c.e(PreferencesKeys.stringKey("keyReportProblemFeatureVersionCode")), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.reportproblem.IReportProblemFeature
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        ReportProblemFeature$getReportProblemMetadata$1 reportProblemFeature$getReportProblemMetadata$1;
        String str3;
        if (continuationImpl instanceof ReportProblemFeature$getReportProblemMetadata$1) {
            reportProblemFeature$getReportProblemMetadata$1 = (ReportProblemFeature$getReportProblemMetadata$1) continuationImpl;
            int i = reportProblemFeature$getReportProblemMetadata$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportProblemFeature$getReportProblemMetadata$1.label = i - Integer.MIN_VALUE;
            } else {
                reportProblemFeature$getReportProblemMetadata$1 = new ReportProblemFeature$getReportProblemMetadata$1(this, continuationImpl);
            }
        } else {
            reportProblemFeature$getReportProblemMetadata$1 = new ReportProblemFeature$getReportProblemMetadata$1(this, continuationImpl);
        }
        Object objA = reportProblemFeature$getReportProblemMetadata$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reportProblemFeature$getReportProblemMetadata$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            int i3 = WhenMappings.f2758a[this.j.getF885a().ordinal()];
            if (i3 == 1) {
                str3 = "reportProblemDataProd";
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = "reportProblemDataDebug";
            }
            reportProblemFeature$getReportProblemMetadata$1.L$0 = str;
            reportProblemFeature$getReportProblemMetadata$1.L$1 = str2;
            reportProblemFeature$getReportProblemMetadata$1.label = 1;
            objA = this.i.a(str3, reportProblemFeature$getReportProblemMetadata$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) reportProblemFeature$getReportProblemMetadata$1.L$1;
            str = (String) reportProblemFeature$getReportProblemMetadata$1.L$0;
            ResultKt.b(objA);
        }
        String str4 = (String) objA;
        if (str4.length() == 0) {
            return null;
        }
        try {
            return i(str4, str, str2);
        } catch (Exception e) {
            this.k.i(e);
            return null;
        }
    }

    @Override // app.chalo.features.reportproblem.IReportProblemFeature
    public final void e(String problemId, String problemCopy, String problemCtaType) {
        Intrinsics.i(problemId, "problemId");
        Intrinsics.i(problemCopy, "problemCopy");
        Intrinsics.i(problemCtaType, "problemCtaType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("problem Id", problemId);
        linkedHashMap.put("problem copy", problemCopy);
        linkedHashMap.put("problem cta type", problemCtaType);
        String strB = CityProviderKt.b(this.f);
        if (strB != null) {
            linkedHashMap.put("cityName", strB);
        }
        AnalyticsContract.DefaultImpls.a(this.e, "report problem feature problem clicked", "ReportProblemFeature", linkedHashMap, null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.reportproblem.IReportProblemFeature
    public final Object f(JsonObject jsonObject, ContinuationImpl continuationImpl) {
        ReportProblemFeature$parseAndStoreReportProblemResponse$1 reportProblemFeature$parseAndStoreReportProblemResponse$1;
        Object objG;
        JsonObject jsonObjectP;
        String string;
        Object objC;
        if (continuationImpl instanceof ReportProblemFeature$parseAndStoreReportProblemResponse$1) {
            reportProblemFeature$parseAndStoreReportProblemResponse$1 = (ReportProblemFeature$parseAndStoreReportProblemResponse$1) continuationImpl;
            int i = reportProblemFeature$parseAndStoreReportProblemResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportProblemFeature$parseAndStoreReportProblemResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                reportProblemFeature$parseAndStoreReportProblemResponse$1 = new ReportProblemFeature$parseAndStoreReportProblemResponse$1(this, continuationImpl);
            }
        } else {
            reportProblemFeature$parseAndStoreReportProblemResponse$1 = new ReportProblemFeature$parseAndStoreReportProblemResponse$1(this, continuationImpl);
        }
        Object obj = reportProblemFeature$parseAndStoreReportProblemResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reportProblemFeature$parseAndStoreReportProblemResponse$1.label;
        LocalDataStore localDataStore = this.b;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strS = JsonElementExtensionsKt.s(jsonObject, "versionCode", "");
            reportProblemFeature$parseAndStoreReportProblemResponse$1.L$0 = jsonObject;
            reportProblemFeature$parseAndStoreReportProblemResponse$1.label = 1;
            int length = strS.length();
            LocalDataStore localDataStore2 = this.c;
            if (length != 0 ? (objG = localDataStore2.g(PreferencesKeys.stringKey("keyReportProblemFeatureVersionCode"), strS, reportProblemFeature$parseAndStoreReportProblemResponse$1)) != coroutineSingletons : (objG = localDataStore2.c(CollectionsKt.R(PreferencesKeys.stringKey("keyReportProblemFeatureVersionCode")), reportProblemFeature$parseAndStoreReportProblemResponse$1)) != coroutineSingletons) {
                objG = unit;
            }
            if (objG != coroutineSingletons) {
            }
        }
        if (i2 == 1) {
            jsonObject = (JsonObject) reportProblemFeature$parseAndStoreReportProblemResponse$1.L$0;
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            jsonObjectP = (JsonObject) reportProblemFeature$parseAndStoreReportProblemResponse$1.L$0;
            ResultKt.b(obj);
        }
        string = jsonObjectP.toString();
        reportProblemFeature$parseAndStoreReportProblemResponse$1.L$0 = null;
        reportProblemFeature$parseAndStoreReportProblemResponse$1.label = 3;
        if (string != null ? (objC = localDataStore.c(CollectionsKt.R(PreferencesKeys.stringKey("keyReportProblemFeatureData")), reportProblemFeature$parseAndStoreReportProblemResponse$1)) != coroutineSingletons : (objC = localDataStore.g(PreferencesKeys.stringKey("keyReportProblemFeatureData"), string, reportProblemFeature$parseAndStoreReportProblemResponse$1)) != coroutineSingletons) {
        }
        return objC == coroutineSingletons ? coroutineSingletons : unit;
        jsonObjectP = JsonElementExtensionsKt.p(jsonObject, "data");
        if (jsonObjectP != null) {
            this.n = this.f2757a.a(jsonObjectP);
            reportProblemFeature$parseAndStoreReportProblemResponse$1.L$0 = jsonObjectP;
            reportProblemFeature$parseAndStoreReportProblemResponse$1.label = 2;
            Object objB = localDataStore.b(reportProblemFeature$parseAndStoreReportProblemResponse$1);
            if (objB != coroutineSingletons) {
                objB = unit;
            }
            if (objB != coroutineSingletons) {
                string = jsonObjectP.toString();
                reportProblemFeature$parseAndStoreReportProblemResponse$1.L$0 = null;
                reportProblemFeature$parseAndStoreReportProblemResponse$1.label = 3;
                objC = string != null ? unit : unit;
                if (objC == coroutineSingletons) {
                }
            }
        }
    }

    @Override // app.chalo.features.reportproblem.IReportProblemFeature
    public final Object g(ReportProblemFeatureData reportProblemFeatureData, ContinuationImpl continuationImpl) {
        Object objB = b(reportProblemFeatureData.f2761a, reportProblemFeatureData.b, reportProblemFeatureData.c, reportProblemFeatureData.d, reportProblemFeatureData.e, continuationImpl);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.features.reportproblem.IReportProblemFeature
    public final Object h(Continuation continuation) {
        return FlowKt.v(this.c.e(PreferencesKeys.stringKey("keyReportProblemFeatureCachedResponseCity")), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    public final ReportProblemMetadata i(String str, String str2, String str3) throws JsonException {
        Map mapD;
        Pair pair;
        Pair pair2;
        Json json = ChaloJson.b;
        JsonObject jsonObjectG = JsonElementKt.g(json.f(str));
        JsonElement jsonElement = (JsonElement) jsonObjectG.get("tags");
        if (jsonElement == 0) {
            mapD = MapsKt.d();
        } else {
            try {
                if (jsonElement instanceof JsonObject) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : ((Map) jsonElement).entrySet()) {
                        String str4 = (String) entry.getKey();
                        JsonElement jsonElement2 = (JsonElement) entry.getValue();
                        ChaloJson chaloJson = ChaloJson.f6455a;
                        JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement2);
                        if (jsonPrimitiveA == null) {
                            pair2 = null;
                        } else {
                            String c = jsonPrimitiveA instanceof JsonNull ? null : jsonPrimitiveA.getC();
                            if (c != null) {
                                pair2 = new Pair(str4, c);
                            } else {
                                pair2 = null;
                            }
                        }
                        if (pair2 != null) {
                            arrayList.add(pair2);
                        }
                    }
                    mapD = MapsKt.q(arrayList);
                } else {
                    JsonObject jsonObjectG2 = JsonElementKt.g(json.f(JsonElementKt.h(jsonElement).getC()));
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : jsonObjectG2.f18198a.entrySet()) {
                        String str5 = (String) entry2.getKey();
                        JsonElement jsonElement3 = (JsonElement) entry2.getValue();
                        ChaloJson chaloJson2 = ChaloJson.f6455a;
                        JsonPrimitive jsonPrimitiveA2 = ChaloJson.a(jsonElement3);
                        if (jsonPrimitiveA2 == null) {
                            pair = null;
                        } else {
                            String c2 = jsonPrimitiveA2 instanceof JsonNull ? null : jsonPrimitiveA2.getC();
                            if (c2 != null) {
                                pair = new Pair(str5, c2);
                            } else {
                                pair = null;
                            }
                        }
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    mapD = MapsKt.q(arrayList2);
                }
            } catch (Exception e) {
                this.k.i(e);
                mapD = MapsKt.d();
            }
        }
        JsonObject jsonObjectG3 = JsonElementExtensionsKt.g(jsonObjectG, "reportProblemMetadata");
        if (JsonElementExtensionsKt.l(str2, jsonObjectG3)) {
            JsonObject jsonObjectG4 = JsonElementExtensionsKt.g(jsonObjectG3, str2);
            String lowerCase = str3.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            JsonObject jsonObjectG5 = (str3.length() <= 0 || !JsonElementExtensionsKt.l(lowerCase, jsonObjectG4)) ? JsonElementExtensionsKt.l(LogConstants.DEFAULT_CHANNEL, jsonObjectG4) ? JsonElementExtensionsKt.g(jsonObjectG4, LogConstants.DEFAULT_CHANNEL) : null : JsonElementExtensionsKt.g(jsonObjectG4, lowerCase);
            if (jsonObjectG5 != null) {
                JsonArray jsonArrayD = JsonElementExtensionsKt.d(jsonObjectG5, "tags");
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(jsonArrayD, 10));
                Iterator it = jsonArrayD.f18186a.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((JsonElement) it.next()).toString());
                }
                return new ReportProblemMetadata(mapD, JsonElementExtensionsKt.j(jsonObjectG5, "title"), JsonElementExtensionsKt.s(jsonObjectG5, "hint", ""), arrayList3);
            }
        }
        return null;
    }
}
