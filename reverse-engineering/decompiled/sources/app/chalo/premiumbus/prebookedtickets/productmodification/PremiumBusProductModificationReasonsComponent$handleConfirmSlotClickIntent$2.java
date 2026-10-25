package app.chalo.premiumbus.prebookedtickets.productmodification;

import app.chalo.constants.Source;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PremiumBusArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2", f = "PremiumBusProductModificationReasonsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    final /* synthetic */ PBAvailableSlotsTripAppModel $selectedSlot;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2$1", f = "PremiumBusProductModificationReasonsComponent.kt", l = {802}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $requestId;
        int label;
        final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = premiumBusProductModificationReasonsComponent;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent = this.this$0;
                String str = this.$requestId;
                this.label = 1;
                if (PremiumBusProductModificationReasonsComponent.F0(premiumBusProductModificationReasonsComponent, str, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2$2", f = "PremiumBusProductModificationReasonsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $requestId;
        final /* synthetic */ PBAvailableSlotsTripAppModel $selectedSlot;
        int label;
        final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, String str, Continuation continuation) {
            super(2, continuation);
            this.$selectedSlot = pBAvailableSlotsTripAppModel;
            this.this$0 = premiumBusProductModificationReasonsComponent;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$selectedSlot, this.this$0, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.$selectedSlot;
            String str = pBAvailableSlotsTripAppModel.f;
            String str2 = pBAvailableSlotsTripAppModel.d;
            String str3 = pBAvailableSlotsTripAppModel.e;
            Integer num = ((PremiumBusProductModificationReasonsViewState) this.this$0.f.getValue()).o;
            PremiumBusSeatSelectionFlowType.Reschedule reschedule = new PremiumBusSeatSelectionFlowType.Reschedule(str, str2, str3, num != null ? num.intValue() : 1);
            ChaloNavigationManager chaloNavigationManager = this.this$0.v;
            Json json = ChaloJson.b;
            json.getClass();
            ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumBusSeatSelectionArgs(Source.PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT, json.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), reschedule), this.$requestId, (String) null, 8), null, 6);
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2(PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductModificationReasonsComponent;
        this.$requestId = str;
        this.$selectedSlot = pBAvailableSlotsTripAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2 premiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2 = new PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2(this.$selectedSlot, this.this$0, this.$requestId, continuation);
        premiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2.L$0 = obj;
        return premiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2 premiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2 = (PremiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        premiumBusProductModificationReasonsComponent$handleConfirmSlotClickIntent$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$requestId, null), 3);
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.$selectedSlot, this.this$0, this.$requestId, null), 3);
        return Unit.f17538a;
    }
}
