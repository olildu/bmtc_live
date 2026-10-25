package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingPurchaseOptionAppModel;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$processSlotClickedForFreshPurchaseFlow$1", f = "PremiumBusSlotSelectionComponent.kt", l = {2137, 2142, 2150}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$processSlotClickedForFreshPurchaseFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PremiumBusBookingPurchaseOptionAppModel> $purchaseOptions;
    final /* synthetic */ PBAvailableSlotsTripAppModel $slot;
    final /* synthetic */ PBOriginDestinationAppModel $stopPoints;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7858a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[BookingSelectionType.values().length];
            try {
                iArr[BookingSelectionType.SINGLE_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingSelectionType.MULTIPLE_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7858a = iArr;
            int[] iArr2 = new int[PremiumBusPurchaseOptionState.values().length];
            try {
                iArr2[PremiumBusPurchaseOptionState.NO_PURCHASE_OPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PremiumBusPurchaseOptionState.NO_PASS_OPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PremiumBusPurchaseOptionState.ATLEAST_ONE_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$processSlotClickedForFreshPurchaseFlow$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, List list, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PBOriginDestinationAppModel pBOriginDestinationAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$purchaseOptions = list;
        this.$slot = pBAvailableSlotsTripAppModel;
        this.$stopPoints = pBOriginDestinationAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$processSlotClickedForFreshPurchaseFlow$1(this.this$0, this.$purchaseOptions, this.$slot, this.$stopPoints, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$processSlotClickedForFreshPurchaseFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent.L0(r12, r6, r3, r4, r11) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent.M0(r5, r6, r7, r8, r9, r11) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$processSlotClickedForFreshPurchaseFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
