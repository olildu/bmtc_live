package app.chalo.deeplink;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ReportProblemPath;
import app.chalo.constants.Source;
import app.chalo.features.freshchat.FreshchatSupportLauncher;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.SplashArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.vo1;
import in.juspay.hyper.constants.Labels;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/deeplink/DeepLinkNavigationHandler;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeepLinkNavigationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeepLinkRuntime f2451a;
    public final DeepLinkNavigationMapper b;
    public final ChaloNavigationManager c;
    public final DeepLinkGuard d;
    public final UserProfileDetailsProvider e;
    public final DeepLinkConsentManager f;
    public final FreshchatSupportLauncher g;
    public final ChaloAppFeatureHelper h;
    public final UrlOpenHelper i;
    public final AnalyticsContract j;
    public final ContextScope k;
    public Job l;
    public final DeepLinkResumeMonitor m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/deeplink/DeepLinkNavigationHandler$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final void a(String message) {
            Intrinsics.i(message, "message");
        }
    }

    public DeepLinkNavigationHandler(DeepLinkRuntime deepLinkRuntime, DeepLinkNavigationMapper deepLinkNavigationMapper, ChaloNavigationManager chaloNavigationManager, DeepLinkGuard deepLinkGuard, DeepLinkResumeManager deepLinkResumeManager, UserProfileDetailsProvider userProfileDetailsProvider, DeepLinkConsentManager deepLinkConsentManager, FreshchatSupportLauncher freshchatSupportLauncher, ChaloAppFeatureHelper chaloAppFeatureHelper, UrlOpenHelper urlOpenHelper, AnalyticsContract analyticsContract, CoroutineContextProvider coroutineContextProvider, List additionalResumeConditions) {
        Intrinsics.i(additionalResumeConditions, "additionalResumeConditions");
        this.f2451a = deepLinkRuntime;
        this.b = deepLinkNavigationMapper;
        this.c = chaloNavigationManager;
        this.d = deepLinkGuard;
        this.e = userProfileDetailsProvider;
        this.f = deepLinkConsentManager;
        this.g = freshchatSupportLauncher;
        this.h = chaloAppFeatureHelper;
        this.i = urlOpenHelper;
        this.j = analyticsContract;
        this.k = CoroutineScopeKt.a(coroutineContextProvider.a().plus(SupervisorKt.b()));
        ListBuilder listBuilderY = CollectionsKt.y();
        listBuilderY.add(new DeepLinkResumeCondition(FirebaseAnalytics.Event.LOGIN, userProfileDetailsProvider.g()));
        final Flow flowA = deepLinkConsentManager.getG();
        listBuilderY.add(new DeepLinkResumeCondition("consent", new Flow<Boolean>() { // from class: app.chalo.deeplink.DeepLinkNavigationHandler$resumeMonitor$lambda$0$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.deeplink.DeepLinkNavigationHandler$resumeMonitor$lambda$0$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2453a;

                /* JADX INFO: renamed from: app.chalo.deeplink.DeepLinkNavigationHandler$resumeMonitor$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.deeplink.DeepLinkNavigationHandler$resumeMonitor$lambda$0$$inlined$map$1$2", f = "DeepLinkNavigationHandler.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f2453a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                        anonymousClass1.label = 1;
                        if (this.f2453a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }));
        listBuilderY.addAll(additionalResumeConditions);
        this.m = new DeepLinkResumeMonitor(deepLinkResumeManager, listBuilderY.g());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(DeepLinkNavigationHandler deepLinkNavigationHandler, ContinuationImpl continuationImpl) {
        DeepLinkNavigationHandler$handleSendFeedback$1 deepLinkNavigationHandler$handleSendFeedback$1;
        deepLinkNavigationHandler.getClass();
        AnalyticsContract analyticsContract = deepLinkNavigationHandler.j;
        if (continuationImpl instanceof DeepLinkNavigationHandler$handleSendFeedback$1) {
            deepLinkNavigationHandler$handleSendFeedback$1 = (DeepLinkNavigationHandler$handleSendFeedback$1) continuationImpl;
            int i = deepLinkNavigationHandler$handleSendFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deepLinkNavigationHandler$handleSendFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                deepLinkNavigationHandler$handleSendFeedback$1 = new DeepLinkNavigationHandler$handleSendFeedback$1(deepLinkNavigationHandler, continuationImpl);
            }
        } else {
            deepLinkNavigationHandler$handleSendFeedback$1 = new DeepLinkNavigationHandler$handleSendFeedback$1(deepLinkNavigationHandler, continuationImpl);
        }
        Object objD = deepLinkNavigationHandler$handleSendFeedback$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = deepLinkNavigationHandler$handleSendFeedback$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            ChaloAppFeatureHelper chaloAppFeatureHelper = deepLinkNavigationHandler.h;
            deepLinkNavigationHandler$handleSendFeedback$1.label = 1;
            objD = chaloAppFeatureHelper.d(deepLinkNavigationHandler$handleSendFeedback$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        ReportProblemPath reportProblemPath = (ReportProblemPath) objD;
        if (reportProblemPath instanceof ReportProblemPath.WebViewPath) {
            ChaloNavigationManagerKt.b(deepLinkNavigationHandler.c, SplashArgs.INSTANCE, ((ReportProblemPath.WebViewPath) reportProblemPath).f1033a);
            AnalyticsContract.DefaultImpls.a(analyticsContract, "support deeplink routed", Source.DEEPLINK_HELPER.getSourceName(), vo1.s("supportPath", Labels.Android.WEBVIEW), null, false, 24);
        } else if (reportProblemPath instanceof ReportProblemPath.WhatsAppPath) {
            ReportProblemPath.WhatsAppPath whatsAppPath = (ReportProblemPath.WhatsAppPath) reportProblemPath;
            if (deepLinkNavigationHandler.i.a(whatsAppPath.a(), null)) {
                AnalyticsContract.DefaultImpls.a(analyticsContract, "support deeplink routed", Source.DEEPLINK_HELPER.getSourceName(), vo1.s("supportPath", "whatsapp"), null, false, 24);
            } else {
                Companion.a(vo1.B("whatsapp support deeplink not opened; url=", whatsAppPath.a(), "; leaving navigation untouched"));
            }
        } else {
            if (!Intrinsics.d(reportProblemPath, ReportProblemPath.FreshChatPath.f1032a)) {
                throw new NoWhenBranchMatchedException();
            }
            deepLinkNavigationHandler.g.a();
        }
        return Unit.f17538a;
    }

    public final void b() {
        Flow<Boolean> flowS;
        Job job = this.l;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.f2451a.b, new DeepLinkNavigationHandler$start$1(this, null));
            ContextScope scope = this.k;
            this.l = FlowKt.A(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, scope);
            DeepLinkResumeMonitor deepLinkResumeMonitor = this.m;
            List list = deepLinkResumeMonitor.b;
            Intrinsics.i(scope, "scope");
            Job job2 = deepLinkResumeMonitor.c;
            if (job2 == null || !((AbstractCoroutine) job2).isActive()) {
                if (list.isEmpty()) {
                    deepLinkResumeMonitor.d = true;
                    return;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    final Flow flowM = FlowKt.m(((DeepLinkResumeCondition) it.next()).b);
                    arrayList.add(new Flow<Boolean>() { // from class: app.chalo.deeplink.DeepLinkResumeMonitor$buildConditionStateFlow$lambda$0$$inlined$map$1

                        /* JADX INFO: renamed from: app.chalo.deeplink.DeepLinkResumeMonitor$buildConditionStateFlow$lambda$0$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ FlowCollector f2468a;

                            /* JADX INFO: renamed from: app.chalo.deeplink.DeepLinkResumeMonitor$buildConditionStateFlow$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "app.chalo.deeplink.DeepLinkResumeMonitor$buildConditionStateFlow$lambda$0$$inlined$map$1$2", f = "DeepLinkResumeMonitor.kt", l = {50}, m = "emit", v = 1)
                            public final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.f2468a = flowCollector;
                            }

                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                                Object obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.b(obj2);
                                    Boolean bool = (Boolean) obj;
                                    bool.getClass();
                                    anonymousClass1.label = 1;
                                    if (this.f2468a.emit(bool, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.b(obj2);
                                }
                                return Unit.f17538a;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = flowM.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                        }
                    });
                }
                if (arrayList.isEmpty()) {
                    flowS = FlowKt.s();
                } else {
                    final Flow[] flowArr = (Flow[]) CollectionsKt.D0(arrayList).toArray(new Flow[0]);
                    flowS = new Flow<Boolean>() { // from class: app.chalo.deeplink.DeepLinkResumeMonitor$buildConditionStateFlow$$inlined$combine$1

                        /* JADX INFO: renamed from: app.chalo.deeplink.DeepLinkResumeMonitor$buildConditionStateFlow$$inlined$combine$1$3, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.deeplink.DeepLinkResumeMonitor$buildConditionStateFlow$$inlined$combine$1$3", f = "DeepLinkResumeMonitor.kt", l = {288}, m = "invokeSuspend", v = 1)
                        public final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Boolean[], Continuation<? super Unit>, Object> {
                            private /* synthetic */ Object L$0;
                            /* synthetic */ Object L$1;
                            int label;

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, (Continuation) obj3);
                                anonymousClass3.L$0 = (FlowCollector) obj;
                                anonymousClass3.L$1 = (Object[]) obj2;
                                return anonymousClass3.invokeSuspend(Unit.f17538a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.b(obj);
                                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                                    Boolean[] boolArr = (Boolean[]) ((Object[]) this.L$1);
                                    int length = boolArr.length;
                                    boolean z = false;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length) {
                                            z = true;
                                            break;
                                        }
                                        if (!boolArr[i2].booleanValue()) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(z);
                                    this.label = 1;
                                    if (flowCollector.emit(boolValueOf, this) == coroutineSingletons) {
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

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            final Flow[] flowArr2 = flowArr;
                            Object objA = CombineKt.a(continuation, new Function0<Boolean[]>() { // from class: app.chalo.deeplink.DeepLinkResumeMonitor$buildConditionStateFlow$$inlined$combine$1.2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return new Boolean[flowArr2.length];
                                }
                            }, new AnonymousClass3(3, null), flowCollector, flowArr2);
                            return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
                        }
                    };
                }
                deepLinkResumeMonitor.c = FlowKt.A(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(flowS, new DeepLinkResumeMonitor$start$1(deepLinkResumeMonitor, null)), scope);
            }
        }
    }
}
