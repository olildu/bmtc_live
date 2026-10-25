package app.chalo.premiumbus.ui.slotselection;

import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.dialog.DateDataState;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import defpackage.iv0;
import java.util.ArrayList;
import java.util.Collection;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleNearBySlotsBottomSheetGoBackClickIntent$1", f = "PremiumBusSlotSelectionComponent.kt", l = {3545, 3553, 3557, 3562}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handleNearBySlotsBottomSheetGoBackClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetGoBackClickIntent $intent;
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
    public PremiumBusSlotSelectionComponent$handleNearBySlotsBottomSheetGoBackClickIntent$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetGoBackClickIntent nearBySlotsBottomSheetGoBackClickIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$intent = nearBySlotsBottomSheetGoBackClickIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$handleNearBySlotsBottomSheetGoBackClickIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$handleNearBySlotsBottomSheetGoBackClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0185  */
    /* JADX WARN: Code duplicated, block: B:51:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x019a A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SelectedPassInfo selectedPassInfo;
        Object objB;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel;
        SelectedPassInfo selectedPassInfo2;
        Object obj2;
        List list;
        Object objB2;
        List list2;
        int i;
        int i2;
        int i3;
        long j;
        String str;
        List list3;
        Iterator it;
        int i4;
        Object objH0;
        int i5;
        List list4;
        String str2;
        long j2;
        int i6;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2;
        String str3;
        Object objG0;
        String str4;
        String str5;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        Unit unit = Unit.f17538a;
        if (i7 == 0) {
            ResultKt.b(obj);
            List list5 = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).B;
            ArrayList arrayList = this.$intent.f7879a;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel4 = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).i;
            if (pBAvailableSlotsTripAppModel4 == null || (selectedPassInfo = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).A) == null) {
                return unit;
            }
            List<DateAndSlotSelectedForBulkBooking> list6 = list5;
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.this$0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list6, 10));
            for (DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking : list6) {
                int size = arrayList.size();
                int i8 = 0;
                do {
                    if (i8 >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i8);
                    i8++;
                } while (!Intrinsics.d(((DateAndSlotSelectedForBulkBooking) obj2).f7795a, dateAndSlotSelectedForBulkBooking.f7795a));
                arrayList2.add(PremiumBusSlotSelectionComponent.F0(premiumBusSlotSelectionComponent, dateAndSlotSelectedForBulkBooking, (DateAndSlotSelectedForBulkBooking) obj2, new Long(selectedPassInfo.b), new Long(selectedPassInfo.c)));
            }
            ChaloTimeProvider chaloTimeProvider = this.this$0.G;
            this.L$0 = pBAvailableSlotsTripAppModel4;
            this.L$1 = selectedPassInfo;
            this.L$2 = arrayList2;
            this.label = 1;
            objB = chaloTimeProvider.b(this);
            if (objB != coroutineSingletons) {
                pBAvailableSlotsTripAppModel = pBAvailableSlotsTripAppModel4;
                selectedPassInfo2 = selectedPassInfo;
                list = arrayList2;
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            List list7 = (List) this.L$2;
            selectedPassInfo2 = (SelectedPassInfo) this.L$1;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel5 = (PBAvailableSlotsTripAppModel) this.L$0;
            ResultKt.b(obj);
            list = list7;
            pBAvailableSlotsTripAppModel = pBAvailableSlotsTripAppModel5;
            objB = obj;
        } else {
            if (i7 == 2) {
                i3 = this.I$2;
                int i9 = this.I$1;
                int i10 = this.I$0;
                long j3 = this.J$0;
                List list8 = (List) this.L$1;
                pBAvailableSlotsTripAppModel = (PBAvailableSlotsTripAppModel) this.L$0;
                ResultKt.b(obj);
                i2 = i9;
                i = i10;
                j = j3;
                list2 = list8;
                objB2 = obj;
                str = (String) objB2;
                list3 = list2;
                if ((list3 instanceof Collection) || !list3.isEmpty()) {
                    it = list3.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        if (!((DateDataState) it.next()).b && (i11 = i11 + 1) < 0) {
                            CollectionsKt.y0();
                            throw null;
                        }
                    }
                    i4 = i11;
                } else {
                    i4 = 0;
                }
                int iMax = Math.max(0, i2 - i4);
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent2 = this.this$0;
                this.L$0 = pBAvailableSlotsTripAppModel;
                this.L$1 = list2;
                this.L$2 = str;
                this.J$0 = j;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 3;
                objH0 = PremiumBusSlotSelectionComponent.H0(premiumBusSlotSelectionComponent2, iMax, i, this);
                if (objH0 != coroutineSingletons) {
                    int i12 = i2;
                    i5 = i3;
                    list4 = list2;
                    str2 = str;
                    j2 = j;
                    i6 = i12;
                    pBAvailableSlotsTripAppModel2 = pBAvailableSlotsTripAppModel;
                    str3 = (String) objH0;
                    List list9 = list4;
                    PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent3 = this.this$0;
                    this.L$0 = pBAvailableSlotsTripAppModel2;
                    this.L$1 = str2;
                    this.L$2 = str3;
                    this.label = 4;
                    objG0 = PremiumBusSlotSelectionComponent.G0(premiumBusSlotSelectionComponent3, list9, i5, i6, j2, this);
                    if (objG0 != coroutineSingletons) {
                        str4 = str2;
                        str5 = str3;
                        pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel2;
                    }
                }
                return coroutineSingletons;
            }
            if (i7 == 3) {
                int i13 = this.I$1;
                int i14 = this.I$0;
                long j4 = this.J$0;
                String str6 = (String) this.L$2;
                List list10 = (List) this.L$1;
                pBAvailableSlotsTripAppModel2 = (PBAvailableSlotsTripAppModel) this.L$0;
                ResultKt.b(obj);
                i5 = i13;
                list4 = list10;
                str2 = str6;
                j2 = j4;
                i6 = i14;
                objH0 = obj;
                str3 = (String) objH0;
                List list11 = list4;
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent4 = this.this$0;
                this.L$0 = pBAvailableSlotsTripAppModel2;
                this.L$1 = str2;
                this.L$2 = str3;
                this.label = 4;
                objG0 = PremiumBusSlotSelectionComponent.G0(premiumBusSlotSelectionComponent4, list11, i5, i6, j2, this);
                if (objG0 != coroutineSingletons) {
                    str4 = str2;
                    str5 = str3;
                    pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel2;
                }
                return coroutineSingletons;
            }
            if (i7 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str7 = (String) this.L$2;
            String str8 = (String) this.L$1;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel6 = (PBAvailableSlotsTripAppModel) this.L$0;
            ResultKt.b(obj);
            str5 = str7;
            str4 = str8;
            pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel6;
            objG0 = obj;
        }
        PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent5 = this.this$0;
        premiumBusSlotSelectionComponent5.E0(new iv0(premiumBusSlotSelectionComponent5, pBAvailableSlotsTripAppModel3, str4, str5, (MultiSelectionCalendarDataState) objG0, 1));
        return unit;
        Long l = (Long) objB;
        long jLongValue = l != null ? l.longValue() : this.this$0.B.j();
        int i15 = selectedPassInfo2.e;
        int i16 = selectedPassInfo2.d;
        int i17 = selectedPassInfo2.f;
        this.this$0.q.s(jLongValue, selectedPassInfo2.c);
        this.L$0 = pBAvailableSlotsTripAppModel;
        this.L$1 = list;
        this.L$2 = null;
        this.J$0 = jLongValue;
        this.I$0 = i15;
        this.I$1 = i16;
        this.I$2 = i17;
        this.label = 2;
        objB2 = this.this$0.p.b(StringEnum.PICKUP, new Object[0], this);
        if (objB2 != coroutineSingletons) {
            list2 = list;
            long j5 = jLongValue;
            i = i15;
            i2 = i16;
            i3 = i17;
            j = j5;
            str = (String) objB2;
            list3 = list2;
            if (list3 instanceof Collection) {
                it = list3.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    if (!((DateDataState) it.next()).b) {
                        CollectionsKt.y0();
                        throw null;
                    }
                }
                i4 = i18;
            } else {
                it = list3.iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    if (!((DateDataState) it.next()).b) {
                        CollectionsKt.y0();
                        throw null;
                    }
                }
                i4 = i19;
            }
            int iMax2 = Math.max(0, i2 - i4);
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent6 = this.this$0;
            this.L$0 = pBAvailableSlotsTripAppModel;
            this.L$1 = list2;
            this.L$2 = str;
            this.J$0 = j;
            this.I$0 = i2;
            this.I$1 = i3;
            this.label = 3;
            objH0 = PremiumBusSlotSelectionComponent.H0(premiumBusSlotSelectionComponent6, iMax2, i, this);
            if (objH0 != coroutineSingletons) {
                int i110 = i2;
                i5 = i3;
                list4 = list2;
                str2 = str;
                j2 = j;
                i6 = i110;
                pBAvailableSlotsTripAppModel2 = pBAvailableSlotsTripAppModel;
                str3 = (String) objH0;
                List list12 = list4;
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent7 = this.this$0;
                this.L$0 = pBAvailableSlotsTripAppModel2;
                this.L$1 = str2;
                this.L$2 = str3;
                this.label = 4;
                objG0 = PremiumBusSlotSelectionComponent.G0(premiumBusSlotSelectionComponent7, list12, i5, i6, j2, this);
                if (objG0 != coroutineSingletons) {
                    str4 = str2;
                    str5 = str3;
                    pBAvailableSlotsTripAppModel3 = pBAvailableSlotsTripAppModel2;
                    PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent8 = this.this$0;
                    premiumBusSlotSelectionComponent8.E0(new iv0(premiumBusSlotSelectionComponent8, pBAvailableSlotsTripAppModel3, str4, str5, (MultiSelectionCalendarDataState) objG0, 1));
                    return unit;
                }
            }
        }
        return coroutineSingletons;
    }
}
