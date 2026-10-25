package app.chalo.premiumbus.ui.seatselection;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SeatStatus;
import app.chalo.premiumbus.domain.FetchAggregatedSeatSelectionLayoutUseCase;
import app.chalo.premiumbus.domain.PremiumBusSeatSelectionLayoutFetchException;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.pu0;
import defpackage.uu0;
import java.util.ArrayList;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$fetchSeatLayoutForBulkBooking$1", f = "PremiumBusSeatSelectionComponent.kt", l = {1215, 1238, 1260}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$fetchSeatLayoutForBulkBooking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSeatSelectionFlowType.BulkBooking $flowType;
    final /* synthetic */ List<String> $tripIds;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7720a;

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
            f7720a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$fetchSeatLayoutForBulkBooking$1(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSeatSelectionComponent;
        this.$flowType = bulkBooking;
        this.$tripIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$fetchSeatLayoutForBulkBooking$1(this.this$0, this.$flowType, this.$tripIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionComponent$fetchSeatLayoutForBulkBooking$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objB;
        KotlinToastManager kotlinToastManager;
        Object objB2;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        int i2 = 2;
        if (i == 0) {
            ResultKt.b(obj);
            FetchAggregatedSeatSelectionLayoutUseCase fetchAggregatedSeatSelectionLayoutUseCase = this.this$0.m;
            PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = this.$flowType;
            String str = bulkBooking.f;
            String str2 = bulkBooking.g;
            List<String> list = this.$tripIds;
            this.label = 1;
            objA = fetchAggregatedSeatSelectionLayoutUseCase.a(str, str2, list, this);
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
        char c = 4;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List list2 = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
            List<String> list3 = this.$tripIds;
            PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking2 = this.$flowType;
            String str3 = bulkBooking2.f;
            String str4 = bulkBooking2.g;
            AnalyticsContract analyticsContract = premiumBusSeatSelectionComponent.q;
            Source source = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
            Pair pair = new Pair("trip ids", CollectionsKt.O(list3, ",", null, null, null, 62));
            Pair pair2 = new Pair("from stop id", str3);
            Pair pair3 = new Pair("to stop id", str4);
            Pair pair4 = new Pair("totalSeats", String.valueOf(list2.size()));
            List list4 = list2;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list4) {
                boolean z2 = z;
                char c2 = c;
                int i3 = i2;
                if (((SeatInfoAppModel) obj2).d == SeatStatus.AVAILABLE) {
                    arrayList.add(obj2);
                }
                c = c2;
                z = z2;
                i2 = i3;
            }
            boolean z3 = z;
            int i4 = i2;
            char c3 = c;
            Pair pair5 = new Pair("availableSeats", String.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list4) {
                if (((SeatInfoAppModel) obj3).d == SeatStatus.UNAVAILABLE) {
                    arrayList2.add(obj3);
                }
            }
            Pair pair6 = new Pair("unavailableSeats", String.valueOf(arrayList2.size()));
            Pair[] pairArr = new Pair[6];
            pairArr[0] = pair;
            pairArr[z3 ? 1 : 0] = pair2;
            pairArr[i4] = pair3;
            pairArr[3] = pair4;
            pairArr[c3] = pair5;
            pairArr[5] = pair6;
            AnalyticsContractImplKt.b(analyticsContract, "pb aggregated seat layout fetch success", source, MapsKt.i(pairArr), false, 24);
            if (list2.isEmpty()) {
                this.this$0.E0(new pu0(29));
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent2 = this.this$0;
                KotlinToastManager kotlinToastManager3 = premiumBusSeatSelectionComponent2.r;
                this.L$0 = kotlinToastManager3;
                this.label = 3;
                objB = premiumBusSeatSelectionComponent2.n.b(StringEnum.NO_SEATS_AVAILABLE, new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager3;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                }
            } else {
                List listV0 = this.this$0.V0(list2);
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent3 = this.this$0;
                premiumBusSeatSelectionComponent3.E0(new uu0(listV0, premiumBusSeatSelectionComponent3, i4));
            }
            return Unit.f17538a;
        }
        PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent4 = this.this$0;
        PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking3 = this.$flowType;
        String str5 = bulkBooking3.f;
        String str6 = bulkBooking3.g;
        List<String> list5 = this.$tripIds;
        PremiumBusSeatSelectionLayoutFetchException premiumBusSeatSelectionLayoutFetchException = (PremiumBusSeatSelectionLayoutFetchException) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        AnalyticsContractImplKt.b(premiumBusSeatSelectionComponent4.q, "pb aggregated seat layout fetch failure", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("from stop id", str5), new Pair("to stop id", str6), new Pair("trip ids", CollectionsKt.O(list5, ",", null, null, null, 62)), new Pair("errorCode", Integer.valueOf(premiumBusSeatSelectionLayoutFetchException.getErrorCodes()))), false, 24);
        switch (WhenMappings.f7720a[premiumBusSeatSelectionLayoutFetchException.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.this$0.E0(new pu0(28));
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent5 = this.this$0;
                KotlinToastManager kotlinToastManager4 = premiumBusSeatSelectionComponent5.r;
                StringProvider stringProvider = premiumBusSeatSelectionComponent5.n;
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
