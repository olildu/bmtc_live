package app.chalo.productpurchase.productselection.ui;

import app.chalo.models.mticketing.MTicket;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType;", "magicSuperPasses", "Lapp/chalo/superpass/data/models/entities/MagicSuperPass;", "rideBasedSuperPasses", "Lapp/chalo/superpass/data/models/entities/RideBasedSuperPass;", "mTickets", "Lapp/chalo/models/mticketing/MTicket;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$getUserRecentBookings$2", f = "ProductSelectionComponent.kt", l = {1017}, m = "invokeSuspend", v = 1)
final class ProductSelectionComponent$getUserRecentBookings$2 extends SuspendLambda implements Function4<List<? extends MagicSuperPass>, List<? extends RideBasedSuperPass>, List<? extends MTicket>, Continuation<? super List<? extends ProductSelectionComponent.RecentItemsType>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ProductSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSelectionComponent$getUserRecentBookings$2(ProductSelectionComponent productSelectionComponent, Continuation continuation) {
        super(4, continuation);
        this.this$0 = productSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ProductSelectionComponent$getUserRecentBookings$2 productSelectionComponent$getUserRecentBookings$2 = new ProductSelectionComponent$getUserRecentBookings$2(this.this$0, (Continuation) obj4);
        productSelectionComponent$getUserRecentBookings$2.L$0 = (List) obj;
        productSelectionComponent$getUserRecentBookings$2.L$1 = (List) obj2;
        productSelectionComponent$getUserRecentBookings$2.L$2 = (List) obj3;
        return productSelectionComponent$getUserRecentBookings$2.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0072 -> B:21:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$getUserRecentBookings$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
