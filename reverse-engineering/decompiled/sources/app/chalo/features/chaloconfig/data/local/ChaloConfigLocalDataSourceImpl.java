package app.chalo.features.chaloconfig.data.local;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getAllKeys$$inlined$map$1;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chaloconfig/data/local/ChaloConfigLocalDataSourceImpl;", "Lapp/chalo/features/chaloconfig/data/local/ChaloConfigLocalDataSource;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloConfigLocalDataSourceImpl implements ChaloConfigLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f2635a;

    public ChaloConfigLocalDataSourceImpl(LocalDataStore localDataStore) {
        this.f2635a = localDataStore;
    }

    @Override // app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource
    public final Object a(List list, ContinuationImpl continuationImpl) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(PreferencesKeys.stringKey((String) it.next()));
        }
        Object objC = this.f2635a.c(arrayList, continuationImpl);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource
    public final Serializable b(ContinuationImpl continuationImpl) {
        ChaloConfigLocalDataSourceImpl$getAllSavedKeys$1 chaloConfigLocalDataSourceImpl$getAllSavedKeys$1;
        if (continuationImpl instanceof ChaloConfigLocalDataSourceImpl$getAllSavedKeys$1) {
            chaloConfigLocalDataSourceImpl$getAllSavedKeys$1 = (ChaloConfigLocalDataSourceImpl$getAllSavedKeys$1) continuationImpl;
            int i = chaloConfigLocalDataSourceImpl$getAllSavedKeys$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigLocalDataSourceImpl$getAllSavedKeys$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigLocalDataSourceImpl$getAllSavedKeys$1 = new ChaloConfigLocalDataSourceImpl$getAllSavedKeys$1(this, continuationImpl);
            }
        } else {
            chaloConfigLocalDataSourceImpl$getAllSavedKeys$1 = new ChaloConfigLocalDataSourceImpl$getAllSavedKeys$1(this, continuationImpl);
        }
        Object objV = chaloConfigLocalDataSourceImpl$getAllSavedKeys$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigLocalDataSourceImpl$getAllSavedKeys$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getAllKeys$$inlined$map$1 localDataStore$getAllKeys$$inlined$map$1 = new LocalDataStore$getAllKeys$$inlined$map$1(this.f2635a.f2414a.getData());
            chaloConfigLocalDataSourceImpl$getAllSavedKeys$1.label = 1;
            objV = FlowKt.v(localDataStore$getAllKeys$$inlined$map$1, chaloConfigLocalDataSourceImpl$getAllSavedKeys$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        List list = (List) objV;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).getName());
        }
        return arrayList;
    }

    @Override // app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource
    public final Object c(String str, ContinuationImpl continuationImpl) {
        return FlowKt.v(this.f2635a.e(PreferencesKeys.stringKey(str)), continuationImpl);
    }

    @Override // app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        Object objG = this.f2635a.g(PreferencesKeys.stringKey(str), str2, continuationImpl);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource
    public final LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 e() {
        return this.f2635a.e(PreferencesKeys.stringKey("keyCacheStatus"));
    }
}
