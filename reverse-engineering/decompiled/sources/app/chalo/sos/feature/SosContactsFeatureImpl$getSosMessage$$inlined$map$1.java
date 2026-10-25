package app.chalo.sos.feature;

import app.chalo.datastore.LocalDataStore$getAllEntriesAsFlow$$inlined$map$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SosContactsFeatureImpl$getSosMessage$$inlined$map$1 implements Flow<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalDataStore$getAllEntriesAsFlow$$inlined$map$1 f9436a;
    public final /* synthetic */ SosContactsFeatureImpl b;

    /* JADX INFO: renamed from: app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f9437a;
        public final /* synthetic */ SosContactsFeatureImpl b;

        /* JADX INFO: renamed from: app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1$2", f = "SosContactsFeatureImpl.kt", l = {52, 50}, m = "emit", v = 1)
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

        public AnonymousClass2(FlowCollector flowCollector, SosContactsFeatureImpl sosContactsFeatureImpl) {
            this.f9437a = flowCollector;
            this.b = sosContactsFeatureImpl;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
        
            if (r9.emit(r8, r0) == r1) goto L27;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r9
                app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1$2$1 r0 = (app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1$2$1 r0 = new app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1$2$1
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.b(r9)
                goto L7a
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                java.lang.Object r8 = r0.L$0
                kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                kotlin.ResultKt.b(r9)
                goto L6b
            L3a:
                kotlin.ResultKt.b(r9)
                java.util.Map r8 = (java.util.Map) r8
                java.lang.String r9 = "sos_message"
                androidx.datastore.preferences.core.Preferences$Key r9 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r9)
                java.lang.Object r8 = r8.get(r9)
                kotlinx.coroutines.flow.FlowCollector r9 = r7.f9437a
                if (r8 == 0) goto L54
                java.lang.String r8 = r8.toString()
                if (r8 != 0) goto L6e
            L54:
                app.chalo.sos.feature.SosContactsFeatureImpl r8 = r7.b
                app.chalo.providers.stringprovider.StringProvider r8 = r8.c
                app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.DEFAULT_SOS_MSG
                r5 = 0
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r0.L$0 = r9
                r0.label = r4
                java.lang.Object r8 = r8.b(r2, r5, r0)
                if (r8 != r1) goto L68
                goto L79
            L68:
                r6 = r9
                r9 = r8
                r8 = r6
            L6b:
                r6 = r9
                r9 = r8
                r8 = r6
            L6e:
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L7a
            L79:
                return r1
            L7a:
                kotlin.Unit r8 = kotlin.Unit.f17538a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public SosContactsFeatureImpl$getSosMessage$$inlined$map$1(LocalDataStore$getAllEntriesAsFlow$$inlined$map$1 localDataStore$getAllEntriesAsFlow$$inlined$map$1, SosContactsFeatureImpl sosContactsFeatureImpl) {
        this.f9436a = localDataStore$getAllEntriesAsFlow$$inlined$map$1;
        this.b = sosContactsFeatureImpl;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f9436a.collect(new AnonymousClass2(flowCollector, this.b), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }
}
