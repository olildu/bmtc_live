package app.chalo.core.database.dao;

import app.chalo.core.Product_activation_details_table;
import app.chalo.core.Product_activation_details_tableQueries;
import app.chalo.superpass.data.models.entities.ProductActivationDetails;
import defpackage.ux0;
import defpackage.vw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.DigitalTripReceiptDaoImpl$insertActivationDetails$2", f = "DigitalTripReceiptDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class DigitalTripReceiptDaoImpl$insertActivationDetails$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductActivationDetails $lProductActivationDetails;
    int label;
    final /* synthetic */ DigitalTripReceiptDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalTripReceiptDaoImpl$insertActivationDetails$2(DigitalTripReceiptDaoImpl digitalTripReceiptDaoImpl, ProductActivationDetails productActivationDetails, Continuation continuation) {
        super(1, continuation);
        this.this$0 = digitalTripReceiptDaoImpl;
        this.$lProductActivationDetails = productActivationDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DigitalTripReceiptDaoImpl$insertActivationDetails$2(this.this$0, this.$lProductActivationDetails, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DigitalTripReceiptDaoImpl$insertActivationDetails$2 digitalTripReceiptDaoImpl$insertActivationDetails$2 = (DigitalTripReceiptDaoImpl$insertActivationDetails$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        digitalTripReceiptDaoImpl$insertActivationDetails$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Product_activation_details_tableQueries product_activation_details_tableQueries = this.this$0.f2050a;
        ProductActivationDetails productActivationDetails = this.$lProductActivationDetails;
        Intrinsics.i(productActivationDetails, "<this>");
        Product_activation_details_table product_activation_details_table = new Product_activation_details_table(productActivationDetails.f9551a, productActivationDetails.b, productActivationDetails.c, productActivationDetails.d, productActivationDetails.e, productActivationDetails.f, productActivationDetails.g);
        product_activation_details_tableQueries.getClass();
        product_activation_details_tableQueries.f697a.A0(637197230, "INSERT OR REPLACE INTO product_activation_details_table (activation_time_stamp, booking_id, expiry_time, product_type, product_sub_type, city_name, agency_name) VALUES (?, ?, ?, ?, ?, ?, ?)", new vw0(product_activation_details_table, 6));
        product_activation_details_tableQueries.T(637197230, new ux0(1));
        return Unit.f17538a;
    }
}
