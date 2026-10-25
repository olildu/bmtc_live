package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$fetchProductDataFromConfigIdAndProceed$2", f = "PremiumBusSlotSelectionComponent.kt", l = {2453, 2454, 2456, 2472, 2481, 2511}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$fetchProductDataFromConfigIdAndProceed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isPPRSelectionDisabled;
    final /* synthetic */ List<String> $productSubTypesSupported;
    final /* synthetic */ List<ProductConfigServiceType> $serviceTypeSupported;
    final /* synthetic */ PBAvailableSlotsTripAppModel $slot;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$fetchProductDataFromConfigIdAndProceed$2(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, List list, List list2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$slot = pBAvailableSlotsTripAppModel;
        this.$productSubTypesSupported = list;
        this.$serviceTypeSupported = list2;
        this.$isPPRSelectionDisabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$fetchProductDataFromConfigIdAndProceed$2(this.this$0, this.$slot, this.$productSubTypesSupported, this.$serviceTypeSupported, this.$isPPRSelectionDisabled, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$fetchProductDataFromConfigIdAndProceed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x012d -> B:51:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013b -> B:55:0x013c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$fetchProductDataFromConfigIdAndProceed$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
