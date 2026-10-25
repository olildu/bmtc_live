package app.chalo.productbooking.pickstop;

import app.chalo.instantticket.domain.FilterAndSortMatchingStopsUseCase;
import app.chalo.instantticket.domain.PickerEmptyStatesReason;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.ir0;
import defpackage.tr;
import defpackage.vb;
import defpackage.yg;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productbooking.pickstop.PickStopComponent$handleSearchAndLoadStopListIntent$2", f = "PickStopComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PickStopComponent$handleSearchAndLoadStopListIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PickStopIntent.SearchAndLoadStopListIntent $intent;
    int label;
    final /* synthetic */ PickStopComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8299a;

        static {
            int[] iArr = new int[PickerEmptyStatesReason.values().length];
            try {
                iArr[PickerEmptyStatesReason.NO_MATCH_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8299a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickStopComponent$handleSearchAndLoadStopListIntent$2(PickStopComponent pickStopComponent, PickStopIntent.SearchAndLoadStopListIntent searchAndLoadStopListIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pickStopComponent;
        this.$intent = searchAndLoadStopListIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickStopComponent$handleSearchAndLoadStopListIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PickStopComponent$handleSearchAndLoadStopListIntent$2 pickStopComponent$handleSearchAndLoadStopListIntent$2 = (PickStopComponent$handleSearchAndLoadStopListIntent$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        pickStopComponent$handleSearchAndLoadStopListIntent$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PickStopComponent pickStopComponent = this.this$0;
        FilterAndSortMatchingStopsUseCase filterAndSortMatchingStopsUseCase = pickStopComponent.l;
        String input = this.$intent.f8304a;
        List<ProductBookingStopDetails> inputList = pickStopComponent.q;
        filterAndSortMatchingStopsUseCase.getClass();
        Intrinsics.i(input, "input");
        Intrinsics.i(inputList, "inputList");
        String lowerCase = input.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ProductBookingStopDetails productBookingStopDetails : inputList) {
            String lowerCase2 = productBookingStopDetails.b.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase2, "toLowerCase(...)");
            if (StringsKt.a0(lowerCase2, lowerCase, false)) {
                arrayList.add(productBookingStopDetails);
            } else if (StringsKt.m(lowerCase2, lowerCase, false)) {
                arrayList2.add(productBookingStopDetails);
            }
        }
        CollectionsKt.t0(arrayList, new vb(new tr(18), 4));
        CollectionsKt.t0(arrayList2, new vb(new tr(19), 5));
        arrayList.addAll(arrayList2);
        ChaloUseCaseResult failure = arrayList.isEmpty() ? new ChaloUseCaseResult.Failure(PickerEmptyStatesReason.NO_MATCH_FOUND) : new ChaloUseCaseResult.Success(arrayList);
        if (failure instanceof ChaloUseCaseResult.Failure) {
            if (WhenMappings.f8299a[((PickerEmptyStatesReason) ((ChaloUseCaseResult.Failure) failure).f10418a).ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new ir0(22));
        } else {
            if (!(failure instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new yg((ChaloUseCaseResult.Success) failure, 16));
        }
        return Unit.f17538a;
    }
}
