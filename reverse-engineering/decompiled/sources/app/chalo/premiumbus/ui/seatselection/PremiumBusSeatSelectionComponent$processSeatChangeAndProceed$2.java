package app.chalo.premiumbus.ui.seatselection;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.domain.ProcessSeatChangeException;
import app.chalo.premiumbus.domain.ProcessSeatChangeRequestUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vu0;
import java.util.ArrayList;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$processSeatChangeAndProceed$2", f = "PremiumBusSeatSelectionComponent.kt", l = {922, 943}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$processSeatChangeAndProceed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ List<SeatInfoAppModel> $selectedSeats;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7721a;

        static {
            int[] iArr = new int[ProcessSeatChangeException.values().length];
            try {
                iArr[ProcessSeatChangeException.SEAT_ASSIGNMENT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProcessSeatChangeException.INVALID_CITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProcessSeatChangeException.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProcessSeatChangeException.LOCAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProcessSeatChangeException.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProcessSeatChangeException.PARSE_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7721a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$processSeatChangeAndProceed$2(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSeatSelectionComponent;
        this.$bookingId = str;
        this.$selectedSeats = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$processSeatChangeAndProceed$2(this.this$0, this.$bookingId, this.$selectedSeats, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionComponent$processSeatChangeAndProceed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objB;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProcessSeatChangeRequestUseCase processSeatChangeRequestUseCase = this.this$0.p;
            String str = this.$bookingId;
            List<SeatInfoAppModel> list = this.$selectedSeats;
            this.label = 1;
            objA = processSeatChangeRequestUseCase.a(str, list, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objA = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
            String str2 = this.$bookingId;
            List<SeatInfoAppModel> list2 = this.$selectedSeats;
            ProcessSeatChangeException processSeatChangeException = (ProcessSeatChangeException) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            AnalyticsContract analyticsContract = premiumBusSeatSelectionComponent.q;
            Source source = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
            Pair pair = new Pair("bookingId", str2);
            List<SeatInfoAppModel> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((SeatInfoAppModel) it.next()).f7122a));
            }
            AnalyticsContractImplKt.b(analyticsContract, "premium bus seat selection seat change request failure", source, MapsKt.i(pair, new Pair("selectedSeatIds", CollectionsKt.O(arrayList, ", ", null, null, null, 62)), new Pair("errorCode", Integer.valueOf(processSeatChangeException.getErrorCodes()))), false, 24);
            switch (WhenMappings.f7721a[processSeatChangeException.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.this$0.E0(new vu0(5));
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent2 = this.this$0;
                    KotlinToastManager kotlinToastManager2 = premiumBusSeatSelectionComponent2.r;
                    StringProvider stringProvider = premiumBusSeatSelectionComponent2.n;
                    StringEnum stringEnum = StringEnum.SOMETHING_WENT_WRONG_WITH_ERROR_CODE;
                    Object[] objArr = {new Integer(processSeatChangeException.getErrorCodes())};
                    this.L$0 = kotlinToastManager2;
                    this.label = 2;
                    objB = stringProvider.b(stringEnum, objArr, this);
                    if (objB != coroutineSingletons) {
                        kotlinToastManager = kotlinToastManager2;
                        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                        break;
                    }
                    return coroutineSingletons;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent3 = this.this$0;
        String str3 = this.$bookingId;
        List<SeatInfoAppModel> list4 = this.$selectedSeats;
        AnalyticsContract analyticsContract2 = premiumBusSeatSelectionComponent3.q;
        Source source2 = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
        Pair pair2 = new Pair("bookingId", str3);
        List<SeatInfoAppModel> list5 = list4;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list5, 10));
        Iterator<T> it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((SeatInfoAppModel) it2.next()).f7122a));
        }
        AnalyticsContractImplKt.b(analyticsContract2, "premium bus seat selection seat change request success", source2, MapsKt.i(pair2, new Pair("selectedSeatId", CollectionsKt.O(arrayList2, ", ", null, null, null, 62))), false, 24);
        this.this$0.E0(new vu0(6));
        return Unit.f17538a;
    }
}
