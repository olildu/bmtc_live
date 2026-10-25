package app.chalo.sos.feature;

import app.chalo.datastore.LocalDataStore$getAllEntriesAsFlow$$inlined$map$1;
import app.chalo.network.config.ChaloJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SosContactsFeatureImpl$getAllSosContact$$inlined$map$1 implements Flow<List<? extends SosContact>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalDataStore$getAllEntriesAsFlow$$inlined$map$1 f9434a;

    /* JADX INFO: renamed from: app.chalo.sos.feature.SosContactsFeatureImpl$getAllSosContact$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f9435a;

        /* JADX INFO: renamed from: app.chalo.sos.feature.SosContactsFeatureImpl$getAllSosContact$$inlined$map$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.sos.feature.SosContactsFeatureImpl$getAllSosContact$$inlined$map$1$2", f = "SosContactsFeatureImpl.kt", l = {50}, m = "emit", v = 1)
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
            this.f9435a = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            Object objB;
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
                Collection collectionValues = ((Map) obj).values();
                ArrayList arrayList = new ArrayList();
                for (T t : collectionValues) {
                    ChaloJson chaloJson = ChaloJson.f6455a;
                    String string = t.toString();
                    try {
                        Json json = ChaloJson.b;
                        json.getClass();
                        objB = json.b(string, BuiltinSerializersKt.c(SosContact.INSTANCE.serializer()));
                    } catch (Exception unused) {
                        objB = null;
                    }
                    SosContact sosContact = (SosContact) objB;
                    if (sosContact != null) {
                        arrayList.add(sosContact);
                    }
                }
                anonymousClass1.label = 1;
                if (this.f9435a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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

    public SosContactsFeatureImpl$getAllSosContact$$inlined$map$1(LocalDataStore$getAllEntriesAsFlow$$inlined$map$1 localDataStore$getAllEntriesAsFlow$$inlined$map$1) {
        this.f9434a = localDataStore$getAllEntriesAsFlow$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f9434a.collect(new AnonymousClass2(flowCollector), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }
}
