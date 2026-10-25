package app.chalo.network.config;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/config/NetworkConfig;", "", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkConfig {
    public static final Preferences.Key b = PreferencesKeys.intKey("connect_timeout");
    public static final Preferences.Key c = PreferencesKeys.intKey("read_timeout");
    public static final Preferences.Key d = PreferencesKeys.intKey("write_timeout");
    public static final Preferences.Key e = PreferencesKeys.longKey("keep_alive");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f6457a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/network/config/NetworkConfig$Companion;", "", "", "NETWORK_CONFIG_FILE", "Ljava/lang/String;", "NETWORK_CONFIG_PREFS_NAME", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NetworkConfig(DataStore dataStore) {
        this.f6457a = dataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(final Preferences.Key key, int i, ContinuationImpl continuationImpl) {
        NetworkConfig$getInt$1 networkConfig$getInt$1;
        if (continuationImpl instanceof NetworkConfig$getInt$1) {
            networkConfig$getInt$1 = (NetworkConfig$getInt$1) continuationImpl;
            int i2 = networkConfig$getInt$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkConfig$getInt$1.label = i2 - Integer.MIN_VALUE;
            } else {
                networkConfig$getInt$1 = new NetworkConfig$getInt$1(this, continuationImpl);
            }
        } else {
            networkConfig$getInt$1 = new NetworkConfig$getInt$1(this, continuationImpl);
        }
        Object objV = networkConfig$getInt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = networkConfig$getInt$1.label;
        if (i3 == 0) {
            ResultKt.b(objV);
            final Flow data = this.f6457a.getData();
            Flow<Integer> flow = new Flow<Integer>() { // from class: app.chalo.network.config.NetworkConfig$getInt$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.network.config.NetworkConfig$getInt$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f6459a;
                    public final /* synthetic */ Preferences.Key b;

                    /* JADX INFO: renamed from: app.chalo.network.config.NetworkConfig$getInt$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.network.config.NetworkConfig$getInt$$inlined$map$1$2", f = "NetworkConfig.kt", l = {50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, Preferences.Key key) {
                        this.f6459a = flowCollector;
                        this.b = key;
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
                            Object obj3 = ((Preferences) obj).get(this.b);
                            anonymousClass1.label = 1;
                            if (this.f6459a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = data.collect(new AnonymousClass2(flowCollector, key), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            networkConfig$getInt$1.I$0 = i;
            networkConfig$getInt$1.label = 1;
            objV = FlowKt.v(flow, networkConfig$getInt$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = networkConfig$getInt$1.I$0;
            ResultKt.b(objV);
        }
        Integer num = (Integer) objV;
        if (num != null) {
            i = num.intValue();
        }
        return new Integer(i);
    }
}
