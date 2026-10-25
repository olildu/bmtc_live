package app.chalo.productactivation.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.productactivation.data.ActivationProductData;
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
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$handleActivateClickedIntent$1", f = "ProductActivationComponent.kt", l = {304, 307, TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$handleActivateClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivationProductData $activationProduct;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$handleActivateClickedIntent$1(ActivationProductData activationProductData, ProductActivationComponent productActivationComponent, Continuation continuation) {
        super(2, continuation);
        this.$activationProduct = activationProductData;
        this.this$0 = productActivationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationComponent$handleActivateClickedIntent$1(this.$activationProduct, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$handleActivateClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (app.chalo.productactivation.ui.ProductActivationComponent.F0(r4, r5, r6, r7, r8, r9, r11) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (app.chalo.productactivation.ui.ProductActivationComponent.F0(r1, r3, r3, r4, r5, r12, r11) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b9, code lost:
    
        if (r1.V0(r12, r11) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L18
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            kotlin.ResultKt.b(r12)
            r7 = r11
            goto Lbc
        L1e:
            kotlin.ResultKt.b(r12)
            app.chalo.productactivation.data.ActivationProductData r12 = r11.$activationProduct
            app.chalo.home.domain.ChaloUserBookingType r12 = app.chalo.productactivation.data.ActivationProductDataKt.a(r12)
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.InstantTicketBooking
            if (r1 != 0) goto L47
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.PremiumBusBooking
            if (r1 != 0) goto L47
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.QuickPayBooking
            if (r1 != 0) goto L47
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.MobileTicketBooking
            if (r1 != 0) goto L47
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.OndcTicketBooking
            if (r1 != 0) goto L47
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking
            if (r1 != 0) goto L47
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.MetroTicketBooking
            if (r1 != 0) goto L47
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking
            if (r1 == 0) goto L4a
        L47:
            r7 = r11
            goto Lb1
        L4a:
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking
            if (r1 == 0) goto L70
            app.chalo.productactivation.ui.ProductActivationComponent r4 = r11.this$0
            app.chalo.productactivation.data.ActivationProductData r1 = r11.$activationProduct
            boolean r5 = r1.a()
            r6 = r12
            app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking r6 = (app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking) r6
            app.chalo.models.SuperPassSubTypes r7 = app.chalo.models.SuperPassSubTypes.MAGIC_SUPER_PASS
            app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking$MagicSuperPassBooking r12 = (app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) r12
            app.chalo.superpass.data.models.entities.MagicSuperPass r12 = r12.d
            app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties r12 = r12.d
            java.lang.String r8 = r12.f9569a
            int r9 = r12.c
            r11.label = r3
            r10 = r11
            java.lang.Object r12 = app.chalo.productactivation.ui.ProductActivationComponent.F0(r4, r5, r6, r7, r8, r9, r10)
            r7 = r10
            if (r12 != r0) goto Lbc
            goto Lbb
        L70:
            r7 = r11
            boolean r1 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking
            if (r1 == 0) goto L9a
            app.chalo.productactivation.ui.ProductActivationComponent r1 = r7.this$0
            app.chalo.productactivation.data.ActivationProductData r3 = r7.$activationProduct
            boolean r3 = r3.a()
            r4 = r2
            r2 = r3
            r3 = r12
            app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking r3 = (app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking) r3
            r5 = r4
            app.chalo.models.SuperPassSubTypes r4 = app.chalo.models.SuperPassSubTypes.RIDE_BASED_SUPER_PASS
            app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking$RideBasedSuperPassBooking r12 = (app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) r12
            app.chalo.superpass.data.models.entities.RideBasedSuperPass r12 = r12.d
            app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties r12 = r12.d
            r6 = r5
            java.lang.String r5 = r12.f9569a
            int r12 = r12.c
            r7.label = r6
            r6 = r12
            java.lang.Object r12 = app.chalo.productactivation.ui.ProductActivationComponent.F0(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto Lbc
            goto Lbb
        L9a:
            boolean r0 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking
            if (r0 != 0) goto Lbc
            boolean r0 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking.PassRideBooking
            if (r0 != 0) goto Lbc
            boolean r0 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking
            if (r0 != 0) goto Lbc
            boolean r12 = r12 instanceof app.chalo.home.domain.ChaloUserBookingType.CardBooking
            if (r12 == 0) goto Lab
            goto Lbc
        Lab:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        Lb1:
            app.chalo.productactivation.ui.ProductActivationComponent r1 = r7.this$0
            r7.label = r4
            java.lang.Object r12 = r1.V0(r12, r11)
            if (r12 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.ProductActivationComponent$handleActivateClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
