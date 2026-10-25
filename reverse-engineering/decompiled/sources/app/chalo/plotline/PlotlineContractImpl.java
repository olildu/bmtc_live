package app.chalo.plotline;

import android.app.Activity;
import android.content.Context;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.utils.CommonContext;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.foreground.ActiveSceneInStackResolver;
import app.chalo.features.foreground.ActiveSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.foreground.ForegroundListener;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.scenes.ChaloScenes;
import defpackage.b50;
import defpackage.j2;
import defpackage.os0;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.internal.url._UrlKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import so.plotline.insights.Database.e0;
import so.plotline.insights.Database.u;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Plotline;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/plotline/PlotlineContractImpl;", "Lapp/chalo/plotline/PlotlineContract;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlotlineContractImpl implements PlotlineContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonContext f6837a;
    public final BasicInfoContract b;
    public final UserProfileDetailsProvider c;
    public final CityProvider d;
    public final ChaloBuildConfig e;
    public final CoroutineContextProvider f;
    public final Function2 g;
    public final Function1 h;
    public final HandleCustomActionUseCase i;
    public final PlotlineTrackContextProvider j;
    public final ActiveSceneInStackResolver k;
    public final ApplicationForegroundManager l;
    public final SdkIntegrationPolicyManager m;
    public boolean n;
    public PlotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1 o;
    public final ContextScope p;
    public final LinkedHashMap q;
    public final MutexImpl r;
    public final MutexImpl s;

    /* JADX INFO: renamed from: app.chalo.plotline.PlotlineContractImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.plotline.PlotlineContractImpl$1", f = "PlotlineContractImpl.kt", l = {47}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PlotlineContractImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow e = PlotlineContractImpl.this.d.getE();
                final PlotlineContractImpl plotlineContractImpl = PlotlineContractImpl.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.plotline.PlotlineContractImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object objF;
                        return (((CityAppModel) obj2) == null || (objF = PlotlineContractImpl.f(plotlineContractImpl, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? Unit.f17538a : objF;
                    }
                };
                this.label = 1;
                if (e.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: app.chalo.plotline.PlotlineContractImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.plotline.PlotlineContractImpl$2", f = "PlotlineContractImpl.kt", l = {55}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PlotlineContractImpl.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ActiveSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1 activeSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1A = PlotlineContractImpl.this.k.a();
                final PlotlineContractImpl plotlineContractImpl = PlotlineContractImpl.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.plotline.PlotlineContractImpl.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        ChaloScenes chaloScenes = (ChaloScenes) obj2;
                        Intrinsics.i(chaloScenes, "<this>");
                        String strM = StringsKt.M(chaloScenes.getBaseRoute(), "/");
                        PlotlineContractImpl plotlineContractImpl2 = plotlineContractImpl;
                        plotlineContractImpl2.getClass();
                        if (plotlineContractImpl2.m.f1078a.b && plotlineContractImpl2.n) {
                            Plotline.m(strM);
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (activeSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1A.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/plotline/PlotlineContractImpl$Companion;", "", "", "PLOTLINE_TAG", "Ljava/lang/String;", "CUSTOM_ACTION", "PLOTLINE_CUSTOM_NOTIFICATION_ID", "NO_CUSTOM_ID_ASSIGNED", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PlotlineContractImpl(CommonContext commonContext, BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, ChaloBuildConfig chaloBuildConfig, CoroutineContextProvider coroutineContextProvider, Function2 function2, Function1 function1, HandleCustomActionUseCase handleCustomActionUseCase, PlotlineTrackContextProvider plotlineTrackContextProvider, ActiveSceneInStackResolver activeSceneInStackResolver, ApplicationForegroundManager applicationForegroundManager, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        this.f6837a = commonContext;
        this.b = basicInfoContract;
        this.c = userProfileDetailsProvider;
        this.d = cityProvider;
        this.e = chaloBuildConfig;
        this.f = coroutineContextProvider;
        this.g = function2;
        this.h = function1;
        this.i = handleCustomActionUseCase;
        this.j = plotlineTrackContextProvider;
        this.k = activeSceneInStackResolver;
        this.l = applicationForegroundManager;
        this.m = sdkIntegrationPolicyManager;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.p = contextScopeA;
        this.q = new LinkedHashMap();
        this.r = MutexKt.a();
        this.s = MutexKt.a();
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(PlotlineContractImpl plotlineContractImpl, ContinuationImpl continuationImpl) {
        PlotlineContractImpl$removeDeferredForegroundInitListener$1 plotlineContractImpl$removeDeferredForegroundInitListener$1;
        Mutex mutex;
        plotlineContractImpl.getClass();
        if (continuationImpl instanceof PlotlineContractImpl$removeDeferredForegroundInitListener$1) {
            plotlineContractImpl$removeDeferredForegroundInitListener$1 = (PlotlineContractImpl$removeDeferredForegroundInitListener$1) continuationImpl;
            int i = plotlineContractImpl$removeDeferredForegroundInitListener$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                plotlineContractImpl$removeDeferredForegroundInitListener$1.label = i - Integer.MIN_VALUE;
            } else {
                plotlineContractImpl$removeDeferredForegroundInitListener$1 = new PlotlineContractImpl$removeDeferredForegroundInitListener$1(plotlineContractImpl, continuationImpl);
            }
        } else {
            plotlineContractImpl$removeDeferredForegroundInitListener$1 = new PlotlineContractImpl$removeDeferredForegroundInitListener$1(plotlineContractImpl, continuationImpl);
        }
        Object obj = plotlineContractImpl$removeDeferredForegroundInitListener$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = plotlineContractImpl$removeDeferredForegroundInitListener$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = plotlineContractImpl.r;
            plotlineContractImpl$removeDeferredForegroundInitListener$1.L$0 = mutexImpl;
            plotlineContractImpl$removeDeferredForegroundInitListener$1.label = 1;
            if (mutexImpl.a(plotlineContractImpl$removeDeferredForegroundInitListener$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) plotlineContractImpl$removeDeferredForegroundInitListener$1.L$0;
            ResultKt.b(obj);
        }
        try {
            PlotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1 plotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1 = plotlineContractImpl.o;
            if (plotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1 != null) {
                plotlineContractImpl.l.b(plotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1);
                plotlineContractImpl.o = null;
            }
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.b(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(app.chalo.plotline.PlotlineContractImpl r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof app.chalo.plotline.PlotlineContractImpl$setUpPlotlineOnCityChanged$1
            if (r0 == 0) goto L16
            r0 = r6
            app.chalo.plotline.PlotlineContractImpl$setUpPlotlineOnCityChanged$1 r0 = (app.chalo.plotline.PlotlineContractImpl$setUpPlotlineOnCityChanged$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.plotline.PlotlineContractImpl$setUpPlotlineOnCityChanged$1 r0 = new app.chalo.plotline.PlotlineContractImpl$setUpPlotlineOnCityChanged$1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            goto L45
        L39:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            java.lang.Object r6 = r5.h(r0)
            if (r6 != r1) goto L45
            goto L4d
        L45:
            r0.label = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L4e
        L4d:
            return r1
        L4e:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.plotline.PlotlineContractImpl.f(app.chalo.plotline.PlotlineContractImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void i(Function2 function2) {
        JSONArray jSONArray;
        Plotline.b().b0 = new b50(function2);
        Plotline plotlineB = Plotline.b();
        synchronized (plotlineB) {
            try {
                if (plotlineB.b0 == null) {
                    return;
                }
                Context applicationContext = plotlineB.q;
                if (applicationContext == null) {
                    try {
                        Activity activityC = plotlineB.c();
                        applicationContext = activityC != null ? activityC.getApplicationContext() : null;
                    } catch (Exception unused) {
                    }
                }
                if (applicationContext == null) {
                    return;
                }
                try {
                    jSONArray = new JSONArray(u.b(applicationContext, "pendingEvents", _UrlKt.PATH_SEGMENT_ENCODE_SET_URI));
                } catch (Exception unused2) {
                    jSONArray = new JSONArray();
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("name", null);
                            Object objOpt = jSONObjectOptJSONObject.opt("props");
                            JSONObject jSONObject = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                            if (strOptString != null) {
                                plotlineB.b0.a(strOptString, jSONObject);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
                u.d(applicationContext, "pendingEvents", _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            } catch (Exception e) {
                DebugHelper.a(e);
            }
        }
    }

    @Override // app.chalo.plotline.PlotlineContract
    public final void a(String eventName, String source, Map map) {
        Intrinsics.i(eventName, "eventName");
        Intrinsics.i(source, "source");
        if (this.m.f1078a.b) {
            BuildersKt.d(this.p, null, null, new PlotlineContractImpl$trackEvent$1(this, map, source, eventName, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [app.chalo.features.foreground.ForegroundListener, app.chalo.plotline.PlotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // app.chalo.plotline.PlotlineContract
    public final Object b(ContinuationImpl continuationImpl) {
        PlotlineContractImpl$setupPlotline$1 plotlineContractImpl$setupPlotline$1;
        Mutex mutex;
        boolean f2712a;
        ApplicationForegroundManager applicationForegroundManager = this.l;
        if (continuationImpl instanceof PlotlineContractImpl$setupPlotline$1) {
            plotlineContractImpl$setupPlotline$1 = (PlotlineContractImpl$setupPlotline$1) continuationImpl;
            int i = plotlineContractImpl$setupPlotline$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                plotlineContractImpl$setupPlotline$1.label = i - Integer.MIN_VALUE;
            } else {
                plotlineContractImpl$setupPlotline$1 = new PlotlineContractImpl$setupPlotline$1(this, continuationImpl);
            }
        } else {
            plotlineContractImpl$setupPlotline$1 = new PlotlineContractImpl$setupPlotline$1(this, continuationImpl);
        }
        Object obj = plotlineContractImpl$setupPlotline$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = plotlineContractImpl$setupPlotline$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!this.m.f1078a.b) {
                return unit;
            }
            MutexImpl mutexImpl = this.r;
            plotlineContractImpl$setupPlotline$1.L$0 = mutexImpl;
            plotlineContractImpl$setupPlotline$1.label = 1;
            if (mutexImpl.a(plotlineContractImpl$setupPlotline$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) plotlineContractImpl$setupPlotline$1.L$0;
            ResultKt.b(obj);
        }
        try {
            if (this.n) {
                return unit;
            }
            if (!applicationForegroundManager.getF2712a()) {
                if (this.o != null) {
                    f2712a = applicationForegroundManager.getF2712a();
                } else {
                    ?? r2 = new ForegroundListener() { // from class: app.chalo.plotline.PlotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1
                        @Override // app.chalo.features.foreground.ForegroundListener
                        public final void b() {
                            PlotlineContractImpl plotlineContractImpl = this.f6840a;
                            BuildersKt.d(plotlineContractImpl.p, null, null, new PlotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1$onBecameForeground$1(plotlineContractImpl, null), 3);
                        }

                        @Override // app.chalo.features.foreground.ForegroundListener
                        public final void a() {
                        }
                    };
                    this.o = r2;
                    applicationForegroundManager.a(r2);
                    f2712a = applicationForegroundManager.getF2712a();
                }
                if (!f2712a) {
                    return unit;
                }
            }
            PlotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1 plotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1 = this.o;
            if (plotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1 != null) {
                applicationForegroundManager.b(plotlineContractImpl$registerDeferredForegroundInitListenerIfRequiredLocked$listener$1);
                this.o = null;
            }
            g();
            i(this.g);
            Plotline.b().c0 = new os0(new a(this), 0);
            return unit;
        } finally {
            mutex.e(null);
        }
    }

    @Override // app.chalo.plotline.PlotlineContract
    public final void c(Map properties) throws JSONException {
        Intrinsics.i(properties, "properties");
        if (this.m.f1078a.b) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : properties.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            Plotline.f(jSONObject);
        }
    }

    @Override // app.chalo.plotline.PlotlineContract
    public final void d(Map superPropertiesMap) {
        Intrinsics.i(superPropertiesMap, "superPropertiesMap");
        if (this.m.f1078a.b) {
            BuildersKt.d(this.p, null, null, new PlotlineContractImpl$setSuperPropertiesForPlotline$1(this, superPropertiesMap, null), 3);
        }
    }

    public final void g() {
        if (this.m.f1078a.b) {
            Context context = this.f6837a.f1927a;
            String apiKey = this.e.getK();
            String userId = this.b.getDeviceId();
            Intrinsics.i(apiKey, "apiKey");
            Intrinsics.i(userId, "userId");
            if (context == null) {
                context = null;
            }
            Plotline.b().W = "KMP";
            new Thread(new j2(26, userId, (Object) context, (Object) apiKey)).start();
            this.n = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ContinuationImpl continuationImpl) {
        PlotlineContractImpl$resetPlotlineSetup$1 plotlineContractImpl$resetPlotlineSetup$1;
        Mutex mutex;
        if (continuationImpl instanceof PlotlineContractImpl$resetPlotlineSetup$1) {
            plotlineContractImpl$resetPlotlineSetup$1 = (PlotlineContractImpl$resetPlotlineSetup$1) continuationImpl;
            int i = plotlineContractImpl$resetPlotlineSetup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                plotlineContractImpl$resetPlotlineSetup$1.label = i - Integer.MIN_VALUE;
            } else {
                plotlineContractImpl$resetPlotlineSetup$1 = new PlotlineContractImpl$resetPlotlineSetup$1(this, continuationImpl);
            }
        } else {
            plotlineContractImpl$resetPlotlineSetup$1 = new PlotlineContractImpl$resetPlotlineSetup$1(this, continuationImpl);
        }
        Object obj = plotlineContractImpl$resetPlotlineSetup$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = plotlineContractImpl$resetPlotlineSetup$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = this.r;
            plotlineContractImpl$resetPlotlineSetup$1.L$0 = mutexImpl;
            plotlineContractImpl$resetPlotlineSetup$1.label = 1;
            if (mutexImpl.a(plotlineContractImpl$resetPlotlineSetup$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) plotlineContractImpl$resetPlotlineSetup$1.L$0;
            ResultKt.b(obj);
        }
        try {
            if (this.n) {
                if (this.m.f1078a.b) {
                    Context context = this.f6837a.f1927a;
                    if (context == null) {
                        context = null;
                    }
                    HashSet hashSet = PlotlineWidget.p;
                    try {
                        Plotline.b().h(context);
                        so.plotline.insights.Tasks.a.a(new e0(new JSONArray()));
                    } catch (Exception e) {
                        DebugHelper.a(e);
                    }
                }
                this.n = false;
            }
            mutex.e(null);
            return Unit.f17538a;
        } catch (Throwable th) {
            mutex.e(null);
            throw th;
        }
    }
}
