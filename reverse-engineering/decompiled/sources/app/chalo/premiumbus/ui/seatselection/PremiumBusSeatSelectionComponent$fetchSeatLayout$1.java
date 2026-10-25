package app.chalo.premiumbus.ui.seatselection;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatSelectionLayoutResponseAppModel;
import app.chalo.premiumbus.data.models.app.ReservationType;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SeatStatus;
import app.chalo.premiumbus.domain.FetchSeatSelectionLayoutUseCase;
import app.chalo.premiumbus.domain.PremiumBusSeatSelectionLayoutFetchException;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.n3;
import defpackage.pu0;
import defpackage.uu0;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$fetchSeatLayout$1", f = "PremiumBusSeatSelectionComponent.kt", l = {1294, 1324, 1353}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$fetchSeatLayout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fromStopId;
    final /* synthetic */ String $toStopId;
    final /* synthetic */ String $tripId;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7719a;

        static {
            int[] iArr = new int[PremiumBusSeatSelectionLayoutFetchException.values().length];
            try {
                iArr[PremiumBusSeatSelectionLayoutFetchException.INVALID_CITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusSeatSelectionLayoutFetchException.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusSeatSelectionLayoutFetchException.LOCAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumBusSeatSelectionLayoutFetchException.UNKNOWN_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumBusSeatSelectionLayoutFetchException.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PremiumBusSeatSelectionLayoutFetchException.NO_LAYOUT_FOUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7719a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$fetchSeatLayout$1(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSeatSelectionComponent;
        this.$tripId = str;
        this.$fromStopId = str2;
        this.$toStopId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$fetchSeatLayout$1(this.this$0, this.$tripId, this.$fromStopId, this.$toStopId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionComponent$fetchSeatLayout$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0364  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        boolean z;
        boolean z2;
        SeatInfoAppModel seatInfoAppModelA;
        Object objB;
        KotlinToastManager kotlinToastManager;
        Object objB2;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 3;
        char c = 2;
        boolean z3 = true;
        if (i == 0) {
            ResultKt.b(obj);
            FetchSeatSelectionLayoutUseCase fetchSeatSelectionLayoutUseCase = this.this$0.l;
            String str = this.$tripId;
            String str2 = this.$fromStopId;
            String str3 = this.$toStopId;
            this.label = 1;
            objA = fetchSeatSelectionLayoutUseCase.a(str, str2, str3, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objB2, ToastLength.LONG);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        objA = obj;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        char c2 = 4;
        int i3 = 0;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = ((PremiumBusSeatSelectionLayoutResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).e;
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
            String str4 = this.$tripId;
            String str5 = this.$fromStopId;
            String str6 = this.$toStopId;
            AnalyticsContract analyticsContract = premiumBusSeatSelectionComponent.q;
            Source source = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
            Pair pair = new Pair("tripId", str4);
            Pair pair2 = new Pair("from stop id", str5);
            Pair pair3 = new Pair("to stop id", str6);
            Pair pair4 = new Pair("totalSeats", String.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                char c3 = c;
                Object obj2 = arrayList.get(i4);
                i4++;
                char c4 = c2;
                boolean z4 = z3;
                if (((SeatInfoAppModel) obj2).d == SeatStatus.AVAILABLE) {
                    arrayList2.add(obj2);
                }
                c2 = c4;
                c = c3;
                z3 = z4;
            }
            char c5 = c;
            boolean z5 = z3;
            char c6 = c2;
            Pair pair5 = new Pair("availableSeats", String.valueOf(arrayList2.size()));
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj3 = arrayList.get(i5);
                i5++;
                int i6 = i2;
                if (((SeatInfoAppModel) obj3).d == SeatStatus.UNAVAILABLE) {
                    arrayList3.add(obj3);
                }
                i2 = i6;
            }
            int i7 = i2;
            Pair pair6 = new Pair("unavailableSeats", String.valueOf(arrayList3.size()));
            ArrayList arrayList4 = new ArrayList();
            int size3 = arrayList.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj4 = arrayList.get(i8);
                i8++;
                int i9 = i3;
                if (((SeatInfoAppModel) obj4).e == ReservationType.WOMEN) {
                    arrayList4.add(obj4);
                }
                i3 = i9;
            }
            int i10 = i3;
            Pair pair7 = new Pair("womenReservedSeatsCount", String.valueOf(arrayList4.size()));
            Pair pair8 = new Pair("allSeatsBooked", String.valueOf(PremiumBusSeatSelectionComponent.M0(arrayList)));
            if (!arrayList.isEmpty()) {
                int size4 = arrayList.size();
                int i11 = i10;
                while (true) {
                    if (i11 >= size4) {
                        z = i10;
                        break;
                    }
                    Object obj5 = arrayList.get(i11);
                    i11++;
                    if (((SeatInfoAppModel) obj5).l) {
                        z = z5 ? 1 : 0;
                        break;
                    }
                }
            } else {
                z = i10;
                break;
            }
            Pair pair9 = new Pair("hasAutoAssignedSeat", String.valueOf(z));
            Pair[] pairArr = new Pair[9];
            pairArr[i10] = pair;
            pairArr[z5 ? 1 : 0] = pair2;
            pairArr[c5] = pair3;
            pairArr[i7] = pair4;
            pairArr[c6] = pair5;
            pairArr[5] = pair6;
            pairArr[6] = pair7;
            pairArr[7] = pair8;
            pairArr[8] = pair9;
            AnalyticsContractImplKt.b(analyticsContract, "pb seat layout fetch success", source, MapsKt.i(pairArr), false, 24);
            if (arrayList.isEmpty()) {
                this.this$0.E0(new pu0(27));
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent2 = this.this$0;
                KotlinToastManager kotlinToastManager3 = premiumBusSeatSelectionComponent2.r;
                this.L$0 = kotlinToastManager3;
                this.label = i7;
                objB = premiumBusSeatSelectionComponent2.n.b(StringEnum.NO_SEATS_AVAILABLE, new Object[i10], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager3;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                }
            } else {
                PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = ((PremiumBusSeatSelectionDataState) this.this$0.f.getValue()).c;
                if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) {
                    List list = ((PremiumBusSeatSelectionFlowType.ChangeSeat) premiumBusSeatSelectionFlowType).e;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList, 10));
                    int size5 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size5) {
                        Object obj6 = arrayList.get(i12);
                        i12++;
                        SeatInfoAppModel seatInfoAppModel = (SeatInfoAppModel) obj6;
                        List list2 = list;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            seatInfoAppModelA = SeatInfoAppModel.a(seatInfoAppModel, null, false, 7935);
                        } else {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((SeatInfoAppModel) it.next()).f7122a != seatInfoAppModel.f7122a) {
                                        z5 = true;
                                    } else if (seatInfoAppModel.d == SeatStatus.UNAVAILABLE) {
                                        seatInfoAppModelA = SeatInfoAppModel.a(seatInfoAppModel, SeatStatus.AVAILABLE, z5, 7927);
                                    }
                                }
                                seatInfoAppModelA = SeatInfoAppModel.a(seatInfoAppModel, null, false, 7935);
                            }
                        }
                        arrayList5.add(seatInfoAppModelA);
                        z5 = true;
                    }
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent3 = this.this$0;
                    premiumBusSeatSelectionComponent3.E0(new n3(arrayList5, list, premiumBusSeatSelectionComponent3, arrayList, 22));
                } else if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule)) {
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent4 = this.this$0;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.v(arrayList, 10));
                    int size6 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size6) {
                        Object obj7 = arrayList.get(i13);
                        i13++;
                        SeatInfoAppModel seatInfoAppModel2 = (SeatInfoAppModel) obj7;
                        List list3 = ((PremiumBusSeatSelectionDataState) premiumBusSeatSelectionComponent4.f.getValue()).f;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((SeatInfoAppModel) it2.next()).f7122a == seatInfoAppModel2.f7122a) {
                                    }
                                } else if (seatInfoAppModel2.i) {
                                    z2 = false;
                                }
                                z2 = true;
                            }
                        } else if (seatInfoAppModel2.i) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        arrayList6.add(seatInfoAppModel2.d == SeatStatus.UNAVAILABLE ? SeatInfoAppModel.a(seatInfoAppModel2, null, false, 7935) : SeatInfoAppModel.a(seatInfoAppModel2, null, z2, 7935));
                    }
                    List listV0 = this.this$0.V0(arrayList6);
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent5 = this.this$0;
                    premiumBusSeatSelectionComponent5.E0(new uu0(listV0, premiumBusSeatSelectionComponent5, 0));
                } else {
                    if (premiumBusSeatSelectionFlowType != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List listV1 = this.this$0.V0(arrayList);
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent6 = this.this$0;
                    premiumBusSeatSelectionComponent6.E0(new uu0(listV1, premiumBusSeatSelectionComponent6, 1));
                }
            }
            return Unit.f17538a;
        }
        PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent7 = this.this$0;
        String str7 = this.$tripId;
        String str8 = this.$fromStopId;
        String str9 = this.$toStopId;
        PremiumBusSeatSelectionLayoutFetchException premiumBusSeatSelectionLayoutFetchException = (PremiumBusSeatSelectionLayoutFetchException) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        AnalyticsContractImplKt.b(premiumBusSeatSelectionComponent7.q, "pb seat layout fetch failure", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("tripId", str7), new Pair("from stop id", str8), new Pair("to stop id", str9), new Pair("errorCode", Integer.valueOf(premiumBusSeatSelectionLayoutFetchException.getErrorCodes()))), false, 24);
        switch (WhenMappings.f7719a[premiumBusSeatSelectionLayoutFetchException.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.this$0.E0(new pu0(26));
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent8 = this.this$0;
                KotlinToastManager kotlinToastManager4 = premiumBusSeatSelectionComponent8.r;
                StringProvider stringProvider = premiumBusSeatSelectionComponent8.n;
                StringEnum stringEnum = StringEnum.SOMETHING_WENT_WRONG_WITH_ERROR_CODE;
                Object[] objArr = {new Integer(premiumBusSeatSelectionLayoutFetchException.getErrorCodes())};
                this.L$0 = kotlinToastManager4;
                this.label = 2;
                objB2 = stringProvider.b(stringEnum, objArr, this);
                if (objB2 != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager4;
                    KotlinToastManagerKt.a(kotlinToastManager2, (String) objB2, ToastLength.LONG);
                    return Unit.f17538a;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return coroutineSingletons;
    }
}
