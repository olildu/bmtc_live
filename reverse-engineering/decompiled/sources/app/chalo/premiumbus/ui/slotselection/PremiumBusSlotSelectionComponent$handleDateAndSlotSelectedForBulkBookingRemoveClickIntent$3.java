package app.chalo.premiumbus.ui.slotselection;

import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.dialog.DateDataState;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import defpackage.iv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleDateAndSlotSelectedForBulkBookingRemoveClickIntent$3", f = "PremiumBusSlotSelectionComponent.kt", l = {3869, 3877, 3894, 3899}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handleDateAndSlotSelectedForBulkBookingRemoveClickIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<DateAndSlotSelectedForBulkBooking> $updatedSlotsSelectedForBulkBooking;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$handleDateAndSlotSelectedForBulkBookingRemoveClickIntent$3(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$updatedSlotsSelectedForBulkBooking = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$handleDateAndSlotSelectedForBulkBookingRemoveClickIntent$3(this.this$0, this.$updatedSlotsSelectedForBulkBooking, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$handleDateAndSlotSelectedForBulkBookingRemoveClickIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0134  */
    /* JADX WARN: Code duplicated, block: B:39:0x0148  */
    /* JADX WARN: Code duplicated, block: B:42:0x0161 A[LOOP:1: B:37:0x0142->B:42:0x0161, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x019e  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01de  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0194 A[EDGE_INSN: B:67:0x0194->B:45:0x0194 BREAK  A[LOOP:0: B:34:0x012c->B:44:0x016a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x015e A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SelectedPassInfo selectedPassInfo;
        Object objB;
        List list;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel;
        SelectedPassInfo selectedPassInfo2;
        long jLongValue;
        int i;
        Object objB2;
        int i2;
        int i3;
        long j;
        String str;
        List<DateAndSlotSelectedForBulkBooking> list2;
        PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent;
        ArrayList arrayList;
        Iterator it;
        Object obj2;
        Unit unit;
        int size;
        int i4;
        int i5;
        Object obj3;
        Object objH0;
        String str2;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2;
        int i6;
        long j2;
        int i7;
        DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking;
        Iterator<T> it2;
        Iterator it3;
        Unit unit2;
        Object next;
        List list3;
        String str3;
        Object objG0;
        String str4;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel3;
        String str5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.label;
        Unit unit3 = Unit.f17538a;
        if (i8 == 0) {
            ResultKt.b(obj);
            List list4 = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).B;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel4 = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).i;
            if (pBAvailableSlotsTripAppModel4 == null || (selectedPassInfo = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).A) == null) {
                return unit3;
            }
            ChaloTimeProvider chaloTimeProvider = this.this$0.G;
            this.L$0 = list4;
            this.L$1 = pBAvailableSlotsTripAppModel4;
            this.L$2 = selectedPassInfo;
            this.label = 1;
            objB = chaloTimeProvider.b(this);
            if (objB != coroutineSingletons) {
                list = list4;
                pBAvailableSlotsTripAppModel = pBAvailableSlotsTripAppModel4;
                selectedPassInfo2 = selectedPassInfo;
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            SelectedPassInfo selectedPassInfo3 = (SelectedPassInfo) this.L$2;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel5 = (PBAvailableSlotsTripAppModel) this.L$1;
            List list5 = (List) this.L$0;
            ResultKt.b(obj);
            selectedPassInfo2 = selectedPassInfo3;
            pBAvailableSlotsTripAppModel = pBAvailableSlotsTripAppModel5;
            list = list5;
            objB = obj;
        } else {
            if (i8 == 2) {
                i3 = this.I$2;
                int i9 = this.I$1;
                i = this.I$0;
                jLongValue = this.J$0;
                selectedPassInfo2 = (SelectedPassInfo) this.L$2;
                pBAvailableSlotsTripAppModel = (PBAvailableSlotsTripAppModel) this.L$1;
                list = (List) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                i2 = i9;
                j = jLongValue;
                int i10 = i;
                str = (String) objB2;
                List list6 = list;
                list2 = this.$updatedSlotsSelectedForBulkBooking;
                premiumBusSlotSelectionComponent = this.this$0;
                arrayList = new ArrayList(CollectionsKt.v(list6, 10));
                it = list6.iterator();
                while (true) {
                    obj2 = null;
                    if (it.hasNext()) {
                        break;
                    }
                    dateAndSlotSelectedForBulkBooking = (DateAndSlotSelectedForBulkBooking) it.next();
                    it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = it;
                            unit2 = unit3;
                            break;
                        }
                        next = it2.next();
                        it3 = it;
                        unit2 = unit3;
                        if (Intrinsics.d(((DateAndSlotSelectedForBulkBooking) next).f7795a, dateAndSlotSelectedForBulkBooking.f7795a)) {
                            obj2 = next;
                            break;
                        }
                        it = it3;
                        unit3 = unit2;
                    }
                    arrayList.add(PremiumBusSlotSelectionComponent.F0(premiumBusSlotSelectionComponent, dateAndSlotSelectedForBulkBooking, (DateAndSlotSelectedForBulkBooking) obj2, new Long(selectedPassInfo2.b), new Long(selectedPassInfo2.c)));
                    it = it3;
                    coroutineSingletons = coroutineSingletons;
                    list2 = list2;
                    unit3 = unit2;
                    selectedPassInfo2 = selectedPassInfo2;
                }
                CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                unit = unit3;
                if (arrayList.isEmpty()) {
                    i4 = 0;
                } else {
                    size = arrayList.size();
                    i4 = 0;
                    i5 = 0;
                    while (i5 < size) {
                        obj3 = arrayList.get(i5);
                        i5++;
                        if (!((DateDataState) obj3).b && (i4 = i4 + 1) < 0) {
                            CollectionsKt.y0();
                            throw null;
                        }
                    }
                }
                int iMax = Math.max(0, i2 - i4);
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent2 = this.this$0;
                this.L$0 = pBAvailableSlotsTripAppModel;
                this.L$1 = str;
                this.L$2 = arrayList;
                this.J$0 = j;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 3;
                objH0 = PremiumBusSlotSelectionComponent.H0(premiumBusSlotSelectionComponent2, iMax, i10, this);
                coroutineSingletons = coroutineSingletons2;
                if (objH0 != coroutineSingletons) {
                    str2 = str;
                    pBAvailableSlotsTripAppModel2 = pBAvailableSlotsTripAppModel;
                    int i11 = i2;
                    i6 = i3;
                    j2 = j;
                    i7 = i11;
                    list3 = arrayList;
                    str3 = (String) objH0;
                    long j3 = j2;
                    PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent3 = this.this$0;
                    this.L$0 = pBAvailableSlotsTripAppModel2;
                    this.L$1 = str2;
                    this.L$2 = str3;
                    this.label = 4;
                    objG0 = PremiumBusSlotSelectionComponent.G0(premiumBusSlotSelectionComponent3, list3, i6, i7, j3, this);
                    if (objG0 != coroutineSingletons) {
                        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel6 = pBAvailableSlotsTripAppModel2;
                        str4 = str2;
                        pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel6;
                        str5 = str3;
                    }
                }
                return coroutineSingletons;
            }
            if (i8 == 3) {
                int i12 = this.I$1;
                int i13 = this.I$0;
                long j4 = this.J$0;
                List list7 = (List) this.L$2;
                str2 = (String) this.L$1;
                pBAvailableSlotsTripAppModel2 = (PBAvailableSlotsTripAppModel) this.L$0;
                ResultKt.b(obj);
                i6 = i12;
                j2 = j4;
                i7 = i13;
                list3 = list7;
                unit = unit3;
                objH0 = obj;
                str3 = (String) objH0;
                long j5 = j2;
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent4 = this.this$0;
                this.L$0 = pBAvailableSlotsTripAppModel2;
                this.L$1 = str2;
                this.L$2 = str3;
                this.label = 4;
                objG0 = PremiumBusSlotSelectionComponent.G0(premiumBusSlotSelectionComponent4, list3, i6, i7, j5, this);
                if (objG0 != coroutineSingletons) {
                    PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel7 = pBAvailableSlotsTripAppModel2;
                    str4 = str2;
                    pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel7;
                    str5 = str3;
                }
                return coroutineSingletons;
            }
            if (i8 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str6 = (String) this.L$2;
            String str7 = (String) this.L$1;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel8 = (PBAvailableSlotsTripAppModel) this.L$0;
            ResultKt.b(obj);
            str5 = str6;
            str4 = str7;
            pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel8;
            unit = unit3;
            objG0 = obj;
        }
        PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent5 = this.this$0;
        premiumBusSlotSelectionComponent5.E0(new iv0(premiumBusSlotSelectionComponent5, pBAvailableSlotsTripAppModel3, str4, str5, (MultiSelectionCalendarDataState) objG0, 0));
        return unit;
        Long l = (Long) objB;
        jLongValue = l != null ? l.longValue() : this.this$0.B.j();
        i = selectedPassInfo2.e;
        int i14 = selectedPassInfo2.d;
        int i15 = selectedPassInfo2.f;
        this.this$0.q.s(jLongValue, selectedPassInfo2.c);
        this.L$0 = list;
        this.L$1 = pBAvailableSlotsTripAppModel;
        this.L$2 = selectedPassInfo2;
        this.J$0 = jLongValue;
        this.I$0 = i;
        this.I$1 = i14;
        this.I$2 = i15;
        this.label = 2;
        objB2 = this.this$0.p.b(StringEnum.PICKUP, new Object[0], this);
        if (objB2 != coroutineSingletons) {
            i2 = i14;
            i3 = i15;
            j = jLongValue;
            int i16 = i;
            str = (String) objB2;
            List list8 = list;
            list2 = this.$updatedSlotsSelectedForBulkBooking;
            premiumBusSlotSelectionComponent = this.this$0;
            arrayList = new ArrayList(CollectionsKt.v(list8, 10));
            it = list8.iterator();
            while (true) {
                obj2 = null;
                if (it.hasNext()) {
                    break;
                    break;
                }
                dateAndSlotSelectedForBulkBooking = (DateAndSlotSelectedForBulkBooking) it.next();
                it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it3 = it;
                        unit2 = unit3;
                        break;
                        break;
                    }
                    next = it2.next();
                    it3 = it;
                    unit2 = unit3;
                    if (Intrinsics.d(((DateAndSlotSelectedForBulkBooking) next).f7795a, dateAndSlotSelectedForBulkBooking.f7795a)) {
                        obj2 = next;
                        break;
                        break;
                    }
                    it = it3;
                    unit3 = unit2;
                }
                arrayList.add(PremiumBusSlotSelectionComponent.F0(premiumBusSlotSelectionComponent, dateAndSlotSelectedForBulkBooking, (DateAndSlotSelectedForBulkBooking) obj2, new Long(selectedPassInfo2.b), new Long(selectedPassInfo2.c)));
                it = it3;
                coroutineSingletons = coroutineSingletons;
                list2 = list2;
                unit3 = unit2;
                selectedPassInfo2 = selectedPassInfo2;
            }
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
            unit = unit3;
            if (arrayList.isEmpty()) {
                i4 = 0;
            } else {
                size = arrayList.size();
                i4 = 0;
                i5 = 0;
                while (i5 < size) {
                    obj3 = arrayList.get(i5);
                    i5++;
                    if (!((DateDataState) obj3).b) {
                    }
                }
            }
            int iMax2 = Math.max(0, i2 - i4);
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent6 = this.this$0;
            this.L$0 = pBAvailableSlotsTripAppModel;
            this.L$1 = str;
            this.L$2 = arrayList;
            this.J$0 = j;
            this.I$0 = i2;
            this.I$1 = i3;
            this.label = 3;
            objH0 = PremiumBusSlotSelectionComponent.H0(premiumBusSlotSelectionComponent6, iMax2, i16, this);
            coroutineSingletons = coroutineSingletons3;
            if (objH0 != coroutineSingletons) {
                str2 = str;
                pBAvailableSlotsTripAppModel2 = pBAvailableSlotsTripAppModel;
                int i17 = i2;
                i6 = i3;
                j2 = j;
                i7 = i17;
                list3 = arrayList;
                str3 = (String) objH0;
                long j6 = j2;
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent7 = this.this$0;
                this.L$0 = pBAvailableSlotsTripAppModel2;
                this.L$1 = str2;
                this.L$2 = str3;
                this.label = 4;
                objG0 = PremiumBusSlotSelectionComponent.G0(premiumBusSlotSelectionComponent7, list3, i6, i7, j6, this);
                if (objG0 != coroutineSingletons) {
                    PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel9 = pBAvailableSlotsTripAppModel2;
                    str4 = str2;
                    pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel9;
                    str5 = str3;
                    PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent8 = this.this$0;
                    premiumBusSlotSelectionComponent8.E0(new iv0(premiumBusSlotSelectionComponent8, pBAvailableSlotsTripAppModel3, str4, str5, (MultiSelectionCalendarDataState) objG0, 0));
                    return unit;
                }
            }
        }
        return coroutineSingletons;
    }
}
