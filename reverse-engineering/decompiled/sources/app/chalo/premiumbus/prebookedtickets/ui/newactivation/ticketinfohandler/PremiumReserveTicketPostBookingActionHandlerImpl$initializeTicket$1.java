package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.constants.Source;
import app.chalo.livetracking.provider.tracking.RouteTrackingManagerInitState;
import app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {310}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ PostBookingHandlerConfig $config;
    final /* synthetic */ Source $source;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl f7460a;
        public final /* synthetic */ CoroutineScope b;
        public final /* synthetic */ PostBookingHandlerConfig c;
        public final /* synthetic */ Source d;
        public final /* synthetic */ String e;

        /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7461a;

            static {
                int[] iArr = new int[RouteTrackingManagerInitState.values().length];
                try {
                    iArr[RouteTrackingManagerInitState.INITIALISED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RouteTrackingManagerInitState.ALREADY_INITIALISED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RouteTrackingManagerInitState.NOT_INITIALISED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f7461a = iArr;
            }
        }

        public AnonymousClass1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, CoroutineScope coroutineScope, PostBookingHandlerConfig postBookingHandlerConfig, Source source, String str) {
            this.f7460a = premiumReserveTicketPostBookingActionHandlerImpl;
            this.b = coroutineScope;
            this.c = postBookingHandlerConfig;
            this.d = source;
            this.e = str;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0053 A[PHI: r1 r2 r5 r12 r14 r15 r25
          0x0053: PHI (r1v21 int) = (r1v18 int), (r1v33 int) binds: [B:56:0x018c, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r2v28 java.lang.Object) = (r2v27 java.lang.Object), (r2v1 java.lang.Object) binds: [B:56:0x018c, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r5v18 java.lang.String) = (r5v14 java.lang.String), (r5v25 java.lang.String) binds: [B:56:0x018c, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r12v19 java.lang.String) = (r12v15 java.lang.String), (r12v21 java.lang.String) binds: [B:56:0x018c, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r14v10 app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType) = 
          (r14v6 app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType)
          (r14v14 app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType)
         binds: [B:56:0x018c, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r15v7 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) = 
          (r15v5 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
          (r15v11 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
         binds: [B:56:0x018c, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r25v8 char) = (r25v6 char), (r25v9 char) binds: [B:56:0x018c, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:43:0x0122  */
        /* JADX WARN: Code duplicated, block: B:46:0x012f  */
        /* JADX WARN: Code duplicated, block: B:50:0x0149  */
        /* JADX WARN: Code duplicated, block: B:54:0x016b  */
        /* JADX WARN: Code duplicated, block: B:61:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:63:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:64:0x01ad A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:65:0x01af  */
        /* JADX WARN: Code duplicated, block: B:66:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:68:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:69:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:71:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:72:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:75:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code duplicated, block: B:80:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:81:0x01fe A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:85:0x0207  */
        /* JADX WARN: Code duplicated, block: B:92:0x0232 A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0142, code lost:
        
            if (r2 == r4) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0222, code lost:
        
            if (r2 == r4) goto L88;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r20v0 */
        /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r20v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r24, kotlin.coroutines.Continuation r25) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 586
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1.AnonymousClass1.emit(app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, String str, PostBookingHandlerConfig postBookingHandlerConfig, Source source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
        this.$bookingId = str;
        this.$config = postBookingHandlerConfig;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1 premiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1(this.this$0, this.$bookingId, this.$config, this.$source, continuation);
        premiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1.L$0 = obj;
        return premiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow flowA = this.this$0.f7449a.a(this.$bookingId);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope, this.$config, this.$source, this.$bookingId);
            this.label = 1;
            if (((PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1) flowA).collect(anonymousClass1, this) == coroutineSingletons) {
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
