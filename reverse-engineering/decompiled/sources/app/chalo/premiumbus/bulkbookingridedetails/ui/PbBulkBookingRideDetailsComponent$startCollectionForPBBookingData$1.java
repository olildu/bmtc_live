package app.chalo.premiumbus.bulkbookingridedetails.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {749, 750}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passId;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PbBulkBookingRideDetailsComponent f6909a;

        public AnonymousClass1(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent) {
            this.f6909a = pbBulkBookingRideDetailsComponent;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:54:0x00c8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:56:0x00b5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
        
            if (app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent.J0(r12, r1, r3) == r4) goto L45;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.util.List r18, kotlin.coroutines.Continuation r19) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1.AnonymousClass1.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1(this.this$0, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r5).collect(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L40
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L2e
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r5 = r4.this$0
            app.chalo.premiumbus.bulkbookingridedetails.domain.FetchAllPremiumReserveTicketsBookedThroughPassUseCase r5 = r5.u
            java.lang.String r1 = r4.$passId
            r4.label = r3
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L2e
            goto L3f
        L2e:
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1$1 r1 = new app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1$1
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r3 = r4.this$0
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L40
        L3f:
            return r0
        L40:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startCollectionForPBBookingData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
