package app.chalo.ads;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/DataStoreExitInterstitialCapStore;", "Lapp/chalo/ads/ExitInterstitialCapStore;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataStoreExitInterstitialCapStore implements ExitInterstitialCapStore {
    public static final Preferences.Key b = PreferencesKeys.intKey("exitCount");
    public static final Preferences.Key c = PreferencesKeys.longKey("lastShownAtEpochMillis");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f757a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DataStoreExitInterstitialCapStore$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public DataStoreExitInterstitialCapStore(DataStore dataStore) {
        this.f757a = dataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ads.ExitInterstitialCapStore
    public final Object a(ContinuationImpl continuationImpl) {
        DataStoreExitInterstitialCapStore$read$1 dataStoreExitInterstitialCapStore$read$1;
        if (continuationImpl instanceof DataStoreExitInterstitialCapStore$read$1) {
            dataStoreExitInterstitialCapStore$read$1 = (DataStoreExitInterstitialCapStore$read$1) continuationImpl;
            int i = dataStoreExitInterstitialCapStore$read$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dataStoreExitInterstitialCapStore$read$1.label = i - Integer.MIN_VALUE;
            } else {
                dataStoreExitInterstitialCapStore$read$1 = new DataStoreExitInterstitialCapStore$read$1(this, continuationImpl);
            }
        } else {
            dataStoreExitInterstitialCapStore$read$1 = new DataStoreExitInterstitialCapStore$read$1(this, continuationImpl);
        }
        Object objT = dataStoreExitInterstitialCapStore$read$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dataStoreExitInterstitialCapStore$read$1.label;
        if (i2 == 0) {
            ResultKt.b(objT);
            Flow data = this.f757a.getData();
            dataStoreExitInterstitialCapStore$read$1.label = 1;
            objT = FlowKt.t(data, dataStoreExitInterstitialCapStore$read$1);
            if (objT == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objT);
        }
        Preferences preferences = (Preferences) objT;
        Integer num = (Integer) preferences.get(b);
        return new ExitInterstitialCapState(num != null ? num.intValue() : 0, (Long) preferences.get(c));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, app.chalo.ads.ExitInterstitialCapState] */
    @Override // app.chalo.ads.ExitInterstitialCapStore
    public final Object b(Long l, ContinuationImpl continuationImpl) {
        DataStoreExitInterstitialCapStore$recordExitAttempt$1 dataStoreExitInterstitialCapStore$recordExitAttempt$1;
        Ref.ObjectRef objectRef;
        if (continuationImpl instanceof DataStoreExitInterstitialCapStore$recordExitAttempt$1) {
            dataStoreExitInterstitialCapStore$recordExitAttempt$1 = (DataStoreExitInterstitialCapStore$recordExitAttempt$1) continuationImpl;
            int i = dataStoreExitInterstitialCapStore$recordExitAttempt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dataStoreExitInterstitialCapStore$recordExitAttempt$1.label = i - Integer.MIN_VALUE;
            } else {
                dataStoreExitInterstitialCapStore$recordExitAttempt$1 = new DataStoreExitInterstitialCapStore$recordExitAttempt$1(this, continuationImpl);
            }
        } else {
            dataStoreExitInterstitialCapStore$recordExitAttempt$1 = new DataStoreExitInterstitialCapStore$recordExitAttempt$1(this, continuationImpl);
        }
        Object obj = dataStoreExitInterstitialCapStore$recordExitAttempt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dataStoreExitInterstitialCapStore$recordExitAttempt$1.label;
        if (i2 == 0) {
            Ref.ObjectRef objectRefV = uf0.v(obj);
            objectRefV.element = new ExitInterstitialCapState();
            DataStoreExitInterstitialCapStore$recordExitAttempt$2 dataStoreExitInterstitialCapStore$recordExitAttempt$2 = new DataStoreExitInterstitialCapStore$recordExitAttempt$2(l, objectRefV, null);
            dataStoreExitInterstitialCapStore$recordExitAttempt$1.L$0 = objectRefV;
            dataStoreExitInterstitialCapStore$recordExitAttempt$1.label = 1;
            if (PreferencesKt.edit(this.f757a, dataStoreExitInterstitialCapStore$recordExitAttempt$2, dataStoreExitInterstitialCapStore$recordExitAttempt$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            objectRef = objectRefV;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) dataStoreExitInterstitialCapStore$recordExitAttempt$1.L$0;
            ResultKt.b(obj);
        }
        return objectRef.element;
    }
}
