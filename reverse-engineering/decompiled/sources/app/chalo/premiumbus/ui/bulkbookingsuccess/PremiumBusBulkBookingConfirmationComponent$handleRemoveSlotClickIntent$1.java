package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import app.chalo.productbooking.common.data.models.app.response.PBBulkBookingAvailableSlotsTripAppResponseModel;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.n3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent$handleRemoveSlotClickIntent$1", f = "PremiumBusBulkBookingConfirmationComponent.kt", l = {255}, m = "invokeSuspend", v = 1)
final class PremiumBusBulkBookingConfirmationComponent$handleRemoveSlotClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusBulkBookingConfirmationIntent.RemoveSlotClickIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PremiumBusBulkBookingConfirmationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusBulkBookingConfirmationComponent$handleRemoveSlotClickIntent$1(PremiumBusBulkBookingConfirmationIntent.RemoveSlotClickIntent removeSlotClickIntent, PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = removeSlotClickIntent;
        this.this$0 = premiumBusBulkBookingConfirmationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusBulkBookingConfirmationComponent$handleRemoveSlotClickIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusBulkBookingConfirmationComponent$handleRemoveSlotClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking;
        Map map;
        List list;
        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Long l = null;
        if (i == 0) {
            ResultKt.b(obj);
            DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking2 = this.$intent.f7498a;
            Iterable<DateAndSlotSelectedForBulkBooking> iterable = ((PremiumBusBulkBookingConfirmationDataState) this.this$0.f.getValue()).d;
            if (iterable == null) {
                iterable = EmptyList.f17557a;
            }
            List list2 = dateAndSlotSelectedForBulkBooking2.d;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((SlotsAvailableForSelection) it.next()).f7902a.b);
            }
            Set setG0 = CollectionsKt.G0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBookingA : iterable) {
                if (Intrinsics.d(dateAndSlotSelectedForBulkBookingA.f7795a, dateAndSlotSelectedForBulkBooking2.f7795a)) {
                    List list3 = dateAndSlotSelectedForBulkBookingA.d;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list3) {
                        if (!setG0.contains(((SlotsAvailableForSelection) obj2).f7902a.b)) {
                            arrayList3.add(obj2);
                        }
                    }
                    dateAndSlotSelectedForBulkBookingA = arrayList3.isEmpty() ? null : DateAndSlotSelectedForBulkBooking.a(dateAndSlotSelectedForBulkBookingA, arrayList3);
                }
                if (dateAndSlotSelectedForBulkBookingA != null) {
                    arrayList2.add(dateAndSlotSelectedForBulkBookingA);
                }
            }
            LinkedHashMap linkedHashMapG0 = PremiumBusBulkBookingConfirmationComponent.G0(this.this$0, arrayList2);
            PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent = this.this$0;
            this.L$0 = dateAndSlotSelectedForBulkBooking2;
            this.L$1 = arrayList2;
            this.L$2 = linkedHashMapG0;
            this.label = 1;
            Object objF0 = PremiumBusBulkBookingConfirmationComponent.F0(premiumBusBulkBookingConfirmationComponent, arrayList2, this);
            if (objF0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            dateAndSlotSelectedForBulkBooking = dateAndSlotSelectedForBulkBooking2;
            obj = objF0;
            map = linkedHashMapG0;
            list = arrayList2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map2 = (Map) this.L$2;
            List list4 = (List) this.L$1;
            dateAndSlotSelectedForBulkBooking = (DateAndSlotSelectedForBulkBooking) this.L$0;
            ResultKt.b(obj);
            map = map2;
            list = list4;
        }
        String str = (String) obj;
        if (list.isEmpty()) {
            TimeUtilsContract.Companion companion = TimeUtilsContract.f10451a;
            String strB = companion.a().b();
            SlotsAvailableForSelection slotsAvailableForSelection = (SlotsAvailableForSelection) CollectionsKt.H(dateAndSlotSelectedForBulkBooking.d);
            if (slotsAvailableForSelection != null && (pBBulkBookingAvailableSlotsTripAppResponseModel = slotsAvailableForSelection.f7902a) != null) {
                l = new Long(companion.a().K(pBBulkBookingAvailableSlotsTripAppResponseModel.c, strB));
            }
        }
        this.this$0.E0(new n3(list, map, l, str, 21));
        return Unit.f17538a;
    }
}
