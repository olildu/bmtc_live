package app.chalo.features.fcmtoken;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.freshchat.FreshChatInitManager;
import app.chalo.network.NetworkManager;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.plotline.PlotlineNotificationManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.thoughtnudge.ThoughtNudgeNotificationManager;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/fcmtoken/FcmTokenFeatureImpl;", "Lapp/chalo/features/fcmtoken/FcmTokenFeature;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FcmTokenFeatureImpl implements FcmTokenFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMReceiver f2699a;
    public final NetworkManager b;
    public final UserProfileDetailsProvider c;
    public final BasicInfoContract d;
    public final DataStore e;
    public final CrashlyticsLogger f;
    public final FreshChatInitManager g;
    public final PlotlineNotificationManager h;
    public final ThoughtNudgeNotificationManager i;
    public final ContextScope j;

    /* JADX INFO: renamed from: app.chalo.features.fcmtoken.FcmTokenFeatureImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.features.fcmtoken.FcmTokenFeatureImpl$1", f = "FcmTokenFeatureImpl.kt", l = {39}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FcmTokenFeatureImpl.this.new AnonymousClass1(continuation);
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
                StateFlow stateFlowB = FcmTokenFeatureImpl.this.f2699a.b();
                final FcmTokenFeatureImpl fcmTokenFeatureImpl = FcmTokenFeatureImpl.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.features.fcmtoken.FcmTokenFeatureImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        String str = (String) obj2;
                        FcmTokenFeatureImpl fcmTokenFeatureImpl2 = fcmTokenFeatureImpl;
                        if (str != null) {
                            fcmTokenFeatureImpl2.g.b(str);
                            fcmTokenFeatureImpl2.h.c(str);
                            fcmTokenFeatureImpl2.i.d(str);
                        }
                        fcmTokenFeatureImpl2.a(false);
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlowB.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/fcmtoken/FcmTokenFeatureImpl$Companion;", "", "", "USER_FCM_TOKEN", "Ljava/lang/String;", "NOTIFICATION_UPDATE", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FcmTokenFeatureImpl(GCMReceiver gCMReceiver, CoroutineContextProvider coroutineContextProvider, NetworkManager networkManager, UserProfileDetailsProvider userProfileDetailsProvider, BasicInfoContract basicInfoContract, DataStore dataStore, CrashlyticsLogger crashlyticsLogger, FreshChatInitManager freshChatInitManager, PlotlineNotificationManager plotlineNotificationManager, ThoughtNudgeNotificationManager thoughtNudgeNotificationManager) {
        this.f2699a = gCMReceiver;
        this.b = networkManager;
        this.c = userProfileDetailsProvider;
        this.d = basicInfoContract;
        this.e = dataStore;
        this.f = crashlyticsLogger;
        this.g = freshChatInitManager;
        this.h = plotlineNotificationManager;
        this.i = thoughtNudgeNotificationManager;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.j = contextScopeA;
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(FcmTokenFeatureImpl fcmTokenFeatureImpl, String str, ContinuationImpl continuationImpl) {
        FcmTokenFeatureImpl$shouldSendFcmTokenToServer$1 fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1;
        boolean z;
        fcmTokenFeatureImpl.getClass();
        if (continuationImpl instanceof FcmTokenFeatureImpl$shouldSendFcmTokenToServer$1) {
            fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1 = (FcmTokenFeatureImpl$shouldSendFcmTokenToServer$1) continuationImpl;
            int i = fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.label = i - Integer.MIN_VALUE;
            } else {
                fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1 = new FcmTokenFeatureImpl$shouldSendFcmTokenToServer$1(fcmTokenFeatureImpl, continuationImpl);
            }
        } else {
            fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1 = new FcmTokenFeatureImpl$shouldSendFcmTokenToServer$1(fcmTokenFeatureImpl, continuationImpl);
        }
        Object obj = fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            boolean zBooleanValue = ((Boolean) fcmTokenFeatureImpl.c.g().getValue()).booleanValue();
            if (!zBooleanValue) {
                return Boolean.FALSE;
            }
            final Flow data = fcmTokenFeatureImpl.e.getData();
            Flow<String> flow = new Flow<String>() { // from class: app.chalo.features.fcmtoken.FcmTokenFeatureImpl$shouldSendFcmTokenToServer$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: app.chalo.features.fcmtoken.FcmTokenFeatureImpl$shouldSendFcmTokenToServer$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f2702a;

                    /* JADX INFO: renamed from: app.chalo.features.fcmtoken.FcmTokenFeatureImpl$shouldSendFcmTokenToServer$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.features.fcmtoken.FcmTokenFeatureImpl$shouldSendFcmTokenToServer$$inlined$mapNotNull$1$2", f = "FcmTokenFeatureImpl.kt", l = {52}, m = "emit", v = 1)
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
                        this.f2702a = flowCollector;
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
                            Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey("user_fcm_token"));
                            if (obj3 != null) {
                                anonymousClass1.label = 1;
                                if (this.f2702a.emit(obj3, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
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
                    Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.L$0 = str;
            fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.Z$0 = zBooleanValue;
            fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.label = 1;
            Object objV = FlowKt.v(flow, fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objV;
            z = zBooleanValue;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.Z$0;
            str = (String) fcmTokenFeatureImpl$shouldSendFcmTokenToServer$1.L$0;
            ResultKt.b(obj);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(z && !str2.equals(str));
    }

    @Override // app.chalo.features.fcmtoken.FcmTokenFeature
    public final void a(boolean z) {
        BuildersKt.d(this.j, null, null, new FcmTokenFeatureImpl$sendFcmTokenIfNotSetAlready$1(this, z, null), 3);
    }

    @Override // app.chalo.features.fcmtoken.FcmTokenFeature
    public final Object b(Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.e, new FcmTokenFeatureImpl$clearUserFcmToken$2(2, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }
}
