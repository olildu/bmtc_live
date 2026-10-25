package app.chalo.ads;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.DataStoreExitInterstitialCapStore$recordExitAttempt$2", f = "ExitInterstitialCapStore.kt", l = {}, m = "invokeSuspend", v = 1)
final class DataStoreExitInterstitialCapStore$recordExitAttempt$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $shownAtEpochMillis;
    final /* synthetic */ Ref.ObjectRef<ExitInterstitialCapState> $updatedState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreExitInterstitialCapStore$recordExitAttempt$2(Long l, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.$shownAtEpochMillis = l;
        this.$updatedState = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreExitInterstitialCapStore$recordExitAttempt$2 dataStoreExitInterstitialCapStore$recordExitAttempt$2 = new DataStoreExitInterstitialCapStore$recordExitAttempt$2(this.$shownAtEpochMillis, this.$updatedState, continuation);
        dataStoreExitInterstitialCapStore$recordExitAttempt$2.L$0 = obj;
        return dataStoreExitInterstitialCapStore$recordExitAttempt$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        DataStoreExitInterstitialCapStore$recordExitAttempt$2 dataStoreExitInterstitialCapStore$recordExitAttempt$2 = (DataStoreExitInterstitialCapStore$recordExitAttempt$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        dataStoreExitInterstitialCapStore$recordExitAttempt$2.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, app.chalo.ads.ExitInterstitialCapState] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        Preferences.Key key = DataStoreExitInterstitialCapStore.b;
        Preferences.Key key2 = DataStoreExitInterstitialCapStore.b;
        Integer num = (Integer) mutablePreferences.get(key2);
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        mutablePreferences.set(key2, new Integer(iIntValue));
        Long l = this.$shownAtEpochMillis;
        if (l != null) {
            mutablePreferences.set(DataStoreExitInterstitialCapStore.c, l);
        }
        Ref.ObjectRef<ExitInterstitialCapState> objectRef = this.$updatedState;
        Long l2 = this.$shownAtEpochMillis;
        if (l2 == null) {
            l2 = (Long) mutablePreferences.get(DataStoreExitInterstitialCapStore.c);
        }
        objectRef.element = new ExitInterstitialCapState(iIntValue, l2);
        return Unit.f17538a;
    }
}
