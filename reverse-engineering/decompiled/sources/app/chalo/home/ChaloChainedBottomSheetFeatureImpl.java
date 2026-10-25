package app.chalo.home;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.home.ui.base.CommonBottomSheetType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ChaloChainedBottomSheetFeatureImpl;", "Lapp/chalo/home/ChaloChainedBottomSheetFeature;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloChainedBottomSheetFeatureImpl implements ChaloChainedBottomSheetFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsLogger f2849a;
    public final MutexImpl b = MutexKt.a();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final MutableStateFlow e = StateFlowKt.a(CommonBottomSheetType.None.b);
    public final LinkedHashMap f = new LinkedHashMap();

    public ChaloChainedBottomSheetFeatureImpl(CrashlyticsLogger crashlyticsLogger) {
        this.f2849a = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.home.ChaloChainedBottomSheetFeature
    public final Object a(int i, String str, CommonBottomSheetType commonBottomSheetType, boolean z, ContinuationImpl continuationImpl) {
        ChaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1 chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1;
        Mutex mutex;
        HashMap map = this.c;
        if (continuationImpl instanceof ChaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1) {
            chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1 = (ChaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1) continuationImpl;
            int i2 = chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1 = new ChaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1(this, continuationImpl);
            }
        } else {
            chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1 = new ChaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1(this, continuationImpl);
        }
        Object obj = chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.L$0 = str;
            chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.L$1 = commonBottomSheetType;
            mutex = this.b;
            chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.L$2 = mutex;
            chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.I$0 = i;
            chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.Z$0 = z;
            chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.label = 1;
            if (mutex.a(chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.Z$0;
            i = chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.I$0;
            Mutex mutex2 = (Mutex) chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.L$2;
            commonBottomSheetType = (CommonBottomSheetType) chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.L$1;
            String str2 = (String) chaloChainedBottomSheetFeatureImpl$addBottomSheetToQueue$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            str = str2;
        }
        try {
            if (!map.containsKey(str) || map.get(str) == null) {
                map.put(str, new KPriorityQueue());
            }
            Unit unit = Unit.f17538a;
            LinkedHashMap linkedHashMap = this.f;
            if (z) {
                Integer num = (Integer) linkedHashMap.get(commonBottomSheetType.f3178a);
                if ((num != null ? num.intValue() : 0) > 0) {
                    return unit;
                }
            }
            KPriorityQueue kPriorityQueue = (KPriorityQueue) map.get(str);
            if (kPriorityQueue != null) {
                ComparableBottomSheetState comparableBottomSheetState = new ComparableBottomSheetState(i, commonBottomSheetType);
                ArrayList arrayList = kPriorityQueue.f2861a;
                arrayList.add(comparableBottomSheetState);
                int size = arrayList.size();
                int i4 = size - 1;
                Comparable comparable = (Comparable) arrayList.get(i4);
                for (int i5 = (size - 2) / 2; i4 > 0 && ((Comparable) arrayList.get(i5)).compareTo(comparable) > 0; i5 = (i5 - 1) / 2) {
                    arrayList.set(i4, arrayList.get(i5));
                    i4 = i5;
                }
                arrayList.set(i4, comparable);
            }
            Integer num2 = (Integer) linkedHashMap.get(commonBottomSheetType.f3178a);
            linkedHashMap.put(commonBottomSheetType.f3178a, new Integer((num2 != null ? num2.intValue() : 0) + 1));
            d(str);
            return unit;
        } finally {
            mutex.e(null);
        }
    }

    @Override // app.chalo.home.ChaloChainedBottomSheetFeature
    public final StateFlow b() {
        return FlowKt.c(this.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.home.ChaloChainedBottomSheetFeature
    public final Object c(String str, CommonBottomSheetType commonBottomSheetType, ContinuationImpl continuationImpl) {
        ChaloChainedBottomSheetFeatureImpl$hideBottomSheet$1 chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1;
        Mutex mutex;
        Object value;
        Object value2;
        HashMap map = this.d;
        LinkedHashMap linkedHashMap = this.f;
        if (continuationImpl instanceof ChaloChainedBottomSheetFeatureImpl$hideBottomSheet$1) {
            chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1 = (ChaloChainedBottomSheetFeatureImpl$hideBottomSheet$1) continuationImpl;
            int i = chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1 = new ChaloChainedBottomSheetFeatureImpl$hideBottomSheet$1(this, continuationImpl);
            }
        } else {
            chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1 = new ChaloChainedBottomSheetFeatureImpl$hideBottomSheet$1(this, continuationImpl);
        }
        Object obj = chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.L$0 = str;
            chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.L$1 = commonBottomSheetType;
            mutex = this.b;
            chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.L$2 = mutex;
            chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.label = 1;
            if (mutex.a(chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.L$2;
            commonBottomSheetType = (CommonBottomSheetType) chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.L$1;
            String str2 = (String) chaloChainedBottomSheetFeatureImpl$hideBottomSheet$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            str = str2;
        }
        try {
            boolean zContainsKey = map.containsKey(str);
            CommonBottomSheetType.None none = CommonBottomSheetType.None.b;
            MutableStateFlow mutableStateFlow = this.e;
            if (zContainsKey) {
                map.remove(str);
                String str3 = commonBottomSheetType.f3178a;
                Integer num = (Integer) linkedHashMap.get(str3);
                int iIntValue = (num != null ? num.intValue() : 0) - 1;
                if (iIntValue <= 0) {
                    linkedHashMap.put(str3, new Integer(0));
                } else {
                    linkedHashMap.put(str3, new Integer(iIntValue));
                }
                if (this.c.isEmpty()) {
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.c(value2, none));
                } else {
                    d(str);
                }
            } else {
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, none));
            }
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    public final void d(String str) {
        Object value;
        Object value2;
        Object value3;
        HashMap map = this.d;
        if (map.containsKey(str)) {
            return;
        }
        KPriorityQueue kPriorityQueue = (KPriorityQueue) this.c.get(str);
        CommonBottomSheetType.None none = CommonBottomSheetType.None.b;
        MutableStateFlow mutableStateFlow = this.e;
        if (kPriorityQueue == null || kPriorityQueue.f2861a.size() <= 0) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, none));
            return;
        }
        try {
            ComparableBottomSheetState comparableBottomSheetState = (ComparableBottomSheetState) kPriorityQueue.a();
            CommonBottomSheetType commonBottomSheetType = comparableBottomSheetState != null ? comparableBottomSheetState.b : null;
            if (commonBottomSheetType == null) {
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value3, none));
            } else {
                map.put(str, commonBottomSheetType);
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value2, commonBottomSheetType));
            }
        } catch (IllegalStateException e) {
            this.f2849a.i(e);
            map.remove(str);
            d(str);
        }
    }
}
