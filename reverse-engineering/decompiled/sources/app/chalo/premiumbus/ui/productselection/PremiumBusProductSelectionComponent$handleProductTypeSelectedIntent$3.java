package app.chalo.premiumbus.ui.productselection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.premiumbus.managers.PremiumBusBookingSteps;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent$handleProductTypeSelectedIntent$3", f = "PremiumBusProductSelectionComponent.kt", l = {TypedValues.TransitionType.TYPE_INTERPOLATOR, 722, 728, 820}, m = "invokeSuspend", v = 1)
final class PremiumBusProductSelectionComponent$handleProductTypeSelectedIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusProductSelectionIntent.ProductTypeSelectedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusProductSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7692a;

        static {
            int[] iArr = new int[PremiumBusBookingSteps.values().length];
            try {
                iArr[PremiumBusBookingSteps.PASS_PLAN_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusBookingSteps.FARE_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7692a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductSelectionComponent$handleProductTypeSelectedIntent$3(PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, PremiumBusProductSelectionIntent.ProductTypeSelectedIntent productTypeSelectedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductSelectionComponent;
        this.$intent = productTypeSelectedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductSelectionComponent$handleProductTypeSelectedIntent$3(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductSelectionComponent$handleProductTypeSelectedIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a5, code lost:
    
        if (r0 == r6) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cc, code lost:
    
        if (r1.a(r3, r20) == r6) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0248, code lost:
    
        if (r1 == r6) goto L95;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent$handleProductTypeSelectedIntent$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
