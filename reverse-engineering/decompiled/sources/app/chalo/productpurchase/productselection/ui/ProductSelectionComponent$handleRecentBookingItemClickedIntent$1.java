package app.chalo.productpurchase.productselection.ui;

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
@DebugMetadata(c = "app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$handleRecentBookingItemClickedIntent$1", f = "ProductSelectionComponent.kt", l = {241, 242, 243}, m = "invokeSuspend", v = 1)
final class ProductSelectionComponent$handleRecentBookingItemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductSelectionIntent.RecentBookingItemClickedIntent $intent;
    int label;
    final /* synthetic */ ProductSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSelectionComponent$handleRecentBookingItemClickedIntent$1(ProductSelectionIntent.RecentBookingItemClickedIntent recentBookingItemClickedIntent, ProductSelectionComponent productSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = recentBookingItemClickedIntent;
        this.this$0 = productSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductSelectionComponent$handleRecentBookingItemClickedIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductSelectionComponent$handleRecentBookingItemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.J0(r1, r6, r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.J0(r1, r6, r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.I0(r1, r6, r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L5c
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.productpurchase.productselection.ui.ProductSelectionIntent$RecentBookingItemClickedIntent r6 = r5.$intent
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$RecentItemsType r6 = r6.f8682a
            boolean r1 = r6 instanceof app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.RecentItemsType.RecentRideBasedSuperPass
            if (r1 == 0) goto L36
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent r1 = r5.this$0
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$RecentItemsType$RecentRideBasedSuperPass r6 = (app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.RecentItemsType.RecentRideBasedSuperPass) r6
            app.chalo.superpass.data.models.entities.RideBasedSuperPass r6 = r6.b
            r5.label = r4
            java.lang.Object r6 = app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.J0(r1, r6, r5)
            if (r6 != r0) goto L5c
            goto L5b
        L36:
            boolean r1 = r6 instanceof app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.RecentItemsType.RecentMagicSuperPass
            if (r1 == 0) goto L49
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent r1 = r5.this$0
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$RecentItemsType$RecentMagicSuperPass r6 = (app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.RecentItemsType.RecentMagicSuperPass) r6
            app.chalo.superpass.data.models.entities.MagicSuperPass r6 = r6.b
            r5.label = r3
            java.lang.Object r6 = app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.J0(r1, r6, r5)
            if (r6 != r0) goto L5c
            goto L5b
        L49:
            boolean r1 = r6 instanceof app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.RecentItemsType.RecentMTicket
            if (r1 == 0) goto L5f
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent r1 = r5.this$0
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$RecentItemsType$RecentMTicket r6 = (app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.RecentItemsType.RecentMTicket) r6
            app.chalo.models.mticketing.MTicket r6 = r6.b
            r5.label = r2
            java.lang.Object r6 = app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.I0(r1, r6, r5)
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        L5f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$handleRecentBookingItemClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
