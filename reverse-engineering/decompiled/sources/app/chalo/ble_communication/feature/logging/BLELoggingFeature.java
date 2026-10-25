package app.chalo.ble_communication.feature.logging;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.ble_communication.BLEOperationStatus;
import app.chalo.ble_communication.domain.GetBLELoggingConfigUseCase;
import app.chalo.ble_communication.model.BLEOperationsToLogConfig;
import app.chalo.ble_communication.model.TwoWayBleCommLoggingConfigForCity;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.providers.CoroutineContextProvider;
import com.silencelaboratories.silentride.operations.ConnectPassengerDeviceOperation;
import com.silencelaboratories.silentride.operations.DisconnectDriverDeviceOperation;
import com.silencelaboratories.silentride.operations.DisconnectPassengerDeviceOperation;
import com.silencelaboratories.silentride.operations.SendDataDriverDeviceOperation;
import com.silencelaboratories.silentride.operations.SendDataPassengerDeviceOperation;
import com.silencelaboratories.silentride.operations.SilentRideOperation;
import com.silencelaboratories.silentride.operations.SilentRideOperationStatus;
import com.silencelaboratories.silentride.operations.StartActiveModeBroadcastDriverOperation;
import com.silencelaboratories.silentride.operations.StartActiveModeBroadcastPassengerOperation;
import com.silencelaboratories.silentride.operations.StartActiveModeScanDriverOperation;
import com.silencelaboratories.silentride.operations.StartActiveModeScanPassengerOperation;
import com.silencelaboratories.silentride.operations.StartPassiveModeSilentRideDriverOperation;
import com.silencelaboratories.silentride.operations.StartPassiveModeSilentRidePassengerOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeBroadcastDriverOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeBroadcastPassengerOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeScanDriverOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeScanPassengerOperation;
import com.silencelaboratories.silentride.operations.StopPassiveModeSilentRideDriverOperation;
import com.silencelaboratories.silentride.operations.StopPassiveModeSilentRidePassengerOperation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/feature/logging/BLELoggingFeature;", "", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BLELoggingFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetBLELoggingConfigUseCase f1127a;
    public final BasicInfoContract b;
    public final AnalyticsContract c;
    public final CrashlyticsLogger d;
    public final ContextScope e;
    public TwoWayBleCommLoggingConfigForCity f;
    public final LinkedHashMap g;
    public LinkedHashMap h;

    /* JADX INFO: renamed from: app.chalo.ble_communication.feature.logging.BLELoggingFeature$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ble_communication.feature.logging.BLELoggingFeature$1", f = "BLELoggingFeature.kt", l = {44}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BLELoggingFeature.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BLELoggingFeature bLELoggingFeature;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                BLELoggingFeature bLELoggingFeature2 = BLELoggingFeature.this;
                GetBLELoggingConfigUseCase getBLELoggingConfigUseCase = bLELoggingFeature2.f1127a;
                this.L$0 = bLELoggingFeature2;
                this.label = 1;
                Object objA = getBLELoggingConfigUseCase.a(this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bLELoggingFeature = bLELoggingFeature2;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bLELoggingFeature = (BLELoggingFeature) this.L$0;
                ResultKt.b(obj);
            }
            bLELoggingFeature.f = (TwoWayBleCommLoggingConfigForCity) obj;
            return Unit.f17538a;
        }
    }

    public BLELoggingFeature(GetBLELoggingConfigUseCase getBLELoggingConfigUseCase, BasicInfoContract basicInfoContract, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger, CoroutineContextProvider coroutineContextProvider) {
        this.f1127a = getBLELoggingConfigUseCase;
        this.b = basicInfoContract;
        this.c = analyticsContract;
        this.d = crashlyticsLogger;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.e = contextScopeA;
        MutexKt.a();
        this.g = new LinkedHashMap();
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
    }

    public static void d(BLELoggingFeature bLELoggingFeature, SilentRideOperation silentRideOperation, int i) {
        String str;
        bLELoggingFeature.getClass();
        String str2 = silentRideOperation.b;
        if (bLELoggingFeature.e(i, str2)) {
            Iterable iterable = (List) bLELoggingFeature.g.get(str2);
            if (iterable == null) {
                iterable = EmptyList.f17557a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                throw null;
            }
            AnalyticsContract analyticsContract = bLELoggingFeature.c;
            if (silentRideOperation instanceof StartActiveModeBroadcastDriverOperation) {
                str = "bleOp StartActiveModeBroadcastDriverOperation logged";
            } else if (silentRideOperation instanceof StartActiveModeScanDriverOperation) {
                str = "bleOp StartActiveModeScanDriverOperation logged";
            } else if (silentRideOperation instanceof StartPassiveModeSilentRideDriverOperation) {
                str = "bleOp StartPassiveModeSilentRidePassengerOperation logged";
            } else if (silentRideOperation instanceof StopActiveModeBroadcastDriverOperation) {
                str = "bleOp StopActiveModeBroadcastDriverOperation logged";
            } else if (silentRideOperation instanceof StopActiveModeScanDriverOperation) {
                str = "bleOp StopActiveModeScanDriverOperation logged";
            } else if (silentRideOperation instanceof StopPassiveModeSilentRideDriverOperation) {
                str = "bleOp StartPassiveModeSilentRideDriverOperation logged";
            } else if (silentRideOperation instanceof ConnectPassengerDeviceOperation) {
                str = "bleOp ConnectPassengerDeviceOperation logged";
            } else if (silentRideOperation instanceof DisconnectPassengerDeviceOperation) {
                str = "bleOp DisconnectPassengerDeviceOperation logged";
            } else if (silentRideOperation instanceof SendDataPassengerDeviceOperation) {
                str = "bleOp SendDataPassengerDeviceOperation logged";
            } else if (silentRideOperation instanceof StartActiveModeBroadcastPassengerOperation) {
                str = "bleOp StartActiveModeBroadcastPassengerOperation logged";
            } else if (silentRideOperation instanceof StartActiveModeScanPassengerOperation) {
                str = "bleOp StartActiveModeScanPassengerOperation logged";
            } else if (silentRideOperation instanceof StartPassiveModeSilentRidePassengerOperation) {
                str = "bleOp StopPassiveModeSilentRidePassengerOperation logged";
            } else if (silentRideOperation instanceof StopActiveModeBroadcastPassengerOperation) {
                str = "bleOp StopActiveModeBroadcastPassengerOperation logged";
            } else if (silentRideOperation instanceof StopActiveModeScanPassengerOperation) {
                str = "bleOp StopActiveModeScanPassengerOperation logged";
            } else if (silentRideOperation instanceof StopPassiveModeSilentRidePassengerOperation) {
                str = "bleOp StopPassiveModeSilentRideDriverOperation logged";
            } else if (silentRideOperation instanceof DisconnectDriverDeviceOperation) {
                str = "bleOp DisconnectDriverDeviceOperation logged";
            } else {
                if (!(silentRideOperation instanceof SendDataDriverDeviceOperation)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "bleOp SendDataDriverDeviceOperation logged";
            }
            AnalyticsContract.DefaultImpls.a(analyticsContract, str, Source.BLE_LOGGING_FEATURE.getSourceName(), linkedHashMap, null, false, 24);
        }
    }

    public final void a(SilentRideOperation slOperation, Exception exc) {
        Intrinsics.i(slOperation, "slOperation");
        BuildersKt.d(this.e, null, null, new BLELoggingFeature$onBLEOperationExecutionException$1(this, slOperation, null), 3);
    }

    public final void b(SilentRideOperation slOperation) {
        Intrinsics.i(slOperation, "slOperation");
        String str = slOperation.b;
        if (e(-101, str)) {
            this.d.d(new BLEOperationTimedOutLoggingEx("timedOut opId = " + str + " opCode = " + slOperation.getK()));
        }
    }

    public final void c(SilentRideOperation slOperation, SilentRideOperationStatus slOperationStatus, BLEOperationStatus bLEOperationStatus) {
        Intrinsics.i(slOperation, "slOperation");
        Intrinsics.i(slOperationStatus, "slOperationStatus");
        BuildersKt.d(this.e, null, null, new BLELoggingFeature$onSLOperationStatusUpdate$1(this, slOperation, slOperationStatus, null), 3);
    }

    public final boolean e(int i, String str) {
        Set set;
        List<BLEOperationsToLogConfig> list;
        if (this.h == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TwoWayBleCommLoggingConfigForCity twoWayBleCommLoggingConfigForCity = this.f;
            if (twoWayBleCommLoggingConfigForCity != null && (list = twoWayBleCommLoggingConfigForCity.b) != null) {
                for (BLEOperationsToLogConfig bLEOperationsToLogConfig : list) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = bLEOperationsToLogConfig.b.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(Integer.valueOf(((Number) it.next()).intValue()));
                    }
                    linkedHashMap.put(bLEOperationsToLogConfig.f1130a, linkedHashSet);
                }
            }
            this.h = linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = this.h;
        if (linkedHashMap2 == null || (set = (Set) linkedHashMap2.get(str)) == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i));
    }
}
