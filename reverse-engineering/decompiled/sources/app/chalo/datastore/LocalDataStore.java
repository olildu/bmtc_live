package app.chalo.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/datastore/LocalDataStore;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f2414a;

    public LocalDataStore(DataStore dataStore) {
        Intrinsics.i(dataStore, "dataStore");
        this.f2414a = dataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LocalDataStore$containsKey$1 localDataStore$containsKey$1;
        Object next;
        if (continuationImpl instanceof LocalDataStore$containsKey$1) {
            localDataStore$containsKey$1 = (LocalDataStore$containsKey$1) continuationImpl;
            int i = localDataStore$containsKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localDataStore$containsKey$1.label = i - Integer.MIN_VALUE;
            } else {
                localDataStore$containsKey$1 = new LocalDataStore$containsKey$1(this, continuationImpl);
            }
        } else {
            localDataStore$containsKey$1 = new LocalDataStore$containsKey$1(this, continuationImpl);
        }
        Object objV = localDataStore$containsKey$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = localDataStore$containsKey$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getAllKeys$$inlined$map$1 localDataStore$getAllKeys$$inlined$map$1 = new LocalDataStore$getAllKeys$$inlined$map$1(this.f2414a.getData());
            localDataStore$containsKey$1.L$0 = str;
            localDataStore$containsKey$1.label = 1;
            objV = FlowKt.v(localDataStore$getAllKeys$$inlined$map$1, localDataStore$containsKey$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) localDataStore$containsKey$1.L$0;
            ResultKt.b(objV);
        }
        Iterable iterable = (List) objV;
        if (iterable == null) {
            iterable = EmptyList.f17557a;
        }
        Iterator it = iterable.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((Preferences.Key) next).getName(), str));
        return Boolean.valueOf(next != null);
    }

    public final Object b(ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f2414a, new LocalDataStore$deleteAll$2(2, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    public final Object c(List list, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f2414a, new LocalDataStore$deleteData$2(list, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    public final Object d(ContinuationImpl continuationImpl) {
        final Flow data = this.f2414a.getData();
        return FlowKt.v(new Flow<Map<String, ? extends Object>>() { // from class: app.chalo.datastore.LocalDataStore$getAllEntries$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.datastore.LocalDataStore$getAllEntries$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2416a;

                /* JADX INFO: renamed from: app.chalo.datastore.LocalDataStore$getAllEntries$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.datastore.LocalDataStore$getAllEntries$$inlined$map$1$2", f = "LocalDataStore.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2416a = flowCollector;
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
                        Map<Preferences.Key<?>, Object> mapAsMap = ((Preferences) obj).asMap();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.g(mapAsMap.size()));
                        Iterator<T> it = mapAsMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            linkedHashMap.put(((Preferences.Key) entry.getKey()).getName(), entry.getValue());
                        }
                        anonymousClass1.label = 1;
                        if (this.f2416a.emit(linkedHashMap, anonymousClass1) == coroutineSingletons) {
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
        }, continuationImpl);
    }

    public final LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 e(Preferences.Key key) {
        Intrinsics.i(key, "key");
        return new LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1(this.f2414a.getData(), key);
    }

    public final Object f(String str, ContinuationImpl continuationImpl) {
        final Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(str);
        final Flow data = this.f2414a.getData();
        return FlowKt.v(new Flow<String>() { // from class: app.chalo.datastore.LocalDataStore$getStringDataFromLocalDataStore$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.datastore.LocalDataStore$getStringDataFromLocalDataStore$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2424a;
                public final /* synthetic */ Preferences.Key b;

                /* JADX INFO: renamed from: app.chalo.datastore.LocalDataStore$getStringDataFromLocalDataStore$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.datastore.LocalDataStore$getStringDataFromLocalDataStore$$inlined$map$1$2", f = "LocalDataStore.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2424a = flowCollector;
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
                        if (this.f2424a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector, keyStringKey), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, continuationImpl);
    }

    public final Object g(Preferences.Key key, Object obj, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f2414a, new LocalDataStore$updateLocalDataStore$2(key, obj, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    public final Object h(String str, String str2, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f2414a, new LocalDataStore$updateLocalDataStore$4(PreferencesKeys.stringKey(str), str2, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    public final Object i(List list, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f2414a, new LocalDataStore$updateLocalDataStore$6(list, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }
}
