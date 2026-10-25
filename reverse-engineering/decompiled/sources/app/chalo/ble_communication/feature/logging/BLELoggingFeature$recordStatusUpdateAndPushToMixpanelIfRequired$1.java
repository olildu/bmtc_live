package app.chalo.ble_communication.feature.logging;

import app.chalo.ble_communication.BLEOperationStatus;
import app.chalo.ble_communication.domain.BLEOperationExecutorKt;
import com.silencelaboratories.silentride.operations.SilentRideOperation;
import com.silencelaboratories.silentride.operations.SilentRideOperationStatus;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.feature.logging.BLELoggingFeature", f = "BLELoggingFeature.kt", l = {323}, m = "recordStatusUpdateAndPushToMixpanelIfRequired", v = 1)
final class BLELoggingFeature$recordStatusUpdateAndPushToMixpanelIfRequired$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BLELoggingFeature this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        BLELoggingFeature bLELoggingFeature = this.this$0;
        LinkedHashMap linkedHashMap = bLELoggingFeature.g;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z = this.Z$0;
        Mutex mutex = (Mutex) this.L$5;
        SlLog slLog = (SlLog) this.L$4;
        String str = (String) this.L$3;
        BLEOperationStatus bLEOperationStatus = (BLEOperationStatus) this.L$2;
        SilentRideOperationStatus silentRideOperationStatus = (SilentRideOperationStatus) this.L$1;
        SilentRideOperation silentRideOperation = (SilentRideOperation) this.L$0;
        ResultKt.b(obj);
        try {
            List arrayList = (List) linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(slLog);
            linkedHashMap.put(str, arrayList);
            BLELoggingFeature.d(bLELoggingFeature, silentRideOperation, silentRideOperationStatus.f15363a);
            if (BLEOperationExecutorKt.a(bLEOperationStatus, z)) {
                linkedHashMap.put(str, new ArrayList());
            }
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
