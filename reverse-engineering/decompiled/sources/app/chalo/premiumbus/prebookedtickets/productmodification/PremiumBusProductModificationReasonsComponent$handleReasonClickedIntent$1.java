package app.chalo.premiumbus.prebookedtickets.productmodification;

import app.chalo.data.PremiumReserveTicketOptionAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleReasonClickedIntent$1", f = "PremiumBusProductModificationReasonsComponent.kt", l = {383, 387}, m = "invokeSuspend", v = 1)
final class PremiumBusProductModificationReasonsComponent$handleReasonClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusProductModificationReasonsIntent.ReasonClickedIntent $intent;
    int label;
    final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7337a;

        static {
            int[] iArr = new int[PremiumReserveTicketOptionAction.values().length];
            try {
                iArr[PremiumReserveTicketOptionAction.CANCEL_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.RESCHEDULE_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.CALL_SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.CHAT_SUPPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.CHANGE_SEAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PremiumReserveTicketOptionAction.CHANGE_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7337a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductModificationReasonsComponent$handleReasonClickedIntent$1(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, PremiumBusProductModificationReasonsIntent.ReasonClickedIntent reasonClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductModificationReasonsComponent;
        this.$intent = reasonClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductModificationReasonsComponent$handleReasonClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductModificationReasonsComponent$handleReasonClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r6 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        if (app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.I0(r6, r1, r2, r5) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L5a
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto La8
        L1d:
            kotlin.ResultKt.b(r6)
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r6 = r5.this$0
            kotlinx.coroutines.flow.StateFlow r6 = r6.f
            java.lang.Object r6 = r6.getValue()
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState r6 = (app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState) r6
            app.chalo.data.PremiumReserveTicketOptionAction r6 = r6.c
            if (r6 != 0) goto L30
            r6 = -1
            goto L38
        L30:
            int[] r1 = app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleReasonClickedIntent$1.WhenMappings.f7337a
            int r6 = r6.ordinal()
            r6 = r1[r6]
        L38:
            java.lang.String r1 = ""
            switch(r6) {
                case -1: goto La8;
                case 0: goto L3d;
                case 1: goto L81;
                case 2: goto L43;
                case 3: goto La8;
                case 4: goto La8;
                case 5: goto La8;
                case 6: goto La8;
                default: goto L3d;
            }
        L3d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L43:
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r6 = r5.this$0
            app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase r3 = r6.m
            java.lang.String r6 = r6.A
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            r1 = r6
        L4d:
            kotlinx.coroutines.flow.Flow r6 = r3.a(r1)
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.v(r6, r5)
            if (r6 != r0) goto L5a
            goto La7
        L5a:
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r6 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r6
            if (r6 == 0) goto La8
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r0 = r5.this$0
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent$ReasonClickedIntent r1 = r5.$intent
            app.chalo.data.PremiumBusProductModificationReasonAppModel r1 = r1.f7347a
            r0.E = r1
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel r6 = r6.b
            java.lang.String r2 = r6.f7117a
            ej0 r3 = new ej0
            r4 = 28
            r3.<init>(r4, r1, r2)
            r0.E0(r3)
            kotlinx.coroutines.internal.ContextScope r1 = r0.j
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$fetchSlotsAndOpenSlotSelectionBottomSheet$2 r2 = new app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$fetchSlotsAndOpenSlotSelectionBottomSheet$2
            r3 = 0
            r2.<init>(r0, r6, r3)
            r6 = 3
            kotlinx.coroutines.BuildersKt.d(r1, r3, r3, r2, r6)
            goto La8
        L81:
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r6 = r5.this$0
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent$ReasonClickedIntent r2 = r5.$intent
            app.chalo.data.PremiumBusProductModificationReasonAppModel r2 = r2.f7347a
            r6.E = r2
            et0 r2 = new et0
            r4 = 13
            r2.<init>(r6, r4)
            r6.E0(r2)
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r6 = r5.this$0
            java.lang.String r2 = r6.A
            if (r2 != 0) goto L9a
            goto L9b
        L9a:
            r1 = r2
        L9b:
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent$ReasonClickedIntent r2 = r5.$intent
            app.chalo.data.PremiumBusProductModificationReasonAppModel r2 = r2.f7347a
            r5.label = r3
            java.lang.Object r6 = app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.I0(r6, r1, r2, r5)
            if (r6 != r0) goto La8
        La7:
            return r0
        La8:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleReasonClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
