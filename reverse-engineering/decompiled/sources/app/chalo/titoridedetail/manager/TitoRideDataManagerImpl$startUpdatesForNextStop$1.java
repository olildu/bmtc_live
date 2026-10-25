package app.chalo.titoridedetail.manager;

import app.chalo.citydata.data.model.app.RouteAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForNextStop$1", f = "TitoRideDataManagerImpl.kt", l = {258}, m = "invokeSuspend", v = 1)
final class TitoRideDataManagerImpl$startUpdatesForNextStop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteAppModel $routeAppModel;
    final /* synthetic */ String $vehicleNumber;
    int label;
    final /* synthetic */ TitoRideDataManagerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForNextStop$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TitoRideDataManagerImpl f9702a;
        public final /* synthetic */ RouteAppModel b;
        public final /* synthetic */ String c;

        public AnonymousClass1(TitoRideDataManagerImpl titoRideDataManagerImpl, RouteAppModel routeAppModel, String str) {
            this.f9702a = titoRideDataManagerImpl;
            this.b = routeAppModel;
            this.c = str;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:104:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:109:0x0203  */
        /* JADX WARN: Code duplicated, block: B:63:0x013b  */
        /* JADX WARN: Code duplicated, block: B:66:0x0150  */
        /* JADX WARN: Code duplicated, block: B:68:0x0161  */
        /* JADX WARN: Code duplicated, block: B:72:0x018c  */
        /* JADX WARN: Code duplicated, block: B:75:0x019a A[Catch: all -> 0x019d, TryCatch #2 {all -> 0x019d, blocks: (B:73:0x0190, B:75:0x019a, B:79:0x01a2, B:81:0x01a8, B:84:0x01ae, B:86:0x01b6, B:88:0x01be, B:91:0x01c7, B:93:0x01cb, B:97:0x01e3, B:98:0x01e5, B:94:0x01d5, B:95:0x01da, B:96:0x01db), top: B:118:0x0190 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:81:0x01a8 A[Catch: all -> 0x019d, TryCatch #2 {all -> 0x019d, blocks: (B:73:0x0190, B:75:0x019a, B:79:0x01a2, B:81:0x01a8, B:84:0x01ae, B:86:0x01b6, B:88:0x01be, B:91:0x01c7, B:93:0x01cb, B:97:0x01e3, B:98:0x01e5, B:94:0x01d5, B:95:0x01da, B:96:0x01db), top: B:118:0x0190 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Code duplicated, block: B:96:0x01db A[Catch: all -> 0x019d, TryCatch #2 {all -> 0x019d, blocks: (B:73:0x0190, B:75:0x019a, B:79:0x01a2, B:81:0x01a8, B:84:0x01ae, B:86:0x01b6, B:88:0x01be, B:91:0x01c7, B:93:0x01cb, B:97:0x01e3, B:98:0x01e5, B:94:0x01d5, B:95:0x01da, B:96:0x01db), top: B:118:0x0190 }] */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
        
            if (r0.a(r11) == r3) goto L71;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult r22, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 528
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForNextStop$1.AnonymousClass1.emit(app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitoRideDataManagerImpl$startUpdatesForNextStop$1(TitoRideDataManagerImpl titoRideDataManagerImpl, String str, RouteAppModel routeAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = titoRideDataManagerImpl;
        this.$vehicleNumber = str;
        this.$routeAppModel = routeAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TitoRideDataManagerImpl$startUpdatesForNextStop$1(this.this$0, this.$vehicleNumber, this.$routeAppModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TitoRideDataManagerImpl$startUpdatesForNextStop$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowD = this.this$0.c.d(CollectionsKt.R(this.$vehicleNumber), false, false);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$routeAppModel, this.$vehicleNumber);
            this.label = 1;
            if (flowD.collect(anonymousClass1, this) == coroutineSingletons) {
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
