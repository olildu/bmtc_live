package app.chalo.utils;

import android.content.Context;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContextExtsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Context context, String str, Function0 function0, ContinuationImpl continuationImpl) {
        ContextExtsKt$scheduleWorkIfNotScheduled$1 contextExtsKt$scheduleWorkIfNotScheduled$1;
        boolean z;
        if (continuationImpl instanceof ContextExtsKt$scheduleWorkIfNotScheduled$1) {
            contextExtsKt$scheduleWorkIfNotScheduled$1 = (ContextExtsKt$scheduleWorkIfNotScheduled$1) continuationImpl;
            int i = contextExtsKt$scheduleWorkIfNotScheduled$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                contextExtsKt$scheduleWorkIfNotScheduled$1.label = i - Integer.MIN_VALUE;
            } else {
                contextExtsKt$scheduleWorkIfNotScheduled$1 = new ContextExtsKt$scheduleWorkIfNotScheduled$1(continuationImpl);
            }
        } else {
            contextExtsKt$scheduleWorkIfNotScheduled$1 = new ContextExtsKt$scheduleWorkIfNotScheduled$1(continuationImpl);
        }
        Object objT = contextExtsKt$scheduleWorkIfNotScheduled$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = contextExtsKt$scheduleWorkIfNotScheduled$1.label;
        if (i2 == 0) {
            ResultKt.b(objT);
            LiveData<List<WorkInfo>> workInfosByTagLiveData = WorkManager.getInstance(context).getWorkInfosByTagLiveData(str);
            Intrinsics.h(workInfosByTagLiveData, "getWorkInfosByTagLiveData(...)");
            Flow flowAsFlow = FlowLiveDataConversions.asFlow(workInfosByTagLiveData);
            contextExtsKt$scheduleWorkIfNotScheduled$1.L$0 = function0;
            contextExtsKt$scheduleWorkIfNotScheduled$1.label = 1;
            objT = FlowKt.t(flowAsFlow, contextExtsKt$scheduleWorkIfNotScheduled$1);
            if (objT == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) contextExtsKt$scheduleWorkIfNotScheduled$1.L$0;
            ResultKt.b(objT);
        }
        Iterator it = ((List) objT).iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                WorkInfo.State state = ((WorkInfo) it.next()).getState();
                Intrinsics.h(state, "getState(...)");
                if (state == WorkInfo.State.RUNNING || state == WorkInfo.State.ENQUEUED) {
                    z = true;
                }
            }
        }
        if (!z) {
            function0.invoke();
        }
        return Unit.f17538a;
    }
}
