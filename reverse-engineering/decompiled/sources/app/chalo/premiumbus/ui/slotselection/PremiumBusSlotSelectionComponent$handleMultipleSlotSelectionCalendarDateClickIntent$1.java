package app.chalo.premiumbus.ui.slotselection;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.uistate.dialog.DateAvailabilityStatus;
import app.chalo.uistate.dialog.DateDataState;
import app.chalo.uistate.dialog.MultiSelectDatePickerConfig;
import app.chalo.uistate.dialog.MultiSelectDatePickerUIStateKt;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import defpackage.et0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarDateClickIntent$1", f = "PremiumBusSlotSelectionComponent.kt", l = {3219, 3228, 3254}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarDateClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarDateClickIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarDateClickIntent$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarDateClickIntent multipleSlotSelectionCalendarDateClickIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$intent = multipleSlotSelectionCalendarDateClickIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarDateClickIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$handleMultipleSlotSelectionCalendarDateClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MultipleSlotSelectionCalendarState multipleSlotSelectionCalendarState;
        MultiSelectionCalendarDataState multiSelectionCalendarDataState;
        Object next;
        Object objQ0;
        PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType;
        LocalDateTime localDateTime;
        Object next2;
        MultiSelectionCalendarDataState state;
        Object objH0;
        PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType2;
        MultiSelectionCalendarDataState multiSelectionCalendarDataState2;
        boolean z;
        Object objB;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        String str = null;
        if (i == 0) {
            ResultKt.b(obj);
            PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType3 = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).f;
            if (!(pBSlotSelectionScreenBottomSheetType3 instanceof PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) && !(pBSlotSelectionScreenBottomSheetType3 instanceof PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet) && !(pBSlotSelectionScreenBottomSheetType3 instanceof PBSlotSelectionScreenBottomSheetType.ViewAllSlots) && pBSlotSelectionScreenBottomSheetType3 != null) {
                if (!(pBSlotSelectionScreenBottomSheetType3 instanceof PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar)) {
                    throw new NoWhenBranchMatchedException();
                }
                multipleSlotSelectionCalendarState = ((PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar) pBSlotSelectionScreenBottomSheetType3).f7824a;
                if (multipleSlotSelectionCalendarState instanceof MultipleSlotSelectionCalendarState.DataState) {
                    multiSelectionCalendarDataState = ((MultipleSlotSelectionCalendarState.DataState) multipleSlotSelectionCalendarState).c;
                    LocalDateTime localDateTime2 = this.$intent.f7875a;
                    Iterator it = multiSelectionCalendarDataState.f10011a.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.d(((DateDataState) next).f9976a, localDateTime2));
                    DateDataState dateDataState = (DateDataState) next;
                    DateAvailabilityStatus dateAvailabilityStatus = dateDataState != null ? dateDataState.c : null;
                    PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.this$0;
                    PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarDateClickIntent multipleSlotSelectionCalendarDateClickIntent = this.$intent;
                    this.L$0 = pBSlotSelectionScreenBottomSheetType3;
                    this.L$1 = multipleSlotSelectionCalendarState;
                    this.L$2 = multiSelectionCalendarDataState;
                    this.L$3 = localDateTime2;
                    this.label = 1;
                    objQ0 = PremiumBusSlotSelectionComponent.Q0(premiumBusSlotSelectionComponent, multipleSlotSelectionCalendarDateClickIntent, dateAvailabilityStatus, this);
                    if (objQ0 != coroutineSingletons) {
                        pBSlotSelectionScreenBottomSheetType = pBSlotSelectionScreenBottomSheetType3;
                        localDateTime = localDateTime2;
                    }
                    return coroutineSingletons;
                }
                if (!(multipleSlotSelectionCalendarState instanceof MultipleSlotSelectionCalendarState.ErrorState) && !(multipleSlotSelectionCalendarState instanceof MultipleSlotSelectionCalendarState.LoadingState)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return unit;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                return unit;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            multiSelectionCalendarDataState2 = (MultiSelectionCalendarDataState) this.L$2;
            MultipleSlotSelectionCalendarState multipleSlotSelectionCalendarState2 = (MultipleSlotSelectionCalendarState) this.L$1;
            pBSlotSelectionScreenBottomSheetType2 = (PBSlotSelectionScreenBottomSheetType) this.L$0;
            ResultKt.b(obj);
            multipleSlotSelectionCalendarState = multipleSlotSelectionCalendarState2;
            objH0 = obj;
            str = (String) objH0;
            state = multiSelectionCalendarDataState2;
            pBSlotSelectionScreenBottomSheetType = pBSlotSelectionScreenBottomSheetType2;
            String userSelectionSlotTimeInString = ((MultipleSlotSelectionCalendarState.DataState) multipleSlotSelectionCalendarState).f7798a;
            Intrinsics.i(userSelectionSlotTimeInString, "userSelectionSlotTimeInString");
            Intrinsics.i(state, "state");
            MultipleSlotSelectionCalendarState.DataState dataState = new MultipleSlotSelectionCalendarState.DataState(userSelectionSlotTimeInString, str, state);
            ((PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar) pBSlotSelectionScreenBottomSheetType).getClass();
            this.this$0.E0(new et0(new PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar(dataState), 23));
            return unit;
        }
        localDateTime = (LocalDateTime) this.L$3;
        MultiSelectionCalendarDataState multiSelectionCalendarDataState3 = (MultiSelectionCalendarDataState) this.L$2;
        MultipleSlotSelectionCalendarState multipleSlotSelectionCalendarState3 = (MultipleSlotSelectionCalendarState) this.L$1;
        pBSlotSelectionScreenBottomSheetType = (PBSlotSelectionScreenBottomSheetType) this.L$0;
        ResultKt.b(obj);
        multiSelectionCalendarDataState = multiSelectionCalendarDataState3;
        multipleSlotSelectionCalendarState = multipleSlotSelectionCalendarState3;
        objQ0 = obj;
        if (!((Boolean) objQ0).booleanValue()) {
            List list = multiSelectionCalendarDataState.f10011a;
            MultiSelectDatePickerConfig multiSelectDatePickerConfig = multiSelectionCalendarDataState.b;
            int i2 = multiSelectDatePickerConfig.b;
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.d(((DateDataState) next2).f9976a, localDateTime));
            DateDataState dateDataState2 = (DateDataState) next2;
            boolean z2 = false;
            boolean z3 = dateDataState2 != null && dateDataState2.b;
            boolean z4 = MultiSelectDatePickerUIStateKt.a(multiSelectionCalendarDataState) >= i2;
            if (!z4 || z3) {
                List<DateDataState> list2 = multiSelectionCalendarDataState.f10011a;
                boolean z5 = z3;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                for (DateDataState dateDataStateA : list2) {
                    if (Intrinsics.d(dateDataStateA.f9976a, localDateTime)) {
                        if (z5) {
                            dateDataStateA = DateDataState.a(dateDataStateA, z2, null, 13);
                        } else if (!z4) {
                            z = true;
                            dateDataStateA = DateDataState.a(dateDataStateA, true, null, 13);
                        }
                        z = true;
                    } else {
                        z = true;
                    }
                    arrayList.add(dateDataStateA);
                    z2 = false;
                }
                LocalDateTime localDateTime3 = multiSelectionCalendarDataState.c;
                LocalDateTime localDateTime4 = multiSelectionCalendarDataState.d;
                List legendItems = multiSelectionCalendarDataState.e;
                Intrinsics.i(legendItems, "legendItems");
                state = new MultiSelectionCalendarDataState(arrayList, multiSelectDatePickerConfig, localDateTime3, localDateTime4, legendItems);
                SelectedPassInfo selectedPassInfo = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).A;
                if (selectedPassInfo != null) {
                    PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent2 = this.this$0;
                    int iA = MultiSelectDatePickerUIStateKt.a(state);
                    int i3 = selectedPassInfo.e;
                    int iMax = Math.max(0, selectedPassInfo.d - iA);
                    this.L$0 = pBSlotSelectionScreenBottomSheetType;
                    this.L$1 = multipleSlotSelectionCalendarState;
                    this.L$2 = state;
                    this.L$3 = null;
                    this.label = 3;
                    objH0 = PremiumBusSlotSelectionComponent.H0(premiumBusSlotSelectionComponent2, iMax, i3, this);
                    if (objH0 != coroutineSingletons) {
                        pBSlotSelectionScreenBottomSheetType2 = pBSlotSelectionScreenBottomSheetType;
                        multiSelectionCalendarDataState2 = state;
                        str = (String) objH0;
                        state = multiSelectionCalendarDataState2;
                        pBSlotSelectionScreenBottomSheetType = pBSlotSelectionScreenBottomSheetType2;
                    }
                }
                String userSelectionSlotTimeInString2 = ((MultipleSlotSelectionCalendarState.DataState) multipleSlotSelectionCalendarState).f7798a;
                Intrinsics.i(userSelectionSlotTimeInString2, "userSelectionSlotTimeInString");
                Intrinsics.i(state, "state");
                MultipleSlotSelectionCalendarState.DataState dataState2 = new MultipleSlotSelectionCalendarState.DataState(userSelectionSlotTimeInString2, str, state);
                ((PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar) pBSlotSelectionScreenBottomSheetType).getClass();
                this.this$0.E0(new et0(new PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar(dataState2), 23));
                return unit;
            }
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent3 = this.this$0;
            KotlinToastManager kotlinToastManager2 = premiumBusSlotSelectionComponent3.D;
            StringProvider stringProvider = premiumBusSlotSelectionComponent3.p;
            StringEnum stringEnum = StringEnum.YOU_ONLY_HAVE_X_RIDE_REMAINING_IN_YOUR_PASS;
            Object[] objArr = {new Integer(i2)};
            this.L$0 = kotlinToastManager2;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            objB = stringProvider.b(stringEnum, objArr, this);
            if (objB != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                return unit;
            }
            return coroutineSingletons;
        }
        return unit;
    }
}
