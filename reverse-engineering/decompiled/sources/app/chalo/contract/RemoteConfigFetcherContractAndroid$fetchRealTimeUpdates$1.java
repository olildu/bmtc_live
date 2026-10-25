package app.chalo.contract;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import defpackage.os0;
import defpackage.qv0;
import defpackage.t01;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.contract.RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1", f = "RemoteConfigFetcherContract.android.kt", l = {EACTags.DEPRECATED}, m = "invokeSuspend", v = 1)
final class RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RemoteConfigFetcherContractAndroid this$0;

    /* JADX INFO: renamed from: app.chalo.contract.RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\u0010\u0000\u001a\u00020\u0001*4\u00120\u0012.\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0015\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0007¢\u0006\u0002\b\u00060\u0003¢\u0006\u0002\b\u00060\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.contract.RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1$1", f = "RemoteConfigFetcherContract.android.kt", l = {72}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super Set<String>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RemoteConfigFetcherContractAndroid this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RemoteConfigFetcherContractAndroid remoteConfigFetcherContractAndroid, Continuation continuation) {
            super(2, continuation);
            this.this$0 = remoteConfigFetcherContractAndroid;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final RemoteConfigFetcherContractAndroid remoteConfigFetcherContractAndroid = this.this$0;
                ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = remoteConfigFetcherContractAndroid.f1951a.addOnConfigUpdateListener(new ConfigUpdateListener() { // from class: app.chalo.contract.RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1$1$configUpdateListener$1
                    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
                    public final void onError(FirebaseRemoteConfigException exception) {
                        Intrinsics.i(exception, "exception");
                        remoteConfigFetcherContractAndroid.b.i(exception.getCause());
                    }

                    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
                    public final void onUpdate(ConfigUpdate configUpdate) {
                        Intrinsics.i(configUpdate, "configUpdate");
                        remoteConfigFetcherContractAndroid.f1951a.activate().addOnSuccessListener(new os0(new t01(14, producerScope, configUpdate), 11));
                    }
                });
                Intrinsics.h(configUpdateListenerRegistrationAddOnConfigUpdateListener, "addOnConfigUpdateListener(...)");
                qv0 qv0Var = new qv0(configUpdateListenerRegistrationAddOnConfigUpdateListener, 17);
                this.label = 1;
                if (ProduceKt.a(producerScope, qv0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1(RemoteConfigFetcherContractAndroid remoteConfigFetcherContractAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = remoteConfigFetcherContractAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowE = FlowKt.e(new AnonymousClass1(this.this$0, null));
            final RemoteConfigFetcherContractAndroid remoteConfigFetcherContractAndroid = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.contract.RemoteConfigFetcherContractAndroid$fetchRealTimeUpdates$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Set set = (Set) obj2;
                    MutableStateFlow mutableStateFlow = remoteConfigFetcherContractAndroid.e;
                    Intrinsics.f(set);
                    mutableStateFlow.setValue(set);
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (((ChannelFlow) flowE).collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
