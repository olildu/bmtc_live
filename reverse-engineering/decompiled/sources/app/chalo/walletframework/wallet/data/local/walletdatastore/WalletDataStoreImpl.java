package app.chalo.walletframework.wallet.data.local.walletdatastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletdatastore/WalletDataStoreImpl;", "Lapp/chalo/walletframework/wallet/data/local/walletdatastore/WalletDataStore;", "PreferencesKeys", "Companion", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletDataStoreImpl implements WalletDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f10944a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletdatastore/WalletDataStoreImpl$Companion;", "", "", "WALLET_DATA_STORE", "Ljava/lang/String;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletdatastore/WalletDataStoreImpl$PreferencesKeys;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PreferencesKeys {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Preferences.Key f10945a = androidx.datastore.preferences.core.PreferencesKeys.booleanKey("has_user_seen_wallet");
        public static final Preferences.Key b;

        static {
            androidx.datastore.preferences.core.PreferencesKeys.booleanKey("has_user_seen_quick_pay");
            b = androidx.datastore.preferences.core.PreferencesKeys.longKey("current_periodic_wallet_sync_interval");
        }
    }

    public WalletDataStoreImpl(DataStore dataStore) {
        this.f10944a = dataStore;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore
    public final Object a(long j, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f10944a, new WalletDataStoreImpl$setCurrentPeriodicWalletSyncInterval$2(j, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$2] */
    @Override // app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore
    public final WalletDataStoreImpl$special$$inlined$map$2 b() {
        final Flow data = this.f10944a.getData();
        return new Flow<Long>() { // from class: app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$2

            /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10949a;

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$2$2", f = "WalletDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f10949a = flowCollector;
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
                        Long l = (Long) ((Preferences) obj).get(WalletDataStoreImpl.PreferencesKeys.b);
                        Long l2 = new Long(l != null ? l.longValue() : -1L);
                        anonymousClass1.label = 1;
                        if (this.f10949a.emit(l2, anonymousClass1) == coroutineSingletons) {
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

    @Override // app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore
    public final Object c(SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f10944a, new WalletDataStoreImpl$setHasUserSeenWallet$2(true, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$1] */
    @Override // app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore
    public final WalletDataStoreImpl$special$$inlined$map$1 d() {
        final Flow data = this.f10944a.getData();
        return new Flow<Boolean>() { // from class: app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10947a;

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$1$2", f = "WalletDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f10947a = flowCollector;
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
                        Boolean bool = (Boolean) ((Preferences) obj).get(WalletDataStoreImpl.PreferencesKeys.f10945a);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        anonymousClass1.label = 1;
                        if (this.f10947a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
