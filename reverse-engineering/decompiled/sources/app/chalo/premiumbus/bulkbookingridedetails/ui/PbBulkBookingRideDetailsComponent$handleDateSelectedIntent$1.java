package app.chalo.premiumbus.bulkbookingridedetails.ui;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.usecase.MillisAfterTimeFormatType;
import defpackage.s8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PbBulkBookingRideDetailsViewIntent.DateSelectedIntent $intent;
    final /* synthetic */ SuperPassResponseAppModel $passData;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1(SuperPassResponseAppModel superPassResponseAppModel, PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, PbBulkBookingRideDetailsViewIntent.DateSelectedIntent dateSelectedIntent, Continuation continuation) {
        super(2, continuation);
        this.$passData = superPassResponseAppModel;
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$intent = dateSelectedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1(this.$passData, this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1 pbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1 = (PbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        pbBulkBookingRideDetailsComponent$handleDateSelectedIntent$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        long jA = this.this$0.k.a(this.$intent.f6918a.longValue(), ((long) (this.$passData.g - 1)) * CalendarModelKt.MillisecondsIn24Hours, MillisAfterTimeFormatType.EXACT);
        PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
        pbBulkBookingRideDetailsComponent.E0(new s8(pbBulkBookingRideDetailsComponent, this.$intent, jA, 5));
        return Unit.f17538a;
    }
}
