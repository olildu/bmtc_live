package app.chalo.premiumbus.ui.stopdetails.compose;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMainScreenStopSectionType;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetails;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsIntent;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsViewState;
import defpackage.ge0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1", f = "PBStopDetailsMainScreen.kt", l = {269}, m = "invokeSuspend", v = 1)
final class PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ Function1<PremiumBusStopDetailsIntent, Unit> $sendIntent;
    final /* synthetic */ PremiumBusStopDetailsViewState $state;
    final /* synthetic */ List<PBStopDetailsMainScreenStopSectionType> $stopSectionTabList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1(PagerState pagerState, List list, PremiumBusStopDetailsViewState premiumBusStopDetailsViewState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$stopSectionTabList = list;
        this.$state = premiumBusStopDetailsViewState;
        this.$sendIntent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1(this.$pagerState, this.$stopSectionTabList, this.$state, this.$sendIntent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowM = FlowKt.m(SnapshotStateKt.snapshotFlow(new ge0(this.$pagerState, 2)));
            final List<PBStopDetailsMainScreenStopSectionType> list = this.$stopSectionTabList;
            final PremiumBusStopDetailsViewState premiumBusStopDetailsViewState = this.$state;
            final Function1<PremiumBusStopDetailsIntent, Unit> function1 = this.$sendIntent;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1.2

                /* JADX INFO: renamed from: app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1$2$WhenMappings */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final /* synthetic */ class WhenMappings {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f7952a;

                    static {
                        int[] iArr = new int[PBStopDetailsMainScreenStopSectionType.values().length];
                        try {
                            iArr[PBStopDetailsMainScreenStopSectionType.PICK_UP.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[PBStopDetailsMainScreenStopSectionType.DROP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f7952a = iArr;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PremiumBusStopDetails premiumBusStopDetails;
                    int i2 = WhenMappings.f7952a[((PBStopDetailsMainScreenStopSectionType) list.get(((Number) obj2).intValue())).ordinal()];
                    PremiumBusStopDetailsViewState premiumBusStopDetailsViewState2 = premiumBusStopDetailsViewState;
                    if (i2 == 1) {
                        premiumBusStopDetails = premiumBusStopDetailsViewState2.c;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        premiumBusStopDetails = premiumBusStopDetailsViewState2.d;
                    }
                    if (premiumBusStopDetails != null) {
                        function1.invoke(new PremiumBusStopDetailsIntent.OnStopTabSelected(premiumBusStopDetails.f7942a));
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowM.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
