package app.chalo.premiumbus.prebookedtickets.productmodification;

import app.chalo.data.PremiumBusProductModificationReasonAppModel;
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
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmActionIntent$1", f = "PremiumBusProductModificationReasonsComponent.kt", l = {582, 590, 594}, m = "invokeSuspend", v = 1)
final class PremiumBusProductModificationReasonsComponent$handleConfirmActionIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumReserveTicketOptionAction $action;
    final /* synthetic */ String $bookingId;
    final /* synthetic */ PremiumBusProductModificationReasonAppModel $reasonSelected;
    int label;
    final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7336a;

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
            f7336a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductModificationReasonsComponent$handleConfirmActionIntent$1(PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, String str, PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, Continuation continuation) {
        super(2, continuation);
        this.$reasonSelected = premiumBusProductModificationReasonAppModel;
        this.$bookingId = str;
        this.$action = premiumReserveTicketOptionAction;
        this.this$0 = premiumBusProductModificationReasonsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductModificationReasonsComponent$handleConfirmActionIntent$1(this.$reasonSelected, this.$bookingId, this.$action, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductModificationReasonsComponent$handleConfirmActionIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x006f A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r7 == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r3) goto L15
            kotlin.ResultKt.b(r7)
            return r2
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.b(r7)
            return r2
        L21:
            kotlin.ResultKt.b(r7)
            goto L90
        L25:
            kotlin.ResultKt.b(r7)
            app.chalo.data.PremiumBusProductModificationReasonAppModel r7 = r6.$reasonSelected
            if (r7 == 0) goto L70
            java.lang.String r7 = r6.$bookingId
            if (r7 == 0) goto L70
            app.chalo.data.PremiumReserveTicketOptionAction r7 = r6.$action
            if (r7 != 0) goto L35
            goto L70
        L35:
            int[] r1 = app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmActionIntent$1.WhenMappings.f7336a
            int r7 = r7.ordinal()
            r7 = r1[r7]
            switch(r7) {
                case 1: goto L55;
                case 2: goto L46;
                case 3: goto L6f;
                case 4: goto L6f;
                case 5: goto L6f;
                case 6: goto L6f;
                default: goto L40;
            }
        L40:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L46:
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r7 = r6.this$0
            java.lang.String r1 = r6.$bookingId
            app.chalo.data.PremiumBusProductModificationReasonAppModel r4 = r6.$reasonSelected
            r6.label = r3
            java.lang.Object r7 = app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.J0(r7, r1, r4, r6)
            if (r7 != r0) goto L6f
            goto L8f
        L55:
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r7 = r6.this$0
            du0 r1 = new du0
            r3 = 5
            r1.<init>(r3)
            r7.E0(r1)
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r7 = r6.this$0
            java.lang.String r1 = r6.$bookingId
            app.chalo.data.PremiumBusProductModificationReasonAppModel r3 = r6.$reasonSelected
            r6.label = r5
            java.lang.Object r7 = app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.I0(r7, r1, r3, r6)
            if (r7 != r0) goto L6f
            goto L8f
        L6f:
            return r2
        L70:
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r7 = r6.this$0
            du0 r1 = new du0
            r3 = 4
            r1.<init>(r3)
            r7.E0(r1)
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r7 = r6.this$0
            r1 = 0
            r7.E = r1
            app.chalo.providers.stringprovider.StringProvider r7 = r7.o
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.TOAST_GENERIC_ERROR_MESSAGE
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6.label = r4
            java.lang.Object r7 = r7.b(r1, r3, r6)
            if (r7 != r0) goto L90
        L8f:
            return r0
        L90:
            java.lang.String r7 = (java.lang.String) r7
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r0 = r6.this$0
            app.chalo.providers.toast.KotlinToastManager r0 = r0.u
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmActionIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
