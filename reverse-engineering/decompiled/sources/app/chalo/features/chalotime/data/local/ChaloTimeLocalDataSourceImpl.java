package app.chalo.features.chalotime.data.local;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.utils.ElapsedRealTimeClock;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/chalotime/data/local/ChaloTimeLocalDataSourceImpl;", "Lapp/chalo/features/chalotime/data/local/ChaloTimeLocalDataSource;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeLocalDataSourceImpl implements ChaloTimeLocalDataSource {
    public static final Preferences.Key b = PreferencesKeys.stringKey("keyCachedChaloTime");
    public static final Preferences.Key c = PreferencesKeys.stringKey("keyCachedElapsedRealTime");
    public static final Preferences.Key d = PreferencesKeys.stringKey("keyCachedSystemTime");
    public static final Preferences.Key e = PreferencesKeys.stringKey("keyCachedElapsedRealTimeLogicVersion");
    public static final Preferences.Key f = PreferencesKeys.stringKey("keyCachedAppVersionCodeForChaloTime");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f2659a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lapp/chalo/features/chalotime/data/local/ChaloTimeLocalDataSourceImpl$Companion;", "", "", "CHALO_TIME_DATA_STORE", "Ljava/lang/String;", "KEY_CACHED_CHALO_TIME", "KEY_CACHED_ELAPSED_REAL_TIME", "KEY_CACHED_SYSTEM_TIME", "KEY_CACHED_ELAPSED_REAL_TIME_LOGIC_VERSION", "KEY_CACHED_APP_VERSION_CODE_FOR_CHALO_TIME", "Landroidx/datastore/preferences/core/Preferences$Key;", "keyCachedChaloTime", "Landroidx/datastore/preferences/core/Preferences$Key;", "keyCachedElapsedRealTime", "keyCachedSystemTime", "keyCachedElapsedRealTimeLogicVersion", "keyCachedAppVersionCodeForChaloTime", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ChaloTimeLocalDataSourceImpl(DataStore dataStore) {
        this.f2659a = dataStore;
    }

    @Override // app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource
    public final Object a(long j, long j2, long j3, ElapsedRealTimeClock elapsedRealTimeClock, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f2659a, new ChaloTimeLocalDataSourceImpl$updateChaloTimeCache$2(j, j2, j3, elapsedRealTimeClock, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource
    public final Object b(Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f2659a, new ChaloTimeLocalDataSourceImpl$clearCache$2(2, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource
    public final Object c(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f2659a, new ChaloTimeLocalDataSourceImpl$updateAppVersionCodeForChaloTime$2(str, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTime$$inlined$map$1] */
    @Override // app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource
    public final ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTime$$inlined$map$1 d() {
        final Flow data = this.f2659a.getData();
        return new Flow<Long>() { // from class: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTime$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTime$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2665a;

                /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTime$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTime$$inlined$map$1$2", f = "ChaloTimeLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2665a = flowCollector;
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
                        String str = (String) ((Preferences) obj).get(ChaloTimeLocalDataSourceImpl.c);
                        Long lT0 = str != null ? StringsKt.t0(str) : null;
                        anonymousClass1.label = 1;
                        if (this.f2665a.emit(lT0, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedSystemTime$$inlined$map$1] */
    @Override // app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource
    public final ChaloTimeLocalDataSourceImpl$getCachedSystemTime$$inlined$map$1 e() {
        final Flow data = this.f2659a.getData();
        return new Flow<Long>() { // from class: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedSystemTime$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedSystemTime$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2669a;

                /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedSystemTime$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedSystemTime$$inlined$map$1$2", f = "ChaloTimeLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2669a = flowCollector;
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
                        String str = (String) ((Preferences) obj).get(ChaloTimeLocalDataSourceImpl.d);
                        Long lT0 = str != null ? StringsKt.t0(str) : null;
                        anonymousClass1.label = 1;
                        if (this.f2669a.emit(lT0, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedChaloTime$$inlined$map$1] */
    @Override // app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource
    public final ChaloTimeLocalDataSourceImpl$getCachedChaloTime$$inlined$map$1 f() {
        final Flow data = this.f2659a.getData();
        return new Flow<Long>() { // from class: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedChaloTime$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedChaloTime$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2663a;

                /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedChaloTime$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedChaloTime$$inlined$map$1$2", f = "ChaloTimeLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2663a = flowCollector;
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
                        String str = (String) ((Preferences) obj).get(ChaloTimeLocalDataSourceImpl.b);
                        Long lT0 = str != null ? StringsKt.t0(str) : null;
                        anonymousClass1.label = 1;
                        if (this.f2663a.emit(lT0, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTimeLogic$$inlined$map$1] */
    @Override // app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource
    public final ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTimeLogic$$inlined$map$1 g() {
        final Flow data = this.f2659a.getData();
        return new Flow<String>() { // from class: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTimeLogic$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTimeLogic$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2667a;

                /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTimeLogic$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTimeLogic$$inlined$map$1$2", f = "ChaloTimeLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2667a = flowCollector;
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
                        Object obj3 = ((Preferences) obj).get(ChaloTimeLocalDataSourceImpl.e);
                        anonymousClass1.label = 1;
                        if (this.f2667a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedAppVersionCodeForChaloTime$$inlined$map$1] */
    @Override // app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource
    public final ChaloTimeLocalDataSourceImpl$getCachedAppVersionCodeForChaloTime$$inlined$map$1 h() {
        final Flow data = this.f2659a.getData();
        return new Flow<String>() { // from class: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedAppVersionCodeForChaloTime$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedAppVersionCodeForChaloTime$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2661a;

                /* JADX INFO: renamed from: app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedAppVersionCodeForChaloTime$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$getCachedAppVersionCodeForChaloTime$$inlined$map$1$2", f = "ChaloTimeLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2661a = flowCollector;
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
                        Object obj3 = ((Preferences) obj).get(ChaloTimeLocalDataSourceImpl.f);
                        anonymousClass1.label = 1;
                        if (this.f2661a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
