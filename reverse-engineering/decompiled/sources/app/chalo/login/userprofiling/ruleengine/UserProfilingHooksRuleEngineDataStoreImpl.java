package app.chalo.login.userprofiling.ruleengine;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.datastore.LocalDataStore;
import app.chalo.network.config.ChaloJson;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/userprofiling/ruleengine/UserProfilingHooksRuleEngineDataStoreImpl;", "Lapp/chalo/login/userprofiling/ruleengine/UserProfilingHooksRuleEngineDataStore;", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfilingHooksRuleEngineDataStoreImpl implements UserProfilingHooksRuleEngineDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f5382a;
    public final LocalDataStore b;
    public final MutexImpl c = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/login/userprofiling/ruleengine/UserProfilingHooksRuleEngineDataStoreImpl$Companion;", "", "", "USER_PROFILING_RULE_ENGINE_DATA_STORE_NAME", "Ljava/lang/String;", "LOGIN_SESSION_COUNT_KEY", "RULE_STATE_KEY", "DELIMITER", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final Preferences.Key a(String str, String str2) {
            return PreferencesKeys.stringKey(vo1.B("ruleState_", str, "_") + str2);
        }
    }

    public UserProfilingHooksRuleEngineDataStoreImpl(DataStore dataStore, LocalDataStore localDataStore) {
        this.f5382a = dataStore;
        this.b = localDataStore;
    }

    @Override // app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore
    public final Object a(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f5382a, new UserProfilingHooksRuleEngineDataStoreImpl$deleteRuleStatesForUser$2(vo1.B("ruleState_", str, "_"), null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore
    public final Object b(final String str, final String str2, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$1 userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$1) {
            userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1 = (UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$1) continuationImpl;
            int i = userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1 = new UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1 = new UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$1(this, continuationImpl);
        }
        Object objV = userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            final Flow data = this.f5382a.getData();
            Flow<String> flow = new Flow<String>() { // from class: app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f5386a;
                    public final /* synthetic */ String b;
                    public final /* synthetic */ String c;

                    /* JADX INFO: renamed from: app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl$getRuleState$$inlined$map$1$2", f = "UserProfilingHooksRuleEngineDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, String str, String str2) {
                        this.f5386a = flowCollector;
                        this.b = str;
                        this.c = str2;
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
                            Object obj3 = ((Preferences) obj).get(UserProfilingHooksRuleEngineDataStoreImpl.Companion.a(this.b, this.c));
                            anonymousClass1.label = 1;
                            if (this.f5386a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = data.collect(new AnonymousClass2(flowCollector, str, str2), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1.label = 1;
            objV = FlowKt.v(flow, userProfilingHooksRuleEngineDataStoreImpl$getRuleState$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        String str3 = (String) objV;
        Object objB = null;
        if (str3 == null) {
            return null;
        }
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str3, PersistedRuleState.INSTANCE.serializer());
        } catch (Exception unused) {
        }
        return (PersistedRuleState) objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore
    public final Object c(final String str, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1 userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1) {
            userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1 = (UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1) continuationImpl;
            int i = userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1 = new UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1 = new UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1(this, continuationImpl);
        }
        Object objV = userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            final Flow data = this.f5382a.getData();
            Flow<Long> flow = new Flow<Long>() { // from class: app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f5384a;
                    public final /* synthetic */ String b;

                    /* JADX INFO: renamed from: app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$$inlined$map$1$2", f = "UserProfilingHooksRuleEngineDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, String str) {
                        this.f5384a = flowCollector;
                        this.b = str;
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
                            Long l = (Long) ((Preferences) obj).get(PreferencesKeys.longKey("loginSessionCount_" + this.b));
                            Long l2 = new Long(l != null ? l.longValue() : 0L);
                            anonymousClass1.label = 1;
                            if (this.f5384a.emit(l2, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = data.collect(new AnonymousClass2(flowCollector, str), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1.label = 1;
            objV = FlowKt.v(flow, userProfilingHooksRuleEngineDataStoreImpl$getLoginSessionCount$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Long l = (Long) objV;
        return new Long(l != null ? l.longValue() : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore
    public final Object d(ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1 userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1;
        Long lT0;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1) {
            userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1 = (UserProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1) continuationImpl;
            int i = userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1 = new UserProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1 = new UserProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1(this, continuationImpl);
        }
        Object objF = userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1.label = 1;
            objF = this.b.f("appSessionCount", userProfilingHooksRuleEngineDataStoreImpl$getAppSessionCount$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        String str = (String) objF;
        return new Long((str == null || (lT0 = StringsKt.t0(str)) == null) ? 0L : lT0.longValue());
    }

    @Override // app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore
    public final Object e(PersistedRuleState persistedRuleState, ContinuationImpl continuationImpl) {
        Json json = ChaloJson.b;
        json.getClass();
        Object objEdit = PreferencesKt.edit(this.f5382a, new UserProfilingHooksRuleEngineDataStoreImpl$upsertRuleState$2(persistedRuleState, json.a(PersistedRuleState.INSTANCE.serializer(), persistedRuleState), null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore
    public final Object f(long j, String str, ContinuationImpl continuationImpl) throws Throwable {
        UserProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1 userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1;
        String str2;
        Mutex mutex;
        Mutex mutex2;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1) {
            userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1 = (UserProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1) continuationImpl;
            int i = userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1 = new UserProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1 = new UserProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1(this, continuationImpl);
        }
        Object objEdit = userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objEdit);
                userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.L$0 = str;
                MutexImpl mutexImpl = this.c;
                userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.L$1 = mutexImpl;
                userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.J$0 = j;
                userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.label = 1;
                if (mutexImpl.a(userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1) != coroutineSingletons) {
                    str2 = str;
                    mutex = mutexImpl;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.L$0;
                try {
                    ResultKt.b(objEdit);
                    mutex2.e(null);
                    return Unit.f17538a;
                } catch (Throwable th) {
                    th = th;
                    mutex2.e(null);
                    throw th;
                }
            }
            j = userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.J$0;
            mutex = (Mutex) userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.L$1;
            str2 = (String) userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.L$0;
            ResultKt.b(objEdit);
            DataStore dataStore = this.f5382a;
            UserProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$2$1 userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$2$1 = new UserProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$2$1(j, str2, null);
            userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.L$0 = mutex;
            userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.L$1 = null;
            userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1.label = 2;
            objEdit = PreferencesKt.edit(dataStore, userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$2$1, userProfilingHooksRuleEngineDataStoreImpl$setLoginSessionCount$1);
            if (objEdit != coroutineSingletons) {
                mutex2 = mutex;
                mutex2.e(null);
                return Unit.f17538a;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.e(null);
            throw th;
        }
    }
}
