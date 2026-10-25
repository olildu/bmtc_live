package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleInitializationIntent$2", f = "PremiumBusSlotSelectionComponent.kt", l = {1063, 1065, 1068, 1098, 1106}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handleInitializationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<PBStopPlaceSelectedAppModel> $fromStopOrPlaceSelected;
    final /* synthetic */ PremiumBusSlotSelectionIntent.InitializationIntent $intent;
    final /* synthetic */ Ref.ObjectRef<String> $productConfigIdFromInput;
    final /* synthetic */ Ref.ObjectRef<PBStopPlaceSelectedAppModel> $toStopOrPlaceSelected;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$handleInitializationIntent$2(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PremiumBusSlotSelectionIntent.InitializationIntent initializationIntent, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$intent = initializationIntent;
        this.$fromStopOrPlaceSelected = objectRef;
        this.$toStopOrPlaceSelected = objectRef2;
        this.$productConfigIdFromInput = objectRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$handleInitializationIntent$2(this.this$0, this.$intent, this.$fromStopOrPlaceSelected, this.$toStopOrPlaceSelected, this.$productConfigIdFromInput, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$handleInitializationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:50:0x0159  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (r2 == r1) goto L59;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleInitializationIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
