package app.chalo.instantticket.config.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$clearInstantTicketConfig$2", f = "ProductBookingDataStore.kt", l = {}, m = "invokeSuspend", v = 1)
final class ProductBookingDataStoreImpl$clearInstantTicketConfig$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProductBookingDataStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBookingDataStoreImpl$clearInstantTicketConfig$2(ProductBookingDataStoreImpl productBookingDataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = productBookingDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductBookingDataStoreImpl$clearInstantTicketConfig$2 productBookingDataStoreImpl$clearInstantTicketConfig$2 = new ProductBookingDataStoreImpl$clearInstantTicketConfig$2(this.this$0, continuation);
        productBookingDataStoreImpl$clearInstantTicketConfig$2.L$0 = obj;
        return productBookingDataStoreImpl$clearInstantTicketConfig$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProductBookingDataStoreImpl$clearInstantTicketConfig$2 productBookingDataStoreImpl$clearInstantTicketConfig$2 = (ProductBookingDataStoreImpl$clearInstantTicketConfig$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        productBookingDataStoreImpl$clearInstantTicketConfig$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ((MutablePreferences) this.L$0).remove(PreferencesKeys.stringKey("pay_for_ticket_config_".concat(this.this$0.e())));
        return Unit.f17538a;
    }
}
