package app.chalo.location;

import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/location/StoredLocation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.DataStoreLastKnownLocationStorage$read$2", f = "DataStoreLastKnownLocationStorage.kt", l = {23}, m = "invokeSuspend", v = 1)
final class DataStoreLastKnownLocationStorage$read$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super StoredLocation>, Object> {
    int label;
    final /* synthetic */ DataStoreLastKnownLocationStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreLastKnownLocationStorage$read$2(DataStoreLastKnownLocationStorage dataStoreLastKnownLocationStorage, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dataStoreLastKnownLocationStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DataStoreLastKnownLocationStorage$read$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreLastKnownLocationStorage$read$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow data = this.this$0.f5132a.getData();
            this.label = 1;
            obj = FlowKt.t(data, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Preferences preferences = (Preferences) obj;
        Preferences.Key key = DataStoreLastKnownLocationStorage.c;
        Long l = (Long) preferences.get(DataStoreLastKnownLocationStorage.c);
        if (l != null) {
            long jLongValue = l.longValue();
            Double d = (Double) preferences.get(DataStoreLastKnownLocationStorage.d);
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                Double d2 = (Double) preferences.get(DataStoreLastKnownLocationStorage.e);
                if (d2 != null) {
                    double dDoubleValue2 = d2.doubleValue();
                    if (jLongValue <= 0) {
                        return null;
                    }
                    return new StoredLocation(dDoubleValue, dDoubleValue2, jLongValue);
                }
            }
        }
        return null;
    }
}
