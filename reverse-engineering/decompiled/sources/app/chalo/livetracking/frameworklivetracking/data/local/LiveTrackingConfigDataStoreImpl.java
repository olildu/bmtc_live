package app.chalo.livetracking.frameworklivetracking.data.local;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.livetracking.tripplanner.domain.GetSeatAvailabilityModeKey;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/local/LiveTrackingConfigDataStoreImpl;", "Lapp/chalo/livetracking/frameworklivetracking/data/local/LiveTrackingConfigDataStore;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveTrackingConfigDataStoreImpl implements LiveTrackingConfigDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f4226a;
    public final GetSeatAvailabilityModeKey b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/local/LiveTrackingConfigDataStoreImpl$Companion;", "", "", "DATASTORE_NAME", "Ljava/lang/String;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LiveTrackingConfigDataStoreImpl(DataStore dataStore, GetSeatAvailabilityModeKey getSeatAvailabilityModeKey) {
        this.f4226a = dataStore;
        this.b = getSeatAvailabilityModeKey;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object a(Continuation continuation) {
        final Flow data = this.f4226a.getData();
        return FlowKt.v(new Flow<String>() { // from class: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getSeatAvailabilityMaxDelay$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getSeatAvailabilityMaxDelay$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4234a;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getSeatAvailabilityMaxDelay$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getSeatAvailabilityMaxDelay$$inlined$map$1$2", f = "LiveTrackingConfigDataStore.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4234a = flowCollector;
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
                        Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey("seatAvailabilityDelayThreshold"));
                        anonymousClass1.label = 1;
                        if (this.f4234a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, continuation);
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object b(String str, String str2, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f4226a, new LiveTrackingConfigDataStoreImpl$setOccupancyDialogLearnMoreUrl$2(str, str2, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object c(String str, ContinuationImpl continuationImpl, boolean z) {
        Object objEdit = PreferencesKt.edit(this.f4226a, new LiveTrackingConfigDataStoreImpl$setShouldShowSeatOccupancyDialog$2(str, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object d(String str, String str2, Continuation continuation) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objEdit = PreferencesKt.edit(this.f4226a, new LiveTrackingConfigDataStoreImpl$setOccupancyFactor$2("seatAvailabilityOccupancyFactor".concat(lowerCase), str2, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object e(final String str, ContinuationImpl continuationImpl) {
        final Flow data = this.f4226a.getData();
        return FlowKt.v(new Flow<String>() { // from class: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getSeatAvailabilityModeKey$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getSeatAvailabilityModeKey$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4236a;
                public final /* synthetic */ String b;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getSeatAvailabilityModeKey$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getSeatAvailabilityModeKey$$inlined$map$1$2", f = "LiveTrackingConfigDataStore.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, LiveTrackingConfigDataStoreImpl liveTrackingConfigDataStoreImpl, String str) {
                    this.f4236a = flowCollector;
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
                        String cityId = this.b;
                        Intrinsics.i(cityId, "cityId");
                        Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey("seatAvailabilityApiMode".concat(cityId)));
                        anonymousClass1.label = 1;
                        if (this.f4236a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector, this, str), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, continuationImpl);
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object f(SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f4226a, new LiveTrackingConfigDataStoreImpl$setSeatOccupancyDialogShown$2(true, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object g(final String str, ContinuationImpl continuationImpl) {
        LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1 liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1;
        if (continuationImpl instanceof LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1) {
            liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1 = (LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1) continuationImpl;
            int i = liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1 = new LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1(this, continuationImpl);
            }
        } else {
            liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1 = new LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1(this, continuationImpl);
        }
        Object objV = liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            final Flow data = this.f4226a.getData();
            Flow<String> flow = new Flow<String>() { // from class: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f4238a;
                    public final /* synthetic */ String b;

                    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$$inlined$map$1$2", f = "LiveTrackingConfigDataStore.kt", l = {50}, m = "emit", v = 1)
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
                        this.f4238a = flowCollector;
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
                            Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey("shouldShowSeatOccupancyDialogHomescreen" + this.b));
                            anonymousClass1.label = 1;
                            if (this.f4238a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
            liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1.label = 1;
            objV = FlowKt.v(flow, liveTrackingConfigDataStoreImpl$getShouldShowSeatOccupancyDialog$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        String str2 = (String) objV;
        if (str2 != null) {
            return Boolean.valueOf(Boolean.parseBoolean(str2));
        }
        return null;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object h(String str, Continuation continuation) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        final String strConcat = "seatAvailabilityOccupancyFactor".concat(lowerCase);
        final Flow data = this.f4226a.getData();
        return FlowKt.v(new Flow<String>() { // from class: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyFactor$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyFactor$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4232a;
                public final /* synthetic */ String b;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyFactor$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyFactor$$inlined$map$1$2", f = "LiveTrackingConfigDataStore.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4232a = flowCollector;
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
                        Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey(this.b));
                        anonymousClass1.label = 1;
                        if (this.f4232a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector, strConcat), continuation2);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, continuation);
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object i(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f4226a, new LiveTrackingConfigDataStoreImpl$setSeatAvailabilityMaxDelay$2(str, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object j(final String str, ContinuationImpl continuationImpl) {
        final Flow data = this.f4226a.getData();
        return FlowKt.v(new Flow<String>() { // from class: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyDialogLearnMoreUrl$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyDialogLearnMoreUrl$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4228a;
                public final /* synthetic */ String b;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyDialogLearnMoreUrl$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyDialogLearnMoreUrl$$inlined$map$1$2", f = "LiveTrackingConfigDataStore.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4228a = flowCollector;
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
                        Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey("seatOccupancyDialoglearnMoreUrl" + this.b));
                        anonymousClass1.label = 1;
                        if (this.f4228a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
        }, continuationImpl);
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object k(final String str, ContinuationImpl continuationImpl) {
        final Flow data = this.f4226a.getData();
        return FlowKt.v(new Flow<String>() { // from class: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyDialogNoticeText$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyDialogNoticeText$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4230a;
                public final /* synthetic */ String b;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyDialogNoticeText$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$getOccupancyDialogNoticeText$$inlined$map$1$2", f = "LiveTrackingConfigDataStore.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4230a = flowCollector;
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
                        Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey("seatOccupancyDialogNotice" + this.b));
                        anonymousClass1.label = 1;
                        if (this.f4230a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
        }, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object l(ContinuationImpl continuationImpl) {
        LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1 liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1;
        if (continuationImpl instanceof LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1) {
            liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1 = (LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1) continuationImpl;
            int i = liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1.label = i - Integer.MIN_VALUE;
            } else {
                liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1 = new LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1(this, continuationImpl);
            }
        } else {
            liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1 = new LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1(this, continuationImpl);
        }
        Object objV = liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            final Flow data = this.f4226a.getData();
            Flow<String> flow = new Flow<String>() { // from class: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f4240a;

                    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$$inlined$map$1$2", f = "LiveTrackingConfigDataStore.kt", l = {50}, m = "emit", v = 1)
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
                        this.f4240a = flowCollector;
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
                            Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey("seatOccupancyDialogShown"));
                            anonymousClass1.label = 1;
                            if (this.f4240a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
            liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1.label = 1;
            objV = FlowKt.v(flow, liveTrackingConfigDataStoreImpl$isSeatOccupancyDialogShown$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        String str = (String) objV;
        if (str != null) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        return null;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object m(String str, String str2, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f4226a, new LiveTrackingConfigDataStoreImpl$setOccupancyDialogNoticeText$2(str, str2, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore
    public final Object n(String str, String str2, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f4226a, new LiveTrackingConfigDataStoreImpl$setSeatAvailabilityModeKey$2(this, str, str2, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }
}
