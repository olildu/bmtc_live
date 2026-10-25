package app.chalo.premiumbus.ui.slotselection;

import app.chalo.constants.Source;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.PremiumBusSlotListScreenData;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1", f = "PremiumBusSlotSelectionComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSlotSelectionIntent.SelectNearByViewMoreClickedForBulkBookingIntent $intent;
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1$1", f = "PremiumBusSlotSelectionComponent.kt", l = {4016}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $requestId;
        int label;
        final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = premiumBusSlotSelectionComponent;
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
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.this$0;
                String str = this.$requestId;
                this.label = 1;
                if (PremiumBusSlotSelectionComponent.I0(premiumBusSlotSelectionComponent, str, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1$2", f = "PremiumBusSlotSelectionComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PremiumBusSlotSelectionIntent.SelectNearByViewMoreClickedForBulkBookingIntent $intent;
        final /* synthetic */ String $requestId;
        int label;
        final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PremiumBusSlotSelectionIntent.SelectNearByViewMoreClickedForBulkBookingIntent selectNearByViewMoreClickedForBulkBookingIntent, String str, Continuation continuation) {
            super(2, continuation);
            this.$intent = selectNearByViewMoreClickedForBulkBookingIntent;
            this.this$0 = premiumBusSlotSelectionComponent;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$intent, this.$requestId, continuation);
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
            PremiumBusSlotListScreenData premiumBusSlotListScreenData = new PremiumBusSlotListScreenData(this.$intent.f7885a);
            ChaloNavigationManager chaloNavigationManager = this.this$0.C;
            String str = this.$requestId;
            Source source = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
            Json json = ChaloJson.b;
            json.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.PremiumBusSlotListScreenArgs(source, str, json.a(PremiumBusSlotListScreenData.INSTANCE.serializer(), premiumBusSlotListScreenData)), null, null, 6));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PremiumBusSlotSelectionIntent.SelectNearByViewMoreClickedForBulkBookingIntent selectNearByViewMoreClickedForBulkBookingIntent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$requestId = str;
        this.$intent = selectNearByViewMoreClickedForBulkBookingIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1 premiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1 = new PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1(this.this$0, this.$intent, this.$requestId, continuation);
        premiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1.L$0 = obj;
        return premiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1 premiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1 = (PremiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        premiumBusSlotSelectionComponent$handleSelectNearByViewMoreClickedForBulkBookingIntent$1.invokeSuspend(unit);
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
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$intent, this.$requestId, null), 3);
        return Unit.f17538a;
    }
}
