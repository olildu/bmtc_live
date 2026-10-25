package app.chalo.premiumbus.ui.seatselection;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.BufferType;
import app.chalo.premiumbus.data.models.app.ReservationType;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SeatStatus;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$handleToggleSeatSelectionIntent$2", f = "PremiumBusSeatSelectionComponent.kt", l = {641, 648, 659}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$handleToggleSeatSelectionIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $selectedSeatId;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$handleToggleSeatSelectionIntent$2(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSeatSelectionComponent;
        this.$selectedSeatId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$handleToggleSeatSelectionIntent$2(this.this$0, this.$selectedSeatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionComponent$handleToggleSeatSelectionIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0262  */
    /* JADX WARN: Code duplicated, block: B:104:0x0266  */
    /* JADX WARN: Code duplicated, block: B:105:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x028b  */
    /* JADX WARN: Code duplicated, block: B:108:0x029e  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:128:0x0300  */
    /* JADX WARN: Code duplicated, block: B:130:0x0303  */
    /* JADX WARN: Code duplicated, block: B:132:0x0309  */
    /* JADX WARN: Code duplicated, block: B:133:0x030f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0318  */
    /* JADX WARN: Code duplicated, block: B:138:0x0320  */
    /* JADX WARN: Code duplicated, block: B:140:0x0336  */
    /* JADX WARN: Code duplicated, block: B:147:0x034b A[PHI: r30
      0x034b: PHI (r30v1 java.lang.Object) = (r30v0 java.lang.Object), (r30v3 java.lang.Object), (r30v3 java.lang.Object), (r30v6 java.lang.Object) binds: [B:159:0x037a, B:151:0x035a, B:238:0x034b, B:135:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0354  */
    /* JADX WARN: Code duplicated, block: B:153:0x035d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0365  */
    /* JADX WARN: Code duplicated, block: B:158:0x0374  */
    /* JADX WARN: Code duplicated, block: B:161:0x037d  */
    /* JADX WARN: Code duplicated, block: B:162:0x037f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0381 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0383  */
    /* JADX WARN: Code duplicated, block: B:165:0x0385  */
    /* JADX WARN: Code duplicated, block: B:169:0x038f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0393  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ac A[LOOP:2: B:122:0x02e3->B:182:0x03ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:190:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:196:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:202:0x0400  */
    /* JADX WARN: Code duplicated, block: B:205:0x041d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0424  */
    /* JADX WARN: Code duplicated, block: B:210:0x042a  */
    /* JADX WARN: Code duplicated, block: B:213:0x0491  */
    /* JADX WARN: Code duplicated, block: B:216:0x0498  */
    /* JADX WARN: Code duplicated, block: B:219:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:229:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0348 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:? A[LOOP:4: B:154:0x0363->B:240:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x022d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0232  */
    /* JADX WARN: Code duplicated, block: B:93:0x0246  */
    /* JADX WARN: Code duplicated, block: B:94:0x024b  */
    /* JADX WARN: Code duplicated, block: B:96:0x024f A[PHI: r10
      0x024f: PHI (r10v18 java.lang.Object) = (r10v6 java.lang.Object), (r10v7 java.lang.Object) binds: [B:95:0x024d, B:232:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0253  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        Unit unit;
        int iIntValue;
        boolean z;
        Integer num;
        int iIntValue2;
        boolean zU0;
        Object obj2;
        SeatToggleDecision.Toggle toggle;
        SeatToggleDecision.ClearSelectionsAndToggle clearSelectionsAndToggle;
        SeatToggleDecision.BlockedWomenSeatsMix blockedWomenSeatsMix;
        boolean z2;
        boolean z3;
        boolean z4;
        List listS;
        Iterator it;
        int i;
        Iterator it2;
        Object obj3;
        Object blockedMaxSeats;
        int size;
        int i2;
        Object obj4;
        int size2;
        int i3;
        int i4;
        int i5;
        ReservationType reservationType;
        KotlinToastManager kotlinToastManager;
        Object objB;
        KotlinToastManager kotlinToastManager2;
        int i6;
        KotlinToastManager kotlinToastManager3;
        Object objB2;
        KotlinToastManager kotlinToastManager4;
        KotlinToastManager kotlinToastManager5;
        Object objB3;
        KotlinToastManager kotlinToastManager6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        Unit unit2 = Unit.f17538a;
        if (i7 != 0) {
            if (i7 == 1) {
                kotlinToastManager6 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB3 = obj;
                unit = unit2;
                KotlinToastManagerKt.a(kotlinToastManager6, (String) objB3, ToastLength.LONG);
                return unit;
            }
            if (i7 == 2) {
                kotlinToastManager4 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                unit = unit2;
                KotlinToastManagerKt.a(kotlinToastManager4, (String) objB2, ToastLength.LONG);
                return unit;
            }
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager2 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            unit = unit2;
            KotlinToastManagerKt.a(kotlinToastManager2, (String) objB, ToastLength.LONG);
            return unit;
        }
        ResultKt.b(obj);
        List list = ((PremiumBusSeatSelectionDataState) this.this$0.f.getValue()).d;
        int i8 = this.$selectedSeatId;
        Iterator it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((SeatInfoAppModel) next).f7122a != i8);
        SeatInfoAppModel seatInfoAppModel = (SeatInfoAppModel) next;
        if (seatInfoAppModel == null) {
            return unit2;
        }
        ReservationType reservationType2 = seatInfoAppModel.e;
        String str = seatInfoAppModel.c;
        int i9 = seatInfoAppModel.f7122a;
        int i10 = 2;
        unit = unit2;
        AnalyticsContractImplKt.b(this.this$0.q, "premium bus seat selection seat icon clicked", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("selectedSeatId", Integer.valueOf(i9)), new Pair("selectedSeatNumbers", str), new Pair("selectedSeatType", seatInfoAppModel.b.name()), new Pair("selectedSeatReservationType", reservationType2.name()), new Pair("selectedSeatStatus", seatInfoAppModel.d.name()), new Pair("selectedSeatX", Integer.valueOf(seatInfoAppModel.f)), new Pair("selectedSeatY", Integer.valueOf(seatInfoAppModel.g)), new Pair("isAutoAssigned", Boolean.valueOf(seatInfoAppModel.l))), false, 24);
        List list2 = ((PremiumBusSeatSelectionDataState) this.this$0.f.getValue()).d;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list2) {
            if (((SeatInfoAppModel) obj5).i) {
                arrayList.add(obj5);
            }
        }
        PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = ((PremiumBusSeatSelectionDataState) this.this$0.f.getValue()).c;
        PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
        StateFlow stateFlow = premiumBusSeatSelectionComponent.f;
        StateFlow stateFlow2 = premiumBusSeatSelectionComponent.f;
        List list3 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).d;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            iIntValue = 0;
        } else {
            Iterator it4 = list3.iterator();
            iIntValue = 0;
            while (it4.hasNext()) {
                SeatInfoAppModel seatInfoAppModel2 = (SeatInfoAppModel) it4.next();
                Iterator it5 = it4;
                int i11 = i9;
                if (seatInfoAppModel2.d == SeatStatus.AVAILABLE) {
                    Integer num2 = ((PremiumBusSeatSelectionDataState) stateFlow2.getValue()).o;
                    if (!premiumBusSeatSelectionComponent.U0(seatInfoAppModel2, num2 != null ? num2.intValue() : 1) && (iIntValue = iIntValue + 1) < 0) {
                        CollectionsKt.y0();
                        throw null;
                    }
                }
                it4 = it5;
                i9 = i11;
            }
        }
        int i12 = i9;
        Integer num3 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).e;
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        boolean z5 = premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase;
        if (z5) {
            Integer num4 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).o;
            if (num4 != null) {
                iIntValue = num4.intValue();
            }
        } else if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule) && premiumBusSeatSelectionFlowType != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (z5) {
            z = iIntValue == 1;
            SeatToggleDecisionHelper seatToggleDecisionHelper = premiumBusSeatSelectionComponent.z;
            num = ((PremiumBusSeatSelectionDataState) stateFlow2.getValue()).o;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 1;
            }
            zU0 = premiumBusSeatSelectionComponent.U0(seatInfoAppModel, iIntValue2);
            seatToggleDecisionHelper.getClass();
            obj2 = SeatToggleDecision.BlockedSeatUnavailable.f7759a;
            toggle = SeatToggleDecision.Toggle.f7762a;
            clearSelectionsAndToggle = SeatToggleDecision.ClearSelectionsAndToggle.f7761a;
            blockedWomenSeatsMix = SeatToggleDecision.BlockedWomenSeatsMix.f7760a;
            if (zU0) {
                blockedMaxSeats = obj2;
                obj3 = blockedMaxSeats;
            } else if (!seatInfoAppModel.i) {
                obj3 = obj2;
                blockedMaxSeats = toggle;
            } else if (z5 || !z || arrayList.isEmpty()) {
                z2 = premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat;
                if (z2) {
                    z3 = z;
                    z4 = z2;
                    listS = CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE);
                } else {
                    z3 = z;
                    z4 = z2;
                    if (z5) {
                        listS = CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE, SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS);
                    } else if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking)) {
                        if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule) && premiumBusSeatSelectionFlowType != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listS = CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE, SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS);
                    }
                }
                it = listS.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i = SeatToggleDecisionHelper.WhenMappings.f7763a[((SeatToggleDecisionHelper.SeatToggleGuard) it.next()).ordinal()];
                        it2 = it;
                        if (i == 1) {
                            obj3 = obj2;
                            if (arrayList.size() < iIntValue) {
                                blockedMaxSeats = null;
                            } else if (z4) {
                                blockedMaxSeats = clearSelectionsAndToggle;
                            } else if (!z5) {
                                if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule) && premiumBusSeatSelectionFlowType != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                blockedMaxSeats = new SeatToggleDecision.BlockedMaxSeats(iIntValue);
                            } else if (z3 || iIntValue != 1) {
                                blockedMaxSeats = new SeatToggleDecision.BlockedMaxSeats(iIntValue);
                            } else {
                                blockedMaxSeats = clearSelectionsAndToggle;
                            }
                        } else if (i == i10) {
                            obj3 = obj2;
                            if (!arrayList.isEmpty()) {
                                size = arrayList.size();
                                i2 = 0;
                                while (true) {
                                    if (i2 < size) {
                                        obj4 = arrayList.get(i2);
                                        i2++;
                                        if (((SeatInfoAppModel) obj4).b()) {
                                            blockedMaxSeats = blockedWomenSeatsMix;
                                        }
                                    }
                                }
                            }
                            blockedMaxSeats = null;
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (seatInfoAppModel.b()) {
                                if (!arrayList.isEmpty()) {
                                    size2 = arrayList.size();
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < size2) {
                                            Object obj6 = arrayList.get(i3);
                                            i4 = i3 + 1;
                                            i5 = size2;
                                            SeatInfoAppModel seatInfoAppModel3 = (SeatInfoAppModel) obj6;
                                            reservationType = seatInfoAppModel3.e;
                                            obj3 = obj2;
                                            if (reservationType != ReservationType.GENERAL || (reservationType == ReservationType.WOMEN && seatInfoAppModel3.k != BufferType.ACTIVE)) {
                                                blockedMaxSeats = blockedWomenSeatsMix;
                                            } else {
                                                i3 = i4;
                                                size2 = i5;
                                                obj2 = obj3;
                                            }
                                        }
                                    }
                                }
                                obj3 = obj2;
                                blockedMaxSeats = null;
                            } else {
                                blockedMaxSeats = null;
                                obj3 = obj2;
                            }
                        }
                        if (blockedMaxSeats == null) {
                            it = it2;
                            obj2 = obj3;
                            i10 = 2;
                        }
                    } else {
                        obj3 = obj2;
                        blockedMaxSeats = toggle;
                    }
                }
            } else {
                obj3 = obj2;
                blockedMaxSeats = clearSelectionsAndToggle;
            }
            if (blockedMaxSeats.equals(toggle)) {
                PremiumBusSeatSelectionComponent.F0(this.this$0, seatInfoAppModel);
                return unit;
            }
            if (blockedMaxSeats.equals(clearSelectionsAndToggle)) {
                this.this$0.N0();
                PremiumBusSeatSelectionComponent.F0(this.this$0, seatInfoAppModel);
                return unit;
            }
            if (blockedMaxSeats instanceof SeatToggleDecision.BlockedMaxSeats) {
                i6 = ((SeatToggleDecision.BlockedMaxSeats) blockedMaxSeats).f7758a;
                if (i6 == 1) {
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent2 = this.this$0;
                    kotlinToastManager5 = premiumBusSeatSelectionComponent2.r;
                    StringProvider stringProvider = premiumBusSeatSelectionComponent2.n;
                    StringEnum stringEnum = StringEnum.YOU_CAN_SELECT_X_SEAT_ONLY;
                    Object[] objArr = {String.valueOf(i6)};
                    this.L$0 = kotlinToastManager5;
                    this.label = 1;
                    objB3 = stringProvider.b(stringEnum, objArr, this);
                    if (objB3 != coroutineSingletons) {
                        kotlinToastManager6 = kotlinToastManager5;
                        KotlinToastManagerKt.a(kotlinToastManager6, (String) objB3, ToastLength.LONG);
                        return unit;
                    }
                } else {
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent3 = this.this$0;
                    kotlinToastManager3 = premiumBusSeatSelectionComponent3.r;
                    StringProvider stringProvider2 = premiumBusSeatSelectionComponent3.n;
                    StringEnum stringEnum2 = StringEnum.YOU_CAN_SELECT_X_SEATS_ONLY;
                    Object[] objArr2 = {String.valueOf(i6)};
                    this.L$0 = kotlinToastManager3;
                    this.label = 2;
                    objB2 = stringProvider2.b(stringEnum2, objArr2, this);
                    if (objB2 != coroutineSingletons) {
                        kotlinToastManager4 = kotlinToastManager3;
                        KotlinToastManagerKt.a(kotlinToastManager4, (String) objB2, ToastLength.LONG);
                        return unit;
                    }
                }
            } else {
                if (blockedMaxSeats.equals(blockedWomenSeatsMix)) {
                    if (blockedMaxSeats.equals(obj3)) {
                        return unit;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent4 = this.this$0;
                AnalyticsContractImplKt.b(premiumBusSeatSelectionComponent4.q, "pb seat women mix blocked", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) premiumBusSeatSelectionComponent4.f.getValue()).c)), new Pair("selectedSeatId", Integer.valueOf(i12)), new Pair("selectedSeatNumbers", str), new Pair("selectedSeatReservationType", reservationType2.name())), false, 24);
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent5 = this.this$0;
                kotlinToastManager = premiumBusSeatSelectionComponent5.r;
                this.L$0 = kotlinToastManager;
                this.label = 3;
                objB = premiumBusSeatSelectionComponent5.n.b(StringEnum.PB_WOMEN_SEATS_CANNOT_BE_GROUPED_WITH_OTHER_SEATS, new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    KotlinToastManagerKt.a(kotlinToastManager2, (String) objB, ToastLength.LONG);
                    return unit;
                }
            }
            return coroutineSingletons;
        }
        if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule) && premiumBusSeatSelectionFlowType != null) {
            throw new NoWhenBranchMatchedException();
        }
        SeatToggleDecisionHelper seatToggleDecisionHelper2 = premiumBusSeatSelectionComponent.z;
        num = ((PremiumBusSeatSelectionDataState) stateFlow2.getValue()).o;
        if (num != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = 1;
        }
        zU0 = premiumBusSeatSelectionComponent.U0(seatInfoAppModel, iIntValue2);
        seatToggleDecisionHelper2.getClass();
        obj2 = SeatToggleDecision.BlockedSeatUnavailable.f7759a;
        toggle = SeatToggleDecision.Toggle.f7762a;
        clearSelectionsAndToggle = SeatToggleDecision.ClearSelectionsAndToggle.f7761a;
        blockedWomenSeatsMix = SeatToggleDecision.BlockedWomenSeatsMix.f7760a;
        if (zU0) {
            blockedMaxSeats = obj2;
            obj3 = blockedMaxSeats;
        } else if (!seatInfoAppModel.i) {
            obj3 = obj2;
            blockedMaxSeats = toggle;
        } else if (z5) {
            z2 = premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat;
            if (z2) {
                z3 = z;
                z4 = z2;
                listS = CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE);
            } else {
                z3 = z;
                z4 = z2;
                if (z5) {
                    listS = CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE, SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS);
                } else {
                    listS = premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass ? CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE) : CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE);
                }
            }
            it = listS.iterator();
            while (true) {
                if (it.hasNext()) {
                    i = SeatToggleDecisionHelper.WhenMappings.f7763a[((SeatToggleDecisionHelper.SeatToggleGuard) it.next()).ordinal()];
                    it2 = it;
                    if (i == 1) {
                        obj3 = obj2;
                        if (arrayList.size() < iIntValue) {
                            blockedMaxSeats = null;
                        } else if (z4) {
                            blockedMaxSeats = clearSelectionsAndToggle;
                        } else if (!z5) {
                            if (z3) {
                            }
                            blockedMaxSeats = new SeatToggleDecision.BlockedMaxSeats(iIntValue);
                        } else {
                            if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
                            }
                            blockedMaxSeats = new SeatToggleDecision.BlockedMaxSeats(iIntValue);
                        }
                    } else if (i == i10) {
                        obj3 = obj2;
                        if (!arrayList.isEmpty()) {
                            size = arrayList.size();
                            i2 = 0;
                            while (true) {
                                if (i2 < size) {
                                    obj4 = arrayList.get(i2);
                                    i2++;
                                    if (((SeatInfoAppModel) obj4).b()) {
                                        blockedMaxSeats = blockedWomenSeatsMix;
                                    }
                                }
                            }
                        }
                        blockedMaxSeats = null;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (seatInfoAppModel.b()) {
                            blockedMaxSeats = null;
                            obj3 = obj2;
                        } else {
                            if (!arrayList.isEmpty()) {
                                size2 = arrayList.size();
                                i3 = 0;
                                while (true) {
                                    if (i3 < size2) {
                                        Object obj7 = arrayList.get(i3);
                                        i4 = i3 + 1;
                                        i5 = size2;
                                        SeatInfoAppModel seatInfoAppModel4 = (SeatInfoAppModel) obj7;
                                        reservationType = seatInfoAppModel4.e;
                                        obj3 = obj2;
                                        if (reservationType != ReservationType.GENERAL) {
                                        }
                                        blockedMaxSeats = blockedWomenSeatsMix;
                                    }
                                    i3 = i4;
                                    size2 = i5;
                                    obj2 = obj3;
                                }
                            }
                            obj3 = obj2;
                            blockedMaxSeats = null;
                        }
                    }
                    if (blockedMaxSeats == null) {
                        it = it2;
                        obj2 = obj3;
                        i10 = 2;
                    }
                } else {
                    obj3 = obj2;
                    blockedMaxSeats = toggle;
                }
            }
        } else {
            z2 = premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat;
            if (z2) {
                z3 = z;
                z4 = z2;
                listS = CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE);
            } else {
                z3 = z;
                z4 = z2;
                if (z5) {
                    listS = CollectionsKt.S(SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED, SeatToggleDecisionHelper.SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE, SeatToggleDecisionHelper.SeatToggleGuard.MAX_SEATS);
                } else if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) {
                }
            }
            it = listS.iterator();
            while (true) {
                if (it.hasNext()) {
                    i = SeatToggleDecisionHelper.WhenMappings.f7763a[((SeatToggleDecisionHelper.SeatToggleGuard) it.next()).ordinal()];
                    it2 = it;
                    if (i == 1) {
                        obj3 = obj2;
                        if (arrayList.size() < iIntValue) {
                            blockedMaxSeats = null;
                        } else if (z4) {
                            blockedMaxSeats = clearSelectionsAndToggle;
                        } else if (!z5) {
                            if (z3) {
                            }
                            blockedMaxSeats = new SeatToggleDecision.BlockedMaxSeats(iIntValue);
                        } else {
                            if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
                            }
                            blockedMaxSeats = new SeatToggleDecision.BlockedMaxSeats(iIntValue);
                        }
                    } else if (i == i10) {
                        obj3 = obj2;
                        if (!arrayList.isEmpty()) {
                            size = arrayList.size();
                            i2 = 0;
                            while (true) {
                                if (i2 < size) {
                                    obj4 = arrayList.get(i2);
                                    i2++;
                                    if (((SeatInfoAppModel) obj4).b()) {
                                        blockedMaxSeats = blockedWomenSeatsMix;
                                    }
                                }
                            }
                        }
                        blockedMaxSeats = null;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (seatInfoAppModel.b()) {
                            blockedMaxSeats = null;
                            obj3 = obj2;
                        } else {
                            if (!arrayList.isEmpty()) {
                                size2 = arrayList.size();
                                i3 = 0;
                                while (true) {
                                    if (i3 < size2) {
                                        Object obj8 = arrayList.get(i3);
                                        i4 = i3 + 1;
                                        i5 = size2;
                                        SeatInfoAppModel seatInfoAppModel5 = (SeatInfoAppModel) obj8;
                                        reservationType = seatInfoAppModel5.e;
                                        obj3 = obj2;
                                        if (reservationType != ReservationType.GENERAL) {
                                        }
                                        blockedMaxSeats = blockedWomenSeatsMix;
                                    }
                                    i3 = i4;
                                    size2 = i5;
                                    obj2 = obj3;
                                }
                            }
                            obj3 = obj2;
                            blockedMaxSeats = null;
                        }
                    }
                    if (blockedMaxSeats == null) {
                        it = it2;
                        obj2 = obj3;
                        i10 = 2;
                    }
                } else {
                    obj3 = obj2;
                    blockedMaxSeats = toggle;
                }
            }
        }
        if (blockedMaxSeats.equals(toggle)) {
            PremiumBusSeatSelectionComponent.F0(this.this$0, seatInfoAppModel);
            return unit;
        }
        if (blockedMaxSeats.equals(clearSelectionsAndToggle)) {
            this.this$0.N0();
            PremiumBusSeatSelectionComponent.F0(this.this$0, seatInfoAppModel);
            return unit;
        }
        if (blockedMaxSeats instanceof SeatToggleDecision.BlockedMaxSeats) {
            i6 = ((SeatToggleDecision.BlockedMaxSeats) blockedMaxSeats).f7758a;
            if (i6 == 1) {
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent6 = this.this$0;
                kotlinToastManager5 = premiumBusSeatSelectionComponent6.r;
                StringProvider stringProvider3 = premiumBusSeatSelectionComponent6.n;
                StringEnum stringEnum3 = StringEnum.YOU_CAN_SELECT_X_SEAT_ONLY;
                Object[] objArr3 = {String.valueOf(i6)};
                this.L$0 = kotlinToastManager5;
                this.label = 1;
                objB3 = stringProvider3.b(stringEnum3, objArr3, this);
                if (objB3 != coroutineSingletons) {
                    kotlinToastManager6 = kotlinToastManager5;
                    KotlinToastManagerKt.a(kotlinToastManager6, (String) objB3, ToastLength.LONG);
                    return unit;
                }
            } else {
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent7 = this.this$0;
                kotlinToastManager3 = premiumBusSeatSelectionComponent7.r;
                StringProvider stringProvider4 = premiumBusSeatSelectionComponent7.n;
                StringEnum stringEnum4 = StringEnum.YOU_CAN_SELECT_X_SEATS_ONLY;
                Object[] objArr4 = {String.valueOf(i6)};
                this.L$0 = kotlinToastManager3;
                this.label = 2;
                objB2 = stringProvider4.b(stringEnum4, objArr4, this);
                if (objB2 != coroutineSingletons) {
                    kotlinToastManager4 = kotlinToastManager3;
                    KotlinToastManagerKt.a(kotlinToastManager4, (String) objB2, ToastLength.LONG);
                    return unit;
                }
            }
        } else {
            if (blockedMaxSeats.equals(blockedWomenSeatsMix)) {
                if (blockedMaxSeats.equals(obj3)) {
                    return unit;
                }
                throw new NoWhenBranchMatchedException();
            }
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent8 = this.this$0;
            AnalyticsContractImplKt.b(premiumBusSeatSelectionComponent8.q, "pb seat women mix blocked", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) premiumBusSeatSelectionComponent8.f.getValue()).c)), new Pair("selectedSeatId", Integer.valueOf(i12)), new Pair("selectedSeatNumbers", str), new Pair("selectedSeatReservationType", reservationType2.name())), false, 24);
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent9 = this.this$0;
            kotlinToastManager = premiumBusSeatSelectionComponent9.r;
            this.L$0 = kotlinToastManager;
            this.label = 3;
            objB = premiumBusSeatSelectionComponent9.n.b(StringEnum.PB_WOMEN_SEATS_CANNOT_BE_GROUPED_WITH_OTHER_SEATS, new Object[0], this);
            if (objB != coroutineSingletons) {
                kotlinToastManager2 = kotlinToastManager;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objB, ToastLength.LONG);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
